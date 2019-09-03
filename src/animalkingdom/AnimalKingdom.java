package animalkingdom;

import java.util.ArrayList;

public class AnimalKingdom {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();
		
		animals.add(new Mammal("Panda", 1869));
		animals.add(new Mammal("Zebra", 1778));
		animals.add(new Mammal("Koala", 1816));
		animals.add(new Mammal("Sloth", 1804));
		animals.add(new Mammal("Armadillo", 1758));
		animals.add(new Mammal("Raccoon", 1758));
		animals.add(new Mammal("Bigfoot", 2021));

		animals.add(new Bird("Pigeon", 1837));
		animals.add(new Bird("Peacock", 1821));
		animals.add(new Bird("Toucan", 1758));
		animals.add(new Bird("Parrot", 1824));
		animals.add(new Bird("Swan", 1758));

		animals.add(new Fish("Salmon", 1758));
		animals.add(new Fish("Catfish", 1817));
		animals.add(new Fish("Perch", 1758));

		animals.sort((v1, v2) -> v2.getYearNamed() - v1.getYearNamed());
		System.out.println("Descending Year Named:");
		animals.forEach((v) -> System.out.println(v.getName()));

		animals.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
		System.out.println("Alphabetical:");
		animals.forEach((v) -> System.out.println(v.getName()));

		animals.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));
		System.out.println("By Movement:");
		animals.forEach((v) -> System.out.println(v.getName()));

		System.out.println("Lung Breathers:");
		animals.forEach((v) -> {
			if (v.breath().equalsIgnoreCase("lungs")) {
				System.out.println(v.getName());
			}
		});

		System.out.println("Lung Breathers in 1758:");
		animals.forEach((v) -> {
			if (v.breath().equalsIgnoreCase("lungs") && v.getYearNamed() == 1758) {
				System.out.println(v.getName());
			}
		});

		System.out.println("Lung Breathers & Egg Layers:");
		animals.forEach((v) -> {
			if (v.breath().equalsIgnoreCase("lungs") && v.reproduce().equalsIgnoreCase("eggs")) {
				System.out.println(v.getName());
			}
		});

		System.out.println("1758 Animals:");
		animals.forEach((v) -> {
			if (v.getYearNamed() == 1758) {
				System.out.println(v.getName());
			}
		});
	}
}