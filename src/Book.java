public class Book extends AbstractLibrary
{
    private String ISBN;

    public Book(String title, String author, String ISBN)
    {
        super(title, author);
        this.ISBN = ISBN;
    }

    public String getISBN()
    {
        return ISBN;
    }

    public void setISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }

    @Override
    public String getDescrption()
    {
        return this.getTitle() + " " + this.getAuthor() + " " + this.ISBN;
    }
}
