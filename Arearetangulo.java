import javax.swing.JOptionPane;

public class Arearetangulo {
    public static void main(String[] args) {
        int a, b, d;

        a = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o valor de a: ",
                "Entrada de Dados", JOptionPane.QUESTION_MESSAGE));
        b = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o valor de b: ",
                "Entrada de Dados", JOptionPane.QUESTION_MESSAGE));
        d = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o valor de d: ",
                "Entrada de Dados", JOptionPane.QUESTION_MESSAGE));

        CalculaArea(a, b, d);
    }

    static void CalculaArea(int a, int b, int d) {
        int area1 = a * b;
        int area2 = d * b;
        int areatotal = area1 + area2;
        JOptionPane.showMessageDialog(null, "A área do retângulo superior (A1) é: " + area1 + " cm³ "
                + "\nA área do retângulo inferior (A2) é: " + area2 + " cm³ "
                + "\nA área total dos retângulos é: " + areatotal + " cm³ ",
                "Saida de Dados", JOptionPane.INFORMATION_MESSAGE);
    }
}
