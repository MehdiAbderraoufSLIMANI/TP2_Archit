package Controleur;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import ServiceEtude.Etudiant;
import ServiceEtude.EtudiantService;
public class ControleurInscription implements ActionListener {
	private IViewInscription vi;
	private EtudiantService serv;
	public ControleurInscription( IViewInscription viewInscription ,EtudiantService serv) {
	 
		this.vi = viewInscription;
		vi.setactionListener(this);
		this.serv = serv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == vi.Submit()) {

		Etudiant stud = new Etudiant(vi.getMatricule(),vi.getNom(),vi.getPrenom(),vi.getEmail(),vi.getPwd(),vi.getId_universite());
		
		
		 serv.setEtudiant(stud);
		 
		
	
			try {
				serv.inscription();
			} catch (SQLException e1) {
			
				e1.printStackTrace();
			}
			
			vi.delete_info();
			vi.setMessageBox("Done !");
			
	
		
	}else if(e.getSource() == vi.annuler()) {
		
		vi.delete_info();
	}/*else if(e.getSource() == vi.ajoutBuns()) {
	 
		vi.setMessageBox("bonus added !");
		
	}
		*/
	
	}
	

}
