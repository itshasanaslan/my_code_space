# AP Computer Science A — Weekend Assignment (Week 1)
**Review:** Week 1 Foundations (Sessions 1 & 2)  
**Instructions:** Complete Part 1 by hand (pencil-and-paper code tracing). Implement and run Part 2 and Part 3 in your IDE (VS Code or BlueJ). Bring your completed work to Session 3.

---

## Part 1: Hand-Written Code & Output Tracing (No IDE)
*Practice active pencil tracing on paper, just like on the digital AP Exam.*

### Question 1.1: Cursor Movement & Output
Carefully hand-trace the following Java statements. In the space below, write the exact text that will appear in the console. Represent line breaks clearly.

```java
System.out.println("###");
System.out.print("# ");
System.out.println("Java");
System.out.print("# ");
System.out.print("AP ");
System.out.println("CSA");
System.out.println("###");
```

**Predicted Console Output:**
```text
[Write your line-by-line output here]



```

---

### Question 1.2: Memory Slot Variable Tracing
Complete the variable trace table to track the values stored in memory slots `a`, `b`, and `c` after each statement executes.

```java
int a = 12;
int b = 5;
int c = a / b;
a = a + 3;
b = a % b;
c = c * 10;
```

**Trace Table:**

| Line Executed | Value in `a` | Value in `b` | Value in `c` |
| :--- | :---: | :---: | :---: |
| `int a = 12;` | `12` | *uninitialized* | *uninitialized* |
| `int b = 5;` | `12` | `5` | *uninitialized* |
| `int c = a / b;` | | | |
| `a = a + 3;` | | | |
| `b = a % b;` | | | |
| `c = c * 10;` | | | |

---

### Question 1.3: AP Arithmetic & Truncation Check
Evaluate the value and the resulting data type for each of the following standalone Java expressions:

1. `20 / 6` -> Value: `________` | Type: `________`
2. `20.0 / 6` -> Value: `________` | Type: `________`
3. `14 % 4` -> Value: `________` | Type: `________`
4. `3 % 7` -> Value: `________` | Type: `________`
5. `11 / 2 * 2` -> Value: `________` | Type: `________`
6. `8 + 12 / 5 * 2.0` -> Value: `________` | Type: `________`

---

## Part 2: IDE Debugging & Syntax Repair
Open your IDE and create a file named `DebugBanner.java`. Copy the flawed code below into your editor. The code contains **four distinct compile-time syntax errors**.

### The Flawed Code:
```java
public class debugbanner {
    public static void Main(String[] args) {
        System.out.println("Welcome to AP CS A");
        System.out.print(Session 1 & 2 Completed)
        System.out.println("Keep going!")
    }
}
```

### Tasks:
1. Identify all 4 errors on paper below:
   * **Error 1:** `__________________________________________________________________`
   * **Error 2:** `__________________________________________________________________`
   * **Error 3:** `__________________________________________________________________`
   * **Error 4:** `__________________________________________________________________`
2. Correct the program in your IDE, compile it, and verify that it prints all three lines without errors.

---

## Part 3: Applied Programming Lab — The Travel Time Calculator
Create a standalone Java class in a file named `TravelCalculator.java`. This exercise applies primitive variables, arithmetic operations, and structured console formatting.

### Problem Scenario & Specifications:
A group of students is taking a road trip. Your program must calculate the total hours of travel, the remaining miles, and the estimated fuel cost based on given trip variables.

1. **Class Name:** `TravelCalculator` (saved in `TravelCalculator.java`).
2. **Declared & Initialized Variables:**
   * `totalMiles` (`int`): Set initially to `385`.
   * `averageSpeedMph` (`int`): Set initially to `60`.
   * `gasPricePerGallon` (`double`): Set initially to `3.75`.
   * `milesPerGallon` (`double`): Set initially to `28.0`.
3. **Calculations:**
   * `travelHours` (`int`): Calculate whole hours driven using integer division (`totalMiles / averageSpeedMph`).
   * `leftoverMiles` (`int`): Calculate the remaining miles after the whole hours using the remainder operator (`totalMiles % averageSpeedMph`).
   * `totalGallonsNeeded` (`double`): Calculate `totalMiles / milesPerGallon`.
   * `estimatedFuelCost` (`double`): Calculate `totalGallonsNeeded * gasPricePerGallon`.
4. **Required Console Output Format:**
   Use a deliberate mix of `System.out.print` and `System.out.println` so that labels and computed values appear properly aligned on their respective lines:

```text
========================================
            ROAD TRIP SUMMARY           
========================================
Total Distance: 385 miles
Average Speed:  60 mph
----------------------------------------
Driving Time:   6 hours and 25 miles
Fuel Needed:    13.75 gallons
Estimated Cost: $51.5625
========================================
```

**Reminder:** Do not use conditional statements (`if`) or loops in this assignment. Focus on sequential execution, variable assignments, and console output.
