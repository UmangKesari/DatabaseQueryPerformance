package Database

import java.sql.{Connection, DriverManager, SQLException, Statement}

trait Database {

  val url: String = ""
  val driver: String = ""
  val username: String = ""
  val password: String = ""

  def connection(): Connection = {
    try {
      Class.forName(driver)
      DriverManager.getConnection(url, username, password)
    }
    catch {
      case exc:SQLException => throw exc
    }
  }
  def executeQuery(query: String, connection: Connection): Long = {

    try {
      val statement  = connection.createStatement()
      val startTime = System.nanoTime()
      statement.execute(query)
      System.nanoTime() - startTime
    }
    catch {
      case exc:Exception => throw exc
    }

  }

}