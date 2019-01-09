import java.util.*; /* ArrayList, Scanner */

/** TheGame class is the main class for the card game. */
public class TheGame{
	public static void main(String[] args){
		
		/** Creating array variables for card suits.
         *		
		 *  C(Clubs), D(Diamonds), H(Hearts), S(Spades) */
		String[] C = {"CA", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "CJ", "CQ", "CK"}; 
		String[] D = {"DA", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "DJ", "DQ", "DK"}; 
		String[] H = {"HA", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "HJ", "HQ", "HK"};
		String[] S = {"SA", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10", "SJ", "SQ", "SK"};
		
		/** Creating ArrayList from an array of objects */
		ArrayList<String> cardList = new ArrayList<String>();
		ArrayList<String> cardList1 = new ArrayList<String>(Arrays.asList(C));
		ArrayList<String> cardList2 = new ArrayList<String>(Arrays.asList(D));
		ArrayList<String> cardList3 = new ArrayList<String>(Arrays.asList(H));
		ArrayList<String> cardList4 = new ArrayList<String>(Arrays.asList(S));
		
		/** Combining all the elements from the arraylist 
		 *  
		 * addAll(); method used */
		cardList2.addAll(cardList1);
		cardList3.addAll(cardList2);
		cardList4.addAll(cardList3); 
		cardList.addAll(cardList4); 
		
		/** Object for class Players */
		Players players = new Players();
		System.out.println("\n");
		
		/*-------------------------------------------------------------------------------------------------*/
		
		/**Display each players' total wins. 
		 * 
		 * toString(); method used to display Strings 
		 * from Players class */
		System.out.println("Win Count: ");
		System.out.println(players.toString());
		System.out.print("\n");
		
		/** Display all the available cards 
		 *  
		 *  Collections.shuffle(); used to 
		 *  shuffle all cards */
		System.out.println("Available cards: ");
		Collections.shuffle(cardList); 
	    System.out.print(cardList);
		System.out.println("\n");
		
		/** Display all the used cards */
		System.out.println("Used cards: ");
		System.out.println("Clubs(C)   : ");
		System.out.println("Diamonds(D): ");
		System.out.println("Hearts(H)  : ");
		System.out.println("Spades(S)  : ");
		System.out.print("\n");
		
		/** Scanner used to register user input */
		Scanner input = new Scanner(System.in);
		System.out.println("Press ENTER to deal cards...");
		System.out.print("----------------------------");
		input.nextLine(); //To take user input.
		System.out.println("\n");
		
		/*-------------------------------------------------------------------------------------------------*/
		
		/** ROUND 1 BEGINS */
		System.out.print("ROUND 1:");
		System.out.println("\n");
		
		/** Deal cards to player from the		
		 *  available cards. 
		 *  
		 *  cardList.get(); returns element from 
		 *  the list*/
		System.out.println("Player 1: " + cardList.get(51) + " | " + cardList.get(47) + " | " + cardList.get(43));
		System.out.println("Player 2: " + cardList.get(50) + " | " + cardList.get(46) + " | " + cardList.get(42));
		System.out.println("Player 3: " + cardList.get(49) + " | " + cardList.get(45) + " | " + cardList.get(41));
		System.out.println("Player 4: " + cardList.get(48) + " | " + cardList.get(44) + " | " + cardList.get(40));
		
		/** Dealed cards are discarded 
		 *
         *  cardList.remove(); removes element from 
		 *  the list*/
		cardList.remove(51); cardList.remove(50); cardList.remove(49); cardList.remove(48);
		cardList.remove(47); cardList.remove(46); cardList.remove(45); cardList.remove(44);
		cardList.remove(43); cardList.remove(42); cardList.remove(41); cardList.remove(40);
		
		System.out.println();
		
		/**Display each players' total wins. 
		 * 
		 * toString(); method used to display Strings 
		 * from Players class */
		System.out.println("Win Count: ");
		System.out.println(players.toString());
		System.out.print("\n");
		
		System.out.println("Available cards: ");
		System.out.print(cardList); //Display updated available cards.
		System.out.println("\n");
		
		/** Display Used Cards */
		System.out.println("Used cards: ");
		
		/** Displays used card for Clubs
		 *
		 *  Removes all card from cardList 
		 *  and displays cards from cardList1. */
		cardList1.removeAll(cardList); 
		System.out.println("Clubs(C)   : " + cardList1); 
		
		/** Displays used card for Diamonds
		 *
		 *  Removes all card from cardList 
		 *  and cardList1. 
		 *  Displays cards from cardList2. */
		cardList2.removeAll(cardList1);
		cardList2.removeAll(cardList);
		System.out.println("Diamonds(D): " + cardList2); 
		
		/** Displays used card for Hearts
		 *
		 *  Removes all card from cardList, 
		 *  cardList1 and cardList2. 
		 *  Displays cards from cardList3. */
		cardList3.removeAll(cardList2);
		cardList3.removeAll(cardList1);
		cardList3.removeAll(cardList);
		System.out.println("Hearts(H)  : " + cardList3);

		/** Displays used card for Spades
		 *
		 *  Removes all card from cardList, 
		 *  cardList1, cardList2 and  
		 *  cardList3.
		 *  Displays cards from cardList3. */
		cardList4.removeAll(cardList3);
		cardList4.removeAll(cardList2);
		cardList4.removeAll(cardList1);
		cardList4.removeAll(cardList);
		System.out.println("Spades(S)  : " + cardList4); 
		System.out.print("\n");
		
        System.out.println("Press ENTER to deal cards...");
		System.out.print("----------------------------");
		input.nextLine(); //To take user input.
		System.out.println("\n");
		
		/*-------------------------------------------------------------------------------------------------*/
		
		/** ROUND 2 BEGINS */
		System.out.print("ROUND 2:");
		System.out.println("\n");
		
		/** Deal cards to player from the		
		 *  available cards. 
		 *  
		 *  cardList.get(); returns element from 
		 *  the list*/
		System.out.println("Player 1: " + cardList.get(39) + " | " + cardList.get(35) + " | " + cardList.get(31));
		System.out.println("Player 2: " + cardList.get(38) + " | " + cardList.get(34) + " | " + cardList.get(30));
		System.out.println("Player 3: " + cardList.get(37) + " | " + cardList.get(33) + " | " + cardList.get(29));
		System.out.println("Player 4: " + cardList.get(36) + " | " + cardList.get(32) + " | " + cardList.get(28));
		
		/** Dealed cards are discarded 
		 *
         *  cardList.remove(); removes element from 
		 *  the list*/
		cardList.remove(39); cardList.remove(38); cardList.remove(37); cardList.remove(36);
		cardList.remove(35); cardList.remove(34); cardList.remove(33); cardList.remove(32);
		cardList.remove(31); cardList.remove(30); cardList.remove(29); cardList.remove(28);
		
		System.out.println();
		
		/**Display each players' total wins. 
		 * 
		 * toString(); method used to display Strings 
		 * from Players class */
		System.out.println("Win Count: ");
		System.out.println(players.toString());
		System.out.print("\n");
		
		System.out.println("Available cards: ");
		System.out.print(cardList); //Display updated available cards.
		System.out.println("\n");
		
		/** Display Used Cards */
		System.out.println("Used cards: ");
		
		
		/** New ArrayList declared for Clubs */
		ArrayList<String> cardListC = new ArrayList<String>(Arrays.asList(C));
		
		/** Display Clubs' used cards. 
		 * 
		 *  Try-Catch is used for Exception Handling. */
		try{
			cardListC.removeAll(cardList);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println();
		}
		System.out.println("Clubs(C)   : " + cardListC); 
		
		
		/** New ArrayList declared for Diamonds */
		ArrayList<String> cardListD = new ArrayList<String>(Arrays.asList(D));
		
		/** Display Diamonds' used cards. 
		 * 
		 *  Try-Catch is used for Exception Handling. */
		try{
			cardListD.removeAll(cardList);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println();
		}
		System.out.println("Diamonds(D): " + cardListD); 
		
		
		/** New ArrayList declared for Hearts */
		ArrayList<String> cardListH = new ArrayList<String>(Arrays.asList(H));
		
		/** Display Hearts' used cards. 
		 * 
		 *  Try-Catch is used for Exception Handling. */
		try{
			cardListH.removeAll(cardList);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println();
		}
		System.out.println("Hearts(H)  : " + cardListH); 
		
		
		/** New ArrayList declared for Spades */
		ArrayList<String> cardListS = new ArrayList<String>(Arrays.asList(S));
		
		/** Display Spades' used cards. 
		 * 
		 *  Try-Catch is used for Exception Handling. */
		try{
			cardListS.removeAll(cardList);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println();
		}
		System.out.println("Spades(S)  : " + cardListS); 
		System.out.print("\n");
		
        System.out.println("Press ENTER to deal cards...");
		System.out.print("----------------------------");
		input.nextLine(); //To take user input.
		System.out.println("\n");
		
		/*-------------------------------------------------------------------------------------------------*/
		
	    /** ROUND 3 BEGINS */
		System.out.print("ROUND 3:");
		System.out.println("\n");
		
		/** Deal cards to player from the		
		 *  available cards. 
		 *  
		 *  cardList.get(); returns element from 
		 *  the list*/
		System.out.println("Player 1: " + cardList.get(27) + " | " + cardList.get(23) + " | " + cardList.get(19));
		System.out.println("Player 2: " + cardList.get(26) + " | " + cardList.get(22) + " | " + cardList.get(18));
		System.out.println("Player 3: " + cardList.get(25) + " | " + cardList.get(21) + " | " + cardList.get(17));
		System.out.println("Player 4: " + cardList.get(24) + " | " + cardList.get(20) + " | " + cardList.get(16));
		
		/** Dealed cards are discarded 
		 *
         *  cardList.remove(); removes element from 
		 *  the list*/
		cardList.remove(27); cardList.remove(26); cardList.remove(25); cardList.remove(24);
		cardList.remove(23); cardList.remove(22); cardList.remove(21); cardList.remove(20);
		cardList.remove(19); cardList.remove(18); cardList.remove(17); cardList.remove(16);
		
		System.out.println();
		
		/**Display each players' total wins. 
		 * 
		 * toString(); method used to display Strings 
		 * from Players class */
		System.out.println("Win Count: ");
		System.out.println(players.toString());
		System.out.print("\n");
		
		System.out.println("Available cards: ");
		System.out.print(cardList); //Display updated available cards.
		System.out.println("\n");
        
		/** Display Used Cards */ 
		System.out.println("Used cards: ");
		
		
		/** New ArrayList declared for Clubs */
        ArrayList<String> cardListCC = new ArrayList<String>(Arrays.asList(C));
		
		/** Display Clubs' used cards. 
		 * 
		 *  Try-Catch is used for Exception Handling. */
		try{
			cardListCC.removeAll(cardList);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println();
		}
		System.out.println("Clubs(C)   : " + cardListCC); 
		
		
		/** New ArrayList declared for Diamonds */
		ArrayList<String> cardListDD = new ArrayList<String>(Arrays.asList(D));
		
		/** Display Diamonds' used cards. 
		 * 
		 *  Try-Catch is used for Exception Handling. */
		try{
			cardListDD.removeAll(cardList);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println();
		}
		System.out.println("Diamonds(D): " + cardListDD); 
		
		
		/** New ArrayList declared for Hearts */
		ArrayList<String> cardListHH = new ArrayList<String>(Arrays.asList(H));
		
		/** Display Hearts' used cards. 
		 * 
		 *  Try-Catch is used for Exception Handling. */
		try{
			cardListHH.removeAll(cardList);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println();
		}
		System.out.println("Hearts(H)  : " + cardListHH); 
		
		
		/** New ArrayList declared for Spades */
		ArrayList<String> cardListSS = new ArrayList<String>(Arrays.asList(S));
		
		/** Display Spades' used cards. 
		 * 
		 *  Try-Catch is used for Exception Handling. */
		try{
			cardListSS.removeAll(cardList);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println();
		}
		System.out.println("Spades(S)  : " + cardListSS); 
		System.out.print("\n");
		
        System.out.println("Press ENTER to deal cards...");
		System.out.print("----------------------------");
		input.nextLine();
		System.out.println("\n");
		
		/*-------------------------------------------------------------------------------------------------*/
				
		/** ROUND 4 BEGINS */
		System.out.print("ROUND 4:");
		System.out.println("\n");
		
		/** Deal cards to player from the		
		 *  available cards. 
		 *  
		 *  cardList.get(); returns element from 
		 *  the list*/
		System.out.println("Player 1: " + cardList.get(15) + " | " + cardList.get(11) + " | " + cardList.get(7));
		System.out.println("Player 2: " + cardList.get(14) + " | " + cardList.get(10) + " | " + cardList.get(6));
		System.out.println("Player 3: " + cardList.get(13) + " | " + cardList.get(9)  + " | " + cardList.get(5));
		System.out.println("Player 4: " + cardList.get(12) + " | " + cardList.get(8)  + " | " + cardList.get(4));
		
        /** Dealed cards are discarded 
		 *
         *  cardList.remove(); removes element from 
		 *  the list*/
		cardList.remove(15); cardList.remove(14); cardList.remove(13); cardList.remove(12);
		cardList.remove(11); cardList.remove(10); cardList.remove(9);  cardList.remove(8);
		cardList.remove(7);  cardList.remove(6);  cardList.remove(5);  cardList.remove(4);
		
		System.out.println();
		
		/**Display each players' total wins. 
		 * 
		 * toString(); method used to display Strings 
		 * from Players class */
		System.out.println("Win Count: ");
		System.out.println(players.toString());
		System.out.print("\n");
		
		System.out.println("Available cards: ");
		System.out.print(cardList); //Display updated available cards.
		System.out.println("\n");
        
		/** Display Used Cards */ 
		System.out.println("Used cards: ");
		
		
		/** New ArrayList declared for Clubs */
        ArrayList<String> cardListCCC = new ArrayList<String>(Arrays.asList(C));
		
		/** Display Clubs' used cards. 
		 * 
		 *  Try-Catch is used for Exception Handling. */
		try{
			cardListCCC.removeAll(cardList);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println();
		}
		System.out.println("Clubs(C)   : " + cardListCCC); 
		
		
		/** New ArrayList declared for Diamonds */
		ArrayList<String> cardListDDD = new ArrayList<String>(Arrays.asList(D));
		
		/** Display Diamonds' used cards. 
		 * 
		 *  Try-Catch is used for Exception Handling. */
		try{
			cardListDDD.removeAll(cardList);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println();
		}
		System.out.println("Diamonds(D): " + cardListDDD); 
		
		
		/** New ArrayList declared for Hearts */
		ArrayList<String> cardListHHH = new ArrayList<String>(Arrays.asList(H));
		
		/** Display Hearts' used cards. 
		 * 
		 *  Try-Catch is used for Exception Handling. */
		try{
			cardListHHH.removeAll(cardList);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println();
		}
		System.out.println("Hearts(H)  : " + cardListHHH); 
		
		
		/** New ArrayList declared for Spades */
		ArrayList<String> cardListSSS = new ArrayList<String>(Arrays.asList(S));
		
		/** Display Spades' used cards. 
		 * 
		 *  Try-Catch is used for Exception Handling. */
		try{
			cardListSSS.removeAll(cardList);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println();
		}
		System.out.println("Spades(S)  : " + cardListSSS); 
		System.out.print("\n");
		
		System.out.println("Press Q to quit the game. Press N to start a new game...");
		input.nextLine();
	}
}