package aulaMtodo;

public class Main {

	/*Calculos*/
	public static void main(String[] args) {
		System.out.println("------OPERAÇÕES MATEMATICA------");
		calculo.soma(5, 3);
		
		calculo.subtração(5,2);
		
		calculo.divisão(15, 3);
		
		calculo.multiplicação(5, 3);
		
		/*Horas*/
		System.out.println("-----------HORAS------------");
		horario.horas(4);
		horario.horas(10);
		horario.horas(15);
		horario.horas(20);
		
		/*Emprestimo*/
		System.out.println("-----------EMPRETISMO------------");
		emprestimo.calcular(1000, emprestimo.getDuasParcelas());
		emprestimo.calcular(1000, emprestimo.getTresParcelas());
		emprestimo.calcular(1000, 5);

	}

}

