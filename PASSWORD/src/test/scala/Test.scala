import org.scalatest.flatspec.AnyFlatSpec

class test extends AnyFlatSpec {
  "Knoldus" should "valid" in {
    var password = new code
    var result = password.pass(password= "Knoldus@123")
    assert(result == true)
  }
}

