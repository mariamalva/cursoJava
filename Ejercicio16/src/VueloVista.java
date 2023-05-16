import java.awt.Color;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.time.LocalDateTime;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VueloVista {
	
	private JFrame frame;
	private JPanel panel;
	private JLabel nombreLabel;
	private JLabel origenLabel;
	private JLabel destinoLabel;
	private JLabel salidaLabel;
	private JLabel llegadaLabel;
	private JLabel duracionLabel;
	
	
	public VueloVista()
	{
		frame = new JFrame("Información de vuelo");
		frame.setSize(500,125); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false); 
		frame.setLayout(new GridLayout(2,3));
		
		panel = new JPanel();
		
		nombreLabel = new JLabel("Nombre: ");
		nombreLabel.setOpaque(true);
		nombreLabel.setBackground(Color.LIGHT_GRAY);
		
		origenLabel = new JLabel("Origen: ");
		origenLabel.setOpaque(true);
		origenLabel.setBackground(Color.GREEN);
		
		destinoLabel = new JLabel("Destino: ");
		destinoLabel.setOpaque(true);
		destinoLabel.setBackground(Color.GREEN);
		
		salidaLabel = new JLabel("Salida: ");
		salidaLabel.setOpaque(true);
		salidaLabel.setBackground(Color.CYAN);
		
		
		llegadaLabel = new JLabel("Llegada: ");
		llegadaLabel.setOpaque(true);
		llegadaLabel.setBackground(Color.CYAN);
		
		
		duracionLabel = new JLabel("Duración: ");
		duracionLabel.setOpaque(true);
		duracionLabel.setBackground(Color.ORANGE);
		
		
		panel.add(nombreLabel);
		panel.add(origenLabel);
		panel.add(destinoLabel);
		panel.add(salidaLabel);
		panel.add(llegadaLabel);
		panel.add(duracionLabel);
		
		frame.getContentPane().add(panel);
		frame.setVisible(true);	
	}
	public void mostrarVuelo(String nombre, String origen, String destino, LocalDateTime salida, LocalDateTime llegada, double duracion)
	{
		nombreLabel.setText("Nombre: " + nombre);
		origenLabel.setText("Origen: " + origen);
		destinoLabel.setText("Destino: " + destino);	
		salidaLabel.setText("Salida: " + salida);
		llegadaLabel.setText("Llegada: " + llegada);
		DecimalFormat df = new DecimalFormat("#0.00");
		duracionLabel.setText("Duración: " + df.format(duracion)+ " días");
		
	}
}
