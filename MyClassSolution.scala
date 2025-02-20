```scala
class MyClass(val x: Int) {
  def this(s: String) = {
    try {
      this(s.toInt)
    } catch {
      case e: NumberFormatException => this(0) // Fallback to 0 on error
    }
  }
  def this() = this(0) // Default constructor
}
```