package com.knoldus.db
import com.knoldus.models.Employee
import scala.collection.immutable.HashMap

class Employees {
  val emp : Employee = Employee("Rahul","Khowal",23,5000,"Intern","Knoldus","rahul.khowal@knoldus.com")
  val emp1 : Employee = Employee("Sakshi","Malik",22,5000,"Intern","Knoldus","sakshi.malik@knoldus.com")
  val totalEmp : HashMap[String,Employee] = HashMap("emp1"->emp,"emp2"->emp1)
}
