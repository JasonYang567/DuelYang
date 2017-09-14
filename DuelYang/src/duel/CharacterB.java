package duel;

public class CharacterB implements Dueler {
	
	int health;

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
		health = hp;
	}
	public int getHP()
	{
		return health; 
	}
}
