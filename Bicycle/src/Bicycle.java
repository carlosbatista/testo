
class Bicycle {
	int cadence=0;
	int speed=0;
	int gear=1;
	private static int seats=1;
	
	void changeCadence(int newValue)
	{
		cadence=newValue;
	}
	
	void changeGear(int newValue)
	{
		//comment
		gear=newValue;
	}
	
	void speedUp(int increment)
	{
		speed=speed+increment;
	}
	
	void applyBreaks(int decrement)
	{
		speed=speed-decrement;
	}
	
	void printStates()
	{
		System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear + " seats: " + seats);
	}

}

class MountainBike extends Bicycle{
	
	int shockState=0;
	
	void speedUp(int increment)
	{
		this.speed=speed+increment*2;
	}
	
}

class BicycleDemo {
	
	public static void main(String[] args)
	{
	
		Bicycle b1;
		Bicycle b2;
		MountainBike m1;
		
		b1 = new Bicycle();
		b2 = new Bicycle();
		m1=new MountainBike();
		// m1.seats=10;
		
		b1.speedUp(10);
		// m1.speedUp(10);
		for(long x=0;;x++)
		{
		b1.speedUp(1);
		// b1.printStates();
		if(b1.speed<0) 
		{
		System.out.println("x is: " + x);
			System.exit(0);
		}
		}
		
		//b1.printStates();
		// b2.printStates();
		//m1.printStates();
	}
	
}
