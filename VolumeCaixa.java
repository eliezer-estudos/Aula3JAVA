import javax.swing.JOptionPane;

public class VolumeCaixa {
    public static void main(String[] args) {
        int largura, altura, profundidade;

        largura = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite a largura da caixa (em cm): ",
                "Entrada de Dados", JOptionPane.QUESTION_MESSAGE));
        altura = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite a altura da caixa (em cm): ",
                "Entrada de Dados", JOptionPane.QUESTION_MESSAGE));
        profundidade = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite a profundidade da caixa (em cm): ",
                "Entrada de Dados", JOptionPane.QUESTION_MESSAGE));

        calculaVolume(largura, altura, profundidade);

    }

    static void calculaVolume(int largura, int altura, int profundidade) {
        int volume = largura * altura * profundidade;
        JOptionPane.showMessageDialog(null,
                "O volume da caixa é: " + volume + " cm³",
                "Saída de Dados", JOptionPane.INFORMATION_MESSAGE);
    }
}
