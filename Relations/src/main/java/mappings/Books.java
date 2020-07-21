
package mappings;

import java.util.ArrayList;
import java.util.List;

public class Books {
//	private Author author;
	private List<Authorz> author = new ArrayList<>();
     private int id;
    private String name;
    private String title;
    private double price;
    private String isbn;
    private int pages;

    public Books() {
    }

    public Books(int id, String name, String title, double price, String isbn, int pages) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.price = price;
        this.isbn = isbn;
        this.pages = pages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name=" + name + ", title=" + title + ", price=" + price + ", isbn=" + isbn + ", pages=" + pages + '}';
    }

	public List<Authorz> getAuthor() {
		return author;
	}

	public void setAuthor(List<Authorz> author) {
		this.author = author;
	}

	
    
    
}
