package com.microsoft.clarity.g;

import android.content.SharedPreferences;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class H implements InstallReferrerStateListener {
    public final InstallReferrerClient a;
    public final SharedPreferences b;
    public final com.microsoft.clarity.i.G c;
    public final b0 d;
    public final h0 e;

    public H(InstallReferrerClient installReferrerClient, SharedPreferences sharedPreferences, com.microsoft.clarity.i.G g, b0 b0Var, h0 h0Var) {
        js3.p(installReferrerClient, "referrerClient");
        js3.p(sharedPreferences, "preferences");
        js3.p(g, "callback");
        js3.p(b0Var, "taskExecutor");
        js3.p(h0Var, "telemetryTracker");
        this.a = installReferrerClient;
        this.b = sharedPreferences;
        this.c = g;
        this.d = b0Var;
        this.e = h0Var;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i) {
        b0.a(this.d, new F(i, this), new G(this), 4);
    }
}
