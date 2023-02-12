package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum ProcessTypeEnum {

    PayingForGoodsOrServices(0, "00"),
    BalanceRequest(1, "31"),
    Payment(2, "50");

    private static final List<FunctionCodeEnum> ALL_FUNCTION_CODES = FunctionCodeEnum.getAllFunctionCodes();
    private static final List<FunctionCodeEnum> ALL_LIMITABLE_CODES = FunctionCodeEnum.getAllLimitableFunctionCodes();

    private static final List<FunctionCodeEnum> PAYING_FOR_GOODS_VALID_FUNCTION_CODES =
            Arrays.asList(
                    FunctionCodeEnum.GeneralFinancialOperationRequest,
                    FunctionCodeEnum.SettlementOperationApproval,
                    FunctionCodeEnum.CreditCardPaymentRequest,
                    FunctionCodeEnum.FullInvoicePaymentTransactionAmendment
            );

    private static final List<FunctionCodeEnum> BALANCE_REQUEST_VALID_FUNCTION_CODES =
            Arrays.asList(
                    FunctionCodeEnum.BalanceRequest
            );

    private static final List<FunctionCodeEnum> PAYMENT_VALID_FUNCTION_CODES =
            Arrays.asList(
                    FunctionCodeEnum.SettlementOperationApproval,
                    FunctionCodeEnum.BillPaymentOperationRequest,
                    FunctionCodeEnum.InstallmentPaymentOperationRequest,
                    FunctionCodeEnum.TopUpPaymentOperationRequest,
                    FunctionCodeEnum.CustomBillPaymentOperationRequest,
                    FunctionCodeEnum.FullInvoicePaymentTransactionAmendment
            );

    private static final List<FunctionCodeEnum> PAYING_FOR_GOODS_LIMITABLE_FUNCTION_CODES =
            Arrays.asList(
                    FunctionCodeEnum.GeneralFinancialOperationRequest,
                    FunctionCodeEnum.CreditCardPaymentRequest
            );

    private static final List<FunctionCodeEnum> PAYMENT_LIMITABLE_FUNCTION_CODES =
            Arrays.asList(
                    FunctionCodeEnum.BillPaymentOperationRequest,
                    FunctionCodeEnum.InstallmentPaymentOperationRequest,
                    FunctionCodeEnum.TopUpPaymentOperationRequest,
                    FunctionCodeEnum.CustomBillPaymentOperationRequest
            );

    int processTypeCode;
    String switchCode;

    ProcessTypeEnum(int processTypeCode, String switchCode) {
        this.processTypeCode = processTypeCode;
        this.switchCode = switchCode;
    }

    @JsonValue
    public int getProcessTypeCode() {
        return processTypeCode;
    }

    public String getSwitchCode() {
        return switchCode;
    }

    public static List<ProcessTypeEnum> getAllProcessTypes() {
        List<ProcessTypeEnum> retVal;
        retVal = new ArrayList<ProcessTypeEnum>(Arrays.asList(ProcessTypeEnum.values()));
        return retVal;
    }

    public static List<FunctionCodeEnum> getValidFunctionCodes(ProcessTypeEnum processType) {
        if (processType == null) {
            return ALL_FUNCTION_CODES;
        }

        switch (processType) {
            case PayingForGoodsOrServices:
                return PAYING_FOR_GOODS_VALID_FUNCTION_CODES;
            case BalanceRequest:
                return BALANCE_REQUEST_VALID_FUNCTION_CODES;
            case Payment:
                return PAYMENT_VALID_FUNCTION_CODES;
            default:
                return null;
        }
    }

    public static List<FunctionCodeEnum> getLimitableFunctionCodes(ProcessTypeEnum processType) {
        if (processType == null) {
            return ALL_LIMITABLE_CODES;
        }

        switch (processType) {
            case PayingForGoodsOrServices:
                return PAYING_FOR_GOODS_LIMITABLE_FUNCTION_CODES;
            case BalanceRequest:
                return BALANCE_REQUEST_VALID_FUNCTION_CODES;
            case Payment:
                return PAYMENT_LIMITABLE_FUNCTION_CODES;
            default:
                return null;
        }
    }

    public static boolean isValidFunctionCode(ProcessTypeEnum processType, FunctionCodeEnum functionCode) {
        if (processType == null || functionCode == null) {
            return true;
        }

        switch (processType) {
            case PayingForGoodsOrServices:
                return PAYING_FOR_GOODS_VALID_FUNCTION_CODES.contains(functionCode);
            case BalanceRequest:
                return BALANCE_REQUEST_VALID_FUNCTION_CODES.contains(functionCode);
            case Payment:
                return PAYMENT_VALID_FUNCTION_CODES.contains(functionCode);
            default:
                return false;
        }
    }
}
