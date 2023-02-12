package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum UserPersonalityEnum {

    MerchantUser(0),
    PspUser(1),
    ShaparakSupervisionUser(2),
    ShaparakOperationUser(3),
    ShaparakSecurityUser(4),
    SwitchConfigurationUser(5),
    BankUser(6),
    JudiciaryUser(7),
    PaymentFacilitatorUser(8),
    TaxUser(9);

    private static final List<UserPersonalityEnum> NON_MERCHANT_PERSONALITIES = new ArrayList<>();
    private static final List<UserPersonalityEnum> SHAPARAK_PERSONALITIES = new ArrayList<>();
    private static final List<UserPersonalityEnum> WEB_SERVICE_PERSONALITIES = new ArrayList<>();
    private static final List<UserPersonalityEnum> UI_USER = new ArrayList<>();

    static {
        NON_MERCHANT_PERSONALITIES.addAll(getAllUserPersonalities());
        NON_MERCHANT_PERSONALITIES.remove(UserPersonalityEnum.MerchantUser);

        SHAPARAK_PERSONALITIES.add(ShaparakSupervisionUser);
        SHAPARAK_PERSONALITIES.add(ShaparakOperationUser);
        SHAPARAK_PERSONALITIES.add(ShaparakSecurityUser);

        WEB_SERVICE_PERSONALITIES.add(PspUser);
        WEB_SERVICE_PERSONALITIES.add(BankUser);
        WEB_SERVICE_PERSONALITIES.add(PaymentFacilitatorUser);

        UI_USER.add(MerchantUser);
        UI_USER.add(ShaparakSupervisionUser);
        UI_USER.add(ShaparakOperationUser);
        UI_USER.add(ShaparakSecurityUser);
        UI_USER.add(SwitchConfigurationUser);
        UI_USER.add(JudiciaryUser);
    }

    UserPersonalityEnum(int userPersonalityCode) {
        this.userPersonalityCode = userPersonalityCode;
    }

    int userPersonalityCode;

    @JsonValue
    public int getUserPersonalityCode() {
        return userPersonalityCode;
    }

    public static List<UserPersonalityEnum> getAllUserPersonalities() {
        return new ArrayList<>(Arrays.asList(UserPersonalityEnum.values()));
    }

    public static List<UserPersonalityEnum> getNonMerchantPersonalities() {
        return NON_MERCHANT_PERSONALITIES;
    }

    public static List<UserPersonalityEnum> getShaparakPersonalities() {
        return SHAPARAK_PERSONALITIES;
    }

    public static List<UserPersonalityEnum> getWebServicePersonalities() {
        return WEB_SERVICE_PERSONALITIES;
    }

    public static boolean isUIUser(UserPersonalityEnum personalityEnum) {
        return UI_USER.contains(personalityEnum);
    }
}
