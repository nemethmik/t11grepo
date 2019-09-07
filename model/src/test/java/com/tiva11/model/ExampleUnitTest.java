package com.tiva11.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void parsingjsonfile_activities() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("activities_list.json"));
            B1Activity.B1Activities activities = gson.fromJson(br, B1Activity.B1Activities.class);
            if (activities != null) {
                assertNotNull(activities);
                System.out.println("Number of activities "+ activities.getValue().size());
                assertTrue("Empty array",activities.getValue().size() > 0);
                for (B1Activity a : activities.getValue()) {
                    System.out.println("Code " + a.getActivityCode() + " - " + a.getDetails() + " Start Date " + a.getStartDate());
                    assertTrue("Activity Code is not greater than 0",a.getActivityCode() > 0);
                    assertTrue("Start Date in null",a.getStartDate() != null);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void parsingjsonfile_singleactivity() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("activity_1.json"));
            B1Activity a = gson.fromJson(br, B1Activity.class);
            if (a != null) {
                assertNotNull(a);
                System.out.println("Code " + a.getActivityCode() + " - " + a.getDetails() + " Start Date " + a.getStartDate());
                assertTrue("Activity Code is not greater than 0",a.getActivityCode() > 0);
                assertTrue("Start Date in null",a.getStartDate() != null);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void parsingjsonfile_error306() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("error306failtogetdbcredentials.json"));
            String jsonString = br.lines().collect(Collectors.joining());
            B1Activity.B1Activities activities = gson.fromJson(jsonString, B1Activity.B1Activities.class);
            assertNull(activities.getValue());
            B1Error error = gson.fromJson(jsonString,B1Error.class);
            assertNotNull(error.getError());
            System.out.println(error.getError().getMessage().getValue());
            assertEquals(error.getError().getCode(),-306);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void parsingjsonfile_error2028() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("error2028nomatchingrecordsfound.json"));
            String jsonString = br.lines().collect(Collectors.joining());
            B1Activity a = gson.fromJson(jsonString, B1Activity.class);
            assertNull(a.getActivity());
            B1Error error = gson.fromJson(jsonString,B1Error.class);
            assertNotNull(error.getError());
            System.out.println(error.getError().getMessage().getValue());
            assertEquals(error.getError().getCode(),-2028);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void parsingjsonfile_loginresponse() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("login_response.json"));
            String jsonString = br.lines().collect(Collectors.joining());
            B1Session s = gson.fromJson(jsonString, B1Session.class);
            assertNotNull(s.getSessionId());
            System.out.println(s.getSessionTimeout());
            assertTrue(s.getSessionTimeout() > 0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void parsingjsonfile_businessplaces() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("businessplaces.json"));
            B1BusinessPlace.B1BusinessPlaces businessPlaces = gson.fromJson(br, B1BusinessPlace.B1BusinessPlaces.class);
            if (businessPlaces != null) {
                assertNotNull(businessPlaces);
                System.out.println("Number of branches "+ businessPlaces.getValue().size());
                assertTrue("Empty array",businessPlaces.getValue().size() > 0);
                for (B1BusinessPlace bp : businessPlaces.getValue()) {
                    System.out.println("Code " + bp.getBPLID() + " - " + bp.getBPLName() + " Incoportation Date " + bp.getDateOfIncorporation());
                    assertTrue("BPL Code is not greater than 0",bp.getBPLID() > 0);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void parsingjsonfile_user_manager() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("user_manager.json"));
            B1User.B1Users users = gson.fromJson(br, B1User.B1Users.class);
            if (users != null) {
                assertNotNull(users);
                System.out.println("Number of users "+ users.getValue().size());
                assertTrue("Empty array",users.getValue().size() > 0);
                for (B1User u : users.getValue()) {
                    //There is no Last Login Date :(
                    System.out.println("Code " + u.getUserCode() + " - " + u.getUserName() + " Last Login Time " + u.getLastLoginTime());
                    assertTrue("User Code is not manager", "manager".equals(u.getUserCode()));
                    assertTrue("Has UserActionRecords",u.getUserActionRecord().size() > 0);
                    B1User.UserActionRecord uar = u.getUserActionRecord().get(u.getUserActionRecord().size() - 1);
                    System.out.println("Last action " + uar.getAction() + " on " + uar.getActionDate());
                    uar = null;
                    for(B1User.UserActionRecord r:u.getUserActionRecord()) {
                        if(r.getAction().equals("actionLogin")) {
                            uar = r;//last login
                        }
                    }
                    System.out.println("Last login date " + uar.getAction() + " on " + uar.getActionDate());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void parsingjsonfile_purchaseorders_allopen() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("purchaseorders_allopen1000.json"));
            B1Document.B1Documents pos = gson.fromJson(br, B1Document.B1Documents.class);
            if (pos != null) {
                assertNotNull(pos);
                System.out.println("Number of POs "+ pos.getValue().size());
                assertTrue("Empty array",pos.getValue().size() > 0);
                for (B1Document document : pos.getValue()) {
                    System.out.println("Code " + document.getDocNum() + " - " + document.getCardName() + " Date " + document.getDocDueDate());
                    assertTrue("DocNum is not greater than 0",document.getDocNum() > 0);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}