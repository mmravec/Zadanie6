import java.util.List;

public interface Meteo {
	/**
	 * vygeneruju sa nahodne data a ulozia do zoznamu. Zoznam uchovava objekty
	 * triedy Record. Pocet zaznamov je definovany parametrom. Kazdy zaznam
	 * pozostava z casu v minutach, ktory je v rozsahu od 0 po maxTime.
	 * Maximalny rozsah teplot je definovany parametrami.
	 * 
	 * @param n
	 *            pocet vygenerovanych udajov
	 * @param minTemperature
	 *            najnizsia mozna teplota
	 * @param maxTemperature
	 *            najvyssia mozna teplota
	 * 
	 * @param maxTime
	 *            maximalny mozny cas merania
	 * 
	 * @return zoznam objektov triedy Record
	 */
	public List<Record> generateTestData(int n, int minTemperature, int maxTemperature, int maxTime);

	/**
	 * pre zadany zoznam zaznamenanych udajov zisti maximalny rozsah hodnot v
	 * ramci nejakej hodiny za celu dobu merania. Teda rozdiel medzi najvacsou a
	 * najmensou nameranou teplotou v ramci 60 minut.
	 * 
	 * @param list
	 *            zoznam udajov
	 * @return maximalny rozsah hodnot v ramci jednej hodiny za celu dobu
	 *         merania
	 */
	public int analyse(List<Record> list);
	

}
