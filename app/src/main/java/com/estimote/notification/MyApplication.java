package com.estimote.notification;

import android.app.Application;

import com.estimote.notification.estimote.NotificationsManager;
import com.estimote.proximity_sdk.api.EstimoteCloudCredentials;

//
// Running into any issues? Drop us an email to: contact@estimote.com
//

public class MyApplication extends Application {

    public EstimoteCloudCredentials cloudCredentials = new EstimoteCloudCredentials("notification-beacon-1px", "2327dadadb5ea2b57774960d5de97dae");
    private NotificationsManager notificationsManager;

    public void enableBeaconNotifications() {
        notificationsManager = new NotificationsManager(this);
        notificationsManager.startMonitoring();
    }

}
