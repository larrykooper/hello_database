// In Prod, we are going to do the work in SS and write out the results to Angband
// Here, we are just going to use Angband
// TODO: Put in ETL user credentials

import java.sql.DriverManager
import java.sql.Connection

object HelloDatabase {

  def run(url:String, user: String, pass: String) {
    val dbConnection = DriverManager.getConnection(url, user, pass)
    val dbStatement = dbConnection.createStatement()
    val selectQuery = "SELECT * FROM larry.employees"
    val rows = dbStatement.executeQuery(selectQuery)
    while(rows.next()) {
      val firstName = rows.getString("first_name")
      val lastName = rows.getString("last_name")
      println(firstName + " " + lastName)
    }
  }

  def main(args: Array[String]) {
    run(args(0), args(1), args(2))
  }
}