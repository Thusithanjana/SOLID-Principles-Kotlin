
interface Persistence{
    fun save(){}
}

class InvoicePersistence :Persistence{
    override fun save() {
        super.save()
    }
}

class BookPersistance: Persistence{
    override fun save() {
        super.save()
    }
}