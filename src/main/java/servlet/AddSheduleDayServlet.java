package servlet;

import model.SheduleDay;
import service.implementation.SheduleDayService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name ="AddSheduleDayServlet", urlPatterns = "/addsheduleday")
public class AddSheduleDayServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Enter to doPost in AddSheduleDayServlet");

        req.getRequestDispatcher("/addsheduleday.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Enter to doPost");
        SheduleDay sheduleDay = new SheduleDay();
        String group = req.getParameter("group");

        String lesson1 = req.getParameter("lesson1");
        String audience1 = req.getParameter("audience1");
        String nameSurname1 = req.getParameter("nameSurname1");

        String lesson2 = req.getParameter("lesson2");
        String audience2 = req.getParameter("audience2");
        String nameSurname2 = req.getParameter("nameSurname2");

        String lesson3 = req.getParameter("lesson3");
        String audience3 = req.getParameter("audience3");
        String nameSurname3 = req.getParameter("nameSurname3");

        sheduleDay.setGroup(group);

        sheduleDay.setLesson1(lesson1);
        sheduleDay.setAudience1(audience1);
        sheduleDay.setNameSurname1(nameSurname1);

        sheduleDay.setLesson2(lesson2);
        sheduleDay.setAudience2(audience2);
        sheduleDay.setNameSurname2(nameSurname2);

        sheduleDay.setLesson3(lesson3);
        sheduleDay.setAudience3(audience3);
        sheduleDay.setNameSurname3(nameSurname3);

        SheduleDayService sheduleDayService = new SheduleDayService();
        try {
            sheduleDayService.save(sheduleDay);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
