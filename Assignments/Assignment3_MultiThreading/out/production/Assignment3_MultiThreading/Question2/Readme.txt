Assignment 2: Bank Account Synchronization

Background:
Simulate a multi-threaded banking system that supports concurrent deposits and withdrawals from shared accounts.

Requirements:
Implement a BankAccount class with:
Methods: deposit(double amount), withdraw(double amount)
Thread-safe balance modification
Create multiple threads representing users performing deposits and withdrawals
Ensure no overdrawing and correct final balance

Bonus Requirements:
Add transaction logging
Add per-account lock to prevent locking the entire bank