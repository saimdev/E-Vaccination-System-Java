package oop;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Registration extends JFrame implements ActionListener{
	
	private static String firstName [] = new String[5000];
    private static String lastName [] = new String[5000];
    private static String cnicNo [] = new String[5000];
    private static String age [] = new String[5000];
    private static String address [] = new String[5000];
    private static String gender [] = new String[5000];
    private static String password [] = new String[5000];
    
    private static int index = 0;
	
	JTextField fText;
    JTextField lText;
    JTextField Cnic;
    JTextField ageN;
    JTextField adrs;
    JTextField gndr;
    JTextField pswrd;
    JButton submit;
    JButton back;
    
    Registration(int i){}
	
	Registration(){
		
		JLabel backGround = new JLabel();
		ImageIcon image = new ImageIcon("rBack.png");
		backGround.setIcon(image);
		backGround.setBounds(0,0,500,500);
		
		JLabel studentReg = new JLabel();
		studentReg.setText("Vaccination Registration");
		studentReg.setFont(new Font("Algerian",Font.BOLD, 20));
		studentReg.setBounds(90,10, 700, 40);
		
		JLabel fName = new JLabel();
		fName.setText("Enter First Name");
		fName.setFont(new Font("", Font.BOLD, 15));
		fName.setBounds(55, 75, 160, 20);
		
		fText = new JTextField();
		fText.setPreferredSize(new Dimension(200,40));
		fText.setBounds(190, 73, 200, 25);
		
		JLabel lName = new JLabel();
		lName.setText("Enter Last Name");
		lName.setFont(new Font("", Font.BOLD, 15));
		lName.setBounds(55, 115, 160, 20);
		
		lText = new JTextField();
		lText.setPreferredSize(new Dimension(200,40));
		lText.setBounds(190, 113, 200, 25);
		
		JLabel cnic = new JLabel();
		cnic.setText("Enter Your Cnic ");
		cnic.setFont(new Font("", Font.BOLD, 15));
		cnic.setBounds(55, 155, 160, 20);
		
		Cnic = new JTextField();
		Cnic.setPreferredSize(new Dimension(200,40));
		Cnic.setBounds(190, 153, 200, 25);
		
		JLabel Age = new JLabel();
		Age.setText("Enter Your Age");
		Age.setFont(new Font("", Font.BOLD, 15));
		Age.setBounds(55, 195, 160, 20);
		
		ageN=  new JTextField();
		ageN.setPreferredSize(new Dimension(200,40));
		ageN.setBounds(190, 193, 200, 25);
		
		JLabel adress = new JLabel();
		adress.setText("Enter Address");
		adress.setFont(new Font("", Font.BOLD, 15));
		adress.setBounds(55, 235, 160, 20);
		
		adrs = new JTextField();
		adrs.setPreferredSize(new Dimension(200,40));
		adrs.setBounds(190, 233, 200, 25);
		
		JLabel genderMF = new JLabel();
		genderMF.setText("Enter Gender");
		genderMF.setFont(new Font("", Font.BOLD, 15));
		genderMF.setBounds(55, 275, 160, 20);
		
		JLabel mf = new JLabel();
		mf.setText("M/F/O 'O for others'");
		mf.setFont(new Font("", Font.PLAIN, 10));
		mf.setBounds(57, 288, 160, 20);
		
		gndr = new JTextField();
		gndr.setPreferredSize(new Dimension(200,40));
		gndr.setBounds(190, 273, 200, 25);
		
		JLabel pass = new JLabel();
		pass.setText("Enter Password");
		pass.setFont(new Font("", Font.BOLD, 15));
		pass.setBounds(55, 315, 160, 20);
		
		pswrd = new JTextField();
		pswrd.setPreferredSize(new Dimension(200,40));
		pswrd.setBounds(190, 313, 200, 25);
		
		submit = new JButton();
		ImageIcon imageS = new ImageIcon("submit.png");
		submit.setIcon(imageS);
		submit.setBackground(new Color(0xebe3b4));
		submit.setBorderPainted(false);
		submit.setBounds(210, 350, 50, 30);
		submit.setFocusable(false);
		submit.addActionListener(this);
		
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
		
		this.add(studentReg);
		this.add(fName);
		this.add(fText);
		this.add(lName);
		this.add(lText);
		this.add(Cnic);
		this.add(cnic);
		this.add(Age);
		this.add(ageN);
		this.add(adress);
		this.add(adrs);
		this.add(genderMF);
		this.add(mf);
		this.add(gndr);
		this.add(pass);
		this.add(pswrd);
		this.add(submit);
		this.add(back);
		this.add(backGround);
	}
	
	public String getRegNo(int i) {
		return cnicNo[i];
	}
	
	public String getPass(int i) {
		return password[i];
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==back) {
			this.dispose();
			WelcomeScreen ws = new WelcomeScreen();
		}
		else if (e.getSource()==submit) {
			if (fText.getText().isEmpty() || lText.getText().isEmpty() || Cnic.getText().isEmpty() || ageN.getText().isEmpty() || adrs.getText().isEmpty() || gndr.getText().isEmpty() || pswrd.getText().isEmpty()) {
				JOptionPane.showMessageDialog(this, "Some Fields are Empty");
			} else {
//				File file = new File("RegistrationData.txt");
//				FileWriter fr = null;
//				try {
//					fr = new FileWriter(file, true);
//					fr.write(fText.getText()+" "+lText.getText()+" "+ No.getText()+" "+Sem.getText()+" "+adrs.getText()+" "+gndr.getText()+" "+pswrd.getText());
//					fr.write(System.getProperty("line.separator"));
//
//				} catch (IOException a) {
//					a.printStackTrace();
//				} finally {
//					try {
//						fr.close();
//					} catch (IOException a) {
//						a.printStackTrace();
//					}
//				}
//			}
//				File file = new File("RegistrationData.txt");
//				FileReader fileR;
//				try {
//					fileR = new FileReader("RegistrationData.txt");
//				} catch (FileNotFoundException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
////			    FileWriter fstream = new FileWriter ("RegistrationData.txt");
//				FileWriter fw = null;
//				BufferedWriter bw = null;
//				BufferedReader br = null;
//				String line;
////				int count = 0;
////				firstName[index] = fText.getText();
////				lastName[index] = lText.getText();
////				regNo[index] = RegNo.getText();
////				semester[index] = Sem.getText();
////				address[index] = adrs.getText();
////				gender[index]= gndr.getText();
////				password[index] = pswrd.getText();
//				try {
//					fw = new FileWriter(file, true);
//					bw = new BufferedWriter(fw);
//					br = new BufferedReader(fileR);
////					for (int i=0; i<noOfLines)
//					int count=0;
////					File file = new File("Registration.txt");
//////				    FileWriter fstream = new FileWriter ("RegistrationData.txt");
////					FileWriter fw = null;
////					BufferedWriter bw = null;
////				    FileReader fileR = new FileReader("RegistrationData.txt");
////				    fileWrite
////				    BufferedWriter info = new BufferedWriter(fstream);
////				    BufferedReader br = new BufferedReader(file);
////				    info.newLine();
////				    info.write(fText.getText()+" "+lText.getText()+" "+ RegNo.getText()+" "+Sem.getText()+" "+adrs.getText()+" "+gndr.getText()+" "+pswrd.getText());
//				    while((line=br.readLine())!=null) {
//				    	count++;
//				    }
//				    for(int i=0; i<=count; i++) {
////				    	info.write(firstName[i]+" "+lastName[i]+" "+regNo[i]+" "+semester[i]+" "+address[i]+" "+gender[i]+" "+password[i]);
//				    	bw.newLine();	
//				    }
//				    bw.write(fText.getText()+" "+lText.getText()+" "+ RegNo.getText()+" "+Sem.getText()+" "+adrs.getText()+" "+gndr.getText()+" "+pswrd.getText());
////				    info.close();
////				    info.newLine();
////				    info.write(fText.getText()+" "+lText.getText()+" "+ RegNo.getText()+" "+Sem.getText()+" "+adrs.getText()+" "+gndr.getText()+" "+pswrd.getText());
////				    file.close();
//				    }
//				    catch(Exception a) {
//				    	System.out.println("A write error has occurred");
//				    	a.printStackTrace();
//				    }finally {
//				    	try {
//				    		bw.close();
//				    		fw.close();
//				    	}catch(IOException b){
//				    		b.printStackTrace();
//				    	}
//				    }
				firstName[index] = fText.getText();
				lastName[index] = lText.getText();
				cnicNo[index] = Cnic.getText();
				age[index] = ageN.getText();
				address[index] = adrs.getText();
				gender[index] = gndr.getText();
				password[index] = pswrd.getText();
				index++;

				JOptionPane.showMessageDialog(this, "Successfully Registered");
				this.dispose();
				WelcomeScreen ws = new WelcomeScreen();
			}
		}
		}
		
	

}
