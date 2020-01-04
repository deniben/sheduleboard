package dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface BaseDao<T> {

    Optional<T> get(long id);

    List<T> getAll();

    void save (T t) throws SQLException, IOException, ClassNotFoundException;

    void update(T t, String[] params);

    void delete (T t);
}
