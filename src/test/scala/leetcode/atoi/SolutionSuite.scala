package leetcode.atoi

import munit.ScalaCheckSuite
import org.scalacheck.Gen
import org.scalacheck.Prop.*

class SolutionSuite extends ScalaCheckSuite:
  val evenInts: Gen[(Int, String)] =
    for
      n                <- Gen.choose(-1000, 1000)
      whitespaceBefore <- Gen.oneOf("", " ", "   ")
      whitespaceAfter  <- Gen.oneOf("", " ", "   ")
    yield n -> s"$whitespaceBefore$n$whitespaceAfter"

  property("addition is commutative") {
    forAll(evenInts)((n, s) => Solution.myAtoi(s) == n)
  }
