package rodcutter

object RodCutter {
	
	def findOptimalCuts(length : Int, prices : Map[Int, Int]) : (Int, List[List[Int]]) = length match{
		case 0 => (0, List(List()))
		case _ => {
			val uncutSolution = (getPrice(length, prices),List(List(length)))
			(1 to length - 1).foldLeft(uncutSolution) { (cut, split) =>
				compareOptimalCuts(cut, findOptimalCutsForSplit(split, length, prices))
			}
		}
	}
	
	def compareOptimalCuts(firstCuts : (Int, List[List[Int]]), secondCuts : (Int, List[List[Int]])) = firstCuts._1.compareTo(secondCuts._1) match {
		case -1 => secondCuts
		case 1 => firstCuts
		case 0 => (firstCuts._1, (secondCuts._2 ::: firstCuts._2).distinct)
	
	}
	
	def findOptimalCutsForSplit(split : Int, length : Int, prices : Map[Int, Int]) = {
		val splitCuts = findOptimalCuts(split, prices)
		val otherCuts = findOptimalCuts(length - split, prices)
		(
		  splitCuts._1 + otherCuts._1, 
		  splitCuts._2.flatMap{splitCut => otherCuts._2.map{otherCut => (splitCut ::: otherCut).sorted}}
		)
	}
	
	def getPrice(length : Int, prices : Map[Int, Int]) = {
		if(prices.contains(length)) prices(length) else 0
	}
}

