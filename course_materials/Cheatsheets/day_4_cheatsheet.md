# AP Computer Science A — Day 4 Study Guide
## Interactive Console Input, Compound Accumulators, and Financial Calculations

---

## 1. Interactive Input with the `Scanner` Class

The `Scanner` class allows a Java program to read dynamic input entered by a user into the console terminal.

### Setting Up `Scanner`
To use `Scanner`, you must import its package at the very top of your source file before the class declaration:

```java
import java.util.Scanner;

public class StoreCheckout {
    public static void main(String[] args) {
        // Create the Scanner connected to the keyboard console
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        
        System.out.print("Enter unit price: $");
        double unitPrice = input.nextDouble();
        
        System.out.println("Subtotal: $" + (quantity * unitPrice));
    }
}
```

### Essential `Scanner` Reading Methods

| Method | Return Type | Description | Sample Usage |
| :--- | :---: | :--- | :--- |
| `nextInt()` | `int` | Reads the next integer token from the console | `int items = input.nextInt();` |
| `nextDouble()` | `double` | Reads the next floating-point token from the console | `double rate = input.nextDouble();` |
| `next()` | `String` | Reads the next individual word (up to whitespace) | `String name = input.next();` |
| `nextLine()` | `String` | Reads the entire remaining line of text as a `String` | `String address = input.nextLine();` |

> **Best Practice — The Prompt-Read Pattern:**  
> Always place a `System.out.print(...)` statement immediately before calling a reading method so the user knows what value to enter. Using `print` instead of `println` allows the user to type their response directly next to the colon on the same line.

---

## 2. Compound Assignment Operators & Running Totals

In commercial programs like point-of-sale registers, variables frequently accumulate values over time. Compound assignment operators modify the value of a variable in place using concise syntax.

### Reference Table: Compound Operators

| Operator | Syntax | Equivalent Longform Expression | Example (`x = 10`) | Resulting Value of `x` |
| :---: | :---: | :--- | :--- | :---: |
| `+=` | `x += n;` | `x = x + n;` | `x += 5;` | `15` |
| `-=` | `x -= n;` | `x = x - n;` | `x -= 3;` | `7` |
| `*=` | `x *= n;` | `x = x * n;` | `x *= 4;` | `40` |
| `/=` | `x /= n;` | `x = x / n;` | `x /= 2;` | `5` |
| `%=` | `x %= n;` | `x = x % n;` | `x %= 4;` | `2` |

### Post-Increment and Post-Decrement
* `x++;` is shorthand for `x += 1;` or `x = x + 1;`
* `x--;` is shorthand for `x -= 1;` or `x = x - 1;`

---

## 3. High-Yield AP Exam Traps & Warnings

### Trap 1: The Percentage Integer Truncation Bug
When calculating percentages (such as tax, discounts, or tips), dividing two integer literals causes immediate truncation to zero:

```java
// BUG ALERT: 7 and 100 are integers!
double taxRate = 7 / 100;        // 7 / 100 truncates to 0 -> stores 0.0
double tax = 50.0 * taxRate;     // 50.0 * 0.0 -> evaluates to 0.0!

// CORRECT: Ensure at least one operand is a double
double correctTaxRate = 7.0 / 100;   // 0.07
double directRate = 0.07;            // 0.07
```

### Trap 2: Currency Cent Rounding
Because `(int)` casting truncates rather than rounding, directly casting a double monetary value chops off cents improperly (e.g., `(int) 19.99` becomes `19`).

To round a positive dollar-and-cents value to the nearest whole cent:
1. Multiply the amount by `100` to convert dollars to total cents.
2. Add `0.5` to prepare for nearest-integer rounding.
3. Cast the result to `(int)` to truncate the fractional millicents.
4. Divide by `100.0` (as a `double`) to shift back to a two-place dollar amount.

```java
double exactAmount = 24.85714;
int totalCents = (int) (exactAmount * 100 + 0.5); // 2485.714 + 0.5 = 2486.214 -> 2486 cents
double roundedDollars = (double) totalCents / 100.0; // 24.86
```

---

## 4. Step-by-Step Worked Code Tracing

### Itemized Register Calculation Trace
Carefully trace the sequential execution of this checkout calculation:

```java
double subtotal = 0.0;

int apples = 3;
double applePrice = 1.50;
subtotal += apples * applePrice;   // Line 5

int bread = 2;
double breadPrice = 2.75;
subtotal += bread * breadPrice;    // Line 9

double coupon = 2.00;
subtotal -= coupon;                // Line 12

double taxRate = 0.08;
double tax = subtotal * taxRate;   // Line 15

double grandTotal = subtotal + tax; // Line 17
```

### Step-by-Step Trace Grid

| Statement Executed | Computation Performed | Value in `subtotal` | Value in `tax` | Value in `grandTotal` |
| :--- | :--- | :---: | :---: | :---: |
| Initial Setup | `subtotal = 0.0` | `0.0` | *uninitialized* | *uninitialized* |
| Line 5 (`subtotal += 3 * 1.50;`) | `0.0 + 4.50` | `4.50` | *uninitialized* | *uninitialized* |
| Line 9 (`subtotal += 2 * 2.75;`) | `4.50 + 5.50` | `10.00` | *uninitialized* | *uninitialized* |
| Line 12 (`subtotal -= 2.00;`) | `10.00 - 2.00` | `8.00` | *uninitialized* | *uninitialized* |
| Line 15 (`tax = 8.00 * 0.08;`) | `8.00 * 0.08` | `8.00` | `0.64` | *uninitialized* |
| Line 17 (`grandTotal = 8.00 + 0.64;`) | `8.00 + 0.64` | `8.00` | `0.64` | `8.64` |

---

## 5. Console Output Formatting Checklist

When building register summaries or ASCII receipt tables:
* Use `System.out.print(...)` for category labels and currency signs (`$`).
* Use `System.out.println(...)` when outputting the final numerical variable on that row to advance to the next line.
* Keep column dashes (`-------------------------`) consistent in character width to create visual dividers.
