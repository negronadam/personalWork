package Arrays;
import java.util.Random;
public class GemBox {
		
		private int gemAmount;
		private boolean isGembox;
		
		public GemBox()
		{
			Random generator = new Random();
			this.gemAmount = generator.nextInt(25-1) + 1;
		}
		
		public int getAmount()
		{
			return gemAmount;
		}
		
		public void setGemBox()
		{
			Random gen = new Random();
			if(gen.nextInt(100-1)+1 > 50)
			{
				this.isGembox = true;
			}
			else
			{
				this.isGembox = false;
			}
			
		}
		
		public boolean checkGemBox()
		{
			return isGembox;
		}
		
		
}
