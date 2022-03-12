package Strings;

public class Essay {
	private String authorsNameFirst;
	private String authorsNameSecond;
	private String authorsNameThird;
	private String essayText;
	public Essay()
	{
		String authorsNameFirst = "test";
		String essayText = "test";
	}
	
	public void setAuthorsName(String authorsNameFirstX )
	{
		authorsNameFirst.equals(authorsNameFirstX);
	}
	
	public String getFirstName()
	{
		return authorsNameFirst;
	}
	
	public String getLastName()
	{
		return authorsNameSecond;
	}
	
	public String setText(String TestX)
	{
		essayText = TestX;
		return TestX;
	}
	
	public String getLastNameCaps()
	{
		return authorsNameThird.toUpperCase();
	}
	
	public int getFirstNameLength()
	{
		return authorsNameFirst.length();
	}
	
	public Boolean findLetterX()
	{
		return authorsNameFirst.contains("X") || authorsNameFirst.contains("x") || authorsNameSecond.contains("X") || authorsNameFirst.contains("x");
	}
	
	public int getWordCount()
	{
		int words = 0;
		for(int i = 0; i < essayText.length(); i++)
		{
			if (essayText.charAt(i) == ' ')
			{
				words++;
			}
		}
		return words;
	}
	
}
