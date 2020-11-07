import org.junit.Test
import org.junit.Assert.{assertEquals, _}
import card.Rank.PipCard._
import card.Rank.FaceCard._
import card.Card
import card.Suit._
import _root_.deck.Deck
import hand._

import scala.util.Random

class DeckTest {
  @Test def build(): Unit = {
    assertEquals(52, Deck.build.cards.size)
  }

  @Test def deal(): Unit = {
    val deck: Deck = Deck.build
    val Right(remainingDeck, hand) = Deck.deal(deck, 2)
    assertEquals(2, hand.cards.size)
    assertEquals(50, remainingDeck.cards.size)
  }

  @Test def dealHandSizeZero(): Unit = {
    val deck: Deck = Deck(List(Card(Ace, Heart), Card(Two, Heart)))
    val zeroHand = Deck.deal(deck, 0)
    assertTrue(zeroHand.isLeft)
  }

  @Test def dealHandEqualsDeck(): Unit = {
    val deck = Deck(List(Card(Ace, Heart), Card(Two, Heart)))
    val Right(remainingDeck, hand) = Deck.deal(deck, 2)
    assertEquals(2, hand.cards.size)
    assertEquals(0, remainingDeck.cards.size)
  }

  @Test def dealHandLargerThanDeck(): Unit = {
    val deck = Deck(List(Card(Ace, Heart), Card(Two, Heart)))
    val inSufficientDeck = Deck.deal(deck, 3)
    assertTrue(inSufficientDeck.isLeft)
  }
  
  @Test def pickCard(): Unit = {
    val deck = Deck(List(Card(Two, Heart)))
    val Right(remainingDeck, card) = Deck.pickACardAnyCard(deck)
    assertEquals(0, remainingDeck.cards.size)
    assertEquals(Card(Two, Heart), card)
  }
  
  @Test def pickCardWhenDeckEmpty(): Unit = {
    val noCards = Deck.pickACardAnyCard(Deck(List()))
    assertTrue(noCards.isLeft)
  }
}