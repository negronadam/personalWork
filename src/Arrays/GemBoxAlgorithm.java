package Arrays;

public class GemBoxAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GemBox[][]gemBoxLocations = new GemBox[25][25];
		for(int a = 0; a < 25; a++)
		{
			for(int x = 0; x < 25; x++)
			{
				gemBoxLocations[a][x].setGemBox();
			}
		}
		for(int a = 0; a < 25; a++)
		{
			for(int x = 0; x < 25; x++)
			{
				System.out.println(gemBoxLocations[a][x].checkGemBox());
			}
		}
	}

}
