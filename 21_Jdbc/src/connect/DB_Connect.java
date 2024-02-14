package connect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB_Connect {

  public static Connection getConnection() {
    
    Connection con = null;
    
    try (BufferedReader reader = new BufferedReader(new FileReader("src/db.properties"))) {
      
      Class.forName("oracle.jdbc.OracleDriver"); //Oracle JDBC 드라이버 클래스를 로드합니다.
      
      Properties p = new Properties(); //db.properties 파일에서 연결 정보를 읽어
      p.load(reader);
      
      con = DriverManager.getConnection(p.getProperty("url"), p.getProperty("user"), p.getProperty("password")); //데이터베이스에 연결을 수립합니다.
      
    } catch (Exception e) {
    //예외가 발생하면 스택 트레이스를 출력합니
      e.printStackTrace();
    }
    
    return con;
    
  }
    
}