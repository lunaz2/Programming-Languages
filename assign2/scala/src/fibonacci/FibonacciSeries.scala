package fibonacci
import scala.annotation.tailrec

class FibonacciSeries {
	
	def fibonnaciRecursive(number : Int) : List[Int] = number match {
		case x if x < 0 => List()
		case 0 => List(1)
		case 1 => List(1, 1)
		case _ => {
			val series = fibonnaciRecursive(number-1)
			series :+ series.takeRight(2).sum
		}
	}
	
	@tailrec
	final def fibonnaciTailRecursive(number : Int, series : List[Int] = List(1)) : List[Int] = number match {
		case x if x < 0 => List()
		case 0 => series
		case _ => fibonnaciTailRecursive(number - 1, series :+ series.takeRight(2).sum)
	}
}
