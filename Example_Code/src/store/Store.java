package store;

public class Store {

	private double answer;
	
	public double storeAnswer()
	{
		double upweightedValue = 0.0;
		upweightedValue = this.answer*10;
		return upweightedValue;
	}

	public double getAnswer() {
		return answer;
	}

	public void setAnswer(double answer) {
		this.answer = answer;
	}
	
	
}