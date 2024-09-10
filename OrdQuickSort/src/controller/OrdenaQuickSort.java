package controller;

import br.edu.fateczl.Ordenacao;

public class OrdenaQuickSort {

	public OrdenaQuickSort() {
		super();
	}
	
	public int[] Ordenacao(int[] vetor, int inicio, int fim) {
		
		Ordenacao quick = new Ordenacao();
		int[] vetorQuickSort = quick.quickSort(vetor, inicio, fim);
		return vetorQuickSort;
	}

}
