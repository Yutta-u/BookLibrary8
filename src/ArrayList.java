public interface ArrayList {
    boolean save(Book book);
    Book get(String name);
    Book get(int id);
    void update(int id, Book book);
}
