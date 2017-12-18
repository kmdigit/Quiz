package org.kmdigit.quiz.q2

class HappyParty {
  def inviteCount(first: Array[String], second: Array[String]) = {
    require(first.length >= 1 && first.length <= 50)
    require(first.length == second.length)

    val totalInterest = first ++ second

    val counts =
      for {
        i <- totalInterest
        cnt = totalInterest.count(_ == i)
      } yield cnt
    counts.max

    /*
    var maxCount = 1
    for (inter <- totalInterest) {
      val cnt = totalInterest.count(_ == inter)
      if (cnt > maxCount) maxCount = cnt
    }
    maxCount
    */
  }
}
