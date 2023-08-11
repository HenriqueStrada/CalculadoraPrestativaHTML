package com.example.calculadora_prestativa;
import javax.swing.*;
import javax.swing.JFrame;

public class Calculadora{
    public static double[] pegaValores(){
        double[] numeros = new double[2];
        String valorUm = JOptionPane.showInputDialog("Digite o primeiro valor:");
        numeros[0] = Double.parseDouble(valorUm);
        String valorDois = JOptionPane.showInputDialog("Digite o segundo valor:");
        numeros[1] = Double.parseDouble(valorDois);
        return numeros;
    }
    public static int pergunteRefaz() {
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja refazer?", "Refazer", JOptionPane.YES_NO_OPTION);
        int refazer = 0;
        if (opcao == JOptionPane.YES_OPTION) {
            refazer = 1;
        }
        return refazer;
    }
    public static void mostrarImagem() {
        JFrame frame = new JFrame("Eu sabo muito, vdd manja dms mlk");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon imageIcon = new ImageIcon("src/main/resources/EuSabo.jpg");
        JLabel label = new JLabel(imageIcon);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {

        int respostanum = 0;
        int refazer = 1;
        System.out.println("Bem-Vindo a calculadora");
        System.out.println("Link do gitHub: https://github.com/HenriqueStrada/CalculadoraEuSabo");
        while(refazer == 1){
        System.out.println("""
                Selecione o tipo de calculadora que você quer:
                (1) Soma.
                (2) Subtração.
                (3) Multiplicação.
                (4) Divisão.
                (5) Raiz.
                """);

        String resposta = JOptionPane.showInputDialog("Responda qual conta quer fazer:");
        respostanum = Integer.parseInt(resposta);

        if(respostanum == 1){
            double[] numeros = pegaValores();
            System.out.println("O resultado da soma é: " + (numeros[0]+ numeros[1]));
            mostrarImagem();
            System.out.println("Link do gitHub: https://github.com/HenriqueStrada/CalculadoraEuSabo");
            int refazerres = pergunteRefaz();
            if (refazerres == 1) {refazer = 1;} else {refazer = 0;}
        } else if (respostanum == 2){
            double[] numeros = pegaValores();
            System.out.println("O resultado da subtração é: " + (numeros[0] - numeros[1]));
            mostrarImagem();
            System.out.println("Link do gitHub: https://github.com/HenriqueStrada/CalculadoraEuSabo");
            int refazerres = pergunteRefaz();
            if (refazerres == 1) {refazer = 1;} else {refazer = 0;}
        } else if (respostanum == 3){
            double[] numeros = pegaValores();
            System.out.println("O resultado da multiplicação é: " + (numeros[0] * numeros[1]));
            mostrarImagem();
            System.out.println("Link do gitHub: https://github.com/HenriqueStrada/CalculadoraEuSabo");
            int refazerres = pergunteRefaz();
            if (refazerres == 1) {refazer = 1;} else {refazer = 0;}
        } else if (respostanum == 4){
            double[] numeros = pegaValores();
            System.out.println("O resultado da divisão é: " + (numeros[0] / numeros[1]));
            mostrarImagem();
            System.out.println("Link do gitHub: https://github.com/HenriqueStrada/CalculadoraEuSabo");
            int refazerres = pergunteRefaz();
            if (refazerres == 1) {refazer = 1;} else {refazer = 0;}
        } else if (respostanum == 5) {
            String valorUm = JOptionPane.showInputDialog("Digite o valor do numero que quer descobrir a raiz:");
            int raiz = Integer.parseInt(valorUm);
            System.out.println("A raiz de " + raiz + " é: " + Math.sqrt(raiz));
            mostrarImagem();
            System.out.println("Link do gitHub: https://github.com/HenriqueStrada/CalculadoraEuSabo");
            int refazerres = pergunteRefaz();
            if (refazerres == 1) {refazer = 1;} else {refazer = 0;}
        } else {
            System.out.println("Coloque um valor valido!");
            mostrarImagem();
            System.out.println("Link do gitHub: https://github.com/HenriqueStrada/CalculadoraEuSabo");
            refazer = 1;
            }
        }
        System.out.println("Link do gitHub: https://github.com/HenriqueStrada/CalculadoraEuSabo");
    }
}

