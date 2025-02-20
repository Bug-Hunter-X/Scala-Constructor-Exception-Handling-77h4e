```scala
class MyClass(val x: Int) {
  def this(s: String) = this(s.toInt)
  def this() = this(0) //Default constructor
}
```