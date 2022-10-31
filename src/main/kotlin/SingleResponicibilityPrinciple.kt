
data class Book(
    val name:String,
    val authorName:String,
    val year:Int,
    var price:Double,
    val isbn:String
)

class Invoice(
    private val book: Book,
    private val quantity:Int,
    private val discountRate:Double,
    private val taxRate:Double,
    private var total: Double
){
    fun calculateTotal():Double{
        var price = (book.price - book.price * this.discountRate) *
                this.quantity
        return price * this.taxRate
    }

    init {
        total = calculateTotal()
    }

    fun printInvoice(){
        println("Invoice prints here")
    }

    fun saveToFile(){
        //Invoice will be saved here.
    }
}

//Applying Single Responsibility
class InvoicePersistance(
    val invoice: Invoice
){
    fun printInvoice(){
        println("Invoice prints here")
    }

    fun saveToFile(){
        //Invoice will be saved here.
    }
}
