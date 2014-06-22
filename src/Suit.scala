
sealed trait Suit
case object Spades extends Suit {
  override def toString: String = "spades"
}
case object Hearts extends Suit {
  override def toString: String = "hearts"
}
case object Diamonds extends Suit {
  override def toString: String = "diamonds"
}
case object Clubs extends Suit {
  override def toString: String = "clubs"
}
