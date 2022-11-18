package Controleur;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public interface IViewInscription {
	
	public int getMatricule();
	public String getNom();
	public String getPrenom();
	public String getEmail();
	public String getPwd();
	public int getId_universite();
	public void setMessageBox(String message);
	public void setactionListener(ActionListener actionListener);
	public void delete_info();
	public JButton Submit();
	public JButton annuler();
}
