class Code {

    def pal(num :Int): Int ={

      var number = 0
      var total = 0
      var temp = 0
      var count = num

      temp = count
      while ( {
        count > 0
      })
      {
        number = count % 10

        total = (total * 10) + number
        count = count / 10
      }
      total
    }
}


