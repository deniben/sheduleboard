package servlet;

import model.SheduleDay;
import service.implementation.SheduleDayService;
import utils.EnumHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "AddSheduleDayServlet", urlPatterns = "/addsheduleday")
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
        EnumHelper enumHelper = new EnumHelper();
        String group = req.getParameter("group");
        String dayOfWeek = req.getParameter("dayOfWeek");

        String lesson1 = req.getParameter("lesson1");
        String audience1 = req.getParameter("audience1");
        String nameSurname1 = req.getParameter("nameSurname1");

        String lesson2 = req.getParameter("lesson2");
        String audience2 = req.getParameter("audience2");
        String nameSurname2 = req.getParameter("nameSurname2");

        String lesson3 = req.getParameter("lesson3");
        String audience3 = req.getParameter("audience3");
        String nameSurname3 = req.getParameter("nameSurname3");

        String lesson4 = req.getParameter("lesson4");
        String audience4 = req.getParameter("audience4");
        String nameSurname4 = req.getParameter("nameSurname4");

        String lesson5 = req.getParameter("lesson5");
        String audience5 = req.getParameter("audience5");
        String nameSurname5 = req.getParameter("nameSurname5");

        String lesson6 = req.getParameter("lesson6");
        String audience6 = req.getParameter("audience6");
        String nameSurname6 = req.getParameter("nameSurname6");

        sheduleDay.setGroup(group);
        sheduleDay.setDayOfWeek(enumHelper.getDayOfWeekString(dayOfWeek));

        sheduleDay.setLesson1(lesson1);
        sheduleDay.setAudience1(audience1);
        sheduleDay.setNameSurname1(nameSurname1);

        sheduleDay.setLesson2(lesson2);
        sheduleDay.setAudience2(audience2);
        sheduleDay.setNameSurname2(nameSurname2);

        sheduleDay.setLesson3(lesson3);
        sheduleDay.setAudience3(audience3);
        sheduleDay.setNameSurname3(nameSurname3);

        sheduleDay.setLesson4(lesson4);
        sheduleDay.setAudience4(audience4);
        sheduleDay.setNameSurname4(nameSurname4);

        sheduleDay.setLesson5(lesson5);
        sheduleDay.setAudience5(audience5);
        sheduleDay.setNameSurname5(nameSurname5);

        sheduleDay.setLesson6(lesson6);
        sheduleDay.setAudience6(audience6);
        sheduleDay.setNameSurname6(nameSurname6);

        SheduleDayService sheduleDayService = new SheduleDayService();
        try {
            sheduleDayService.save(sheduleDay);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
