package Loans;

import common.Base;
import org.testng.annotations.Test;



/**
 * Created by soren on 8/26/2016.
 */
public class LoanCalculator extends Base {

    @Test
    public void calculateLoan() throws InterruptedException {
        typeByCss("#inputTopSearchField","loans");
        sleepFor(3);

        clickByXpath(".//*[@id='mainColumns']/div/div[2]/ol/li[2]/h2/a/b[1]"); //click on auto loans link
        sleepFor(3);
        clickByXpath(".//*[@id='contentBody']/div[2]/div/ul/li[1]/a"); //click on loan calulator link
        sleepFor(3);
        typeByCss("#loanAmount", "50000");
        sleepFor(2);
        typeByCss("#loanTerm", "1");
        sleepFor(2);
        typeByCss("#creditCategory", "f");
        sleepFor(2);
        clickByCss("#NID1_14_1_1_3_2_4_1_1_1>span");
        sleepFor(3);
        clickByXpath(".//*[@id='gettingStartedCommand']/section/div[1]/fieldset/div[3]/div/label");
        clickByXpath(".//*[@id='gettingStartedCommand']/section/div[3]/fieldset/div[3]/div/label");
        sleepFor(2);
        clickByCss(".ui-btn.ui-btn-p");
        sleepFor(3);
        typeByCss("#amountBorrow","500000");
        typeByCss("#firstNameVal", "Dexter");
        typeByCss("#middleNameVal","J");
        typeByCss("#lastNameVal","Morgan");
        typeByCss("#findRateSuffixType","v");
        typeByCss("#findRateEmailAddress","DexMex@Morg.com");
        sleepFor(2);
        typeByCss("#citizenship","u");
        typeByCss("#findRatePhoneNumber","5555555555");
        typeByCss("#findRatePhoneType","m");
        typeByCss("#findRateAddressStreet1","9534 Clement Rd");
        typeByCss("#findRateAddressCity","Silver Spring");
        typeByCss("#state","mm");
        typeByCss("#personalInfoAddressZip","20910");
        sleepFor(2);
        typeByCss("#personalInfoBirthdateDateOfBirth","07291932");
        typeByCss("#personalInfoSocialSecurityNumber","252321848");
        clickByCss("#consentToCredit");
        clickByCss(".continue-button.ui-btn.ui-btn-p");
        sleepFor(5);





    }
}
