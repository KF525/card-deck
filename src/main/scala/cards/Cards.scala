package cards
import scala.util.Random
import card.Card

object Cards {

  type cards = List[Card]

    def draw(cards1: cards, cards2: cards): Either[String,(cards, cards)] = 
      cards1 match {
        case h::t => Right(t, h :: cards2)
        case _ => Left("No cards to draw from!")
      }

    def pickACardAnyCard(cards: cards): Either[String,(cards, Card)] = 
      cards match {
        case h::t =>
          val card: Card = cards(Random.nextInt(cards.size))
          val remainingCards: cards = cards.filter(c => c != card)
          Right(remainingCards, card)
        case _ => Left("No cards to pick!")
      }
}
