import java.util.Scanner;
import java.util.Stack;

// Não é necessario a utilização de Pilhas para resolver esse Problema de
// Palindromos, na função "palindromo" poderiamo apenas comparar com o texto
// sem a necessidade de pegar caracter por caracter.
public class Palindromo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um Palavra: ");
        String texto = scan.nextLine();

        if (palindromo(texto)) {
            System.out.println("É um Palindromo");
        } else {
            System.out.println("Não é um Palindromo");
        }

        scan.close();
    }

    // String é um Array de Caracteres, ou seja conseguimos acessar cada um
    // .lenght, nós revela a quantidade de caracteres em um String
    public static boolean palindromo(String texto){

        Stack<Character> stackChar = new Stack<>();

        for (int i = 0; i < texto.length(); i++){
            stackChar.push(texto.charAt(i)); // CharAt, obtemos um caractere especifo de uma posição passada como parametro
        }

        // Declaramos uma String Vazia para que depois possamos concatenar
        // e depois fazemos a verificação.
        String palavraAoContrario = "";

        // Enquanto o stackChar for falso, a palavraAoContrario recebe caractere
        // por caractere até forma a String completa.
        // Obs: o .pop retorna o ultimo elemento da pilha sendo possivel fazer
        // essa concatenação, tambem é possivel utilizar em tipos primitivos
        while (!stackChar.isEmpty()) {
            palavraAoContrario += stackChar.pop();
        }

        // Caso a palavraAoContario for igual o texo ele me retorna um boleano
        if (palavraAoContrario.equalsIgnoreCase(texto)) {
            return true;
        }
        return false;
    }
}
