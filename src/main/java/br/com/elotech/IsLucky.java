package br.com.elotech;

public class IsLucky {
	public Boolean isLucky(String parameter) {
		Integer m1 = 0, m2 = 0;
		int lenght = parameter.length();

		if (!(lenght % 2 == 0)) {
			return false;
		}

		int half = lenght / 2;

		for (int x = 0; x < half; x++) {
			m1 += Character.getNumericValue(parameter.charAt(x));
		}

		for (int x = half; x < lenght; x++) {
			m2 += Character.getNumericValue(parameter.charAt(x));
		}

		if (m1 == m2) {
			return true;
		} else {
			return false;
		}
	}
}
