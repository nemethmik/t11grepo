package com.tiva11.b1s;

/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */
public class Repository {
    private static volatile Repository instance;
    private ILoginDS dataSource = new LoginDataSource();
    public static Repository getInstance() {
        if (instance == null) {
            instance = new Repository();
        }
        return instance;
    }
    public ILoginDS getLoginDS() {return dataSource;}
}
