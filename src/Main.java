public class Main {
    public static void main(String[] args) {
        BookCopy copy = new BookCopy("Clean Code");

        System.out.println("Titel: " + copy.getTitle());
        System.out.println("Udlånt ved start? " + copy.isBorrowed());

        System.out.println("Første lån lykkedes? " + copy.borrow("Alice"));
        System.out.println("Udlånt nu? " + copy.isBorrowed());
        System.out.println("Låner: " + copy.getBorrower());

        System.out.println("Andet lån lykkedes? " + copy.borrow("Bob"));
        System.out.println("Udlånt stadig? " + copy.isBorrowed());
        System.out.println("Låner stadig: " + copy.getBorrower());

        copy.returnBook();
        System.out.println("Efter aflevering, udlånt? " + copy.isBorrowed());
        System.out.println("Låner efter aflevering: " + copy.getBorrower());

        System.out.println("Lån igen lykkedes? " + copy.borrow("Charlie"));
        System.out.println("Låner nu: " + copy.getBorrower());
    }
}