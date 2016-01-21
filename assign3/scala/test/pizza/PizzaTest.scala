package pizza.PizzaDSL

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class PizzaTest extends FunSuite {

	test("Create pizza") {
		val pizz = (create a pizza)
		assert("Pizza with no layer" == pizz.toString)
	}
	
	test("Create pizza with layers") {
		val pizz = (create a pizza 
					spread sauce 
					toppings onions)
		assert("Pizza with 2 layers: sauce, onions" == pizz.toString)
	}
	
	test("Create pizza with layers then add more layers") {
		val pizz = (create a pizza 
					spread sauce
					spread cheese
					toppings (onions, meat)
					spread cheese)
		assert("Pizza with 5 layers: sauce, cheese, onions, meat, cheese" == pizz.toString)
	}
}