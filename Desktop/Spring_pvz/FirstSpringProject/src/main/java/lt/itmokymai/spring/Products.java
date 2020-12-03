package lt.itmokymai.spring;

import org.springframework.stereotype.Component;

@Component
public class Products {

	String title;
	String image;
	String desc;
	double price;
	int quantity;

	public Products() {

	}

	public String getTitle() {
		return title;
	}

	public String getImage() {
		return image;
	}

	public String getDesc() {
		return desc;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Products [title=" + title + ", image=" + image + ", desc=" + desc + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

}