package esercizio03;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    System.out.println("Inserisci un numero da convertire in binario");
    int numero = scanner.nextInt();


    String binario = Integer.toBinaryString(numero);
    System.out.println("Rappresentazione binaria: " + binario);

    String complementoUno = calcolaComplementoUno(binario);
    System.out.println("Complemento a uno: " + complementoUno);

    String complementoDue = calcolaComplementoDue(complementoUno);
	}

private static String calcolaComplementoUno(String binario) {
    String complementoUno = "";

    for (char bit : binario.toCharArray()) {
        if (bit == '0') {
            complementoUno += '1';
        } else if (bit == '1') {
            complementoUno += '0';
        }
    }

    return complementoUno;
}

private static String calcolaComplementoDue(String complementoUno) {
    String complementoDue = "";

    for (int i = 0; i < complementoUno.length(); i++) {
        if (i == complementoUno.length() - 1) {
            if (complementoUno.charAt(i) == '1') {
                complementoDue += '0';
            } else {
                complementoDue += '1';
            }
        } else {
            complementoDue += complementoUno.charAt(i);
        }
    }
    return complementoDue;
}
}
