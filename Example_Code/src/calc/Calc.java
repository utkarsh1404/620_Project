package calc;

import java.util.List;

public class Calc {

	private List<Integer> lst;

	public double calculate() {
		if (this.lst == null || lst.isEmpty()) {
			throw new NullPointerException();
		}
		int i = 0;
		int length = lst.size();
		int sum = 0;
		for (i = 0; i < length; i++) {
			if (i % 2 == 0 && lst.get(i) >= 2) {
				sum += lst.get(i);
			}
		}
		double modifiedAvg = 0.0;
		modifiedAvg = (sum * 1.0) / length;
		return modifiedAvg;
	}

	public List<Integer> getLst() {
		return lst;
	}

	public void setLst(List<Integer> lst) {
		this.lst = lst;
	}
}