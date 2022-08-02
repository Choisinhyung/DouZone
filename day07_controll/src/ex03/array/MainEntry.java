package ex03.array;

public class MainEntry {

	public static void main(String[] args) {
		// 1.
		int[][][] a = new int[2][3][4];
		
		// 2.
		int[][][] b = new int[][][] {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}}};
		
		// 3.
		int[][][] c = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}}};
		
		System.out.println(c.length); //면길이
		System.out.println(c[0].length); //행길이
		System.out.println(c[0][0].length); //열길이
		
		
		for(int i = 0; i < c.length; i++)
			for(int j = 0; j < c[i].length; j++)
				for(int k = 0; k < c[i][j].length; k++)
					System.out.println(c[i][j][k]);

	}

}
