import deck.Deck._
import card._
import cards._
import deck.Deck
import hand.Hand

object Main {

  def main(args: Array[String]): Unit = {
    val startingDeck = shuffle(build)
    val eitherDeckHand: Either[String, (Deck, Hand)] = deal(startingDeck, 5)
//    for {
//      (deck, hand) <- .right
//    //    val (deck1, hand) = deal(deck, 5)
//    //    val (deck2, hand2) = deal(deck1, 5)
//    //    //YUCK
//    //    val (deck3, card) = Cards.pickACardAnyCard(deck2.cards) match {
//    //      case Right(deck3, card) => (deck3, card)
//    // }
//    } yield (deck, hand)
    
//        println("-deck----------------")
//        println(deck)
//        println("-number of cards in deck ---------")
//        println(deck.startingDeck.size)
//        println("-hand1----------------")
//        println(hand)
    //    println("-hand2----------------")
    //    println(hand2)
    //    println("-pick-a-card----------------")
    //    println(card)
    //    println("-card's color---------------")
    //    println(card.suit.color)
    //    println("-number of cards in remaining deck------------")
    //    println(deck3.size)
    //  }
  }
}
