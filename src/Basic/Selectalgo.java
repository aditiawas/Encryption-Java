package Basic;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import RSA.*;
import Vigenere.*;
import RC4.*;

import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Selectalgo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Selectalgo frame = new Selectalgo();
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
	public Selectalgo()
	{
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVigenereCipher = new JLabel("Vigenere Cipher");
		lblVigenereCipher.setBounds(54, 108, 145, 35);
		lblVigenereCipher.setFont(new Font("Gadugi", Font.PLAIN, 15));
		contentPane.add(lblVigenereCipher);
		
		JButton btnInfo = new JButton("Info");
		btnInfo.setBounds(211, 106, 64, 39);
		btnInfo.setForeground(UIManager.getColor("Panel.foreground"));
		btnInfo.setFont(new Font("Gadugi", Font.PLAIN, 15));
		btnInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Info frame = new Info(1);
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnInfo);
		
		JButton btnNewButton_1 = new JButton("Implementation");
		btnNewButton_1.setBounds(334, 106, 196, 39);
		btnNewButton_1.setFont(new Font("Gadugi", Font.PLAIN, 15));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Vigenc frame = new Vigenc();
				frame.setVisible(true);
				dispose();	
			}
		});
		contentPane.add(btnNewButton_1);
		
		JLabel lblrc4Encryption = new JLabel("RC4 Encryption");
		lblrc4Encryption.setBounds(54, 163, 122, 34);
		lblrc4Encryption.setFont(new Font("Gadugi", Font.PLAIN, 15));
		contentPane.add(lblrc4Encryption);
		
		JButton btnInfo_1 = new JButton("Info");
		btnInfo_1.setFont(new Font("Gadugi", Font.PLAIN, 15));
		btnInfo_1.setBounds(211, 166, 64, 39);
		btnInfo_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Info frame = new Info(2);
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnInfo_1);
		
		JButton button = new JButton("Implementation");
		button.setFont(new Font("Gadugi", Font.PLAIN, 15));
		button.setBounds(334, 166, 196, 39);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RC4enc frame = new RC4enc();
				frame.setVisible(true);
				dispose();	
			}
		});
		contentPane.add(button);
		
		JLabel lblRsaEncryption = new JLabel("RSA Encryption");
		lblRsaEncryption.setBounds(54, 222, 122, 39);
		lblRsaEncryption.setFont(new Font("Gadugi", Font.PLAIN, 15));
		contentPane.add(lblRsaEncryption);
		
		JButton btnInfo_2 = new JButton("Info");
		btnInfo_2.setFont(new Font("Gadugi", Font.PLAIN, 15));
		btnInfo_2.setBounds(211, 227, 64, 39);
		btnInfo_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Info frame = new Info(3);
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnInfo_2);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Gadugi", Font.PLAIN, 17));
		btnBack.setBounds(211, 291, 106, 51);
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
					dispose();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		JButton button_2 = new JButton("Implementation");
		button_2.setFont(new Font("Gadugi", Font.PLAIN, 15));
		button_2.setBounds(334, 227, 196, 39);
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RSAimp keyset = new RSAimp(512);
				RSAenc frame = new RSAenc(keyset);
				frame.setVisible(true);
				dispose();				
			}
		});
		contentPane.add(button_2);
		contentPane.add(btnBack);
		
		JLabel lblAwasthiDev = new JLabel("Awasthi Dev Pvt. Ltd    ");
		lblAwasthiDev.setFont(new Font("Gadugi", Font.PLAIN, 12));
		lblAwasthiDev.setForeground(Color.WHITE);
		lblAwasthiDev.setOpaque(true);
		lblAwasthiDev.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAwasthiDev.setBounds(0, 365, 567, 16);
		lblAwasthiDev.setBackground(new Color(0, 51, 204));
		contentPane.add(lblAwasthiDev);
		
		JLabel label = new JLabel("What's your choice?");
		label.setOpaque(true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Gadugi", Font.BOLD, 30));
		label.setBackground(new Color(0, 51, 204));
		label.setBounds(0, 0, 567, 86);
		contentPane.add(label);
	}
}
