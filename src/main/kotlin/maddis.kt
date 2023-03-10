fun main () {

    val costOfGas = 2.28
    val mileage = 25
    // Declare the variable distance below
    val distance : Int

    println("What's your name?")
    var name = readLine()
    // Write your code below
    println("Enter Friend\'s name:")
    var friendsName = readLine()

    println("Please enter an adjective:")
    var adjective = readLine()

    println("Enter City:")
    var city = readLine()

    println("Enter the band name:")
    var bandName = readLine()

    println("Enter the job you and $friendsName will do:")
    var work = readLine()

    println("Enter distance travelled (400-600):")
    distance = Integer.valueOf(readLine())

    var totalForGas = (costOfGas / mileage)*distance
    totalForGas = Math.round(totalForGas * 100) / 100.00

    var totalMoneySaved = totalForGas + 200


    print("""
    A long time ago, $name and their friend $friendsName planned a(n) $adjective road trip to see their favorite band: $bandName. 
    The venue was $distance miles away which meant they needed to save $$totalForGas dollars to get there.
    Both of them worked as $work for the whole summer and managed to save up a total of $ $totalMoneySaved dollars!
    To celebrate, they ended up driving to $city for the whole weekend; seeing their band and buying $bandName t-shirts to remember their trip.
    """.trimIndent())
}