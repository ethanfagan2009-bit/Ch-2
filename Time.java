public class Time{
	public static void main(String[] arg){
	int hours=14;
	int mins=28;
	int seconds= hours*3600 + mins*60;
	double second=seconds;
	int remaining= 24*60*60-seconds;
	double percent = second/(24*60*60)*100;
	System.out.println("seconds passed: " + seconds+"s");
	System.out.println("seconds remaining: " + remaining+"s");
	System.out.println("percent of day passed: "+percent+"%");
	
	hours = 14;
	mins = 43;
	seconds=hours*3600 + mins*60;
	int timePassed= seconds-hours*3600;
	System.out.println("time passed since class start: " + timePassed + "s");
	
	
	}
}
