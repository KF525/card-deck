import org.junit.Test
import org.junit.Assert._
import Rank.FaceCard._
import Deck.deck
import Rank.PipCard._
import Suit.Suit._

import scala.util.Random

class DeckTest {
  @Test def build(): Unit = {
    assertEquals(52, Deck.build.size)
  }

  @Test def deal(): Unit = {
    val d: deck = Deck.build
    val (rd, h) = Deck.deal(d, 2)
    assertEquals(2, h.size)
  }
  
  @Test def dealHandSizeZero(): Unit = {
    val d: deck = List(Card(Ace, Heart), Card(Two, Heart))
    val (rd, h) = Deck.deal(d, 0)
    assertEquals(0, h.size)
    assertEquals(List.empty[Card], h)
    assertEquals(2, rd.size)
  }
  
  @Test def dealHandEqualsDeck(): Unit = {
    val d: deck = List(Card(Ace, Heart), Card(Two, Heart))
    val (rd, h) = Deck.deal(d, 2)
    assertEquals(2, h.size)
    assertEquals(0, rd.size)
    assertEquals(List.empty[Card], rd)
  }
  
  @Test def dealHandLargerThanDeck(): Unit = {
    // Currently it just takes as many as are in the deck to create hand and deck is empty
    val d: deck = List(Card(Ace, Heart), Card(Two, Heart))
    val (rd, h) = Deck.deal(d, 3)
    assertEquals(2, h.size)
    assertEquals(0, rd.size)
  }
  
  @Test def pickCard(): Unit = {
    val d: deck = List(Card(Ace, Heart), Card(Two, Heart))
    val (rd, card) = Deck.pickACardAnyCard(d)
    //TODO: Assertions
  }
  
  @Test def pickCardWhenDeckEmpty(): Unit = {
    val (rd, card) = Deck.pickACardAnyCard(Nil)
    //TODO: Assertions
  }
}