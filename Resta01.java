/*Resta01*/


package padrao;

public class Resta01 {
	public static void main(String[] args) {
		Tabuleiro tab = new Tabuleiro();
		System.out.println("Tabuleiro inicial:");
		peca x1 = new peca('p', 1);
		peca x2 = new peca('p', 1);
		peca x3 = new peca('p', 1);
		peca x4 = new peca('p', 1);
		peca x5 = new peca('p', 1);
		peca x6 = new peca('p', 1);
		peca x7 = new peca('p', 1);
		peca x8 = new peca('p', 1);
		peca x9 = new peca('p', 1);
		peca x10 = new peca('p', 1);
		peca x11 = new peca('p', 1);
		peca x12 = new peca('p', 1);
		peca x13 = new peca('p', 1);
		peca x14 = new peca('p', 1);
		peca x15 = new peca('p', 1);
		peca x16 = new peca('p', 1);
		peca x17 = new peca('-', 0);
		peca x18 = new peca('p', 1);
		peca x19 = new peca('p', 1);
		peca x20 = new peca('p', 1);
		peca x21 = new peca('p', 1);
		peca x22 = new peca('p', 1);
		peca x23 = new peca('p', 1);
		peca x24 = new peca('p', 1);
		peca x25 = new peca('p', 1);
		peca x26 = new peca('p', 1);
		peca x27 = new peca('p', 1);
		peca x28 = new peca('p', 1);
		peca x29 = new peca('p', 1);
		peca x30 = new peca('p', 1);
		peca x31 = new peca('p', 1);		
		peca x32 = new peca('p', 1);
		peca x33 = new peca('p', 1);
		
		tab.adcPeca(x1);
		tab.adcPeca(x2);
		tab.adcPeca(x3);
		tab.adcPeca(x4);
		tab.adcPeca(x5);
		tab.adcPeca(x6);
		tab.adcPeca(x7);
		tab.adcPeca(x8);
		tab.adcPeca(x9);
		tab.adcPeca(x10);
		tab.adcPeca(x11);
		tab.adcPeca(x12);
		tab.adcPeca(x13);
		tab.adcPeca(x14);
		tab.adcPeca(x15);
		tab.adcPeca(x16);
		tab.adcPeca(x17);
		tab.adcPeca(x18);
		tab.adcPeca(x19);
		tab.adcPeca(x20);
		tab.adcPeca(x21);
		tab.adcPeca(x22);
		tab.adcPeca(x23);
		tab.adcPeca(x24);
		tab.adcPeca(x25);
		tab.adcPeca(x26);
		tab.adcPeca(x27);
		tab.adcPeca(x28);
		tab.adcPeca(x29);
		tab.adcPeca(x30);
		tab.adcPeca(x31);
		tab.adcPeca(x32);
		tab.adcPeca(x33);
	
		tab.mostrar();
		
		
		CSVReader csv = new CSVReader();
		csv.setDataSource(""); /*Basta escolher a pasta com os comandos*/
		String commands[] = csv.requestCommands();
		for(int i = 0; i < commands.length ; i++) {
			for(int j = 0; j < commands[i].length(); j++) {
				char[] comando = new char[j];
				comando[j] = commands[i].charAt(0);
				tab.comer(comando[1], (int)(comando[2]), comando[3], (int)(comando[4]));
			}
		}
		
		/*
		tab.comer('f', 4, 'd', 4);
		tab.comer('c', 4, 'e', 4);
		tab.comer('d', 2, 'd', 4);
		tab.comer('d', 5, 'd', 3);    
		tab.comer('a', 4, 'c', 4);   Testes
		tab.comer('b', 5, 'd', 5);
		tab.comer('d', 6, 'd', 4);	
		tab.comer('d', 3, 'd', 5);
		tab.comer('b', 3, 'd', 3);
		tab.comer('c', 1, 'c', 3);
		tab.comer('g', 3, 'e', 3);
		*/
	}

}
