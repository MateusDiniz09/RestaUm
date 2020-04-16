/*Tabuleiro*/

package padrao;

public class Tabuleiro {
	private peca Tabuleiro[][];
	
	
	
	public Tabuleiro() {
		Tabuleiro = new peca[8][7];
		
	}
	
	public void adcPeca(peca p) {
		for(int i = 7; i > 0; i--) {
			for(int j = 0; j < 7; j++) {
				if(i == 7 && j > 2 && j < 6){
					if(Tabuleiro[i][j] == null) {
						Tabuleiro[i][j] = new peca(p.caractere, p.vivo);
						return;
					}
				}else if(i == 6 && j > 2 && j < 6){
					if(Tabuleiro[i][j] == null) {
						Tabuleiro[i][j] = new peca(p.caractere, p.vivo);
						return;
					}
				}else if(i == 2 && j > 2 && j < 6){
					if(Tabuleiro[i][j] == null) {
						Tabuleiro[i][j] = new peca(p.caractere, p.vivo);
						return;
					}
				}else if(i == 1 && j > 2 && j < 6){
					if(Tabuleiro[i][j] == null) {
						Tabuleiro[i][j] = new peca(p.caractere, p.vivo);
						return;
					}
				}else if(i == 3 | i == 4 | i == 5) {
					if(Tabuleiro[i][j] == null) {
						Tabuleiro[i][j] = new peca(p.caractere, p.vivo);
						return;
					}
				}
			}
		}			
	}
	
	
	 public void comer(char a, int b, char c, int d) {
		 int x = 0;
		 int y = 0;
		 if(a == 'a') {
			 x = 0;
		 }else if(a == 'b') {
			 x = 1;
		 }else if(a == 'c') {
			 x = 2;
		 }else if(a == 'd') {
			 x = 3;
		 }else if(a == 'e') {
			 x = 4;
		 }else if(a == 'f') {
			 x = 5;
		 }else if(a == 'g') {
			 x = 6;
		 } 
		 if(c == 'a') {
			 y = 0;
		 }else if(c == 'b') {
			 y = 1;
		 }else if(c == 'c') {
			 y = 2;
		 }else if(c == 'd') {
			 y = 3;
		 }else if(c == 'e') {
			 y = 4;
		 }else if(c == 'f') {
			 y = 5;
		 }else if(c == 'g') {
			 y = 6;
		 }
		 System.out.println("Source: " + a + "" + b);
		 System.out.println("Target: " + c + "" + d);
		 
		 if(x == y) {
			if(d > b) {
				/*codigo para comer para cima*/
				if(b <= 2 | d >= 6 ) {
					Tabuleiro[b][x+1].vivo = 0; //posiçao inicial "morre"
					Tabuleiro[b][x+1].caractere = '-'; //muda o caractere da posiçao inicial
					Tabuleiro[d][x].vivo = 1; //posiçao final "vive"
					Tabuleiro[d][x].caractere = 'p'; // muda o caractere da posiçao final
					Tabuleiro[d-1][x+1].vivo = 0; //posiçao da peça q foi "comida"
					Tabuleiro[d-1][x+1].caractere = '-'; // muda o caractere da posiçao "comida"
				}else {
					Tabuleiro[b][x].vivo = 0; //posiçao inicial "morre"
					Tabuleiro[b][x].caractere = '-'; //muda o caractere da posiçao inicial
					Tabuleiro[d][x].vivo = 1; //posiçao final "vive"
					Tabuleiro[d][x].caractere = 'p'; // muda o caractere da posiçao final
					Tabuleiro[d-1][x].vivo = 0; //posiçao da peça q foi "comida"
					Tabuleiro[d-1][x].caractere = '-'; // muda o caractere da posiçao "comida"
				}
			}else if(b > d) {
				/*codigo para comer para baixo*/
				if(b >= 6 | d <= 2 ) {
					Tabuleiro[b][x+1].vivo = 0; //posiçao inicial "morre"
					Tabuleiro[b][x+1].caractere = '-'; //muda o caractere da posiçao inicial
					Tabuleiro[d][x].vivo = 1; //posiçao final "vive"
					Tabuleiro[d][x].caractere = 'p'; // muda o caractere da posiçao final
					Tabuleiro[b-1][x].vivo = 0; //posiçao da peça q foi "comida"
					Tabuleiro[b-1][x].caractere = '-'; // muda o caractere da posiçao "comida"
				}else {
					Tabuleiro[b][x].vivo = 0; //posiçao inicial "morre"
					Tabuleiro[b][x].caractere = '-'; //muda o caractere da posiçao inicial
					Tabuleiro[d][x].vivo = 1; //posiçao final "vive"
					Tabuleiro[d][x].caractere = 'p'; // muda o caractere da posiçao final
					Tabuleiro[b-1][x].vivo = 0; //posiçao da peça q foi "comida"
					Tabuleiro[b-1][x].caractere = '-'; // muda o caractere da posiçao "comida"
				}
			}
		 }else if(b == d) {
			 if(x > y) {
				 /*codigo para comer para esquerda*/
				Tabuleiro[d][x].vivo = 0; //posiçao inicial "morre"
				Tabuleiro[d][x].caractere = '-'; //muda o caractere da posiçao inicial
				Tabuleiro[d][y].vivo = 1; //posiçao final "vive"
				Tabuleiro[d][y].caractere = 'p'; // muda o caractere da posiçao final
				Tabuleiro[d][y+1].vivo = 0; //posiçao da peça q foi "comida"
				Tabuleiro[d][y+1].caractere = '-'; // muda o caractere da posiçao "comida" 	 
			 }else if(y > x) {
				 /*codigo para comer para direita*/
				Tabuleiro[b][x].vivo = 0; //posiçao inicial "morre"
				Tabuleiro[b][x].caractere = '-'; //muda o caractere da posiçao inicial
				Tabuleiro[b][y].vivo = 1; //posiçao final "vive"
				Tabuleiro[b][y].caractere = 'p'; // muda o caractere da posiçao final
				Tabuleiro[b][x+1].vivo = 0; //posiçao da peça q foi "comida"
				Tabuleiro[b][x+1].caractere = '-'; // muda o caractere da posiçao "comida" 	  
			 }
		 }
		 mostrar();
		 
	 }
	
	
	public void mostrar() {
		for(int i = 7; i > 0; i--) {
			System.out.print(i + " ");
			if(i == 7 | i == 6 | i == 2 | i == 1) {
				System.out.print(" ");
			}
			for(int j = 0; j < 7; j++) {
				if(Tabuleiro[i][j] != null) {
					if(Tabuleiro[i][j].vivo == 0) {
						System.out.print("-");
					}else {
						System.out.print(Tabuleiro[i][j].caractere);
					}
				}
				System.out.print(' ');
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g");
		System.out.println();
	}

}
