package lab

object Task2B {
  val nonCurriedVal: (Int, Int, Int) => Boolean = (x, y, z) => (x <= y) && (y <= z)
  val curriedVal: Int => Int => Int => Boolean = x => y => z => nonCurriedVal(x, y, z)
  def nonCurriedDef(x: Int, y: Int, z: Int): Boolean = nonCurriedVal(x, y, z)
  def curriedDef(x: Int)(y: Int)(z: Int): Boolean = nonCurriedVal(x, y, z)
}
