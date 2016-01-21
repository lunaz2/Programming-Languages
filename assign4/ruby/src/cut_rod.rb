class RodCutter

	def self.find_optimal_cuts(length, prices)
		case length
		when 0
			{revenue: 0, cuts: [[]]}
		else
			uncut_solution = {revenue: get_price(length, prices), cuts: [[length]]}
			(1..length-1).reduce(uncut_solution) do |cut, split|
				compare_optimal_cuts(cut, find_optimal_cuts_for_split(split, length, prices))
			end
		end
	end

	def self.compare_optimal_cuts(first_cut, second_cut)
		case first_cut[:revenue] <=> second_cut[:revenue]
		when -1
			second_cut
		when 1
			first_cut
		else
			{
				revenue: first_cut[:revenue], 
				cuts: (second_cut[:cuts] + first_cut[:cuts]).uniq
			}
		end
	end
	
	def self.find_optimal_cuts_for_split(split, length, prices)
		split_cuts = find_optimal_cuts(split, prices)
		other_cuts = find_optimal_cuts(length - split, prices)
		{
		  revenue: split_cuts[:revenue] + other_cuts[:revenue], 
		  cuts: split_cuts[:cuts].flat_map{|cut| other_cuts[:cuts].map {|other_cut| (cut + other_cut).sort}}
		}
	end
	
	def self.get_price(length, prices)
		prices[length] == nil ? 0 : prices[length]
	end
end

