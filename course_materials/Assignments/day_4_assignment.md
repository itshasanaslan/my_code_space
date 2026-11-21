# AP Computer Science A — Day 4 Homework Assignment
**Topic:** Interactive Input, Compound Assignment, and Receipt Arithmetic  
**Instructions:** Complete Part 1 by hand using active pencil tracing. Complete Part 2 and Part 3 in your Java IDE. Bring your completed solutions and code printout/commit to the next session.

---

## Part 1: Pencil-and-Paper Code Tracing (No IDE)

### Question 1.1: Running Total & Compound Assignment Trace
Hand-trace the following code block. Track the values of `balance`, `itemCost`, and `points` in the trace table after each line executes.

```java
double balance = 15.0;
double itemCost = 4.50;
int points = 100;

balance += itemCost * 2;
points += 25;
balance -= 3.0;
points *= 2;
balance += balance * 0.10;
```

**Variable Trace Table:**

| Line Executed | Value in `balance` | Value in `itemCost` | Value in `points` |
| :--- | :---: | :---: | :---: |
| `double balance = 15.0;` | `15.0` | *uninitialized* | *uninitialized* |
| `double itemCost = 4.50;` | `15.0` | `4.50` | *uninitialized* |
| `int points = 100;` | `15.0` | `4.50` | `100` |
| `balance += itemCost * 2;` | | | |
| `points += 25;` | | | |
| `balance -= 3.0;` | | | |
| `points *= 2;` | | | |
| `balance += balance * 0.10;` | | | |

---

### Question 1.2: Truncation vs. Rounding Evaluation
Evaluate the final value and data type produced by each of the following standalone expressions:

1. `18 / 4 * 2.0` -> Value: `________` | Result Type: `________`
2. `(double) (18 / 4)` -> Value: `________` | Result Type: `________`
3. `(double) 18 / 4` -> Value: `________` | Result Type: `________`
4. `(int) (12.75 + 0.5)` -> Value: `________` | Result Type: `________`
5. `5 / 100 * 50.0` -> Value: `________` | Result Type: `________`
6. `5.0 / 100 * 50.0` -> Value: `________` | Result Type: `________`

---

## Part 2: IDE Debugging & Code Repair

Create a file named `RegisterBug.java` in your IDE. Copy the following code into your editor. The program is supposed to calculate an 8% sales tax and print an itemized total, but it contains **four compile-time syntax and runtime logic errors**.

### The Flawed Code:
```java
public class registerbug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter item price: ");
        double price = scan.nextDouble()
        
        double taxRate = 8 / 100;
        double tax = price * taxRate;
        double total = price + tax;
        
        System.out.println("Item: $" + price)
        System.out.print("Tax:  $");
        System.out.println(tax);
        System.out.println(Total: $ + total);
    }
}
```

### Student Tasks:
1. List and explain the 4 errors on paper:
   * **Error 1 (Class/File Naming):** `___________________________________________________`
   * **Error 2 (Missing Import / Syntax):** `_____________________________________________`
   * **Error 3 (Logic / Truncation Bug):** `______________________________________________`
   * **Error 4 (String Literal Formatting):** `__________________________________________`
2. Correct the errors in your IDE, compile `RegisterBug.java`, and verify that entering `25.00` yields a tax of `2.0` and a total of `27.0`.

---

## Part 3: Applied Programming Lab — Coffee Shop Register

Implement a complete Java program in a file named `CoffeeShopRegister.java`.

### Scenario & Requirements:
You are building an automated checkout terminal for a campus coffee shop. Your program must prompt the cashier for customer order quantities, calculate the subtotal, apply a member discount, add sales tax, and print a formatted receipt.

1. **Class Name:** `CoffeeShopRegister` in `CoffeeShopRegister.java`.
2. **Interactive Inputs (Using `Scanner`):**
   * Prompt and read the number of coffees purchased (`int`). Coffee price: `$3.50` each.
   * Prompt and read the number of pastries purchased (`int`). Pastry price: `$2.75` each.
   * Prompt and read the reward coupon amount in dollars (`double`, e.g., `1.50`).
3. **Calculations:**
   * `coffeeCost`: Number of coffees multiplied by `3.50`.
   * `pastryCost`: Number of pastries multiplied by `2.75`.
   * `subtotal`: `coffeeCost + pastryCost`.
   * `discountedSubtotal`: `subtotal - couponAmount`.
   * `tax`: `discountedSubtotal * 0.08` (8% sales tax).
   * `finalTotal`: `discountedSubtotal + tax`.
   * `roundedTotalCents`: Use the AP positive rounding formula `(int) (finalTotal * 100 + 0.5)` to determine the exact rounded whole cents.
   * `displayTotal`: `(double) roundedTotalCents / 100.0`.
4. **Required Console Formatting:**
   Your output must match the structure below, using `print` for labels and `println` to end each line.

```text
========================================
         CAMPUS COFFEE REGISTER         
========================================
Coffees Ordered:    3  ($10.50)
Pastries Ordered:   2  ($5.50)
----------------------------------------
Subtotal:           $16.00
Coupon Discount:    -$1.50
Tax (8%):           $1.16
========================================
TOTAL DUE:          $15.66
========================================
Thank you for supporting our campus shop!
```

*(Note: Do not use any `if` statements or loops. Keep your program sequential and clean).*
