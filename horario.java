package aulaMtodo;

public class horario {
	public static void horas(int h) {
		switch (h) {
		case 5 :
		case 6 :
		case 7 :
		case 8 :
		case 9 :
		case 10 :
		case 11 :
		case 12 :
			mensagemBomdia();
			break;
			
		case 13 :
		case 14 :
		case 15 :
		case 16 :
		case 17 :
		
		
			mensagemboaTarde();
			
			break;
		case 18 :
		case 19 :
		case 20 :
		case 21 :
		case 22 :
		case 23 :
		case 00 :	
			mensagemBoanoite();
			
			break;
		case 1 :
		case 2 :
		case 3 :
		case 4 :
			mensagemBoamagrugada();
			
			break;
			
			default: 
			
			System.out.println("Hora invalida!!");
			
		}
		

	}

	private static void mensagemBoamagrugada() {
		
		System.out.println("Boa Madrugada");
	}

	private static void mensagemBoanoite() {
		System.out.println("Boa noite");
		
	}

	private static void mensagemboaTarde() {
		System.out.println("Boa Tarde");
	}

	private static void mensagemBomdia() {
		System.out.println("Bom Dia");
		
	}
}
