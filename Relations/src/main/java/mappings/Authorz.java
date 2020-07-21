
package mappings;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToOne;

public class Authorz {
   
    private int authorId;
    private String authorName;
   // @OneToOne
  //  private Book Book;
private List<Books> books = new ArrayList<>();
     public Authorz() {
    }

    public Authorz(int authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
   
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

   

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }


    @Override
    public String toString() {
        return "Author{" + "authroId=" + authorId + ", authorName=" + authorName + ", books="  + '}';
    }

	public List<Books> getBooks() {
		return books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}

//	public Book getBook() {
//		return Book;
//	}
//
//	public void setBook(mappings.Book book) {
//		Book = book;
//	}
    
    
}
