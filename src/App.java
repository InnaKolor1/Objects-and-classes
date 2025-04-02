public class App {
    public static void main(String[] args) {
        Author author1 = new Author("Стивен", "Кинг");
        Author author2 = new Author("Роберт", "Чалдини");
        Book book1 = new Book("Темная башня", author1, 2004);
        Book book2 = new Book("Психология влияния", author2, 1984);
        book1.setYear(2004);
        book2.setYear(1984);
        System.out.println("Книга: " + book1.getTitle() + ", Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", Год: " + book1.getYear());
        System.out.println("Книга: " + book2.getTitle() + ", Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", Год: " + book2.getYear());
    }
    }

