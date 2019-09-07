package com.tiva11.b1s;

import com.tiva11.b1s.demo.B1ServiceLayerDemoImpl;

/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */
public class B1ServiceLocator {
    private static B1ServiceLayerIntf b1ServiceLayer = new B1ServiceLayerImpl();
    public static B1ServiceLayerIntf getB1ServiceLayer(boolean useDemo) {
        if (b1ServiceLayer == null) {
            if (useDemo) {
                b1ServiceLayer = new B1ServiceLayerDemoImpl();
            } else {
                b1ServiceLayer = new B1ServiceLayerImpl();
            }
        }
        return b1ServiceLayer;
    }
}
