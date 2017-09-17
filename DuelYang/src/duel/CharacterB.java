package duel;

public class CharacterB implements Dueler {
	
	int health;
	double choicePercentage;
	
	public CharacterB()
	{
		
	}
	public void taunt()
	{
		System.out.println("What are you even doing?");
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
		return true;
	}
	public int getAction( Object caller )
	{
		if(caller == "Duel")
		{
			choicePercentage = Math.random(); 
			if(choicePercentage<=.33)
			{
				return 1; 
			}
			else 
			{
				if (choicePercentage>1/3 && choicePercentage<=2/3)
				{
					return 2; 
				}
				else 
				{
					return 3;
				}
			}
		}
	}
	public void hit(Object caller)
	{
		if( caller == "Duel")
		{
				this.health -= 10; 
		}		
	}
	
}
