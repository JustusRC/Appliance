package appliance;

public class Microwave {
	
	//Justus Contreras
	//P8.1
	//CS234
	
	
	
	
	//Variable declaration
	int time = 0;
	int level = 1;

	

	
	//Increases time by 30 second
	public void increaseTime (){
		
	  time+=30;
	}
	//Switches power
	public void switchPower() {
		//If at level 2 switch to 1
		if(level==2)
		{
			level=1;
		}
		//If at level 1 switch to 2
		if(level==1)
		{
			
			level =2;
		}
		
		
	}
	//Starts the microwave
	public void start() {

	System.out.println("Cooking for " + time + " seconds at level " + level);


		
	}
	//resets time to 0 and level to 1
	public void reset()
	{
		int time = 0;
		int level = 1;
	}
}