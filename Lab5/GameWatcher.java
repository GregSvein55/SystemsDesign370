
/**
 * @author trevordouglas
 *
 */
public interface GameWatcher {
	
	public void addGameObserver(GameObserver  gameObserver);
	public void removeGameObserver(GameObserver gameObserver);
	
	public void notifyGameObservers();

}
