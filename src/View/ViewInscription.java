package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;

import javax.swing.*;

import Controleur.IViewInscription;
public class ViewInscription extends JFrame implements IViewInscription{
	private JTextField textfield_nom ;
	private JTextField textfield_prenom ;
	private JTextField textfield_matricule ;
	private JTextField textfield_email ;
	private JTextField textfield_pwd ;
	private JTextField textfield_id_universite ; 
	private JButton btnSubmit ;
	private JButton btnAnnuler ; 
	public ViewInscription() {
		
		  this.setTitle("l'inscription"); //sets title of frame
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		  this.setResizable(false); 
		  this.setSize(512,512); 
		  this.getContentPane().setBackground(new Color(0x123456)); 
		  this.setLayout(new GridLayout(12, 2));
		  
/****************************matricule********************************************/	
		  
		  JPanel panel_matricule = new JPanel(new GridLayout(1, 2));
		  panel_matricule.setBackground(null);
		  this.add(panel_matricule);
		  
		  JLabel label_matricule = new JLabel("matricule");
		  label_matricule.setForeground(new Color(255,255,255));
		  panel_matricule.add(label_matricule);
		  
		  
		  textfield_matricule = new JTextField();
		  panel_matricule.add(textfield_matricule);
		  
/****************************nom********************************************/
		  
		  JPanel panel_nom = new JPanel(new GridLayout(1, 2));
		  panel_nom.setBackground(null);
		  this.add(panel_nom);
		  
		  JLabel label_nom = new JLabel("nom");
		  label_nom.setForeground(new Color(255,255,255));
		  panel_nom.add(label_nom);
		  
		  textfield_nom = new JTextField();
		  panel_nom.add(textfield_nom);
		  
/****************************prenom********************************************/	
		  
		  JPanel panel_prenom = new JPanel(new GridLayout(1, 2));
		  panel_prenom.setBackground(null);
		  this.add(panel_prenom);
		  
		  JLabel label_prenom = new JLabel("prenom");
		  label_prenom.setForeground(new Color(255,255,255));
		  panel_prenom.add(label_prenom);
		  
		  
		  textfield_prenom = new JTextField();
		  panel_prenom.add(textfield_prenom);
		  
/****************************email********************************************/
		  
		  JPanel panel_email = new JPanel(new GridLayout(1, 2));
		  panel_email.setBackground(null);
		  this.add(panel_email);
		  
		  JLabel label_email = new JLabel("email");
		  label_email.setForeground(new Color(255,255,255));
		  panel_email.add(label_email);
		  
		  textfield_email = new JTextField();
		  panel_email.add(textfield_email);
		  
/****************************pwd********************************************/	
		  
		  JPanel panel_pwd = new JPanel(new GridLayout(1, 2));
		  panel_pwd.setBackground(null);
		  this.add(panel_pwd);
		  
		  JLabel label_pwd = new JLabel("pwd");
		  label_pwd.setForeground(new Color(255,255,255));
		  panel_pwd.add(label_pwd);
		  
		  
		  textfield_pwd = new JTextField();
		  panel_pwd.add(textfield_pwd);
		  
/****************************id_universite********************************************/	
		  
		  JPanel panel_id_universite = new JPanel(new GridLayout(1, 2));
		  panel_id_universite.setBackground(null);
		  this.add(panel_id_universite);
		  
		  JLabel label_id_universite = new JLabel("id_universite");
		  label_id_universite.setForeground(new Color(255,255,255));
		  panel_id_universite.add(label_id_universite);
		  
		  
		  textfield_id_universite = new JTextField();
		  panel_id_universite.add(textfield_id_universite);  
		  
/****************************btnSubmit********************************************/	  
		  
		  JPanel panel_btn = new JPanel(new GridLayout(1, 2));
		  panel_btn.setBackground(null);
		  this.add(panel_btn);
		  btnSubmit= new JButton("submit");
		  panel_btn.add(btnSubmit);
		  
/****************************btnAnnuler********************************************/	  
		 
		  btnAnnuler= new JButton("annuler");
		  panel_btn.add(btnAnnuler);

 
		  this.setVisible(true); 
		
	}
	
	
	public String getMatricule(){
		return textfield_matricule.getText();
	}
	
	public String getNom() {
		return textfield_nom.getText();
	}
	
	public String getPrenom() {
		return textfield_prenom.getText();
	}
	
	public String getEmail() {
		return textfield_email.getText();
	}
	
	public String getPwd() {
		return textfield_pwd.getText();
	}
	
	public String getId_universite () {
		return  textfield_id_universite.getText();
	}
	
	public void setMessageBox(String message) {
		JOptionPane.showMessageDialog(null, message);
		 
	}
	
	public void setActionListener(ActionListener actionListener) {
		

		btnSubmit.addActionListener(actionListener);
		btnAnnuler.addActionListener(actionListener);
	}
	
	public void delete_info() {
		 textfield_matricule.setText("");
		 textfield_nom.setText("");
		 textfield_prenom.setText("");
		 textfield_email.setText("");
		 textfield_pwd.setText("");
		 textfield_id_universite.setText("");
	}

	public JButton Submit() {
		return btnSubmit;
	}
	
	public JButton annuler() {
		return btnAnnuler;
	}
 
 

}
