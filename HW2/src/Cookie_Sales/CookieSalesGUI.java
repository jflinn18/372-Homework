package Cookie_Sales;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CookieSalesGUI extends JFrame {

	private JPanel contentPane;
	private JTextField samoaTextField;
	private JTextField thinMintsTextField;
	private JTextField chocolateChipTextField;
	
	/**
	 * Creation of the CookieSales Object
	 */
	private CookieSales cs = new CookieSales();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CookieSalesGUI frame = new CookieSalesGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CookieSalesGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		samoaTextField = new JTextField();
		samoaTextField.setBounds(40, 47, 57, 20);
		contentPane.add(samoaTextField);
		samoaTextField.setColumns(10);
		
		thinMintsTextField = new JTextField();
		thinMintsTextField.setBounds(40, 104, 57, 20);
		contentPane.add(thinMintsTextField);
		thinMintsTextField.setColumns(10);
		
		chocolateChipTextField = new JTextField();
		chocolateChipTextField.setBounds(40, 164, 57, 20);
		contentPane.add(chocolateChipTextField);
		chocolateChipTextField.setColumns(10);
		
		JLabel lblSamoa = new JLabel(":  Samoas");
		lblSamoa.setBounds(107, 50, 57, 14);
		contentPane.add(lblSamoa);
		
		JLabel lblThinMints = new JLabel(": Thin Mints");
		lblThinMints.setBounds(107, 107, 67, 14);
		contentPane.add(lblThinMints);
		
		JLabel lblChocolateChip = new JLabel(": Chocolate Chip");
		lblChocolateChip.setBounds(107, 167, 126, 14);
		contentPane.add(lblChocolateChip);
		
		JLabel lblTotal = new JLabel("Total Sales :   $ ");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTotal.setBounds(319, 249, 99, 14);
		contentPane.add(lblTotal);
		
		JTextPane totalTextPane = new JTextPane();
		totalTextPane.setBorder(new LineBorder(Color.LIGHT_GRAY));
		totalTextPane.setBounds(417, 249, 82, 20);
		contentPane.add(totalTextPane);
		
		JLabel lblGirlScoutCookies = new JLabel("Girl Scout Cookies Sales ");
		lblGirlScoutCookies.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGirlScoutCookies.setBounds(40, 11, 193, 14);
		contentPane.add(lblGirlScoutCookies);
		
		JTextPane samoaTotal = new JTextPane();
		samoaTotal.setBorder(new LineBorder(Color.LIGHT_GRAY));
		samoaTotal.setBounds(453, 47, 46, 20);
		contentPane.add(samoaTotal);
		
		JTextPane thinMintsTotal = new JTextPane();
		thinMintsTotal.setBorder(new LineBorder(Color.LIGHT_GRAY));
		thinMintsTotal.setBounds(453, 104, 46, 20);
		contentPane.add(thinMintsTotal);
		
		JTextPane chocolateChipTotal = new JTextPane();
		chocolateChipTotal.setBorder(new LineBorder(Color.LIGHT_GRAY));
		chocolateChipTotal.setBounds(453, 164, 46, 20);
		contentPane.add(chocolateChipTotal);
		
		JLabel lblTotal_1 = new JLabel("Total Sold : ");
		lblTotal_1.setBounds(361, 50, 82, 14);
		contentPane.add(lblTotal_1);
		
		JLabel lblTotal_2 = new JLabel("Total Sold : ");
		lblTotal_2.setBounds(361, 107, 82, 14);
		contentPane.add(lblTotal_2);
		
		JLabel lblTotal_3 = new JLabel("Total Sold : ");
		lblTotal_3.setBounds(361, 167, 82, 14);
		contentPane.add(lblTotal_3);
		
		
		/**
		 * Handles everything that needs to be done when the "Add..." button is pressed.
		 */
		JButton btnAdd = new JButton("Add...");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int samoa;
				int thinMints;
				int chocolateChip;
				
				if(samoaTextField.getText().equals(""))
					samoa = 0;
				else
					samoa = Integer.parseInt(samoaTextField.getText());
				
				if (thinMintsTextField.getText().equals(""))
					thinMints = 0;
				else
					thinMints = Integer.parseInt(thinMintsTextField.getText());
				
				if (chocolateChipTextField.getText().equals(""))
					chocolateChip = 0;
				else
					chocolateChip = Integer.parseInt(chocolateChipTextField.getText());
			
				cs.addSales(samoa, thinMints, chocolateChip);
				
				String f = String.format("%d", cs.getSamoaCount());
				samoaTotal.setText(f);
				f = String.format("%d", cs.getThinMintsCount());
				thinMintsTotal.setText(f);
				f = String.format("%d", cs.getChocolateCount());
				chocolateChipTotal.setText(f);
				
				f = String.format("%d", cs.getTotal());
				totalTextPane.setText(f);
				
				samoaTextField.setText("");
				thinMintsTextField.setText("");
				chocolateChipTextField.setText("");
			}
		});
		btnAdd.setBounds(29, 227, 89, 23);
		contentPane.add(btnAdd);
	}
}
