package pizza

package object PizzaDSL {
	class Pizza {
		var layer = List[String]()
		
		def spread(component : String*) = {
			layer = layer ++ component
			this
		}
		
		def toppings(component : String*) = {
			layer = layer ++ component
			this
		}
		
		override def toString = {
			s"Pizza with ${if(layer == List()) "no layer" else s"${layer.length} layers: ${layer.mkString(", ")}"}"
		}
	}
	
	class Create {
		def a(pizza: Pizza) = new Pizza()
	}

	val create = new Create()
	val pizza = new Pizza()
	val sauce = "sauce"
	val cheese = "cheese"
	val onions = "onions"
	val meat = "meat"
}
