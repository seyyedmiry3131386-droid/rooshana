package com.microsoft.clarity.q;

import android.app.ActivityManager;
import android.content.Context;
import defpackage.js3;
import defpackage.ok4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static final Runtime a;

    static {
        Runtime runtime = Runtime.getRuntime();
        js3.o(runtime, "getRuntime()");
        a = runtime;
    }

    public static int a(Context context) {
        js3.p(context, "context");
        Object systemService = context.getSystemService("activity");
        js3.n(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ((ActivityManager) systemService).getMemoryInfo(new ActivityManager.MemoryInfo());
        return Math.max(ok4.T(r0.totalMem / 1.0E9d), 1);
    }
}
