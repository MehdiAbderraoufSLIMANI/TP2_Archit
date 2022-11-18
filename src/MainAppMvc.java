
public class MainAppMvc {

	public static void main(String[] args) {
		IJournal journal = new JournalAllMethods();
		IJournal journal1 = new JournalDateClassMessages();
		IJournal journal2 = new JournalFichierMessages();
		((JournalAllMethods) journal).ajouterjournal(journal1);
		((JournalAllMethods) journal).ajouterjournal(journal2);
		IdbConnection db=DBConnection.getDBConnection();
		IUniversiteRepository UnivRep=new UniversiteRepository(db,journal);
		IEtudiantRepository StudRep=new EtudiantRepository(db,journal);

	
		EtudiantService serv=new EtudiantService(StudRep, UnivRep,journal);
		
		IViewInscription viewInscription = new ViewInscription();
		ControleurInscription controleurInscription = new ControleurInscription(viewInscription,serv);

	}

}
