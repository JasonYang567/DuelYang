package duel;

public class CharacterB implements Dueler {
	
	int health;
	double choicePercentage;
	int tauntchoice;
	
	public CharacterB()
	{
		tauntchoice = 1; 
	}
	public void taunt()
	{
		if (tauntchoice == 1)
		{
			System.out.println("What are you even doing?");
		}
		else 
		{
			System.out.println("I will destroy you!");
		}
		tauntchoice ++;
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
		if(caller == this)
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
		return 0;
	}
	public void hit(Object caller)
	{
		if( caller == "Duel")
		{
				this.health -= 10; 
		}		
	}
	
}
