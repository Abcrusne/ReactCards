package lt2020.sveikinimai.sveikinimai.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class ServiceLayerGreeting {

	private Long id;
	private String name;
	private String text;
	private String image;
	private String audio;

	@Enumerated(EnumType.STRING)
	private GreetingType type;
	private String date;
	private String time;

	public ServiceLayerGreeting() {
		super();
	}

	public ServiceLayerGreeting(String name, String text, String image, String audio, GreetingType type, String date,
			String time) {
		super();
		this.name = name;
		this.text = text;
		this.image = image;
		this.audio = audio;
		this.type = type;
		this.date = date;
		this.time = time;
	}

	public ServiceLayerGreeting(Long id, String name, String text, String image, String audio, GreetingType type,
			String date, String time) {
		super();
		this.id = id;
		this.name = name;
		this.text = text;
		this.image = image;
		this.audio = audio;
		this.type = type;
		this.date = date;
		this.time = time;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
