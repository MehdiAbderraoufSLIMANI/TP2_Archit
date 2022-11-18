package Journal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class JournalFichierMessages implements IJournal {

	public JournalFichierMessages() {
		File file = new File("messages.txt");
		try {
			if(file.createNewFile()) {
				 System.out.println("File created: " + file.getName());
			}else {
				System.out.println("done. " );
			}
		} catch (IOException e) {
		 
			e.printStackTrace();
		}
	}
	
	@Override
	public void outPut_Msg(String message) {
		 
		   try {
			
			   FileWriter filewrite = new FileWriter("messages.txt",true);
			   BufferedWriter bw = new BufferedWriter(filewrite);
			    bw.append(message+"\n");
			    bw.close();
			    filewrite.close();
		} catch (IOException e) {
			 
			e.printStackTrace();
		}
		 
		
	}
/*
	
	public JournalFichierMessages() {
		try {
			File file_massg = new File("messages.txt");
		      if (file_massg.createNewFile()) {
		        System.out.println("File created: " + file_massg.getName());
		      }  
		      System.out.println(file_massg.getPath());
		  	} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}
	}
	@Override
	public void outPut_Msg(String message){
		
		try {
			FileWriter fileWriter = new FileWriter("messages.txt");
			BufferedWriter info = new BufferedWriter(fileWriter);
			info.write(String.format(message));
			info.newLine();
			info.close();
			fileWriter.close();
			
			
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		     
	}
*/
}
