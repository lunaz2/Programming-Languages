class PerfectNumberImperative

	def is_perfect(number)
		number > 1 && number * 2 == sum_of_factors(number)
	end
	
	def sum_of_factors(number)
		sum = 0
		for i in 1..number
			sum += i if number % i == 0
		end
		sum
	end
end