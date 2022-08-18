package oop;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	 private String registration;
	 private String studPass;
	 
	 JTextField userText;
	 JButton login;
	 JButton back;
	 JPasswordField passText;
	 
	 Registration reg = new Registration(1);
	 
	 Login(){
		 	JLabel studLogin = new JLabel();
		 	ImageIcon imageU = new ImageIcon("user.png");
			studLogin.setIcon(imageU);
//		 	studLogin.setText("Vaccien Id");
//		 	studLogin.setFont(new Font("Sans Serif",Font.BOLD, 30));
		 	studLogin.setBounds(130,10, 200, 200);
			
			JLabel username = new JLabel();
			username.setText("Cnic No");
			username.setFont(new Font("", Font.BOLD, 15));
			username.setBounds(60, 240, 160, 30);
			
			JLabel password = new JLabel();
			password.setText("Enter Password");
			password.setFont(new Font("", Font.BOLD, 15));
			password.setBounds(60, 280, 160, 30);
			
			back = new JButton();
			back.setText("BACK");
			back.setBackground(new Color(0xebe3b4));
			back.setBorderPainted(false);
			back.setBounds(380, 410,  80, 30);
			back.setFocusable(false);
			back.addActionListener(this);
			
			login = new JButton();
//			login.setText("Login");
			ImageIcon imageLB = new ImageIcon("loginB.png");
			login.setIcon(imageLB);
			login.setBorderPainted(false);
			login.setBackground(new Color(0xebe3b4));
//			login.setForeground(Color.WHITE);
			login.setBounds(170, 330, 150, 30);
			login.setFocusable(false);
			login.addActionListener(this);
			
			userText = new JTextField();
			userText.setPreferredSize(new Dimension(200,40));
			userText.setBounds(190, 243, 200, 25);
			
			passText = new JPasswordField();
			passText.setPreferredSize(new Dimension(200,40));
			passText.setBounds(190, 283, 200, 25);
			
			this.setLayout(null);
			this.setTitle("Registration System");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(500,500);
			this.setResizable(false);
			this.setVisible(true);
			this.getContentPane().setBackground(new Color(0xebe3b4));
			
			this.add(userText);
			this.add(passText);
			this.add(studLogin);
			this.add(password);
			this.add(username);
			this.add(back);
			this.add(login);
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==back) {
			this.dispose();
			WelcomeScreen ws = new WelcomeScreen();
		}
		else if (e.getSource()==login) {

			if(userText.getText().isEmpty() || passText.getText().isEmpty() ) {
				JOptionPane.showMessageDialog(this, "Some Fields are Empty");
			}
			else {
				
				registration = userText.getText();
				studPass = passText.getText();

				int entered = 0;
			for (int i=0; i<5000; i++) {
				if(registration.equals(reg.getRegNo(i))) {
					if(studPass.equals(reg.getPass(i))) {
						JOptionPane.showMessageDialog(this, "You are succesfully Logged In");
						entered=1;
						this.dispose();
						VaccineType vt = new VaccineType();
//						Menu menu = new Menu();
					}
				}
			}
			if(entered==0) {
				JOptionPane.showMessageDialog(this, "Incorrect Cnic or Password");
			}
		}
		
	}
		
	}

}
