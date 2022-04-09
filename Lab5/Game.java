
/**
 * @author trevordouglas
 *
 */

public class Game extends GameCenter{
	
	private String homeTeam;
	private String visitorTeam;
	private int homeScore;
	private int visitorScore;
	private int currentPeriod;
	
	
	public Game(String homeTeam, String visitorTeam)
	{
		this.homeTeam = homeTeam;
		this.visitorTeam = visitorTeam;
		homeScore = 0;
		visitorScore = 0;
		currentPeriod = 0;
		
	}
	
	public String getHomeTeam()
	{
		return homeTeam;
	}
	
	public String getVisitorTeam()
	{
		return visitorTeam;
	}
	
	public int getHomeScore()
	{
		return homeScore;
	}
	public int getVisitorScore()
	{
		return visitorScore;
	}
	public int getCurrentPeriod()
	{
		return currentPeriod;
	}
	
	public void updateScore(int homeScore, int visitorScore, int currentPeriod) {
		this.homeScore = homeScore;
		this.visitorScore = visitorScore;
		this.currentPeriod = currentPeriod;
		super.notifyGameObservers();
		
	}
	
	

}
