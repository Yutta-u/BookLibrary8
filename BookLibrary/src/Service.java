public class Service {
    private static final BookRepoStaticArray bookRepo = new BookRepoStaticArray();
    public String addBook(String name, String author, int pageCount) {
        if (Utils.isEmpty(name) || Utils.isEmpty(author) || pageCount < 0)
            return "ERROR-PARAMS";
        Book book = new Book(name, author, pageCount);
        if (bookRepo.save(book))
            return "OK";
        else return "ERROR";
    }
    public String getBooks() {
        Book[] books = bookRepo.getAll();
        StringBuilder s = new StringBuilder("");
        for (Book value : books) {
            if (value == null)
                break;
            s.append(value);
            s.append("\\n"); // переводит на новую строчку, 2 раза экранирует
        }
        return s.toString();
    }

    public String getBook(int id) {
        return bookRepo.get(id).toString();
    }

    public String getBook(String name) {
        return bookRepo.get(name).toString();
    }
}
