import java.util.*;

public class MeteoAnalyser implements Meteo {
	private List<Record> records = new ArrayList<Record>();
	private Queue<Record> rad = new LinkedList<Record>();

	public MeteoAnalyser() {

	}

	@Override
	public List<Record> generateTestData(int n, int minTemperature, int maxTemperature, int maxTime) {

		for (int i = 0; i < n; i++) {
			records.add(new Record((int) (Math.random() * maxTime),
					(int) (Math.random() * (maxTemperature - minTemperature) + minTemperature)));
		}
		return records;
	}

	public Comparator<Record> compareTime = new Comparator<Record>() {

		@Override
		public int compare(Record o1, Record o2) {
			int ct1 = o1.getTime();
			int ct2 = o2.getTime();
			return ct1 - ct2;
		}
	};

	public List<Record> sortTime() {
		records.sort(compareTime);
		return records;
	}
	
	// s funkciou mi pomohli Vilo a Adam
	@Override
	public int analyse(List<Record> list) {
		// Queue<Record> queue = new LinkedList<Record>();
		int tmp = 0;
		int max = 0;

		for (Record record : list) {
			rad.offer(record);

			while (record.getTime() - rad.peek().getTime() > 60) {
				rad.poll();
			}
			tmp = Math.abs(Collections.min(rad).getTemperature() - Collections.max(rad).getTemperature());
			if (tmp < max)
				tmp = max;
		}
		return tmp;
	}

	@Override
	public String toString() {
		return "MeteoAnalyser records=" + records;
	}
}
