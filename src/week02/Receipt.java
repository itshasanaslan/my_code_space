package week02;

import java.util.Scanner;

/**
 * ============================================================================
 * LAB: CAMPUS STORE RECEIPT CALCULATOR
 * File: Receipt.java
 * Status: Student Starter Skeleton (No Solution)
 * ============================================================================
 * 
 * 1. LAB OVERVIEW:
 * In this lab, you will construct an automated checkout register program for 
 * a retail store. The program sequentially prompts the cashier to enter 
 * purchasing data for three separate items, calculates line totals, accumulates 
 * a subtotal, determines state sales tax and suggested gratuity, applies the 
 * AP currency-rounding formula to find the final total in cents, and displays 
 * an aligned itemized register receipt.
 * 
 * 2. STRUCTURAL CONSTRAINTS & AP SUBSET RULES:
 * - This program must execute purely SEQUENTIALLY.
 * - Do NOT use any conditional statements (no if, if-else, switch).
 * - Do NOT use any iterative statements (no for, while, do-while loops).
 * - All monetary calculations must use primitive double or int types.
 * 
 * 3. PROGRAM SPECIFICATIONS & REQUIREMENTS:
 * A. CONSTANTS:
 *    - Sales tax rate: 8.25% (0.0825) stored as a final double.
 *    - Suggested tip rate: 18.0% (0.18) stored as a final double.
 * 
 * B. INPUT PHASE (Scanner):
 *    Prompt for and read the following attributes for 3 distinct items:
 *    - Item Name: text description via input.nextLine()
 *    - Quantity: whole number of units via input.nextInt()
 *    - Unit Price: unit cost in dollars and cents via input.nextDouble()
 *    *BUFFER CLEARING WARNING*: After reading numerical tokens with nextInt() 
 *    or nextDouble(), you must consume the remaining newline character in the 
 *    buffer by calling a standalone input.nextLine(); before reading the next 
 *    item's name.
 * 
 * C. CALCULATION PHASE:
 *    - Line Total = quantity * unitPrice (for each item).
 *    - Subtotal = sum of all three line totals (use compound assignment +=).
 *    - Tax Amount = subtotal * TAX_RATE.
 *    - Tip Amount = subtotal * TIP_RATE.
 *    - Unrounded Total = subtotal + taxAmount + tipAmount.
 *    - AP Cent Rounding: Round unroundedTotal to the nearest whole cent using:
 *        int roundedCents = (int) (unroundedTotal * 100.0 + 0.5);
 *        double finalTotal = (double) roundedCents / 100.0;
 * 
 * D. OUTPUT PHASE:
 *    Use a deliberate mix of System.out.print and System.out.println to display 
 *    an aligned receipt with item lines, subtotal, tax, tip, and final total.
 * 
 * 4. TARGET SAMPLE RUN:
 * ========================================
 * === CAMPUS STORE CHECKOUT ===
 * Enter item 1 name: Notebook
 * Enter item 1 quantity: 2
 * Enter item 1 unit price: $4.50
 * Enter item 2 name: Highlighter
 * Enter item 2 quantity: 3
 * Enter item 2 unit price: $1.75
 * Enter item 3 name: USB Flash Drive
 * Enter item 3 quantity: 1
 * Enter item 3 unit price: $12.99
 * 
 * ========================================
 *            ITEMIZED RECEIPT             
 * ========================================
 * 2x Notebook @ $4.5 each  ->  $9.0
 * 3x Highlighter @ $1.75 each  ->  $5.25
 * 1x USB Flash Drive @ $12.99 each  ->  $12.99
 * ----------------------------------------
 * Subtotal:               $27.24
 * Tax (8.25%):            $2.25
 * Suggested Tip (18%):    $4.90
 * ----------------------------------------
 * FINAL GRAND TOTAL:      $34.39
 * ========================================
 *        THANK YOU FOR YOUR VISIT!        
 * ========================================
 * ============================================================================
 */
public class Receipt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Constants for sales tax and suggested gratuity
        final double TAX_RATE = 0.0825; // 8.25% sales tax
        final double TIP_RATE = 0.18;   // 18% gratuity

        System.out.println("=== CAMPUS STORE CHECKOUT ===");

        // ====================================================================
        // STEP 1: INPUT PHASE
        // Prompt for and read the details for 3 distinct items:
        // - Item Name (String)
        // - Quantity (int)
        // - Unit Price (double)
        // Remember to call input.nextLine(); after numeric inputs to clear the buffer!
        // ====================================================================

        // --- Item 1 ---
        // TODO: Prompt and read item 1 name, quantity, and unit price



        // --- Item 2 ---
        // TODO: Prompt and read item 2 name, quantity, and unit price



        // --- Item 3 ---
        // TODO: Prompt and read item 3 name, quantity, and unit price




        // ====================================================================
        // STEP 2: CALCULATION PHASE
        // - Calculate line totals for each of the 3 items
        // - Accumulate subtotal using the += operator
        // - Calculate tax amount and tip amount from subtotal
        // - Compute the raw unrounded total
        // - Apply the AP rounding formula to round the final total to nearest cent
        // ====================================================================

        // TODO: Implement all item total, tax, tip, and rounding expressions




        // ====================================================================
        // STEP 3: OUTPUT PHASE
        // Construct the itemized receipt using System.out.print and println:
        // - Header banner
        // - Item lines (quantity, name, unit price, line total)
        // - Subtotal, Tax, Tip, and Rounded Final Total
        // - Footer banner
        // ====================================================================

        // TODO: Print the formatted receipt slip




        input.close();
    }
}