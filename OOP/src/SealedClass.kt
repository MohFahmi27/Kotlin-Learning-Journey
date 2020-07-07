import kotlin.math.roundToInt

// sealed class is to prevent any subclass to be created from limited set
sealed class Expr
class Const(val value:Int) : Expr()
class Sum(val left:Expr, val right :Expr):Expr()
object NotANumber : Expr()

fun eval(e:Expr) : Int =
        when (e) {
            is Const -> e.value
            is Sum -> eval(e.right) + eval(e.left)
            NotANumber -> java.lang.Double.NaN.roundToInt()
        }