fun main(){
    var p1=Point(4,7)
    p1.gadaadgileba(5,-2)
    println(p1)
}
class Point constructor(var x:Int,var y:Int){
    var xx=0
    var yy=0
    init {
        xx=this.x
        yy=this.y
    }
    override fun  toString(): String {
        val a = xx.toString()
        val b = yy.toString()
        return ""+a+b
    }
    fun equal(point:Point,point1:Point): Boolean {

        return (point1.x==point.x && point1.y == point.y)
    }
    fun gadaadgileba(a: Int, b: Int): String {

        xx+=a
        yy+=b
        return "\nX:$xx. Y:$yy"
    }
}
class Fraction {
    var numerator: Float = 0.0F
    var denominator: Float = 0.0F

    fun printFraction() {
        println("$this.numerator} / ${this.denominator}")
    }
    override fun toString(): String {
        return "$numerator / $denominator"
    }
    fun shekveca(Fraction: Fraction): String {
        var X=Fraction.numerator
        var Y=Fraction.denominator
        var numerator1=Fraction.numerator
        var denominator1=Fraction.denominator

        numerator1 = if (numerator1 > 0) numerator1 else -numerator1
        denominator1 = if (denominator1 > 0) denominator1 else -denominator1

        while (numerator1 != denominator1) {
            if (numerator1 > denominator1)
                numerator1 -= denominator1
            else
                denominator1 -= numerator1
        }
        X/=numerator1
        Y/=denominator1
        return "$X/$Y"
    }
    fun jami(Fraction: Fraction): Any {
        return (numerator/denominator)+(Fraction.numerator/Fraction.denominator)
    }
    fun namravli(Fraction: Fraction):Any{
        return (numerator/denominator)*(Fraction.numerator/Fraction.denominator)
    }
}