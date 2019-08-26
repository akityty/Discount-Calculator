import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

@WebServlet(name = "DiscountCalculatorServlet",urlPatterns = "/calculator")
public class DiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String productDescription = request.getParameter("productDescription");
       float listPrice = Float.parseFloat(request.getParameter("listPrice"));
       float discount = Float.parseFloat(request.getParameter("discountPercent"));
       float discountPercent = discount/100;
       float discountAmount = (float) (discountPercent * listPrice*0.1);
       float discountPrice = listPrice - discountAmount;
       PrintWriter writer = response.getWriter();
       DecimalFormat df = new DecimalFormat("#");

       writer.println("<html>");
       writer.println("Discount Amout: "+df.format(discountAmount)+"$<br>");
       writer.println("Discount Price: "+df.format(discountPrice)+"$");
       writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
