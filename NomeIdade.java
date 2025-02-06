import javax.swing.JOptionPane;

public class NomeIdade {
    public static void main(String[] args) {
        String nome;
        int idade;

        nome = JOptionPane.showInputDialog(null, "Digite seu nome: ",
                "Entra de Dados",
                JOptionPane.QUESTION_MESSAGE);

        idade = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite sua idade: ",
                "Entrada de Dados", JOptionPane.QUESTION_MESSAGE));
                
        exibirMensagem(nome, idade);
    }

    static void exibirMensagem(String texto, int numero) {
        JOptionPane.showMessageDialog(null,
                "Nome: " + texto
                        + "\nIdade: " + numero,
                "Saída de Dados", JOptionPane.INFORMATION_MESSAGE);
    }
}
