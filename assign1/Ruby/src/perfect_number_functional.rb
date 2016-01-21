class PerfectNumberFunctional

	def is_perfect(number)
		number > 1 && number * 2 == (1..number).find_all { |n| number % n == 0}.reduce(:+)
	end
end