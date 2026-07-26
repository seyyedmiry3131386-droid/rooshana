package androidx.compose.ui.contentcapture;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.d;
import androidx.lifecycle.DefaultLifecycleObserver;
import defpackage.bp2;
import defpackage.ck4;
import defpackage.dp2;
import defpackage.dt2;
import defpackage.e3;
import defpackage.en7;
import defpackage.g64;
import defpackage.js3;
import defpackage.kn7;
import defpackage.ln7;
import defpackage.pq3;
import defpackage.qp2;
import defpackage.qq3;
import defpackage.s31;
import defpackage.s7;
import defpackage.t31;
import defpackage.t61;
import defpackage.tf1;
import defpackage.tx8;
import defpackage.ya5;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements DefaultLifecycleObserver, View.OnAttachStateChangeListener {
    public final AndroidComposeView a;
    public final bp2 b;
    public t31 c;
    public final ArrayList d = new ArrayList();
    public final long e = 100;
    public AndroidContentCaptureManager$TranslateStatus f = AndroidContentCaptureManager$TranslateStatus.a;
    public boolean g = true;
    public final kotlinx.coroutines.channels.a h = dt2.b(1, 6, null);
    public final Handler i = new Handler(Looper.getMainLooper());
    public ya5 j;
    public long k;
    public final ya5 l;
    public kn7 m;
    public boolean n;
    public final a o;

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.contentcapture.a] */
    public b(AndroidComposeView androidComposeView, bp2 bp2Var) {
        this.a = androidComposeView;
        this.b = bp2Var;
        ya5 ya5Var = qq3.a;
        js3.n(ya5Var, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.j = ya5Var;
        this.l = new ya5();
        androidx.compose.ui.semantics.c cVarA = androidComposeView.getSemanticsOwner().a();
        js3.n(ya5Var, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.m = new kn7(cVarA, ya5Var);
        this.o = new Runnable() { // from class: androidx.compose.ui.contentcapture.a
            /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r21 = this;
                    r1 = r21
                    androidx.compose.ui.contentcapture.b r0 = r1.a
                    boolean r2 = r0.e()
                    androidx.compose.ui.platform.AndroidComposeView r3 = r0.a
                    if (r2 != 0) goto Ld
                    return
                Ld:
                    java.lang.String r2 = "ContentCapture:changeChecker"
                    android.os.Trace.beginSection(r2)
                    r2 = 1
                    r3.t(r2)     // Catch: java.lang.Throwable -> Lad
                    ya5 r2 = r0.l     // Catch: java.lang.Throwable -> Lad
                    int[] r4 = r2.b     // Catch: java.lang.Throwable -> Lad
                    long[] r2 = r2.a     // Catch: java.lang.Throwable -> Lad
                    int r5 = r2.length     // Catch: java.lang.Throwable -> Lad
                    int r5 = r5 + (-2)
                    if (r5 < 0) goto L87
                    r7 = 0
                L22:
                    r8 = r2[r7]     // Catch: java.lang.Throwable -> Lad
                    long r10 = ~r8     // Catch: java.lang.Throwable -> Lad
                    r12 = 7
                    long r10 = r10 << r12
                    long r10 = r10 & r8
                    r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r10 = r10 & r12
                    int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                    if (r10 == 0) goto L81
                    int r10 = r7 - r5
                    int r10 = ~r10     // Catch: java.lang.Throwable -> Lad
                    int r10 = r10 >>> 31
                    r11 = 8
                    int r10 = 8 - r10
                    r12 = 0
                L3c:
                    if (r12 >= r10) goto L7a
                    r13 = 255(0xff, double:1.26E-321)
                    long r13 = r13 & r8
                    r15 = 128(0x80, double:6.3E-322)
                    int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                    if (r13 >= 0) goto L72
                    int r13 = r7 << 3
                    int r13 = r13 + r12
                    r15 = r4[r13]     // Catch: java.lang.Throwable -> Lad
                    pq3 r13 = r0.d()     // Catch: java.lang.Throwable -> Lad
                    boolean r13 = r13.a(r15)     // Catch: java.lang.Throwable -> Lad
                    if (r13 != 0) goto L72
                    java.util.ArrayList r13 = r0.d     // Catch: java.lang.Throwable -> Lad
                    androidx.compose.ui.contentcapture.c r14 = new androidx.compose.ui.contentcapture.c     // Catch: java.lang.Throwable -> Lad
                    r20 = r7
                    long r6 = r0.k     // Catch: java.lang.Throwable -> Lad
                    androidx.compose.ui.contentcapture.ContentCaptureEventType r18 = androidx.compose.ui.contentcapture.ContentCaptureEventType.b     // Catch: java.lang.Throwable -> Lad
                    r19 = 0
                    r16 = r6
                    r14.<init>(r15, r16, r18, r19)     // Catch: java.lang.Throwable -> Lad
                    r13.add(r14)     // Catch: java.lang.Throwable -> Lad
                    kotlinx.coroutines.channels.a r6 = r0.h     // Catch: java.lang.Throwable -> Lad
                    tx8 r7 = defpackage.tx8.a     // Catch: java.lang.Throwable -> Lad
                    r6.o(r7)     // Catch: java.lang.Throwable -> Lad
                    goto L74
                L72:
                    r20 = r7
                L74:
                    long r8 = r8 >> r11
                    int r12 = r12 + 1
                    r7 = r20
                    goto L3c
                L7a:
                    r20 = r7
                    if (r10 != r11) goto L87
                    r6 = r20
                    goto L82
                L81:
                    r6 = r7
                L82:
                    if (r6 == r5) goto L87
                    int r7 = r6 + 1
                    goto L22
                L87:
                    java.lang.String r2 = "ContentCapture:sendAppearEvents"
                    android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> Lad
                    mn7 r2 = r3.getSemanticsOwner()     // Catch: java.lang.Throwable -> Laf
                    androidx.compose.ui.semantics.c r2 = r2.a()     // Catch: java.lang.Throwable -> Laf
                    kn7 r3 = r0.m     // Catch: java.lang.Throwable -> Laf
                    r0.k(r2, r3)     // Catch: java.lang.Throwable -> Laf
                    android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lad
                    pq3 r2 = r0.d()     // Catch: java.lang.Throwable -> Lad
                    r0.b(r2)     // Catch: java.lang.Throwable -> Lad
                    r0.o()     // Catch: java.lang.Throwable -> Lad
                    r2 = 0
                    r0.n = r2     // Catch: java.lang.Throwable -> Lad
                    android.os.Trace.endSection()
                    return
                Lad:
                    r0 = move-exception
                    goto Lb4
                Laf:
                    r0 = move-exception
                    android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lad
                    throw r0     // Catch: java.lang.Throwable -> Lad
                Lb4:
                    android.os.Trace.endSection()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.a.run():void");
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007d -> B:17:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = new androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            lh0 r2 = r0.a
            kotlin.b.b(r8)
            goto L47
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            lh0 r2 = r0.a
            kotlin.b.b(r8)
            goto L52
        L3a:
            kotlin.b.b(r8)
            kotlinx.coroutines.channels.a r8 = r7.h
            r8.getClass()
            lh0 r2 = new lh0
            r2.<init>(r8)
        L47:
            r0.a = r2
            r0.d = r4
            java.lang.Object r8 = r2.d(r0)
            if (r8 != r1) goto L52
            goto L7f
        L52:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L80
            r2.f()
            boolean r8 = r7.e()
            if (r8 == 0) goto L66
            r7.f()
        L66:
            boolean r8 = r7.n
            if (r8 != 0) goto L73
            r7.n = r4
            android.os.Handler r8 = r7.i
            androidx.compose.ui.contentcapture.a r5 = r7.o
            r8.post(r5)
        L73:
            r0.a = r2
            r0.d = r3
            long r5 = r7.e
            java.lang.Object r8 = kotlinx.coroutines.a.e(r5, r0)
            if (r8 != r1) goto L47
        L7f:
            return r1
        L80:
            tx8 r8 = defpackage.tx8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.b.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.pq3 r35) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.b.b(pq3):void");
    }

    public final void c(androidx.compose.ui.semantics.c cVar, qp2 qp2Var) {
        cVar.getClass();
        List listJ = androidx.compose.ui.semantics.c.j(4, cVar);
        int size = listJ.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listJ.get(i2);
            if (d().a(((androidx.compose.ui.semantics.c) obj).g)) {
                qp2Var.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    public final pq3 d() {
        if (this.g) {
            this.g = false;
            this.j = s7.s(this.a.getSemanticsOwner(), new dp2() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$currentSemanticsNodes$1
                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    en7 en7VarK = ((androidx.compose.ui.semantics.c) obj).k();
                    return Boolean.valueOf(en7VarK.a.c(d.A));
                }
            });
            this.k = System.currentTimeMillis();
        }
        return this.j;
    }

    public final boolean e() {
        return this.c != null;
    }

    public final void f() {
        t31 t31Var = this.c;
        if (t31Var != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.d;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                c cVar = (c) arrayList.get(i);
                int iOrdinal = cVar.c.ordinal();
                if (iOrdinal == 0) {
                    ck4 ck4Var = cVar.d;
                    if (ck4Var != null) {
                        ((s31) t31Var).d((ViewStructure) ck4Var.b);
                    }
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s31 s31Var = (s31) t31Var;
                    AutofillId autofillIdB = s31Var.b(cVar.a);
                    if (autofillIdB != null) {
                        s31Var.e(autofillIdB);
                    }
                }
            }
            ((s31) t31Var).a();
            arrayList.clear();
        }
    }

    public final void h() {
        e3 e3Var;
        bp2 bp2Var;
        this.f = AndroidContentCaptureManager$TranslateStatus.a;
        pq3 pq3VarD = d();
        Object[] objArr = pq3VarD.c;
        long[] jArr = pq3VarD.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        en7 en7Var = ((ln7) objArr[(i << 3) + i3]).a.d;
                        if (androidx.compose.ui.semantics.b.a(en7Var, d.D) != null && (e3Var = (e3) androidx.compose.ui.semantics.b.a(en7Var, androidx.compose.ui.semantics.a.n)) != null && (bp2Var = (bp2) e3Var.b) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void i() {
        e3 e3Var;
        dp2 dp2Var;
        this.f = AndroidContentCaptureManager$TranslateStatus.a;
        pq3 pq3VarD = d();
        Object[] objArr = pq3VarD.c;
        long[] jArr = pq3VarD.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        en7 en7Var = ((ln7) objArr[(i << 3) + i3]).a.d;
                        if (js3.i(androidx.compose.ui.semantics.b.a(en7Var, d.D), Boolean.TRUE) && (e3Var = (e3) androidx.compose.ui.semantics.b.a(en7Var, androidx.compose.ui.semantics.a.m)) != null && (dp2Var = (dp2) e3Var.b) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void j() {
        e3 e3Var;
        dp2 dp2Var;
        this.f = AndroidContentCaptureManager$TranslateStatus.b;
        pq3 pq3VarD = d();
        Object[] objArr = pq3VarD.c;
        long[] jArr = pq3VarD.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        en7 en7Var = ((ln7) objArr[(i << 3) + i3]).a.d;
                        if (js3.i(androidx.compose.ui.semantics.b.a(en7Var, d.D), Boolean.FALSE) && (e3Var = (e3) androidx.compose.ui.semantics.b.a(en7Var, androidx.compose.ui.semantics.a.m)) != null && (dp2Var = (dp2) e3Var.b) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void k(androidx.compose.ui.semantics.c cVar, final kn7 kn7Var) {
        c(cVar, new qp2() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$sendContentCaptureAppearEvents$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Number) obj).intValue();
                androidx.compose.ui.semantics.c cVar2 = (androidx.compose.ui.semantics.c) obj2;
                boolean zB = kn7Var.b.b(cVar2.g);
                tx8 tx8Var = tx8.a;
                if (!zB) {
                    b bVar = this;
                    bVar.m(iIntValue, cVar2);
                    bVar.h.o(tx8Var);
                }
                return tx8Var;
            }
        });
        List listJ = androidx.compose.ui.semantics.c.j(4, cVar);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.semantics.c cVar2 = (androidx.compose.ui.semantics.c) listJ.get(i);
            pq3 pq3VarD = d();
            int i2 = cVar2.g;
            if (pq3VarD.a(i2)) {
                ya5 ya5Var = this.l;
                if (ya5Var.a(i2)) {
                    Object objB = ya5Var.b(i2);
                    if (objB == null) {
                        throw t61.r("node not present in pruned tree before this change");
                    }
                    k(cVar2, (kn7) objB);
                } else {
                    continue;
                }
            }
        }
    }

    public final void l(int i, String str) {
        t31 t31Var;
        if (Build.VERSION.SDK_INT >= 29 && (t31Var = this.c) != null) {
            s31 s31Var = (s31) t31Var;
            AutofillId autofillIdB = s31Var.b(i);
            if (autofillIdB == null) {
                throw t61.r("Invalid content capture ID");
            }
            s31Var.f(autofillIdB, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(int r14, androidx.compose.ui.semantics.c r15) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.b.m(int, androidx.compose.ui.semantics.c):void");
    }

    public final void n(androidx.compose.ui.semantics.c cVar) {
        if (e()) {
            this.d.add(new c(cVar.g, this.k, ContentCaptureEventType.b, null));
            List listJ = androidx.compose.ui.semantics.c.j(4, cVar);
            int size = listJ.size();
            for (int i = 0; i < size; i++) {
                n((androidx.compose.ui.semantics.c) listJ.get(i));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            r17 = this;
            r0 = r17
            ya5 r1 = r0.l
            r1.c()
            pq3 r2 = r0.d()
            int[] r3 = r2.b
            java.lang.Object[] r4 = r2.c
            long[] r2 = r2.a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L5e
            r7 = 0
        L17:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L31:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            ln7 r13 = (defpackage.ln7) r13
            kn7 r15 = new kn7
            androidx.compose.ui.semantics.c r13 = r13.a
            pq3 r6 = r0.d()
            r15.<init>(r13, r6)
            r1.h(r14, r15)
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L31
        L57:
            if (r10 != r11) goto L5e
        L59:
            if (r7 == r5) goto L5e
            int r7 = r7 + 1
            goto L17
        L5e:
            kn7 r1 = new kn7
            androidx.compose.ui.platform.AndroidComposeView r2 = r0.a
            mn7 r2 = r2.getSemanticsOwner()
            androidx.compose.ui.semantics.c r2 = r2.a()
            pq3 r3 = r0.d()
            r1.<init>(r2, r3)
            r0.m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.b.o():void");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(g64 g64Var) {
        tf1.a(this, g64Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(g64 g64Var) {
        tf1.b(this, g64Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(g64 g64Var) {
        tf1.c(this, g64Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(g64 g64Var) {
        tf1.d(this, g64Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(g64 g64Var) {
        this.c = (t31) this.b.invoke();
        m(-1, this.a.getSemanticsOwner().a());
        f();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(g64 g64Var) {
        n(this.a.getSemanticsOwner().a());
        f();
        this.c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.i.removeCallbacks(this.o);
        this.c = null;
    }
}
