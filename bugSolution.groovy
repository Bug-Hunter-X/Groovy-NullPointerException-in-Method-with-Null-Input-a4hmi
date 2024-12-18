```groovy
def calculate(a, b) {
  if (a == null || b == null) {
    return 0 //Or handle it in another suitable way e.g., logging, throwing a custom exception  
  }
  return a + b
}

println calculate(5, null) // Returns 0
println calculate(5, 10) // Returns 15
```