require_relative "../src/cut_rod"
require "test/unit"
 
class TestRodCutting < Test::Unit::TestCase

	def setup
		@prices = {1 => 1, 2 => 2, 3 => 3, 4 => 4}
	end
	
	def test_cut_rod_length_0
		expected = {revenue: 0, cuts: [[]]}
		assert_equal(expected, RodCutter.find_optimal_cuts(0, @prices))
	end
	
	def test_cut_rod_length_1
		expected = {revenue: 1, cuts: [[1]]}
		assert_equal(expected, RodCutter.find_optimal_cuts(1, @prices))
	end

	def test_cut_rod_length_2
		expected = {revenue: 2, cuts: [[1, 1], [2]]}
		assert_equal(expected, RodCutter.find_optimal_cuts(2, @prices))
	end
	
	def test_cut_rod_length_3
		expected = {revenue: 3, cuts: [[1, 1, 1], [1, 2], [3]]} 
		assert_equal(expected, RodCutter.find_optimal_cuts(3, @prices))
	end
	
	def test_cut_rod_length_4
		expected = {revenue: 4, cuts: [[1, 1, 1, 1], [1, 1, 2], [1, 3], [2, 2],[4]]} 
		assert_equal(expected, RodCutter.find_optimal_cuts(4, @prices))
	end
	
	def test_cut_rod_for_missing_prices
		prices = {1 => 1, 3 => 3, 4 => 4}
		expected = {revenue: 4, cuts: [[1, 1, 1, 1], [1, 3],[4]]} 
		assert_equal(expected, RodCutter.find_optimal_cuts(4, prices))
	end
	
	def test_cut_rod_with_solution_not_include_length
		prices = {1 => 1, 2 => 2, 3 => 3}
		expected = {revenue: 4, cuts: [[1, 1, 1, 1], [1, 1, 2], [1, 3], [2, 2]]} 
		assert_equal(expected, RodCutter.find_optimal_cuts(4, prices))
	end
end

