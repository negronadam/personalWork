package objectOrientedProgramming;

public class ApollyonMemory {
	private String q;
	private String a;
	public ApollyonMemory(String Question, String Answer)
	{
		this.q = Question;
		this.a = Answer;
	}
	
	public String getQuestion()
	{
		return q;
	}
	
	public String getAnswer()
	{
		return a;
	}
}
