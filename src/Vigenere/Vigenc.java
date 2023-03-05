package Vigenere;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import Basic.Selectalgo;
import RSA.RSAdec;

import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigInteger;

public class Vigenc extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vigenc frame = new Vigenc();
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
	public Vigenc() {
		setResizable(false);

		setBounds(100, 100, 520, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton button = new JButton("I want to decrypt!");
		button.setForeground(Color.RED);
		button.setFont(new Font("Gadugi", Font.BOLD, 21));
		button.setBounds(257, 236, 222, 41);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Vigdec frame = new Vigdec();
				frame.setVisible(true);
				dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(button);
		
		JLabel label = new JLabel("Input message:");
		label.setFont(new Font("Gadugi", Font.PLAIN, 15));
		label.setBounds(54, 79, 129, 27);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(177, 82, 302, 26);
		textField.setColumns(10);
		textField.setBackground(new Color(204, 255, 255));
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("Vigenere Encryption");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setOpaque(true);
		label_1.setFont(new Font("Gadugi", Font.BOLD, 21));
		label_1.setBackground(new Color(0, 51, 204));
		label_1.setSize(516, 64);
		label_1.setLocation(0, 0);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Your Key:");
		label_2.setFont(new Font("Gadugi", Font.PLAIN, 15));
		label_2.setBounds(54, 132, 129, 27);
		contentPane.add(label_2);
		
		JButton button_1 = new JButton("Back");
		button_1.setFont(new Font("Gadugi", Font.PLAIN, 17));
		button_1.setBounds(47, 243, 75, 30);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Selectalgo frame = new Selectalgo();
				frame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Encrypt it!!");
		button_2.setForeground(new Color(0, 0, 0));
		button_2.setFont(new Font("Gadugi", Font.BOLD, 21));
		button_2.setBounds(137, 184, 201, 41);
		contentPane.add(button_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(177, 135, 302, 26);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(204, 255, 255));
		contentPane.add(textField_1);
		
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				startpro(textField,textField_1);
			}
		});
		JLabel lblAwasthiDev = new JLabel("Awasthi Dev Pvt. Ltd    ");
		lblAwasthiDev.setFont(new Font("Gadugi", Font.PLAIN, 12));
		lblAwasthiDev.setForeground(Color.WHITE);
		lblAwasthiDev.setOpaque(true);
		lblAwasthiDev.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAwasthiDev.setBounds(0, 311, 517, 16);
		lblAwasthiDev.setBackground(new Color(0, 51, 204));
		contentPane.add(lblAwasthiDev);
	}
	
	public void startpro (JTextField textField, JTextField textField_1)
	{
		if(textField.getText().equals("") || textField_1.getText().equals(""))
		{
			JOptionPane.showMessageDialog(getParent(), "Enter the message and the key");
		}
		else
		{
			Vigimp vig = new Vigimp (textField_1.getText());
			String res = vig.encrypt(textField.getText());
			JOptionPane.showMessageDialog(getParent(), "Cipher Text is:\n\""+res+"\"");
		}
	}

}
