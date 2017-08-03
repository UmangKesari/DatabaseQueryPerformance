package Database

import java.sql.{Connection, DriverManager}

class SqliteConnectivity extends Database {
  override val url = "jdbc:sqlite:/home/knoldus/sqliteSBT.db"
  override val driver = "org.sqlite.JDBC"

  override def connection(): Connection = {
    Class.forName(driver)
    DriverManager.getConnection(url)
  }


}
