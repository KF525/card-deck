import Suit.Suit
import Rank._
import Rank.FaceCard._
import scala.util.Random

object Deck {
  
  type deck = List[Card]
  type hand = List[Card]
  
  def shuffle(d: deck): deck = Random.shuffle(d)
    
  def deal(d: deck, handSize: Int): (deck, hand) = {
    val hand: hand = d.take(handSize)
    val deckRemainder: deck = d diff hand
    (deckRemainder, hand)
  }
  
  def pickACardAnyCard(d: deck): (deck, Card) = {
    val card: Card = d(Random.nextInt(d.size))
    val deckRemainder: deck = d.filter(c => c != card)
    (deckRemainder, card)
  }
  
  def generateCards(suit: Suit) = {
    val ranks: List[rank]  = PipCard.values.toList ::: FaceCard.values.toList
    ranks.map(r => Card(r, suit))
  }
  
  def build: deck = Suit.values.
    foldLeft(List.empty[Card])((d: List[Card],s: Suit) => d ::: generateCards(s))
}
