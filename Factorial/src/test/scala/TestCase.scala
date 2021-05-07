import org.scalatest.flatspec.AnyFlatSpec

class TestCase extends AnyFlatSpec{
  val fact = new Factorial
  val abc = fact.factorial(4)
  assert(abc == 24)

}
