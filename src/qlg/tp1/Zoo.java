package qlg.tp1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private List<Animal> lesAnimauxDuZoo;
	
	public Zoo()
	{
		setLesAnimauxDuZoo(new ArrayList<Animal>());

		Animal a1 = new Animal("Chat", "Meow");
		Animal a2 = new Animal("Chien", "Ouaf");
		Animal a3 = new Animal("Loup", "Ahouuuuu");
		Animal a4 = new Animal("Tigre", "Roar");
		
		getLesAnimauxDuZoo().add(a1);
		getLesAnimauxDuZoo().add(a2);
		getLesAnimauxDuZoo().add(a3);
		getLesAnimauxDuZoo().add(a4);
	}

	List<Animal> getLesAnimauxDuZoo() {
		return lesAnimauxDuZoo;
	}

	void setLesAnimauxDuZoo(List<Animal> lesAnimauxDuZoo) {
		this.lesAnimauxDuZoo = lesAnimauxDuZoo;
	}
}
