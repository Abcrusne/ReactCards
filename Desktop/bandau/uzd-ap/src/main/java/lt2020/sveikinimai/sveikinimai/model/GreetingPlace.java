package lt2020.sveikinimai.sveikinimai.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lt2020.sveikinimai.vietos.model.Place;

@Entity
@Table(name = "greetings_places")
public class GreetingPlace {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.DETACH })
	@JoinColumn(name = "greeting_id")
	private Greeting greeting;

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.DETACH })
	@JoinColumn(name = "place_id")
	private Place place;

	public GreetingPlace() {
		super();
	}

	public long getId() {
		return id;
	}

	public Greeting getGreeting() {
		return greeting;
	}

	public Place getPlace() {
		return place;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

}
