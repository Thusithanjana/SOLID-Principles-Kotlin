open class Rectangle {
    open var width: Int
    open var height: Int


    constructor(width:Int, height:Int){
        this.width = width
        this.height = height
    }


    fun getArea():Int{
        return this.width * this.height
    }


}

class Square(width: Int) : Rectangle(width,width) {
    override var width: Int
        get() = super.width
        set(value) {
            super.width = value
            super.height = value
        }

    override var height: Int
        get() = super.height
        set(value) {
            super.height = value
            super.width = value
        }


}

fun getAreaTest(r:Rectangle){
    val width = r.width
    r.height = 5

    println("Expected Area ${width * 5}, got ${r.getArea()}")

}

fun main(){
    val rectangle = Rectangle(5,7)
    val square = Square(4)

    getAreaTest(rectangle)


}