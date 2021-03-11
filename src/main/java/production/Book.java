public class Book {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getiSBN() {
        return iSBN;
    }

    public void setiSBN(String iSBN) {
        this.iSBN = iSBN;
    }

    private String  author;
    private String signature;
    private String iSBN;

    public Book(String title, String author, String signature, String iSBN) {

        this.title = title;
        this.author = author;
        this.signature = signature;
        this.iSBN = iSBN;

    }
    public Book() {

        this.title = "";
        this.author = "";
        this.signature = "";
        this.iSBN = "";
    }
}
