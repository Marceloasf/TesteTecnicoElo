package br.com.elotech;

import java.util.ArrayList;
import java.util.List;

public class AlmostIncreasingSequence {
	public Boolean increasingSequence(List<Integer> sequence) {
		List<Integer> listaAux = new ArrayList<Integer>();

		for (int x = 0; x < sequence.size(); x++) {
			listaAux.addAll(sequence);
		}

		for (int x = 0; x < sequence.size() - 1; x++) {
			if (sequence.get(x) >= sequence.get(x + 1)) {
				return false;
			}

		}
		return true;
	}
}