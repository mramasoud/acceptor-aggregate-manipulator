package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum FunctionCodeEnum {

    BalanceRequest(0, "108"),
    GeneralFinancialOperationRequest(1, "200"),
    SettlementOperationApproval(2, "215"),
    CreditCardPaymentRequest(3, "270"),
    BillPaymentOperationRequest(4, "280"),
    InstallmentPaymentOperationRequest(5, "281"),
    TopUpPaymentOperationRequest(6, "282"),
    CustomBillPaymentOperationRequest(7, "283"),
    FullInvoicePaymentTransactionAmendment(8, "440");

    int functionCode;
    String switchCode;

    FunctionCodeEnum(int functionCode, String switchCode) {
        this.functionCode = functionCode;
        this.switchCode = switchCode;
    }

    @JsonValue
    public int getFunctionCode() {
        return functionCode;
    }

    public String getSwitchCode() {
        return switchCode;
    }

    public static List<FunctionCodeEnum> getAllFunctionCodes(){
        List<FunctionCodeEnum> retVal;
        retVal = new ArrayList<FunctionCodeEnum>(Arrays.asList(FunctionCodeEnum.values()));
        return retVal;
    }

    public static List<FunctionCodeEnum> getAllLimitableFunctionCodes() {
        List<FunctionCodeEnum> retVal = new ArrayList<>();
        for(FunctionCodeEnum functionCode : FunctionCodeEnum.values()) {
            if( functionCode != FunctionCodeEnum.SettlementOperationApproval &&
                    functionCode != FunctionCodeEnum.FullInvoicePaymentTransactionAmendment) {
                retVal.add(functionCode);
            }
        }
        return retVal;
    }
}
