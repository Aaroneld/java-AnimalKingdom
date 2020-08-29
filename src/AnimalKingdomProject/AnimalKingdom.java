package AnimalKingdomProject;

import java.util.Comparator;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class AnimalKingdom 
{
	public static void main (String[] args)
	{
		Animal[] animalCollection = new Animal[15];

		animalCollection[0] = new Mammal("panda", 1869);
		animalCollection[1] = new Mammal("zebra", 1778);
		animalCollection[2] = new Mammal("koala", 1816);
		animalCollection[3] = new Mammal("sloth", 1804);
		animalCollection[4] = new Mammal("armadillo", 1758);
		animalCollection[5] = new Mammal("raccoon", 1758);
		animalCollection[6] = new Mammal("BigFoot", 2021);
		animalCollection[7] = new Bird("pidgeon", 1837);
		animalCollection[8] = new Bird("peacock", 1821);
		animalCollection[9] = new Bird("toucan", 1758);
		animalCollection[10] = new Bird("parrot", 1824);
		animalCollection[11] = new Bird("swan", 1758);
		animalCollection[12] = new Fish("Salmon", 1758);
		animalCollection[13] = new Fish("catfish", 1817);
		animalCollection[14] = new Fish("perch", 1758);


		for(Animal animal : animalCollection){
			System.out.println(animal.name);
		}

		Arrays.sort(animalCollection, (anm1, anm2) -> anm2.yearNamed - anm1.yearNamed);

		for(Animal animal : animalCollection){
			System.out.println(animal);

		}

		Arrays.sort(animalCollection, (anm1, anm2) -> anm1.name.compareTo(anm2.name));

		for(Animal animal : animalCollection){
			System.out.println(animal);

		}

		Arrays.sort(animalCollection, (anm1, anm2) -> anm1.move().compareTo(anm2.move()));

		for(Animal animal : animalCollection){
			System.out.println(animal);

		}

		List<Animal> lungAnimals = animalFilter(animalCollection, animal -> animal.breath() == "Lungs");
		lungAnimals.forEach(animal -> System.out.println(animal.breath()));

		List<Animal> lungsAfter1758 = animalFilterList(lungAnimals, animal -> animal.yearNamed == 1758);
		lungsAfter1758.forEach(animal -> System.out.println(animal));
	
		List<Animal> eggsAndLungs = animalFilter(animalCollection, animal -> animal.breath() == "Lungs" && animal.reproduce() == "Eggs");
		eggsAndLungs.forEach(animal -> System.out.println(animal));


		Arrays.sort(animalCollection, (anm1, anm2) -> anm1.name.compareTo(anm2.name));
		List<Animal> named1758 = animalFilter(animalCollection, animal -> animal.yearNamed == 1758);
		named1758.forEach(animal -> System.out.println(animal));


	}

	public static List<Animal> animalFilter(Animal[] animalCollection, Filter filter){
		
		List<Animal> filterAnimals = new ArrayList<>();

		for(Animal animal: animalCollection)
		{
			if(filter.filterAnimals(animal))
			{
				filterAnimals.add(animal);
			}
		}

		return filterAnimals;
		
	}

	public static List<Animal> animalFilterList(List<Animal> animalList, Filter filter)
	{
		List<Animal> filterAnimals = new ArrayList<>();

		animalList.forEach(animal -> {
			if(filter.filterAnimals(animal))
			{
				filterAnimals.add(animal);
			}
		});

		return filterAnimals;
	}




}