import java.util.ArrayList;
import java.util.List;

public class ArrayListRepo implements IArrayList {
    List<Book> list = new ArrayList<>();

    @Override
    public boolean save(Book book) {
        list.add(book);
        return true;
    }

    @Override
    public Book getName(String name) {
        for (Book book: list) {
           if (book.getName().equals(name))
               return book;
        }
        return null;
    }

    @Override
    public Book getId(int id) {
        return list.get(id);
    }

    @Override
    public boolean delete(String name) {
        list.remove(getName(name));
        return false;
    }

    @Override
    public void update(int id, Book book) {

    }
}
