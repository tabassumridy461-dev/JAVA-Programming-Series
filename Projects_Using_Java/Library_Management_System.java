
import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String title;
    String author;
    boolean isIssued;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    void displayBook() {
        System.out.println(
                "ID: " + id +
                " | Title: " + title +
                " | Author: " + author +
                " | Status: " + (isIssued ? "Issued" : "Available")
        );
    }
}

class Member {
    int id;
    String name;

    Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayMember() {
        System.out.println("Member ID: " + id + " | Name: " + name);
    }
}

public class LibraryManagementSystem {

    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Member> members = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    // Add Book
    static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();

        books.add(new Book(id, title, author));

        System.out.println("Book added successfully!");
    }

    // Display Books
    static void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\n----- All Books -----");

        for (Book book : books) {
            book.displayBook();
        }
    }

    // Search Book
    static void searchBook() {
        scanner.nextLine();

        System.out.print("Enter book title to search: ");
        String title = scanner.nextLine();

        boolean found = false;

        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                book.displayBook();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    // Add Member
    static void addMember() {
        System.out.print("Enter Member ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Member Name: ");
        String name = scanner.nextLine();

        members.add(new Member(id, name));

        System.out.println("Member added successfully!");
    }

    // Display Members
    static void displayMembers() {
        if (members.isEmpty()) {
            System.out.println("No members registered.");
            return;
        }

        System.out.println("\n----- All Members -----");

        for (Member member : members) {
            member.displayMember();
        }
    }

    // Issue Book
    static void issueBook() {
        System.out.print("Enter Book ID: ");
        int bookId = scanner.nextInt();

        boolean found = false;

        for (Book book : books) {
            if (book.id == bookId) {
                found = true;

                if (book.isIssued) {
                    System.out.println("Book is already issued.");
                } else {
                    book.isIssued = true;
                    System.out.println("Book issued successfully!");
                }

                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    // Return Book
    static void returnBook() {
        System.out.print("Enter Book ID: ");
        int bookId = scanner.nextInt();

        boolean found = false;

        for (Book book : books) {
            if (book.id == bookId) {
                found = true;

                if (!book.isIssued) {
                    System.out.println("This book was not issued.");
                } else {
                    book.isIssued = false;
                    System.out.println("Book returned successfully!");
                }

                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    // Main Menu
    public static void main(String[] args) {

        while (true) {

            System.out.println("\n==============================");
            System.out.println("   LIBRARY MANAGEMENT SYSTEM");
            System.out.println("==============================");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Add Member");
            System.out.println("5. Display Members");
            System.out.println("6. Issue Book");
            System.out.println("7. Return Book");
            System.out.println("8. Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    displayBooks();
                    break;

                case 3:
                    searchBook();
                    break;

                case 4:
                    addMember();
                    break;

                case 5:
                    displayMembers();
                    break;

                case 6:
                    issueBook();
                    break;

                case 7:
                    returnBook();
                    break;

                case 8:
                    System.out.println("Thank you for using Library Management System!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}



