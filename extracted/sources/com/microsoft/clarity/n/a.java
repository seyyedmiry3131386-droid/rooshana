package com.microsoft.clarity.n;

import android.content.Context;
import android.content.SharedPreferences;
import com.microsoft.clarity.models.ConsentSource;
import com.microsoft.clarity.models.ConsentStatus;
import com.microsoft.clarity.models.DynamicConfig;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final ConsentSource c = ConsentSource.Implicit;
    public final DynamicConfig a;
    public final SharedPreferences b;

    public a(Context context, DynamicConfig dynamicConfig) {
        js3.p(context, "context");
        js3.p(dynamicConfig, "dynamicConfig");
        this.a = dynamicConfig;
        this.b = context.getSharedPreferences("CLARITY_SHARED_PREFERENCES", 0);
    }

    public final void a(ConsentStatus consentStatus) {
        js3.p(consentStatus, "consentStatus");
        SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.putInt("CONSENT_STATUS_SOURCE", consentStatus.getSource().ordinal());
        editorEdit.putBoolean("EXPLICIT_CONSENT_ADS", consentStatus.getAdsStorage());
        editorEdit.putBoolean("EXPLICIT_CONSENT_ANALYTICS", consentStatus.getAnalyticsStorage());
        editorEdit.apply();
    }
}
