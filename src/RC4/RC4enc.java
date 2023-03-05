package RC4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Basic.Selectalgo;

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
import javax.swing.JTextArea;

public class RC4enc extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	String res3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RC4enc frame = new RC4enc();
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
	public RC4enc() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton button = new JButton("I want to decrypt!");
		button.setForeground(Color.RED);
		button.setFont(new Font("Gadugi", Font.BOLD, 21));
		button.setBounds(386, 333, 232, 48);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RC4dec frame = new RC4dec();
				frame.setVisible(true);
				dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Encrypt it!!");
		button_1.setForeground(new Color(0, 0, 0));
		button_1.setFont(new Font("Gadugi", Font.BOLD, 21));
		button_1.setBounds(191, 158, 215, 48);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Back");
		button_2.setFont(new Font("Gadugi", Font.PLAIN, 21));
		button_2.setBounds(40, 337, 107, 41);
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
						Selectalgo frame = new Selectalgo();
						frame.setVisible(true);
						dispose();
				}
			});
		contentPane.add(button_2);
		
		JLabel label = new JLabel("Input message:");
		label.setFont(new Font("Gadugi", Font.PLAIN, 15));
		label.setBounds(66, 82, 129, 27);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Your Key:");
		label_1.setFont(new Font("Gadugi", Font.PLAIN, 15));
		label_1.setBounds(76, 120, 118, 20);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(241, 82, 302, 26);
		textField.setColumns(10);
		textField.setBackground(new Color(204, 255, 255));
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(241, 120, 302, 27);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(204, 255, 255));
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("RC4 Encryption");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.WHITE);
		label_2.setOpaque(true);
		label_2.setFont(new Font("Gadugi", Font.BOLD, 21));
		label_2.setBackground(new Color(0, 51, 204));
		label_2.setSize(658, 64);
		label_2.setLocation(0, 0);
		contentPane.add(label_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(40, 223, 578, 99);
		contentPane.add(textArea);
		
		JButton btnWantHexForm = new JButton("Want Hex Form?");
		btnWantHexForm.setFont(new Font("Gadugi", Font.PLAIN, 15));
		btnWantHexForm.setBounds(168, 346, 197, 33);
		contentPane.add(btnWantHexForm);
		
		
		res3="Put values and encrpyt first!";
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				res3 = startpro(textField,textField_1,textArea);
			}
		});
		
		btnWantHexForm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textArea.setText("In hex form:\t\""+res3+"\"");
			}
		});
		JLabel lblAwasthiDev = new JLabel("Awasthi Dev Pvt. Ltd    ");
		lblAwasthiDev.setFont(new Font("Gadugi", Font.PLAIN, 12));
		lblAwasthiDev.setForeground(Color.WHITE);
		lblAwasthiDev.setOpaque(true);
		lblAwasthiDev.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAwasthiDev.setBounds(0, 411, 658, 16);
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
	
	public String startpro (JTextField textField, JTextField textField_1, JTextArea textArea)
	{
		if(textField.getText().equals("") || textField_1.getText().equals(""))
		{
			JOptionPane.showMessageDialog(getParent(), "Enter the message and the key");
		}
		else
		{
			String res3="";
			RC4imp rc4 = new RC4imp (textField_1.getText());
			int res2[] = rc4.encrypt(textField.getText());
			String res = display (res2);
			textArea.setText("Cipher Text is:\t\""+res+"\"");
			
			for (int i=0;i<res.length();i++)
				res3=res3+Integer.toHexString((int)res.charAt(i));
			return res3;
		}
		return "1st encrypt normally";
	}
	
}
