package boomboom;

public class Weapon extends Item{
	String name;
	String desc;
	int worth;
	int damage;
	
	public void printDesc(){
		System.out.println("item: "+this.name+"\n"
				+ "description: "+this.desc+"\n"
				+ "damage: "+this.damage
				+ "worth: $"+this.worth);
	}
}
