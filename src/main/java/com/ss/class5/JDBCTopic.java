package com.ss.class5;

import java.sql.*;

public class JDBCTopic {
    private static final String URL = "jdbc:mysql://localhost:3306/java_batch?serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        //Statement statement;
        //use prepared statement prevent sql injection
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            String sql = "select * from EmployeeDetails where EmpId =?";
            preparedStatement = connection.prepareStatement(sql);
            Integer id = 121;
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("FullName"));
                System.out.println(rs.getInt("ManagerId"));
                System.out.println(rs.getString("DateOfJoining"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (preparedStatement != null)
            preparedStatement.close();
            if (connection != null)
            connection.close();
        }
    }
}

