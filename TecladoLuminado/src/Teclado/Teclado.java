package Teclado;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.ArrayList;

public class Teclado {

	private JFrame frame;
	//ArrayList<JLabel> lista = new ArrayList<JLabel>();
	private String[] palabras = {"PERRO", "GATO", "CASA", "PELOTA", "LIBRO", "COMIDA", "AUTO", "JUEGO", "AMIGO", "TIEMPO"};
	
	Timer timer = new Timer();
	public static int segundos=0,minutos=0;
	public static JLabel lblNewLabel_1 = new JLabel("0");
	/**
	 * Launch the application.
	 */
	//
	JLabel teclaAnterior = null;
	boolean borrar=false;
	public static boolean iniciarTiempo=false;
	public static Teclado cronometro = new Teclado();
	boolean ent=false;
	JLabel lblNewLabel = new JLabel("Palabra");
	
	public static String palabra="";
	//public static String palabraEscrita="";
	public static String datos="";
	public static JLabel lblNewLabel_29 = new JLabel("Esperando...");
	//public static int posicion;
	 ArrayList<String> texto = new ArrayList<String>(); 
	public static void main(String[] args) {
		
		
		cronometro.iniciar();
	        
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				
					Teclado window = new Teclado();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		while(true) {

			lblNewLabel_1.setText("Tiempo:      "+minutos+" : "+segundos);
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			if(segundos>=60) {
				minutos++;
				segundos=0;
			}

		}
		
		
	}
	
	 TimerTask tarea = new TimerTask() {
	        public void run() {
	        	//	System.out.println("tiempo"+iniciarTiempo);
	        		if(iniciarTiempo==true) {
	        			
	        			 segundos++;
	 	 	            lblNewLabel_1.setText("Tiempo: "+segundos);
	 	 	            System.out.println(segundos);
	        		}
	        		
	        }
	    };

	    public void iniciar() {
	        timer.scheduleAtFixedRate(tarea, 1000, 1000);
	    }

	/**
	 * Create the application.
	 */
	
	private static String tecla;
	public Teclado() {
		initialize();

	}


	/**
	 * Initialize the contents of the frame.
	 */
	public void setPalabra() {
		Random rand = new Random();
		palabra=palabras[rand.nextInt(10)];
		
		lblNewLabel.setText(palabra);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
	}
	private void initialize() {
		setPalabra();
		frame = new JFrame();
		frame.setBounds(100, 100, 760, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(124, 252, 0));
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		panel.add(lblNewLabel);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_29 = new JLabel("Esperando...");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_29);
		

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(3, 9, 1, 1));

		
		JLabel lblNewLabel_3 = new JLabel("Q");
		lblNewLabel_3.setBackground(new Color(192, 192, 192));
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("W");
		lblNewLabel_2.setBackground(new Color(192, 192, 192));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("E");
		lblNewLabel_4.setBackground(new Color(192, 192, 192));
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("R");
		lblNewLabel_6.setBackground(new Color(192, 192, 192));
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_18 = new JLabel("T");
		lblNewLabel_18.setBackground(new Color(192, 192, 192));
		lblNewLabel_18.setOpaque(true);
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_18);
		
		JLabel lblNewLabel_7 = new JLabel("Y");
		lblNewLabel_7.setBackground(new Color(192, 192, 192));
		lblNewLabel_7.setOpaque(true);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("U");
		lblNewLabel_8.setBackground(new Color(192, 192, 192));
		lblNewLabel_8.setOpaque(true);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_5 = new JLabel("I");
		lblNewLabel_5.setBackground(new Color(192, 192, 192));
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_28 = new JLabel("O");
		lblNewLabel_28.setBackground(new Color(192, 192, 192));
		lblNewLabel_28.setOpaque(true);
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_28);
		
		JLabel lblNewLabel_10 = new JLabel("P");
		lblNewLabel_10.setBackground(new Color(192, 192, 192));
		lblNewLabel_10.setOpaque(true);
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_9 = new JLabel("A");
		lblNewLabel_9.setBackground(new Color(192, 192, 192));
		lblNewLabel_9.setOpaque(true);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_12 = new JLabel("S");
		lblNewLabel_12.setBackground(new Color(192, 192, 192));
		lblNewLabel_12.setOpaque(true);
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_12);
		
		
		JLabel lblNewLabel_14 = new JLabel("D");
		lblNewLabel_14.setBackground(new Color(192, 192, 192));
		lblNewLabel_14.setOpaque(true);
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_11 = new JLabel("F");
		lblNewLabel_11.setBackground(new Color(192, 192, 192));
		lblNewLabel_11.setOpaque(true);
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_13 = new JLabel("G");
		lblNewLabel_13.setBackground(new Color(192, 192, 192));
		lblNewLabel_13.setOpaque(true);
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_15 = new JLabel("H");
		lblNewLabel_15.setBackground(new Color(192, 192, 192));
		lblNewLabel_15.setOpaque(true);
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_15);
		
		JLabel lblNewLabel_17 = new JLabel("J");
		lblNewLabel_17.setBackground(new Color(192, 192, 192));
		lblNewLabel_17.setOpaque(true);
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_17);
		
		JLabel lblNewLabel_16 = new JLabel("K");
		lblNewLabel_16.setBackground(new Color(192, 192, 192));
		lblNewLabel_16.setOpaque(true);
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_16);
		
		JLabel lblNewLabel_19 = new JLabel("L");
		lblNewLabel_19.setBackground(new Color(192, 192, 192));
		lblNewLabel_19.setOpaque(true);
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Ñ");
		lblNewLabel_20.setBackground(new Color(192, 192, 192));
		lblNewLabel_20.setOpaque(true);
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Z");
		lblNewLabel_21.setBackground(new Color(192, 192, 192));
		lblNewLabel_21.setOpaque(true);
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("X");
		lblNewLabel_22.setBackground(new Color(192, 192, 192));
		lblNewLabel_22.setOpaque(true);
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("C");
		lblNewLabel_23.setBackground(new Color(192, 192, 192));
		lblNewLabel_23.setOpaque(true);
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("V");
		lblNewLabel_24.setBackground(new Color(192, 192, 192));
		lblNewLabel_24.setOpaque(true);
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("B");
		lblNewLabel_25.setBackground(new Color(192, 192, 192));
		lblNewLabel_25.setOpaque(true);
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("N");
		lblNewLabel_26.setBackground(new Color(192, 192, 192));
		lblNewLabel_26.setOpaque(true);
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("M");
		lblNewLabel_27.setBackground(new Color(192, 192, 192));
		lblNewLabel_27.setOpaque(true);
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_27);
		

		//PANEL BORRAR Y ESPACIO...........
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.CYAN);
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_p2 = new JLabel("ESPACIO");
		lblNewLabel_p2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_p2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_p2);
		
		JLabel lblNewLabel_p3 = new JLabel("BORRANDO");
		lblNewLabel_p3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_p3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_p3);
		

		Random rand = new Random();
		frame.addKeyListener(new KeyListener() {
			

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				
				// TODO Auto-generated method stub
				iniciarTiempo=true;
				if(ent==true) {
					teclaAnterior.setBackground(new Color(192, 192, 192));
					
				}
				ent=true;

				//
				 tecla =(KeyEvent.getKeyText(e.getKeyCode()));
				
				 int code =e.getKeyCode();
				 switch(tecla) {
				 case "Q":
					 lblNewLabel_3.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_3.setOpaque(true);
					teclaAnterior=lblNewLabel_3;
				 break;
				 case "W":
					 lblNewLabel_2.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_2.setOpaque(true);
					 teclaAnterior=lblNewLabel_2;
					
				 break;
				 case "E":
					 lblNewLabel_4.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_4.setOpaque(true);
					 teclaAnterior=lblNewLabel_4;
					
					
				 break;
				 case "R":
					 lblNewLabel_6.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_6.setOpaque(true);
					 teclaAnterior=lblNewLabel_6;
					
					
				 break;
				 case "T":
					 lblNewLabel_18.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_18.setOpaque(true);
					 teclaAnterior=lblNewLabel_18;
					
					
				 break;
				 case "Y":
					 lblNewLabel_7.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_7.setOpaque(true);
					 teclaAnterior=lblNewLabel_7;
					
					
				 break;
				 case "U":
					 lblNewLabel_8.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_8.setOpaque(true);
					 teclaAnterior=lblNewLabel_8;
					
				 break;
				 case "I":
					 lblNewLabel_5.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_5.setOpaque(true);
					 teclaAnterior=lblNewLabel_5;
					
				 break;
				 case "O":
					 lblNewLabel_28.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_28.setOpaque(true);
					 teclaAnterior=lblNewLabel_28;
					
				 break;
				 case "P":
					 lblNewLabel_10.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_10.setOpaque(true);
					 teclaAnterior=lblNewLabel_10;
					
				 break;
				 case "A":
					 lblNewLabel_9.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_9.setOpaque(true);
					 teclaAnterior=lblNewLabel_9;
					
				 break;
				 case "S":
					 lblNewLabel_12.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_12.setOpaque(true);
					 teclaAnterior=lblNewLabel_12;
					
				 break;
				 case "D":
					 lblNewLabel_14.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_14.setOpaque(true);
					 teclaAnterior=lblNewLabel_14;
					
				 break;
				 case "F":
					 lblNewLabel_11.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_11.setOpaque(true);
					 teclaAnterior=lblNewLabel_11;
					
				 break;
				 case "G":
					 lblNewLabel_13.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_13.setOpaque(true);
					 teclaAnterior=lblNewLabel_13;
					
				 break;
				 case "H":
					 lblNewLabel_15.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_15.setOpaque(true);
					 teclaAnterior=lblNewLabel_15;
					
				 break;
				 case "J":
					 lblNewLabel_17.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_17.setOpaque(true);
					 teclaAnterior=lblNewLabel_17;
					
				 break;
				 case "K":
					 lblNewLabel_16.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_16.setOpaque(true);
					 teclaAnterior=lblNewLabel_16;
					
				 break;
				 case "L":
					 lblNewLabel_19.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_19.setOpaque(true);
					 teclaAnterior=lblNewLabel_19;
					
				 break;
				 case "Ñ":
					 lblNewLabel_20.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_20.setOpaque(true);
					
					 teclaAnterior=lblNewLabel_20;
				 break;
				 case "Z":
					 lblNewLabel_21.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_21.setOpaque(true);
					 teclaAnterior=lblNewLabel_21;
					
				 break;
				 case "X":
					 lblNewLabel_22.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_22.setOpaque(true);
					 teclaAnterior=lblNewLabel_22;
					
				 break;
				 case "C":
					 lblNewLabel_23.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_23.setOpaque(true);
					 teclaAnterior=lblNewLabel_23;
					
				 break;
				 case "V":
					 lblNewLabel_24.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_24.setOpaque(true);
					 teclaAnterior=lblNewLabel_24;
					
				 break;
				 case "B":
					 lblNewLabel_25.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_25.setOpaque(true);
					 teclaAnterior=lblNewLabel_25;
					
				 break;
				 case "N":
					 lblNewLabel_26.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_26.setOpaque(true);
					
					 teclaAnterior=lblNewLabel_26;
				 break;
				 case "M":
					 lblNewLabel_27.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_27.setOpaque(true);
					
					 teclaAnterior=lblNewLabel_27;
				 break;
				 
				 case "Backspace":
					 lblNewLabel_p3.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_p3.setOpaque(true);
					 teclaAnterior=lblNewLabel_p3;
					 tecla="";
					 
					 borrar=true;
					if(texto.size()-1<0) {
						 
					}else {
						texto.remove(texto.size()-1);
					}
					// System.out.println(texto.size());
				 break;
				 case "Space":
					 lblNewLabel_p2.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
					 lblNewLabel_p2.setOpaque(true);
					 teclaAnterior=lblNewLabel_p2;
					 tecla=" ";
					
				 break;
				 
				 }

				  datos = "";
				
				if(borrar==true) {
					borrar=false;
					
				}else {
					texto.add(tecla);					
				}
				
			 
				for (String elemento : texto) {
					
					  datos+=elemento;
				}
				 System.out.println(tecla);
				 //lblNewLabel_1.setText(datos);
				lblNewLabel_29.setText(datos);
				comprobarPalabra();

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}});
	
	}
	
	public void comprobarPalabra() {
		
		
		if(datos.equalsIgnoreCase(palabra)) {
			iniciarTiempo=false;
			
			JOptionPane.showMessageDialog(null,"Felicidades completaste la palabra, tu tiempo fue de: "+ minutos +":"+ segundos);
			segundos=0;
			minutos=0;
			lblNewLabel_29.setText("Esperando..");
			datos="";
			texto.clear();
			setPalabra();

		}
		
	}

}

