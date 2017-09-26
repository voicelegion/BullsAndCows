import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by roman.pipchenko on 9/20/2017.
 * //
 */

public class BullsAndCowsServlet extends HttpServlet {


   private NumberCombos generatedCombo = new NumberCombos();
   private NumberCombos usersCombo = new NumberCombos();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("inputField")==null){
            response.sendRedirect("http://localhost:8080/BullsAndCows.jsp");
        } else {
            String requestString = request.getParameter("inputField");
            String processedString = usersCombo.parseDigitString(requestString);
            String resultMessage = usersCombo.checkIfStringIsValid(processedString);
            request.setAttribute("DisplayAnswer", resultMessage);
            response.sendRedirect("http://localhost:8080/BullsAndCows.jsp");
        }
//
//        Result comparationResult = ComboComparator.compareCombinations(generatedCombo,usersCombo);
//        if (requestString.equals("")) {
//            request.setAttribute("DisplayAnswer", null);
//            response.sendRedirect("http://localhost:8080/BullsAndCows.jsp");
//
//        }else{
//            request.setAttribute("DisplayAnswer", resultMessage);
//            response.sendRedirect("http://localhost:8080/BullsAndCows.jsp");
//        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        generatedCombo.generateCombo();
        resp.sendRedirect("http://localhost:8080/BullsAndCows.jsp");
    }


}
