package uvsq21807569.exo4_1;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Groupe_Personnel implements Personneltype{
	private List<Personneltype> listpers ;

		public Groupe_Personnel(){
			listpers=new ArrayList <Personneltype>();
		}

		
		public void addpersonnel(Personneltype a) {

		listpers.add(a);

	}

	

		public void removepersonnel(Personneltype a) throws  
		IllegalArgumentException{

			if(this.listpers.contains(a)) {

			this.listpers.remove(a);}

			else {throw new IllegalArgumentException("cette personne que vous essayer de suprimer n existe pa au sein du groupe");}

			}

	public List<Personneltype> retournergroupe(){

		return listpers;

	}

	

	public void affichage() {
		for (Personneltype  pers :listpers) {

			pers.affichage(); 

			}

		}

		

	

	public boolean estgroupe() {
		return true;

	}
}

