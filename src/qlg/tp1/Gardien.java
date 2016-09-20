package qlg.tp1;

import java.util.ArrayList;
import java.util.List;

public class Gardien {
	
	private List<Animal> mesAnimauxRef;
	
	public Gardien()
	{
		mesAnimauxRef = new ArrayList<>();
		Animal a1 = new Animal("Chat", "Meow");
		Animal a2 = new Animal("Chien", "Ouaf Ouaf");
		Animal a3 = new Animal("Loup", "Ahouuuuu");
		Animal a4 = new Animal("Tigre", "Roar");
		
		mesAnimauxRef.add(a1);
		mesAnimauxRef.add(a2);
		mesAnimauxRef.add(a3);
		mesAnimauxRef.add(a4);
	}
	
	public void faitAppel()
	{
		
		
		System.out.println("MA LISTE DE REFERENCE");
		for(int i = 0 ; i < mesAnimauxRef.size() ; i++)
		{
			System.out.println(mesAnimauxRef.get(i).crier());
		}
		System.out.println("_________________________________________ FIN\n\n\n");
		
		Zoo monZoo = new Zoo();
		System.out.println("LA LISTE DU ZOO");
		for(int i = 0 ; i < monZoo.getLesAnimauxDuZoo().size() ; i++)
		{
			System.out.println(monZoo.getLesAnimauxDuZoo().get(i).crier());
		}
		System.out.println("_________________________________________ FIN");
	}
}
