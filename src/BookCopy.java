public class BookCopy {
    private String title;
    private boolean borrowed;

    public BookCopy(String title) {
        this.title = title;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public boolean borrow() {
        if (borrowed) {
            return false;
        }
        borrowed = true;
        return true;
    }

    public void returnBook() {
        borrowed = false;
    }
}