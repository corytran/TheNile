package model;
import control_ap_exam.APexam;
import java.awt.*;
import java.awt.color.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.image.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;

import view_control.AmazonGUI;
import view_control.BooksUI;
import view_control.CartUI;
import view_control.ElectronicsUI;
import view_control.GamesUI;
import view_control.TodaysDealsUI;
import java.util.*;
import java.awt.image.*;
public class model{
	
public static void Deals() {
	TodaysDealsUI frame = new TodaysDealsUI();
	frame.setVisible(true);
	}
public static void Books() {
	BooksUI frame = new BooksUI();
	frame.setVisible(true);
	}
public static void Electronics() {
	ElectronicsUI frame = new ElectronicsUI();
	frame.setVisible(true);
	}
public static void Cart() {
	CartUI frame = new CartUI();
	frame.setVisible(true);
	}
public static void Games() {
	GamesUI frame = new GamesUI();
	frame.setVisible(true);
	}
public static void Amazon() {
	AmazonGUI frame = new AmazonGUI();
	frame.setVisible(true);
	}
}


