package duel;

public class CharacterA implements Dueler{

	int health = 100;
	double randomNum;
	
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
		return true;
	}
	
	public int getAction(Object caller) {
		if(caller == this)
		{
			randomNum = Math.random(); 
			if(randomNum <= 1/3) {
				return 1; 
			}
			else {
				if (randomNum <= 2/3) {
				return 2; 
				}
				else {
					return 3;
				}
			}
		}
		return 0;
	}
	
	public void hit() {
		this.health -= 10; 
	}
}


