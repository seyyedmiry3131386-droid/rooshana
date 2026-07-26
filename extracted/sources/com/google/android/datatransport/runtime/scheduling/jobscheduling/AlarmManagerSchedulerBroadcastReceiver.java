package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import defpackage.ad;
import defpackage.d30;
import defpackage.es8;
import defpackage.gk6;
import defpackage.up4;
import defpackage.v24;
import defpackage.wv8;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        es8.b(context);
        wv8 wv8VarA = d30.a();
        wv8VarA.L(queryParameter);
        wv8VarA.d = gk6.b(iIntValue);
        if (queryParameter2 != null) {
            wv8VarA.b = Base64.decode(queryParameter2, 0);
        }
        v24 v24Var = es8.a().d;
        ((Executor) v24Var.e).execute(new up4(v24Var, wv8VarA.l(), i, new ad(0)));
    }
}
