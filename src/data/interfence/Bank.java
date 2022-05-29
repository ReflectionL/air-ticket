package data.interfence;
/**
 * This class holds the account and password for the bank account
 * @author Pengtao Li
 * @version 1.0
 **/
public class Bank {
    /**
     *  The ID of Bank account.
     */
    private String Bankid;
    /**
     * The password of Bank account.
     */
    private String password;

    /**
     *  The default constructor of the Bank
     */
    public Bank() {
    }

    /**  The constructor of the Bank
     * @param bankid
     * @param password
     */
    public Bank(String bankid, String password) {
        Bankid = bankid;
        this.password = password;
    }

    /** GET the ID of Bank account.
     * @return  Bankid
     */
    public String getBankid() {
        return Bankid;
    }

    /** GET the password of Bank account.
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /** SET bank id
     * @param bankid
     */
    public void setBankid(String bankid) {
        Bankid = bankid;
    }

    /** SET password
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
