package RC4;

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

public class RC4dec extends JFrame {

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
					RC4dec frame = new RC4dec();
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
	public RC4dec() {
		setResizable(false);

		setBounds(100, 100, 603, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Cipher text:");
		label.setFont(new Font("Gadugi", Font.PLAIN, 15));
		label.setBounds(66, 82, 129, 27);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(241, 85, 302, 27);
		textField.setColumns(10);
		textField.setBackground(new Color(204, 255, 255));
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("RC4 Decryption");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setOpaque(true);
		label_1.setFont(new Font("Gadugi", Font.BOLD, 21));
		label_1.setBackground(new Color(0, 51, 204));
		label_1.setSize(597, 64);
		label_1.setLocation(0, 0);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Your Key:");
		label_2.setFont(new Font("Gadugi", Font.PLAIN, 15));
		label_2.setBounds(76, 135, 118, 20);
		contentPane.add(label_2);
		
		JButton button_1 = new JButton("Back");
		button_1.setFont(new Font("Gadugi", Font.PLAIN, 21));
		button_1.setBounds(44, 268, 95, 27);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Selectalgo frame = new Selectalgo();
				frame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Decrypt it!!");
		button_2.setForeground(new Color(0, 0, 0));
		button_2.setFont(new Font("Gadugi", Font.BOLD, 21));
		button_2.setBounds(173, 187, 215, 48);
		contentPane.add(button_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(241, 135, 302, 27);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(204, 255, 255));
		contentPane.add(textField_1);
		
		JButton button = new JButton("I want to encrypt!");
		button.setForeground(Color.RED);
		button.setFont(new Font("Gadugi", Font.BOLD, 21));
		button.setBounds(333, 257, 226, 48);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RC4enc frame = new RC4enc();
				frame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(button);
		
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
		lblAwasthiDev.setBounds(0, 334, 597, 16);
		lblAwasthiDev.setBackground(new Color(0, 51, 204));
		contentPane.add(lblAwasthiDev);
	}
	
	String display(int disp[])
	{
		int l;
		char convert[]=new char[disp.length];
		for(l=0;l<disp.length;l++)
			convert[l]=(char)disp[l];
		return(new String(convert));
	}
	
	public void startpro (JTextField textField, JTextField textField_1)
	{
		if(textField.getText().equals("") || textField_1.getText().equals(""))
		{
			JOptionPane.showMessageDialog(getParent(), "Enter the message and the key");
		}
		else
		{
			RC4imp vig = new RC4imp (textField_1.getText());
			int res2[] = vig.decrypt(textField.getText());
			String res = display(res2);
			JOptionPane.showMessageDialog(getParent(), "Your message is:\t\""+res+"\"");
		}
	}

}
