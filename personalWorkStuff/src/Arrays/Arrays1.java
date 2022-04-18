package Arrays;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaring an Array
		// dataType[] arrayName = new dataType[storage]
		/*
		int[] array = {5, 7 , 8, 5, 3, 54, 5, 7, 8, 4, 7, 4, 6, 5, 3, 6,};
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		You can use arrays in loops!
		*/
			boolean algorithmIsTrue = false;
		    int[] scores = new int[5];
		    scores[0] = 1;
		    scores[1] = 2;
		    scores[2] = 1;
		    scores[3] = 7;
		    scores[4] = 8;
		    int highest = 0;
		    for(int a = 0; a < scores.length - 1; a++)
		    {
		      if (scores[a] > highest)
		      {
		    	System.out.println(scores[a]);
		        a++;
		        highest = scores[a];
		        
		      }
		      else
		      {
		        System.out.println("There is an issue!");
		      }
		    }
		    System.out.println("Algorithm completed...");
	}

}
