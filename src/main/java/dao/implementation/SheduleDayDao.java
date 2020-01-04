package dao.implementation;

import dao.BaseDao;
import dbconnection.ConnectionUtils;
import model.SheduleDay;
import utils.EnumHelper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class SheduleDayDao implements BaseDao<SheduleDay> {
    Connection connection;
    EnumHelper enumHelper = new EnumHelper();

    @Override
    public Optional<SheduleDay> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<SheduleDay> getAll() {
        return null;
    }

    @Override
    public void save(SheduleDay sheduleDay) throws SQLException, IOException, ClassNotFoundException {
            connection = ConnectionUtils.getConnection();
            String query = "INSERT INTO public.shedule_day(lesson1, audience1, name_surname1, " +
                    "lesson2, audience2, name_surname2, lesson3, audience3, name_surname3, " +
                    "lesson4, audience4, name_surname4, lesson5, audience5, name_surname5, lesson6, audience6, name_surname6, student_group, day_of_week) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, sheduleDay.getLesson1());
            preparedStatement.setString(2, sheduleDay.getAudience1());
            preparedStatement.setString(3, sheduleDay.getNameSurname1());

        preparedStatement.setString(4, sheduleDay.getLesson2());
        preparedStatement.setString(5, sheduleDay.getAudience2());
        preparedStatement.setString(6, sheduleDay.getNameSurname2());

        preparedStatement.setString(7, sheduleDay.getLesson3());
        preparedStatement.setString(8, sheduleDay.getAudience3());
        preparedStatement.setString(9, sheduleDay.getNameSurname3());

        preparedStatement.setString(10, sheduleDay.getLesson4());
        preparedStatement.setString(11, sheduleDay.getAudience4());
        preparedStatement.setString(12, sheduleDay.getNameSurname4());

        preparedStatement.setString(13, sheduleDay.getLesson5());
        preparedStatement.setString(14, sheduleDay.getAudience5());
        preparedStatement.setString(15, sheduleDay.getNameSurname5());

        preparedStatement.setString(16, sheduleDay.getLesson6());
        preparedStatement.setString(17, sheduleDay.getAudience6());
        preparedStatement.setString(18, sheduleDay.getNameSurname6());

        preparedStatement.setString(19, sheduleDay.getGroup());
        preparedStatement.setString(20, enumHelper.getStringDayOfWeek(sheduleDay.getDayOfWeek()));

        preparedStatement.execute();
        preparedStatement.close();
        connection.close();
    }

    @Override
    public void update(SheduleDay sheduleDay, String[] params) {

    }

    @Override
    public void delete(SheduleDay sheduleDay) {

    }
}
