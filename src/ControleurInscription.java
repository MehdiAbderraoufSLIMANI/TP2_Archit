import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
public class ControleurInscription implements ActionListener {
	private ViewInscription vi;
	public ControleurInscription( ViewInscription viewInscription ) {
	 
		this.vi = viewInscription;
		vi.setactionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == vi.Submit()) {
		
		IJournal journal = new JournalAllMethods();
		IJournal journal1 = new JournalDateClassMessages();
		IJournal journal2 = new JournalFichierMessages();
		((JournalAllMethods) journal).ajouterjournal(journal1);
		((JournalAllMethods) journal).ajouterjournal(journal2);
		IdbConnection db=DBConnection.getDBConnection();
		IUniversiteRepository UnivRep=new UniversiteRepository(db,journal);
		IEtudiantRepository StudRep=new EtudiantRepository(db,journal);

		
		Etudiant stud = new Etudiant(vi.getMatricule(),vi.getNom(),vi.getPrenom(),vi.getEmail(),vi.getPwd(),vi.getId_universite());
		
		
		
		 
		EtudiantService serv=new EtudiantService(StudRep, UnivRep,journal,stud);
	
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
