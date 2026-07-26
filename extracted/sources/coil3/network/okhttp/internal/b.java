package coil3.network.okhttp.internal;

import defpackage.b28;
import defpackage.by2;
import defpackage.g77;
import defpackage.j77;
import defpackage.js3;
import defpackage.ph0;
import defpackage.rm5;
import defpackage.w0;
import defpackage.ym5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final ym5 a(g77 g77Var) {
        ph0 ph0VarD1;
        int i = g77Var.d;
        long j = g77Var.l;
        long j2 = g77Var.m;
        by2 by2Var = g77Var.f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = by2Var.iterator();
        while (true) {
            w0 w0Var = (w0) it;
            if (!w0Var.hasNext()) {
                break;
            }
            Pair pair = (Pair) w0Var.next();
            String str = (String) pair.a;
            String str2 = (String) pair.b;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            js3.o(lowerCase, "toLowerCase(...)");
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(str2);
        }
        rm5 rm5Var = new rm5(kotlin.collections.b.T(linkedHashMap));
        j77 j77Var = g77Var.g;
        return new ym5(i, j, j2, rm5Var, (j77Var == null || (ph0VarD1 = j77Var.d1()) == null) ? null : new b28(ph0VarD1), g77Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.w47 b(defpackage.xm5 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof coil3.network.okhttp.internal.UtilsKt$toRequest$1
            if (r0 == 0) goto L13
            r0 = r6
            coil3.network.okhttp.internal.UtilsKt$toRequest$1 r0 = (coil3.network.okhttp.internal.UtilsKt$toRequest$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            coil3.network.okhttp.internal.UtilsKt$toRequest$1 r0 = new coil3.network.okhttp.internal.UtilsKt$toRequest$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r0 = r0.b
            r1 = 0
            if (r0 == 0) goto L43
            r5 = 1
            if (r0 != r5) goto L3b
            kotlin.b.b(r6)
            okio.ByteString r6 = (okio.ByteString) r6
            if (r6 == 0) goto L36
            int r5 = defpackage.b57.a
            z47 r5 = new z47
            r5.<init>(r6)
            r6 = r1
            r0 = r6
            r2 = r0
            goto L5a
        L36:
            r5 = r1
            r6 = r5
            r0 = r6
            r2 = r0
            goto L56
        L3b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L43:
            kotlin.b.b(r6)
            rb4 r6 = new rb4
            r0 = 15
            r6.<init>(r0)
            java.lang.String r0 = r5.a
            r6.P(r0)
            java.lang.String r0 = r5.b
            r2 = r0
            r0 = r6
        L56:
            r4 = r6
            r6 = r5
            r5 = r1
            r1 = r4
        L5a:
            r1.F(r2, r5)
            rm5 r5 = r6.c
            ay2 r6 = new ay2
            r1 = 0
            r6.<init>(r1)
            java.util.Map r5 = r5.a
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L6f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L9b
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L8b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6f
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r6.d(r2, r3)
            goto L8b
        L9b:
            by2 r5 = r6.e()
            r0.C(r5)
            w47 r5 = new w47
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.okhttp.internal.b.b(xm5, kotlin.coroutines.jvm.internal.ContinuationImpl):w47");
    }
}
