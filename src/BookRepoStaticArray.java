public class BookRepoStaticArray implements IArrayList {
    private static int index = 0;
    private static final Book[] books = new Book[10];

    @Override
    public boolean save(Book book) {
        if (index == 10)
            return false;
        if (getName(book.getName()) != null)
            return false;
        books[index++] = book;
        return true;
    }

    @Override
    public Book getName(String name)  {
        for (int i = 0; i < index; i++)
            if (books[i].getName().equals(name))
                return books[i];
        return null;
    }

    public void update(int id, Book book) {
        books[id] = book;
    }

    public Book[] getAll() {
        return books;
    }

    public Book getId(int id) {
        return books[id];
    }

    @Override
    public Book delete(String name) {
        return books[index] = null;
    }


    //TODO выводить ошибки. нету книги, перебор с кол-вом, выкидывать исключения
}