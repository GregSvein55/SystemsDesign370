/**
 * Filename: GameUser1.java
 * 
 * Description: 1 of 2 users, I modified the notifyUser function
 * 
 * Author: Gregory Sveinbjornson
 * Modified from code given by Trevor Douglas
 */
public class GameUser1 implements GameObserver{
	
	private String interestedTeam = new String("Toronto Maple Leafs");
	
	@Override
	public void notifyUser(Game game)
	{
		System.out.println("\nScore update for User1, fan of " + interestedTeam);
		System.out.println("Score update: ");
		System.out.println("Peroid:"+ game.getCurrentPeriod());
		System.out.println(game.getHomeTeam() + ":" + game.getHomeScore());
		System.out.println(game.getVisitorTeam() + ":" + game.getVisitorScore());
		
	}
	  
	public String getInterestedTeam()
	{
		return interestedTeam;
	}
	
	
		
	
	
	
	
	
	
	
	
	
	

}
