
class Game {
  def run: Unit = {
    Deck.cards.mkString("\n")
  }
}

object Deck {
  val cards : List[Card] = createDeck
  private def createDeck : List[Card] = {
    var myList : List[Card] = Nil
    for (number <- 2 to 13)
      for (suit <- Suit.values)
        cards ::: List(new Card(number, suit))
    myList
  }
}

/**
  * Statics container
  */
object Game {
  def packs = 6
  def win_message = "Win!"
}

/**
  * Run "scala Main" to start the engine
  */
object Main {
  def main(args: Array[String]) {
    val game = new Game
    game run; System exit 0
  }
}
