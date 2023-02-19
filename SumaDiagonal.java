
public class SumaDiagonal {
	private int[][] valores;
    private int dimension;

    public SumaDiagonal(int dimension) {
    	 this.dimension = dimension;
         this.valores = new int[dimension][dimension];
    }

    public int getDimension() {
        return dimension;
    }

    public int getValor(int fila, int columna) {
        return valores[fila][columna];
    }

    public void setValor(int fila, int columna, int valor) {
        valores[fila][columna] = valor;
    }
    
    public int sumaDiagonalPrincipal() {
        int suma = 0;
        for (int i = 0; i < dimension; i++) {
            suma += getValor(i, i);
        }
        return suma;
    }
}
