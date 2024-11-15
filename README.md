# ATM Simulation Program

This is a simple console-based ATM simulation program written in Java. It allows a user to perform basic banking operations such as checking account balance, withdrawing money, and depositing money, by entering a predefined PIN for access.

## Features
- **PIN Verification**: User must enter the correct PIN to access the account menu.
- **Check Balance**: View the current account balance.
- **Withdraw Money**: Withdraw a specified amount from the account if sufficient funds are available.
- **Deposit Money**: Deposit a specified amount into the account.

## Program Structure

The program consists of two classes:
1. **atm**: Handles account operations including PIN verification, balance checking, withdrawal, and deposit.
2. **atmachine**: Main class to start the program.

### Class Breakdown

- **atm**:
  - **Constructor**: Prompts the user to enter their PIN. If the PIN is correct, it calls the `menu` function; otherwise, it prompts the user again.
  - **menu()**: Displays the options available to the user and routes them to the appropriate function based on their choice.
  - **checkbalance()**: Displays the current balance.
  - **withdrawMoney()**: Prompts the user to enter an amount to withdraw, checks for sufficient balance, and processes the withdrawal.
  - **depositemoney()**: Prompts the user to enter an amount to deposit and adds it to the balance.

- **atmachine**:
  - Main method to create an instance of the `atm` class and start the program.
 

## Getting Started

### Prerequisites
- **Java**: Ensure Java is installed.


### Running the Program
1. Compile the program:
     ```bash
   javac atmachine.java
     ```
2. Run the program:
     ```bash
   java ATM.atmachine
     ```


## How It Works

1. **Start the Program**:
   - The user is prompted to enter a predefined PIN (`1805`).
   - Upon entering the correct PIN, the user can access the menu.

2. **Menu Options**:
   - **1**: Check Balance
   - **2**: Withdraw Money
   - **3**: Deposit Money
   - **4**: Exit

3. **Example Walkthrough**:
   - **Enter PIN**:
   ```bash
     Enter your PIN:
     > 1805
   ```
   - **Check Balance**:
   ```bash
     Enter your choice
     1. Check A/C Balance
     2. Withdraw Money
     3. Deposit Money
     4. Exit
     > 1
     Balance: 0.0
   ```
   - **Deposit Money**:
   ```bash
     Enter your choice
     1. Check A/C Balance
     2. Withdraw Money
     3. Deposit Money
     4. Exit
     > 3
     Enter Amount to Deposit
     > 1000
     Amount added successfully
   ```
   - **Exit**:
   ```bash
     Enter your choice
     1. Check A/C Balance
     2. Withdraw Money
     3. Deposit Money
     4. Exit
     > 4
    ```

