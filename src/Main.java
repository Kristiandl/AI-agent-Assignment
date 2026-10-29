public class Main {
    public static void main(String[] args) {
        BookCopy copy = new BookCopy("Clean Code");

        System.out.println("Titel: " + copy.getTitle());
        System.out.println("Udlånt ved start? " + copy.isBorrowed());

        System.out.println("Første lån lykkedes? " + copy.borrow());
        System.out.println("Udlånt nu? " + copy.isBorrowed());

        System.out.println("Andet lån lykkedes? " + copy.borrow());
        System.out.println("Udlånt stadig? " + copy.isBorrowed());

        copy.returnBook();
        System.out.println("Efter aflevering, udlånt? " + copy.isBorrowed());

        System.out.println("Lån igen lykkedes? " + copy.borrow());
    }
}