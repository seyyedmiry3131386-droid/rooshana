package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import defpackage.do3;
import defpackage.wn5;
import defpackage.z67;
import io.sentry.android.core.t0;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    private static final String TAG = "FirebaseMessaging";

    private static Intent createServiceIntent(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public int onMessageReceive(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) z67.a(new do3(context, 2).z(cloudMessage.a))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            t0.e(TAG, "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public void onNotificationDismissed(Context context, Bundle bundle) {
        Intent intentCreateServiceIntent = createServiceIntent(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (wn5.b0(intentCreateServiceIntent)) {
            wn5.T(intentCreateServiceIntent.getExtras(), "_nd");
        }
    }
}
