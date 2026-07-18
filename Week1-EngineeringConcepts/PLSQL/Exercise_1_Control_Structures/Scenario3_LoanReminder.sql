SET SERVEROUTPUT ON;

BEGIN

    FOR loan_record IN (

        SELECT CustomerID,
               LoanID,
               DueDate
        FROM Loans
        WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30

    )
    LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Customer '
            || loan_record.CustomerID
            || ' has Loan '
            || loan_record.LoanID
            || ' due on '
            || TO_CHAR(loan_record.DueDate, 'DD-MON-YYYY')
        );

    END LOOP;

END;
/