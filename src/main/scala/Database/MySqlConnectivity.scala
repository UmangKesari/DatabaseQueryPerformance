package Database
import java.sql.{Connection,DriverManager}

class MySqlConnectivity extends DatabaseConnectivity {

  override val url = "com.mysql.jdbc.Driver"
  override val driver = "jdbc:mysql://localhost:3306/mysqlSBT"
  override val username = "root"
  override val password = "umangdatabase"
}