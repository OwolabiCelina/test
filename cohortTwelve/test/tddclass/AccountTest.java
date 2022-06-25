package tddclass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    @DisplayName("Deposit money, balance increases test")
    public void depositMoneyBalanceIncreasesTest(){

//        //given
//        Account jennyAccount = new Account();
//        //when
//        jennyAccount.deposit(600);
//        jennyAccount.deposit(  500);
//        //check
//        assertEquals(1100, jennyAccount.getBalance());

        Account bankeAccount = new Account();

        bankeAccount.deposit(700);
        bankeAccount.withDraw(400);

        assertEquals(300, bankeAccount.getBalance());
    }





}
