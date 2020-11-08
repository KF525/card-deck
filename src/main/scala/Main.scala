import deck.Deck._
import card._
import cards._
import deck.Deck
import hand.Hand

object Main {

  def main(args: Array[String]): Unit = {
    val startingDeck: Deck = shuffle(build)
    val Right(deck1, hand1) = deal(startingDeck, 5)
    val Right(deck2, hand2) = deal(deck1, 5)
    val Right(deck3, card) = pickACardAnyCard(deck2)
    println(deck3)
    println(hand1)
    println(hand2)
    println(card)
    println(card.suit.color)
  }
  
}