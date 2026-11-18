# Doint AP Computer Science A — Week 1 Student Study Guide
**Units & Topics:** Unit 1 — Using Objects and Methods (CED Topics 1.1, 1.2, 1.3, & 1.4)  
**Targeted Concepts:** Program Anatomy, Syntax Conventions, Console Output Tracing, Primitive Types, Assignment Operators, and Arithmetic Evaluation.

---

## 1. Quick Reference & Core Syntax Summary

### The Minimal Java Skeleton
Every executable standalone Java program requires an enclosing class definition and a `main` method entry point:

```java
public class ProgramName {
    public static void main(String[] args) {
        // Executable statements go here
    }
}
```

### Essential Syntax Rules
* **Source File Matching:** The file name must match the public class name character-for-character, including letter casing (`ProgramName.java` for `public class ProgramName`). Java is strictly case-sensitive.
* **Naming Conventions:** Class names follow **UpperCamelCase** (e.g., `CarRental`, `ReceiptCalc`). Variable and method identifiers follow **lowerCamelCase** (e.g., `studentCount`, `totalCost`).
* **Delimiters:** Every statement must terminate with a semicolon (`;`). Code blocks and method bodies are enclosed in curly braces (`{ }`).
* **Comments:** Ignored by the compiler. Single-line comments start with `//`; multi-line comments are wrapped in `/* ... */`.

---

## 2. Console Output Tracing: `print` vs. `println`

The console display maintains an internal cursor indicating where the next output character will appear.

| Statement | Mechanism & Cursor Movement |
| :--- | :--- |
| `System.out.print(...)` | Prints the argument and **leaves the cursor immediately after the last character printed**. |
| `System.out.println(...)` | Prints the argument and **immediately advances the cursor to the beginning of the next line**. |
| `System.out.println();` | Prints nothing, but sends the cursor to the beginning of the next line (blank line). |

### Output Tracing Table Walkthrough

Consider tracing this code segment:
```java
System.out.print("Go ");
System.out.println("Doint!");
System.out.print("CSA ");
System.out.print("Week ");
System.out.println(1);
```

| Line # | Statement Executed | Console Screen State | Active Cursor Position |
| :---: | :--- | :--- | :--- |
| 1 | `System.out.print("Go ");` | `Go ` | Line 1, immediately following space |
| 2 | `System.out.println("Doint!");` | `Go Doint!` | Advances cursor to **Line 2, Column 1** |
| 3 | `System.out.print("CSA ");` | `CSA ` | Line 2, immediately following space |
| 4 | `System.out.print("Week ");` | `CSA Week ` | Line 2, immediately following space |
| 5 | `System.out.println(1);` | `CSA Week 1` | Advances cursor to **Line 3, Column 1** |

**Final Screen Output:**
```text
Go Doint!
CSA Week 1
```

---

## 3. Data Types & Variables

Java is a strongly-typed language. A data type defines a set of valid values and a set of operations permitted on those values.

### The AP Java Subset Primitive Types

Only **three primitive types** are included on the AP Computer Science A Exam:

| Type | Stored Data | Memory Size | Example Values |
| :--- | :--- | :---: | :--- |
| `int` | Signed integers (positive, negative, zero) | 4 bytes (32 bits) | `-42`, `0`, `2026` |
| `double` | Real numbers (floating-point decimals) | 8 bytes (64 bits) | `3.14159`, `-0.5`, `12.0` |
| `boolean` | Logical truth values | 1 bit logical | `true`, `false` |

> ⚠️ **AP Subset Exclusion Warning:**  
> The primitive types `byte`, `short`, `long`, `float`, and `char` are **outside the AP CSA subset** and will not appear on the AP Exam.  
> `String` is a reference type (an object), not a primitive type!

### Variable Declarations & Assignment
* **Declaration:** Allocates named storage for a specific data type: `int studentCount;`
* **Assignment (`=`):** Evaluates the expression on the right-hand side and places the resulting value into the variable on the left: `studentCount = 28;`
* **Initialization:** The very first time a variable receives a value: `double taxRate = 0.0825;`

### Variable Value Copying in Memory
When you assign one primitive variable to another, a **copy** of the primitive value is transferred. The two variables do not share memory:

```java
int a = 15;
int b = a;    // b receives a copy of 15
a = 30;       // a changes to 30, but b remains 15
System.out.println(b); // Prints 15
```

---

## 4. Arithmetic Expressions & Operators

Java provides five arithmetic operators for numeric types:
* `+` : Addition
* `-` : Subtraction
* `*` : Multiplication
* `/` : Division
* `%` : Modulo (Remainder)

### Operator Precedence
1. Parentheses `( )` (innermost first)
2. Multiplicative: `*`, `/`, `%` (evaluated left-to-right)
3. Additive: `+`, `-` (evaluated left-to-right)

### The Two Most Critical AP Exam Traps

#### Trap 1: Integer Division Truncation
When dividing two `int` operands (`int / int`), Java performs **integer division**. Any fractional decimal part is **truncated (dropped)** toward zero. No rounding occurs:
* `7 / 2` evaluates to **`3`** (not `3.5`)
* `1 / 4` evaluates to **`0`** (not `0.25`)
* `19 / 5` evaluates to **`3`**

If at least one operand is a `double`, floating-point division is performed:
* `7.0 / 2` evaluates to **`3.5`**
* `7 / 2.0` evaluates to **`3.5`**

#### Trap 2: The Modulo Operator (`%`)
The `%` operator computes the integer remainder left over after integer division:
* `17 % 5` $\rightarrow$ $17 = (5 \times 3) + 2 \rightarrow$ result is **`2`**
* `24 % 6` $\rightarrow$ $24 = (6 \times 4) + 0 \rightarrow$ result is **`0`** (evenly divisible)
* `4 % 10` $\rightarrow$ $4 = (10 \times 0) + 4 \rightarrow$ result is **`4`** (smaller number mod larger number is always the smaller number)

#### Runtime Exception Warning:
Attempting to divide an integer by `0` (e.g., `10 / 0` or `10 % 0`) causes the JVM to throw an **`ArithmeticException`** at runtime.

---

## 5. Comprehensive Step-by-Step Expression Tracing

### Example 1: Mixed-Type Expression Evaluation
Evaluate the following code step-by-step:
```java
int m = 13;
int n = 4;
double factor = 2.0;
double result = m / n * factor + m % n;
```

**Step-by-Step Evaluation:**
1. Group operations by precedence (multiplicative operators `*`, `/`, `%` first, left-to-right):
   `((m / n) * factor) + (m % n)`
2. Evaluate `m / n` $\rightarrow$ `13 / 4`: Both are `int`, so integer division truncates $3.25$ to **`3`**.
3. Evaluate `3 * factor` $\rightarrow$ `3 * 2.0`: One operand is `double`, so result is **`6.0`**.
4. Evaluate `m % n` $\rightarrow$ `13 % 4`: $13 = (4 \times 3) + 1$, remainder is **`1`**.
5. Evaluate `6.0 + 1`: Involves a `double`, so result is **`7.0`**.
6. Store `7.0` into `result`. Output of `System.out.println(result);` is `7.0`.

---

## 6. Common AP Exam Warnings & Pitfalls Checklist

- [ ] **String Literals vs. Variables:** Enclose text in double quotes (`"Hello"`). Writing `System.out.println(Hello);` causes a compile-time syntax error because Java looks for an undeclared variable named `Hello`.
- [ ] **Spaces in Output:** Spaces inside quotes (`"Doint "`) print directly to the console. Forgetting spaces between combined words (e.g., `"Doint" + "CSA"` prints `DointCSA`) is a very common student mistake.
- [ ] **Case Sensitivity:** `system.out.println` fails to compile because Java expects capitalized `System`. Likewise, `Classname` and `className` are two completely different identifiers.
- [ ] **No Math Equality:** In Java, `=` is an action meaning "copy the evaluated right-side value into the left-side container." Do not read `x = x + 1;` as a mathematical impossibility.
