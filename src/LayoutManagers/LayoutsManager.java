package LayoutManagers;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class LayoutsManager extends JFrame{
	
	public LayoutsManager(String title) {
		
		JPanel radioPanel = new JPanel();
		JPanel panelCont = new JPanel();
		JPanel panelBtns = new JPanel();
		JPanel panelPicture = new JPanel();
		JPanel panelCont2 = new JPanel();
		
		// se crean los radio buttons
		JRadioButton opcion1 = new JRadioButton("Opcion1");
		opcion1.setMnemonic(KeyEvent.VK_B);
		opcion1.setSelected(true);

        JRadioButton opcion2 = new JRadioButton("Opcion2");
        opcion2.setMnemonic(KeyEvent.VK_C);

        JRadioButton opcion3 = new JRadioButton("Opcion3");
        opcion3.setMnemonic(KeyEvent.VK_D);

        JRadioButton opcion4 = new JRadioButton("Opcion4");
        opcion4.setMnemonic(KeyEvent.VK_R);

        JRadioButton opcion5 = new JRadioButton("Opcion5");
        opcion5.setMnemonic(KeyEvent.VK_P);
        
        // se crea el grupo botones
        ButtonGroup btgOpciones = new ButtonGroup();

        btgOpciones.add(opcion1);
        btgOpciones.add(opcion2);
        btgOpciones.add(opcion3);
        btgOpciones.add(opcion4);
        btgOpciones.add(opcion5);
        
        JLabel picture = new JLabel(new ImageIcon("src/loro.png"));
        
        // se crean los botones aceptar, cancelar
        JButton btnAceptar = new JButton("Aceptar");
        JButton btnCancelar = new JButton("Cancelar");
        
        // se agregan componentes al panel "radioPanel"
        radioPanel.setLayout(new GridLayout(0,1));
        radioPanel.add(opcion1);
        radioPanel.add(opcion2);
        radioPanel.add(opcion3);
        radioPanel.add(opcion4);
        radioPanel.add(opcion5);
        radioPanel.setBackground(Color.GREEN);
        
        // se agrega la imagen al panel "panelPicture"
        panelPicture.add(picture);
        panelPicture.setBackground(Color.BLACK);
        
        panelBtns.add(btnAceptar);
        panelBtns.add(btnCancelar);
        
        panelCont.add(radioPanel);
        panelCont.add(panelPicture);
        
        panelCont2.add(panelCont,BorderLayout.CENTER);
        panelCont2.add(panelBtns,BorderLayout.SOUTH);
        
        getContentPane().add(panelCont2);
        
	}

	public static void main(String[] args) {
		WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };

        JFrame frame = new LayoutsManager("Curso de Java: Agrupar Botones");
        frame.addWindowListener(l);

        frame.pack();
        frame.setVisible(true);
	}

}
