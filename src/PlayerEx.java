public class PlayerEx {

	public static void main(String[] args) {
		
		// 3 different overloaded constructors
		Player player1 = new Player("Mike", 23);
		
		Player player2 = new Player("Messi");
		player2.jersey = 10;
		
		Player player3 = new Player();
		// Set instance variables
		player3.name = "Chauncey";
		player3.jersey = 3;
		
		// Get instance variables
		System.out.println(player1.name + " wears " + player1.jersey);
		System.out.println(player2.name + " wears " + player2.jersey);
		
		// objects can go in an array, too!
		Player[] team = { player1, player2, player3 };
		for (Player player : team) {
			System.out.println(player.name + " wears " + player.jersey);
		}
				
	}

}