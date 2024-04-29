import javax.swing.*;
public class Swinng{

    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Qual seu Nome?");
        String output = name + " nome bosta hein?!";
        JOptionPane.showMessageDialog(null, output);
    }
    
}