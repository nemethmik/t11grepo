package com.tiva11.model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class B1Document implements Serializable
{
    public static class LineTaxJurisdiction implements Serializable
    {

        @SerializedName("JurisdictionCode")
        @Expose
        private String jurisdictionCode;
        @SerializedName("JurisdictionType")
        @Expose
        private Integer jurisdictionType;
        @SerializedName("TaxAmount")
        @Expose
        private Double taxAmount;
        @SerializedName("TaxAmountSC")
        @Expose
        private Double taxAmountSC;
        @SerializedName("TaxAmountFC")
        @Expose
        private Double taxAmountFC;
        @SerializedName("TaxRate")
        @Expose
        private Double taxRate;
        @SerializedName("DocEntry")
        @Expose
        private Integer docEntry;
        @SerializedName("LineNumber")
        @Expose
        private Integer lineNumber;
        @SerializedName("RowSequence")
        @Expose
        private Integer rowSequence;
        private final static long serialVersionUID = -2797943329724843590L;

        public String getJurisdictionCode() {
            return jurisdictionCode;
        }

        public void setJurisdictionCode(String jurisdictionCode) {
            this.jurisdictionCode = jurisdictionCode;
        }

        public Integer getJurisdictionType() {
            return jurisdictionType;
        }

        public void setJurisdictionType(Integer jurisdictionType) {
            this.jurisdictionType = jurisdictionType;
        }

        public Double getTaxAmount() {
            return taxAmount;
        }

        public void setTaxAmount(Double taxAmount) {
            this.taxAmount = taxAmount;
        }

        public Double getTaxAmountSC() {
            return taxAmountSC;
        }

        public void setTaxAmountSC(Double taxAmountSC) {
            this.taxAmountSC = taxAmountSC;
        }

        public Double getTaxAmountFC() {
            return taxAmountFC;
        }

        public void setTaxAmountFC(Double taxAmountFC) {
            this.taxAmountFC = taxAmountFC;
        }

        public Double getTaxRate() {
            return taxRate;
        }

        public void setTaxRate(Double taxRate) {
            this.taxRate = taxRate;
        }

        public Integer getDocEntry() {
            return docEntry;
        }

        public void setDocEntry(Integer docEntry) {
            this.docEntry = docEntry;
        }

        public Integer getLineNumber() {
            return lineNumber;
        }

        public void setLineNumber(Integer lineNumber) {
            this.lineNumber = lineNumber;
        }

        public Integer getRowSequence() {
            return rowSequence;
        }

        public void setRowSequence(Integer rowSequence) {
            this.rowSequence = rowSequence;
        }

    }

    public static class TaxExtension implements Serializable
    {

        private final static long serialVersionUID = -8880079947739279161L;

    }
    public static class AddressExtension implements Serializable
    {

        private final static long serialVersionUID = 3490214962618396869L;

    }

    @SerializedName("DocEntry")
    @Expose
    private Integer docEntry;
    @SerializedName("DocNum")
    @Expose
    private Integer docNum;
    @SerializedName("DocType")
    @Expose
    private String docType;
    @SerializedName("HandWritten")
    @Expose
    private String handWritten;
    @SerializedName("Printed")
    @Expose
    private String printed;
    @SerializedName("DocDate")
    @Expose
    private String docDate;
    @SerializedName("DocDueDate")
    @Expose
    private String docDueDate;
    @SerializedName("CardCode")
    @Expose
    private String cardCode;
    @SerializedName("CardName")
    @Expose
    private String cardName;
    @SerializedName("Address")
    @Expose
    private String address;
    @SerializedName("NumAtCard")
    @Expose
    private Object numAtCard;
    @SerializedName("DocTotal")
    @Expose
    private Double docTotal;
    @SerializedName("AttachmentEntry")
    @Expose
    private Object attachmentEntry;
    @SerializedName("DocCurrency")
    @Expose
    private String docCurrency;
    @SerializedName("DocRate")
    @Expose
    private Double docRate;
    @SerializedName("Reference1")
    @Expose
    private String reference1;
    @SerializedName("Reference2")
    @Expose
    private Object reference2;
    @SerializedName("Comments")
    @Expose
    private String comments;
    @SerializedName("JournalMemo")
    @Expose
    private String journalMemo;
    @SerializedName("PaymentGroupCode")
    @Expose
    private Integer paymentGroupCode;
    @SerializedName("DocTime")
    @Expose
    private String docTime;
    @SerializedName("SalesPersonCode")
    @Expose
    private Integer salesPersonCode;
    @SerializedName("TransportationCode")
    @Expose
    private Integer transportationCode;
    @SerializedName("Confirmed")
    @Expose
    private String confirmed;
    @SerializedName("ImportFileNum")
    @Expose
    private Object importFileNum;
    @SerializedName("SummeryType")
    @Expose
    private String summeryType;
    @SerializedName("ContactPersonCode")
    @Expose
    private Integer contactPersonCode;
    @SerializedName("ShowSCN")
    @Expose
    private String showSCN;
    @SerializedName("Series")
    @Expose
    private Integer series;
    @SerializedName("TaxDate")
    @Expose
    private String taxDate;
    @SerializedName("PartialSupply")
    @Expose
    private String partialSupply;
    @SerializedName("DocObjectCode")
    @Expose
    private String docObjectCode;
    @SerializedName("ShipToCode")
    @Expose
    private String shipToCode;
    @SerializedName("Indicator")
    @Expose
    private Object indicator;
    @SerializedName("FederalTaxID")
    @Expose
    private Object federalTaxID;
    @SerializedName("DiscountPercent")
    @Expose
    private Double discountPercent;
    @SerializedName("PaymentReference")
    @Expose
    private Object paymentReference;
    @SerializedName("CreationDate")
    @Expose
    private String creationDate;
    @SerializedName("UpdateDate")
    @Expose
    private String updateDate;
    @SerializedName("FinancialPeriod")
    @Expose
    private Integer financialPeriod;
    @SerializedName("TransNum")
    @Expose
    private Object transNum;
    @SerializedName("VatSum")
    @Expose
    private Double vatSum;
    @SerializedName("VatSumSys")
    @Expose
    private Double vatSumSys;
    @SerializedName("VatSumFc")
    @Expose
    private Double vatSumFc;
    @SerializedName("NetProcedure")
    @Expose
    private String netProcedure;
    @SerializedName("DocTotalFc")
    @Expose
    private Double docTotalFc;
    @SerializedName("DocTotalSys")
    @Expose
    private Double docTotalSys;
    @SerializedName("Form1099")
    @Expose
    private Object form1099;
    @SerializedName("Box1099")
    @Expose
    private Object box1099;
    @SerializedName("RevisionPo")
    @Expose
    private String revisionPo;
    @SerializedName("RequriedDate")
    @Expose
    private Object requriedDate;
    @SerializedName("CancelDate")
    @Expose
    private Object cancelDate;
    @SerializedName("BlockDunning")
    @Expose
    private String blockDunning;
    @SerializedName("Submitted")
    @Expose
    private String submitted;
    @SerializedName("Segment")
    @Expose
    private Integer segment;
    @SerializedName("PickStatus")
    @Expose
    private String pickStatus;
    @SerializedName("Pick")
    @Expose
    private String pick;
    @SerializedName("PaymentMethod")
    @Expose
    private String paymentMethod;
    @SerializedName("PaymentBlock")
    @Expose
    private String paymentBlock;
    @SerializedName("PaymentBlockEntry")
    @Expose
    private Object paymentBlockEntry;
    @SerializedName("CentralBankIndicator")
    @Expose
    private Object centralBankIndicator;
    @SerializedName("MaximumCashDiscount")
    @Expose
    private String maximumCashDiscount;
    @SerializedName("Reserve")
    @Expose
    private String reserve;
    @SerializedName("Project")
    @Expose
    private Object project;
    @SerializedName("ExemptionValidityDateFrom")
    @Expose
    private Object exemptionValidityDateFrom;
    @SerializedName("ExemptionValidityDateTo")
    @Expose
    private Object exemptionValidityDateTo;
    @SerializedName("WareHouseUpdateType")
    @Expose
    private String wareHouseUpdateType;
    @SerializedName("Rounding")
    @Expose
    private String rounding;
    @SerializedName("ExternalCorrectedDocNum")
    @Expose
    private Object externalCorrectedDocNum;
    @SerializedName("InternalCorrectedDocNum")
    @Expose
    private Object internalCorrectedDocNum;
    @SerializedName("NextCorrectingDocument")
    @Expose
    private Object nextCorrectingDocument;
    @SerializedName("DeferredTax")
    @Expose
    private String deferredTax;
    @SerializedName("TaxExemptionLetterNum")
    @Expose
    private Object taxExemptionLetterNum;
    @SerializedName("WTApplied")
    @Expose
    private Double wTApplied;
    @SerializedName("WTAppliedFC")
    @Expose
    private Double wTAppliedFC;
    @SerializedName("BillOfExchangeReserved")
    @Expose
    private String billOfExchangeReserved;
    @SerializedName("AgentCode")
    @Expose
    private Object agentCode;
    @SerializedName("WTAppliedSC")
    @Expose
    private Double wTAppliedSC;
    @SerializedName("TotalEqualizationTax")
    @Expose
    private Double totalEqualizationTax;
    @SerializedName("TotalEqualizationTaxFC")
    @Expose
    private Double totalEqualizationTaxFC;
    @SerializedName("TotalEqualizationTaxSC")
    @Expose
    private Double totalEqualizationTaxSC;
    @SerializedName("NumberOfInstallments")
    @Expose
    private Integer numberOfInstallments;
    @SerializedName("ApplyTaxOnFirstInstallment")
    @Expose
    private String applyTaxOnFirstInstallment;
    @SerializedName("WTNonSubjectAmount")
    @Expose
    private Double wTNonSubjectAmount;
    @SerializedName("WTNonSubjectAmountSC")
    @Expose
    private Double wTNonSubjectAmountSC;
    @SerializedName("WTNonSubjectAmountFC")
    @Expose
    private Double wTNonSubjectAmountFC;
    @SerializedName("WTExemptedAmount")
    @Expose
    private Double wTExemptedAmount;
    @SerializedName("WTExemptedAmountSC")
    @Expose
    private Double wTExemptedAmountSC;
    @SerializedName("WTExemptedAmountFC")
    @Expose
    private Double wTExemptedAmountFC;
    @SerializedName("BaseAmount")
    @Expose
    private Double baseAmount;
    @SerializedName("BaseAmountSC")
    @Expose
    private Double baseAmountSC;
    @SerializedName("BaseAmountFC")
    @Expose
    private Double baseAmountFC;
    @SerializedName("WTAmount")
    @Expose
    private Double wTAmount;
    @SerializedName("WTAmountSC")
    @Expose
    private Double wTAmountSC;
    @SerializedName("WTAmountFC")
    @Expose
    private Double wTAmountFC;
    @SerializedName("VatDate")
    @Expose
    private Object vatDate;
    @SerializedName("DocumentsOwner")
    @Expose
    private Object documentsOwner;
    @SerializedName("FolioPrefixString")
    @Expose
    private Object folioPrefixString;
    @SerializedName("FolioNumber")
    @Expose
    private Object folioNumber;
    @SerializedName("DocumentSubType")
    @Expose
    private String documentSubType;
    @SerializedName("BPChannelCode")
    @Expose
    private Object bPChannelCode;
    @SerializedName("BPChannelContact")
    @Expose
    private Object bPChannelContact;
    @SerializedName("Address2")
    @Expose
    private String address2;
    @SerializedName("DocumentStatus")
    @Expose
    private String documentStatus;
    @SerializedName("PeriodIndicator")
    @Expose
    private String periodIndicator;
    @SerializedName("PayToCode")
    @Expose
    private String payToCode;
    @SerializedName("ManualNumber")
    @Expose
    private Object manualNumber;
    @SerializedName("UseShpdGoodsAct")
    @Expose
    private String useShpdGoodsAct;
    @SerializedName("IsPayToBank")
    @Expose
    private String isPayToBank;
    @SerializedName("PayToBankCountry")
    @Expose
    private Object payToBankCountry;
    @SerializedName("PayToBankCode")
    @Expose
    private Object payToBankCode;
    @SerializedName("PayToBankAccountNo")
    @Expose
    private Object payToBankAccountNo;
    @SerializedName("PayToBankBranch")
    @Expose
    private Object payToBankBranch;
    @SerializedName("BPL_IDAssignedToInvoice")
    @Expose
    private Integer bPLIDAssignedToInvoice;
    @SerializedName("DownPayment")
    @Expose
    private Double downPayment;
    @SerializedName("ReserveInvoice")
    @Expose
    private String reserveInvoice;
    @SerializedName("LanguageCode")
    @Expose
    private Integer languageCode;
    @SerializedName("TrackingNumber")
    @Expose
    private Object trackingNumber;
    @SerializedName("PickRemark")
    @Expose
    private Object pickRemark;
    @SerializedName("ClosingDate")
    @Expose
    private Object closingDate;
    @SerializedName("SequenceCode")
    @Expose
    private Object sequenceCode;
    @SerializedName("SequenceSerial")
    @Expose
    private Object sequenceSerial;
    @SerializedName("SeriesString")
    @Expose
    private Object seriesString;
    @SerializedName("SubSeriesString")
    @Expose
    private Object subSeriesString;
    @SerializedName("SequenceModel")
    @Expose
    private String sequenceModel;
    @SerializedName("UseCorrectionVATGroup")
    @Expose
    private String useCorrectionVATGroup;
    @SerializedName("TotalDiscount")
    @Expose
    private Double totalDiscount;
    @SerializedName("DownPaymentAmount")
    @Expose
    private Double downPaymentAmount;
    @SerializedName("DownPaymentPercentage")
    @Expose
    private Double downPaymentPercentage;
    @SerializedName("DownPaymentType")
    @Expose
    private String downPaymentType;
    @SerializedName("DownPaymentAmountSC")
    @Expose
    private Double downPaymentAmountSC;
    @SerializedName("DownPaymentAmountFC")
    @Expose
    private Double downPaymentAmountFC;
    @SerializedName("VatPercent")
    @Expose
    private Double vatPercent;
    @SerializedName("ServiceGrossProfitPercent")
    @Expose
    private Object serviceGrossProfitPercent;
    @SerializedName("OpeningRemarks")
    @Expose
    private String openingRemarks;
    @SerializedName("ClosingRemarks")
    @Expose
    private String closingRemarks;
    @SerializedName("RoundingDiffAmount")
    @Expose
    private Double roundingDiffAmount;
    @SerializedName("RoundingDiffAmountFC")
    @Expose
    private Double roundingDiffAmountFC;
    @SerializedName("RoundingDiffAmountSC")
    @Expose
    private Double roundingDiffAmountSC;
    @SerializedName("Cancelled")
    @Expose
    private String cancelled;
    @SerializedName("SignatureInputMessage")
    @Expose
    private String signatureInputMessage;
    @SerializedName("SignatureDigest")
    @Expose
    private String signatureDigest;
    @SerializedName("CertificationNumber")
    @Expose
    private Object certificationNumber;
    @SerializedName("PrivateKeyVersion")
    @Expose
    private Object privateKeyVersion;
    @SerializedName("ControlAccount")
    @Expose
    private String controlAccount;
    @SerializedName("InsuranceOperation347")
    @Expose
    private String insuranceOperation347;
    @SerializedName("ArchiveNonremovableSalesQuotation")
    @Expose
    private String archiveNonremovableSalesQuotation;
    @SerializedName("GTSChecker")
    @Expose
    private Object gTSChecker;
    @SerializedName("GTSPayee")
    @Expose
    private Object gTSPayee;
    @SerializedName("ExtraMonth")
    @Expose
    private Integer extraMonth;
    @SerializedName("ExtraDays")
    @Expose
    private Integer extraDays;
    @SerializedName("CashDiscountDateOffset")
    @Expose
    private Integer cashDiscountDateOffset;
    @SerializedName("StartFrom")
    @Expose
    private String startFrom;
    @SerializedName("NTSApproved")
    @Expose
    private String nTSApproved;
    @SerializedName("ETaxWebSite")
    @Expose
    private Object eTaxWebSite;
    @SerializedName("ETaxNumber")
    @Expose
    private Object eTaxNumber;
    @SerializedName("NTSApprovedNumber")
    @Expose
    private Object nTSApprovedNumber;
    @SerializedName("EDocGenerationType")
    @Expose
    private String eDocGenerationType;
    @SerializedName("EDocSeries")
    @Expose
    private Object eDocSeries;
    @SerializedName("EDocNum")
    @Expose
    private Object eDocNum;
    @SerializedName("EDocExportFormat")
    @Expose
    private Object eDocExportFormat;
    @SerializedName("EDocStatus")
    @Expose
    private String eDocStatus;
    @SerializedName("EDocErrorCode")
    @Expose
    private Object eDocErrorCode;
    @SerializedName("EDocErrorMessage")
    @Expose
    private String eDocErrorMessage;
    @SerializedName("DownPaymentStatus")
    @Expose
    private String downPaymentStatus;
    @SerializedName("GroupSeries")
    @Expose
    private Object groupSeries;
    @SerializedName("GroupNumber")
    @Expose
    private Object groupNumber;
    @SerializedName("GroupHandWritten")
    @Expose
    private String groupHandWritten;
    @SerializedName("ReopenOriginalDocument")
    @Expose
    private Object reopenOriginalDocument;
    @SerializedName("ReopenManuallyClosedOrCanceledDocument")
    @Expose
    private Object reopenManuallyClosedOrCanceledDocument;
    @SerializedName("CreateOnlineQuotation")
    @Expose
    private String createOnlineQuotation;
    @SerializedName("POSEquipmentNumber")
    @Expose
    private Object pOSEquipmentNumber;
    @SerializedName("POSManufacturerSerialNumber")
    @Expose
    private Object pOSManufacturerSerialNumber;
    @SerializedName("POSCashierNumber")
    @Expose
    private Object pOSCashierNumber;
    @SerializedName("ApplyCurrentVATRatesForDownPaymentsToDraw")
    @Expose
    private String applyCurrentVATRatesForDownPaymentsToDraw;
    @SerializedName("ClosingOption")
    @Expose
    private String closingOption;
    @SerializedName("SpecifiedClosingDate")
    @Expose
    private Object specifiedClosingDate;
    @SerializedName("OpenForLandedCosts")
    @Expose
    private String openForLandedCosts;
    @SerializedName("AuthorizationStatus")
    @Expose
    private String authorizationStatus;
    @SerializedName("TotalDiscountFC")
    @Expose
    private Double totalDiscountFC;
    @SerializedName("TotalDiscountSC")
    @Expose
    private Double totalDiscountSC;
    @SerializedName("RelevantToGTS")
    @Expose
    private String relevantToGTS;
    @SerializedName("BPLName")
    @Expose
    private String bPLName;
    @SerializedName("VATRegNum")
    @Expose
    private String vATRegNum;
    @SerializedName("AnnualInvoiceDeclarationReference")
    @Expose
    private Object annualInvoiceDeclarationReference;
    @SerializedName("Supplier")
    @Expose
    private Object supplier;
    @SerializedName("Releaser")
    @Expose
    private Object releaser;
    @SerializedName("Receiver")
    @Expose
    private Object receiver;
    @SerializedName("BlanketAgreementNumber")
    @Expose
    private Object blanketAgreementNumber;
    @SerializedName("IsAlteration")
    @Expose
    private String isAlteration;
    @SerializedName("CancelStatus")
    @Expose
    private String cancelStatus;
    @SerializedName("AssetValueDate")
    @Expose
    private Object assetValueDate;
    @SerializedName("DocumentDelivery")
    @Expose
    private String documentDelivery;
    @SerializedName("AuthorizationCode")
    @Expose
    private Object authorizationCode;
    @SerializedName("StartDeliveryDate")
    @Expose
    private Object startDeliveryDate;
    @SerializedName("StartDeliveryTime")
    @Expose
    private Object startDeliveryTime;
    @SerializedName("EndDeliveryDate")
    @Expose
    private Object endDeliveryDate;
    @SerializedName("EndDeliveryTime")
    @Expose
    private Object endDeliveryTime;
    @SerializedName("VehiclePlate")
    @Expose
    private Object vehiclePlate;
    @SerializedName("ATDocumentType")
    @Expose
    private Object aTDocumentType;
    @SerializedName("ElecCommStatus")
    @Expose
    private Object elecCommStatus;
    @SerializedName("ElecCommMessage")
    @Expose
    private Object elecCommMessage;
    @SerializedName("ReuseDocumentNum")
    @Expose
    private String reuseDocumentNum;
    @SerializedName("ReuseNotaFiscalNum")
    @Expose
    private String reuseNotaFiscalNum;
    @SerializedName("PrintSEPADirect")
    @Expose
    private String printSEPADirect;
    @SerializedName("FiscalDocNum")
    @Expose
    private Object fiscalDocNum;
    @SerializedName("POSDailySummaryNo")
    @Expose
    private Object pOSDailySummaryNo;
    @SerializedName("POSReceiptNo")
    @Expose
    private Object pOSReceiptNo;
    @SerializedName("PointOfIssueCode")
    @Expose
    private Object pointOfIssueCode;
    @SerializedName("Letter")
    @Expose
    private Object letter;
    @SerializedName("FolioNumberFrom")
    @Expose
    private Object folioNumberFrom;
    @SerializedName("FolioNumberTo")
    @Expose
    private Object folioNumberTo;
    @SerializedName("InterimType")
    @Expose
    private String interimType;
    @SerializedName("RelatedType")
    @Expose
    private Integer relatedType;
    @SerializedName("RelatedEntry")
    @Expose
    private Object relatedEntry;
    @SerializedName("SAPPassport")
    @Expose
    private Object sAPPassport;
    @SerializedName("DocumentTaxID")
    @Expose
    private Object documentTaxID;
    @SerializedName("DateOfReportingControlStatementVAT")
    @Expose
    private Object dateOfReportingControlStatementVAT;
    @SerializedName("ReportingSectionControlStatementVAT")
    @Expose
    private Object reportingSectionControlStatementVAT;
    @SerializedName("ExcludeFromTaxReportControlStatementVAT")
    @Expose
    private String excludeFromTaxReportControlStatementVAT;
    @SerializedName("POS_CashRegister")
    @Expose
    private Object pOSCashRegister;
    @SerializedName("UpdateTime")
    @Expose
    private String updateTime;
    @SerializedName("PriceMode")
    @Expose
    private Object priceMode;
    @SerializedName("ShipFrom")
    @Expose
    private String shipFrom;
    @SerializedName("CommissionTrade")
    @Expose
    private String commissionTrade;
    @SerializedName("CommissionTradeReturn")
    @Expose
    private String commissionTradeReturn;
    @SerializedName("UseBillToAddrToDetermineTax")
    @Expose
    private Object useBillToAddrToDetermineTax;
    @SerializedName("Cig")
    @Expose
    private Object cig;
    @SerializedName("Cup")
    @Expose
    private Object cup;
    @SerializedName("Document_ApprovalRequests")
    @Expose
    private List<Object> documentApprovalRequests = null;
    @SerializedName("DocumentLines")
    @Expose
    private List<DocumentLine> documentLines = null;
    @SerializedName("ElectronicProtocols")
    @Expose
    private List<Object> electronicProtocols = null;
    @SerializedName("DocumentAdditionalExpenses")
    @Expose
    private List<Object> documentAdditionalExpenses = null;
    @SerializedName("WithholdingTaxDataWTXCollection")
    @Expose
    private List<Object> withholdingTaxDataWTXCollection = null;
    @SerializedName("WithholdingTaxDataCollection")
    @Expose
    private List<Object> withholdingTaxDataCollection = null;
    @SerializedName("DocumentSpecialLines")
    @Expose
    private List<Object> documentSpecialLines = null;
    @SerializedName("TaxExtension")
    @Expose
    private TaxExtension taxExtension;
    @SerializedName("AddressExtension")
    @Expose
    private AddressExtension addressExtension;
    private final static long serialVersionUID = -1395321067058236183L;

    public Integer getDocEntry() {
        return docEntry;
    }

    public void setDocEntry(Integer docEntry) {
        this.docEntry = docEntry;
    }

    public Integer getDocNum() {
        return docNum;
    }

    public void setDocNum(Integer docNum) {
        this.docNum = docNum;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getHandWritten() {
        return handWritten;
    }

    public void setHandWritten(String handWritten) {
        this.handWritten = handWritten;
    }

    public String getPrinted() {
        return printed;
    }

    public void setPrinted(String printed) {
        this.printed = printed;
    }

    public String getDocDate() {
        return docDate;
    }

    public void setDocDate(String docDate) {
        this.docDate = docDate;
    }

    public String getDocDueDate() {
        return docDueDate;
    }

    public void setDocDueDate(String docDueDate) {
        this.docDueDate = docDueDate;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Object getNumAtCard() {
        return numAtCard;
    }

    public void setNumAtCard(Object numAtCard) {
        this.numAtCard = numAtCard;
    }

    public Double getDocTotal() {
        return docTotal;
    }

    public void setDocTotal(Double docTotal) {
        this.docTotal = docTotal;
    }

    public Object getAttachmentEntry() {
        return attachmentEntry;
    }

    public void setAttachmentEntry(Object attachmentEntry) {
        this.attachmentEntry = attachmentEntry;
    }

    public String getDocCurrency() {
        return docCurrency;
    }

    public void setDocCurrency(String docCurrency) {
        this.docCurrency = docCurrency;
    }

    public Double getDocRate() {
        return docRate;
    }

    public void setDocRate(Double docRate) {
        this.docRate = docRate;
    }

    public String getReference1() {
        return reference1;
    }

    public void setReference1(String reference1) {
        this.reference1 = reference1;
    }

    public Object getReference2() {
        return reference2;
    }

    public void setReference2(Object reference2) {
        this.reference2 = reference2;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getJournalMemo() {
        return journalMemo;
    }

    public void setJournalMemo(String journalMemo) {
        this.journalMemo = journalMemo;
    }

    public Integer getPaymentGroupCode() {
        return paymentGroupCode;
    }

    public void setPaymentGroupCode(Integer paymentGroupCode) {
        this.paymentGroupCode = paymentGroupCode;
    }

    public String getDocTime() {
        return docTime;
    }

    public void setDocTime(String docTime) {
        this.docTime = docTime;
    }

    public Integer getSalesPersonCode() {
        return salesPersonCode;
    }

    public void setSalesPersonCode(Integer salesPersonCode) {
        this.salesPersonCode = salesPersonCode;
    }

    public Integer getTransportationCode() {
        return transportationCode;
    }

    public void setTransportationCode(Integer transportationCode) {
        this.transportationCode = transportationCode;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public Object getImportFileNum() {
        return importFileNum;
    }

    public void setImportFileNum(Object importFileNum) {
        this.importFileNum = importFileNum;
    }

    public String getSummeryType() {
        return summeryType;
    }

    public void setSummeryType(String summeryType) {
        this.summeryType = summeryType;
    }

    public Integer getContactPersonCode() {
        return contactPersonCode;
    }

    public void setContactPersonCode(Integer contactPersonCode) {
        this.contactPersonCode = contactPersonCode;
    }

    public String getShowSCN() {
        return showSCN;
    }

    public void setShowSCN(String showSCN) {
        this.showSCN = showSCN;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public String getTaxDate() {
        return taxDate;
    }

    public void setTaxDate(String taxDate) {
        this.taxDate = taxDate;
    }

    public String getPartialSupply() {
        return partialSupply;
    }

    public void setPartialSupply(String partialSupply) {
        this.partialSupply = partialSupply;
    }

    public String getDocObjectCode() {
        return docObjectCode;
    }

    public void setDocObjectCode(String docObjectCode) {
        this.docObjectCode = docObjectCode;
    }

    public String getShipToCode() {
        return shipToCode;
    }

    public void setShipToCode(String shipToCode) {
        this.shipToCode = shipToCode;
    }

    public Object getIndicator() {
        return indicator;
    }

    public void setIndicator(Object indicator) {
        this.indicator = indicator;
    }

    public Object getFederalTaxID() {
        return federalTaxID;
    }

    public void setFederalTaxID(Object federalTaxID) {
        this.federalTaxID = federalTaxID;
    }

    public Double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Object getPaymentReference() {
        return paymentReference;
    }

    public void setPaymentReference(Object paymentReference) {
        this.paymentReference = paymentReference;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getFinancialPeriod() {
        return financialPeriod;
    }

    public void setFinancialPeriod(Integer financialPeriod) {
        this.financialPeriod = financialPeriod;
    }

    public Object getTransNum() {
        return transNum;
    }

    public void setTransNum(Object transNum) {
        this.transNum = transNum;
    }

    public Double getVatSum() {
        return vatSum;
    }

    public void setVatSum(Double vatSum) {
        this.vatSum = vatSum;
    }

    public Double getVatSumSys() {
        return vatSumSys;
    }

    public void setVatSumSys(Double vatSumSys) {
        this.vatSumSys = vatSumSys;
    }

    public Double getVatSumFc() {
        return vatSumFc;
    }

    public void setVatSumFc(Double vatSumFc) {
        this.vatSumFc = vatSumFc;
    }

    public String getNetProcedure() {
        return netProcedure;
    }

    public void setNetProcedure(String netProcedure) {
        this.netProcedure = netProcedure;
    }

    public Double getDocTotalFc() {
        return docTotalFc;
    }

    public void setDocTotalFc(Double docTotalFc) {
        this.docTotalFc = docTotalFc;
    }

    public Double getDocTotalSys() {
        return docTotalSys;
    }

    public void setDocTotalSys(Double docTotalSys) {
        this.docTotalSys = docTotalSys;
    }

    public Object getForm1099() {
        return form1099;
    }

    public void setForm1099(Object form1099) {
        this.form1099 = form1099;
    }

    public Object getBox1099() {
        return box1099;
    }

    public void setBox1099(Object box1099) {
        this.box1099 = box1099;
    }

    public String getRevisionPo() {
        return revisionPo;
    }

    public void setRevisionPo(String revisionPo) {
        this.revisionPo = revisionPo;
    }

    public Object getRequriedDate() {
        return requriedDate;
    }

    public void setRequriedDate(Object requriedDate) {
        this.requriedDate = requriedDate;
    }

    public Object getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Object cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getBlockDunning() {
        return blockDunning;
    }

    public void setBlockDunning(String blockDunning) {
        this.blockDunning = blockDunning;
    }

    public String getSubmitted() {
        return submitted;
    }

    public void setSubmitted(String submitted) {
        this.submitted = submitted;
    }

    public Integer getSegment() {
        return segment;
    }

    public void setSegment(Integer segment) {
        this.segment = segment;
    }

    public String getPickStatus() {
        return pickStatus;
    }

    public void setPickStatus(String pickStatus) {
        this.pickStatus = pickStatus;
    }

    public String getPick() {
        return pick;
    }

    public void setPick(String pick) {
        this.pick = pick;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentBlock() {
        return paymentBlock;
    }

    public void setPaymentBlock(String paymentBlock) {
        this.paymentBlock = paymentBlock;
    }

    public Object getPaymentBlockEntry() {
        return paymentBlockEntry;
    }

    public void setPaymentBlockEntry(Object paymentBlockEntry) {
        this.paymentBlockEntry = paymentBlockEntry;
    }

    public Object getCentralBankIndicator() {
        return centralBankIndicator;
    }

    public void setCentralBankIndicator(Object centralBankIndicator) {
        this.centralBankIndicator = centralBankIndicator;
    }

    public String getMaximumCashDiscount() {
        return maximumCashDiscount;
    }

    public void setMaximumCashDiscount(String maximumCashDiscount) {
        this.maximumCashDiscount = maximumCashDiscount;
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    public Object getProject() {
        return project;
    }

    public void setProject(Object project) {
        this.project = project;
    }

    public Object getExemptionValidityDateFrom() {
        return exemptionValidityDateFrom;
    }

    public void setExemptionValidityDateFrom(Object exemptionValidityDateFrom) {
        this.exemptionValidityDateFrom = exemptionValidityDateFrom;
    }

    public Object getExemptionValidityDateTo() {
        return exemptionValidityDateTo;
    }

    public void setExemptionValidityDateTo(Object exemptionValidityDateTo) {
        this.exemptionValidityDateTo = exemptionValidityDateTo;
    }

    public String getWareHouseUpdateType() {
        return wareHouseUpdateType;
    }

    public void setWareHouseUpdateType(String wareHouseUpdateType) {
        this.wareHouseUpdateType = wareHouseUpdateType;
    }

    public String getRounding() {
        return rounding;
    }

    public void setRounding(String rounding) {
        this.rounding = rounding;
    }

    public Object getExternalCorrectedDocNum() {
        return externalCorrectedDocNum;
    }

    public void setExternalCorrectedDocNum(Object externalCorrectedDocNum) {
        this.externalCorrectedDocNum = externalCorrectedDocNum;
    }

    public Object getInternalCorrectedDocNum() {
        return internalCorrectedDocNum;
    }

    public void setInternalCorrectedDocNum(Object internalCorrectedDocNum) {
        this.internalCorrectedDocNum = internalCorrectedDocNum;
    }

    public Object getNextCorrectingDocument() {
        return nextCorrectingDocument;
    }

    public void setNextCorrectingDocument(Object nextCorrectingDocument) {
        this.nextCorrectingDocument = nextCorrectingDocument;
    }

    public String getDeferredTax() {
        return deferredTax;
    }

    public void setDeferredTax(String deferredTax) {
        this.deferredTax = deferredTax;
    }

    public Object getTaxExemptionLetterNum() {
        return taxExemptionLetterNum;
    }

    public void setTaxExemptionLetterNum(Object taxExemptionLetterNum) {
        this.taxExemptionLetterNum = taxExemptionLetterNum;
    }

    public Double getWTApplied() {
        return wTApplied;
    }

    public void setWTApplied(Double wTApplied) {
        this.wTApplied = wTApplied;
    }

    public Double getWTAppliedFC() {
        return wTAppliedFC;
    }

    public void setWTAppliedFC(Double wTAppliedFC) {
        this.wTAppliedFC = wTAppliedFC;
    }

    public String getBillOfExchangeReserved() {
        return billOfExchangeReserved;
    }

    public void setBillOfExchangeReserved(String billOfExchangeReserved) {
        this.billOfExchangeReserved = billOfExchangeReserved;
    }

    public Object getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(Object agentCode) {
        this.agentCode = agentCode;
    }

    public Double getWTAppliedSC() {
        return wTAppliedSC;
    }

    public void setWTAppliedSC(Double wTAppliedSC) {
        this.wTAppliedSC = wTAppliedSC;
    }

    public Double getTotalEqualizationTax() {
        return totalEqualizationTax;
    }

    public void setTotalEqualizationTax(Double totalEqualizationTax) {
        this.totalEqualizationTax = totalEqualizationTax;
    }

    public Double getTotalEqualizationTaxFC() {
        return totalEqualizationTaxFC;
    }

    public void setTotalEqualizationTaxFC(Double totalEqualizationTaxFC) {
        this.totalEqualizationTaxFC = totalEqualizationTaxFC;
    }

    public Double getTotalEqualizationTaxSC() {
        return totalEqualizationTaxSC;
    }

    public void setTotalEqualizationTaxSC(Double totalEqualizationTaxSC) {
        this.totalEqualizationTaxSC = totalEqualizationTaxSC;
    }

    public Integer getNumberOfInstallments() {
        return numberOfInstallments;
    }

    public void setNumberOfInstallments(Integer numberOfInstallments) {
        this.numberOfInstallments = numberOfInstallments;
    }

    public String getApplyTaxOnFirstInstallment() {
        return applyTaxOnFirstInstallment;
    }

    public void setApplyTaxOnFirstInstallment(String applyTaxOnFirstInstallment) {
        this.applyTaxOnFirstInstallment = applyTaxOnFirstInstallment;
    }

    public Double getWTNonSubjectAmount() {
        return wTNonSubjectAmount;
    }

    public void setWTNonSubjectAmount(Double wTNonSubjectAmount) {
        this.wTNonSubjectAmount = wTNonSubjectAmount;
    }

    public Double getWTNonSubjectAmountSC() {
        return wTNonSubjectAmountSC;
    }

    public void setWTNonSubjectAmountSC(Double wTNonSubjectAmountSC) {
        this.wTNonSubjectAmountSC = wTNonSubjectAmountSC;
    }

    public Double getWTNonSubjectAmountFC() {
        return wTNonSubjectAmountFC;
    }

    public void setWTNonSubjectAmountFC(Double wTNonSubjectAmountFC) {
        this.wTNonSubjectAmountFC = wTNonSubjectAmountFC;
    }

    public Double getWTExemptedAmount() {
        return wTExemptedAmount;
    }

    public void setWTExemptedAmount(Double wTExemptedAmount) {
        this.wTExemptedAmount = wTExemptedAmount;
    }

    public Double getWTExemptedAmountSC() {
        return wTExemptedAmountSC;
    }

    public void setWTExemptedAmountSC(Double wTExemptedAmountSC) {
        this.wTExemptedAmountSC = wTExemptedAmountSC;
    }

    public Double getWTExemptedAmountFC() {
        return wTExemptedAmountFC;
    }

    public void setWTExemptedAmountFC(Double wTExemptedAmountFC) {
        this.wTExemptedAmountFC = wTExemptedAmountFC;
    }

    public Double getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(Double baseAmount) {
        this.baseAmount = baseAmount;
    }

    public Double getBaseAmountSC() {
        return baseAmountSC;
    }

    public void setBaseAmountSC(Double baseAmountSC) {
        this.baseAmountSC = baseAmountSC;
    }

    public Double getBaseAmountFC() {
        return baseAmountFC;
    }

    public void setBaseAmountFC(Double baseAmountFC) {
        this.baseAmountFC = baseAmountFC;
    }

    public Double getWTAmount() {
        return wTAmount;
    }

    public void setWTAmount(Double wTAmount) {
        this.wTAmount = wTAmount;
    }

    public Double getWTAmountSC() {
        return wTAmountSC;
    }

    public void setWTAmountSC(Double wTAmountSC) {
        this.wTAmountSC = wTAmountSC;
    }

    public Double getWTAmountFC() {
        return wTAmountFC;
    }

    public void setWTAmountFC(Double wTAmountFC) {
        this.wTAmountFC = wTAmountFC;
    }

    public Object getVatDate() {
        return vatDate;
    }

    public void setVatDate(Object vatDate) {
        this.vatDate = vatDate;
    }

    public Object getDocumentsOwner() {
        return documentsOwner;
    }

    public void setDocumentsOwner(Object documentsOwner) {
        this.documentsOwner = documentsOwner;
    }

    public Object getFolioPrefixString() {
        return folioPrefixString;
    }

    public void setFolioPrefixString(Object folioPrefixString) {
        this.folioPrefixString = folioPrefixString;
    }

    public Object getFolioNumber() {
        return folioNumber;
    }

    public void setFolioNumber(Object folioNumber) {
        this.folioNumber = folioNumber;
    }

    public String getDocumentSubType() {
        return documentSubType;
    }

    public void setDocumentSubType(String documentSubType) {
        this.documentSubType = documentSubType;
    }

    public Object getBPChannelCode() {
        return bPChannelCode;
    }

    public void setBPChannelCode(Object bPChannelCode) {
        this.bPChannelCode = bPChannelCode;
    }

    public Object getBPChannelContact() {
        return bPChannelContact;
    }

    public void setBPChannelContact(Object bPChannelContact) {
        this.bPChannelContact = bPChannelContact;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentStatus(String documentStatus) {
        this.documentStatus = documentStatus;
    }

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setPeriodIndicator(String periodIndicator) {
        this.periodIndicator = periodIndicator;
    }

    public String getPayToCode() {
        return payToCode;
    }

    public void setPayToCode(String payToCode) {
        this.payToCode = payToCode;
    }

    public Object getManualNumber() {
        return manualNumber;
    }

    public void setManualNumber(Object manualNumber) {
        this.manualNumber = manualNumber;
    }

    public String getUseShpdGoodsAct() {
        return useShpdGoodsAct;
    }

    public void setUseShpdGoodsAct(String useShpdGoodsAct) {
        this.useShpdGoodsAct = useShpdGoodsAct;
    }

    public String getIsPayToBank() {
        return isPayToBank;
    }

    public void setIsPayToBank(String isPayToBank) {
        this.isPayToBank = isPayToBank;
    }

    public Object getPayToBankCountry() {
        return payToBankCountry;
    }

    public void setPayToBankCountry(Object payToBankCountry) {
        this.payToBankCountry = payToBankCountry;
    }

    public Object getPayToBankCode() {
        return payToBankCode;
    }

    public void setPayToBankCode(Object payToBankCode) {
        this.payToBankCode = payToBankCode;
    }

    public Object getPayToBankAccountNo() {
        return payToBankAccountNo;
    }

    public void setPayToBankAccountNo(Object payToBankAccountNo) {
        this.payToBankAccountNo = payToBankAccountNo;
    }

    public Object getPayToBankBranch() {
        return payToBankBranch;
    }

    public void setPayToBankBranch(Object payToBankBranch) {
        this.payToBankBranch = payToBankBranch;
    }

    public Integer getBPLIDAssignedToInvoice() {
        return bPLIDAssignedToInvoice;
    }

    public void setBPLIDAssignedToInvoice(Integer bPLIDAssignedToInvoice) {
        this.bPLIDAssignedToInvoice = bPLIDAssignedToInvoice;
    }

    public Double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(Double downPayment) {
        this.downPayment = downPayment;
    }

    public String getReserveInvoice() {
        return reserveInvoice;
    }

    public void setReserveInvoice(String reserveInvoice) {
        this.reserveInvoice = reserveInvoice;
    }

    public Integer getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(Integer languageCode) {
        this.languageCode = languageCode;
    }

    public Object getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(Object trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Object getPickRemark() {
        return pickRemark;
    }

    public void setPickRemark(Object pickRemark) {
        this.pickRemark = pickRemark;
    }

    public Object getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Object closingDate) {
        this.closingDate = closingDate;
    }

    public Object getSequenceCode() {
        return sequenceCode;
    }

    public void setSequenceCode(Object sequenceCode) {
        this.sequenceCode = sequenceCode;
    }

    public Object getSequenceSerial() {
        return sequenceSerial;
    }

    public void setSequenceSerial(Object sequenceSerial) {
        this.sequenceSerial = sequenceSerial;
    }

    public Object getSeriesString() {
        return seriesString;
    }

    public void setSeriesString(Object seriesString) {
        this.seriesString = seriesString;
    }

    public Object getSubSeriesString() {
        return subSeriesString;
    }

    public void setSubSeriesString(Object subSeriesString) {
        this.subSeriesString = subSeriesString;
    }

    public String getSequenceModel() {
        return sequenceModel;
    }

    public void setSequenceModel(String sequenceModel) {
        this.sequenceModel = sequenceModel;
    }

    public String getUseCorrectionVATGroup() {
        return useCorrectionVATGroup;
    }

    public void setUseCorrectionVATGroup(String useCorrectionVATGroup) {
        this.useCorrectionVATGroup = useCorrectionVATGroup;
    }

    public Double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(Double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public Double getDownPaymentAmount() {
        return downPaymentAmount;
    }

    public void setDownPaymentAmount(Double downPaymentAmount) {
        this.downPaymentAmount = downPaymentAmount;
    }

    public Double getDownPaymentPercentage() {
        return downPaymentPercentage;
    }

    public void setDownPaymentPercentage(Double downPaymentPercentage) {
        this.downPaymentPercentage = downPaymentPercentage;
    }

    public String getDownPaymentType() {
        return downPaymentType;
    }

    public void setDownPaymentType(String downPaymentType) {
        this.downPaymentType = downPaymentType;
    }

    public Double getDownPaymentAmountSC() {
        return downPaymentAmountSC;
    }

    public void setDownPaymentAmountSC(Double downPaymentAmountSC) {
        this.downPaymentAmountSC = downPaymentAmountSC;
    }

    public Double getDownPaymentAmountFC() {
        return downPaymentAmountFC;
    }

    public void setDownPaymentAmountFC(Double downPaymentAmountFC) {
        this.downPaymentAmountFC = downPaymentAmountFC;
    }

    public Double getVatPercent() {
        return vatPercent;
    }

    public void setVatPercent(Double vatPercent) {
        this.vatPercent = vatPercent;
    }

    public Object getServiceGrossProfitPercent() {
        return serviceGrossProfitPercent;
    }

    public void setServiceGrossProfitPercent(Object serviceGrossProfitPercent) {
        this.serviceGrossProfitPercent = serviceGrossProfitPercent;
    }

    public String getOpeningRemarks() {
        return openingRemarks;
    }

    public void setOpeningRemarks(String openingRemarks) {
        this.openingRemarks = openingRemarks;
    }

    public String getClosingRemarks() {
        return closingRemarks;
    }

    public void setClosingRemarks(String closingRemarks) {
        this.closingRemarks = closingRemarks;
    }

    public Double getRoundingDiffAmount() {
        return roundingDiffAmount;
    }

    public void setRoundingDiffAmount(Double roundingDiffAmount) {
        this.roundingDiffAmount = roundingDiffAmount;
    }

    public Double getRoundingDiffAmountFC() {
        return roundingDiffAmountFC;
    }

    public void setRoundingDiffAmountFC(Double roundingDiffAmountFC) {
        this.roundingDiffAmountFC = roundingDiffAmountFC;
    }

    public Double getRoundingDiffAmountSC() {
        return roundingDiffAmountSC;
    }

    public void setRoundingDiffAmountSC(Double roundingDiffAmountSC) {
        this.roundingDiffAmountSC = roundingDiffAmountSC;
    }

    public String getCancelled() {
        return cancelled;
    }

    public void setCancelled(String cancelled) {
        this.cancelled = cancelled;
    }

    public String getSignatureInputMessage() {
        return signatureInputMessage;
    }

    public void setSignatureInputMessage(String signatureInputMessage) {
        this.signatureInputMessage = signatureInputMessage;
    }

    public String getSignatureDigest() {
        return signatureDigest;
    }

    public void setSignatureDigest(String signatureDigest) {
        this.signatureDigest = signatureDigest;
    }

    public Object getCertificationNumber() {
        return certificationNumber;
    }

    public void setCertificationNumber(Object certificationNumber) {
        this.certificationNumber = certificationNumber;
    }

    public Object getPrivateKeyVersion() {
        return privateKeyVersion;
    }

    public void setPrivateKeyVersion(Object privateKeyVersion) {
        this.privateKeyVersion = privateKeyVersion;
    }

    public String getControlAccount() {
        return controlAccount;
    }

    public void setControlAccount(String controlAccount) {
        this.controlAccount = controlAccount;
    }

    public String getInsuranceOperation347() {
        return insuranceOperation347;
    }

    public void setInsuranceOperation347(String insuranceOperation347) {
        this.insuranceOperation347 = insuranceOperation347;
    }

    public String getArchiveNonremovableSalesQuotation() {
        return archiveNonremovableSalesQuotation;
    }

    public void setArchiveNonremovableSalesQuotation(String archiveNonremovableSalesQuotation) {
        this.archiveNonremovableSalesQuotation = archiveNonremovableSalesQuotation;
    }

    public Object getGTSChecker() {
        return gTSChecker;
    }

    public void setGTSChecker(Object gTSChecker) {
        this.gTSChecker = gTSChecker;
    }

    public Object getGTSPayee() {
        return gTSPayee;
    }

    public void setGTSPayee(Object gTSPayee) {
        this.gTSPayee = gTSPayee;
    }

    public Integer getExtraMonth() {
        return extraMonth;
    }

    public void setExtraMonth(Integer extraMonth) {
        this.extraMonth = extraMonth;
    }

    public Integer getExtraDays() {
        return extraDays;
    }

    public void setExtraDays(Integer extraDays) {
        this.extraDays = extraDays;
    }

    public Integer getCashDiscountDateOffset() {
        return cashDiscountDateOffset;
    }

    public void setCashDiscountDateOffset(Integer cashDiscountDateOffset) {
        this.cashDiscountDateOffset = cashDiscountDateOffset;
    }

    public String getStartFrom() {
        return startFrom;
    }

    public void setStartFrom(String startFrom) {
        this.startFrom = startFrom;
    }

    public String getNTSApproved() {
        return nTSApproved;
    }

    public void setNTSApproved(String nTSApproved) {
        this.nTSApproved = nTSApproved;
    }

    public Object getETaxWebSite() {
        return eTaxWebSite;
    }

    public void setETaxWebSite(Object eTaxWebSite) {
        this.eTaxWebSite = eTaxWebSite;
    }

    public Object getETaxNumber() {
        return eTaxNumber;
    }

    public void setETaxNumber(Object eTaxNumber) {
        this.eTaxNumber = eTaxNumber;
    }

    public Object getNTSApprovedNumber() {
        return nTSApprovedNumber;
    }

    public void setNTSApprovedNumber(Object nTSApprovedNumber) {
        this.nTSApprovedNumber = nTSApprovedNumber;
    }

    public String getEDocGenerationType() {
        return eDocGenerationType;
    }

    public void setEDocGenerationType(String eDocGenerationType) {
        this.eDocGenerationType = eDocGenerationType;
    }

    public Object getEDocSeries() {
        return eDocSeries;
    }

    public void setEDocSeries(Object eDocSeries) {
        this.eDocSeries = eDocSeries;
    }

    public Object getEDocNum() {
        return eDocNum;
    }

    public void setEDocNum(Object eDocNum) {
        this.eDocNum = eDocNum;
    }

    public Object getEDocExportFormat() {
        return eDocExportFormat;
    }

    public void setEDocExportFormat(Object eDocExportFormat) {
        this.eDocExportFormat = eDocExportFormat;
    }

    public String getEDocStatus() {
        return eDocStatus;
    }

    public void setEDocStatus(String eDocStatus) {
        this.eDocStatus = eDocStatus;
    }

    public Object getEDocErrorCode() {
        return eDocErrorCode;
    }

    public void setEDocErrorCode(Object eDocErrorCode) {
        this.eDocErrorCode = eDocErrorCode;
    }

    public String getEDocErrorMessage() {
        return eDocErrorMessage;
    }

    public void setEDocErrorMessage(String eDocErrorMessage) {
        this.eDocErrorMessage = eDocErrorMessage;
    }

    public String getDownPaymentStatus() {
        return downPaymentStatus;
    }

    public void setDownPaymentStatus(String downPaymentStatus) {
        this.downPaymentStatus = downPaymentStatus;
    }

    public Object getGroupSeries() {
        return groupSeries;
    }

    public void setGroupSeries(Object groupSeries) {
        this.groupSeries = groupSeries;
    }

    public Object getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(Object groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getGroupHandWritten() {
        return groupHandWritten;
    }

    public void setGroupHandWritten(String groupHandWritten) {
        this.groupHandWritten = groupHandWritten;
    }

    public Object getReopenOriginalDocument() {
        return reopenOriginalDocument;
    }

    public void setReopenOriginalDocument(Object reopenOriginalDocument) {
        this.reopenOriginalDocument = reopenOriginalDocument;
    }

    public Object getReopenManuallyClosedOrCanceledDocument() {
        return reopenManuallyClosedOrCanceledDocument;
    }

    public void setReopenManuallyClosedOrCanceledDocument(Object reopenManuallyClosedOrCanceledDocument) {
        this.reopenManuallyClosedOrCanceledDocument = reopenManuallyClosedOrCanceledDocument;
    }

    public String getCreateOnlineQuotation() {
        return createOnlineQuotation;
    }

    public void setCreateOnlineQuotation(String createOnlineQuotation) {
        this.createOnlineQuotation = createOnlineQuotation;
    }

    public Object getPOSEquipmentNumber() {
        return pOSEquipmentNumber;
    }

    public void setPOSEquipmentNumber(Object pOSEquipmentNumber) {
        this.pOSEquipmentNumber = pOSEquipmentNumber;
    }

    public Object getPOSManufacturerSerialNumber() {
        return pOSManufacturerSerialNumber;
    }

    public void setPOSManufacturerSerialNumber(Object pOSManufacturerSerialNumber) {
        this.pOSManufacturerSerialNumber = pOSManufacturerSerialNumber;
    }

    public Object getPOSCashierNumber() {
        return pOSCashierNumber;
    }

    public void setPOSCashierNumber(Object pOSCashierNumber) {
        this.pOSCashierNumber = pOSCashierNumber;
    }

    public String getApplyCurrentVATRatesForDownPaymentsToDraw() {
        return applyCurrentVATRatesForDownPaymentsToDraw;
    }

    public void setApplyCurrentVATRatesForDownPaymentsToDraw(String applyCurrentVATRatesForDownPaymentsToDraw) {
        this.applyCurrentVATRatesForDownPaymentsToDraw = applyCurrentVATRatesForDownPaymentsToDraw;
    }

    public String getClosingOption() {
        return closingOption;
    }

    public void setClosingOption(String closingOption) {
        this.closingOption = closingOption;
    }

    public Object getSpecifiedClosingDate() {
        return specifiedClosingDate;
    }

    public void setSpecifiedClosingDate(Object specifiedClosingDate) {
        this.specifiedClosingDate = specifiedClosingDate;
    }

    public String getOpenForLandedCosts() {
        return openForLandedCosts;
    }

    public void setOpenForLandedCosts(String openForLandedCosts) {
        this.openForLandedCosts = openForLandedCosts;
    }

    public String getAuthorizationStatus() {
        return authorizationStatus;
    }

    public void setAuthorizationStatus(String authorizationStatus) {
        this.authorizationStatus = authorizationStatus;
    }

    public Double getTotalDiscountFC() {
        return totalDiscountFC;
    }

    public void setTotalDiscountFC(Double totalDiscountFC) {
        this.totalDiscountFC = totalDiscountFC;
    }

    public Double getTotalDiscountSC() {
        return totalDiscountSC;
    }

    public void setTotalDiscountSC(Double totalDiscountSC) {
        this.totalDiscountSC = totalDiscountSC;
    }

    public String getRelevantToGTS() {
        return relevantToGTS;
    }

    public void setRelevantToGTS(String relevantToGTS) {
        this.relevantToGTS = relevantToGTS;
    }

    public String getBPLName() {
        return bPLName;
    }

    public void setBPLName(String bPLName) {
        this.bPLName = bPLName;
    }

    public String getVATRegNum() {
        return vATRegNum;
    }

    public void setVATRegNum(String vATRegNum) {
        this.vATRegNum = vATRegNum;
    }

    public Object getAnnualInvoiceDeclarationReference() {
        return annualInvoiceDeclarationReference;
    }

    public void setAnnualInvoiceDeclarationReference(Object annualInvoiceDeclarationReference) {
        this.annualInvoiceDeclarationReference = annualInvoiceDeclarationReference;
    }

    public Object getSupplier() {
        return supplier;
    }

    public void setSupplier(Object supplier) {
        this.supplier = supplier;
    }

    public Object getReleaser() {
        return releaser;
    }

    public void setReleaser(Object releaser) {
        this.releaser = releaser;
    }

    public Object getReceiver() {
        return receiver;
    }

    public void setReceiver(Object receiver) {
        this.receiver = receiver;
    }

    public Object getBlanketAgreementNumber() {
        return blanketAgreementNumber;
    }

    public void setBlanketAgreementNumber(Object blanketAgreementNumber) {
        this.blanketAgreementNumber = blanketAgreementNumber;
    }

    public String getIsAlteration() {
        return isAlteration;
    }

    public void setIsAlteration(String isAlteration) {
        this.isAlteration = isAlteration;
    }

    public String getCancelStatus() {
        return cancelStatus;
    }

    public void setCancelStatus(String cancelStatus) {
        this.cancelStatus = cancelStatus;
    }

    public Object getAssetValueDate() {
        return assetValueDate;
    }

    public void setAssetValueDate(Object assetValueDate) {
        this.assetValueDate = assetValueDate;
    }

    public String getDocumentDelivery() {
        return documentDelivery;
    }

    public void setDocumentDelivery(String documentDelivery) {
        this.documentDelivery = documentDelivery;
    }

    public Object getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(Object authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    public Object getStartDeliveryDate() {
        return startDeliveryDate;
    }

    public void setStartDeliveryDate(Object startDeliveryDate) {
        this.startDeliveryDate = startDeliveryDate;
    }

    public Object getStartDeliveryTime() {
        return startDeliveryTime;
    }

    public void setStartDeliveryTime(Object startDeliveryTime) {
        this.startDeliveryTime = startDeliveryTime;
    }

    public Object getEndDeliveryDate() {
        return endDeliveryDate;
    }

    public void setEndDeliveryDate(Object endDeliveryDate) {
        this.endDeliveryDate = endDeliveryDate;
    }

    public Object getEndDeliveryTime() {
        return endDeliveryTime;
    }

    public void setEndDeliveryTime(Object endDeliveryTime) {
        this.endDeliveryTime = endDeliveryTime;
    }

    public Object getVehiclePlate() {
        return vehiclePlate;
    }

    public void setVehiclePlate(Object vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    public Object getATDocumentType() {
        return aTDocumentType;
    }

    public void setATDocumentType(Object aTDocumentType) {
        this.aTDocumentType = aTDocumentType;
    }

    public Object getElecCommStatus() {
        return elecCommStatus;
    }

    public void setElecCommStatus(Object elecCommStatus) {
        this.elecCommStatus = elecCommStatus;
    }

    public Object getElecCommMessage() {
        return elecCommMessage;
    }

    public void setElecCommMessage(Object elecCommMessage) {
        this.elecCommMessage = elecCommMessage;
    }

    public String getReuseDocumentNum() {
        return reuseDocumentNum;
    }

    public void setReuseDocumentNum(String reuseDocumentNum) {
        this.reuseDocumentNum = reuseDocumentNum;
    }

    public String getReuseNotaFiscalNum() {
        return reuseNotaFiscalNum;
    }

    public void setReuseNotaFiscalNum(String reuseNotaFiscalNum) {
        this.reuseNotaFiscalNum = reuseNotaFiscalNum;
    }

    public String getPrintSEPADirect() {
        return printSEPADirect;
    }

    public void setPrintSEPADirect(String printSEPADirect) {
        this.printSEPADirect = printSEPADirect;
    }

    public Object getFiscalDocNum() {
        return fiscalDocNum;
    }

    public void setFiscalDocNum(Object fiscalDocNum) {
        this.fiscalDocNum = fiscalDocNum;
    }

    public Object getPOSDailySummaryNo() {
        return pOSDailySummaryNo;
    }

    public void setPOSDailySummaryNo(Object pOSDailySummaryNo) {
        this.pOSDailySummaryNo = pOSDailySummaryNo;
    }

    public Object getPOSReceiptNo() {
        return pOSReceiptNo;
    }

    public void setPOSReceiptNo(Object pOSReceiptNo) {
        this.pOSReceiptNo = pOSReceiptNo;
    }

    public Object getPointOfIssueCode() {
        return pointOfIssueCode;
    }

    public void setPointOfIssueCode(Object pointOfIssueCode) {
        this.pointOfIssueCode = pointOfIssueCode;
    }

    public Object getLetter() {
        return letter;
    }

    public void setLetter(Object letter) {
        this.letter = letter;
    }

    public Object getFolioNumberFrom() {
        return folioNumberFrom;
    }

    public void setFolioNumberFrom(Object folioNumberFrom) {
        this.folioNumberFrom = folioNumberFrom;
    }

    public Object getFolioNumberTo() {
        return folioNumberTo;
    }

    public void setFolioNumberTo(Object folioNumberTo) {
        this.folioNumberTo = folioNumberTo;
    }

    public String getInterimType() {
        return interimType;
    }

    public void setInterimType(String interimType) {
        this.interimType = interimType;
    }

    public Integer getRelatedType() {
        return relatedType;
    }

    public void setRelatedType(Integer relatedType) {
        this.relatedType = relatedType;
    }

    public Object getRelatedEntry() {
        return relatedEntry;
    }

    public void setRelatedEntry(Object relatedEntry) {
        this.relatedEntry = relatedEntry;
    }

    public Object getSAPPassport() {
        return sAPPassport;
    }

    public void setSAPPassport(Object sAPPassport) {
        this.sAPPassport = sAPPassport;
    }

    public Object getDocumentTaxID() {
        return documentTaxID;
    }

    public void setDocumentTaxID(Object documentTaxID) {
        this.documentTaxID = documentTaxID;
    }

    public Object getDateOfReportingControlStatementVAT() {
        return dateOfReportingControlStatementVAT;
    }

    public void setDateOfReportingControlStatementVAT(Object dateOfReportingControlStatementVAT) {
        this.dateOfReportingControlStatementVAT = dateOfReportingControlStatementVAT;
    }

    public Object getReportingSectionControlStatementVAT() {
        return reportingSectionControlStatementVAT;
    }

    public void setReportingSectionControlStatementVAT(Object reportingSectionControlStatementVAT) {
        this.reportingSectionControlStatementVAT = reportingSectionControlStatementVAT;
    }

    public String getExcludeFromTaxReportControlStatementVAT() {
        return excludeFromTaxReportControlStatementVAT;
    }

    public void setExcludeFromTaxReportControlStatementVAT(String excludeFromTaxReportControlStatementVAT) {
        this.excludeFromTaxReportControlStatementVAT = excludeFromTaxReportControlStatementVAT;
    }

    public Object getPOSCashRegister() {
        return pOSCashRegister;
    }

    public void setPOSCashRegister(Object pOSCashRegister) {
        this.pOSCashRegister = pOSCashRegister;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Object getPriceMode() {
        return priceMode;
    }

    public void setPriceMode(Object priceMode) {
        this.priceMode = priceMode;
    }

    public String getShipFrom() {
        return shipFrom;
    }

    public void setShipFrom(String shipFrom) {
        this.shipFrom = shipFrom;
    }

    public String getCommissionTrade() {
        return commissionTrade;
    }

    public void setCommissionTrade(String commissionTrade) {
        this.commissionTrade = commissionTrade;
    }

    public String getCommissionTradeReturn() {
        return commissionTradeReturn;
    }

    public void setCommissionTradeReturn(String commissionTradeReturn) {
        this.commissionTradeReturn = commissionTradeReturn;
    }

    public Object getUseBillToAddrToDetermineTax() {
        return useBillToAddrToDetermineTax;
    }

    public void setUseBillToAddrToDetermineTax(Object useBillToAddrToDetermineTax) {
        this.useBillToAddrToDetermineTax = useBillToAddrToDetermineTax;
    }

    public Object getCig() {
        return cig;
    }

    public void setCig(Object cig) {
        this.cig = cig;
    }

    public Object getCup() {
        return cup;
    }

    public void setCup(Object cup) {
        this.cup = cup;
    }

    public List<Object> getDocumentApprovalRequests() {
        return documentApprovalRequests;
    }

    public void setDocumentApprovalRequests(List<Object> documentApprovalRequests) {
        this.documentApprovalRequests = documentApprovalRequests;
    }

    public List<DocumentLine> getDocumentLines() {
        return documentLines;
    }

    public void setDocumentLines(List<DocumentLine> documentLines) {
        this.documentLines = documentLines;
    }

    public List<Object> getElectronicProtocols() {
        return electronicProtocols;
    }

    public void setElectronicProtocols(List<Object> electronicProtocols) {
        this.electronicProtocols = electronicProtocols;
    }

    public List<Object> getDocumentAdditionalExpenses() {
        return documentAdditionalExpenses;
    }

    public void setDocumentAdditionalExpenses(List<Object> documentAdditionalExpenses) {
        this.documentAdditionalExpenses = documentAdditionalExpenses;
    }

    public List<Object> getWithholdingTaxDataWTXCollection() {
        return withholdingTaxDataWTXCollection;
    }

    public void setWithholdingTaxDataWTXCollection(List<Object> withholdingTaxDataWTXCollection) {
        this.withholdingTaxDataWTXCollection = withholdingTaxDataWTXCollection;
    }

    public List<Object> getWithholdingTaxDataCollection() {
        return withholdingTaxDataCollection;
    }

    public void setWithholdingTaxDataCollection(List<Object> withholdingTaxDataCollection) {
        this.withholdingTaxDataCollection = withholdingTaxDataCollection;
    }

    public List<Object> getDocumentSpecialLines() {
        return documentSpecialLines;
    }

    public void setDocumentSpecialLines(List<Object> documentSpecialLines) {
        this.documentSpecialLines = documentSpecialLines;
    }

    public TaxExtension getTaxExtension() {
        return taxExtension;
    }

    public void setTaxExtension(TaxExtension taxExtension) {
        this.taxExtension = taxExtension;
    }

    public AddressExtension getAddressExtension() {
        return addressExtension;
    }

    public void setAddressExtension(AddressExtension addressExtension) {
        this.addressExtension = addressExtension;
    }
    public class B1Documents implements Serializable
    {

        @SerializedName("odata.metadata")
        @Expose
        private String odataMetadata;
        @SerializedName("value")
        @Expose
        private List<B1Document> value = null;
        @SerializedName("odata.nextLink")
        @Expose
        private String odataNextLink;
        private final static long serialVersionUID = -2326865304008550549L;

        public String getOdataMetadata() {
            return odataMetadata;
        }

        public void setOdataMetadata(String odataMetadata) {
            this.odataMetadata = odataMetadata;
        }

        public List<B1Document> getValue() {
            return value;
        }

        public void setValue(List<B1Document> value) {
            this.value = value;
        }

        public String getOdataNextLink() {
            return odataNextLink;
        }

        public void setOdataNextLink(String odataNextLink) {
            this.odataNextLink = odataNextLink;
        }

    }
    public class DocumentLine implements Serializable
    {

        @SerializedName("LineNum")
        @Expose
        private Integer lineNum;
        @SerializedName("ItemCode")
        @Expose
        private String itemCode;
        @SerializedName("ItemDescription")
        @Expose
        private String itemDescription;
        @SerializedName("Quantity")
        @Expose
        private Double quantity;
        @SerializedName("ShipDate")
        @Expose
        private String shipDate;
        @SerializedName("Price")
        @Expose
        private Double price;
        @SerializedName("PriceAfterVAT")
        @Expose
        private Double priceAfterVAT;
        @SerializedName("Currency")
        @Expose
        private String currency;
        @SerializedName("Rate")
        @Expose
        private Double rate;
        @SerializedName("DiscountPercent")
        @Expose
        private Double discountPercent;
        @SerializedName("VendorNum")
        @Expose
        private Object vendorNum;
        @SerializedName("SerialNum")
        @Expose
        private Object serialNum;
        @SerializedName("WarehouseCode")
        @Expose
        private String warehouseCode;
        @SerializedName("SalesPersonCode")
        @Expose
        private Integer salesPersonCode;
        @SerializedName("CommisionPercent")
        @Expose
        private Double commisionPercent;
        @SerializedName("TreeType")
        @Expose
        private String treeType;
        @SerializedName("AccountCode")
        @Expose
        private String accountCode;
        @SerializedName("UseBaseUnits")
        @Expose
        private String useBaseUnits;
        @SerializedName("SupplierCatNum")
        @Expose
        private Object supplierCatNum;
        @SerializedName("CostingCode")
        @Expose
        private Object costingCode;
        @SerializedName("ProjectCode")
        @Expose
        private Object projectCode;
        @SerializedName("BarCode")
        @Expose
        private Object barCode;
        @SerializedName("VatGroup")
        @Expose
        private Object vatGroup;
        @SerializedName("Height1")
        @Expose
        private Double height1;
        @SerializedName("Hight1Unit")
        @Expose
        private Integer hight1Unit;
        @SerializedName("Height2")
        @Expose
        private Double height2;
        @SerializedName("Height2Unit")
        @Expose
        private Object height2Unit;
        @SerializedName("Lengh1")
        @Expose
        private Double lengh1;
        @SerializedName("Lengh1Unit")
        @Expose
        private Integer lengh1Unit;
        @SerializedName("Lengh2")
        @Expose
        private Double lengh2;
        @SerializedName("Lengh2Unit")
        @Expose
        private Object lengh2Unit;
        @SerializedName("Weight1")
        @Expose
        private Double weight1;
        @SerializedName("Weight1Unit")
        @Expose
        private Integer weight1Unit;
        @SerializedName("Weight2")
        @Expose
        private Double weight2;
        @SerializedName("Weight2Unit")
        @Expose
        private Object weight2Unit;
        @SerializedName("Factor1")
        @Expose
        private Double factor1;
        @SerializedName("Factor2")
        @Expose
        private Double factor2;
        @SerializedName("Factor3")
        @Expose
        private Double factor3;
        @SerializedName("Factor4")
        @Expose
        private Double factor4;
        @SerializedName("BaseType")
        @Expose
        private Integer baseType;
        @SerializedName("BaseEntry")
        @Expose
        private Object baseEntry;
        @SerializedName("BaseLine")
        @Expose
        private Object baseLine;
        @SerializedName("Volume")
        @Expose
        private Double volume;
        @SerializedName("VolumeUnit")
        @Expose
        private Integer volumeUnit;
        @SerializedName("Width1")
        @Expose
        private Double width1;
        @SerializedName("Width1Unit")
        @Expose
        private Integer width1Unit;
        @SerializedName("Width2")
        @Expose
        private Double width2;
        @SerializedName("Width2Unit")
        @Expose
        private Object width2Unit;
        @SerializedName("Address")
        @Expose
        private String address;
        @SerializedName("TaxCode")
        @Expose
        private String taxCode;
        @SerializedName("TaxType")
        @Expose
        private String taxType;
        @SerializedName("TaxLiable")
        @Expose
        private String taxLiable;
        @SerializedName("PickStatus")
        @Expose
        private String pickStatus;
        @SerializedName("PickQuantity")
        @Expose
        private Double pickQuantity;
        @SerializedName("PickListIdNumber")
        @Expose
        private Object pickListIdNumber;
        @SerializedName("OriginalItem")
        @Expose
        private Object originalItem;
        @SerializedName("BackOrder")
        @Expose
        private Object backOrder;
        @SerializedName("FreeText")
        @Expose
        private Object freeText;
        @SerializedName("ShippingMethod")
        @Expose
        private Integer shippingMethod;
        @SerializedName("POTargetNum")
        @Expose
        private Object pOTargetNum;
        @SerializedName("POTargetEntry")
        @Expose
        private Object pOTargetEntry;
        @SerializedName("POTargetRowNum")
        @Expose
        private Object pOTargetRowNum;
        @SerializedName("CorrectionInvoiceItem")
        @Expose
        private String correctionInvoiceItem;
        @SerializedName("CorrInvAmountToStock")
        @Expose
        private Double corrInvAmountToStock;
        @SerializedName("CorrInvAmountToDiffAcct")
        @Expose
        private Double corrInvAmountToDiffAcct;
        @SerializedName("AppliedTax")
        @Expose
        private Double appliedTax;
        @SerializedName("AppliedTaxFC")
        @Expose
        private Double appliedTaxFC;
        @SerializedName("AppliedTaxSC")
        @Expose
        private Double appliedTaxSC;
        @SerializedName("WTLiable")
        @Expose
        private String wTLiable;
        @SerializedName("DeferredTax")
        @Expose
        private String deferredTax;
        @SerializedName("EqualizationTaxPercent")
        @Expose
        private Double equalizationTaxPercent;
        @SerializedName("TotalEqualizationTax")
        @Expose
        private Double totalEqualizationTax;
        @SerializedName("TotalEqualizationTaxFC")
        @Expose
        private Double totalEqualizationTaxFC;
        @SerializedName("TotalEqualizationTaxSC")
        @Expose
        private Double totalEqualizationTaxSC;
        @SerializedName("NetTaxAmount")
        @Expose
        private Double netTaxAmount;
        @SerializedName("NetTaxAmountFC")
        @Expose
        private Double netTaxAmountFC;
        @SerializedName("NetTaxAmountSC")
        @Expose
        private Double netTaxAmountSC;
        @SerializedName("MeasureUnit")
        @Expose
        private Object measureUnit;
        @SerializedName("UnitsOfMeasurment")
        @Expose
        private Double unitsOfMeasurment;
        @SerializedName("LineTotal")
        @Expose
        private Double lineTotal;
        @SerializedName("TaxPercentagePerRow")
        @Expose
        private Double taxPercentagePerRow;
        @SerializedName("TaxTotal")
        @Expose
        private Double taxTotal;
        @SerializedName("ConsumerSalesForecast")
        @Expose
        private String consumerSalesForecast;
        @SerializedName("ExciseAmount")
        @Expose
        private Double exciseAmount;
        @SerializedName("TaxPerUnit")
        @Expose
        private Double taxPerUnit;
        @SerializedName("TotalInclTax")
        @Expose
        private Double totalInclTax;
        @SerializedName("CountryOrg")
        @Expose
        private Object countryOrg;
        @SerializedName("SWW")
        @Expose
        private Object sWW;
        @SerializedName("TransactionType")
        @Expose
        private Object transactionType;
        @SerializedName("DistributeExpense")
        @Expose
        private String distributeExpense;
        @SerializedName("RowTotalFC")
        @Expose
        private Double rowTotalFC;
        @SerializedName("RowTotalSC")
        @Expose
        private Double rowTotalSC;
        @SerializedName("LastBuyInmPrice")
        @Expose
        private Double lastBuyInmPrice;
        @SerializedName("LastBuyDistributeSumFc")
        @Expose
        private Double lastBuyDistributeSumFc;
        @SerializedName("LastBuyDistributeSumSc")
        @Expose
        private Double lastBuyDistributeSumSc;
        @SerializedName("LastBuyDistributeSum")
        @Expose
        private Double lastBuyDistributeSum;
        @SerializedName("StockDistributesumForeign")
        @Expose
        private Double stockDistributesumForeign;
        @SerializedName("StockDistributesumSystem")
        @Expose
        private Double stockDistributesumSystem;
        @SerializedName("StockDistributesum")
        @Expose
        private Double stockDistributesum;
        @SerializedName("StockInmPrice")
        @Expose
        private Double stockInmPrice;
        @SerializedName("PickStatusEx")
        @Expose
        private String pickStatusEx;
        @SerializedName("TaxBeforeDPM")
        @Expose
        private Double taxBeforeDPM;
        @SerializedName("TaxBeforeDPMFC")
        @Expose
        private Double taxBeforeDPMFC;
        @SerializedName("TaxBeforeDPMSC")
        @Expose
        private Double taxBeforeDPMSC;
        @SerializedName("CFOPCode")
        @Expose
        private Object cFOPCode;
        @SerializedName("CSTCode")
        @Expose
        private Object cSTCode;
        @SerializedName("Usage")
        @Expose
        private Object usage;
        @SerializedName("TaxOnly")
        @Expose
        private String taxOnly;
        @SerializedName("VisualOrder")
        @Expose
        private Integer visualOrder;
        @SerializedName("BaseOpenQuantity")
        @Expose
        private Double baseOpenQuantity;
        @SerializedName("UnitPrice")
        @Expose
        private Double unitPrice;
        @SerializedName("LineStatus")
        @Expose
        private String lineStatus;
        @SerializedName("PackageQuantity")
        @Expose
        private Double packageQuantity;
        @SerializedName("Text")
        @Expose
        private Object text;
        @SerializedName("LineType")
        @Expose
        private String lineType;
        @SerializedName("COGSCostingCode")
        @Expose
        private Object cOGSCostingCode;
        @SerializedName("COGSAccountCode")
        @Expose
        private Object cOGSAccountCode;
        @SerializedName("ChangeAssemlyBoMWarehouse")
        @Expose
        private String changeAssemlyBoMWarehouse;
        @SerializedName("GrossBuyPrice")
        @Expose
        private Double grossBuyPrice;
        @SerializedName("GrossBase")
        @Expose
        private Object grossBase;
        @SerializedName("GrossProfitTotalBasePrice")
        @Expose
        private Object grossProfitTotalBasePrice;
        @SerializedName("CostingCode2")
        @Expose
        private Object costingCode2;
        @SerializedName("CostingCode3")
        @Expose
        private Object costingCode3;
        @SerializedName("CostingCode4")
        @Expose
        private Object costingCode4;
        @SerializedName("CostingCode5")
        @Expose
        private Object costingCode5;
        @SerializedName("ItemDetails")
        @Expose
        private String itemDetails;
        @SerializedName("LocationCode")
        @Expose
        private Object locationCode;
        @SerializedName("ActualDeliveryDate")
        @Expose
        private Object actualDeliveryDate;
        @SerializedName("RemainingOpenQuantity")
        @Expose
        private Double remainingOpenQuantity;
        @SerializedName("OpenAmount")
        @Expose
        private Double openAmount;
        @SerializedName("OpenAmountFC")
        @Expose
        private Double openAmountFC;
        @SerializedName("OpenAmountSC")
        @Expose
        private Double openAmountSC;
        @SerializedName("ExLineNo")
        @Expose
        private Object exLineNo;
        @SerializedName("RequiredDate")
        @Expose
        private Object requiredDate;
        @SerializedName("RequiredQuantity")
        @Expose
        private Object requiredQuantity;
        @SerializedName("COGSCostingCode2")
        @Expose
        private Object cOGSCostingCode2;
        @SerializedName("COGSCostingCode3")
        @Expose
        private Object cOGSCostingCode3;
        @SerializedName("COGSCostingCode4")
        @Expose
        private Object cOGSCostingCode4;
        @SerializedName("COGSCostingCode5")
        @Expose
        private Object cOGSCostingCode5;
        @SerializedName("CSTforIPI")
        @Expose
        private Object cSTforIPI;
        @SerializedName("CSTforPIS")
        @Expose
        private Object cSTforPIS;
        @SerializedName("CSTforCOFINS")
        @Expose
        private Object cSTforCOFINS;
        @SerializedName("CreditOriginCode")
        @Expose
        private Object creditOriginCode;
        @SerializedName("WithoutInventoryMovement")
        @Expose
        private String withoutInventoryMovement;
        @SerializedName("AgreementNo")
        @Expose
        private Object agreementNo;
        @SerializedName("AgreementRowNumber")
        @Expose
        private Object agreementRowNumber;
        @SerializedName("ActualBaseEntry")
        @Expose
        private Object actualBaseEntry;
        @SerializedName("ActualBaseLine")
        @Expose
        private Object actualBaseLine;
        @SerializedName("DocEntry")
        @Expose
        private Integer docEntry;
        @SerializedName("Surpluses")
        @Expose
        private Object surpluses;
        @SerializedName("DefectAndBreakup")
        @Expose
        private Object defectAndBreakup;
        @SerializedName("Shortages")
        @Expose
        private Object shortages;
        @SerializedName("ConsiderQuantity")
        @Expose
        private String considerQuantity;
        @SerializedName("PartialRetirement")
        @Expose
        private String partialRetirement;
        @SerializedName("RetirementQuantity")
        @Expose
        private Object retirementQuantity;
        @SerializedName("RetirementAPC")
        @Expose
        private Object retirementAPC;
        @SerializedName("ThirdParty")
        @Expose
        private String thirdParty;
        @SerializedName("ExpenseType")
        @Expose
        private Object expenseType;
        @SerializedName("ReceiptNumber")
        @Expose
        private Object receiptNumber;
        @SerializedName("ExpenseOperationType")
        @Expose
        private Object expenseOperationType;
        @SerializedName("FederalTaxID")
        @Expose
        private Object federalTaxID;
        @SerializedName("StgSeqNum")
        @Expose
        private Object stgSeqNum;
        @SerializedName("StgEntry")
        @Expose
        private Object stgEntry;
        @SerializedName("StgDesc")
        @Expose
        private Object stgDesc;
        @SerializedName("UoMEntry")
        @Expose
        private Integer uoMEntry;
        @SerializedName("UoMCode")
        @Expose
        private String uoMCode;
        @SerializedName("InventoryQuantity")
        @Expose
        private Double inventoryQuantity;
        @SerializedName("RemainingOpenInventoryQuantity")
        @Expose
        private Double remainingOpenInventoryQuantity;
        @SerializedName("ParentLineNum")
        @Expose
        private Object parentLineNum;
        @SerializedName("Incoterms")
        @Expose
        private Integer incoterms;
        @SerializedName("TransportMode")
        @Expose
        private Integer transportMode;
        @SerializedName("ItemType")
        @Expose
        private String itemType;
        @SerializedName("ChangeInventoryQuantityIndependently")
        @Expose
        private String changeInventoryQuantityIndependently;
        @SerializedName("FreeOfChargeBP")
        @Expose
        private Object freeOfChargeBP;
        @SerializedName("SACEntry")
        @Expose
        private Object sACEntry;
        @SerializedName("HSNEntry")
        @Expose
        private Object hSNEntry;
        @SerializedName("GrossPrice")
        @Expose
        private Double grossPrice;
        @SerializedName("GrossTotal")
        @Expose
        private Double grossTotal;
        @SerializedName("GrossTotalFC")
        @Expose
        private Double grossTotalFC;
        @SerializedName("GrossTotalSC")
        @Expose
        private Double grossTotalSC;
        @SerializedName("NCMCode")
        @Expose
        private Integer nCMCode;
        @SerializedName("ShipFromCode")
        @Expose
        private Object shipFromCode;
        @SerializedName("ShipFromDescription")
        @Expose
        private Object shipFromDescription;
        @SerializedName("LineTaxJurisdictions")
        @Expose
        private List<LineTaxJurisdiction> lineTaxJurisdictions = null;
        @SerializedName("DocumentLineAdditionalExpenses")
        @Expose
        private List<Object> documentLineAdditionalExpenses = null;
        @SerializedName("WithholdingTaxLines")
        @Expose
        private List<Object> withholdingTaxLines = null;
        @SerializedName("SerialNumbers")
        @Expose
        private List<Object> serialNumbers = null;
        @SerializedName("BatchNumbers")
        @Expose
        private List<Object> batchNumbers = null;
        @SerializedName("DocumentLinesBinAllocations")
        @Expose
        private List<Object> documentLinesBinAllocations = null;
        private final static long serialVersionUID = 8872766598708001847L;

        public Integer getLineNum() {
            return lineNum;
        }

        public void setLineNum(Integer lineNum) {
            this.lineNum = lineNum;
        }

        public String getItemCode() {
            return itemCode;
        }

        public void setItemCode(String itemCode) {
            this.itemCode = itemCode;
        }

        public String getItemDescription() {
            return itemDescription;
        }

        public void setItemDescription(String itemDescription) {
            this.itemDescription = itemDescription;
        }

        public Double getQuantity() {
            return quantity;
        }

        public void setQuantity(Double quantity) {
            this.quantity = quantity;
        }

        public String getShipDate() {
            return shipDate;
        }

        public void setShipDate(String shipDate) {
            this.shipDate = shipDate;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public Double getPriceAfterVAT() {
            return priceAfterVAT;
        }

        public void setPriceAfterVAT(Double priceAfterVAT) {
            this.priceAfterVAT = priceAfterVAT;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public Double getRate() {
            return rate;
        }

        public void setRate(Double rate) {
            this.rate = rate;
        }

        public Double getDiscountPercent() {
            return discountPercent;
        }

        public void setDiscountPercent(Double discountPercent) {
            this.discountPercent = discountPercent;
        }

        public Object getVendorNum() {
            return vendorNum;
        }

        public void setVendorNum(Object vendorNum) {
            this.vendorNum = vendorNum;
        }

        public Object getSerialNum() {
            return serialNum;
        }

        public void setSerialNum(Object serialNum) {
            this.serialNum = serialNum;
        }

        public String getWarehouseCode() {
            return warehouseCode;
        }

        public void setWarehouseCode(String warehouseCode) {
            this.warehouseCode = warehouseCode;
        }

        public Integer getSalesPersonCode() {
            return salesPersonCode;
        }

        public void setSalesPersonCode(Integer salesPersonCode) {
            this.salesPersonCode = salesPersonCode;
        }

        public Double getCommisionPercent() {
            return commisionPercent;
        }

        public void setCommisionPercent(Double commisionPercent) {
            this.commisionPercent = commisionPercent;
        }

        public String getTreeType() {
            return treeType;
        }

        public void setTreeType(String treeType) {
            this.treeType = treeType;
        }

        public String getAccountCode() {
            return accountCode;
        }

        public void setAccountCode(String accountCode) {
            this.accountCode = accountCode;
        }

        public String getUseBaseUnits() {
            return useBaseUnits;
        }

        public void setUseBaseUnits(String useBaseUnits) {
            this.useBaseUnits = useBaseUnits;
        }

        public Object getSupplierCatNum() {
            return supplierCatNum;
        }

        public void setSupplierCatNum(Object supplierCatNum) {
            this.supplierCatNum = supplierCatNum;
        }

        public Object getCostingCode() {
            return costingCode;
        }

        public void setCostingCode(Object costingCode) {
            this.costingCode = costingCode;
        }

        public Object getProjectCode() {
            return projectCode;
        }

        public void setProjectCode(Object projectCode) {
            this.projectCode = projectCode;
        }

        public Object getBarCode() {
            return barCode;
        }

        public void setBarCode(Object barCode) {
            this.barCode = barCode;
        }

        public Object getVatGroup() {
            return vatGroup;
        }

        public void setVatGroup(Object vatGroup) {
            this.vatGroup = vatGroup;
        }

        public Double getHeight1() {
            return height1;
        }

        public void setHeight1(Double height1) {
            this.height1 = height1;
        }

        public Integer getHight1Unit() {
            return hight1Unit;
        }

        public void setHight1Unit(Integer hight1Unit) {
            this.hight1Unit = hight1Unit;
        }

        public Double getHeight2() {
            return height2;
        }

        public void setHeight2(Double height2) {
            this.height2 = height2;
        }

        public Object getHeight2Unit() {
            return height2Unit;
        }

        public void setHeight2Unit(Object height2Unit) {
            this.height2Unit = height2Unit;
        }

        public Double getLengh1() {
            return lengh1;
        }

        public void setLengh1(Double lengh1) {
            this.lengh1 = lengh1;
        }

        public Integer getLengh1Unit() {
            return lengh1Unit;
        }

        public void setLengh1Unit(Integer lengh1Unit) {
            this.lengh1Unit = lengh1Unit;
        }

        public Double getLengh2() {
            return lengh2;
        }

        public void setLengh2(Double lengh2) {
            this.lengh2 = lengh2;
        }

        public Object getLengh2Unit() {
            return lengh2Unit;
        }

        public void setLengh2Unit(Object lengh2Unit) {
            this.lengh2Unit = lengh2Unit;
        }

        public Double getWeight1() {
            return weight1;
        }

        public void setWeight1(Double weight1) {
            this.weight1 = weight1;
        }

        public Integer getWeight1Unit() {
            return weight1Unit;
        }

        public void setWeight1Unit(Integer weight1Unit) {
            this.weight1Unit = weight1Unit;
        }

        public Double getWeight2() {
            return weight2;
        }

        public void setWeight2(Double weight2) {
            this.weight2 = weight2;
        }

        public Object getWeight2Unit() {
            return weight2Unit;
        }

        public void setWeight2Unit(Object weight2Unit) {
            this.weight2Unit = weight2Unit;
        }

        public Double getFactor1() {
            return factor1;
        }

        public void setFactor1(Double factor1) {
            this.factor1 = factor1;
        }

        public Double getFactor2() {
            return factor2;
        }

        public void setFactor2(Double factor2) {
            this.factor2 = factor2;
        }

        public Double getFactor3() {
            return factor3;
        }

        public void setFactor3(Double factor3) {
            this.factor3 = factor3;
        }

        public Double getFactor4() {
            return factor4;
        }

        public void setFactor4(Double factor4) {
            this.factor4 = factor4;
        }

        public Integer getBaseType() {
            return baseType;
        }

        public void setBaseType(Integer baseType) {
            this.baseType = baseType;
        }

        public Object getBaseEntry() {
            return baseEntry;
        }

        public void setBaseEntry(Object baseEntry) {
            this.baseEntry = baseEntry;
        }

        public Object getBaseLine() {
            return baseLine;
        }

        public void setBaseLine(Object baseLine) {
            this.baseLine = baseLine;
        }

        public Double getVolume() {
            return volume;
        }

        public void setVolume(Double volume) {
            this.volume = volume;
        }

        public Integer getVolumeUnit() {
            return volumeUnit;
        }

        public void setVolumeUnit(Integer volumeUnit) {
            this.volumeUnit = volumeUnit;
        }

        public Double getWidth1() {
            return width1;
        }

        public void setWidth1(Double width1) {
            this.width1 = width1;
        }

        public Integer getWidth1Unit() {
            return width1Unit;
        }

        public void setWidth1Unit(Integer width1Unit) {
            this.width1Unit = width1Unit;
        }

        public Double getWidth2() {
            return width2;
        }

        public void setWidth2(Double width2) {
            this.width2 = width2;
        }

        public Object getWidth2Unit() {
            return width2Unit;
        }

        public void setWidth2Unit(Object width2Unit) {
            this.width2Unit = width2Unit;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getTaxCode() {
            return taxCode;
        }

        public void setTaxCode(String taxCode) {
            this.taxCode = taxCode;
        }

        public String getTaxType() {
            return taxType;
        }

        public void setTaxType(String taxType) {
            this.taxType = taxType;
        }

        public String getTaxLiable() {
            return taxLiable;
        }

        public void setTaxLiable(String taxLiable) {
            this.taxLiable = taxLiable;
        }

        public String getPickStatus() {
            return pickStatus;
        }

        public void setPickStatus(String pickStatus) {
            this.pickStatus = pickStatus;
        }

        public Double getPickQuantity() {
            return pickQuantity;
        }

        public void setPickQuantity(Double pickQuantity) {
            this.pickQuantity = pickQuantity;
        }

        public Object getPickListIdNumber() {
            return pickListIdNumber;
        }

        public void setPickListIdNumber(Object pickListIdNumber) {
            this.pickListIdNumber = pickListIdNumber;
        }

        public Object getOriginalItem() {
            return originalItem;
        }

        public void setOriginalItem(Object originalItem) {
            this.originalItem = originalItem;
        }

        public Object getBackOrder() {
            return backOrder;
        }

        public void setBackOrder(Object backOrder) {
            this.backOrder = backOrder;
        }

        public Object getFreeText() {
            return freeText;
        }

        public void setFreeText(Object freeText) {
            this.freeText = freeText;
        }

        public Integer getShippingMethod() {
            return shippingMethod;
        }

        public void setShippingMethod(Integer shippingMethod) {
            this.shippingMethod = shippingMethod;
        }

        public Object getPOTargetNum() {
            return pOTargetNum;
        }

        public void setPOTargetNum(Object pOTargetNum) {
            this.pOTargetNum = pOTargetNum;
        }

        public Object getPOTargetEntry() {
            return pOTargetEntry;
        }

        public void setPOTargetEntry(Object pOTargetEntry) {
            this.pOTargetEntry = pOTargetEntry;
        }

        public Object getPOTargetRowNum() {
            return pOTargetRowNum;
        }

        public void setPOTargetRowNum(Object pOTargetRowNum) {
            this.pOTargetRowNum = pOTargetRowNum;
        }

        public String getCorrectionInvoiceItem() {
            return correctionInvoiceItem;
        }

        public void setCorrectionInvoiceItem(String correctionInvoiceItem) {
            this.correctionInvoiceItem = correctionInvoiceItem;
        }

        public Double getCorrInvAmountToStock() {
            return corrInvAmountToStock;
        }

        public void setCorrInvAmountToStock(Double corrInvAmountToStock) {
            this.corrInvAmountToStock = corrInvAmountToStock;
        }

        public Double getCorrInvAmountToDiffAcct() {
            return corrInvAmountToDiffAcct;
        }

        public void setCorrInvAmountToDiffAcct(Double corrInvAmountToDiffAcct) {
            this.corrInvAmountToDiffAcct = corrInvAmountToDiffAcct;
        }

        public Double getAppliedTax() {
            return appliedTax;
        }

        public void setAppliedTax(Double appliedTax) {
            this.appliedTax = appliedTax;
        }

        public Double getAppliedTaxFC() {
            return appliedTaxFC;
        }

        public void setAppliedTaxFC(Double appliedTaxFC) {
            this.appliedTaxFC = appliedTaxFC;
        }

        public Double getAppliedTaxSC() {
            return appliedTaxSC;
        }

        public void setAppliedTaxSC(Double appliedTaxSC) {
            this.appliedTaxSC = appliedTaxSC;
        }

        public String getWTLiable() {
            return wTLiable;
        }

        public void setWTLiable(String wTLiable) {
            this.wTLiable = wTLiable;
        }

        public String getDeferredTax() {
            return deferredTax;
        }

        public void setDeferredTax(String deferredTax) {
            this.deferredTax = deferredTax;
        }

        public Double getEqualizationTaxPercent() {
            return equalizationTaxPercent;
        }

        public void setEqualizationTaxPercent(Double equalizationTaxPercent) {
            this.equalizationTaxPercent = equalizationTaxPercent;
        }

        public Double getTotalEqualizationTax() {
            return totalEqualizationTax;
        }

        public void setTotalEqualizationTax(Double totalEqualizationTax) {
            this.totalEqualizationTax = totalEqualizationTax;
        }

        public Double getTotalEqualizationTaxFC() {
            return totalEqualizationTaxFC;
        }

        public void setTotalEqualizationTaxFC(Double totalEqualizationTaxFC) {
            this.totalEqualizationTaxFC = totalEqualizationTaxFC;
        }

        public Double getTotalEqualizationTaxSC() {
            return totalEqualizationTaxSC;
        }

        public void setTotalEqualizationTaxSC(Double totalEqualizationTaxSC) {
            this.totalEqualizationTaxSC = totalEqualizationTaxSC;
        }

        public Double getNetTaxAmount() {
            return netTaxAmount;
        }

        public void setNetTaxAmount(Double netTaxAmount) {
            this.netTaxAmount = netTaxAmount;
        }

        public Double getNetTaxAmountFC() {
            return netTaxAmountFC;
        }

        public void setNetTaxAmountFC(Double netTaxAmountFC) {
            this.netTaxAmountFC = netTaxAmountFC;
        }

        public Double getNetTaxAmountSC() {
            return netTaxAmountSC;
        }

        public void setNetTaxAmountSC(Double netTaxAmountSC) {
            this.netTaxAmountSC = netTaxAmountSC;
        }

        public Object getMeasureUnit() {
            return measureUnit;
        }

        public void setMeasureUnit(Object measureUnit) {
            this.measureUnit = measureUnit;
        }

        public Double getUnitsOfMeasurment() {
            return unitsOfMeasurment;
        }

        public void setUnitsOfMeasurment(Double unitsOfMeasurment) {
            this.unitsOfMeasurment = unitsOfMeasurment;
        }

        public Double getLineTotal() {
            return lineTotal;
        }

        public void setLineTotal(Double lineTotal) {
            this.lineTotal = lineTotal;
        }

        public Double getTaxPercentagePerRow() {
            return taxPercentagePerRow;
        }

        public void setTaxPercentagePerRow(Double taxPercentagePerRow) {
            this.taxPercentagePerRow = taxPercentagePerRow;
        }

        public Double getTaxTotal() {
            return taxTotal;
        }

        public void setTaxTotal(Double taxTotal) {
            this.taxTotal = taxTotal;
        }

        public String getConsumerSalesForecast() {
            return consumerSalesForecast;
        }

        public void setConsumerSalesForecast(String consumerSalesForecast) {
            this.consumerSalesForecast = consumerSalesForecast;
        }

        public Double getExciseAmount() {
            return exciseAmount;
        }

        public void setExciseAmount(Double exciseAmount) {
            this.exciseAmount = exciseAmount;
        }

        public Double getTaxPerUnit() {
            return taxPerUnit;
        }

        public void setTaxPerUnit(Double taxPerUnit) {
            this.taxPerUnit = taxPerUnit;
        }

        public Double getTotalInclTax() {
            return totalInclTax;
        }

        public void setTotalInclTax(Double totalInclTax) {
            this.totalInclTax = totalInclTax;
        }

        public Object getCountryOrg() {
            return countryOrg;
        }

        public void setCountryOrg(Object countryOrg) {
            this.countryOrg = countryOrg;
        }

        public Object getSWW() {
            return sWW;
        }

        public void setSWW(Object sWW) {
            this.sWW = sWW;
        }

        public Object getTransactionType() {
            return transactionType;
        }

        public void setTransactionType(Object transactionType) {
            this.transactionType = transactionType;
        }

        public String getDistributeExpense() {
            return distributeExpense;
        }

        public void setDistributeExpense(String distributeExpense) {
            this.distributeExpense = distributeExpense;
        }

        public Double getRowTotalFC() {
            return rowTotalFC;
        }

        public void setRowTotalFC(Double rowTotalFC) {
            this.rowTotalFC = rowTotalFC;
        }

        public Double getRowTotalSC() {
            return rowTotalSC;
        }

        public void setRowTotalSC(Double rowTotalSC) {
            this.rowTotalSC = rowTotalSC;
        }

        public Double getLastBuyInmPrice() {
            return lastBuyInmPrice;
        }

        public void setLastBuyInmPrice(Double lastBuyInmPrice) {
            this.lastBuyInmPrice = lastBuyInmPrice;
        }

        public Double getLastBuyDistributeSumFc() {
            return lastBuyDistributeSumFc;
        }

        public void setLastBuyDistributeSumFc(Double lastBuyDistributeSumFc) {
            this.lastBuyDistributeSumFc = lastBuyDistributeSumFc;
        }

        public Double getLastBuyDistributeSumSc() {
            return lastBuyDistributeSumSc;
        }

        public void setLastBuyDistributeSumSc(Double lastBuyDistributeSumSc) {
            this.lastBuyDistributeSumSc = lastBuyDistributeSumSc;
        }

        public Double getLastBuyDistributeSum() {
            return lastBuyDistributeSum;
        }

        public void setLastBuyDistributeSum(Double lastBuyDistributeSum) {
            this.lastBuyDistributeSum = lastBuyDistributeSum;
        }

        public Double getStockDistributesumForeign() {
            return stockDistributesumForeign;
        }

        public void setStockDistributesumForeign(Double stockDistributesumForeign) {
            this.stockDistributesumForeign = stockDistributesumForeign;
        }

        public Double getStockDistributesumSystem() {
            return stockDistributesumSystem;
        }

        public void setStockDistributesumSystem(Double stockDistributesumSystem) {
            this.stockDistributesumSystem = stockDistributesumSystem;
        }

        public Double getStockDistributesum() {
            return stockDistributesum;
        }

        public void setStockDistributesum(Double stockDistributesum) {
            this.stockDistributesum = stockDistributesum;
        }

        public Double getStockInmPrice() {
            return stockInmPrice;
        }

        public void setStockInmPrice(Double stockInmPrice) {
            this.stockInmPrice = stockInmPrice;
        }

        public String getPickStatusEx() {
            return pickStatusEx;
        }

        public void setPickStatusEx(String pickStatusEx) {
            this.pickStatusEx = pickStatusEx;
        }

        public Double getTaxBeforeDPM() {
            return taxBeforeDPM;
        }

        public void setTaxBeforeDPM(Double taxBeforeDPM) {
            this.taxBeforeDPM = taxBeforeDPM;
        }

        public Double getTaxBeforeDPMFC() {
            return taxBeforeDPMFC;
        }

        public void setTaxBeforeDPMFC(Double taxBeforeDPMFC) {
            this.taxBeforeDPMFC = taxBeforeDPMFC;
        }

        public Double getTaxBeforeDPMSC() {
            return taxBeforeDPMSC;
        }

        public void setTaxBeforeDPMSC(Double taxBeforeDPMSC) {
            this.taxBeforeDPMSC = taxBeforeDPMSC;
        }

        public Object getCFOPCode() {
            return cFOPCode;
        }

        public void setCFOPCode(Object cFOPCode) {
            this.cFOPCode = cFOPCode;
        }

        public Object getCSTCode() {
            return cSTCode;
        }

        public void setCSTCode(Object cSTCode) {
            this.cSTCode = cSTCode;
        }

        public Object getUsage() {
            return usage;
        }

        public void setUsage(Object usage) {
            this.usage = usage;
        }

        public String getTaxOnly() {
            return taxOnly;
        }

        public void setTaxOnly(String taxOnly) {
            this.taxOnly = taxOnly;
        }

        public Integer getVisualOrder() {
            return visualOrder;
        }

        public void setVisualOrder(Integer visualOrder) {
            this.visualOrder = visualOrder;
        }

        public Double getBaseOpenQuantity() {
            return baseOpenQuantity;
        }

        public void setBaseOpenQuantity(Double baseOpenQuantity) {
            this.baseOpenQuantity = baseOpenQuantity;
        }

        public Double getUnitPrice() {
            return unitPrice;
        }

        public void setUnitPrice(Double unitPrice) {
            this.unitPrice = unitPrice;
        }

        public String getLineStatus() {
            return lineStatus;
        }

        public void setLineStatus(String lineStatus) {
            this.lineStatus = lineStatus;
        }

        public Double getPackageQuantity() {
            return packageQuantity;
        }

        public void setPackageQuantity(Double packageQuantity) {
            this.packageQuantity = packageQuantity;
        }

        public Object getText() {
            return text;
        }

        public void setText(Object text) {
            this.text = text;
        }

        public String getLineType() {
            return lineType;
        }

        public void setLineType(String lineType) {
            this.lineType = lineType;
        }

        public Object getCOGSCostingCode() {
            return cOGSCostingCode;
        }

        public void setCOGSCostingCode(Object cOGSCostingCode) {
            this.cOGSCostingCode = cOGSCostingCode;
        }

        public Object getCOGSAccountCode() {
            return cOGSAccountCode;
        }

        public void setCOGSAccountCode(Object cOGSAccountCode) {
            this.cOGSAccountCode = cOGSAccountCode;
        }

        public String getChangeAssemlyBoMWarehouse() {
            return changeAssemlyBoMWarehouse;
        }

        public void setChangeAssemlyBoMWarehouse(String changeAssemlyBoMWarehouse) {
            this.changeAssemlyBoMWarehouse = changeAssemlyBoMWarehouse;
        }

        public Double getGrossBuyPrice() {
            return grossBuyPrice;
        }

        public void setGrossBuyPrice(Double grossBuyPrice) {
            this.grossBuyPrice = grossBuyPrice;
        }

        public Object getGrossBase() {
            return grossBase;
        }

        public void setGrossBase(Object grossBase) {
            this.grossBase = grossBase;
        }

        public Object getGrossProfitTotalBasePrice() {
            return grossProfitTotalBasePrice;
        }

        public void setGrossProfitTotalBasePrice(Object grossProfitTotalBasePrice) {
            this.grossProfitTotalBasePrice = grossProfitTotalBasePrice;
        }

        public Object getCostingCode2() {
            return costingCode2;
        }

        public void setCostingCode2(Object costingCode2) {
            this.costingCode2 = costingCode2;
        }

        public Object getCostingCode3() {
            return costingCode3;
        }

        public void setCostingCode3(Object costingCode3) {
            this.costingCode3 = costingCode3;
        }

        public Object getCostingCode4() {
            return costingCode4;
        }

        public void setCostingCode4(Object costingCode4) {
            this.costingCode4 = costingCode4;
        }

        public Object getCostingCode5() {
            return costingCode5;
        }

        public void setCostingCode5(Object costingCode5) {
            this.costingCode5 = costingCode5;
        }

        public String getItemDetails() {
            return itemDetails;
        }

        public void setItemDetails(String itemDetails) {
            this.itemDetails = itemDetails;
        }

        public Object getLocationCode() {
            return locationCode;
        }

        public void setLocationCode(Object locationCode) {
            this.locationCode = locationCode;
        }

        public Object getActualDeliveryDate() {
            return actualDeliveryDate;
        }

        public void setActualDeliveryDate(Object actualDeliveryDate) {
            this.actualDeliveryDate = actualDeliveryDate;
        }

        public Double getRemainingOpenQuantity() {
            return remainingOpenQuantity;
        }

        public void setRemainingOpenQuantity(Double remainingOpenQuantity) {
            this.remainingOpenQuantity = remainingOpenQuantity;
        }

        public Double getOpenAmount() {
            return openAmount;
        }

        public void setOpenAmount(Double openAmount) {
            this.openAmount = openAmount;
        }

        public Double getOpenAmountFC() {
            return openAmountFC;
        }

        public void setOpenAmountFC(Double openAmountFC) {
            this.openAmountFC = openAmountFC;
        }

        public Double getOpenAmountSC() {
            return openAmountSC;
        }

        public void setOpenAmountSC(Double openAmountSC) {
            this.openAmountSC = openAmountSC;
        }

        public Object getExLineNo() {
            return exLineNo;
        }

        public void setExLineNo(Object exLineNo) {
            this.exLineNo = exLineNo;
        }

        public Object getRequiredDate() {
            return requiredDate;
        }

        public void setRequiredDate(Object requiredDate) {
            this.requiredDate = requiredDate;
        }

        public Object getRequiredQuantity() {
            return requiredQuantity;
        }

        public void setRequiredQuantity(Object requiredQuantity) {
            this.requiredQuantity = requiredQuantity;
        }

        public Object getCOGSCostingCode2() {
            return cOGSCostingCode2;
        }

        public void setCOGSCostingCode2(Object cOGSCostingCode2) {
            this.cOGSCostingCode2 = cOGSCostingCode2;
        }

        public Object getCOGSCostingCode3() {
            return cOGSCostingCode3;
        }

        public void setCOGSCostingCode3(Object cOGSCostingCode3) {
            this.cOGSCostingCode3 = cOGSCostingCode3;
        }

        public Object getCOGSCostingCode4() {
            return cOGSCostingCode4;
        }

        public void setCOGSCostingCode4(Object cOGSCostingCode4) {
            this.cOGSCostingCode4 = cOGSCostingCode4;
        }

        public Object getCOGSCostingCode5() {
            return cOGSCostingCode5;
        }

        public void setCOGSCostingCode5(Object cOGSCostingCode5) {
            this.cOGSCostingCode5 = cOGSCostingCode5;
        }

        public Object getCSTforIPI() {
            return cSTforIPI;
        }

        public void setCSTforIPI(Object cSTforIPI) {
            this.cSTforIPI = cSTforIPI;
        }

        public Object getCSTforPIS() {
            return cSTforPIS;
        }

        public void setCSTforPIS(Object cSTforPIS) {
            this.cSTforPIS = cSTforPIS;
        }

        public Object getCSTforCOFINS() {
            return cSTforCOFINS;
        }

        public void setCSTforCOFINS(Object cSTforCOFINS) {
            this.cSTforCOFINS = cSTforCOFINS;
        }

        public Object getCreditOriginCode() {
            return creditOriginCode;
        }

        public void setCreditOriginCode(Object creditOriginCode) {
            this.creditOriginCode = creditOriginCode;
        }

        public String getWithoutInventoryMovement() {
            return withoutInventoryMovement;
        }

        public void setWithoutInventoryMovement(String withoutInventoryMovement) {
            this.withoutInventoryMovement = withoutInventoryMovement;
        }

        public Object getAgreementNo() {
            return agreementNo;
        }

        public void setAgreementNo(Object agreementNo) {
            this.agreementNo = agreementNo;
        }

        public Object getAgreementRowNumber() {
            return agreementRowNumber;
        }

        public void setAgreementRowNumber(Object agreementRowNumber) {
            this.agreementRowNumber = agreementRowNumber;
        }

        public Object getActualBaseEntry() {
            return actualBaseEntry;
        }

        public void setActualBaseEntry(Object actualBaseEntry) {
            this.actualBaseEntry = actualBaseEntry;
        }

        public Object getActualBaseLine() {
            return actualBaseLine;
        }

        public void setActualBaseLine(Object actualBaseLine) {
            this.actualBaseLine = actualBaseLine;
        }

        public Integer getDocEntry() {
            return docEntry;
        }

        public void setDocEntry(Integer docEntry) {
            this.docEntry = docEntry;
        }

        public Object getSurpluses() {
            return surpluses;
        }

        public void setSurpluses(Object surpluses) {
            this.surpluses = surpluses;
        }

        public Object getDefectAndBreakup() {
            return defectAndBreakup;
        }

        public void setDefectAndBreakup(Object defectAndBreakup) {
            this.defectAndBreakup = defectAndBreakup;
        }

        public Object getShortages() {
            return shortages;
        }

        public void setShortages(Object shortages) {
            this.shortages = shortages;
        }

        public String getConsiderQuantity() {
            return considerQuantity;
        }

        public void setConsiderQuantity(String considerQuantity) {
            this.considerQuantity = considerQuantity;
        }

        public String getPartialRetirement() {
            return partialRetirement;
        }

        public void setPartialRetirement(String partialRetirement) {
            this.partialRetirement = partialRetirement;
        }

        public Object getRetirementQuantity() {
            return retirementQuantity;
        }

        public void setRetirementQuantity(Object retirementQuantity) {
            this.retirementQuantity = retirementQuantity;
        }

        public Object getRetirementAPC() {
            return retirementAPC;
        }

        public void setRetirementAPC(Object retirementAPC) {
            this.retirementAPC = retirementAPC;
        }

        public String getThirdParty() {
            return thirdParty;
        }

        public void setThirdParty(String thirdParty) {
            this.thirdParty = thirdParty;
        }

        public Object getExpenseType() {
            return expenseType;
        }

        public void setExpenseType(Object expenseType) {
            this.expenseType = expenseType;
        }

        public Object getReceiptNumber() {
            return receiptNumber;
        }

        public void setReceiptNumber(Object receiptNumber) {
            this.receiptNumber = receiptNumber;
        }

        public Object getExpenseOperationType() {
            return expenseOperationType;
        }

        public void setExpenseOperationType(Object expenseOperationType) {
            this.expenseOperationType = expenseOperationType;
        }

        public Object getFederalTaxID() {
            return federalTaxID;
        }

        public void setFederalTaxID(Object federalTaxID) {
            this.federalTaxID = federalTaxID;
        }

        public Object getStgSeqNum() {
            return stgSeqNum;
        }

        public void setStgSeqNum(Object stgSeqNum) {
            this.stgSeqNum = stgSeqNum;
        }

        public Object getStgEntry() {
            return stgEntry;
        }

        public void setStgEntry(Object stgEntry) {
            this.stgEntry = stgEntry;
        }

        public Object getStgDesc() {
            return stgDesc;
        }

        public void setStgDesc(Object stgDesc) {
            this.stgDesc = stgDesc;
        }

        public Integer getUoMEntry() {
            return uoMEntry;
        }

        public void setUoMEntry(Integer uoMEntry) {
            this.uoMEntry = uoMEntry;
        }

        public String getUoMCode() {
            return uoMCode;
        }

        public void setUoMCode(String uoMCode) {
            this.uoMCode = uoMCode;
        }

        public Double getInventoryQuantity() {
            return inventoryQuantity;
        }

        public void setInventoryQuantity(Double inventoryQuantity) {
            this.inventoryQuantity = inventoryQuantity;
        }

        public Double getRemainingOpenInventoryQuantity() {
            return remainingOpenInventoryQuantity;
        }

        public void setRemainingOpenInventoryQuantity(Double remainingOpenInventoryQuantity) {
            this.remainingOpenInventoryQuantity = remainingOpenInventoryQuantity;
        }

        public Object getParentLineNum() {
            return parentLineNum;
        }

        public void setParentLineNum(Object parentLineNum) {
            this.parentLineNum = parentLineNum;
        }

        public Integer getIncoterms() {
            return incoterms;
        }

        public void setIncoterms(Integer incoterms) {
            this.incoterms = incoterms;
        }

        public Integer getTransportMode() {
            return transportMode;
        }

        public void setTransportMode(Integer transportMode) {
            this.transportMode = transportMode;
        }

        public String getItemType() {
            return itemType;
        }

        public void setItemType(String itemType) {
            this.itemType = itemType;
        }

        public String getChangeInventoryQuantityIndependently() {
            return changeInventoryQuantityIndependently;
        }

        public void setChangeInventoryQuantityIndependently(String changeInventoryQuantityIndependently) {
            this.changeInventoryQuantityIndependently = changeInventoryQuantityIndependently;
        }

        public Object getFreeOfChargeBP() {
            return freeOfChargeBP;
        }

        public void setFreeOfChargeBP(Object freeOfChargeBP) {
            this.freeOfChargeBP = freeOfChargeBP;
        }

        public Object getSACEntry() {
            return sACEntry;
        }

        public void setSACEntry(Object sACEntry) {
            this.sACEntry = sACEntry;
        }

        public Object getHSNEntry() {
            return hSNEntry;
        }

        public void setHSNEntry(Object hSNEntry) {
            this.hSNEntry = hSNEntry;
        }

        public Double getGrossPrice() {
            return grossPrice;
        }

        public void setGrossPrice(Double grossPrice) {
            this.grossPrice = grossPrice;
        }

        public Double getGrossTotal() {
            return grossTotal;
        }

        public void setGrossTotal(Double grossTotal) {
            this.grossTotal = grossTotal;
        }

        public Double getGrossTotalFC() {
            return grossTotalFC;
        }

        public void setGrossTotalFC(Double grossTotalFC) {
            this.grossTotalFC = grossTotalFC;
        }

        public Double getGrossTotalSC() {
            return grossTotalSC;
        }

        public void setGrossTotalSC(Double grossTotalSC) {
            this.grossTotalSC = grossTotalSC;
        }

        public Integer getNCMCode() {
            return nCMCode;
        }

        public void setNCMCode(Integer nCMCode) {
            this.nCMCode = nCMCode;
        }

        public Object getShipFromCode() {
            return shipFromCode;
        }

        public void setShipFromCode(Object shipFromCode) {
            this.shipFromCode = shipFromCode;
        }

        public Object getShipFromDescription() {
            return shipFromDescription;
        }

        public void setShipFromDescription(Object shipFromDescription) {
            this.shipFromDescription = shipFromDescription;
        }

        public List<B1Document.LineTaxJurisdiction> getLineTaxJurisdictions() {
            return lineTaxJurisdictions;
        }

        public void setLineTaxJurisdictions(List<B1Document.LineTaxJurisdiction> lineTaxJurisdictions) {
            this.lineTaxJurisdictions = lineTaxJurisdictions;
        }

        public List<Object> getDocumentLineAdditionalExpenses() {
            return documentLineAdditionalExpenses;
        }

        public void setDocumentLineAdditionalExpenses(List<Object> documentLineAdditionalExpenses) {
            this.documentLineAdditionalExpenses = documentLineAdditionalExpenses;
        }

        public List<Object> getWithholdingTaxLines() {
            return withholdingTaxLines;
        }

        public void setWithholdingTaxLines(List<Object> withholdingTaxLines) {
            this.withholdingTaxLines = withholdingTaxLines;
        }

        public List<Object> getSerialNumbers() {
            return serialNumbers;
        }

        public void setSerialNumbers(List<Object> serialNumbers) {
            this.serialNumbers = serialNumbers;
        }

        public List<Object> getBatchNumbers() {
            return batchNumbers;
        }

        public void setBatchNumbers(List<Object> batchNumbers) {
            this.batchNumbers = batchNumbers;
        }

        public List<Object> getDocumentLinesBinAllocations() {
            return documentLinesBinAllocations;
        }

        public void setDocumentLinesBinAllocations(List<Object> documentLinesBinAllocations) {
            this.documentLinesBinAllocations = documentLinesBinAllocations;
        }

    }


}