//package object;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class ObjectIo {
//    private static ObjectIo objectIo = new ObjectIo();
//
//    private static Connection connection;
//    private void ObjectIo(){}
//    public static ObjectIo getinstance(){return objectIo;}
//
//    public static Connection getConnection(){
//        Connection connection = null;
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection = DriverManager.getConnection(Ignore.URL.getrMsg(),"inbound",Ignore.PASSWORD.getMsg());
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//}
