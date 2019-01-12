package br.com.elotech;

public class CircleNumber {
	public Integer circleMat(Integer n, Integer number) {
		Integer result = number + (n/2);
		return result % n;
	}
}
