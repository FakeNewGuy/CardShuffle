import java.util.*;

/** Players class is the class that stores 
 *  each players' score. */
public class Players{
	
	/** Declaring and Initializing score toString
     *  to each players. 
	 *  
	 *  p1(Player 1), p2(Player 2), p3(Player 3), p4(Player 4) */
	int p1 = 0; 
	int p2 = 0;
	int p3 = 0;
	int p4 = 0;
	
	/** Constructer for Players class */
	public Players(){}
	public Players(int p1, int p2, int p3, int p4){
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}
	
	/** setMethod */
	public void setScore(int p1, int p2, int p3, int p4){
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}
	
	/**@Override 
	 *  
	 * toString() used to returns a string 
	 * representation of the object */
	public String toString(){
		return "Player 1: " + p1 + ", " +
               "Player 2: " + p2 + ", " +
               "Player 3: " + p3 + ", " +
               "Player 4: " + p4;			   
	}
}

/** Subclass of Players class*/
class PlayerOne extends Players {
	int p1 = 0; 
	
	public PlayerOne(){}
	public PlayerOne(int p1){
		this.p1 = p1;
	}
	
	public int getScore(){
		return p1 + 1;
	}
}

/** Subclass of Players class*/
class PlayerTwo extends Players {
	int p2 = 0; 
	
	public PlayerTwo(){}
	public PlayerTwo(int p2){
		this.p2 = p2;
	}
	
	public int getScore(){
		return p2 + 1;
	}
}

/** Subclass of Players class*/
class PlayerThree extends Players {
	int p3 = 0; 
	
	public PlayerThree(){}
	public PlayerThree(int p3){
		this.p3 = p3;
	}
	
	public int getScore(){
		return p3 + 1;
	}
}

/** Subclass of Players class*/
class PlayerFour extends Players {
	int p4 = 0; 
	
	public PlayerFour(){}
	public PlayerFour(int p4){
		this.p4 = p4;
	}
	
	public int getScore(){
		return p4 + 1;
	}
}