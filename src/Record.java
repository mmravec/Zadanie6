
public class Record implements Comparable<Record> {

	private int time;
	private int temperature;
	// private Record records;

	public Record() {

	}

	public Record(int time, int temperature) {
		// super();
		this.time = time;
		this.temperature = temperature;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public String toString() {
		return "[" + this.time + " min, " + this.temperature + " C]";
	}

	@Override
	public int compareTo(Record o) {
		return this.getTemperature() - o.getTemperature();
	}
}
