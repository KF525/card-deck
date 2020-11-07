package deck

import card.{Card, Suit}
import card.Rank._
import cards.Cards.cards
import _root_.cards.Cards
import hand.Hand

import scala.util.Random

case class Deck(cards: cards)

object Deck {

  def shuffle(deck: Deck): Deck = Deck(Random.shuffle(deck.cards))
  
  def deal(deck: Deck, handSize: Int): Either[String,(Deck, Hand)] = {
    val startingDeck = deck.cards
    (deck, handSize) match {
      case noHand if handSize.equals(0) => Left("Hand size must be greater than zero.")
      case insufficientDeck if deck.cards.size < handSize => Left("Not enough cards in deck")
      case _ => 
        val hand: Hand = Hand(startingDeck.take(handSize))
        val deckRemainder: Deck = Deck(startingDeck diff hand.cards)
        Right(deckRemainder, hand)
    }
  }

  def generateCards(suit: Suit) = {
    val ranks: List[rank] = PipCard.values.toList ++ FaceCard.values.toList
    ranks.map(r => card.Card(r, suit))
  }

  def build: Deck = {
    val cards = Suit.values.foldLeft(List.empty[Card])((d: List[Card], s: Suit) => d ++ generateCards(s))
    Deck(cards)
  }
  
  def pickACardAnyCard(deck: Deck): Either[String, (Deck, Card)] = {
    Cards.pickACardAnyCard(deck.cards) match {
      case Right((remainingDeck, card)) => Right((Deck(remainingDeck),card))
      case Left(ex) => Left(ex)
    }
  }

  def draw(deck: Deck, hand: Hand): Either[String,(Deck, Hand)] =
    Cards.draw(deck.cards, hand.cards) match {
      case Right((remainingDeck, newHand)) => Right((Deck(remainingDeck), Hand(newHand)))
      case Left(ex) => Left(ex)
    }
}
