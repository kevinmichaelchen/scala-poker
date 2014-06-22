class Card(val number: Int, val suit: Suit) {

  private var _number: Int = _
  private var _suit: Suit = _


  def number_= (number: Int): Unit = _number = number
  def suit_= (suit: Suit): Unit = _suit = suit

  override def toString: String = "%d of %s".format(_number, _suit)


}
