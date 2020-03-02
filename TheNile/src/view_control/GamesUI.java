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
public class GamesUI extends MainMenu{
	private JTextField txtRandomTest;
	public GamesUI() {
		setBounds(100, 100, 800, 660);
		getContentPane().setBackground(new Color(45,45,45));
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
		btnGo.setIcon(new ImageIcon(GamesUI.class.getResource("/view_control/Mag_35.PNG")));
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
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(24, 26, 27));
		
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
		button_3.setIcon(new ImageIcon(GamesUI.class.getResource("/view_control/CartIcon_35.png")));
		button_3.setForeground(Color.WHITE);
		button_3.setOpaque(false);
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.setBounds(710, 10, 64, 32);
		panel.add(button_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(GamesUI.class.getResource("/view_control/NileLogo_35.png")));
		lblNewLabel.setBounds(0, 1, 76, 51);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(GamesUI.class.getResource("/view_control/Smash.jpg")));
		btnNewButton.setBounds(10, 93, 185, 185);
		btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(GamesUI.class.getResource("/view_control/EU4.jpg")));
		btnNewButton_1.setSelectedIcon(new ImageIcon(GamesUI.class.getResource("/view_control/RTX.jpg")));
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(205, 93, 185, 185);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(GamesUI.class.getResource("/view_control/Stellaris2.jpg")));
		btnNewButton_2.setSelectedIcon(new ImageIcon(GamesUI.class.getResource("/view_control/Invent.jpg")));
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBounds(400, 93, 185, 185);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(GamesUI.class.getResource("/view_control/KSP.jpg")));
		btnNewButton_3.setSelectedIcon(new ImageIcon(GamesUI.class.getResource("/view_control/AmazonRemote_60.jpg")));
		btnNewButton_3.setOpaque(false);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBounds(595, 93, 185, 185);
		getContentPane().add(btnNewButton_3);
		
		JTextPane txtpnRyey = new JTextPane();
		txtpnRyey.setEditable(false);
		txtpnRyey.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnRyey.setText("Super Smash Bros. Ultimate\r\n$59.99");
		txtpnRyey.setForeground(new Color(89,183,255));
		txtpnRyey.setBounds(10, 285, 185, 50);
		txtpnRyey.setBackground(new Color(45,45,45));
		getContentPane().add(txtpnRyey);
		
		JTextPane txtpnRyey_1 = new JTextPane();
		txtpnRyey_1.setEditable(false);
		txtpnRyey_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnRyey_1.setText("Europa Universalis IV\r\n$39.99");
		txtpnRyey_1.setForeground(new Color(89, 183, 255));
		txtpnRyey_1.setBackground(new Color(45, 45, 45));
		txtpnRyey_1.setBounds(205, 285, 185, 50);
		getContentPane().add(txtpnRyey_1);
		
		JTextPane txtpnRyey_2 = new JTextPane();
		txtpnRyey_2.setEditable(false);
		txtpnRyey_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnRyey_2.setText("Stellaris - Galaxy Edition\r\n$69.99");
		txtpnRyey_2.setForeground(new Color(89, 183, 255));
		txtpnRyey_2.setBackground(new Color(45, 45, 45));
		txtpnRyey_2.setBounds(400, 285, 185, 50);
		getContentPane().add(txtpnRyey_2);
		
		JTextPane txtpnRyey_3 = new JTextPane();
		txtpnRyey_3.setEditable(false);
		txtpnRyey_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnRyey_3.setText("Kerbal Space Program\r\n$39.99");
		txtpnRyey_3.setForeground(new Color(89, 183, 255));
		txtpnRyey_3.setBackground(new Color(45, 45, 45));
		txtpnRyey_3.setBounds(595, 285, 185, 50);
		getContentPane().add(txtpnRyey_3);
		
		JTextPane txtpnRyey_4 = new JTextPane();
		txtpnRyey_4.setEditable(false);
		txtpnRyey_4.setText("Milkman: A Novel Paperback \u2013 Anna Burns\r\n$7.99");
		txtpnRyey_4.setForeground(new Color(89, 183, 255));
		txtpnRyey_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnRyey_4.setBackground(new Color(45, 45, 45));
		txtpnRyey_4.setBounds(10, 538, 185, 50);
		getContentPane().add(txtpnRyey_4);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon(GamesUI.class.getResource("/view_control/RLeague2.jpg")));
		btnNewButton_4.setOpaque(false);
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setBounds(10, 346, 185, 185);
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("");
		btnNewButton_4_1.setIcon(new ImageIcon(GamesUI.class.getResource("/view_control/Witcher.jpg")));
		btnNewButton_4_1.setOpaque(false);
		btnNewButton_4_1.setContentAreaFilled(false);
		btnNewButton_4_1.setBorderPainted(false);
		btnNewButton_4_1.setBounds(205, 346, 185, 185);
		getContentPane().add(btnNewButton_4_1);
		
		JTextPane txtpnRyey_4_1 = new JTextPane();
		txtpnRyey_4_1.setEditable(false);
		txtpnRyey_4_1.setText("Witcher 3: Wild Hunt Complete Edition - PlayStation 4...\r\n$79.99");
		txtpnRyey_4_1.setForeground(new Color(89, 183, 255));
		txtpnRyey_4_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnRyey_4_1.setBackground(new Color(45, 45, 45));
		txtpnRyey_4_1.setBounds(205, 538, 185, 50);
		getContentPane().add(txtpnRyey_4_1);
		
		JButton btnNewButton_4_2 = new JButton("");
		btnNewButton_4_2.setIcon(new ImageIcon(GamesUI.class.getResource("/view_control/FF_1_55.jpg")));
		btnNewButton_4_2.setOpaque(false);
		btnNewButton_4_2.setContentAreaFilled(false);
		btnNewButton_4_2.setBorderPainted(false);
		btnNewButton_4_2.setBounds(400, 346, 185, 185);
		getContentPane().add(btnNewButton_4_2);
		
		JTextPane txtpnRyey_4_2 = new JTextPane();
		txtpnRyey_4_2.setEditable(false);
		txtpnRyey_4_2.setText("Final Fantasy VII Remake - PlayStation 4 Deluxe Edition\r\n$79.99");
		txtpnRyey_4_2.setForeground(new Color(89, 183, 255));
		txtpnRyey_4_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnRyey_4_2.setBackground(new Color(45, 45, 45));
		txtpnRyey_4_2.setBounds(400, 538, 185, 50);
		getContentPane().add(txtpnRyey_4_2);
		
		JButton btnNewButton_4_3 = new JButton("");
		btnNewButton_4_3.setIcon(new ImageIcon(GamesUI.class.getResource("/view_control/OSU_55.jpg")));
		btnNewButton_4_3.setOpaque(false);
		btnNewButton_4_3.setContentAreaFilled(false);
		btnNewButton_4_3.setBorderPainted(false);
		btnNewButton_4_3.setBounds(595, 346, 185, 185);
		getContentPane().add(btnNewButton_4_3);
		
		JTextPane txtpnRyey_4_3 = new JTextPane();
		txtpnRyey_4_3.setEditable(false);
		txtpnRyey_4_3.setText("XP-Pen StarG640 6x4 Inch OSU! Ultrathin Tablet Draw...\r\n$29.99");
		txtpnRyey_4_3.setForeground(new Color(89, 183, 255));
		txtpnRyey_4_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnRyey_4_3.setBackground(new Color(45, 45, 45));
		txtpnRyey_4_3.setBounds(595, 538, 185, 50);
		getContentPane().add(txtpnRyey_4_3);
		
		
	}
}

//looks good on my computer at24 home