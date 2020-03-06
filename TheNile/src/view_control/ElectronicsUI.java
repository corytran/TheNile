package view_control;
import control_ap_exam.APexam;
import model.model;

import java.awt.*;
import java.awt.color.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.image.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
public class ElectronicsUI extends MainMenu{
	private JTextField txtRandomTest;
	public ElectronicsUI() {
		setBounds(100, 100, 800, 660);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 784, 87);
		panel.setBackground(new Color(35,47,62));
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnTodaysDeals = new JButton("Today's Deals");
		btnTodaysDeals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Deals();
				dispose();
			}
		});
		btnTodaysDeals.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnTodaysDeals.setOpaque(true);
		btnTodaysDeals.setForeground(Color.WHITE);
		btnTodaysDeals.setBorderPainted(false);
		btnTodaysDeals.setBackground(new Color(35,47,62));
		btnTodaysDeals.setBounds(89, 49, 150, 27);
		panel.add(btnTodaysDeals);
		
		JButton btnGo = new JButton("");
		btnGo.setIcon(new ImageIcon(ElectronicsUI.class.getResource("/view_control/MagY.PNG")));
		btnGo.setOpaque(true);
		btnGo.setForeground(Color.WHITE);
		btnGo.setBorderPainted(false);
		btnGo.setBackground(new Color(254,189,105));
		btnGo.setBounds(655, 10, 45, 32);
		panel.add(btnGo);
		
		TextField textField = new TextField();
		textField.setBounds(90, 10, 565, 32);
		panel.add(textField);
		textField.setText("");
		textField.setFont(new Font("SansSerif", Font.PLAIN, 18));
		textField.setForeground(Color.BLACK);
		textField.setBackground(Color.WHITE);
		
		JButton btnBooks = new JButton("Books\r\n");
		btnBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Books();
				dispose();
			}
		});
		btnBooks.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBooks.setOpaque(true);
		btnBooks.setForeground(Color.WHITE);
		btnBooks.setBorderPainted(false);
		btnBooks.setBackground(new Color(35,47,62));
		btnBooks.setBounds(249, 51, 150, 27);
		panel.add(btnBooks);
		
		JButton btnGames = new JButton("Games\r\n");
		btnGames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Games();
				dispose();
			}
		});
		btnGames.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnGames.setOpaque(true);
		btnGames.setForeground(Color.WHITE);
		btnGames.setBorderPainted(false);
		btnGames.setBackground(new Color(35,47,62));
		btnGames.setBounds(409, 51, 150, 27);
		panel.add(btnGames);
		
		JButton btnComputers = new JButton("Electronics");
		btnComputers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Electronics();
				dispose();
			}
		});
		btnComputers.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnComputers.setOpaque(true);
		btnComputers.setForeground(Color.WHITE);
		btnComputers.setBorderPainted(false);
		btnComputers.setBackground(new Color(35,47,62));
		btnComputers.setBounds(569, 51, 150, 27);
		panel.add(btnComputers);
		
		JButton button_3 = new JButton("Cart");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Cart();
				dispose();
			}
		});
		button_3.setIcon(new ImageIcon(ElectronicsUI.class.getResource("/view_control/CartIcon_35.png")));
		button_3.setForeground(Color.WHITE);
		button_3.setOpaque(false);
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.setBounds(710, 10, 64, 32);
		panel.add(button_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(ElectronicsUI.class.getResource("/view_control/NileLogo_35.png")));
		lblNewLabel.setBounds(0, 1, 76, 51);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(ElectronicsUI.class.getResource("/view_control/Ryzen.jpg")));
		btnNewButton.setBounds(10, 93, 185, 185);
		btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(ElectronicsUI.class.getResource("/view_control/RTX.jpg")));
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(205, 93, 185, 185);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(ElectronicsUI.class.getResource("/view_control/DellXPS_50.jpg")));
		btnNewButton_2.setSelectedIcon(new ImageIcon(ElectronicsUI.class.getResource("/view_control/Invent.jpg")));
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBounds(400, 93, 185, 185);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(ElectronicsUI.class.getResource("/view_control/AmazonRemote_60.jpg")));
		btnNewButton_3.setSelectedIcon(new ImageIcon(ElectronicsUI.class.getResource("/view_control/AmazonRemote_60.jpg")));
		btnNewButton_3.setOpaque(false);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBounds(595, 93, 185, 185);
		getContentPane().add(btnNewButton_3);
		
		JTextPane txtpnRyey = new JTextPane();
		txtpnRyey.setEditable(false);
		txtpnRyey.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnRyey.setText("AMD Ryzen 9 3950X 16-core, 32-Thread Processor\r\n$749.99");
		txtpnRyey.setForeground(Color.BLACK);
		txtpnRyey.setBounds(10, 285, 185, 50);
		txtpnRyey.setBackground(Color.WHITE);
		getContentPane().add(txtpnRyey);
		
		JTextPane txtpnRyey_1 = new JTextPane();
		txtpnRyey_1.setEditable(false);
		txtpnRyey_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnRyey_1.setText("MSI Gaming GeForce RTX 2070 Super 8GB GDRR6\r\n$549.99");
		txtpnRyey_1.setForeground(Color.BLACK);
		txtpnRyey_1.setBackground(Color.WHITE);
		txtpnRyey_1.setBounds(205, 285, 185, 50);
		getContentPane().add(txtpnRyey_1);
		
		JTextPane txtpnRyey_2 = new JTextPane();
		txtpnRyey_2.setEditable(false);
		txtpnRyey_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnRyey_2.setText("Dell XPS 15 laptop 15.6\", 4K UHD InfinityEdge Touch\r\n$1899.99");
		txtpnRyey_2.setForeground(Color.BLACK);
		txtpnRyey_2.setBackground(Color.WHITE);
		txtpnRyey_2.setBounds(400, 285, 185, 50);
		getContentPane().add(txtpnRyey_2);
		
		JTextPane txtpnRyey_3 = new JTextPane();
		txtpnRyey_3.setEditable(false);
		txtpnRyey_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnRyey_3.setText("Fire TV Stick streaming media player with Alexa built in");
		txtpnRyey_3.setForeground(Color.BLACK);
		txtpnRyey_3.setBackground(Color.WHITE);
		txtpnRyey_3.setBounds(595, 285, 185, 50);
		getContentPane().add(txtpnRyey_3);
		
		JTextPane txtpnRyey_4 = new JTextPane();
		txtpnRyey_4.setEditable(false);
		txtpnRyey_4.setText("Samsung Galaxy S10 Factory Unlocked Phone with 128GB\r\n$599.99");
		txtpnRyey_4.setForeground(Color.BLACK);
		txtpnRyey_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnRyey_4.setBackground(Color.WHITE);
		txtpnRyey_4.setBounds(10, 538, 185, 50);
		getContentPane().add(txtpnRyey_4);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon(ElectronicsUI.class.getResource("/view_control/GalaxyS10.jpg")));
		btnNewButton_4.setOpaque(false);
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setBounds(10, 346, 185, 185);
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("");
		btnNewButton_4_1.setIcon(new ImageIcon(ElectronicsUI.class.getResource("/view_control/Ps4.jpg")));
		btnNewButton_4_1.setOpaque(false);
		btnNewButton_4_1.setContentAreaFilled(false);
		btnNewButton_4_1.setBorderPainted(false);
		btnNewButton_4_1.setBounds(205, 346, 185, 185);
		getContentPane().add(btnNewButton_4_1);
		
		JTextPane txtpnRyey_4_1 = new JTextPane();
		txtpnRyey_4_1.setEditable(false);
		txtpnRyey_4_1.setText("PlayStation 4 Pro 1TB Console\r\n$399.99");
		txtpnRyey_4_1.setForeground(Color.BLACK);
		txtpnRyey_4_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnRyey_4_1.setBackground(Color.WHITE);
		txtpnRyey_4_1.setBounds(205, 538, 185, 50);
		getContentPane().add(txtpnRyey_4_1);
		
		JButton btnNewButton_4_2 = new JButton("");
		btnNewButton_4_2.setIcon(new ImageIcon(ElectronicsUI.class.getResource("/view_control/Vizio.jpg")));
		btnNewButton_4_2.setOpaque(false);
		btnNewButton_4_2.setContentAreaFilled(false);
		btnNewButton_4_2.setBorderPainted(false);
		btnNewButton_4_2.setBounds(400, 346, 185, 185);
		getContentPane().add(btnNewButton_4_2);
		
		JTextPane txtpnRyey_4_2 = new JTextPane();
		txtpnRyey_4_2.setEditable(false);
		txtpnRyey_4_2.setText("VIZIO P-Series Quantum 65\u201D\r\n$1399.99");
		txtpnRyey_4_2.setForeground(Color.BLACK);
		txtpnRyey_4_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnRyey_4_2.setBackground(Color.WHITE);
		txtpnRyey_4_2.setBounds(400, 538, 185, 50);
		getContentPane().add(txtpnRyey_4_2);
		
		JButton btnNewButton_4_3 = new JButton("");
		btnNewButton_4_3.setIcon(new ImageIcon(ElectronicsUI.class.getResource("/view_control/OSU_55.jpg")));
		btnNewButton_4_3.setOpaque(false);
		btnNewButton_4_3.setContentAreaFilled(false);
		btnNewButton_4_3.setBorderPainted(false);
		btnNewButton_4_3.setBounds(595, 346, 185, 185);
		getContentPane().add(btnNewButton_4_3);
		
		JTextPane txtpnRyey_4_3 = new JTextPane();
		txtpnRyey_4_3.setEditable(false);
		txtpnRyey_4_3.setText("XP-Pen StarG640 6x4 Inch OSU! Ultrathin Tablet\r\n$29.99");
		txtpnRyey_4_3.setForeground(Color.BLACK);
		txtpnRyey_4_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnRyey_4_3.setBackground(Color.WHITE);
		txtpnRyey_4_3.setBounds(595, 538, 185, 50);
		getContentPane().add(txtpnRyey_4_3);
		
		
	}
}

//looks good on my computer at24 home