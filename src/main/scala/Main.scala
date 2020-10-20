import Suit.Suit
import Rank._
import Deck._

object Main {

  def main(args: Array[String]): Unit = {
//    val card = Card(2, Suit.Heart)
//    val card2 = Card(FaceCard.Queen, Suit.Spade)
//    println(card)
//    println(card2)
//    println(card2.suit.suitColor)
    val (deck, hand) = deal(shuffle(build), 5)
    val card = pickACardAnyCard(deck)
    println("-----------------")
    println(deck)
    println("-----------------")
    println(hand)
    println("-----------------")
    println(card)
  }
}
