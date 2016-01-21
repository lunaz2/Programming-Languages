package fibonacci

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class FibonacciSeriesTest extends FunSuite with BeforeAndAfter{

	var fibonacciSeries : FibonacciSeries =_
	
	before {
		fibonacciSeries = new FibonacciSeries
	}
	
	test("Fibonacci with 0") {
		assert(fibonacciSeries.fibonnaciRecursive(0) == List(1))
	}
	
	test("Fibonacci with 1") {
		assert(fibonacciSeries.fibonnaciRecursive(1) == List(1, 1))
	}
	
	test("Fibonacci with negative") {
		assert(fibonacciSeries.fibonnaciRecursive(-2) == List())
	}
	
	test("Fibonacci with 2") {
		assert(fibonacciSeries.fibonnaciRecursive(2) == List(1, 1, 2))
	}
	
	test("Fibonacci with 5") {
		assert(fibonacciSeries.fibonnaciRecursive(5) == List(1, 1, 2, 3, 5, 8))
	}
	
	test("Fibonacci with 10") {
		assert(fibonacciSeries.fibonnaciRecursive(10) == List(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89))
	}
	
	test("Fibonacci Tail Recursive with 0") {
		assert(fibonacciSeries.fibonnaciTailRecursive(0) == List(1))
	}
	
	test("Fibonacci Tail Recursive with 1") {
		assert(fibonacciSeries.fibonnaciTailRecursive(1) == List(1, 1))
	}
	
	test("Fibonacci Tail Recursive with negative") {
		assert(fibonacciSeries.fibonnaciTailRecursive(-2) == List())
	}
	
	test("Fibonacci Tail Recursive with 2") {
		assert(fibonacciSeries.fibonnaciTailRecursive(2) == List(1, 1, 2))
	}
	
	test("Fibonacci Tail Recursive with 5") {
		assert(fibonacciSeries.fibonnaciTailRecursive(5) == List(1, 1, 2, 3, 5, 8))
	}
	
	test("Fibonacci Tail Recursive with 10") {
		assert(fibonacciSeries.fibonnaciTailRecursive(10) == List(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89))
	}
}