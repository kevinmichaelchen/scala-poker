/**
  * A person who plays our game.
  */
class Player {

  val MAX_CHAR_NAME: Int = 10
  val MIN_CHAR_NAME: Int = 3
  private var _name: String = _
  private var _id: Int = _
  private var _cash: Int = _

  override def toString = "Player " + _id + ", " + _name + " has " + _cash + " in cash" 

  /** 
    * @constructor create a new player with name and id
    * @param name the player's name
    * @param id the player's ID
    */  
  def this(name: String, id: Int) {
    this()
    _name = name
    _id = id
    printf("%s has ID: %d...\n", name, id)
  }


  def name = _name
  def name_= (name: String): Unit = _name = name
  def id = _id
  def id_= (id: Int): Unit = _id = id
  def cash = _cash
  def cash_= (cash: Int): Unit = _cash = cash

}
