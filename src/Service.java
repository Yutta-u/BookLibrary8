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
            s.append("\n");
        }
        return s.toString();
    }

    public String update(int id, String paramsName, String paramsValue) {
        Book book = bookRepo.getId(id);
        if (book == null)
            return "Book is not search";
        switch (paramsName) {
            case "name" -> book.setName(paramsValue);
            case "author" -> book.setAuthor(paramsValue);
            case "pageCount" -> book.setPageCount(Integer.parseInt(paramsValue));
        }
        bookRepo.update(id, book);
        return "OK";
    }

    public String getBook(int id) {
        return bookRepo.getId(id).toString();
    }

    public String getBook(String name) {
        return bookRepo.getName(name).toString();
    }

    public String delete(String name) {
        if (bookRepo.delete(name) == null)
            return "Deletion completed";
        return "Try again";
    }
}
