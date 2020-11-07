package hand

import card.Card
import cards.Cards.cards
import cards.Cards
import deck.Deck

case class Hand(cards: cards)

object Hand {

  def pickACardAnyCard(hand: Hand): Either[String, (Hand, Card)] = {
    Cards.pickACardAnyCard(hand.cards) match {
      case Right((remainingDeck, card)) => Right(Hand(remainingDeck),card)
      case Left(ex) => Left(ex)
    }
  }

  def draw(hand1: Hand, hand2: Hand): Either[String,(Hand, Hand)] =
    Cards.draw(hand1.cards, hand2.cards) match {
      case Right(newHand1, newHand2) => Right((Hand(newHand1), Hand(newHand2)))
      case Left(ex) => Left(ex)
    }
}