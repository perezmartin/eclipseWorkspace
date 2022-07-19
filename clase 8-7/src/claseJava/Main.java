package claseJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		Coche c1 = new Coche("Negro","Ford",6);
		Coche c2 = new Coche("Blanco","Arosa", 5); 
		Coche c3 = new Coche("Verde","Peugeot",4);
		Coche c4 = c1;
		Coche c5 = new Coche("Blanco","Peugeot",4);
		c4.setColor("Amarillo");
		System.out.println("Coche 1 es:"+c1.toString());
		System.out.println("Coche 2 es:"+c2.toString());
		System.out.println("Coche 3 es:"+c3.toString());
		System.out.println("Coche 4 es:"+c4.toString());
		
		List<Coche> cars =  new ArrayList<Coche>(Arrays.asList(c1, c2, c3, c4, c5));
		
		System.out.println("las matriculas..............................");
		
		List<Coche> blancos = cars.stream()
				.filter(c->c.getColor().equalsIgnoreCase("Blanco"))
				.collect(Collectors.toList());
		cars.stream().forEach(c -> System.out.println(c.getMatricula()));
		
		System.out.println("los blancos..........collect....................");
		blancos.stream().forEach(System.out::println);
		
		boolean ok = cars.stream()
				.allMatch(c->c.getColor().equalsIgnoreCase("Blanco"));
		System.out.println("Son blancos todos?:" + ok);
		
		boolean ko = cars.stream()
				.anyMatch(c->c.getColor().equalsIgnoreCase("Blanco"));
		System.out.println("Hay alguno blanco?:" + ko);
		
		List<Optional<Coche>> oCoche = cars.stream().map(x -> Optional.of(x)).collect(Collectors.toList());
		System.out.println("Tras la conversion a Optional.........................................");
		oCoche.stream().filter(Optional::isPresent).forEach(System.out::println);
		
		Optional<Coche> oCocheBlanco = oCoche.stream()
				.filter(Optional::isPresent)
				.map(Optional::get)
				.filter(c->c.getColor().equalsIgnoreCase("Blanco"))
				.findFirst();
				
				
		System.out.println("los blancos. opcionales.............................");
		//oCocheBlanco.stream().forEach(System.out::println);
		System.out.println(oCocheBlanco);
		
		
	}


}