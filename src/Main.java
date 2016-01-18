/*
 * 1 comparator nov trieda Collections.sort(zoznam, comparator) pre cas zatredenie
 * 2 comparable implementuje record compare to
 * collections.sort(zoznam) pre teplotu triedenie 
 * 
*/


public class Main {

	public static void main(String[] args) {
		// Record r1 = new Record();
		// Record r2 = new Record(8, 4);
		// Record[] records = {r1, r2};
		// Record rr = new Record(records);
		// System.out.println(r1.toString());
		MeteoAnalyser ma = new MeteoAnalyser();

		//ma.generateTestData(10, 1, 40, 200);

		System.out.println(ma.toString());
		
		System.out.println("Sort time: " + ma.sortTime());
		
		System.out.println(ma.analyse(ma.generateTestData(20, 0, 45, 200)));
		
	}
}
