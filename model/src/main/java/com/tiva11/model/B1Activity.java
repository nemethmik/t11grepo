package com.tiva11.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class B1Activity implements Serializable
{

    @SerializedName("ActivityCode")
    @Expose
    private int activityCode;
    @SerializedName("CardCode")
    @Expose
    private String cardCode;
    @SerializedName("Notes")
    @Expose
    private Object notes;
    @SerializedName("ActivityDate")
    @Expose
    private String activityDate;
    @SerializedName("ActivityTime")
    @Expose
    private String activityTime;
    @SerializedName("StartDate")
    @Expose
    private Date startDate;
    @SerializedName("Closed")
    @Expose
    private String closed;
    @SerializedName("CloseDate")
    @Expose
    private Object closeDate;
    @SerializedName("Phone")
    @Expose
    private Object phone;
    @SerializedName("Fax")
    @Expose
    private Object fax;
    @SerializedName("Subject")
    @Expose
    private int subject;
    @SerializedName("DocType")
    @Expose
    private String docType;
    @SerializedName("DocNum")
    @Expose
    private String docNum;
    @SerializedName("DocEntry")
    @Expose
    private String docEntry;
    @SerializedName("Priority")
    @Expose
    private String priority;
    @SerializedName("Details")
    @Expose
    private String details;
    @SerializedName("Activity")
    @Expose
    private String activity;
    @SerializedName("ActivityType")
    @Expose
    private int activityType;
    @SerializedName("Location")
    @Expose
    private int location;
    @SerializedName("StartTime")
    @Expose
    private String startTime;
    @SerializedName("EndTime")
    @Expose
    private String endTime;
    @SerializedName("Duration")
    @Expose
    private double duration;
    @SerializedName("DurationType")
    @Expose
    private String durationType;
    @SerializedName("SalesEmployee")
    @Expose
    private int salesEmployee;
    @SerializedName("ContactPersonCode")
    @Expose
    private Object contactPersonCode;
    @SerializedName("HandledBy")
    @Expose
    private int handledBy;
    @SerializedName("Reminder")
    @Expose
    private String reminder;
    @SerializedName("ReminderPeriod")
    @Expose
    private double reminderPeriod;
    @SerializedName("ReminderType")
    @Expose
    private String reminderType;
    @SerializedName("City")
    @Expose
    private Object city;
    @SerializedName("PersonalFlag")
    @Expose
    private String personalFlag;
    @SerializedName("Street")
    @Expose
    private Object street;
    @SerializedName("ParentObjectId")
    @Expose
    private Object parentObjectId;
    @SerializedName("ParentObjectType")
    @Expose
    private Object parentObjectType;
    @SerializedName("Room")
    @Expose
    private Object room;
    @SerializedName("InactiveFlag")
    @Expose
    private String inactiveFlag;
    @SerializedName("State")
    @Expose
    private Object state;
    @SerializedName("PreviousActivity")
    @Expose
    private Object previousActivity;
    @SerializedName("Country")
    @Expose
    private Object country;
    @SerializedName("Status")
    @Expose
    private int status;
    @SerializedName("TentativeFlag")
    @Expose
    private String tentativeFlag;
    @SerializedName("EndDueDate")
    @Expose
    private String endDueDate;
    @SerializedName("DocTypeEx")
    @Expose
    private String docTypeEx;
    @SerializedName("AttachmentEntry")
    @Expose
    private Object attachmentEntry;
    @SerializedName("RecurrencePattern")
    @Expose
    private String recurrencePattern;
    @SerializedName("EndType")
    @Expose
    private String endType;
    @SerializedName("SeriesStartDate")
    @Expose
    private String seriesStartDate;
    @SerializedName("SeriesEndDate")
    @Expose
    private Object seriesEndDate;
    @SerializedName("MaxOccurrence")
    @Expose
    private Object maxOccurrence;
    @SerializedName("Interval")
    @Expose
    private int interval;
    @SerializedName("Sunday")
    @Expose
    private String sunday;
    @SerializedName("Monday")
    @Expose
    private String monday;
    @SerializedName("Tuesday")
    @Expose
    private String tuesday;
    @SerializedName("Wednesday")
    @Expose
    private String wednesday;
    @SerializedName("Thursday")
    @Expose
    private String thursday;
    @SerializedName("Friday")
    @Expose
    private String friday;
    @SerializedName("Saturday")
    @Expose
    private String saturday;
    @SerializedName("RepeatOption")
    @Expose
    private String repeatOption;
    @SerializedName("BelongedSeriesNum")
    @Expose
    private Object belongedSeriesNum;
    @SerializedName("IsRemoved")
    @Expose
    private String isRemoved;
    @SerializedName("AddressName")
    @Expose
    private Object addressName;
    @SerializedName("AddressType")
    @Expose
    private String addressType;
    @SerializedName("HandledByEmployee")
    @Expose
    private Object handledByEmployee;
    @SerializedName("RecurrenceSequenceSpecifier")
    @Expose
    private Object recurrenceSequenceSpecifier;
    @SerializedName("RecurrenceDayInMonth")
    @Expose
    private Object recurrenceDayInMonth;
    @SerializedName("RecurrenceMonth")
    @Expose
    private Object recurrenceMonth;
    @SerializedName("RecurrenceDayOfWeek")
    @Expose
    private Object recurrenceDayOfWeek;
    @SerializedName("SalesOpportunityId")
    @Expose
    private Object salesOpportunityId;
    @SerializedName("SalesOpportunityLine")
    @Expose
    private Object salesOpportunityLine;
    @SerializedName("HandledByRecipientList")
    @Expose
    private Object handledByRecipientList;
    @SerializedName("CheckInListParams")
    @Expose
    private List<Object> checkInListParams = null;
    private final static long serialVersionUID = -3851659992613038886L;

    public int getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(int activityCode) {
        this.activityCode = activityCode;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public Object getNotes() {
        return notes;
    }

    public void setNotes(Object notes) {
        this.notes = notes;
    }

    public String getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(String activityDate) {
        this.activityDate = activityDate;
    }

    public String getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(String activityTime) {
        this.activityTime = activityTime;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getClosed() {
        return closed;
    }

    public void setClosed(String closed) {
        this.closed = closed;
    }

    public Object getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Object closeDate) {
        this.closeDate = closeDate;
    }

    public Object getPhone() {
        return phone;
    }

    public void setPhone(Object phone) {
        this.phone = phone;
    }

    public Object getFax() {
        return fax;
    }

    public void setFax(Object fax) {
        this.fax = fax;
    }

    public int getSubject() {
        return subject;
    }

    public void setSubject(int subject) {
        this.subject = subject;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getDocNum() {
        return docNum;
    }

    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }

    public String getDocEntry() {
        return docEntry;
    }

    public void setDocEntry(String docEntry) {
        this.docEntry = docEntry;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getActivityType() {
        return activityType;
    }

    public void setActivityType(int activityType) {
        this.activityType = activityType;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getDurationType() {
        return durationType;
    }

    public void setDurationType(String durationType) {
        this.durationType = durationType;
    }

    public int getSalesEmployee() {
        return salesEmployee;
    }

    public void setSalesEmployee(int salesEmployee) {
        this.salesEmployee = salesEmployee;
    }

    public Object getContactPersonCode() {
        return contactPersonCode;
    }

    public void setContactPersonCode(Object contactPersonCode) {
        this.contactPersonCode = contactPersonCode;
    }

    public int getHandledBy() {
        return handledBy;
    }

    public void setHandledBy(int handledBy) {
        this.handledBy = handledBy;
    }

    public String getReminder() {
        return reminder;
    }

    public void setReminder(String reminder) {
        this.reminder = reminder;
    }

    public double getReminderPeriod() {
        return reminderPeriod;
    }

    public void setReminderPeriod(double reminderPeriod) {
        this.reminderPeriod = reminderPeriod;
    }

    public String getReminderType() {
        return reminderType;
    }

    public void setReminderType(String reminderType) {
        this.reminderType = reminderType;
    }

    public Object getCity() {
        return city;
    }

    public void setCity(Object city) {
        this.city = city;
    }

    public String getPersonalFlag() {
        return personalFlag;
    }

    public void setPersonalFlag(String personalFlag) {
        this.personalFlag = personalFlag;
    }

    public Object getStreet() {
        return street;
    }

    public void setStreet(Object street) {
        this.street = street;
    }

    public Object getParentObjectId() {
        return parentObjectId;
    }

    public void setParentObjectId(Object parentObjectId) {
        this.parentObjectId = parentObjectId;
    }

    public Object getParentObjectType() {
        return parentObjectType;
    }

    public void setParentObjectType(Object parentObjectType) {
        this.parentObjectType = parentObjectType;
    }

    public Object getRoom() {
        return room;
    }

    public void setRoom(Object room) {
        this.room = room;
    }

    public String getInactiveFlag() {
        return inactiveFlag;
    }

    public void setInactiveFlag(String inactiveFlag) {
        this.inactiveFlag = inactiveFlag;
    }

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public Object getPreviousActivity() {
        return previousActivity;
    }

    public void setPreviousActivity(Object previousActivity) {
        this.previousActivity = previousActivity;
    }

    public Object getCountry() {
        return country;
    }

    public void setCountry(Object country) {
        this.country = country;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTentativeFlag() {
        return tentativeFlag;
    }

    public void setTentativeFlag(String tentativeFlag) {
        this.tentativeFlag = tentativeFlag;
    }

    public String getEndDueDate() {
        return endDueDate;
    }

    public void setEndDueDate(String endDueDate) {
        this.endDueDate = endDueDate;
    }

    public String getDocTypeEx() {
        return docTypeEx;
    }

    public void setDocTypeEx(String docTypeEx) {
        this.docTypeEx = docTypeEx;
    }

    public Object getAttachmentEntry() {
        return attachmentEntry;
    }

    public void setAttachmentEntry(Object attachmentEntry) {
        this.attachmentEntry = attachmentEntry;
    }

    public String getRecurrencePattern() {
        return recurrencePattern;
    }

    public void setRecurrencePattern(String recurrencePattern) {
        this.recurrencePattern = recurrencePattern;
    }

    public String getEndType() {
        return endType;
    }

    public void setEndType(String endType) {
        this.endType = endType;
    }

    public String getSeriesStartDate() {
        return seriesStartDate;
    }

    public void setSeriesStartDate(String seriesStartDate) {
        this.seriesStartDate = seriesStartDate;
    }

    public Object getSeriesEndDate() {
        return seriesEndDate;
    }

    public void setSeriesEndDate(Object seriesEndDate) {
        this.seriesEndDate = seriesEndDate;
    }

    public Object getMaxOccurrence() {
        return maxOccurrence;
    }

    public void setMaxOccurrence(Object maxOccurrence) {
        this.maxOccurrence = maxOccurrence;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public String getSunday() {
        return sunday;
    }

    public void setSunday(String sunday) {
        this.sunday = sunday;
    }

    public String getMonday() {
        return monday;
    }

    public void setMonday(String monday) {
        this.monday = monday;
    }

    public String getTuesday() {
        return tuesday;
    }

    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }

    public String getWednesday() {
        return wednesday;
    }

    public void setWednesday(String wednesday) {
        this.wednesday = wednesday;
    }

    public String getThursday() {
        return thursday;
    }

    public void setThursday(String thursday) {
        this.thursday = thursday;
    }

    public String getFriday() {
        return friday;
    }

    public void setFriday(String friday) {
        this.friday = friday;
    }

    public String getSaturday() {
        return saturday;
    }

    public void setSaturday(String saturday) {
        this.saturday = saturday;
    }

    public String getRepeatOption() {
        return repeatOption;
    }

    public void setRepeatOption(String repeatOption) {
        this.repeatOption = repeatOption;
    }

    public Object getBelongedSeriesNum() {
        return belongedSeriesNum;
    }

    public void setBelongedSeriesNum(Object belongedSeriesNum) {
        this.belongedSeriesNum = belongedSeriesNum;
    }

    public String getIsRemoved() {
        return isRemoved;
    }

    public void setIsRemoved(String isRemoved) {
        this.isRemoved = isRemoved;
    }

    public Object getAddressName() {
        return addressName;
    }

    public void setAddressName(Object addressName) {
        this.addressName = addressName;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public Object getHandledByEmployee() {
        return handledByEmployee;
    }

    public void setHandledByEmployee(Object handledByEmployee) {
        this.handledByEmployee = handledByEmployee;
    }

    public Object getRecurrenceSequenceSpecifier() {
        return recurrenceSequenceSpecifier;
    }

    public void setRecurrenceSequenceSpecifier(Object recurrenceSequenceSpecifier) {
        this.recurrenceSequenceSpecifier = recurrenceSequenceSpecifier;
    }

    public Object getRecurrenceDayInMonth() {
        return recurrenceDayInMonth;
    }

    public void setRecurrenceDayInMonth(Object recurrenceDayInMonth) {
        this.recurrenceDayInMonth = recurrenceDayInMonth;
    }

    public Object getRecurrenceMonth() {
        return recurrenceMonth;
    }

    public void setRecurrenceMonth(Object recurrenceMonth) {
        this.recurrenceMonth = recurrenceMonth;
    }

    public Object getRecurrenceDayOfWeek() {
        return recurrenceDayOfWeek;
    }

    public void setRecurrenceDayOfWeek(Object recurrenceDayOfWeek) {
        this.recurrenceDayOfWeek = recurrenceDayOfWeek;
    }

    public Object getSalesOpportunityId() {
        return salesOpportunityId;
    }

    public void setSalesOpportunityId(Object salesOpportunityId) {
        this.salesOpportunityId = salesOpportunityId;
    }

    public Object getSalesOpportunityLine() {
        return salesOpportunityLine;
    }

    public void setSalesOpportunityLine(Object salesOpportunityLine) {
        this.salesOpportunityLine = salesOpportunityLine;
    }

    public Object getHandledByRecipientList() {
        return handledByRecipientList;
    }

    public void setHandledByRecipientList(Object handledByRecipientList) {
        this.handledByRecipientList = handledByRecipientList;
    }

    public List<Object> getCheckInListParams() {
        return checkInListParams;
    }

    public void setCheckInListParams(List<Object> checkInListParams) {
        this.checkInListParams = checkInListParams;
    }

}
