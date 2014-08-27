class Game {
  def run: Unit = {
    val deck: Deck = new Deck
    //Deck.cards.mkString("\n")
  }
}

object Game {
  def packs = 6
  def win_message = "Win!"
}

object Suit extends Enumeration {
  type Suit = Value
  val Spade = Value("spades")
  val Heart = Value("hearts")
  val Diamond = Value("diamonds")
  val Club = Value("clubs")
}
import Suit._

class Deck {
  val cards: List[Card] = createDeck

  private def createDeck: List[Card] = {
    val list: List[Card] = List()
      for (number <- 2 to 13) 
        for (suit <- Suit.values) 
          list ::: List(new Card(number, suit))
    list
  }
}
