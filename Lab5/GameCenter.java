/**
 * Filename: GameCenter.java
 * 
 * Description: Observes all the games happening, I added the funcionality to the
 * notifyGameObservers method
 * 
 * Author: Gregory Sveinbjornson
 * Modified from code given by Trevor Douglas
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Hashtable;


public class GameCenter implements GameWatcher{
	
	private Hashtable<String, Integer> teams;
	private ArrayList<Game> todaysGames;
	protected ArrayList<GameObserver> gameObservers;
	
	public GameCenter()
	{
		teams  = new Hashtable<String, Integer>();
		teams.put("Toronto Maple Leafs", 1);
		teams.put("Montreal Canadiens", 2);
		teams.put("Edmonton Oilers", 3);	
		teams.put("Vancouver Canucks", 4);
		teams.put("Calgary Flames",  5);
		teams.put("Ottawa Senators", 6);
		todaysGames = new ArrayList<Game>();
		
		gameObservers = new ArrayList<GameObserver>();
		
	}
	
	public int getTeamID(String teamName)
	{
		Integer n = teams.get(teamName);
		return n.intValue();
		
	}
	
	public void addGame(Game g)
	{
		
		todaysGames.add(g);
		
	}
	
	public void addTeam(String teamName)
	{
		int len = teams.size();
		teams.put(teamName, len);
		
		
	}
	
	public ArrayList<Game> getTodaysGames()
	{
		return todaysGames;
	}
	
	@Override
	public void addGameObserver(GameObserver gameObserver)
	{
		gameObservers.add(gameObserver);
	}
	
	@Override
	public void removeGameObserver(GameObserver gameObserver)
	{
		gameObservers.remove(gameObserver);
	}
	
	
	@Override
	public void notifyGameObservers()
	{
		
		Iterator<GameObserver> it = gameObservers.iterator();

		while (it.hasNext()) {
			GameObserver gameObserver = it.next();
			String team = gameObserver.getInterestedTeam();
			int teamId = getTeamID(team);
			gameObserver.notifyUser(todaysGames.get(teamId));
		}
		
	}
	
}

