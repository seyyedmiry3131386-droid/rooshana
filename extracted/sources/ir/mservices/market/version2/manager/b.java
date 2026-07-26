package ir.mservices.market.version2.manager;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final Context a;

    public b(Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0119 -> B:42:0x011a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.version2.manager.b.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.pm.PackageInfo r18, android.app.usage.UsageStats r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            boolean r3 = r2 instanceof ir.mservices.market.version2.manager.AppUsageManager$getAppInfo$1
            if (r3 == 0) goto L19
            r3 = r2
            ir.mservices.market.version2.manager.AppUsageManager$getAppInfo$1 r3 = (ir.mservices.market.version2.manager.AppUsageManager$getAppInfo$1) r3
            int r4 = r3.g
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.g = r4
            goto L1e
        L19:
            ir.mservices.market.version2.manager.AppUsageManager$getAppInfo$1 r3 = new ir.mservices.market.version2.manager.AppUsageManager$getAppInfo$1
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.e
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r5 = r3.g
            r6 = 1
            if (r5 == 0) goto L42
            if (r5 != r6) goto L3a
            java.lang.String r1 = r3.d
            java.lang.String r4 = r3.c
            android.graphics.drawable.Drawable r5 = r3.b
            android.app.usage.UsageStats r3 = r3.a
            kotlin.b.b(r2)
            r12 = r1
            r16 = r3
            r13 = r4
        L38:
            r14 = r5
            goto L89
        L3a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L42:
            kotlin.b.b(r2)
            android.content.Context r2 = r0.a
            android.content.pm.PackageManager r5 = r2.getPackageManager()
            android.content.pm.ApplicationInfo r7 = r1.applicationInfo
            r8 = 0
            if (r7 == 0) goto L92
            java.lang.String r9 = r1.packageName
            java.lang.String r10 = "packageName"
            defpackage.js3.o(r9, r10)
            java.lang.CharSequence r10 = r5.getApplicationLabel(r7)
            java.lang.String r10 = r10.toString()
            android.graphics.drawable.Drawable r5 = r5.getApplicationIcon(r7)
            java.lang.String r7 = "getApplicationIcon(...)"
            defpackage.js3.o(r5, r7)
            r7 = r19
            r3.a = r7
            r3.b = r5
            r3.c = r10
            r3.d = r9
            r3.g = r6
            ug1 r6 = defpackage.up1.a
            kf1 r6 = defpackage.kf1.c
            ir.mservices.market.version2.manager.AppUsageManager$getPackageSizeInfo$2 r11 = new ir.mservices.market.version2.manager.AppUsageManager$getPackageSizeInfo$2
            r11.<init>(r1, r2, r8)
            java.lang.Object r2 = defpackage.bt2.Z(r6, r11, r3)
            if (r2 != r4) goto L84
            return r4
        L84:
            r16 = r7
            r12 = r9
            r13 = r10
            goto L38
        L89:
            r15 = r2
            ws r15 = (defpackage.ws) r15
            bu r11 = new bu
            r11.<init>(r12, r13, r14, r15, r16)
            return r11
        L92:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.version2.manager.b.b(android.content.pm.PackageInfo, android.app.usage.UsageStats, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x005c
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r8 = this;
            om0 r0 = new om0
            g51 r9 = defpackage.ok4.I(r9)
            r1 = 1
            r0.<init>(r1, r9)
            r0.v()
            int r9 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r9 < r1) goto L64
            java.lang.Class<android.os.storage.StorageManager> r9 = android.os.storage.StorageManager.class
            android.content.Context r1 = r8.a
            java.lang.Object r9 = androidx.core.content.ContextCompat.getSystemService(r1, r9)
            android.os.storage.StorageManager r9 = (android.os.storage.StorageManager) r9
            r2 = 0
            if (r9 == 0) goto L25
            java.util.List r9 = r9.getStorageVolumes()
            goto L26
        L25:
            r9 = r2
        L26:
            if (r9 == 0) goto L60
            java.lang.Object r9 = kotlin.collections.a.p0(r9)
            android.os.storage.StorageVolume r9 = (android.os.storage.StorageVolume) r9
            if (r9 == 0) goto L60
            java.lang.String r9 = r9.getUuid()
            if (r9 != 0) goto L39
            java.util.UUID r9 = android.os.storage.StorageManager.UUID_DEFAULT
            goto L3d
        L39:
            java.util.UUID r9 = java.util.UUID.fromString(r9)
        L3d:
            java.lang.Class<android.app.usage.StorageStatsManager> r3 = android.app.usage.StorageStatsManager.class
            java.lang.Object r1 = androidx.core.content.ContextCompat.getSystemService(r1, r3)     // Catch: java.lang.Exception -> L5c
            android.app.usage.StorageStatsManager r1 = (android.app.usage.StorageStatsManager) r1     // Catch: java.lang.Exception -> L5c
            if (r1 == 0) goto L58
            f68 r3 = new f68     // Catch: java.lang.Exception -> L5c
            long r4 = r1.getTotalBytes(r9)     // Catch: java.lang.Exception -> L5c
            long r6 = r1.getFreeBytes(r9)     // Catch: java.lang.Exception -> L5c
            r3.<init>(r4, r6)     // Catch: java.lang.Exception -> L5c
            r0.resumeWith(r3)     // Catch: java.lang.Exception -> L5c
            goto L86
        L58:
            r0.resumeWith(r2)     // Catch: java.lang.Exception -> L5c
            goto L86
        L5c:
            r0.resumeWith(r2)
            goto L86
        L60:
            r0.resumeWith(r2)
            goto L86
        L64:
            android.os.StatFs r9 = new android.os.StatFs
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r1 = r1.getPath()
            r9.<init>(r1)
            f68 r1 = new f68
            long r2 = r9.getTotalBytes()
            long r4 = r9.getBlockSizeLong()
            long r6 = r9.getAvailableBlocksLong()
            long r6 = r6 * r4
            r1.<init>(r2, r6)
            r0.resumeWith(r1)
        L86:
            java.lang.Object r9 = r0.u()
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.version2.manager.b.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
