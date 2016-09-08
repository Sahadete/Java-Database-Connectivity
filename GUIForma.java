/***************************

© Copyright Sahadete Jashari

***************************/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class GUIForma {
	
	static JTextField KursiID;
	static JTextField KursiEmri;
	static JTextField StudentiID;
	static JTextField StudentiEmri;
	static JTextField StudentiMbiemri;
	static JTextField StudentiKursi;
	static JButton butoni1;
	static JButton butoni2;
	
	
	
	public static void main (String [] args){
	
		
	
		JFrame frame = new JFrame("Regjistro Kurs dhe Student ne Databaze");
		frame.setSize(800,800);
		
		
		Listeneri listener = new Listeneri();
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4,1));
		
		JPanel firstPanel = new JPanel();
		firstPanel.setLayout(new FlowLayout());
		
		JPanel secondPanel = new JPanel();
		secondPanel.setLayout(new FlowLayout());
		
		JPanel thirdPanel = new JPanel();
		thirdPanel.setLayout(new FlowLayout());
		
		JPanel fourthPanel = new JPanel();
		fourthPanel.setLayout(new FlowLayout());
		
		//ID e kursit
		KursiID = new JTextField(25);
		KursiID.setToolTipText("Shkruaj ID-ne e Kursit");
		
	
		//emri i kursit
		KursiEmri = new JTextField(25);
		KursiEmri.setToolTipText("Shkruaj emrin e Kursit");
		
			
		//butoni regjistro kurs	
		butoni1 = new JButton("Regjistro Kursin");
		butoni1.addActionListener(listener);	
		
		
		//---------------------------------------------------------------------------------------
		
		//ID i studentit
		StudentiID = new JTextField(15);
		StudentiID.setToolTipText("Shkruaj ID-ne e Studentit");
		
			
		//emri i studentit	
		StudentiEmri = new JTextField(15);
		StudentiEmri.setToolTipText("Shkruaj emrin e Studentit");
			
			
		//mbiemri i studentit	
		StudentiMbiemri = new JTextField(15);
		StudentiMbiemri.setToolTipText("Shkruaj mbiemrin e Studentit");
		
		
		//kursi i studentit	
		StudentiKursi = new JTextField(15);
		StudentiKursi.setToolTipText("Shkruaj ID-ne e Kursit");
		
			
		//butoni regjistro student	
		butoni2 = new JButton("Regjistro Studentin");
		butoni2.addActionListener(listener);
		
		
		firstPanel.add(KursiID);
		firstPanel.add(KursiEmri);
		
		secondPanel.add(butoni1);
		
		thirdPanel.add(StudentiID);
		thirdPanel.add(StudentiEmri);
		thirdPanel.add(StudentiMbiemri);
		thirdPanel.add(StudentiKursi);
		
		fourthPanel.add(butoni2);
		
		
		panel.add(firstPanel);
		panel.add(secondPanel);
		panel.add(thirdPanel);
		panel.add(fourthPanel);
		
		frame.add(panel);
		
		
		frame.setVisible(true);
			
			
			
	
	}
	
	
	
	}
	
	 class Listeneri implements ActionListener {
		 
		
		 
		public void actionPerformed(ActionEvent ae){
			
			 Forma f = new Forma();
			
			if(ae.getSource() == GUIForma.butoni1)
			{	
				f.lidhuMeDb();
				f.regjistroKursin();
				
			}
			else if(ae.getSource() == GUIForma.butoni2){
					f.lidhuMeDb();
					f.regjistroStudentin();
				}
			
			
			
		}
		
	}