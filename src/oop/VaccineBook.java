package oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

public class VaccineBook extends JFrame implements ActionListener {

    public static String vaccineName;
    JButton back;

    VaccineBook(String n){}

    VaccineBook (){
    	
    	JLabel imgLabel = new JLabel();
		ImageIcon image = new ImageIcon("vaccTime.png");
		imgLabel.setIcon(image);
		imgLabel.setBounds(0,0,500,550);
    	
    	System.out.println(vaccineName);
    	JLabel oneDose = new JLabel();
    	oneDose.setText("ONE DOSE ONLY");
    	oneDose.setFont(new Font("Algerian", Font.BOLD, 20));
    	oneDose.setBounds(100, 100, 300, 30);
    	
    	 Calendar calendar = Calendar.getInstance(); 
    	 calendar.add(Calendar.DAY_OF_YEAR, 1);
    	 Date tomorrow = calendar.getTime();
    	 calendar.add(Calendar.DAY_OF_YEAR, 7);
    	 Date next = calendar.getTime();

        JLabel vaccine = new JLabel();
        vaccine.setText(vaccineName);
        vaccine.setFont(new Font("Algerian", Font.BOLD, 30));
        vaccine.setForeground(Color.BLACK);
        if(vaccineName=="PFIZER") {vaccine.setBounds(300, 10, 400, 50);}
        else if(vaccineName=="SINOVAC") {vaccine.setBounds(300, 10, 400, 50);}
        else if(vaccineName=="SINOPHARM") {vaccine.setBounds(280, 10, 400, 50);}
        
//        vaccine.setBounds(10,10, 200, 50);
        
        JLabel firstDose = new JLabel();
        firstDose.setText(String.valueOf(tomorrow));
        firstDose.setBackground(Color.WHITE);
        firstDose.setFont(new Font("Impact", Font.BOLD, 35));
        firstDose.setBounds(20, 180, 600, 100);
        
        JLabel white = new JLabel();
        ImageIcon imageW = new ImageIcon("white.png");
        white.setIcon(imageW);
        white.setBounds(20, 180, 600, 100);
        
        JLabel secondDose = new JLabel();
        secondDose.setText(String.valueOf(next));
        secondDose.setBackground(Color.WHITE);
        secondDose.setFont(new Font("Impact", Font.BOLD, 35));
        secondDose.setBounds(20, 240, 600, 100);
        
        JLabel white2 = new JLabel();
        ImageIcon imageW2 = new ImageIcon("white.png");
        white2.setIcon(imageW2);
        white2.setBounds(20, 240, 600, 100);
        
        back = new JButton();
		back.setText("BACK");
		back.setBackground(new Color(0xFFFFFF));
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
       
        this.add(vaccine);
        this.add(back);
        this.add(firstDose);
        this.add(white);
        this.add(secondDose);
        this.add(white2);
        this.add(imgLabel);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource()==back) {
    		this.dispose();
    		EVaccineMenu evm = new EVaccineMenu();
    	}
    }
}
