package oop;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WelcomeScreen extends JFrame implements ActionListener{
	
	JButton regist;
	JButton login;
	
	WelcomeScreen(){
		
		JLabel imgLabel = new JLabel();
		ImageIcon image = new ImageIcon("Vaccination1.png");
		imgLabel.setIcon(image);
		imgLabel.setBounds(0,0,500,500);
		
		JLabel registration = new JLabel();
		registration.setText("VACCINATION REGISTRATION ");
		registration.setFont(new Font("Sans Serif",Font.BOLD, 20));
		registration.setBounds(100, 7, 700, 20);

		regist = new JButton();
		ImageIcon imageR = new ImageIcon("regist.png");
		regist.setIcon(imageR);
//		regist.setText("Registration");
		regist.setBorderPainted(false);
		regist.setBackground(new Color(0xebe3b4));
//		regist.setForeground(Color.WHITE);
		regist.setFocusable(false);
		regist.setBounds(350,20,100,100);
		regist.addActionListener(this);
		
		login = new JButton();
		ImageIcon imageL = new ImageIcon("login.png");
		login.setIcon(imageL);
//		login.setText("Login");
		login.setBorderPainted(false);
		login.setBackground(new Color(0xebe3b4));
//		login.setForeground(Color.WHITE);
		login.setFocusable(false);
		login.setBounds(250, 250,70, 50);
		login.addActionListener(this);

		this.setLayout(null);
		this.setTitle("Registration System");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setResizable(false);
		this.setVisible(true);
		this.getContentPane().setBackground(new Color(0xFFFFFF));
		
//		this.add(registration);
//		this.add(registLabel);
		this.add(regist);
		this.add(login);
		this.add(imgLabel);

	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==regist) {
			this.dispose();
			Registration reg = new Registration();
		}
		else if(e.getSource()==login) {
			this.dispose();
			Login log = new Login();
		}

	}
}
