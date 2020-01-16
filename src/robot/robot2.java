package robot;
import java.io.IOException;

public class robot2 
{
	boolean done =  false;
	
	public robot2() throws IOException  
	{
		char input,dir;
		char gridMap[][] = new char[8][8];
		int i,j,k=0;	
			
		input = (char)System.in.read(); 
		if( input == 'y')
		{
			System.out.println("Current location of Robot");
			for (i = 0; i < 8; i++)
			{
				for(j = 0; j < 8; j++)
				{
				gridMap[i][j] = '.';
				gridMap[4][4] ='R';
				System.out.print(gridMap[i][j] +" ");
				}
				System.out.println(" ");
			}
				System.out.print("robot currently at home ");
			
				
	  while (!done)
		{
		    int str1[] = new int[20];
			int str2[] = new int[20];
						
			dir = (char)System.in.read();
			
			
			
			switch(dir)
			{	
			case 'N':
				for (i=0;i<=7;i++)
				{
					for (j=0;j<=7;j++)
					{
						if(gridMap[i][j] =='R')
						{	 		
						gridMap[i][j] = '.';
						gridMap[i-1][j] = 'R';
						}
					}
				}
				
				for (i = 0; i <=7; i++)
				{
					for (j = 0; j<=7; j++) 
					{
						System.out.print(gridMap[i][j] +" ");
					}
						System.out.println(" ");
				}
				
				for (i = 0; i<=7; i++)
				{
					for (j = 0; j<=7; j++)
					{
						if (gridMap[i][j] =='R')
						{
						System.out.print("\n robot currently at "+i +","+ +j);
						}
						if (i == 4)
						{
							if(j == 4)
							{
								System.out.println("\n\n robot currently at home");
							}
						}				
								
					}		
					
				}
				for (i = 0; i<=7; i++)
				{	
				 for (j = 0; j<=7; j++)
				 {
					if (gridMap[i][j] =='R')
						{
							str1[k]=i;
							str2[k]=j;			
							k=k+1;
						}
				 }	
				}
				
				break;
			case 'S':
				for (i=7;i>=0;i--)
				{
					for (j=7;j>=0;j--)
					{
						if(gridMap[i][j]=='R')
						{	 		
						gridMap[i+1][j] = 'R';
						gridMap[i][j] = '.';
						}				
					}
				}
				for (i = 0; i <=7; i++)
				{
					for (j = 0; j<=7; j++) 
					{
						System.out.print(gridMap[i][j] +" ");
					}
						System.out.println(" ");
				}
				
				for (i = 0; i<=7; i++)
				{
					for (j = 0; j<=7; j++)
					{
						if (gridMap[i][j] =='R')
						{
						System.out.print("\n robot currently at "+i +","+ +j);				 		
						
						}
						if (i == 4)
						{
							if(j == 4)
							{
								System.out.println("\n\n robot currently at home");
							}
						}				
					}
					
				}		
				for (i = 0; i<=7; i++)
				{	
				 for (j = 0; j<=7; j++)
				 {
					if (gridMap[i][j] =='R')
						{
							str1[k]=i;
							str2[k]=j;			
							k=k+1;
						}
				 }	
				}
				
				
				
				break;
			case 'W':
				for (i=0;i<=7;i++)
				{
					for (j=0;j<=7;j++)
					{
						if(gridMap[i][j]=='R')
						{	 		
						gridMap[i][j] = '.';
						gridMap[i][j-1] = 'R';
						}
					}
				}
				for (i = 0; i <=7; i++)
				{
					for (j = 0; j<=7; j++) 
					{
						System.out.print(gridMap[i][j] +" ");
					}
						System.out.println(" ");
				}
				
				for (i = 0; i<=7; i++)
				{
					for (j = 0; j<=7; j++)
					{
						if (gridMap[i][j] =='R')
						{
						System.out.print("\n robot currently at "+i +","+ +j);				 		
						}
						if (i == 4)
						{
							if(j == 4)
							{
								System.out.println("\n\n robot currently at home");
							}
						}				
				     }		
				}
				break;
			case 'E':
				for (i=0;i<=7;i++)
					{
						for (j=7;j>=0;j--)
							{
							if(gridMap[i][j] =='R')
								{	 		
								gridMap[i][j]='.';
								gridMap[i][j+1] = 'R';	
								}
							}
					}		
				for (i = 0; i <=7; i++)
				{
					for (j = 0; j<=7; j++) 
					{
						System.out.print(gridMap[i][j] +" ");
					}
						System.out.println(" ");
				}
				
				for (i = 0; i<=7; i++)
				{
					for (j = 0; j<=7; j++)
					{
						if (gridMap[i][j] =='R')
						{
						 System.out.print("\n robot currently at "+i +","+ +j);				 		
						}
						 if (i == 4)
						{
							if(j == 4)
							{
								System.out.println("\n\n robot currently at home");
							}
						}				
							
					}
				}
				break;				
					
			case 'H':
				for(int l=0;l<3;l++)
				{
				System.out.println("\n"+ str1[l]+","+ str2[l]);				
				}
				break;
						
			}}}}
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Welcome to 8*8 Robot Mover Application.initializing" + '\n' + "press yes or no to continue" );	
		new robot2();		
		
	}

}
