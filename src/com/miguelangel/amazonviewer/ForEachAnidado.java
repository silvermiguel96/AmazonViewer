package com.miguelangel.amazonviewer;

public class ForEachAnidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int array[][][] = {
		{{1,2,3}, {4,5,6}}, {{6,7,8,9,10}}, {{11,12,13,14,15}} 
	};
	
		for( int[][] arrayInterno : array) {
			for( int[] numero: arrayInterno ) {
				for( int i: numero) {
					System.out.println(i);
				}
			}
		}
		System.out.println("Cambio de in ciclo por indice");
		for( int i = 0; i < array.length; i++) {
			for( int j = 0; j < array[i].length; j++) {
				for( int k = 0; k < array[i][j].length; k++) {
					System.out.println(array[i][j][k]);
				}
			}
		}
	}
}
