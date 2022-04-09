/**
 * Filename: GameUser2.java
 * 
 * Description: 2 of 2 users, I modified the notifyUser function and changed the interestedTeam
 * 
 * Author: Gregory Sveinbjornson
 * Modified from code given by Trevor Douglas
 */
public class GameUser2 implements GameObserver{
    private String interestedTeam = new String("Calgary Flames");
	
    @Override
	public void notifyUser(Game game)
	{
		System.out.println("\nScore update for User2, fan of " + interestedTeam);
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
