package lab0;

import java.util.Date;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;
    private String NAME_ERR = "Invild Name";
    private String SSN_ERR = "Invild SSN";
    private String DATE_ERR = "Invild Date";
    private String DV_ERR = "Invild Number of days of Vacation";
    private int MIN_INT_VALUE = 0;
    private int MAX_SSN =11;
    private int MAX_CHAR = 25;

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.hireDate = hireDate;
        this.daysVacation = daysVacation;
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }

    public void setDaysVacation(int daysVacation) throws Exception{
        if (daysVacation < MIN_INT_VALUE || daysVacation > MAX_VACATION_DAYS){
            throw new IllegalArgumentException(DV_ERR);
        }
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws Exception{
        if (firstName.length() < MIN_INT_VALUE || firstName.toString() == null || firstName.length() > MAX_CHAR){
            throw new IllegalArgumentException(NAME_ERR);
        }
        this.firstName = firstName;
    }

    public Date getHireDate() throws Exception{
        if (hireDate.toString() == null){
            throw new IllegalArgumentException(DATE_ERR);
        }
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws Exception{
        if (lastName.length() < MIN_INT_VALUE || lastName.toString() == null || lastName.length() > MAX_CHAR){
            throw new IllegalArgumentException(NAME_ERR);
        }
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) throws Exception{
        if (ssn.length() <= MIN_INT_VALUE || ssn.toString() == null || ssn.length() > MAX_SSN){
            throw new IllegalArgumentException(SSN_ERR);
        }
        this.ssn = ssn;
    }
    
    
}
