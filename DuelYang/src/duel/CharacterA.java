package duel;

public class CharacterA implements Dueler{

	private int health = 100;
	private double randomNum;
	private boolean loaded;
	
	public CharacterA()
	{
		loaded = false;
	}
	
	public void taunt() {
		System.out.println("Show me your moves!");
	}
	
	public String getName() {
		return "Jason Y";
	}
	
	public void setStartingHP(int hp) {
		this.health = hp;
	}
	
	public int getHP() {
		return this.health;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if(d.getHP() == hp)
		{
			return true;
		}
		else 
		{
			return false; 
		}
	}
	
	public int getAction(Object caller) {
		if(caller instanceof Duel)
		{
			randomNum = Math.random(); 
			if(!loaded)
			{
				if(randomNum <= .50)
				{
					loaded = true; 
					return Duel.LOADING;
				}
				else 
				{
					return Duel.GUARDING;
				}				
			}
			else 
			{
				if(randomNum <= .5)
				{
					loaded = false; 
					return Duel.SHOOTING;
				}
				else 
				{
					return Duel.GUARDING;
				}
			}
		}
		else 
		{
			return Duel.YEAH_RIGHT;
		}
	}
	
	public void hit(Object caller) {
		if( caller instanceof Duel)
		{
			this.health -=10;
		}
	}
}


