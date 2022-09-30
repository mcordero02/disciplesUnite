package disciplesUnite;

public class disciplesAdd {
	public static void main(String[] args) {
		numberOfyears(13, 7400000000L);
		
	}
	
	public static long numberOfyears(long disciplesTotal, long humanPopulation) {
		int initialYears = 0;
		
		while(disciplesTotal < humanPopulation) {
			disciplesTotal *=3; //*= multiplies initialYears with 3
			initialYears+=3; // += adds initialYears with 3
		}
		System.out.println(initialYears);
		return 0;
	}

}
