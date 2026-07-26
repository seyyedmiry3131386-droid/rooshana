package defpackage;

import androidx.compose.runtime.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class lc4 {
    public static final i a;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if ((r1 instanceof androidx.compose.runtime.i) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        r1 = (androidx.compose.runtime.i) r1;
     */
    static {
        /*
            r0 = 0
            java.lang.Class<g64> r1 = defpackage.g64.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L29
            defpackage.js3.m(r1)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "androidx.compose.ui.platform.AndroidCompositionLocals_androidKt"
            java.lang.String r3 = "getLocalLifecycleOwner"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Method r1 = r1.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L29
            java.lang.annotation.Annotation[] r2 = r1.getAnnotations()     // Catch: java.lang.Throwable -> L29
            int r3 = r2.length     // Catch: java.lang.Throwable -> L29
            r4 = 0
        L1c:
            if (r4 >= r3) goto L2b
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L29
            boolean r5 = r5 instanceof defpackage.yj1     // Catch: java.lang.Throwable -> L29
            if (r5 == 0) goto L26
        L24:
            r1 = r0
            goto L3a
        L26:
            int r4 = r4 + 1
            goto L1c
        L29:
            r1 = move-exception
            goto L36
        L2b:
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L29
            boolean r2 = r1 instanceof androidx.compose.runtime.i     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L24
            androidx.compose.runtime.i r1 = (androidx.compose.runtime.i) r1     // Catch: java.lang.Throwable -> L29
            goto L3a
        L36:
            kotlin.Result$Failure r1 = kotlin.b.a(r1)
        L3a:
            boolean r2 = r1 instanceof kotlin.Result.Failure
            if (r2 == 0) goto L3f
            goto L40
        L3f:
            r0 = r1
        L40:
            androidx.compose.runtime.i r0 = (androidx.compose.runtime.i) r0
            if (r0 != 0) goto L50
            ob4 r0 = new ob4
            r1 = 1
            r0.<init>(r1)
            u58 r1 = new u58
            r1.<init>(r0)
            r0 = r1
        L50:
            defpackage.lc4.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc4.<clinit>():void");
    }
}
