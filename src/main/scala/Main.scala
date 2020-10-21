import Suit.Suit
import Rank._
import Deck._

object Main {

  def main(args: Array[String]): Unit = {
    val deck = shuffle(build)
    val (deck1, hand) = deal(deck, 5)
    val (deck2, hand2) = deal(deck1, 5)
    val (deck3, card) = pickACardAnyCard(deck2)
    println("-deck----------------")
    println(deck)
    println("-number of cards in deck ---------")
    println(deck.size)
    println("-hand1----------------")
    println(hand)
    println("-hand2----------------")
    println(hand2)
    println("-pick-a-card----------------")
    println(card)
    println("-number of cards in remaining deck------------")
    println(deck3.size)
  }
}
