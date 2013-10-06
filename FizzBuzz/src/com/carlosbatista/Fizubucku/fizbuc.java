package com.carlosbatista.Fizubucku;


public class fizbuc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//custom end loop
		int passedArgs;
		if(args.length>0)
		{
				try { passedArgs=Integer.parseInt(args[0]); }
				catch (NumberFormatException e)
				{
					System.err.println("Argument" + "must be an integer");
					System.exit(-1);
				}
		
		}
		for(int i=1; i<=100;i++)
		{
			// System.out.println(i+"Duh !");
			//Divisible by 3 ?
			System.out.println("Value of i is "+i);
			System.out.println("Value of i % 3 ="+ i%3);
			System.out.println("Value of i % 5 ="+ i%5);
			if((i % 3)==0 )
			{
						System.out.println("Divisable by 3");
						// continue;
			}
			if((i % 5)==0)
			{
				System.out.println("Divisable by 5");
			}
			if((i % 3)==0 && (i % 5)==0)
			{
				System.out.println("FizzBuzz!");
				System.exit(0);
			}
				
		}

	}

}
