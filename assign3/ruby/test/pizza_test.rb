require_relative "../src/pizza"
require "test/unit"
 
class TestPizza < Test::Unit::TestCase

	def test_canary
		assert(true)
	end

	def test_create_pizza_with_name
		pizz = create pizza
		assert_equal("Pizza with no layer", pizz.to_s)
	end
	
	def test_create_pizza_with_many_layers
		pizz = create pizza do
			spread sauce
			spread cheese
			toppings meat, onions
			spread cheese
			bake
		end
		assert_equal("Pizza with 5 layers: sauce, cheese, meat, onions, cheese", pizz.to_s)
	end
end
