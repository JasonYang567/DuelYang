package duel;

public class CharacterB implements Dueler {
	
	private int health;
	private double choicePercentage;
	private int tauntchoice;
	private boolean loaded;
	
	public CharacterB()
	{
		tauntchoice = 0;
		loaded = false;
	}
	public void taunt()
	{
		tauntchoice ++;
		if (tauntchoice == 1)
		{
			System.out.println("What are you even doing?");
		}
		else 
		{
			System.out.println("I will destroy you!");
		}
	}
	public String getName()
	{
		return "Jason Z";
	}
	public void setStartingHP(int hp)
	{
		this.health = hp;
	}
	public int getHP()
	{
		return this.health; 
	}
	public boolean determineIfOpponentIsFair(Dueler d, int hp)
	{
		if(d.getHP() == hp)
		{
			return true;
		}
		else 
		{
			return false; 
		}
	}
	public int getAction( Object caller )
	{
		if(caller instanceof Duel)
		{
			choicePercentage = Math.random(); 
			if(!loaded)
			{
				if(choicePercentage <= .50)
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
				if(choicePercentage <= .5)
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
	public void hit(Object caller)
	{
		if( caller instanceof Duel)
		{
			this.health -=10;
		}
	}
	
}
