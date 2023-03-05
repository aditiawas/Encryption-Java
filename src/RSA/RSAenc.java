package RSA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import Basic.Selectalgo;

import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigInteger;

public class RSAenc extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private RSAimp keySet;
	private BigInteger cyphertext;
	private String userInput;
	
	public RSAenc(RSAimp keyset) {
		setResizable(false);
		
		this.keySet = keyset;
		setBounds(100, 100, 602, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRsaEncryption = new JLabel("RSA Encryption");
		lblRsaEncryption.setHorizontalAlignment(SwingConstants.CENTER);
		lblRsaEncryption.setForeground(Color.WHITE);
		lblRsaEncryption.setOpaque(true);
		lblRsaEncryption.setFont(new Font("Gadugi", Font.BOLD, 21));
		lblRsaEncryption.setBackground(new Color(0, 51, 204));
		lblRsaEncryption.setSize(596, 64);
		lblRsaEncryption.setLocation(0, 0);
		contentPane.add(lblRsaEncryption);
		
		JLabel lblInputTheMessage = new JLabel("Input message:");
		lblInputTheMessage.setFont(new Font("Gadugi", Font.PLAIN, 15));
		lblInputTheMessage.setBounds(54, 79, 129, 27);
		contentPane.add(lblInputTheMessage);
		
		textField = new JTextField();
		textField.setBounds(216, 82, 302, 26);
		textField.setColumns(10);
		textField.setBackground(new Color(204, 255, 255));
		contentPane.add(textField);
		
		JButton btnEncryptIt = new JButton("Encrypt it!!");
		btnEncryptIt.setForeground(new Color(0, 0, 0));
		btnEncryptIt.setFont(new Font("Gadugi", Font.BOLD, 21));
		btnEncryptIt.setBounds(176, 117, 201, 41);
		contentPane.add(btnEncryptIt);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(54, 227, 473, 106);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Show Public Key");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Gadugi", Font.PLAIN, 15));
		btnNewButton.setBounds(391, 169, 172, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Show Private Key");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Gadugi", Font.PLAIN, 15));
		btnNewButton_1.setBounds(24, 169, 172, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Change private key");
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("Gadugi", Font.PLAIN, 15));
		btnNewButton_2.setBounds(135, 355, 172, 30);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Gadugi", Font.PLAIN, 14));
		lblNewLabel.setBounds(24, 206, 75, 14);
		lblNewLabel.setBackground(new Color(51, 0, 153));
		contentPane.add(lblNewLabel);
		
		JButton btnIWantTo = new JButton("I want to decrypt!");
		btnIWantTo.setForeground(Color.RED);
		btnIWantTo.setFont(new Font("Gadugi", Font.BOLD, 21));
		btnIWantTo.setBounds(341, 344, 222, 41);
		contentPane.add(btnIWantTo);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Gadugi", Font.PLAIN, 17));
		btnBack.setBounds(24, 355, 75, 30);
		contentPane.add(btnBack);
		
		JButton button = new JButton("Show Modulus");
		button.setFont(new Font("Gadugi", Font.PLAIN, 15));
		button.setBounds(206, 169, 172, 25);
		contentPane.add(button);
		
		btnEncryptIt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				startpro(textArea, lblNewLabel);
			}
		});
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.setText(keySet.getPublicKey().toString());
				lblNewLabel.setText("Public Key:");
			}
		});
		
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.setText(keySet.getPrivateKey().toString());
				lblNewLabel.setText("Private Key:");
			}
		});
		
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.setText(keySet.getModulus().toString());
				lblNewLabel.setText("Modulus:");
			}
		});
		
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RSAimp keyset = new RSAimp(512);
				RSAenc frame = new RSAenc(keyset);
				frame.setVisible(true);
				dispose();
			}
		});
		
		btnIWantTo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				RSAdec frame = new RSAdec();
				frame.setVisible(true);
				dispose();
			}
		});
		
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Selectalgo frame = new Selectalgo();
				frame.setVisible(true);
				dispose();
			}
		});
		JLabel lblAwasthiDev = new JLabel("Awasthi Dev Pvt. Ltd    ");
		lblAwasthiDev.setFont(new Font("Gadugi", Font.PLAIN, 12));
		lblAwasthiDev.setForeground(Color.WHITE);
		lblAwasthiDev.setOpaque(true);
		lblAwasthiDev.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAwasthiDev.setBounds(0, 405, 596, 16);
		lblAwasthiDev.setBackground(new Color(0, 51, 204));
		contentPane.add(lblAwasthiDev);
	}
	
	public void startpro (JTextArea textArea, JLabel lblNewLabel)
	{
		if(textField.getText().equals(""))
		{
			JOptionPane.showMessageDialog(getParent(), "Enter the text");
		}
		else
		{
		BigInteger mess = new BigInteger (textField.getText().getBytes());
		cyphertext = keySet.encrypt(mess);
		textArea.setText(new String (cyphertext.toString()));
		lblNewLabel.setText("Cipher Text:");
		}
	}
}
