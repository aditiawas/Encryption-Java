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
import javax.swing.UIManager;



public class RSAdec extends JFrame {

	private JPanel contentPane;
	private RSAimp keySet;
	private BigInteger message;
	private String userInput;
	
	public RSAdec() {
		setResizable(false);
		setBounds(100, 100, 567, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRsaDecryption = new JLabel("RSA Decryption");
		lblRsaDecryption.setHorizontalAlignment(SwingConstants.CENTER);
		lblRsaDecryption.setForeground(Color.WHITE);
		lblRsaDecryption.setOpaque(true);
		lblRsaDecryption.setFont(new Font("Gadugi", Font.BOLD, 21));
		lblRsaDecryption.setBackground(new Color(0, 51, 204));
		lblRsaDecryption.setSize(561, 64);
		lblRsaDecryption.setLocation(0, 0);
		contentPane.add(lblRsaDecryption);
		
		JLabel lblCipherText = new JLabel("Cipher Text:");
		lblCipherText.setFont(new Font("Gadugi", Font.PLAIN, 15));
		lblCipherText.setBounds(21, 91, 109, 27);
		contentPane.add(lblCipherText);
		
		JButton btnDecryptIt = new JButton("Decrypt it!!");
		
		btnDecryptIt.setForeground(new Color(0, 0, 0));
		btnDecryptIt.setFont(new Font("Gadugi", Font.BOLD, 21));
		btnDecryptIt.setBounds(125, 346, 172, 50);
		contentPane.add(btnDecryptIt);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(UIManager.getBorder("FormattedTextField.border"));
		textArea.setBounds(115, 75, 415, 62);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		contentPane.add(textArea);
		
		JButton btnIWantTo = new JButton("I want to encrypt!");
		btnIWantTo.setForeground(Color.RED);
		btnIWantTo.setFont(new Font("Gadugi", Font.BOLD, 21));
		btnIWantTo.setBounds(307, 392, 230, 37);
		contentPane.add(btnIWantTo);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Gadugi", Font.PLAIN, 21));
		btnBack.setBounds(21, 397, 95, 27);
		contentPane.add(btnBack);
		
		JLabel lblPublicKey = new JLabel("Modulus:");
		lblPublicKey.setFont(new Font("Gadugi", Font.PLAIN, 15));
		lblPublicKey.setBounds(21, 164, 79, 23);
		contentPane.add(lblPublicKey);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBorder(UIManager.getBorder("FormattedTextField.border"));
		textArea_1.setBounds(115, 148, 415, 60);
		textArea_1.setWrapStyleWord(true);
		textArea_1.setLineWrap(true);
		contentPane.add(textArea_1);
		
		JLabel lblPrivateKey = new JLabel("Private Key:");
		lblPrivateKey.setFont(new Font("Gadugi", Font.PLAIN, 15));
		lblPrivateKey.setBounds(21, 263, 79, 27);
		contentPane.add(lblPrivateKey);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBorder(UIManager.getBorder("FormattedTextField.border"));
		textArea_2.setBounds(115, 219, 415, 115);
		textArea_2.setWrapStyleWord(true);
		textArea_2.setLineWrap(true);
		contentPane.add(textArea_2);
		
		btnDecryptIt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				startpro(textArea, textArea_1, textArea_2);
			}
		});
		
		btnIWantTo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				RSAimp keyset = new RSAimp (512);
				RSAenc frame = new RSAenc(keyset);
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
		lblAwasthiDev.setBounds(0, 435, 561, 16);
		lblAwasthiDev.setBackground(new Color(0, 51, 204));
		contentPane.add(lblAwasthiDev);
	}
	
	public void startpro (JTextArea textArea, JTextArea textArea_1, JTextArea textArea_2)
	{
		if(textArea.getText().equals("") || textArea_1.getText().equals("") ||textArea_2.getText().equals(""))
		{
			JOptionPane.showMessageDialog(getParent(), "Enter the required details");
		}
		else
		{
		BigInteger mod=new BigInteger (textArea_1.getText());
		BigInteger pk=new BigInteger (textArea_2.getText());
		RSAimp keyset = new RSAimp (mod,pk);
		BigInteger cyphertext = new BigInteger (textArea.getText());
		message=keyset.decrypt(cyphertext);
		String ans = new String (message.toByteArray());
		JOptionPane.showMessageDialog(getParent(), "The message is:\n\"" + ans + "\"");
		}
	}
}
