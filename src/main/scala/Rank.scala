object Rank {
  type rank = PipCard | FaceCard
  
  enum PipCard {
    case Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten 
  }
  
  enum FaceCard {
    case Jack, Queen, King
  }
}
