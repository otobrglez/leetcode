package leetcode.reverseinteger

import munit.ScalaCheckSuite
import org.scalacheck.Gen
import org.scalacheck.Prop.*

class SolutionSuite extends ScalaCheckSuite:
  private val examples = Gen.oneOf(
    List(
      123  -> 321,
      -123 -> -321,
      120  -> 21
    )
  )

  property("reverse") {
    forAll(examples)((obtained, expected) => assertEquals(Solution.reverse(obtained), expected))
  }
