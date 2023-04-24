package view;

import javax.swing.JOptionPane;

import controller.SomaController;

public class Main {

	public static void main(String[] args) {
		
		SomaController control = new SomaController();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
		
		int resultado = control.SomaNatural(n);
		System.out.println(resultado);
		

	}

}
