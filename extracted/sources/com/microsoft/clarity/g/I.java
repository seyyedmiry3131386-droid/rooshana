package com.microsoft.clarity.g;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.installreferrer.api.InstallReferrerClient;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class I {
    public final b0 a;
    public final h0 b;
    public final SharedPreferences c;
    public final InstallReferrerClient d;

    public I(Context context, b0 b0Var, h0 h0Var) {
        js3.p(context, "context");
        js3.p(b0Var, "taskExecutor");
        js3.p(h0Var, "telemetryTracker");
        this.a = b0Var;
        this.b = h0Var;
        this.c = context.getSharedPreferences("CLARITY_SHARED_PREFERENCES", 0);
        this.d = InstallReferrerClient.newBuilder(context).build();
    }
}
