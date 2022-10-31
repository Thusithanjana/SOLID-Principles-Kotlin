
interface FreeParkingLot{

}

interface HourlyFeeParkingLot{

}

interface ConstantFeeParkingLot{

}

interface PaidParkingLot:HourlyFeeParkingLot,ConstantFeeParkingLot{

}

interface ParkingLot:PaidParkingLot,FreeParkingLot{

}

class Parking(
    private val parkingLot: ParkingLot,
    private val name:String
){
    init {
        println("hello $parkingLot name")
    }
}

class A:ParkingLot{
    init {
        println("print A")
    }
}
class B:ParkingLot{
    init {
        println("print B")
    }
}

fun main(){
    val a = A()
    val b = B()

    //Dependency inversion
   val parking = Parking(b,"thusi")

}

