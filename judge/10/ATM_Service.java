public interface ATM_Service {
	/**
	 * Checking whether balance in user's account is sufficient, if not, throws an
	 * exception named ATM_Exception with type of "BALANCE_NOT_ENOUGH"
	 * 
	 * @param account
	 * @param money
	 * @return returns a boolean value true if this checking process is passed
	 *         successfully.
	 * @throws ATM_Exception
	 */
	public boolean checkBalance(Account account, int money) throws ATM_Exception;

	/**
	 * Checks if amount of money can be divided by 1000, if not, throws an exception
	 * named ATM_Exception with type of "AMOUNT_INVALID"
	 * 
	 * @param money
	 * @return returns a boolean value true if this checking process is passed
	 *         successfully.
	 * @throws ATM_Exception
	 */
	public boolean isValidAmount(int money) throws ATM_Exception;

	/**
	 * It will always show updated balance in user's account in format of "updated
	 * balance : xxx", no matter whether the user withdraws the money successfully
	 * or not.
	 * 
	 * @param account
	 * @param money
	 */
	public void withdraw(Account account, int money);
}
