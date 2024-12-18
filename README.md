# Groovy NullPointerException Example

This repository demonstrates a common error in Groovy: unexpected `NullPointerExceptions` due to unchecked null inputs.  The `calculate` function does not handle null input gracefully. The provided solution demonstrates proper null handling.

## How to reproduce

1. Clone this repository
2. Run `bug.groovy`  This will throw a `NullPointerException`. 
3. Run `bugSolution.groovy` which shows how to handle this exception correctly.