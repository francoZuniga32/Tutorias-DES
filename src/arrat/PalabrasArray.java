package arrat;

public class PalabrasArray {
	public static int contarPalabras(String oracion) {
		int contador = 1;
		for(int i=0; i < oracion.length(); i++) {
			if(oracion.charAt(i) == ' ' ) {
				contador ++;
			}
		}
		return contador;
	}
	
	public static String[] sacarPalabra(String oracion) {
		String[] retorno = new String[2];
		int i = 0; 
		boolean control = true;
		while(i < oracion.length() && control) {
			if(oracion.charAt(i) == ' ') {
				retorno[0] = oracion.substring(0, i);
				retorno[1] = oracion.substring(i+1, oracion.length());
				control = false;
			}
			i++;
		}
		if(control){
			retorno[0] = oracion;
			retorno[1] = "";
		}
		return retorno;
	}
	
	public static void main(String[] args) {
		String oracion = "hola mundo pepe come";
		String[][] arrayPalabras = new String[2][2];
		
		for(int i = 0; i < arrayPalabras.length; i++) {
			for(int j = 0; j < arrayPalabras[0].length; j++) {
				String[] palabrasSeparadas = sacarPalabra(oracion);
				arrayPalabras[i][j] = palabrasSeparadas[0];
				oracion = palabrasSeparadas[1];
			}
		}
		
		for(int k = 0; k < arrayPalabras.length; k++) {
			for(int l = 0; l < arrayPalabras[0].length; l ++) {
				System.out.print(arrayPalabras[k][l]);
			}
			System.out.print("\n");
		}
	}
}
