package entities;

public class Product implements Comparable<Product> {

	private String nameProduct;
	private Double priceProduct;

	public Product(String nameProduct, Double priceProduct) {
		super();
		this.nameProduct = nameProduct;
		this.priceProduct = priceProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public Double getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(Double priceProduct) {
		this.priceProduct = priceProduct;
	}

	@Override
	public int compareTo(Product o) {

		return getPriceProduct().compareTo(o.getPriceProduct());
	}

	@Override
	public String toString() {
		StringBuilder stb = new StringBuilder();

		stb.append("Nome: " + getNameProduct() + " / " + "Preço: " + String.format("%.2f", getPriceProduct()) + "\n");

		return stb.toString();

	}

}
