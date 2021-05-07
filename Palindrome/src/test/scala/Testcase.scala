import org.scalatest.flatspec.AnyFlatSpec

class testCase extends AnyFlatSpec{
  var num = new Code
  var obj = num.pal(1234321)
  assert(obj == 1234321)

}


