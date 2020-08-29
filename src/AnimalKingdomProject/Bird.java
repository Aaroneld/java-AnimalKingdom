package AnimalKingdomProject;

public class Bird extends Animal
{

	public Bird(String name, int yearNamed)
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
		return "Lungs";
	}

	@Override public String move()
	{
		return "Fly";
	}

}

