package diceGame;

public class currentTime {
	
	public static void main(String[] args){
		//Liczba wszystkich sekund
		long timeInSeconds = System.currentTimeMillis() / 1000;
		//obecna liczba sekund to modulo ze wszystkich sekund
		long currentTimeInSeconds = timeInSeconds % 60;
		//liczba wszystkich minut to sekundy podzielone przez minuty
		long totalTimeinMin = timeInSeconds / 60;
		//liczba obecnych minut to minuty modulo 60
		long currentTimeInMinutes = totalTimeinMin % 60;
		//ogólna liczba godzin to wszystkie minuty / 60
		long totalTimeInHours = totalTimeinMin / 60;
		//obecna liczba godzin to wszystkie godziny modulo 60
		long currentTimeInHours = totalTimeInHours % 24;
		System.out.println("Hour: " + currentTimeInHours + " Minutes: " + currentTimeInMinutes + " Seconds: " + currentTimeInSeconds);
	}
	
}
