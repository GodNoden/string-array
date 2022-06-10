import java.util.Random;


public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arreglo;
		Random random = new Random();
		int aleatorio = random.nextInt(100);
		arreglo = new char[aleatorio];
		
		
		for(int i = 0; i < aleatorio; i++) {
			arreglo[i] = (char) random.nextInt(65,91); // 1.	Crear un arreglo de caracteres de forma aleatoria con puras letras Mayúsculas.
			System.out.print(arreglo[i]); //10.	imprimir primero el arreglo original, luego el arreglo corregido.c
		}
		
		System.out.println("");
		arregloCaracteres(arreglo); //7.	el método reciba al menos el parámetro arreglo
		for(int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i]);// 8.	justo después de salir de la subrutina, se imprima el contenido del arreglo de caracteres
		}
	}
	
	public static void arregloCaracteres(char[] arreglo) {//2.	Crear un método que reciba un parámetro arreglo de caracteres.
		String cadenaX = "IMPRIMIR"; // 4.	Esta cadena X contenga puras Mayúsculas y sea menor al arreglo de caracteres.
		if (cadenaX.length() > arreglo.length) {
			System.out.println("Arreglo muy pequeño");
		}
		else {
			for(int i = 0, j = 0; i < arreglo.length; i++,j++) { //3.	el método copie en dicho arreglo el contenido de una cadena X
					if(j==cadenaX.length()) {
						j=0;
						int restante = arreglo.length - i;
						if(restante < cadenaX.length()) {
							for(int k = i; k < arreglo.length; k++) {
								arreglo[k] = ' ';
							}
							break;
						}
					}
				arreglo[i] = cadenaX.charAt(j);	//5.	copiar en el arreglo la cadena, tantas veces como quepa completa
			}
		}
		
	}

}
