import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by roman.pipchenko on 9/20/2017.
// */

public class BullsAndCowsServlet extends HttpServlet {
    NumberCombos numberCombos = new NumberCombos();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String received = request.getParameter("inputField");

            }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ASD");
    resp.sendRedirect("");
    }


}
