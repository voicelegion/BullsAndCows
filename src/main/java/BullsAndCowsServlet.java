import javax.servlet.RequestDispatcher;
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
        if (request.getParameter("inputField").equals("")){
            response.sendRedirect("http://localhost:8080/index.jsp");
        } else {
            String requestString = request.getParameter("inputField");
            String stringOnlyDigits = usersCombo.parseDigitString(requestString);
            String resultMessage = usersCombo.checkIfStringIsValid(stringOnlyDigits);
            request.setAttribute("msgForUser", resultMessage);
            if (resultMessage.contains("Great")){
                Result comparisionResult = ComboComparator.compareCombinations(generatedCombo,usersCombo);
                request.setAttribute("finalMSG",  comparisionResult.getMessageForUser());
            }

            RequestDispatcher rd = request.getRequestDispatcher("/BullsAndCows.jsp");
            rd.forward(request, response);

        }


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        generatedCombo.numberCombination = generatedCombo.generateCombo();
        resp.sendRedirect("http://localhost:8080/BullsAndCows.jsp");
    }


}
