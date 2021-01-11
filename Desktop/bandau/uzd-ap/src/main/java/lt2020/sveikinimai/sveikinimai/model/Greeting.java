package lt2020.sveikinimai.sveikinimai.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Greeting {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;
	private String text;
	private String image;
	private String audio;
	@Enumerated(EnumType.STRING)
	private GreetingType type;
	private String date;
	private String time;

	@OneToMany(mappedBy = "greeting", cascade = CascadeType.ALL)
	private Set<GreetingPlace> greetingPlaces;

	public Greeting() {
		super();
	}

	public Greeting(String name, String text, String image, String audio,
			lt2020.sveikinimai.sveikinimai.model.GreetingType type, String date, String time) {
		super();
		this.name = name;
		this.text = text;
		this.image = image;
		this.audio = audio;
		this.type = type;
		this.date = date;
		this.time = time;
		this.greetingPlaces = new HashSet<>();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getText() {
		return text;
	}

	public String getImage() {
		return image;
	}

	public String getAudio() {
		return audio;
	}

	public GreetingType getType() {
		return type;
	}

	public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}

	public Set<GreetingPlace> getGreetingPlaces() {
		return greetingPlaces;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	public void setType(GreetingType type) {
		this.type = type;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setGreetingPlaces(Set<GreetingPlace> greetingPlaces) {
		this.greetingPlaces = greetingPlaces;
	}

}
