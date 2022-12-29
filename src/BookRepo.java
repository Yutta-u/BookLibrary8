public interface BookRepo {
    boolean save(Book book);
    Book get(String name);
    Book get(int id);
}
