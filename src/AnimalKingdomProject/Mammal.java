package AnimalKingdomProject;

public class Mammal extends Animal
{

	public Mammal(String name, int yearNamed)
	{
		this.name = name;
		this.yearNamed = yearNamed;
	}

	@Override public String reproduce()
	{
		return "Live Birth";
	}

	@Override public String breath()
	{
		return "Lungs";
	}

	@Override public String move()
	{
		return "walk";
	}

}

