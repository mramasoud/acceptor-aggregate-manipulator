package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.web.resource.data;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class MerchantWsDto {
    private Long merchantId;
    private Long shaparakId;
    private String shahabCode;
    private String firstNameFa;
    private String lastNameFa;
    private String fatherNameFa;
    private String firstNameEn;
    private String lastNameEn;
    private String fatherNameEn;
    private GenderEnum gender;
    private Timestamp birthDate;
    private Timestamp registerDate;
    private String nationalCode;
    private String registerNumber;
    private String comNameFa;
    private String comNameEn;
    private MerchantTypeEnum merchantType;
    private ResidencyTypeEnum residencyType;
    private VitalStatusEnum vitalStatus;
    private Long birthCrtfctNumber;
    private Integer birthCrtfctSerial;
    private BirthCertificateSeriesLetterEnum birthCrtfctSeriesLetter;
    private Integer birthCrtfctSeriesNumber;
    private ActivationStatusEnum isActive;
    private String nationalLegalCode;
    private String commercialCode;
    private Long countryId;
    private Long cityId;
    private Long provinceId;
    private String foreignPervasiveCode;
    private String passportNumber;
    private Timestamp passportExpireDate;
    private String description;
    private Long userId;
    private String telephoneNumber;
    private String cellPhoneNumber;
    private String emailAddress;
    private String webSite;
    private String fax;
}
