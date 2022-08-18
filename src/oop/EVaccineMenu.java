package oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EVaccineMenu extends JFrame implements ActionListener {

    JButton back;
    JButton pfizer;
    JButton sino;
    JButton sinovac;

    EVaccineMenu(){
        
        sinovac = new JButton();
        ImageIcon imageS = new ImageIcon("sinovac.png");
		sinovac.setIcon(imageS);
		sinovac.setBackground(new Color(0xebe3b4));
		sinovac.setBorderPainted(false);
		sinovac.setBounds(60, 350, 300, 60);
		sinovac.setFocusable(false);
		sinovac.addActionListener(this);
		
		pfizer = new JButton();
        ImageIcon imageP = new ImageIcon("pfizer.png");
        pfizer.setIcon(imageP);
        pfizer.setBackground(new Color(0xebe3b4));
        pfizer.setBorderPainted(false);
        pfizer.setBounds(170, 125, 300, 171);
        pfizer.setFocusable(false);
        pfizer.addActionListener(this);
        
        sino = new JButton();
        ImageIcon imageSP = new ImageIcon("sinopharm.png");
        sino.setIcon(imageSP);
        sino.setBackground(new Color(0xebe3b4));
        sino.setBorderPainted(false);
        sino.setBounds(30,20, 300, 110);
        sino.setFocusable(false);
        sino.addActionListener(this);
       
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

        this.add(back);
        this.add(sinovac);    
        this.add(sino);
        this.add(pfizer);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
        	this.dispose();
            VaccineType vt = new VaccineType();
        }
        else if(e.getSource()==pfizer){
            VaccineBook vcb = new VaccineBook("use");
            vcb.vaccineName="PFIZER";
            this.dispose();
            VaccineBook vb = new VaccineBook();
        }
        else if(e.getSource()==sinovac){
            VaccineBook vcb = new VaccineBook("use");
            vcb.vaccineName="SINOVAC";
            this.dispose();
            VaccineBook vb = new VaccineBook();
        }
        else if(e.getSource()==sino){
            VaccineBook vcb = new VaccineBook("use");
            vcb.vaccineName="SINOPHARM";
//            System.out.println(vcb.vaccineName);
            this.dispose();
            VaccineBook vb = new VaccineBook();
        }
    }
}
