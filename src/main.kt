fun main() {
    var car = Car("Jeep", "latest", "black", 5)
   car.carry(5)
    car.carry(10)
    car.identity()
    println(car.calculateParkingFee(10))
    var bus =Car.Bus("Nissan", "Lagend", "white", 28)
   bus.carry(28)
   bus.carry(30)
    bus.identity()
   println( bus.maxTripeFare(50.0))
    println(bus.calculateParkingFee(10))
}
open class Objects(var make:String, var mode:String, var colour:String, var capacity:Int){
    fun carry(people: Int) {
        var x= people - capacity
        if (capacity >= people) {
            println("Carrying $people passagers")
        } else {
            println("Over capicity by $x people")
        }
    }
    fun identity() {
        println("I am a $colour $make $mode ")

    }
   }

open class Car( make:String, mode:String,colour:String, capacity:Int):Objects(make,mode,colour,capacity) {
    fun calculateParkingFee(hour: Int): Int {
        var product = (hour * 20)
        return (product)

    }

    class Bus(make: String, mode: String, colour: String, capacity: Int) : Objects(make, mode, colour, capacity) {
        fun maxTripeFare(fare: Double): Double {
            var maximum = (fare * capacity)
            return (maximum)
        }

        fun calculateParkingFee(hours: Int): Int {
            var fee = (hours * 20)
            return (fee)
        }
    }
}