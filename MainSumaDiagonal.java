
public class MainSumaDiagonal {

	public static void main(String[] args) {
		int dm=4;
		SumaDiagonal matriz1 = new SumaDiagonal(dm);
        matriz1.setValor(0, 0, 1);
        matriz1.setValor(0, 1, 2);
        matriz1.setValor(0, 2, 3);
        matriz1.setValor(1, 0, 4);
        matriz1.setValor(1, 1, 5);
        matriz1.setValor(1, 2, 6);
        matriz1.setValor(2, 0, 7);
        matriz1.setValor(2, 1, 8);
        matriz1.setValor(2, 2, 9);
        matriz1.setValor(3, 3, 10);



        System.out.println("Matriz:");
        for (int i = 0; i < dm; i++) {
            for (int j = 0; j < dm; j++) {
                System.out.print(matriz1.getValor(i, j) + " ");
            }
            System.out.println();
        }
        System.out.println("Suma de la diagonal principal: " + matriz1.sumaDiagonalPrincipal());
    }
	}


