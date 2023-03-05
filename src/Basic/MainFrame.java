package Basic;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import java.awt.Color;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeading = new JLabel("Want to send around secret messages?");
		lblHeading.setForeground(Color.WHITE);
		lblHeading.setBounds(0, 6, 670, 86);
		lblHeading.setBackground(new Color(0, 51, 204));
		lblHeading.setOpaque(true);
		lblHeading.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading.setFont(new Font("Gadugi", Font.BOLD, 30));
		contentPane.add(lblHeading);
		
		JLabel label = new JLabel("You have come to the right place!");
		label.setBounds(10, 104, 640, 34);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setOpaque(true);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Gadugi", Font.PLAIN, 25));
		contentPane.add(label);
		
		JButton btnWhatIsEncryption = new JButton("What is Encryption??");
		btnWhatIsEncryption.setOpaque(true);
		btnWhatIsEncryption.setBounds(213, 172, 246, 49);
		btnWhatIsEncryption.setFont(new Font("Gadugi", Font.PLAIN, 21));
		btnWhatIsEncryption.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop d = Desktop.getDesktop();
				try {
				    d.browse(new URI("https://en.wikipedia.org/wiki/Encryption"));
				} catch (IOException | URISyntaxException e2) {
				    e2.printStackTrace();
				} 
			}
		});
		contentPane.add(btnWhatIsEncryption);
		
		JButton btnIAlreadyKnow = new JButton("I already know it. Take me to the juicy stuff!!");
		btnIAlreadyKnow.setBounds(56, 247, 556, 52);
		btnIAlreadyKnow.setFont(new Font("Gadugi", Font.PLAIN, 21));
		btnIAlreadyKnow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					Selectalgo frame = new Selectalgo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		contentPane.add(btnIAlreadyKnow);
		
		JLabel lblAwasthiDev = new JLabel("Awasthi Dev Pvt. Ltd    ");
		lblAwasthiDev.setFont(new Font("Gadugi", Font.PLAIN, 12));
		lblAwasthiDev.setForeground(Color.WHITE);
		lblAwasthiDev.setOpaque(true);
		lblAwasthiDev.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAwasthiDev.setBounds(0, 323, 670, 16);
		lblAwasthiDev.setBackground(new Color(0, 51, 204));
		contentPane.add(lblAwasthiDev);
	}
}
