package robot;

public class defaultpos {

	public defaultpos() 
	{
		char gridMap[][] = new char[10][10];	
		int i,j = 0;
		for (i = 0; i < 9; i++)
		{
		for(j = 0; j < 9; j++)
		{
			gridMap[i][j] = '.';
			gridMap[4][4] ='R';
			System.out.print(gridMap[i][j] +" ");
		}
		System.out.println(" ");
		}
		
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++) {
		
		if (gridMap[i][j] =='R')
		{
		
		System.out.print("robot currently at "+i +j);
	
		}}}
		
	}
	public static void main(String[] args) {
		System.out.println("Printing the default position");
		new defaultpos();
			
	}

}
