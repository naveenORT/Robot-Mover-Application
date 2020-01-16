package robot;
import java.io.IOException;
public class Robotmover 
{
	int k=1;
	int str1[] = new int[50];  // declaring str1 & str2 as global variable because of its utilization in 
	int str2[] = new int[50];  // two different methods
	public Robotmover() throws IOException  
	{
		char input,dir;
		char gridMap[][] = new char[8][8];
		int i,j=0;
		boolean done =  false;	
		input = (char)System.in.read();  //getting the decision to enter the application 
		if( input == 'y'|| input == 'Y')
		{ 
			System.out.println("Welcome to 8x8 ROBOT Moving Application "+"\n\n"+"Current location of Robot");
			for (i = 0; i < 8; i++)
			{
				for(j = 0; j < 8; j++)
				{
				gridMap[i][j] = '.';                       
				gridMap[4][4] ='R';                    // FIXING THE ROBOT AT DEFAULT POSITION 4,4
				System.out.print(gridMap[i][j] +" ");
				}
				System.out.println(" ");
			}
				System.out.print("robot currently at home 4,4"+"\n"+"Press N/S/E/W TO MOVE"+"\nPress H for last three location data");
			    System.out.println("Press X to exit application");
		while (!done)
			{
			
			dir = (char)System.in.read();       //getting the direction input
			switch(dir)
			{	
			case 'N':
				for (i=0;i<=7;i++)
				{
					for (j=0;j<=7;j++)
					{
						if(gridMap[i][j]=='R') 
						{	 		
						gridMap[i][j] = '.';         //ALGORITHM FOR MOVING NORTH
						gridMap[i-1][j] = 'R';
						}
					}
				}
				printgrid(i,j,gridMap);    //PRINT USING METHOD
				break;
			case 'S':
				for (i=7;i>=0;i--)
				{
					for (j=7;j>=0;j--)
					{
						if(gridMap[i][j]=='R')
						{	 		
						gridMap[i+1][j] = 'R';        //ALGORITHM FOR MOVING SOUTH
						gridMap[i][j] = '.';
						}				
					}
				}
				printgrid(i,j,gridMap);    //PRINT USING METHOD
				break;
			case 'W':
				for (i=0;i<=7;i++)
				{
					for (j=0;j<=7;j++)
					{
						if(gridMap[i][j]=='R')
						{	 		
						gridMap[i][j] = '.';    //ALGORITHM FOR MOVING SOUTH
						gridMap[i][j-1] = 'R';
						}
					}
				}
				printgrid(i,j,gridMap);   //PRINT USING METHOD
				break;
			case 'E':
				for (i=0;i<=7;i++)
					{
						for (j=7;j>=0;j--)
							{
							if(gridMap[i][j] =='R')
								{	 		
								gridMap[i][j]='.';           //ALGORITHM FOR MOVING EAST
								gridMap[i][j+1] = 'R';	
								}
							}
					}		
				    printgrid(i,j,gridMap);              //printing the grid using method/function
					break;		
			case 'H':
				System.out.println("\n the last 3 locations are");
				int count = 0;
				for(int l=str1.length-1;l>=0;l--)
				{
					if((str1[l]!=0 || str2[l]!=0) && count<3) 
					{
					 
					 System.out.println("\n"+ str1[l]+","+ str2[l]);
					 count++;
					}
				}
				break;
			case 'X':
				System.out.println("exiting application");
				done = true;                               //quit application
				break;	
		 
		    	
		}}}
		else	
		{	
			System.out.print("invalid entry exiting application");
		}
		}
	public void printgrid(int i, int j, char[][] gridMap) throws IOException
	{
		for (i = 0; i <=7; i++){
			for (j = 0; j<=7; j++){
				System.out.print(gridMap[i][j] +" ");  //loop to print grid
			}
				System.out.println(" ");
			}
		for (i = 0; i<=7; i++){
			for (j = 0; j<=7; j++){
				if (gridMap[i][j] =='R')            //system to track the current location
				{
				System.out.print("\n robot currently at "+i +","+ +j);				 		
				if (i == 4){
					if(j == 4){                     //checking it whether its in home or not
						System.out.println("\n\n robot currently at home");
					}}}
			}}		
		for (i = 0; i<=7; i++){	
	      for (j = 0; j<=7; j++){
			if (gridMap[i][j] =='R')
				{	
					str1[0]=4;str2[0]=4;
					str1[k]=i;             // Storing the past location data in str1 & str2
					str2[k]=j;				
					k++;
				}}}	
	}
	public static void main(String[] args) throws IOException 
	{
		System.out.println("\b Naveen Rajendran, NUID 001304569");
		System.out.println("\n\n Welcome to 8*8 Robot Mover Application.initializing" + '\n' + "press yes or no to continue" );	
		new Robotmover();		
	}

}
