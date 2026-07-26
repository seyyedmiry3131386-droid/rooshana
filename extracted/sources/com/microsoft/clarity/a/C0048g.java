package com.microsoft.clarity.a;

import android.app.Activity;
import android.content.Context;
import com.microsoft.clarity.ClarityConfig;
import defpackage.bp2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.microsoft.clarity.a.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0048g extends Lambda implements bp2 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ClarityConfig b;
    public final /* synthetic */ Activity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0048g(Activity activity2, Context context, ClarityConfig clarityConfig) {
        super(0);
        this.a = context;
        this.b = clarityConfig;
        this.c = activity2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    @Override // defpackage.bp2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke() {
        /*
            r4 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = defpackage.js3.i(r0, r1)
            if (r0 != 0) goto L13
            java.lang.String r0 = "Please make sure to call Clarity.initialize(...) on the main thread. Otherwise, some unexpected side effects could happen!"
            com.microsoft.clarity.q.l.e(r0)
        L13:
            boolean r0 = com.microsoft.clarity.a.I.b
            if (r0 == 0) goto L1d
            java.lang.String r0 = "Clarity already initialized."
            com.microsoft.clarity.q.l.d(r0)
            goto L7d
        L1d:
            boolean r0 = com.microsoft.clarity.a.I.a()
            if (r0 != 0) goto L29
            java.lang.String r0 = "API level not supported. We currently support 29-36 inclusive."
            com.microsoft.clarity.q.l.d(r0)
            goto L7d
        L29:
            android.content.Context r0 = r4.a
            boolean r0 = r0 instanceof android.app.Application
            if (r0 != 0) goto L35
            java.lang.String r0 = "You should pass the application context."
            com.microsoft.clarity.q.l.c(r0)
            goto L7d
        L35:
            com.microsoft.clarity.ClarityConfig r0 = r4.b
            boolean r0 = r0.isValidProjectId$sdk_prodRelease()
            if (r0 != 0) goto L43
            java.lang.String r0 = "Invalid project id. Please check the dashboard for your project id."
            com.microsoft.clarity.q.l.c(r0)
            goto L7d
        L43:
            com.microsoft.clarity.ClarityConfig r0 = r4.b
            boolean r0 = r0.isReactNative$sdk_prodRelease()
            r1 = 1
            if (r0 != 0) goto L5c
            com.microsoft.clarity.ClarityConfig r0 = r4.b
            boolean r0 = r0.isCordova$sdk_prodRelease()
            if (r0 != 0) goto L5c
            com.microsoft.clarity.ClarityConfig r0 = r4.b
            boolean r0 = r0.isIonic$sdk_prodRelease()
            if (r0 == 0) goto L70
        L5c:
            android.app.Activity r0 = r4.c
            if (r0 != 0) goto L70
            java.lang.String r0 = "For Cordova, Ionic & ReactNative apps, 'activity' cannot be null."
            com.microsoft.clarity.q.l.c(r0)
            java.lang.String r0 = "prod"
            java.lang.String r2 = "LiveIngest"
            boolean r0 = defpackage.f88.c0(r0, r2, r1)
            if (r0 != 0) goto L70
            goto L7d
        L70:
            android.content.Context r0 = r4.a
            android.app.Application r0 = (android.app.Application) r0
            com.microsoft.clarity.ClarityConfig r2 = r4.b
            android.app.Activity r3 = r4.c
            com.microsoft.clarity.a.I.a(r0, r2, r3)
            com.microsoft.clarity.a.I.b = r1
        L7d:
            tx8 r0 = defpackage.tx8.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.clarity.a.C0048g.invoke():java.lang.Object");
    }
}
