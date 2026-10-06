package com.mycompany.exercicio_while_7;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int quantidade = 0;
        int soma =0;
        int num = Integer.parseInt(JOptionPane.showInputDialog("digite um numero inteiro posiivo ou -1 para finalizar"));
        while(num != -1){
            soma =soma+num;
            quantidade++;
            num = Integer.parseInt(JOptionPane.showInputDialog("digite um numero inteiro posiivo ou -1 para finalizar"));
        }
        JOptionPane.showMessageDialog(null,"quantidade: " + quantidade);
        JOptionPane.showMessageDialog(null,"soma: " + soma);
    }
}