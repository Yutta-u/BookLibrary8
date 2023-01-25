import java.lang.ref.SoftReference;

public class Controller {
    private static final Service service = new Service();
    public String addBook(String request) {
        String[] str = request.split(" ");
        return service.addBook(str[0], str[1], Integer.parseInt(str[2]));
    }
    public String getBooks() {
        return service.getBooks();
    }

    public String getBook(String request) {
        if (Utils.isNumeric(request))
            return service.getBook(Integer.parseInt(request));
        return service.getBook(request);
    }
    public String updateBook(String request) {
     String[] str = request.split(" ");
     int id = Integer.parseInt(str[0]);
     String paramsName = str[1];
     switch (paramsName) {
         case "author" -> str[2] = service.s\\
     }
    }
    //TODO в классе контроллер логировать параметры. sout  всех параметров
}