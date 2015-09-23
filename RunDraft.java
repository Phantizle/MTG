package Draft;

public class RunDraft {

	public static void main(String[] args) {
//		Cube p = new Cube();
//		String[] cubeArray = p.generateSortedCubeArray();//shuffled
////		System.out.println(p);
//		String[][] packArray = p.generatePacks(cubeArray);
//		   for(int i = 0; i < 9; i++)
//		   {
//		      for(int j = 0; j < 15; j++)
//		      {
//		         System.out.printf( packArray[i][j]);
//		      }
//		      System.out.println();
//		   }
//		
		
		CubeList c = new CubeList();
		c.generateCube();
		System.out.println(c.toString());
		
		
		
		
	}

}
