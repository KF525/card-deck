object Rank {
  type pip = (Ace|2|3|4|5|6|7|8|9|10)
  type rank = pip | FaceCard
  
  //TODO: Figure out how to handle ace Ace
  class Ace
  
  enum FaceCard(value: Int) {
    case Jack extends FaceCard(12)
    case Queen extends FaceCard(13)
    case King extends FaceCard(14)
  }
}
