package production;

public class Book {

    private String title;

    public String getTitle() {
        return title;
    }



    public String getAuthor() {
        return author;
    }



    public String getSignature() {
        return signature;
    }



    public String getiSBN() {
        return iSBN;
    }



    private String  author;
    private String signature;
    private String iSBN;


    public Book() {

        this.title = "";
        this.author = "";
        this.signature = "";
        this.iSBN = "";
    }
    public Book(String title, String author, String signature, String iSBN) {

        this.title = title;
        this.author = author;
        this.signature = signature;
        this.iSBN = iSBN;

    }
}
