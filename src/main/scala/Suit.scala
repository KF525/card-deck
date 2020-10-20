package Suit

import SuitColor.SuitColor


enum Suit(color: SuitColor) {
  def suitColor = color
  
  case Diamond extends Suit(SuitColor.Red)
  case Heart extends Suit(SuitColor.Red)
  case Club extends Suit(SuitColor.Black)
  case Spade extends Suit(SuitColor.Black)
}
