package view;

import model.matheus.libArvoreInt.Arvore;

public class Main {

	public static void main(String[] args) 
	{
		
		int[] vetor = {7, 8, 3, 4, 2, 1, 6, 5}
;
		Arvore arvore = new Arvore();
		
		for (int i : vetor)
			arvore.insert(i);
		
		try {
			arvore.remove(7);
			arvore.remove(6);
			arvore.prefixSearch();
			System.out.println();
			arvore.infixSearch();
			System.out.println();
			arvore.postfixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
