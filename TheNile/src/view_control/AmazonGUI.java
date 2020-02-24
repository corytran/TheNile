package view_control;
import control_ap_exam.APexam;
import java.awt.*;
import java.awt.color.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
public class AmazonGUI extends MainMenu{
	public AmazonGUI() {
		getContentPane().setBackground(new Color(45,45,45));
		getContentPane().setLayout(null);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setBounds(755, 10, 17, 574);
		getContentPane().add(scrollbar);
		
		Panel panel = new Panel();
		panel.setBounds(10, 0, 739, 76);
		panel.setBackground(new Color(35,57,92));
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("hello");
			}
		});
		btnNewButton.setBackground(new Color(35,57,92));
		btnNewButton.setOpaque(true);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(10, 11, 39, 23);
		panel.add(btnNewButton);
		
		JButton btnClothing = new JButton("Clothing\r\n");
		btnClothing.setOpaque(true);
		btnClothing.setForeground(Color.WHITE);
		btnClothing.setBorderPainted(false);
		btnClothing.setBackground(new Color(35,57,92));
		btnClothing.setBounds(52, 42, 73, 23);
		panel.add(btnClothing);
		
		JButton btnGames = new JButton("Games");
		btnGames.setOpaque(true);
		btnGames.setForeground(Color.WHITE);
		btnGames.setBorderPainted(false);
		btnGames.setBackground(new Color(35,57,92));
		btnGames.setBounds(165, 42, 65, 23);
		panel.add(btnGames);
		
		JButton btnComputers = new JButton("Computers");
		btnComputers.setOpaque(true);
		btnComputers.setForeground(Color.WHITE);
		btnComputers.setBorderPainted(false);
		btnComputers.setBackground(new Color(35,57,92));
		btnComputers.setBounds(215, 42, 85, 23);
		panel.add(btnComputers);
		
		JButton btnTodaysDeals = new JButton("Today's Deals");
		btnTodaysDeals.setOpaque(true);
		btnTodaysDeals.setForeground(Color.WHITE);
		btnTodaysDeals.setBorderPainted(false);
		btnTodaysDeals.setBackground(new Color(35,57,92));
		btnTodaysDeals.setBounds(285, 42, 99, 23);
		panel.add(btnTodaysDeals);
		
		JButton btnBooks = new JButton("Books");
		btnBooks.setOpaque(true);
		btnBooks.setForeground(Color.WHITE);
		btnBooks.setBorderPainted(false);
		btnBooks.setBackground(new Color(35,57,92));
		btnBooks.setBounds(116, 42, 61, 23);
		panel.add(btnBooks);
		
		JButton btnGiftCards = new JButton("Gift Cards");
		btnGiftCards.setOpaque(true);
		btnGiftCards.setForeground(Color.WHITE);
		btnGiftCards.setBorderPainted(false);
		btnGiftCards.setBackground(new Color(35, 57, 92));
		btnGiftCards.setBounds(369, 42, 81, 23);
		panel.add(btnGiftCards);
		
		JButton btnGo = new JButton("Go");
		btnGo.setOpaque(true);
		btnGo.setForeground(Color.WHITE);
		btnGo.setBorderPainted(false);
		btnGo.setBackground(new Color(147,79,1));
		btnGo.setBounds(673, 11, 56, 23);
		panel.add(btnGo);
		
		TextField textField = new TextField();
		textField.setBounds(47, 11, 620, 23);
		panel.add(textField);
		textField.setText("Search the Nile");
		textField.setFont(new Font("SansSerif", Font.PLAIN, 12));
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(24, 26, 27));
		
		JButton btnNileBuisness = new JButton("Nile Buisness");
		btnNileBuisness.setOpaque(true);
		btnNileBuisness.setForeground(Color.WHITE);
		btnNileBuisness.setBorderPainted(false);
		btnNileBuisness.setBackground(new Color(35, 57, 92));
		btnNileBuisness.setBounds(434, 42, 99, 23);
		panel.add(btnNileBuisness);
		
		JButton btnSell = new JButton("Sell");
		btnSell.setOpaque(true);
		btnSell.setForeground(Color.WHITE);
		btnSell.setBorderPainted(false);
		btnSell.setBackground(new Color(35, 57, 92));
		btnSell.setBounds(518, 42, 56, 23);
		panel.add(btnSell);
		
		JButton btnHelp = new JButton("Help\r\n");
		btnHelp.setOpaque(true);
		btnHelp.setForeground(Color.WHITE);
		btnHelp.setBorderPainted(false);
		btnHelp.setBackground(new Color(35, 57, 92));
		btnHelp.setBounds(554, 42, 65, 23);
		panel.add(btnHelp);
		
		JButton btnOrders = new JButton("Orders");
		btnOrders.setOpaque(true);
		btnOrders.setForeground(Color.WHITE);
		btnOrders.setBorderPainted(false);
		btnOrders.setBackground(new Color(35, 57, 92));
		btnOrders.setBounds(599, 42, 73, 23);
		panel.add(btnOrders);
		
	}
}