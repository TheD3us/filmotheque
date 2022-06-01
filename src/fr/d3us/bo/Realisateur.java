package fr.d3us.bo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "realisateur")
@DiscriminatorValue(value = "R")
public class Realisateur extends Personne {
	
	
	
	public Realisateur() {
		super();
	}
	

	

}
