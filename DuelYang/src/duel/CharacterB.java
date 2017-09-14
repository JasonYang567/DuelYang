package duel;

public class CharacterB implements Dueler {
	
	int health;

	public void taunt()
	{
		print("What are you even doing?");
	}
	public String getName()
	{
		return "Jason Z";
	}
	public void setStartingHp(int hp)
	{
		health = hp;
	}
	public int getHP()
	{
		return health; 
	}
}
