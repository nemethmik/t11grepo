# GrePo
A Goods Receipt PO module of a mobile warehousing application for Android

This is the 1st module in a series. It is a serverless application built
upon SAP Business One (B1) Service Layer (SL). Fundamentally the
application is building the JSON text for SL Goods Receipt PO
transactions. While the user is composing the document it is saved on
the device as JSON text files. When the document is complete, the user
presses a post button, and the document is posted to B1. The user can
have any number of non-posted, local-only documents. 

## Development Tools
This is a native Android application written in Java with Android
Architecture Components including navigation, data binding, live data,
MVVM. Gson is used for JSON parsing, and Volley as HTTP communication.

## Steps to Initialize the Project
The project was created with Android Studion 3.4.2 with the empty
activity template and AndroidX artifacts.
- In the Project Structure screen search for 
    - androidx.navigation:navigation-fragment
    - androidx.navigation:navigation-ui
    - android.arch.lifecycle:extensions
- Add `classpath
  "androidx.navigation:navigation-safe-args-gradle-plugin:2.2.0-alpha01"`
  to the buildscripts/dependencies section in the project build.gradle
- Add `apply plugin: "androidx.navigation.safeargs"` and
  `dataBinding.enabled = true` to the android section in the app
  build.gradle 
- Create a nav_graph Navigation resource 
- Open activity_main.xml in the layout designer, delete the text view,
  and add NavHostFragment from the containers palette with an id
  nav_host_fragment.
  
