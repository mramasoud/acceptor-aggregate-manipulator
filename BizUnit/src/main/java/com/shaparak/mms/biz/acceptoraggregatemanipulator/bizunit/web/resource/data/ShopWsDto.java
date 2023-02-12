package com.shaparak.mms.biz.acceptoraggregatemanipulator.bizunit.web.resource.data;

import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations.ActivationStatusEnum;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations.BusinessTypeEnum;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations.ETrustCertificateTypeEnum;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations.LocationOwnerShipTypeEnum;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class ShopWsDto {
    private Long shopId;
    private Long merchantId;
    private String telephoneNumber;
    private String postalCode;
    private String taxPayerCode;
    private String faxNumber;
    private String emailAddress;
    private String websiteAddress;
    private String businessCertificateNumber;
    private Timestamp certificateExpiryDate;
    private String description;
    private ActivationStatusEnum isActive;
    private Long businessCategoryId;
    private Timestamp certificateIssueDate;
    private Timestamp rentalExpiryDate;
    private String rentalContractNumber;
    private String address;
    private Long countryId;
    private Long provinceId;
    private Long cityId;
    private LocationOwnerShipTypeEnum ownershipType;
    private String farsiName;
    private String englishName;
    private BusinessTypeEnum businessType;
    private ETrustCertificateTypeEnum etrustCertificateType;
    private Timestamp etrustCertificateIssueDate;
    private Timestamp etrustCertificateExpiryDate;
}
