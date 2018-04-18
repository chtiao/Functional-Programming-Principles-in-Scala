package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c < 0) {
        throw new NoSuchElementException("negative column")
      } else if (c > r) {
        throw new NoSuchElementException("column larger than row")
      } else if (c == 0 || c == r) {
        1
      } else {
        pascal(c - 1, r - 1) + pascal(c, r - 1)
      }
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {

      def balanceCount(chars: List[Char]): Int = {
        if (chars.isEmpty) {
          0
        } else if (chars.head == '(') {
          balanceCount(chars.tail) + 1
        } else if (chars.head == ')') {
          balanceCount(chars.tail) - 1
        } else {
          balanceCount(chars.tail)
        }
      }

      def balanceOrder(chars: List[Char]): Boolean = {
        if (chars.isEmpty) {
          true
        } else {
          (balanceCount(chars) <= 0) && balanceOrder(chars.tail)
        }
      }

      (balanceCount(chars) == 0) && balanceOrder(chars)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }