# AP Computer Science A — Day 3 Study Guide
**Topics Covered:** Type Casting, Variable Range & Overflow, Compound Assignment Operators

---

## 1. Type Casting (`(int)` and `(double)`)

### What is Casting?
Casting is an explicit operation that converts a value of one primitive type into another type.

* `(double) myInt`: Converts an `int` value into a `double` (e.g., `(double) 5` -> `5.0`).
* `(int) myDouble`: Converts a `double` value into an `int` by **truncating** all digits to the right of the decimal point (e.g., `(int) 7.89` -> `7`).

> **Warning:** Casting to `int` does **not** round! It chops off the decimal portion completely.

### Casting Precedence Traps
The casting operators `(int)` and `(double)` have **higher precedence** than standard arithmetic operators (`+`, `-`, `*`, `/`, `%`).

| Code Segment | Step-by-Step Evaluation | Result | Notes |
| :--- | :--- | :---: | :--- |
| `(double) 15 / 4` | `15.0 / 4` -> `3.75` | `3.75` | Cast happens **first**; floating-point division occurs. |
| `(double) (15 / 4)` | `(double) (3)` -> `3.0` | `3.0` | **AP Trap!** Parentheses force integer division first. |
| `(int) 4.9 + (int) 5.9` | `4 + 5` -> `9` | `9` | Each value truncated individually before addition. |
| `(int) (4.9 + 5.9)` | `(int) (10.8)` -> `10` | `10` | Sum computed first (`10.8`), then truncated. |

---

## 2. The AP Rounding Formula for Positive Numbers

Because casting to `int` always truncates, use this formula to round a positive `double` value `x` to the nearest whole integer:

$$\text{rounded} = \text{(int)(x + 0.5)}$$

### Trace Examples:
* **Round 6.2:** `(int)(6.2 + 0.5)` -> `(int)(6.7)` -> `6`
* **Round 6.5:** `(int)(6.5 + 0.5)` -> `(int)(7.0)` -> `7`
* **Round 6.9:** `(int)(6.9 + 0.5)` -> `(int)(7.4)` -> `7`

> **Syntax Tip:** Always enclose `(x + 0.5)` in parentheses! Writing `(int) x + 0.5` casts `x` first and then adds `0.5`, which results in a `double`, not an `int`.

---

## 3. Variable Range Limits & Overflow

In Java, `int` variables use **4 bytes (32 bits)** of memory. Because storage is finite, values are bounded:

* **Maximum Integer:** `Integer.MAX_VALUE` = $2^{31} - 1 = 2{,}147{,}483{,}647$
* **Minimum Integer:** `Integer.MIN_VALUE` = $-2^{31} = -2{,}147{,}483{,}648$

### Integer Overflow
If an integer calculation exceeds `Integer.MAX_VALUE`, it **wraps around** into negative numbers:

```java
int val = Integer.MAX_VALUE;
System.out.println(val + 1); // Prints: -2147483648
```

Similarly, subtracting 1 from `Integer.MIN_VALUE` underflows and wraps around to `Integer.MAX_VALUE`.

---

## 4. Compound Assignment Operators

Compound assignment operators offer shorthand notation to update the current value of a variable.

| Operator | Syntax Example | Equivalent Statement | Meaning |
| :---: | :--- | :--- | :--- |
| `+=` | `x += 5;` | `x = x + 5;` | Add 5 to `x` |
| `-=` | `x -= 3;` | `x = x - 3;` | Subtract 3 from `x` |
| `*=` | `x *= 2;` | `x = x * 2;` | Multiply `x` by 2 |
| `/=` | `x /= 4;` | `x = x / 4;` | Divide `x` by 4 (integer truncation applies) |
| `%=` | `x %= 3;` | `x = x % 3;` | Store remainder of `x / 3` in `x` |

### Increment and Decrement Operators
* `x++;` is shorthand for `x += 1;` or `x = x + 1;`
* `x--;` is shorthand for `x -= 1;` or `x = x - 1;`

### AP Exam Scope Guardrails:
* On the AP Exam, `++` and `--` are used **only as standalone statements** in post-fix notation (e.g., `count++;`).
* Prefix forms (such as `++x`) and embedded increments inside complex expressions (such as `arr[x++]`) are **outside the AP Java subset**.

---

## 5. Step-by-Step Code Tracing Practice

Carefully trace the memory updates in the code below:

```java
int a = 25;
int b = 4;
double d = (double) a / b;
int r = (int) (d + 0.5);
a %= b;
b++;
```

### Trace Table:

| Line of Code | `a` | `b` | `d` | `r` |
| :--- | :---: | :---: | :---: | :---: |
| `int a = 25;` | `25` | *uninitialized* | *uninitialized* | *uninitialized* |
| `int b = 4;` | `25` | `4` | *uninitialized* | *uninitialized* |
| `double d = (double) a / b;` | `25` | `4` | `6.25` | *uninitialized* |
| `int r = (int) (d + 0.5);` | `25` | `4` | `6.25` | `6` |
| `a %= b;` | `1` | `4` | `6.25` | `6` |
| `b++;` | `1` | `5` | `6.25` | `6` |
