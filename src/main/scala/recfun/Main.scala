package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
    print("Balanced : ")
    println(balance("())(".toList))

print("count change ")
    print(countChange(4,List(1,2)))
  }


  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {

    def factorial(n: Int): Int = {
      if (n <= 1)
        1
      else
        n * factorial(n - 1)
    }
    return factorial(r)/(factorial(c)*factorial(r-c)).toInt
  }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
var count = 0

    def visitList(ch: List[Char]): Unit = {
      if (! ch.isEmpty) {
        ch match {
          case head :: tail => {
            if
            (head == '(' && count >= 0) count = count + 1
            else if
            (head == ')' ) count = count - 1
            visitList(tail)
          }
        }
      }
    }
visitList(chars)
if (count==0)
    true
else
    false
  }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {

    def count( mon : Int,  coin : List[Int], i : Int ) : Int=    {
      if (mon < 0) {
        return 0;
      }
      if (mon == 0) {
        return 1;
      }
      if ( i== coin.length && mon > 0) {
        return 0;
      }
      return count(mon - coin(i),coin, i) + count(mon, coin, i + 1);
    }
    count(money,coins,0)
  }

  }
