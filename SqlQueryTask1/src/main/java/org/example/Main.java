package org.example;

import java.sql.*;

/*В реляционной БД есть таблица сотрудников с полями: id
(уникальный идентификатор, NUMBER), surname (фамилия
сотрудника, VARCHAR), experience (опыт работы, NUMBER).
Необходимо составить SQL-запрос, который вернет фамилию
сотрудника со вторым максимальным опытом работы.*/

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/colleagues_db";
        String user = "root";
        String password = "root";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    """
                        SELECT surname
                        FROM colleague
                        ORDER BY experience DESC
                        LIMIT 1 OFFSET 1;
                        """
            );

            while(resultSet.next()){
                String surname = resultSet.getString("surname");
                System.out.println(surname);
            }
            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}