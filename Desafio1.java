import javax.swing.JOptionPane;

public class Desafio1 {
    public static void main(String[] args) {
        int valor1, valor2, valor3;

        valor1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o primeiro valor: ",
                "Entrada de Dados", JOptionPane.QUESTION_MESSAGE));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o segundo valor: ",
                "Entrada de Dados", JOptionPane.QUESTION_MESSAGE));
        valor3 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o terceiro valor: ",
                "Entrada de Dados", JOptionPane.QUESTION_MESSAGE));

        CalcularMedia(valor1, valor2, valor3);

    }

    static void CalcularMedia(int valor1, int valor2, int valor3) {
        int media = (valor1 + valor2 + valor3) / 3;
        JOptionPane.showMessageDialog(null,
                "A média dos valores " + valor1 + ", " + valor2 + " e " + valor3 + " é: " + media,
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}