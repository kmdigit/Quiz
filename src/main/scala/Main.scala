import org.kmdigit.quiz._

object Main extends App {
  // Quiz1
  val capacities = Array(14,35,86,58,25,62)
  val bottles    = Array(6, 34, 27, 38, 9, 60)
  val fromId     = Array(1,2,4,5,3,3,1,0)
  val toId       = Array(0,1,2,4,2,5,3,1)

  val kiwiJuiceEasy = new q1.KiwiJuiceEasy
  val ret = kiwiJuiceEasy.thePouring(capacities, bottles, fromId, toId)
  println(ret.mkString(","))
}
