public class BookCopy {
    private String title;
    private String borrower;
    private boolean borrowed;

    public BookCopy(String title) {
        this.title = title;
        this.borrower = null;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getBorrower() {
        return borrower;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public boolean borrow(String borrowerName) {
        if (borrowed) {
            return false;
        }
        if (borrowerName == null || borrowerName.isEmpty()) {
            return false;
        }

        borrowed = true;
        borrower = borrowerName;
        return true;
    }

    public void returnBook() {
        borrowed = false;
        borrower = null;
    }
}