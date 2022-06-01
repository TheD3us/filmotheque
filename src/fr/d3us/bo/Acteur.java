package fr.d3us.bo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "acteur")
@DiscriminatorValue(value = "A")
public class Acteur extends Personne{

	
	public Acteur() {
		super();
	}
	

}
