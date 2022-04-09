/**
 * Filename: TestCode.java
 * 
 * Description: simulates a few hockey games and updates the users on the teams 
 * they are interested in, also contains main function
 * 
 * Author: Gregory Sveinbjornson
 * Modified from code given by Trevor Douglas
 */
import java.util.ArrayList;
public class TestCode {
    public static void main(String[] args) {
        onceExecutedBeforeAll();
        testGetTeamID();
        testGameUpdates();
    }

	public static GameCenter gc;
	public static void onceExecutedBeforeAll() 
	{
		
		gc = new GameCenter();
		gc.addGame(new Game("Toronto Maple Leafs", "Montreal Canadiens"));
		gc.addGame(new Game("Vancouver Canucks", "Ottawa Senators"));
		gc.addGame(new Game("Calgary Flames", "Edmonton Oilers"));
		
		
	}

	


	public static void testGetTeamID() {
		
		System.out.println("Toronto Maple Leafs " + gc.getTeamID("Toronto Maple Leafs"));
        System.out.println("Montreal Canadiens " + gc.getTeamID("Montreal Canadiens"));
        System.out.println("Edmonton Oilers " + gc.getTeamID("Edmonton Oilers"));
        System.out.println("Vancouver Canucks " + gc.getTeamID("Vancouver Canucks"));
        System.out.println("Calgary Flames " + gc.getTeamID("Calgary Flames"));
        System.out.println("Ottawa Senators " + gc.getTeamID("Ottawa Senators"));
		
	}
	
	
	

	public static void testGameUpdates()
	{
		//Stimulate game plan
		ArrayList<Game> todaysGames = gc.getTodaysGames();
		GameUser1 user1 = new GameUser1();
		GameUser2 user2 = new GameUser2();
		gc.addGameObserver(user1);
		gc.addGameObserver(user2);

		//////////////////////////
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
		
		todaysGames.get(0).updateScore(0, 1, 1);
		todaysGames.get(1).updateScore(2, 0, 1);
		todaysGames.get(2).updateScore(3, 1, 1);

		user1.notifyUser(todaysGames.get(0));
		user2.notifyUser(todaysGames.get(2));

		////////////////////////////
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}

		todaysGames.get(0).updateScore(0, 2, 2);
		todaysGames.get(1).updateScore(2, 2, 2);
		todaysGames.get(2).updateScore(5, 1, 2);

		user1.notifyUser(todaysGames.get(0));
		user2.notifyUser(todaysGames.get(2));

		//////////////////////
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}

		todaysGames.get(0).updateScore(1, 3, 3);
		todaysGames.get(1).updateScore(3, 2, 3);
		todaysGames.get(2).updateScore(7, 1, 3);

		user1.notifyUser(todaysGames.get(0));
		user2.notifyUser(todaysGames.get(2));

	}

}


