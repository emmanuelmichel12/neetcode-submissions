class BankAccount:
    def __init__(self, balance: int):
        self._balance = balance  # Add private balance
    
    # TODO: Add getter method for balance
    def get_balance(self) -> int:
        return self._balance
    # TODO: Add setter method for balance
    def set_balance(self, newBalance: int) -> None:
        if newBalance >= 0:
            self._balance = newBalance
        else:
            print("Cannot set negative balance!")



# Don't modify the code below this line
account = BankAccount(1000)
print(account.get_balance())
account.set_balance(-100)
print(account.get_balance())
account.set_balance(100)
print(account.get_balance())
account.set_balance(0)
print(account.get_balance())
