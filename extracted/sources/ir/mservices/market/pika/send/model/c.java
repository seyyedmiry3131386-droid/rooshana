package ir.mservices.market.pika.send.model;

import android.content.Context;
import defpackage.dp3;
import defpackage.js3;
import defpackage.lw8;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public final Context a;
    public final dp3 b;
    public final lw8 c;
    public final ir.mservices.market.common.install.a d;

    public c(Context context, dp3 dp3Var, lw8 lw8Var, ir.mservices.market.common.install.a aVar) {
        js3.p(dp3Var, "installManager");
        js3.p(lw8Var, "uiUtils");
        js3.p(aVar, "installedAppsManager");
        this.a = context;
        this.b = dp3Var;
        this.c = lw8Var;
        this.d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ir.mservices.market.pika.send.model.c r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof ir.mservices.market.pika.send.model.InstalledAppsRepositoryImpl$getInstalledAppsData$1
            if (r0 == 0) goto L16
            r0 = r7
            ir.mservices.market.pika.send.model.InstalledAppsRepositoryImpl$getInstalledAppsData$1 r0 = (ir.mservices.market.pika.send.model.InstalledAppsRepositoryImpl$getInstalledAppsData$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.c = r1
            goto L1b
        L16:
            ir.mservices.market.pika.send.model.InstalledAppsRepositoryImpl$getInstalledAppsData$1 r0 = new ir.mservices.market.pika.send.model.InstalledAppsRepositoryImpl$getInstalledAppsData$1
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.b.b(r7)
            goto L8f
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.b.b(r7)     // Catch: java.lang.Throwable -> L39
            goto L4a
        L39:
            r7 = move-exception
            goto L4d
        L3b:
            kotlin.b.b(r7)
            ir.mservices.market.common.install.a r7 = r6.d     // Catch: java.lang.Throwable -> L39
            r0.c = r4     // Catch: java.lang.Throwable -> L39
            r2 = 0
            java.lang.Object r7 = r7.a(r4, r2, r0)     // Catch: java.lang.Throwable -> L39
            if (r7 != r1) goto L4a
            goto L96
        L4a:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L39
            goto L51
        L4d:
            kotlin.Result$Failure r7 = kotlin.b.a(r7)
        L51:
            java.lang.Throwable r2 = kotlin.Result.a(r7)
            if (r2 != 0) goto L58
            goto L5a
        L58:
            kotlin.collections.EmptyList r7 = kotlin.collections.EmptyList.a
        L5a:
            java.util.List r7 = (java.util.List) r7
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L7c
            h99 r1 = new h99
            ir.mservices.market.version2.webapi.responsedto.ErrorDTO r7 = new ir.mservices.market.version2.webapi.responsedto.ErrorDTO
            android.content.Context r6 = r6.a
            android.content.res.Resources r6 = r6.getResources()
            int r0 = defpackage.rs6.install_error_something_wrong
            java.lang.String r6 = r6.getString(r0)
            r0 = -1
            java.lang.String r2 = "Installed apps list is empty"
            r7.<init>(r0, r2, r6)
            r1.<init>(r7)
            goto L96
        L7c:
            ug1 r2 = defpackage.up1.a
            kf1 r2 = defpackage.kf1.c
            ir.mservices.market.pika.send.model.InstalledAppsRepositoryImpl$getInstalledAppsData$mappedInstalledApps$1 r4 = new ir.mservices.market.pika.send.model.InstalledAppsRepositoryImpl$getInstalledAppsData$mappedInstalledApps$1
            r5 = 0
            r4.<init>(r7, r6, r5)
            r0.c = r3
            java.lang.Object r7 = defpackage.bt2.Z(r2, r4, r0)
            if (r7 != r1) goto L8f
            goto L96
        L8f:
            java.util.List r7 = (java.util.List) r7
            l99 r1 = new l99
            r1.<init>(r7)
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.pika.send.model.c.a(ir.mservices.market.pika.send.model.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
