package card

enum Suit(val color: SuitColor) {
  case Diamond extends Suit(SuitColor.Red)
  case Heart extends Suit(SuitColor.Red)
  case Club extends Suit(SuitColor.Black)
  case Spade extends Suit(SuitColor.Black)
}
