package oop;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VaccineType extends JFrame implements ActionListener{
	
	JCheckBox eVaccine;
	JCheckBox hVaccine;
	JButton ok;
	JButton back;
	
	VaccineType(){
		
		JLabel choose = new JLabel();
		choose.setText("Choose Vaccine Type");
		choose.setBounds(150, 130, 300, 30);
		choose.setFont(new Font("Bauhaus 93", Font.BOLD, 20));
		
		eVaccine = new JCheckBox("E-Vaccine");
		eVaccine.setBackground(new Color(0xebe3b4));
		eVaccine.setBounds(200, 180, 100, 30);
		
		hVaccine = new JCheckBox("H-Vaccine");
		hVaccine.setBackground(new Color(0xebe3b4));
		hVaccine.setBounds(200, 230, 100, 30);
		
		ButtonGroup group = new ButtonGroup();
		group.add(hVaccine);
		group.add(eVaccine);
		
		ok = new JButton();
		ImageIcon imageK = new ImageIcon("ok.png");
		ok.setIcon(imageK);
//		ok.setText("OK");
		ok.setBorderPainted(false);
//		ok.setForeground(Color.WHITE);
		ok.setBackground(new Color(0xaebe3b4));
		ok.setBounds(220, 260, 50, 50);
		ok.setFocusable(false);
		ok.addActionListener(this);
		
		back = new JButton();
		back.setText("BACK");
		back.setBackground(new Color(0xebe3b4));
		back.setBorderPainted(false);
		back.setBounds(380, 410,  80, 30);
		back.setFocusable(false);
		back.addActionListener(this);
		
		this.setLayout(null);
        this.setTitle("Registration System");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0xebe3b4));
        
        this.add(choose);
        this.add(eVaccine);
        this.add(hVaccine);
        this.add(ok);
        this.add(back);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ok) {
			if(eVaccine.isSelected()) {
				this.dispose();
				EVaccineMenu evm = new EVaccineMenu();
			}
			else if(hVaccine.isSelected()) {
				JOptionPane.showMessageDialog(this, "Go To CMH Hospital");
				WelcomeScreen ws = new WelcomeScreen();
			}
		}
		else if(e.getSource()==back) {
			this.dispose();
			WelcomeScreen ws = new WelcomeScreen();
		}
	}

}
