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
public class AmazonGUI extends MainMenu{
	public AmazonGUI() {
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
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		btnGo.setIcon(new ImageIcon(AmazonGUI.class.getResource("/view_control/MagY.PNG")));
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
		button_3.setIcon(new ImageIcon(AmazonGUI.class.getResource("/view_control/CartIcon_35.png")));
		button_3.setForeground(Color.WHITE);
		button_3.setOpaque(true);
		button_3.setOpaque(false);
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.setBounds(710, 10, 64, 32);
		panel.add(button_3);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(AmazonGUI.class.getResource("/view_control/NileLogo_35.png")));
		btnNewButton_3.setBounds(0, 1, 76, 51);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setContentAreaFilled(true);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon(AmazonGUI.class.getResource("/view_control/RyzenBig_68.jpg")));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setOpaque(true);
		btnNewButton.setBounds(10, 219, 245, 250);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(true);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(AmazonGUI.class.getResource("/view_control/OsuPad_26.jpg")));
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setContentAreaFilled(true);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(270, 219, 245, 250);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(AmazonGUI.class.getResource("/view_control/KSPPage.jpg")));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setOpaque(true);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setContentAreaFilled(true);
		btnNewButton_2.setBounds(529, 219, 245, 250);
		getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(AmazonGUI.class.getResource("/view_control/Dell XPS Background.png")));
		lblNewLabel_1.setBounds(10, 93, 764, 495);
		getContentPane().add(lblNewLabel_1);
		
		JTextPane txtpnShopThisMarch = new JTextPane();
		txtpnShopThisMarch.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtpnShopThisMarch.setText("Shop this March for All New Items");
		txtpnShopThisMarch.setBounds(185, 505, 425, 70);
		getContentPane().add(txtpnShopThisMarch);
		
		
	}
}

//looks good on my computer at home