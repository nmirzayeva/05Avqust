# 05Avqust


1) View Holder is used for garbage, holde our view companents. For example, ReccylerView components  holds in ViewHolder

2) Handle exception is used for catching errors. It can iuse try  catch for this.


  
    fun main(args: Array<String>){
try {
val data = 20 / 0 //may throw exception.
} catch (e: ArithmeticException) {
println(e)
}
println("code below exception...")
}


3) For make codes more readable, user friendly and beautifully viewing. Also other developer can easyly read and unserstans your codes.

interface ChristmasTree {
    fun decorate(): String
}



class PineChristmasTree : ChristmasTree {

    override fun decorate() = "Christmas tree"
}

abstract class TreeDecorator
    (private val tree: ChristmasTree) : ChristmasTree {

    override fun decorate(): String {
        return tree.decorate()
    }
}



4) 




5) let takes the object it is invoked upon as the parameter and returns the result of the lambda expression.

   fun main(args: Array<String>) {
    var str = "Hello World"
    str.let { println("$it!!") }
    println(str)

}

6)  Interface Segregation Principle


7) with static keyword

8) Constructor use for declare variables for classes. They cab be used in different forms
First: class Fly(var bird:String,var plane:String){}

Second: With constructor keyword

constructor(var bird2:String,var planw2:String):this(){

// we added new variables with this keyword. And we can do implementation related to them
}

9)
  In Factory Method subclasses are responsible to create the instance of the class.

 Factory method is used when Products don't need to know how they are created.


10)

enum class FactoryTypes{
    Cottage , Villa , Mansion

}

interface AbstractFactory{


    fun buildHouse()
}

class AbstractFactoryProvider(){

    fun getFactory(house: FactoryTypes): AbstractFactory {

        return when(house){
            FactoryTypes.Cottage -> CottageHouse()
            FactoryTypes.Villa-> VillaHouse()
            FactoryTypes.Mansion -> MansionHouse()


        }

    }

}

class CottageHouse: AbstractFactory {

    override fun buildHouse() {
        TODO("Not yet implemented")
 

    }

}
class VillaHouse: AbstractFactory {


    override fun buildHouse() {
        TODO("Not yet implemented")


    }
}
class MansionHouse: AbstractFactory {


    override fun buildHouse() {
        TODO("Not yet implemented")


    }
}

fun main(){


    var abstractFactoryProvider= AbstractFactoryProvider()

    abstractFactoryProvider.getFactory(FactoryTypes.Cottage).buildHouse()
    abstractFactoryProvider.getFactory(FactoryTypes.Villa).buildHouse()
    abstractFactoryProvider.getFactory(FactoryTypes.Mansion).buildHouse()
}





11) LiveDat used in MVVM in view-model class. It use to implement view mode and its parameters. Alse we connect our Activity with wiew model class
We also can use mutableLiveData



12) MVP IS MODEL VIEW PRESENTER. Since the model and view do not communicate directly, the presenter is used as a bridge it retrieves data from the model and then it formats in a way that the view can understand.
   

13)
fun main(){
    var array= arrayOf(3,4)
    var  first= array[0]
    var second= array[1]
    var sum= first*second

    println(sum)}




14)
object Singleton {

     var a=5
}


object NotSingleton{

    var b=4

}

fun main(){

    println(Singleton.a)
    println(Singleton.a.toString())

    println(Singleton.a)
    println(Singleton.a.toString())


    println(NotSingleton.b)
    println(NotSingleton.b.toString())

    println(NotSingleton.b)
    println(NotSingleton.b.toString())





}


15) class House(var rooms: Int, var roof: Int, var type: Int, var color: Int) {
    class Builder() {

        var rooms: Int = 0
        var roof: Int = 0
        var type: Int = 0
        var color: Int = 0


        fun addRooms(rooms: Int): Builder {

            this.rooms = rooms
            return this

        }

        fun addRoof(roof: Int): Builder {
            this.roof = roof
            return this
        }

        fun addType(type: Int): Builder {
            this.type = type
            return this
        }

        fun addColor(color: Int): Builder {
            this.color = color
            return this
        }


        fun build(): House {
            return House(rooms, roof, type, color)
        }

    }


}

fun main() {

    var house: House = House.Builder().addRooms(1).addRoof(0).addType(8).addColor(5).build()

    println(house.roof)
    println(house.rooms)
    println(house.type)
    println(house.color)
}
