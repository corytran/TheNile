package view_control;
import control_ap_exam.APexam;
import java.awt.*;
import java.awt.color.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.image.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
public class CartUI extends MainMenu{
	public CartUI() {
		setBounds(100, 100, 800, 660);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 784, 87);
		panel.setBackground(new Color(35,47,62));
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnTodaysDeals = new JButton("Today's Deals");
		btnTodaysDeals.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnTodaysDeals.setOpaque(true);
		btnTodaysDeals.setForeground(Color.WHITE);
		btnTodaysDeals.setBorderPainted(false);
		btnTodaysDeals.setBackground(new Color(35,47,62));
		btnTodaysDeals.setBounds(89, 49, 150, 27);
		panel.add(btnTodaysDeals);
		
		JButton btnGo = new JButton("");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGo.setIcon(new ImageIcon(CartUI.class.getResource("/view_control/Mag_35.PNG")));
		btnGo.setOpaque(true);
		btnGo.setForeground(Color.WHITE);
		btnGo.setBorderPainted(false);
		btnGo.setBackground(new Color(147,79,1));
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
		btnBooks.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBooks.setOpaque(true);
		btnBooks.setForeground(Color.WHITE);
		btnBooks.setBorderPainted(false);
		btnBooks.setBackground(new Color(35,47,62));
		btnBooks.setBounds(249, 51, 150, 27);
		panel.add(btnBooks);
		
		JButton btnGames = new JButton("Games\r\n");
		btnGames.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnGames.setOpaque(true);
		btnGames.setForeground(Color.WHITE);
		btnGames.setBorderPainted(false);
		btnGames.setBackground(new Color(35,47,62));
		btnGames.setBounds(409, 51, 150, 27);
		panel.add(btnGames);
		
		JButton btnComputers = new JButton("Electronics");
		btnComputers.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnComputers.setOpaque(true);
		btnComputers.setForeground(Color.WHITE);
		btnComputers.setBorderPainted(false);
		btnComputers.setBackground(new Color(35,47,62));
		btnComputers.setBounds(569, 51, 150, 27);
		panel.add(btnComputers);
		
		JButton button_3 = new JButton("Cart");
		button_3.setIcon(new ImageIcon(CartUI.class.getResource("/view_control/CartIcon_35.png")));
		button_3.setForeground(Color.WHITE);
		button_3.setOpaque(true);
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.setBounds(710, 10, 64, 32);
		panel.add(button_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(CartUI.class.getResource("/view_control/NileLogo_35.png")));
		lblNewLabel.setBounds(0, 1, 76, 51);
		panel.add(lblNewLabel);
		
		JTextPane txtpnShoppingCart = new JTextPane();
		txtpnShoppingCart.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtpnShoppingCart.setText("Shopping Cart");
		txtpnShoppingCart.setBounds(10, 93, 215, 50);
		getContentPane().add(txtpnShoppingCart);
		
		JList list = new JList();
		list.setFont(new Font("Tahoma", Font.PLAIN, 12));
		list.setBackground(Color.PINK);
		list.setBounds(20, 145, 540, 345);
		getContentPane().add(list);
		
		JList list_1 = new JList();
		list_1.setBackground(Color.GREEN);
		list_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		list_1.setBounds(558, 145, 100, 345);
		getContentPane().add(list_1);
		
		JTextPane txtpnPrice = new JTextPane();
		txtpnPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnPrice.setText("Price");
		txtpnPrice.setBounds(622, 123, 36, 20);
		getContentPane().add(txtpnPrice);
		
		JButton btnNewButton = new JButton("Checkout");
		btnNewButton.setBackground(new Color(242,200,100));
		btnNewButton.setOpaque(true);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(668, 185, 106, 23);
		getContentPane().add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(661, 145, 123, 70);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane txtpnSubtotal = new JTextPane();
		txtpnSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnSubtotal.setBackground(new Color(240,240,240));
		txtpnSubtotal.setBounds(10, 11, 103, 25);
		panel_1.add(txtpnSubtotal);
		txtpnSubtotal.setText("Subtotal:\r\n");
		
		
	}
}

//looks good on my computer at home