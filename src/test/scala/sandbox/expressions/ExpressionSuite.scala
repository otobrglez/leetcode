package sandbox.expressions
import sandbox.expressions.Expr.*

enum Expr[N](using num: Numeric[N]):
  case Num(value: N)(using num: Numeric[N])
  case Add(left: Expr[N], right: Expr[N])(using num: Numeric[N])
  case Mul(left: Expr[N], right: Expr[N])(using num: Numeric[N])

  def eval: N = this match
    case Num(value)       => value
    case Add(left, right) => num.plus(left.eval, right.eval)
    case Mul(left, right) => num.times(left.eval, right.eval)

class ExpressionSuite extends munit.FunSuite:
  test("how about this"):
    val exp1 = Add(Num(3), Mul(Num(7), Num(2)))
    val exp2 = Mul(Add(Num(1.2f), Num(2.3f)), Num(3)) // notice the 3 (Int) here.

    assertEquals(exp1.eval, 17)
    assertEquals(exp2.eval, 10.5f)


