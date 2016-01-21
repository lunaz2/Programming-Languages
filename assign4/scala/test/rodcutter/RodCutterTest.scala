package rodcutter

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class FibonacciSeriesTest extends FunSuite with BeforeAndAfter{

	val prices = Map(1 -> 1, 2 -> 2, 3 -> 3, 4 -> 4)
	
	test("Cut rod length 0") {
		val expect = (0, List(List()))
		assert(RodCutter.findOptimalCuts(0, prices) == expect)
	}
	
	test("Cut rod length 1") {
		val expect = (1, List(List(1)))
		assert(RodCutter.findOptimalCuts(1, prices) == expect)
	}
	
	test("Cut rod length 2") {
		val expect = (2, List(List(1, 1), List(2)))
		assert(RodCutter.findOptimalCuts(2, prices) == expect)
	}
	
	test("Cut rod length 3") {
		val expect = (3, List(List(1, 1, 1), List(1, 2), List(3)))
		assert(RodCutter.findOptimalCuts(3, prices) == expect)
	}
	
	test("Cut rod length 4") {
		val expect = (4, List(List(1, 1, 1, 1), List(1, 1, 2), List(1, 3), List(2, 2), List(4)))
		assert(RodCutter.findOptimalCuts(4, prices) == expect)
	}
	
	test("Cut rod with missing length") {
		val missingPrices = Map(1 -> 1, 3 -> 3, 4 -> 4)
		val expect = (4, List(List(1, 1, 1, 1), List(1, 3), List(4)))
		assert(RodCutter.findOptimalCuts(4, missingPrices) == expect)
	}
	
	test("Cut rod with solution not include length") {
		val missingPrices = Map(1 -> 1, 2 -> 2, 3 -> 3)
		val expect = (4, List(List(1, 1, 1, 1), List(1, 1, 2), List(1, 3), List(2, 2)))
		assert(RodCutter.findOptimalCuts(4, missingPrices) == expect)
	}
}