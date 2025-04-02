public class App {
    public static void main(String[] args) {
        Author author1 = new Author("Стивен", "Кинг");
        Author author2 = new Author("Роберт", "Чалдини");
        Book book1 = new Book("Темная башня", author1, 2004);
        Book book2 = new Book("Психология влияния", author2, 1984);
        book1.setYear(1950);
        System.out.println("Книга: " + book1+ ", Автор: " + author1 + " Год: " + 2004);
        System.out.println("Книга: " + book2+ ", Автор: " + author2+ "Год: " + 1984);
    }
}