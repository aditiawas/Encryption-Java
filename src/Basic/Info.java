package Basic;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.DropMode;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.UIManager;

public class Info extends JFrame {

	private JPanel contentPane;
	String inform;
	/**
	 * Create the frame.
	 */
	public Info(int i) {
		setResizable(false);
		setBounds(100, 100, 450, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNeedMoreInfo = new JButton("Need More Info??");
		btnNeedMoreInfo.setFont(new Font("Gadugi", Font.PLAIN, 21));
		btnNeedMoreInfo.setBounds(111, 324, 232, 48);
		contentPane.add(btnNeedMoreInfo);
		
		JLabel lblHey = new JLabel();
		lblHey.setHorizontalAlignment(SwingConstants.CENTER);
		lblHey.setForeground(Color.WHITE);
		lblHey.setOpaque(true);
		lblHey.setFont(new Font("Gadugi", Font.BOLD, 21));
		lblHey.setBackground(new Color(0, 51, 204));
		lblHey.setSize(444, 66);
		lblHey.setLocation(0, 11);
		contentPane.add(lblHey);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setFont(new Font("Gadugi", Font.PLAIN, 12));
		textArea.setEditable(false);
		textArea.setBounds(20, 89, 402, 223);
		contentPane.add(textArea);
		
		if (i==1)
		{
			lblHey.setText("Vigenere Cipher");
			inform="The Vigenère cipher is a method of encrypting alphabetic text by using a series of interwoven Caesar ciphers based on the letters of a keyword. It is a form of polyalphabetic substitution. \n\nThough the cipher is easy to understand and implement, for three centuries it resisted all attempts to break it. Many people have tried to implement encryption schemes that are essentially Vigenère ciphers. Friedrich Kasiski was the first to publish a general method of deciphering a Vigenère cipher in 1863.";
			textArea.setText(inform);
			textArea.setEditable(false);
			btnNeedMoreInfo.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Desktop d = Desktop.getDesktop();
					try {
					    d.browse(new URI("https://en.wikipedia.org/wiki/Vigenère_cipher"));
					} catch (IOException | URISyntaxException e2) {
					    e2.printStackTrace();
					} 
				}
			});
		}
		if (i==2)
		{
			lblHey.setText("RC4 Cipher");
			inform="In cryptography, RC4 (Rivest Cipher 4 also known as ARC4 or ARCFOUR) is a stream cipher. While remarkable for its simplicity and speed in software, multiple vulnerabilities have been discovered in RC4, rendering it insecure.\n\nIt is especially vulnerable when the beginning of the output keystream is not discarded, or when nonrandom or related keys are used. Particularly problematic uses of RC4 have led to very insecure protocols such as WEP.";
			textArea.setText(inform);
			textArea.setEditable(false);
			btnNeedMoreInfo.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Desktop d = Desktop.getDesktop();
					try {
					    d.browse(new URI("https://en.wikipedia.org/wiki/RC4"));
					} catch (IOException | URISyntaxException e2) {
					    e2.printStackTrace();
					} 
				}
			});
		}
		if (i==3)
		{
			lblHey.setText("RSA Cipher");
			inform="RSA (Rivest–Shamir–Adleman) is one of the first public-key cryptosystems and is widely used for secure data transmission. In such a cryptosystem, the encryption key is public and it is different from the decryption key which is kept secret (private).\n\nIn RSA, this asymmetry is based on the practical difficulty of the factorization of the product of two large prime numbers, the \"factoring problem\". A user of RSA creates and then publishes a public key based on two large prime numbers, along with an auxiliary value. The prime numbers must be kept secret. Anyone can use the public key to encrypt a message, but with currently published methods, and if the public key is large enough, only someone with knowledge of the prime numbers can decode the message feasibly.";
			textArea.setText(inform);
			textArea.setEditable(false);
			btnNeedMoreInfo.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Desktop d = Desktop.getDesktop();
					try {
					    d.browse(new URI("https://en.wikipedia.org/wiki/RSA_(cryptosystem)"));
					    d.browse(new URI("http://doctrina.org/How-RSA-Works-With-Examples.html"));
					} catch (IOException | URISyntaxException e2) {
					    e2.printStackTrace();
					} 
				}
			});
		}
		JLabel lblAwasthiDev = new JLabel("Awasthi Dev Pvt. Ltd    ");
		lblAwasthiDev.setFont(new Font("Gadugi", Font.PLAIN, 12));
		lblAwasthiDev.setForeground(Color.WHITE);
		lblAwasthiDev.setOpaque(true);
		lblAwasthiDev.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAwasthiDev.setBounds(0, 383, 444, 16);
		lblAwasthiDev.setBackground(new Color(0, 51, 204));
		contentPane.add(lblAwasthiDev);
	}
}
