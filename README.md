# Banking Application | Java Programming Assignment 01 | SOET (2025-26) | Course Code: ENCS201, ENCA203, ENBC205

## Project Information
- **Project Title:** Banking Application for Account Management
- **Faculty:** Dr. Manish Kumar
- **Assignment No:** 01
- **Session:** 2025-26
- **Programme:** BCA
- **Semester:** 3rd
- **Submission Deadline:** 5th September 2025
- **Weightage:** 10% Internal Evaluation
- **Student Name:** Aditya Shibu
- **GitHub:** https://github.com/Vic-41148

## Problem Statement
Design and implement a banking application in Java that allows users to manage their bank accounts by performing operations such as:
1. Create account
2. Deposit money
3. Withdraw money
4. View account details
5. Update contact details

The application demonstrates use of **Java basics, OOP principles, arrays, strings, and control structures**.

## Objectives
- Apply Java fundamentals (data types, operators, control structures)
- Use decision-making and looping
- Handle input/output operations using Scanner
- Implement modular code using classes and methods
- Manage multiple accounts using arrays/ArrayList
- Validate user input and handle errors gracefully

## Class Hierarchy
- **Account (Main Class)**
  - Fields: accountNumber, accountHolderName, balance, email, phoneNumber
  - Methods:
    - deposit() → Add money with validation
    - withdraw() → Remove money with validation
    - displayAccountDetails() → Print account info
    - updateContactDetails() → Update email and phone

- **UserInterface**
  - Attributes: ArrayList\<Account\>, Scanner
  - Methods: createAccount(), performDeposit(), performWithdrawal(), showAccountDetails(), updateContact(), mainMenu()

## Features
- Create account with unique account number
- Deposit and withdraw money with validation
- Display account details
- Update contact details (email & phone)
- Menu-driven interface using ArrayList
- Validates all inputs (positive amounts, correct formats)

## How to Run
1. Clone the repository:  
   `git clone https://github.com/Vic-41148/BankingApplication.git`  
   `cd BankingApplication`
2. Compile the program:  
   `javac Main.java`
3. Run the program:  
   `java Main`

## Grading Logic
- A → Deposit/Withdraw and account creation work correctly
- B → Input validation and menu navigation
- C → Modular code and readability

## Future Improvements
- Use HashMap for faster account lookup
- Add file/database storage for persistent accounts
- Implement update/delete account functionality
- Enhance user interface with GUI

## Developed by
**Aditya Shibu** (Roll No: 2401201047)
