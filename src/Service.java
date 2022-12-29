public class Service {
    private static final BookRepoStaticArray bookRepo = new BookRepoStaticArray();
    private static final Exeptions exeption = new Exeptions();

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
            s.append("\n"); // переводит на новую строчку, 2 раза экранирует
        }
        return s.toString();
    }

    public String update(int id, String paramsName, String paramsValue) {
        Book book = bookRepo.get(id);
        if (book == null)
            return "Book is not search";
        switch (paramsName) {
            case "name" -> {
                book.setName(paramsValue);
            }
            case "author" -> {
                book.setAuthor(paramsValue);
            }
            case "pageCount" -> {
                book.setPageCount(Integer.parseInt(paramsValue));
            }
        }
        bookRepo.update(id, book);
        return "OK";
    }

    public String getBook(int id) {
        return bookRepo.get(id).toString();
    }

    public String getBook(String name) {
        return bookRepo.get(name).toString();
    }

    public String delete(String name) {
        if (bookRepo.delete() == null)
            return "Deletion completed";
        return "Try again";
    }
}
