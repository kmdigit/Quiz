package org.kmdigit.quiz.q1

class KiwiJuiceEasy {
  def thePouring(capacities: Array[Int], bottles: Array[Int], fromId: Array[Int], toId: Array[Int]) : Array[Int] = {
    require(capacities.length >= 2 && capacities.length <= 50)
    require(capacities.length == bottles.length)
    require(fromId.length >= 1 && fromId.length <= 50)
    require(fromId.length == toId.length)

    for (i <- 0 to (fromId.length - 1)) {
      val fromBottle = bottles(fromId(i))
      val toBottle   = bottles(toId(i))
      val sumBottle  = fromBottle + toBottle
      if (sumBottle > capacities(toId(i))) {
        bottles(toId(i)) = capacities(toId(i))
        bottles(fromId(i)) = sumBottle - capacities(toId(i))
      } else {
        bottles(toId(i)) = sumBottle
        bottles(fromId(i)) = 0
      }
    }
    bottles
  }
}