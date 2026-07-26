package com.microsoft.clarity.o;

import android.content.Context;
import com.microsoft.clarity.models.DynamicConfig;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public final String a;

    public i(Context context) {
        js3.p(context, "context");
        DynamicConfig dynamicConfigA = com.microsoft.clarity.b.a.a(context);
        this.a = dynamicConfigA != null ? dynamicConfigA.getReportUrl() : null;
    }
}
