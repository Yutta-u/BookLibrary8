import java.util.Scanner;

public class Main {
    private static final Scanner scan = new Scanner(System.in);
    private static final Controller controller = new Controller();

    public static void main(String[] args) throws ClassNotFoundException {
        while (true) {
            try {
                System.out.println("Choose methods: ");
                String methodType = scan.nextLine().toUpperCase();
                String urlEndPoint = scan.nextLine();
                String request = scan.nextLine();
                Method method = Method.valueOf(methodType);
                String responce = null;
                switch (method) {
                    case POST -> {
                        if ("add-book".equals(urlEndPoint)) {
                            responce = controller.addBook(request);
                        }
                    }
                    case GET -> {
                        switch (urlEndPoint) {
                            case "get-allBook" -> responce = controller.getBooks();
                            case "get-by-id" -> responce = controller.getBook(request);
                        }
                    }
                    case PUT -> {
                        if ("put".equals(urlEndPoint)) {
                            responce = controller.update(request);
                        }
                    }
                    case DELETE -> {
                        if ("delete-all".equals(urlEndPoint)) {
                            responce = controller.delete(request);
                        }
                    }
                }
                if (responce == null)
                    responce = "Not Right End Point or Method Type";
                System.out.println(responce);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}