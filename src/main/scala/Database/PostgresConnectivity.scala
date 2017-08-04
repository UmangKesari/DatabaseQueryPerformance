package Database

class PostgresConnectivity extends DatabaseConnectivity{
  override val url = "jdbc:postgresql://localhost:5432/postgres"
  override val driver = "org.postgresql.Driver"
  override val username = "postgres"
  override val password = "postgres"

}
