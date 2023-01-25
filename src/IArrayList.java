public interface IArrayList {
    boolean save(Book book);
    Book getName(String name);
    Book getId(int id);
    boolean delete(String name);
    void update(int id, Book book);
}
