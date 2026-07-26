package ir.mservices.market.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import defpackage.t32;
import defpackage.uz7;

/* JADX INFO: loaded from: classes3.dex */
public class SmsRetrieverReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        Status status;
        if (!"com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction()) || (extras = intent.getExtras()) == null || (status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")) == null || status.a != 0) {
            return;
        }
        String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
        t32 t32VarB = t32.b();
        uz7 uz7Var = new uz7();
        uz7Var.a = str;
        t32VarB.j(uz7Var);
    }
}
