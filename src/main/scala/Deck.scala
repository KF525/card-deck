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
  
  def pickACardAnyCard(d: deck): Card = d(Random.nextInt(d.size))
  
  def generateCards(suit: Suit) = List[rank](2,3,4,5,6,7,8,9,10,Jack,Queen,King)
    .map(r => generateCard(r: rank, suit))
  
  def generateCard(rank: rank, suit: Suit): Card = Card(rank, suit)
  
  def build: deck = Suit.values.
    foldLeft(List.empty[Card])((d: List[Card],s: Suit) => d ::: generateCards(s))
}
