package com.tiva11.model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SmlInventoryStatusQuery implements Serializable {

    @SerializedName("@odata.context")
    @Expose
    private String odataContext;
    @SerializedName("value")
    @Expose
    private List<InventoryStatusRow> value = null;
    @SerializedName("@odata.nextLink")
    @Expose
    private String odataNextLink;
    private final static long serialVersionUID = 2496750685847871065L;

    public String getOdataContext() {
        return odataContext;
    }

    public void setOdataContext(String odataContext) {
        this.odataContext = odataContext;
    }

    public List<InventoryStatusRow> getValue() {
        return value;
    }

    public void setValue(List<InventoryStatusRow> value) {
        this.value = value;
    }

    public String getOdataNextLink() {
        return odataNextLink;
    }

    public void setOdataNextLink(String odataNextLink) {
        this.odataNextLink = odataNextLink;
    }
    public class InventoryStatusRow implements Serializable {

        @SerializedName("WarehouseMinimumItemQuantity")
        @Expose
        private Double warehouseMinimumItemQuantity;
        @SerializedName("WarehouseMaximumItemQuantity")
        @Expose
        private Double warehouseMaximumItemQuantity;
        @SerializedName("WarehouseRequiredItemQuantity")
        @Expose
        private Double warehouseRequiredItemQuantity;
        @SerializedName("ItemCode")
        @Expose
        private String itemCode;
        @SerializedName("ItemDescription")
        @Expose
        private String itemDescription;
        @SerializedName("ItemDescriptionAndCode")
        @Expose
        private String itemDescriptionAndCode;
        @SerializedName("ItemGroup")
        @Expose
        private String itemGroup;
        @SerializedName("ItemType")
        @Expose
        private String itemType;
        @SerializedName("InventoryValuationMethod")
        @Expose
        private String inventoryValuationMethod;
        @SerializedName("IsInventoryItem")
        @Expose
        private String isInventoryItem;
        @SerializedName("IsSalesItem")
        @Expose
        private String isSalesItem;
        @SerializedName("IsPurchaseItem")
        @Expose
        private String isPurchaseItem;
        @SerializedName("UoMGroup")
        @Expose
        private String uoMGroup;
        @SerializedName("ItemShippingType")
        @Expose
        private String itemShippingType;
        @SerializedName("ItemIsActive")
        @Expose
        private String itemIsActive;
        @SerializedName("InventoryUoMName")
        @Expose
        private String inventoryUoMName;
        @SerializedName("ItemManufacturer")
        @Expose
        private String itemManufacturer;
        @SerializedName("DefaultPreferredVendor")
        @Expose
        private String defaultPreferredVendor;
        @SerializedName("InventoryIsManagedByWarehouse")
        @Expose
        private String inventoryIsManagedByWarehouse;
        @SerializedName("CompanyRequiredItemQuantity")
        @Expose
        private Double companyRequiredItemQuantity;
        @SerializedName("CompanyMinimumItemQuantity")
        @Expose
        private Double companyMinimumItemQuantity;
        @SerializedName("CompanyMaximumItemQuantity")
        @Expose
        private Double companyMaximumItemQuantity;
        @SerializedName("WarehouseCode")
        @Expose
        private String warehouseCode;
        @SerializedName("WarehouseName")
        @Expose
        private String warehouseName;
        @SerializedName("WarehouseNameAndCode")
        @Expose
        private String warehouseNameAndCode;
        @SerializedName("WarehouseBranchCode")
        @Expose
        private Integer warehouseBranchCode;
        @SerializedName("WarehouseBranchName")
        @Expose
        private String warehouseBranchName;
        @SerializedName("WarehouseLocation")
        @Expose
        private String warehouseLocation;
        @SerializedName("WarehouseIsActive")
        @Expose
        private String warehouseIsActive;
        @SerializedName("IsDropShipWarehouse")
        @Expose
        private String isDropShipWarehouse;
        @SerializedName("IsNettableWarehouse")
        @Expose
        private String isNettableWarehouse;
        @SerializedName("WarehouseCountry")
        @Expose
        private String warehouseCountry;
        @SerializedName("FederalTaxID")
        @Expose
        private Object federalTaxID;
        @SerializedName("BinLocationIsEnabled")
        @Expose
        private String binLocationIsEnabled;
        @SerializedName("WarehouseDefaultBinLocation")
        @Expose
        private String warehouseDefaultBinLocation;
        @SerializedName("InStockQuantity")
        @Expose
        private Double inStockQuantity;
        @SerializedName("CommittedQuantity")
        @Expose
        private Double committedQuantity;
        @SerializedName("OrderedQuantity")
        @Expose
        private Double orderedQuantity;
        @SerializedName("InStockInventoryValueLC")
        @Expose
        private Double inStockInventoryValueLC;
        @SerializedName("AvailableQuantity")
        @Expose
        private Double availableQuantity;
        @SerializedName("id__")
        @Expose
        private Integer id;
        private final static long serialVersionUID = 483217009141305258L;

        public Double getWarehouseMinimumItemQuantity() {
            return warehouseMinimumItemQuantity;
        }

        public void setWarehouseMinimumItemQuantity(Double warehouseMinimumItemQuantity) {
            this.warehouseMinimumItemQuantity = warehouseMinimumItemQuantity;
        }

        public Double getWarehouseMaximumItemQuantity() {
            return warehouseMaximumItemQuantity;
        }

        public void setWarehouseMaximumItemQuantity(Double warehouseMaximumItemQuantity) {
            this.warehouseMaximumItemQuantity = warehouseMaximumItemQuantity;
        }

        public Double getWarehouseRequiredItemQuantity() {
            return warehouseRequiredItemQuantity;
        }

        public void setWarehouseRequiredItemQuantity(Double warehouseRequiredItemQuantity) {
            this.warehouseRequiredItemQuantity = warehouseRequiredItemQuantity;
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

        public String getItemDescriptionAndCode() {
            return itemDescriptionAndCode;
        }

        public void setItemDescriptionAndCode(String itemDescriptionAndCode) {
            this.itemDescriptionAndCode = itemDescriptionAndCode;
        }

        public String getItemGroup() {
            return itemGroup;
        }

        public void setItemGroup(String itemGroup) {
            this.itemGroup = itemGroup;
        }

        public String getItemType() {
            return itemType;
        }

        public void setItemType(String itemType) {
            this.itemType = itemType;
        }

        public String getInventoryValuationMethod() {
            return inventoryValuationMethod;
        }

        public void setInventoryValuationMethod(String inventoryValuationMethod) {
            this.inventoryValuationMethod = inventoryValuationMethod;
        }

        public String getIsInventoryItem() {
            return isInventoryItem;
        }

        public void setIsInventoryItem(String isInventoryItem) {
            this.isInventoryItem = isInventoryItem;
        }

        public String getIsSalesItem() {
            return isSalesItem;
        }

        public void setIsSalesItem(String isSalesItem) {
            this.isSalesItem = isSalesItem;
        }

        public String getIsPurchaseItem() {
            return isPurchaseItem;
        }

        public void setIsPurchaseItem(String isPurchaseItem) {
            this.isPurchaseItem = isPurchaseItem;
        }

        public String getUoMGroup() {
            return uoMGroup;
        }

        public void setUoMGroup(String uoMGroup) {
            this.uoMGroup = uoMGroup;
        }

        public String getItemShippingType() {
            return itemShippingType;
        }

        public void setItemShippingType(String itemShippingType) {
            this.itemShippingType = itemShippingType;
        }

        public String getItemIsActive() {
            return itemIsActive;
        }

        public void setItemIsActive(String itemIsActive) {
            this.itemIsActive = itemIsActive;
        }

        public String getInventoryUoMName() {
            return inventoryUoMName;
        }

        public void setInventoryUoMName(String inventoryUoMName) {
            this.inventoryUoMName = inventoryUoMName;
        }

        public String getItemManufacturer() {
            return itemManufacturer;
        }

        public void setItemManufacturer(String itemManufacturer) {
            this.itemManufacturer = itemManufacturer;
        }

        public String getDefaultPreferredVendor() {
            return defaultPreferredVendor;
        }

        public void setDefaultPreferredVendor(String defaultPreferredVendor) {
            this.defaultPreferredVendor = defaultPreferredVendor;
        }

        public String getInventoryIsManagedByWarehouse() {
            return inventoryIsManagedByWarehouse;
        }

        public void setInventoryIsManagedByWarehouse(String inventoryIsManagedByWarehouse) {
            this.inventoryIsManagedByWarehouse = inventoryIsManagedByWarehouse;
        }

        public Double getCompanyRequiredItemQuantity() {
            return companyRequiredItemQuantity;
        }

        public void setCompanyRequiredItemQuantity(Double companyRequiredItemQuantity) {
            this.companyRequiredItemQuantity = companyRequiredItemQuantity;
        }

        public Double getCompanyMinimumItemQuantity() {
            return companyMinimumItemQuantity;
        }

        public void setCompanyMinimumItemQuantity(Double companyMinimumItemQuantity) {
            this.companyMinimumItemQuantity = companyMinimumItemQuantity;
        }

        public Double getCompanyMaximumItemQuantity() {
            return companyMaximumItemQuantity;
        }

        public void setCompanyMaximumItemQuantity(Double companyMaximumItemQuantity) {
            this.companyMaximumItemQuantity = companyMaximumItemQuantity;
        }

        public String getWarehouseCode() {
            return warehouseCode;
        }

        public void setWarehouseCode(String warehouseCode) {
            this.warehouseCode = warehouseCode;
        }

        public String getWarehouseName() {
            return warehouseName;
        }

        public void setWarehouseName(String warehouseName) {
            this.warehouseName = warehouseName;
        }

        public String getWarehouseNameAndCode() {
            return warehouseNameAndCode;
        }

        public void setWarehouseNameAndCode(String warehouseNameAndCode) {
            this.warehouseNameAndCode = warehouseNameAndCode;
        }

        public Integer getWarehouseBranchCode() {
            return warehouseBranchCode;
        }

        public void setWarehouseBranchCode(Integer warehouseBranchCode) {
            this.warehouseBranchCode = warehouseBranchCode;
        }

        public String getWarehouseBranchName() {
            return warehouseBranchName;
        }

        public void setWarehouseBranchName(String warehouseBranchName) {
            this.warehouseBranchName = warehouseBranchName;
        }

        public String getWarehouseLocation() {
            return warehouseLocation;
        }

        public void setWarehouseLocation(String warehouseLocation) {
            this.warehouseLocation = warehouseLocation;
        }

        public String getWarehouseIsActive() {
            return warehouseIsActive;
        }

        public void setWarehouseIsActive(String warehouseIsActive) {
            this.warehouseIsActive = warehouseIsActive;
        }

        public String getIsDropShipWarehouse() {
            return isDropShipWarehouse;
        }

        public void setIsDropShipWarehouse(String isDropShipWarehouse) {
            this.isDropShipWarehouse = isDropShipWarehouse;
        }

        public String getIsNettableWarehouse() {
            return isNettableWarehouse;
        }

        public void setIsNettableWarehouse(String isNettableWarehouse) {
            this.isNettableWarehouse = isNettableWarehouse;
        }

        public String getWarehouseCountry() {
            return warehouseCountry;
        }

        public void setWarehouseCountry(String warehouseCountry) {
            this.warehouseCountry = warehouseCountry;
        }

        public Object getFederalTaxID() {
            return federalTaxID;
        }

        public void setFederalTaxID(Object federalTaxID) {
            this.federalTaxID = federalTaxID;
        }

        public String getBinLocationIsEnabled() {
            return binLocationIsEnabled;
        }

        public void setBinLocationIsEnabled(String binLocationIsEnabled) {
            this.binLocationIsEnabled = binLocationIsEnabled;
        }

        public String getWarehouseDefaultBinLocation() {
            return warehouseDefaultBinLocation;
        }

        public void setWarehouseDefaultBinLocation(String warehouseDefaultBinLocation) {
            this.warehouseDefaultBinLocation = warehouseDefaultBinLocation;
        }

        public Double getInStockQuantity() {
            return inStockQuantity;
        }

        public void setInStockQuantity(Double inStockQuantity) {
            this.inStockQuantity = inStockQuantity;
        }

        public Double getCommittedQuantity() {
            return committedQuantity;
        }

        public void setCommittedQuantity(Double committedQuantity) {
            this.committedQuantity = committedQuantity;
        }

        public Double getOrderedQuantity() {
            return orderedQuantity;
        }

        public void setOrderedQuantity(Double orderedQuantity) {
            this.orderedQuantity = orderedQuantity;
        }

        public Double getInStockInventoryValueLC() {
            return inStockInventoryValueLC;
        }

        public void setInStockInventoryValueLC(Double inStockInventoryValueLC) {
            this.inStockInventoryValueLC = inStockInventoryValueLC;
        }

        public Double getAvailableQuantity() {
            return availableQuantity;
        }

        public void setAvailableQuantity(Double availableQuantity) {
            this.availableQuantity = availableQuantity;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

    }
}