require_relative "../src/perfect_number_imperative"
require "test/unit"
 
class TestPerfectNumberImperative < Test::Unit::TestCase

	def test_canary
		assert(true)
	end

	def test_is_perfect_with_0
		assert(!PerfectNumberImperative.new.is_perfect(0))
	end
	
	def test_is_perfect_with_1
		assert(!PerfectNumberImperative.new.is_perfect(1))
	end
	
	def test_is_perfect_with_negative
		assert(!PerfectNumberImperative.new.is_perfect(-2))
	end
	
	def test_is_perfect_with_6
		assert(PerfectNumberImperative.new.is_perfect(6))
	end
	
	def test_is_perfect_with_28
		assert(PerfectNumberImperative.new.is_perfect(28))
	end
	
	def test_is_perfect_with_496
		assert(PerfectNumberImperative.new.is_perfect(496))
	end
end