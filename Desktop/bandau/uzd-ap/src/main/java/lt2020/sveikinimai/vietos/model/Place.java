package lt2020.sveikinimai.vietos.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lt2020.sveikinimai.sveikinimai.model.GreetingPlace;

@Entity
@Table(name = "place")
public class Place {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	@Column(unique = true)
	private String title;
	private String image;
	@Embedded
	private Adresas adresas;
	@OneToMany(mappedBy = "place", cascade = CascadeType.ALL)
	private Set<GreetingPlace> greetingPlace;

	public Place() {
		super();
	}

	public Place(String title, String image, Set<GreetingPlace> greetingPlace) {
		super();
		this.title = title;
		this.image = image;
		this.greetingPlace = greetingPlace;
	}

}
