import java.util.Scanner;

public class Main {
    private static final Scanner scan = new Scanner(System.in);
    private static final Controller controller = new Controller();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose methods: ");
            String methodType = scan.nextLine().toUpperCase();
            String urlEndPoint = scan.nextLine();
            String request = scan.nextLine();
            String responce = null;
            switch (methodType) {
                case "POST" -> {
                    switch (urlEndPoint) {
                        case "add-book" -> responce = controller.addBook(request);
                    }
                }
                case "GET" -> {
                    switch (urlEndPoint) {
                        case "get-allBook" -> responce = controller.getBooks();
                        case "get-by-id" -> responce = controller.getBook(request);
                    }
                }
                case "PUT" -> {
                    switch (urlEndPoint) {
                        case "put" -> responce = controller.update(request);
                    }
                }
                case "DELETE" -> {
                    /*switch (urlEndPoint) {
                        case "delete" -> responce = controller.deleted(request);
                    }*/
                }
            }
            if (responce == null)
                responce = "Not Right End Point or Method Type";
            System.out.println(responce);
        }
    }
}