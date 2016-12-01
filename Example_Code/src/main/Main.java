package main;

import java.util.ArrayList;
import java.util.List;

import calc.Calc;
import store.Store;

public class Main {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(1);
		lst.add(3);
		lst.add(4);

		Calc c = new Calc();
		c.setLst(lst);
		double upweightValue = 0.0;

		try {
			double modifiedAvg = c.calculate();

			Store s = new Store();
			s.setAnswer(modifiedAvg);
			upweightValue = s.storeAnswer();
		} catch (Exception e) {
			// nothing
		}
		System.out.println(upweightValue);
	}

}