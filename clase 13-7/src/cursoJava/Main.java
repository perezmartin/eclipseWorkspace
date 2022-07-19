package cursoJava;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		JFrame app = new JFrame("app");
		app.setSize(300, 300);
		app.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		
		JButton boton1 = new JButton("ROJO");
		JButton boton2 = new JButton("VERDE");
		JButton boton3 = new JButton("AZUL");
		JButton boton4 = new JButton("NEGRO");
		
		boton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.RED);
			}
			
		});
		boton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.GREEN);
			}
			
		});
		boton3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.BLUE);
			}
			
		});
		boton4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.BLACK);
			}
			
		});
		
		
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);
		panel.add(boton4);
		
		app.add(panel);
		app.setVisible(true);
		
	}
}