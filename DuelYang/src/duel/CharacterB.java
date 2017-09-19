package duel;

public class CharacterB implements Dueler {
	
	int health;
	double choicePercentage;
	int choice; 
	int tauntchoice;
	
	public CharacterB()
	{
		tauntchoice = 0; 
		choice = 0;
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
		return true;
	}
	public int getAction( Object caller )
	{
		if(caller == "Duel")
		{
			choicePercentage = Math.random(); 
			if(choicePercentage<=.33)
			{
				choice = 0; 
			}
			else 
			{
				if (choicePercentage>1/3 && choicePercentage<=2/3)
				{
					choice = 1; 
				}
				else 
				{
					choice = 2;
				}
			}
		}
		return choice;
	}
	public void hit(Object caller)
	{
		if( caller == "Duel")
		{
				this.health -= 10; 
		}		
	}
	
}
