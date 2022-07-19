package claseJava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class EjemploStreams {

	
	public static void main(String[] args) {
		
		
		List<Integer> listaNumerosRandoms = crearArrayNumerosRandom(5, 50);
		 		
		System.out.println("LISTA NUMEROS------------------------------------");
		listaNumerosRandoms.stream().forEach(System.out::println);
		System.out.println("NUMERO MIN------------------------------------");
		System.out.println( listaNumerosRandoms.stream().min(Comparator.naturalOrder()).get());
		System.out.println("NUMERO MAX------------------------------------");
		System.out.println( listaNumerosRandoms.stream().max(Comparator.naturalOrder()).get());
		System.out.println("LISTA NUMEROS MENORES A 25------------------------------------");
		listaNumerosRandoms.stream().filter(c->c<25).forEach(System.out::println);
		System.out.println("LISTA NUMEROS MAYORES A 25------------------------------------");
		listaNumerosRandoms.stream().filter(c->c>25).forEach(System.out::println);
		
	}
	public static ArrayList<Integer> crearArrayNumerosRandom(int cantidad,int max) {
		Random r = new Random();
		ArrayList<Integer> numeros= new ArrayList<>();
		
		for (int i = 0; i < cantidad; i++) {
			numeros.add(r.nextInt(max)+1);
		}
		
		return numeros;
	}
}
