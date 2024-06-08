import java.util.Stack;

public class Hanoi {
    public static void main(String[] args) {
        Stack<Integer> base = new Stack<>();
        Stack<Integer> objetivo = new Stack<>();
        Stack<Integer> auxiliar = new Stack<>();

        base.push(3);
        base.push(2);
        base.push(1);

        Hanoi(base.size(), base, objetivo, auxiliar);
    }

    public static void Hanoi(int n, Stack<Integer> base, Stack<Integer> objetivo,
            Stack<Integer> auxiliar) {

        if (n > 0) {
            Hanoi(n-1, base, auxiliar, objetivo);
            objetivo.push(base.pop());
            System.out.println(">>>>>>>>>");
            System.out.println("Base: " + base);
            System.out.println("Objetivo: " + objetivo);
            System.out.println("Auxiliar: " + auxiliar);

            Hanoi(n-1, auxiliar, objetivo, base);
        }
    }
}
