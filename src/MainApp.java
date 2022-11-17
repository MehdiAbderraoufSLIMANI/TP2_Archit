
import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IJournal journal = new JournalAllMethods();
		IJournal journal1 = new JournalDateClassMessages();
		IJournal journal2 = new JournalFichierMessages();
		((JournalAllMethods) journal).ajouterjournal(journal1);
		((JournalAllMethods) journal).ajouterjournal(journal2);
		IdbConnection db=DBConnection.getDBConnection();
		IUniversiteRepository UnivRep=new UniversiteRepository(db,journal);
		IEtudiantRepository StudRep=new EtudiantRepository(db,journal);
		Etudiant stud = new Etudiant(2, "mahdi", "slimani", "mahdisil@gmail","xxxx", 123);
		//commentaire  
		EtudiantService serv=new EtudiantService(StudRep, UnivRep,journal,stud);
		try {
			serv.inscription();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
