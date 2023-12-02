package programs;

public class GreenflyProblem {

	public static void main(String[] args) {
		int initialPopulation = 1;
		int population ;
		int numberOfdays =10;
		population = initialPopulation;
		for(int day =1; day<= numberOfdays;day++) {
			System.out.println(day+"\t"+population);
			population *=2;
		}
	}

}
