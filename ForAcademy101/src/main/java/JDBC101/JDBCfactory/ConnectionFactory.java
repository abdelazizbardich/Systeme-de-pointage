package JDBC101.JDBCfactory;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




    public class ConnectionFactory {
        String driverClassName = "org.postgresql.Driver";
        String connectionUrl = "jdbc:postgresql://localhost:5432/foracademy";
        String dbUser = "postgres";
        String dbPwd = "5687";

        private static ConnectionFactory connectionFactory = null;

        private ConnectionFactory() {
            try {
                Class.forName(driverClassName);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        public Connection getConnection()  {
            Connection conn = null;
            try {
                conn = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return conn;
        }

        public static ConnectionFactory getInstance() {
            if (connectionFactory == null) {
                connectionFactory = new ConnectionFactory();
            }
            return connectionFactory;
        }
    }

