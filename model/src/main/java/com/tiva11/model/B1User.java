package com.tiva11.model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class B1User implements Serializable
{
    @SerializedName("InternalKey")
    @Expose
    private Integer internalKey;
    @SerializedName("UserPassword")
    @Expose
    private Object userPassword;
    @SerializedName("UserCode")
    @Expose
    private String userCode;
    @SerializedName("UserName")
    @Expose
    private String userName;
    @SerializedName("Superuser")
    @Expose
    private String superuser;
    @SerializedName("eMail")
    @Expose
    private String eMail;
    @SerializedName("MobilePhoneNumber")
    @Expose
    private Object mobilePhoneNumber;
    @SerializedName("Defaults")
    @Expose
    private Object defaults;
    @SerializedName("FaxNumber")
    @Expose
    private Object faxNumber;
    @SerializedName("Branch")
    @Expose
    private Integer branch;
    @SerializedName("Department")
    @Expose
    private Integer department;
    @SerializedName("LanguageCode")
    @Expose
    private Object languageCode;
    @SerializedName("Locked")
    @Expose
    private String locked;
    @SerializedName("Group")
    @Expose
    private String group;
    @SerializedName("MaxDiscountGeneral")
    @Expose
    private Double maxDiscountGeneral;
    @SerializedName("MaxDiscountSales")
    @Expose
    private Double maxDiscountSales;
    @SerializedName("MaxDiscountPurchase")
    @Expose
    private Double maxDiscountPurchase;
    @SerializedName("CashLimit")
    @Expose
    private String cashLimit;
    @SerializedName("MaxCashAmtForIncmngPayts")
    @Expose
    private Double maxCashAmtForIncmngPayts;
    @SerializedName("LastLogoutDate")
    @Expose
    private Object lastLogoutDate;
    @SerializedName("LastLoginTime")
    @Expose
    private Object lastLoginTime;
    @SerializedName("LastLogoutTime")
    @Expose
    private Object lastLogoutTime;
    @SerializedName("LastPasswordChangeTime")
    @Expose
    private Object lastPasswordChangeTime;
    @SerializedName("LastPasswordChangedBy")
    @Expose
    private Object lastPasswordChangedBy;
    @SerializedName("UserPermission")
    @Expose
    private List<UserPermission> userPermission = null;
    @SerializedName("UserActionRecord")
    @Expose
    private List<UserActionRecord> userActionRecord = null;
    @SerializedName("UserGroupByUser")
    @Expose
    private List<Object> userGroupByUser = null;
    @SerializedName("UserBranchAssignment")
    @Expose
    private List<Object> userBranchAssignment = null;
    private final static long serialVersionUID = 4580692822662983168L;

    public Integer getInternalKey() {
        return internalKey;
    }

    public void setInternalKey(Integer internalKey) {
        this.internalKey = internalKey;
    }

    public Object getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(Object userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSuperuser() {
        return superuser;
    }

    public void setSuperuser(String superuser) {
        this.superuser = superuser;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public Object getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(Object mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public Object getDefaults() {
        return defaults;
    }

    public void setDefaults(Object defaults) {
        this.defaults = defaults;
    }

    public Object getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(Object faxNumber) {
        this.faxNumber = faxNumber;
    }

    public Integer getBranch() {
        return branch;
    }

    public void setBranch(Integer branch) {
        this.branch = branch;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Object getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(Object languageCode) {
        this.languageCode = languageCode;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Double getMaxDiscountGeneral() {
        return maxDiscountGeneral;
    }

    public void setMaxDiscountGeneral(Double maxDiscountGeneral) {
        this.maxDiscountGeneral = maxDiscountGeneral;
    }

    public Double getMaxDiscountSales() {
        return maxDiscountSales;
    }

    public void setMaxDiscountSales(Double maxDiscountSales) {
        this.maxDiscountSales = maxDiscountSales;
    }

    public Double getMaxDiscountPurchase() {
        return maxDiscountPurchase;
    }

    public void setMaxDiscountPurchase(Double maxDiscountPurchase) {
        this.maxDiscountPurchase = maxDiscountPurchase;
    }

    public String getCashLimit() {
        return cashLimit;
    }

    public void setCashLimit(String cashLimit) {
        this.cashLimit = cashLimit;
    }

    public Double getMaxCashAmtForIncmngPayts() {
        return maxCashAmtForIncmngPayts;
    }

    public void setMaxCashAmtForIncmngPayts(Double maxCashAmtForIncmngPayts) {
        this.maxCashAmtForIncmngPayts = maxCashAmtForIncmngPayts;
    }

    public Object getLastLogoutDate() {
        return lastLogoutDate;
    }

    public void setLastLogoutDate(Object lastLogoutDate) {
        this.lastLogoutDate = lastLogoutDate;
    }

    public Object getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Object lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Object getLastLogoutTime() {
        return lastLogoutTime;
    }

    public void setLastLogoutTime(Object lastLogoutTime) {
        this.lastLogoutTime = lastLogoutTime;
    }

    public Object getLastPasswordChangeTime() {
        return lastPasswordChangeTime;
    }

    public void setLastPasswordChangeTime(Object lastPasswordChangeTime) {
        this.lastPasswordChangeTime = lastPasswordChangeTime;
    }

    public Object getLastPasswordChangedBy() {
        return lastPasswordChangedBy;
    }

    public void setLastPasswordChangedBy(Object lastPasswordChangedBy) {
        this.lastPasswordChangedBy = lastPasswordChangedBy;
    }

    public List<UserPermission> getUserPermission() {
        return userPermission;
    }

    public void setUserPermission(List<UserPermission> userPermission) {
        this.userPermission = userPermission;
    }

    public List<UserActionRecord> getUserActionRecord() {
        return userActionRecord;
    }

    public void setUserActionRecord(List<UserActionRecord> userActionRecord) {
        this.userActionRecord = userActionRecord;
    }

    public List<Object> getUserGroupByUser() {
        return userGroupByUser;
    }

    public void setUserGroupByUser(List<Object> userGroupByUser) {
        this.userGroupByUser = userGroupByUser;
    }

    public List<Object> getUserBranchAssignment() {
        return userBranchAssignment;
    }

    public void setUserBranchAssignment(List<Object> userBranchAssignment) {
        this.userBranchAssignment = userBranchAssignment;
    }
    public static class B1Users implements Serializable
    {

        @SerializedName("odata.metadata")
        @Expose
        private String odataMetadata;
        @SerializedName("value")
        @Expose
        private List<B1User> value = null;
        @SerializedName("odata.nextLink")
        @Expose
        private String odataNextLink;
        private final static long serialVersionUID = 1728966459373642506L;

        public String getOdataMetadata() {
            return odataMetadata;
        }

        public void setOdataMetadata(String odataMetadata) {
            this.odataMetadata = odataMetadata;
        }

        public List<B1User> getValue() {
            return value;
        }

        public void setValue(List<B1User> value) {
            this.value = value;
        }

        public String getOdataNextLink() {
            return odataNextLink;
        }

        public void setOdataNextLink(String odataNextLink) {
            this.odataNextLink = odataNextLink;
        }
    }
    public static class UserPermission implements Serializable
    {

        @SerializedName("UserCode")
        @Expose
        private Integer userCode;
        @SerializedName("PermissionID")
        @Expose
        private String permissionID;
        @SerializedName("Permission")
        @Expose
        private String permission;
        private final static long serialVersionUID = -3157364868335690604L;

        public Integer getUserCode() {
            return userCode;
        }

        public void setUserCode(Integer userCode) {
            this.userCode = userCode;
        }

        public String getPermissionID() {
            return permissionID;
        }

        public void setPermissionID(String permissionID) {
            this.permissionID = permissionID;
        }

        public String getPermission() {
            return permission;
        }

        public void setPermission(String permission) {
            this.permission = permission;
        }

    }
    public static class UserActionRecord implements Serializable
    {

        @SerializedName("UserCode")
        @Expose
        private String userCode;
        @SerializedName("Action")
        @Expose
        private String action;
        @SerializedName("ActionBy")
        @Expose
        private String actionBy;
        @SerializedName("ClientIP")
        @Expose
        private String clientIP;
        @SerializedName("ClientName")
        @Expose
        private String clientName;
        @SerializedName("ActionDate")
        @Expose
        private String actionDate;
        @SerializedName("ActionTime")
        @Expose
        private String actionTime;
        @SerializedName("WindowsSession")
        @Expose
        private Integer windowsSession;
        @SerializedName("WindowsUser")
        @Expose
        private String windowsUser;
        @SerializedName("ProcessName")
        @Expose
        private String processName;
        @SerializedName("ProcessID")
        @Expose
        private Integer processID;
        @SerializedName("AliveDuration")
        @Expose
        private Integer aliveDuration;
        private final static long serialVersionUID = 4560087799343726766L;

        public String getUserCode() {
            return userCode;
        }

        public void setUserCode(String userCode) {
            this.userCode = userCode;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public String getActionBy() {
            return actionBy;
        }

        public void setActionBy(String actionBy) {
            this.actionBy = actionBy;
        }

        public String getClientIP() {
            return clientIP;
        }

        public void setClientIP(String clientIP) {
            this.clientIP = clientIP;
        }

        public String getClientName() {
            return clientName;
        }

        public void setClientName(String clientName) {
            this.clientName = clientName;
        }

        public String getActionDate() {
            return actionDate;
        }

        public void setActionDate(String actionDate) {
            this.actionDate = actionDate;
        }

        public String getActionTime() {
            return actionTime;
        }

        public void setActionTime(String actionTime) {
            this.actionTime = actionTime;
        }

        public Integer getWindowsSession() {
            return windowsSession;
        }

        public void setWindowsSession(Integer windowsSession) {
            this.windowsSession = windowsSession;
        }

        public String getWindowsUser() {
            return windowsUser;
        }

        public void setWindowsUser(String windowsUser) {
            this.windowsUser = windowsUser;
        }

        public String getProcessName() {
            return processName;
        }

        public void setProcessName(String processName) {
            this.processName = processName;
        }

        public Integer getProcessID() {
            return processID;
        }

        public void setProcessID(Integer processID) {
            this.processID = processID;
        }

        public Integer getAliveDuration() {
            return aliveDuration;
        }

        public void setAliveDuration(Integer aliveDuration) {
            this.aliveDuration = aliveDuration;
        }

    }
}