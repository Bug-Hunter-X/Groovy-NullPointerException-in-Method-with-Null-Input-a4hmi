```groovy
def calculate(a, b) {
  if (a == null || b == null) {
    throw new NullPointerException("Inputs cannot be null")
  }
  return a + b
}

println calculate(5, null) // Throws NullPointerException
```