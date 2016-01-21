require_relative "../src/perfect_number_functional"
require "test/unit"
 
class TestPerfectNumberFunctional < Test::Unit::TestCase

	def test_canary
		assert(true)
	end

	def test_is_perfect_with_0
		assert(!PerfectNumberFunctional.new.is_perfect(0))
	end
	
	def test_is_perfect_with_1
		assert(!PerfectNumberFunctional.new.is_perfect(1))
	end
	
	def test_is_perfect_with_negative
		assert(!PerfectNumberFunctional.new.is_perfect(-2))
	end
	
	def test_is_perfect_with_6
		assert(PerfectNumberFunctional.new.is_perfect(6))
	end
	
	def test_is_perfect_with_28
		assert(PerfectNumberFunctional.new.is_perfect(28))
	end
	
	def test_is_perfect_with_496
		assert(PerfectNumberFunctional.new.is_perfect(496))
	end
end