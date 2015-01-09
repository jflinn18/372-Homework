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

public class CookieSalesGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(40, 47, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(40, 104, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(40, 164, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblS = new JLabel(":  Samoas");
		lblS.setBounds(147, 50, 86, 14);
		contentPane.add(lblS);
		
		JLabel lblThinMints = new JLabel(": Thin Mints");
		lblThinMints.setBounds(147, 107, 86, 14);
		contentPane.add(lblThinMints);
		
		JLabel lblNewLabel = new JLabel(": Chocolate Chip");
		lblNewLabel.setBounds(147, 167, 86, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnAdd = new JButton("Add...");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int samoa = Integer.parseInt();
			}
		});
		btnAdd.setBounds(299, 215, 89, 23);
		contentPane.add(btnAdd);
		
		JLabel lblTotal = new JLabel("Total : ");
		lblTotal.setBounds(264, 107, 34, 14);
		contentPane.add(lblTotal);
		
		JTextPane textPane = new JTextPane();
		textPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GRAY, null, null, null));
		textPane.setBounds(306, 104, 82, 20);
		contentPane.add(textPane);
		
		JLabel lblGirlScoutCookies = new JLabel("Girl Scout Cookies Sales ");
		lblGirlScoutCookies.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGirlScoutCookies.setBounds(40, 11, 193, 14);
		contentPane.add(lblGirlScoutCookies);
	}
}
