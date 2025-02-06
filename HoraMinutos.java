import javax.swing.JOptionPane;

public class HoraMinutos {
    public static void main(String[] args){
        int hora, minutos;

        hora = Integer.parseInt(JOptionPane.showInputDialog(null,
         "Digite as horas: ",
          "Entrada de Dados", JOptionPane.QUESTION_MESSAGE));
        minutos = Integer.parseInt(JOptionPane.showInputDialog(null,
         "Digite os minutos: ",
          "Entrada de Dados", JOptionPane.QUESTION_MESSAGE));

        calculaHoraMinutos(hora, minutos);
    }

    static void calculaHoraMinutos(int hora,  int minutos){
        int totalMinutos = (hora * 60) + minutos;
        JOptionPane.showMessageDialog(null,
         "Se passaram " + totalMinutos + " minutos desde o inicio do dia!",
          "Saida de Dados", JOptionPane.INFORMATION_MESSAGE);
    }
}
