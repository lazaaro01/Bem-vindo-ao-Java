import javax.swing.*;

public class NomeDialog {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual seu nome?" ); // Pede para o usuário inserir seu nome 
        String mensagem = String.format("Seja bem vindo, %s, ao Java!", nome); // Cria a mensagem 
        JOptionPane.showMessageDialog(null, mensagem);
    }
}