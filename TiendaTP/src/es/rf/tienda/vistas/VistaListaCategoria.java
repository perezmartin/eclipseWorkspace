package es.rf.tienda.vistas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import es.rf.tienda.dominio.Categoria;

public class VistaListaCategoria {
	public static void main(String[] args) {
		JFrame app = new JFrame("VistaListadoCategoria");
		app.setSize(1000, 300);
		app.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		
		JScrollPane scrollPane = new JScrollPane(panel);
		
		JButton botonAdd = new JButton("Agregar");
		
		JLabel texto = new JLabel("listado categorias");
		
		Categoria cat1 = new Categoria(0,"categoria 1","esta es la categoria 1");
		Categoria cat2 = new Categoria(1,"categoria 2","esta es la categoria 2");
		Categoria cat3 = new Categoria(2,"categoria 3","esta es la categoria 3");
		
		Categoria[] data= {cat1,cat2,cat3};		
		
		JList<Categoria> listaCategorias = new JList<Categoria>(data);
		
		listaCategorias.addMouseListener( new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					System.out.println("Ir a VistaCategoriaEditar solo si tiene permisos de edicion");
					
				}
				
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		botonAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ir a nuevaCategoriaVista");
			}
			
		});
				
		panel.add(texto);
		panel.add(botonAdd);
		panel.add(listaCategorias);
		
		
		app.add( scrollPane);
		app.setVisible(true);
	}
}