package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model;
import com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations.*;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Farhad on 12/8/2015.
 */
@Entity
@Table(name = "LIMITATION", schema = "UPLOAD" )
public class Limitation {
    private Long limitationId;
    private Long serviceRequestId;
    private Long merchantId;
    private Long switchId;
    private String acceptorCode;
    private String terminalNumber;
    private Long terminalId;
    private InfractionCodeEnum infractionCode;
    private UserPersonalityEnum personality;
    private Long businessCategoryId;
    private Long countryId;
    private Long provinceId;
    private Long cityId;
    private ProcessTypeEnum processType;
    private TerminalTypeEnum terminalType;
    private FunctionCodeEnum functionCode;
    private LimitationTypeEnum limitationType;
    private Long maxTransactionCount;
    private Long maxTotalAmount;
    private Long maxTransactionAmount;
    private Long minTransactionAmount;
    private Integer settlementDelay;
    private SettlementLimitationEnum settlementLimitation;
    private Timestamp startDate;
    private Timestamp expiryDate;
    private LimitationStatusEnum status;
    private String description;
    private ActivationStatusEnum isActive;
    /*  private City cityByCityId;
      private Switch switchBySwitchId;
      private Country countryByCountryId;*/
    private Merchant merchantByMerchantId;
/*    private Province provinceByProvinceId;
    private Terminal terminalByTerminalId;
    private ServiceRequest serviceRequestByServiceRequestId;
    private BusinessCategory businessCategoryByBusinessCategoryId;*/

    public Limitation() {
        status = LimitationStatusEnum.Active;
    }

    @Id
    @Column(name = "LIMITATION_ID", nullable = false, insertable = true, updatable = true, precision = 0)
    @GeneratedValue(generator = "LIMITATION_REQUEST_SEQ", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "LIMITATION_REQUEST_SEQ", allocationSize = 1, sequenceName = "LIMITATION_REQUEST_SEQ")
    public Long getLimitationId() {
        return limitationId;
    }

    public void setLimitationId(Long limitationId) {
        this.limitationId = limitationId;
    }

    @Basic
    @Column(name = "SERVICE_REQUEST_ID", nullable = false, insertable = false, updatable = false, precision = 0)
    public Long getServiceRequestId() {
        return serviceRequestId;
    }

    public void setServiceRequestId(Long serviceRequestId) {
        this.serviceRequestId = serviceRequestId;
    }

    @Basic
    @Column(name = "MERCHANT_ID", nullable = true, insertable = false, updatable = false, precision = 0)
    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    @Basic
    @Column(name = "SWITCH_ID", nullable = false, insertable = false, updatable = false, precision = 0)
    public Long getSwitchId() {
        return switchId;
    }

    public void setSwitchId(Long switchId) {
        this.switchId = switchId;
    }

    @Basic
    @Column(name = "ACCEPTOR_CODE", nullable = true, insertable = true, updatable = true, length = 15)
    public String getAcceptorCode() {
        return acceptorCode;
    }

    public void setAcceptorCode(String acceptorCode) {
        this.acceptorCode = acceptorCode;
    }

    @Basic
    @Column(name = "TERMINAL_NUMBER", nullable = true, insertable = true, updatable = true, length = 8)
    public String getTerminalNumber() {
        return terminalNumber;
    }

    public void setTerminalNumber(String terminalNumber) {
        this.terminalNumber = terminalNumber;
    }

    @Basic
    @Column(name = "TERMINAL_ID", nullable = true, insertable = false, updatable = false, precision = 0)
    public Long getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(Long terminalId) {
        this.terminalId = terminalId;
    }

    @Basic
    @Column(name = "INFRACTION_CODE", nullable = false, insertable = true, updatable = true, precision = 0)
    public InfractionCodeEnum getInfractionCode() {
        return infractionCode;
    }

    public void setInfractionCode(InfractionCodeEnum infractionCode) {
        this.infractionCode = infractionCode;
    }

    @Basic
    @Column(name = "PERSONALITY", nullable = false, insertable = true, updatable = true, precision = 0)
    public UserPersonalityEnum getPersonality() {
        return personality;
    }

    public void setPersonality(UserPersonalityEnum personality) {
        this.personality = personality;
    }

    @Basic
    @Column(name = "BUSINESS_CATEGORY_ID", nullable = true, insertable = false, updatable = false, precision = 0)
    public Long getBusinessCategoryId() {
        return businessCategoryId;
    }

    public void setBusinessCategoryId(Long businessCategoryId) {
        this.businessCategoryId = businessCategoryId;
    }

    @Basic
    @Column(name = "COUNTRY_ID", nullable = true, insertable = false, updatable = false, precision = 0)
    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    @Basic
    @Column(name = "PROVINCE_ID", nullable = true, insertable = false, updatable = false, precision = 0)
    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    @Basic
    @Column(name = "CITY_ID", nullable = true, insertable = false, updatable = false, precision = 0)
    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "PROCESS_TYPE", nullable = true, insertable = true, updatable = true, precision = 0)
    public ProcessTypeEnum getProcessType() {
        return processType;
    }

    public void setProcessType(ProcessTypeEnum processType) {
        this.processType = processType;
    }

    @Basic
    @Column(name = "TERMINAL_TYPE", nullable = true, insertable = true, updatable = true, precision = 0)
    public TerminalTypeEnum getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(TerminalTypeEnum terminalType) {
        this.terminalType = terminalType;
    }

    @Basic
    @Column(name = "FUNCTION_CODE", nullable = true, insertable = true, updatable = true, precision = 0)
    public FunctionCodeEnum getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(FunctionCodeEnum functionCode) {
        this.functionCode = functionCode;
    }

    @Basic
    @Column(name = "LIMITATION_TYPE", nullable = true, insertable = true, updatable = true, precision = 0)
    public LimitationTypeEnum getLimitationType() {
        return limitationType;
    }

    public void setLimitationType(LimitationTypeEnum limitationType) {
        this.limitationType = limitationType;
    }

    @Basic
    @Column(name = "MAX_TRANSACTION_COUNT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Long getMaxTransactionCount() {
        return maxTransactionCount;
    }

    public void setMaxTransactionCount(Long maxTransactionCount) {
        this.maxTransactionCount = maxTransactionCount;
    }

    @Basic
    @Column(name = "MAX_TOTAL_AMOUNT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Long getMaxTotalAmount() {
        return maxTotalAmount;
    }

    public void setMaxTotalAmount(Long maxTotalAmount) {
        this.maxTotalAmount = maxTotalAmount;
    }

    @Basic
    @Column(name = "MAX_TRANSACTION_AMOUNT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Long getMaxTransactionAmount() {
        return maxTransactionAmount;
    }

    public void setMaxTransactionAmount(Long maxTransactionAmount) {
        this.maxTransactionAmount = maxTransactionAmount;
    }

    @Basic
    @Column(name = "MIN_TRANSACTION_AMOUNT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Long getMinTransactionAmount() {
        return minTransactionAmount;
    }

    public void setMinTransactionAmount(Long minTransactionAmount) {
        this.minTransactionAmount = minTransactionAmount;
    }

    @Basic
    @Column(name = "SETTLEMENT_DELAY", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getSettlementDelay() {
        return settlementDelay;
    }

    public void setSettlementDelay(Integer settlementDelay) {
        this.settlementDelay = settlementDelay;
    }

    @Basic
    @Column(name = "SETTLEMENT_LIMITATION", nullable = true, insertable = true, updatable = true, precision = 0)
    public SettlementLimitationEnum getSettlementLimitation() {
        return settlementLimitation;
    }

    public void setSettlementLimitation(SettlementLimitationEnum settlementLimitation) {
        this.settlementLimitation = settlementLimitation;
    }

    @Basic
    @Column(name = "START_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "EXPIRY_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Timestamp expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Basic
    @Column(name = "STATUS", nullable = false, insertable = true, updatable = true, precision = 0)
    public LimitationStatusEnum getStatus() {
        return status;
    }

    public void setStatus(LimitationStatusEnum status) {
        this.status = status;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, insertable = true, updatable = true, length = 255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "IS_ACTIVE", nullable = false, insertable = true, updatable = true, precision = 0)
    public ActivationStatusEnum getIsActive() {
        return isActive;
    }

    public void setIsActive(ActivationStatusEnum isActive) {
        this.isActive = isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Limitation that = (Limitation) o;

        if (limitationId != null ? !limitationId.equals(that.limitationId) : that.limitationId != null) return false;
        if (serviceRequestId != null ? !serviceRequestId.equals(that.serviceRequestId) : that.serviceRequestId != null)
            return false;
        if (merchantId != null ? !merchantId.equals(that.merchantId) : that.merchantId != null) return false;
        if (switchId != null ? !switchId.equals(that.switchId) : that.switchId != null) return false;
        if (acceptorCode != null ? !acceptorCode.equals(that.acceptorCode) : that.acceptorCode != null) return false;
        if (terminalNumber != null ? !terminalNumber.equals(that.terminalNumber) : that.terminalNumber != null)
            return false;
        if (terminalId != null ? !terminalId.equals(that.terminalId) : that.terminalId != null) return false;
        if (infractionCode != null ? !infractionCode.equals(that.infractionCode) : that.infractionCode != null)
            return false;
        if (personality != null ? !personality.equals(that.personality) : that.personality != null) return false;
        if (businessCategoryId != null ? !businessCategoryId.equals(that.businessCategoryId) : that.businessCategoryId != null)
            return false;
        if (countryId != null ? !countryId.equals(that.countryId) : that.countryId != null) return false;
        if (provinceId != null ? !provinceId.equals(that.provinceId) : that.provinceId != null) return false;
        if (cityId != null ? !cityId.equals(that.cityId) : that.cityId != null) return false;
        if (processType != null ? !processType.equals(that.processType) : that.processType != null) return false;
        if (terminalType != null ? !terminalType.equals(that.terminalType) : that.terminalType != null) return false;
        if (functionCode != null ? !functionCode.equals(that.functionCode) : that.functionCode != null) return false;
        if (limitationType != null ? !limitationType.equals(that.limitationType) : that.limitationType != null)
            return false;
        if (maxTransactionCount != null ? !maxTransactionCount.equals(that.maxTransactionCount) : that.maxTransactionCount != null)
            return false;
        if (maxTotalAmount != null ? !maxTotalAmount.equals(that.maxTotalAmount) : that.maxTotalAmount != null)
            return false;
        if (maxTransactionAmount != null ? !maxTransactionAmount.equals(that.maxTransactionAmount) : that.maxTransactionAmount != null)
            return false;
        if (minTransactionAmount != null ? !minTransactionAmount.equals(that.minTransactionAmount) : that.minTransactionAmount != null)
            return false;
        if (settlementDelay != null ? !settlementDelay.equals(that.settlementDelay) : that.settlementDelay != null)
            return false;
        if (settlementLimitation != null ? !settlementLimitation.equals(that.settlementLimitation) : that.settlementLimitation != null)
            return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (expiryDate != null ? !expiryDate.equals(that.expiryDate) : that.expiryDate != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (isActive != null ? !isActive.equals(that.isActive) : that.isActive != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = limitationId != null ? limitationId.hashCode() : 0;
        result = 31 * result + (serviceRequestId != null ? serviceRequestId.hashCode() : 0);
        result = 31 * result + (merchantId != null ? merchantId.hashCode() : 0);
        result = 31 * result + (switchId != null ? switchId.hashCode() : 0);
        result = 31 * result + (acceptorCode != null ? acceptorCode.hashCode() : 0);
        result = 31 * result + (terminalNumber != null ? terminalNumber.hashCode() : 0);
        result = 31 * result + (terminalId != null ? terminalId.hashCode() : 0);
        result = 31 * result + (infractionCode != null ? infractionCode.hashCode() : 0);
        result = 31 * result + (personality != null ? personality.hashCode() : 0);
        result = 31 * result + (businessCategoryId != null ? businessCategoryId.hashCode() : 0);
        result = 31 * result + (countryId != null ? countryId.hashCode() : 0);
        result = 31 * result + (provinceId != null ? provinceId.hashCode() : 0);
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        result = 31 * result + (processType != null ? processType.hashCode() : 0);
        result = 31 * result + (terminalType != null ? terminalType.hashCode() : 0);
        result = 31 * result + (functionCode != null ? functionCode.hashCode() : 0);
        result = 31 * result + (limitationType != null ? limitationType.hashCode() : 0);
        result = 31 * result + (maxTransactionCount != null ? maxTransactionCount.hashCode() : 0);
        result = 31 * result + (maxTotalAmount != null ? maxTotalAmount.hashCode() : 0);
        result = 31 * result + (maxTransactionAmount != null ? maxTransactionAmount.hashCode() : 0);
        result = 31 * result + (minTransactionAmount != null ? minTransactionAmount.hashCode() : 0);
        result = 31 * result + (settlementDelay != null ? settlementDelay.hashCode() : 0);
        result = 31 * result + (settlementLimitation != null ? settlementLimitation.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (expiryDate != null ? expiryDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        return result;
    }
/*
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BUSINESS_CATEGORY_ID", referencedColumnName = "BUSINESS_CATEGORY_ID")
    public BusinessCategory getBusinessCategoryByBusinessCategoryId() {
        return businessCategoryByBusinessCategoryId;
    }

    public void setBusinessCategoryByBusinessCategoryId(BusinessCategory businessCategoryByBusinessCategoryId) {
        this.businessCategoryByBusinessCategoryId = businessCategoryByBusinessCategoryId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CITY_ID", referencedColumnName = "CITY_ID")
    public City getCityByCityId() {
        return cityByCityId;
    }

    public void setCityByCityId(City cityByCityId) {
        this.cityByCityId = cityByCityId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "COUNTRY_ID")
    public Country getCountryByCountryId() {
        return countryByCountryId;
    }

    public void setCountryByCountryId(Country countryByCountryId) {
        this.countryByCountryId = countryByCountryId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MERCHANT_ID", referencedColumnName = "MERCHANT_ID")
    public Merchant getMerchantByMerchantId() {
        return merchantByMerchantId;
    }

    public void setMerchantByMerchantId(Merchant merchantByMerchantId) {
        this.merchantByMerchantId = merchantByMerchantId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PROVINCE_ID", referencedColumnName = "PROVINCE_ID")
    public Province getProvinceByProvinceId() {
        return provinceByProvinceId;
    }

    public void setProvinceByProvinceId(Province provinceByProvinceId) {
        this.provinceByProvinceId = provinceByProvinceId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SERVICE_REQUEST_ID", referencedColumnName = "SERVICE_REQUEST_ID", nullable = false)
    public ServiceRequest getServiceRequestByServiceRequestId() {
        return serviceRequestByServiceRequestId;
    }

    public void setServiceRequestByServiceRequestId(ServiceRequest serviceRequestByServiceRequestId) {
        this.serviceRequestByServiceRequestId = serviceRequestByServiceRequestId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SWITCH_ID", referencedColumnName = "SWITCH_ID", nullable = false)
    public Switch getSwitchBySwitchId() {
        return switchBySwitchId;
    }

    public void setSwitchBySwitchId(Switch switchBySwitchId) {
        this.switchBySwitchId = switchBySwitchId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TERMINAL_ID", referencedColumnName = "TERMINAL_ID")
    public Terminal getTerminalByTerminalId() {
        return terminalByTerminalId;
    }

    public void setTerminalByTerminalId(Terminal terminalByTerminalId) {
        this.terminalByTerminalId = terminalByTerminalId;
    }*/
}
