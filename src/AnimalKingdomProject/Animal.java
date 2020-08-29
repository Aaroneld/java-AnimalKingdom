package AnimalKingdomProject;

import java.util.Random;

public abstract class Animal
{

	protected int id;
	protected int yearNamed;
	protected String name;
	
	public Animal()
	{
		Random rand = new Random();
		this.id = rand.nextInt(100000);
	}

	public String toString()
	{
		return String.format("Animal[%d,%s,%d]", this.id, this.name, this.yearNamed);
	}

	abstract String reproduce();
	abstract String breath();
	abstract String move();

}