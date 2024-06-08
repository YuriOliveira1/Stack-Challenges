import java.util.Scanner;
import java.util.Stack;

public class Binario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual número decimal voce quer converter? ");
        int numeroDecimal = scan.nextInt();
        System.out.println("Convetido em Binario " + converteEmBinario(numeroDecimal));

        scan.close();
    }

    public static String converteEmBinario(int numeroDecimal) {
        int divisor = 2;
        int resto;
        String numeroBinario = "";

        Stack<Integer> stackBinarios = new Stack<>();

        while (numeroDecimal > 0) {
            resto = numeroDecimal % divisor;
            stackBinarios.push(resto);
            numeroDecimal /= 2;
        }

        while (!stackBinarios.isEmpty()) {
            numeroBinario += stackBinarios.pop();
        }
        
        return numeroBinario;
    }
}
