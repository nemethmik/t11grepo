package com.tiva11.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class B1BusinessPlace implements Serializable {
    public B1BusinessPlace(){}
    public B1BusinessPlace(int id,String name){
        setBPLID(id);
        setBPLName(name);
    }
    @SerializedName("BPLID")
    @Expose
    private Integer bPLID;
    @SerializedName("BPLName")
    @Expose
    private String bPLName;
    @SerializedName("BPLNameForeign")
    @Expose
    private String bPLNameForeign;
    @SerializedName("VATRegNum")
    @Expose
    private Object vATRegNum;
    @SerializedName("RepName")
    @Expose
    private Object repName;
    @SerializedName("Industry")
    @Expose
    private Object industry;
    @SerializedName("Business")
    @Expose
    private Object business;
    @SerializedName("Address")
    @Expose
    private String address;
    @SerializedName("Addressforeign")
    @Expose
    private Object addressforeign;
    @SerializedName("MainBPL")
    @Expose
    private String mainBPL;
    @SerializedName("TaxOfficeNo")
    @Expose
    private Object taxOfficeNo;
    @SerializedName("Disabled")
    @Expose
    private String disabled;
    @SerializedName("DefaultCustomerID")
    @Expose
    private Object defaultCustomerID;
    @SerializedName("DefaultVendorID")
    @Expose
    private Object defaultVendorID;
    @SerializedName("DefaultWarehouseID")
    @Expose
    private String defaultWarehouseID;
    @SerializedName("DefaultTaxCode")
    @Expose
    private Object defaultTaxCode;
    @SerializedName("TaxOffice")
    @Expose
    private Object taxOffice;
    @SerializedName("FederalTaxID")
    @Expose
    private String federalTaxID;
    @SerializedName("FederalTaxID2")
    @Expose
    private Object federalTaxID2;
    @SerializedName("FederalTaxID3")
    @Expose
    private Object federalTaxID3;
    @SerializedName("AdditionalIdNumber")
    @Expose
    private Object additionalIdNumber;
    @SerializedName("NatureOfCompanyCode")
    @Expose
    private Integer natureOfCompanyCode;
    @SerializedName("EconomicActivityTypeCode")
    @Expose
    private Integer economicActivityTypeCode;
    @SerializedName("CreditContributionOriginCode")
    @Expose
    private Object creditContributionOriginCode;
    @SerializedName("IPIPeriodCode")
    @Expose
    private Object iPIPeriodCode;
    @SerializedName("CooperativeAssociationTypeCode")
    @Expose
    private Integer cooperativeAssociationTypeCode;
    @SerializedName("ProfitTaxationCode")
    @Expose
    private Integer profitTaxationCode;
    @SerializedName("CompanyQualificationCode")
    @Expose
    private Integer companyQualificationCode;
    @SerializedName("DeclarerTypeCode")
    @Expose
    private Integer declarerTypeCode;
    @SerializedName("PreferredStateCode")
    @Expose
    private Object preferredStateCode;
    @SerializedName("AddressType")
    @Expose
    private Object addressType;
    @SerializedName("Street")
    @Expose
    private Object street;
    @SerializedName("StreetNo")
    @Expose
    private Object streetNo;
    @SerializedName("Building")
    @Expose
    private Object building;
    @SerializedName("ZipCode")
    @Expose
    private Object zipCode;
    @SerializedName("Block")
    @Expose
    private Object block;
    @SerializedName("City")
    @Expose
    private Object city;
    @SerializedName("State")
    @Expose
    private String state;
    @SerializedName("County")
    @Expose
    private Object county;
    @SerializedName("Country")
    @Expose
    private String country;
    @SerializedName("AliasName")
    @Expose
    private Object aliasName;
    @SerializedName("CommercialRegister")
    @Expose
    private Object commercialRegister;
    @SerializedName("DateOfIncorporation")
    @Expose
    private Object dateOfIncorporation;
    @SerializedName("SPEDProfile")
    @Expose
    private Object sPEDProfile;
    @SerializedName("EnvironmentType")
    @Expose
    private Integer environmentType;
    @SerializedName("Opting4ICMS")
    @Expose
    private String opting4ICMS;
    @SerializedName("PaymentClearingAccount")
    @Expose
    private Object paymentClearingAccount;
    @SerializedName("GlobalLocationNumber")
    @Expose
    private Object globalLocationNumber;
    @SerializedName("DefaultResourceWarehouseID")
    @Expose
    private String defaultResourceWarehouseID;
    @SerializedName("BusinessPlaceIENumbers")
    @Expose
    private List<Object> businessPlaceIENumbers = null;
    @SerializedName("BusinessPlaceTributaryInfos")
    @Expose
    private List<Object> businessPlaceTributaryInfos = null;
    private final static long serialVersionUID = 1017234522983666870L;

    public Integer getBPLID() {
        return bPLID;
    }

    public void setBPLID(Integer bPLID) {
        this.bPLID = bPLID;
    }

    public String getBPLName() {
        return bPLName;
    }

    public void setBPLName(String bPLName) {
        this.bPLName = bPLName;
    }

    public String getBPLNameForeign() {
        return bPLNameForeign;
    }

    public void setBPLNameForeign(String bPLNameForeign) {
        this.bPLNameForeign = bPLNameForeign;
    }

    public Object getVATRegNum() {
        return vATRegNum;
    }

    public void setVATRegNum(Object vATRegNum) {
        this.vATRegNum = vATRegNum;
    }

    public Object getRepName() {
        return repName;
    }

    public void setRepName(Object repName) {
        this.repName = repName;
    }

    public Object getIndustry() {
        return industry;
    }

    public void setIndustry(Object industry) {
        this.industry = industry;
    }

    public Object getBusiness() {
        return business;
    }

    public void setBusiness(Object business) {
        this.business = business;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Object getAddressforeign() {
        return addressforeign;
    }

    public void setAddressforeign(Object addressforeign) {
        this.addressforeign = addressforeign;
    }

    public String getMainBPL() {
        return mainBPL;
    }

    public void setMainBPL(String mainBPL) {
        this.mainBPL = mainBPL;
    }

    public Object getTaxOfficeNo() {
        return taxOfficeNo;
    }

    public void setTaxOfficeNo(Object taxOfficeNo) {
        this.taxOfficeNo = taxOfficeNo;
    }

    public String getDisabled() {
        return disabled;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    public Object getDefaultCustomerID() {
        return defaultCustomerID;
    }

    public void setDefaultCustomerID(Object defaultCustomerID) {
        this.defaultCustomerID = defaultCustomerID;
    }

    public Object getDefaultVendorID() {
        return defaultVendorID;
    }

    public void setDefaultVendorID(Object defaultVendorID) {
        this.defaultVendorID = defaultVendorID;
    }

    public String getDefaultWarehouseID() {
        return defaultWarehouseID;
    }

    public void setDefaultWarehouseID(String defaultWarehouseID) {
        this.defaultWarehouseID = defaultWarehouseID;
    }

    public Object getDefaultTaxCode() {
        return defaultTaxCode;
    }

    public void setDefaultTaxCode(Object defaultTaxCode) {
        this.defaultTaxCode = defaultTaxCode;
    }

    public Object getTaxOffice() {
        return taxOffice;
    }

    public void setTaxOffice(Object taxOffice) {
        this.taxOffice = taxOffice;
    }

    public String getFederalTaxID() {
        return federalTaxID;
    }

    public void setFederalTaxID(String federalTaxID) {
        this.federalTaxID = federalTaxID;
    }

    public Object getFederalTaxID2() {
        return federalTaxID2;
    }

    public void setFederalTaxID2(Object federalTaxID2) {
        this.federalTaxID2 = federalTaxID2;
    }

    public Object getFederalTaxID3() {
        return federalTaxID3;
    }

    public void setFederalTaxID3(Object federalTaxID3) {
        this.federalTaxID3 = federalTaxID3;
    }

    public Object getAdditionalIdNumber() {
        return additionalIdNumber;
    }

    public void setAdditionalIdNumber(Object additionalIdNumber) {
        this.additionalIdNumber = additionalIdNumber;
    }

    public Integer getNatureOfCompanyCode() {
        return natureOfCompanyCode;
    }

    public void setNatureOfCompanyCode(Integer natureOfCompanyCode) {
        this.natureOfCompanyCode = natureOfCompanyCode;
    }

    public Integer getEconomicActivityTypeCode() {
        return economicActivityTypeCode;
    }

    public void setEconomicActivityTypeCode(Integer economicActivityTypeCode) {
        this.economicActivityTypeCode = economicActivityTypeCode;
    }

    public Object getCreditContributionOriginCode() {
        return creditContributionOriginCode;
    }

    public void setCreditContributionOriginCode(Object creditContributionOriginCode) {
        this.creditContributionOriginCode = creditContributionOriginCode;
    }

    public Object getIPIPeriodCode() {
        return iPIPeriodCode;
    }

    public void setIPIPeriodCode(Object iPIPeriodCode) {
        this.iPIPeriodCode = iPIPeriodCode;
    }

    public Integer getCooperativeAssociationTypeCode() {
        return cooperativeAssociationTypeCode;
    }

    public void setCooperativeAssociationTypeCode(Integer cooperativeAssociationTypeCode) {
        this.cooperativeAssociationTypeCode = cooperativeAssociationTypeCode;
    }

    public Integer getProfitTaxationCode() {
        return profitTaxationCode;
    }

    public void setProfitTaxationCode(Integer profitTaxationCode) {
        this.profitTaxationCode = profitTaxationCode;
    }

    public Integer getCompanyQualificationCode() {
        return companyQualificationCode;
    }

    public void setCompanyQualificationCode(Integer companyQualificationCode) {
        this.companyQualificationCode = companyQualificationCode;
    }

    public Integer getDeclarerTypeCode() {
        return declarerTypeCode;
    }

    public void setDeclarerTypeCode(Integer declarerTypeCode) {
        this.declarerTypeCode = declarerTypeCode;
    }

    public Object getPreferredStateCode() {
        return preferredStateCode;
    }

    public void setPreferredStateCode(Object preferredStateCode) {
        this.preferredStateCode = preferredStateCode;
    }

    public Object getAddressType() {
        return addressType;
    }

    public void setAddressType(Object addressType) {
        this.addressType = addressType;
    }

    public Object getStreet() {
        return street;
    }

    public void setStreet(Object street) {
        this.street = street;
    }

    public Object getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(Object streetNo) {
        this.streetNo = streetNo;
    }

    public Object getBuilding() {
        return building;
    }

    public void setBuilding(Object building) {
        this.building = building;
    }

    public Object getZipCode() {
        return zipCode;
    }

    public void setZipCode(Object zipCode) {
        this.zipCode = zipCode;
    }

    public Object getBlock() {
        return block;
    }

    public void setBlock(Object block) {
        this.block = block;
    }

    public Object getCity() {
        return city;
    }

    public void setCity(Object city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Object getCounty() {
        return county;
    }

    public void setCounty(Object county) {
        this.county = county;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Object getAliasName() {
        return aliasName;
    }

    public void setAliasName(Object aliasName) {
        this.aliasName = aliasName;
    }

    public Object getCommercialRegister() {
        return commercialRegister;
    }

    public void setCommercialRegister(Object commercialRegister) {
        this.commercialRegister = commercialRegister;
    }

    public Object getDateOfIncorporation() {
        return dateOfIncorporation;
    }

    public void setDateOfIncorporation(Object dateOfIncorporation) {
        this.dateOfIncorporation = dateOfIncorporation;
    }

    public Object getSPEDProfile() {
        return sPEDProfile;
    }

    public void setSPEDProfile(Object sPEDProfile) {
        this.sPEDProfile = sPEDProfile;
    }

    public Integer getEnvironmentType() {
        return environmentType;
    }

    public void setEnvironmentType(Integer environmentType) {
        this.environmentType = environmentType;
    }

    public String getOpting4ICMS() {
        return opting4ICMS;
    }

    public void setOpting4ICMS(String opting4ICMS) {
        this.opting4ICMS = opting4ICMS;
    }

    public Object getPaymentClearingAccount() {
        return paymentClearingAccount;
    }

    public void setPaymentClearingAccount(Object paymentClearingAccount) {
        this.paymentClearingAccount = paymentClearingAccount;
    }

    public Object getGlobalLocationNumber() {
        return globalLocationNumber;
    }

    public void setGlobalLocationNumber(Object globalLocationNumber) {
        this.globalLocationNumber = globalLocationNumber;
    }

    public String getDefaultResourceWarehouseID() {
        return defaultResourceWarehouseID;
    }

    public void setDefaultResourceWarehouseID(String defaultResourceWarehouseID) {
        this.defaultResourceWarehouseID = defaultResourceWarehouseID;
    }

    public List<Object> getBusinessPlaceIENumbers() {
        return businessPlaceIENumbers;
    }

    public void setBusinessPlaceIENumbers(List<Object> businessPlaceIENumbers) {
        this.businessPlaceIENumbers = businessPlaceIENumbers;
    }

    public List<Object> getBusinessPlaceTributaryInfos() {
        return businessPlaceTributaryInfos;
    }

    public void setBusinessPlaceTributaryInfos(List<Object> businessPlaceTributaryInfos) {
        this.businessPlaceTributaryInfos = businessPlaceTributaryInfos;
    }

    public static class B1BusinessPlaces implements Serializable {
        @SerializedName("odata.metadata")
        @Expose
        private String odataMetadata;
        @SerializedName("value")
        @Expose
        private List<B1BusinessPlace> value = null;
        private final static long serialVersionUID = 356571045753196222L;

        public String getOdataMetadata() {
            return odataMetadata;
        }

        public void setOdataMetadata(String odataMetadata) {
            this.odataMetadata = odataMetadata;
        }

        public List<B1BusinessPlace> getValue() {
            return value;
        }

        public void setValue(List<B1BusinessPlace> value) {
            this.value = value;
        }

    }

}