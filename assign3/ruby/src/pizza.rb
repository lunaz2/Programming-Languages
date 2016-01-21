class Pizza

	attr_accessor :name, :layer
	
	def initialize(name)
		@name = name
		@layer = []
	end
 
	def spread(*component)
		component.map { |comp| @layer << comp}
	end
	
	def toppings(*component)
		component.map { |comp| @layer << comp}
	end
	
	def to_s
		"#{name} with #{@layer.count != 0 ? "#{@layer.count} layers: #{@layer.join(', ')}" : 'no layer'}"
	end
	
	def method_missing(name, *args)
		name.to_sym
	end
end

def pizza
	"Pizza"
end

def create(name, &block)
	pizza = Pizza.new(name)
	pizza.instance_eval(&block) unless block.nil?
	pizza
end