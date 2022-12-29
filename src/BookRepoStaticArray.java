public class BookRepoStaticArray implements BookRepo {
    private static int index = 0;
    private static final Book[] books = new Book[10];

    @Override
    public boolean save(Book book) {
        if (index == 10)
            return false;
        if (get(book.getName()) != null)
            return false;
        books[index++] = book;
        return true; // добавить исключение
    }

    @Override
    public Book get(String name)  {
        for (int i = 0; i < index; i++)
            if (books[i].getName().equals(name))
                return books[i];
        return null;
    }

    public void update(int id, Book book) {
    //    books[id] = book;
    }


    public Book[] getAll() {
        return books;
    }

    public Book get(int id) {
        return books[id]; // добавить исключение
    }

    public Book delete() {
        return books[index] = null;
    }

    //TODO метод изменения какого то параметра книги. +
    //TODO выводить ошибки. нету книги, перебор с кол-вом, выкидывать исключения
    //TODO метод удаления книг с перестановкой в левую часть всех последующих книг по массиву -+
}