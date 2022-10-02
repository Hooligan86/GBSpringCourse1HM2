import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "FirstServlet", urlPatterns = "/first_servlet")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> listOfProducts = new ArrayList<>();
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        listOfProducts.add(new Product(1,"milk", 2.0d));
        listOfProducts.add(new Product(2,"water", 1.0d));
        listOfProducts.add(new Product(3,"cake", 3.0d));
        listOfProducts.add(new Product(4,"bananas", 2.5d));
        listOfProducts.add(new Product(5,"avocado", 1.75d));
        listOfProducts.add(new Product(6,"bread", 3.25d));
        listOfProducts.add(new Product(7,"meat", 5.0d));
        listOfProducts.add(new Product(8,"spaghetti", 4.0d));
        listOfProducts.add(new Product(9,"beer", 3.5d));
        listOfProducts.add(new Product(10,"potato", 2.0d));
        for (Product listOfProduct : listOfProducts) {
            out.printf("<html><body><h3>Product id: "+ listOfProduct.getId() + " title: " + listOfProduct.getTitle() + " cost: " + listOfProduct.getCost() + "</h3></body></html>\n");
        }
    }
}
