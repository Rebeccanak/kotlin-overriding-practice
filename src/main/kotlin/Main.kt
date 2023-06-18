fun main() {
    val banker = Banker("David",30)
banker.eat()
    banker.sleep()
    banker.countNoney(arrayOf(20,65,5,6,90))

    val doctor = Doctor("Bridget",50)
    doctor.eat()
    doctor.talk("Hello what is wrong")
    doctor.treatPatient("Rebecca","Malaria")

    println(banker.countNoney(arrayOf(20,65,5,6,90)))
    val farmer = Farmer("Rachel",40)
    farmer.eat()
    farmer.talk("Lets dig")
    farmer.cultivateLand()
}
 open class Person(var name:String, var age:Int){
    fun talk(words:String){
        println(words)
    }
    fun eat(){
        println("yumy")
    }
    fun sleep(){
        println("zzzz")
}

}
class Banker(name:String, age:Int): Person(name,age){


    fun countNoney(notes:Array<Int>):Int{
        return notes.sum()
    }
}
class Doctor( name:String,  age: Int):Person(name,age){

    fun treatPatient(patient:String,disease:String){
        println("treating $patient for $disease")
    }
}
class Farmer( name:String,  age:Int):Person(name, age){

    fun cultivateLand(){
        println("dig dig dig")
    }
}