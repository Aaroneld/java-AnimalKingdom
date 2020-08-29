package AnimalKingdomProject;

public class Fish extends Animal
{

	public Fish(String name, int yearNamed)
	{
		this.name = name;
		this.yearNamed = yearNamed;
	}

	@Override public String reproduce()
	{
		return "Eggs";
	}

	@Override public String breath()
	{
		return "Gills";
	}

	@Override public String move()
	{
		return "Swim";
	}

}

