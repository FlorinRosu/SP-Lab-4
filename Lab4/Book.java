import java.util.ArrayList;
import java.util.List;


public final class Book extends Section {

    private final String bt;
    private final List<Author> authors;
    public final String getBt() {
        return this.bt;
    }
    public final List<Author> getAuthors() {
        return this.authors;
    }

    public final void addAuthor( Author author) {
        this.authors.add(author);
    }

    public final void addContent(Element element) {
        super.add(element);
    }

    public void print() {

        for (Author author : this.authors) {
            String var3 = "Authors:";
            boolean var4 = false;
            System.out.println(var3);
            author.print();
        }

        super.print();
    }

    public Book(String Booktitle) {
        super(Booktitle);
        this.bt = Booktitle;
        boolean var2 = false;
        this.authors = (new ArrayList<>());
    }
}