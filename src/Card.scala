class Card(val number: Int, val suit: Suit.Value) {
  override def toString: String = "%d of %s".format(number, suit)
}
