package LayoutManagers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class layoutManager extends JFrame implements ActionListener{
	
	private JButton btn,btn1;
	
	public layoutManager(String titulo) {
		
		Container GCP = getContentPane();
		JPanel panel1 = new JPanel();
		JPanel radioPanel = new JPanel();
		JPanel panelPicture = new JPanel();
		JPanel panel2 = new JPanel();
		
        //Creación de los RadioButtons
        JRadioButton birdButton = new JRadioButton("Pajarito");
        birdButton.setMnemonic(KeyEvent.VK_B);
        birdButton.setActionCommand("bird");
        birdButton.setSelected(true);

        JRadioButton catButton = new JRadioButton("Gatito");
        catButton.setMnemonic(KeyEvent.VK_C);
        catButton.setActionCommand("cat");

        JRadioButton dogButton = new JRadioButton("Perrito");
        dogButton.setMnemonic(KeyEvent.VK_D);
        dogButton.setActionCommand("dog");

        JRadioButton rabbitButton = new JRadioButton("Conejito");
        rabbitButton.setMnemonic(KeyEvent.VK_R);
        rabbitButton.setActionCommand("rabbit");

        JRadioButton pigButton = new JRadioButton("Cerdito");
        pigButton.setMnemonic(KeyEvent.VK_P);
        pigButton.setActionCommand("pig");

        // se agreg1an los JRadioButton al ButtonsGroup
        ButtonGroup btgAnimalitos = new ButtonGroup();

        btgAnimalitos.add(birdButton);
        btgAnimalitos.add(catButton);
        btgAnimalitos.add(dogButton);
        btgAnimalitos.add(rabbitButton);
        btgAnimalitos.add(pigButton);

        JLabel picture = new JLabel(new ImageIcon("src/loro.png"));
        
        // agregando un layout al radioPanel y añadiendo los componentes al radioPanel
        radioPanel.setLayout(new GridLayout(0,1));
        radioPanel.add(birdButton);
        radioPanel.add(catButton);
        radioPanel.add(dogButton);
        radioPanel.add(rabbitButton);
        radioPanel.add(pigButton);
        // asignando un color al radioPanel
        radioPanel.setBackground(Color.GREEN);
        
        //creando  los botones
        btn = new JButton("Aceptar");
        btn1 = new JButton("Cancelar");
        
        // agregando los botones al panel2
        panel2.add(btn);
        panel2.add(btn1);
        
        // agragando la imagen al panelPicture
        panelPicture.add(picture);
        
        // agrgando radioPanel y panelPicture al panel1
        panel1.add(radioPanel);
        panel1.add(panelPicture);
        
        // agrgando el panel1 y panel2 al panel principal
        GCP.add(panel1, BorderLayout.CENTER);
        GCP.add(panel2, BorderLayout.SOUTH);

        GCP.setBackground(Color.BLUE);

        pack();

        setTitle(titulo);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Evento producido por " + e.getActionCommand());
    }

	public static void main(String[] args) {
		 WindowListener l = new WindowAdapter() {
	            public void windowClosing(WindowEvent e) {
	                System.exit(0);
	            }
	        };

	        JFrame frame = new layoutManager("Curso de Java: Agrupar Botones");
	        frame.addWindowListener(l);

	        frame.pack();
	        frame.setVisible(true);

	}

}
