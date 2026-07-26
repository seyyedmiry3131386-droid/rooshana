package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.a27;
import defpackage.b7;
import defpackage.bp2;
import defpackage.br9;
import defpackage.dp2;
import defpackage.dt2;
import defpackage.e3;
import defpackage.eh;
import defpackage.en7;
import defpackage.fa7;
import defpackage.ff;
import defpackage.gg7;
import defpackage.h3;
import defpackage.i3;
import defpackage.js3;
import defpackage.k94;
import defpackage.kn7;
import defpackage.kq3;
import defpackage.ll;
import defpackage.ln7;
import defpackage.m28;
import defpackage.nm5;
import defpackage.nq3;
import defpackage.pq3;
import defpackage.qg7;
import defpackage.qq3;
import defpackage.rb5;
import defpackage.ri8;
import defpackage.rp2;
import defpackage.rq4;
import defpackage.s7;
import defpackage.sk6;
import defpackage.sy6;
import defpackage.t3;
import defpackage.tx8;
import defpackage.u26;
import defpackage.ur6;
import defpackage.vq3;
import defpackage.vw5;
import defpackage.wa5;
import defpackage.wq2;
import defpackage.ww5;
import defpackage.xa5;
import defpackage.xr7;
import defpackage.xw5;
import defpackage.ya5;
import defpackage.za5;
import defpackage.zi8;
import defpackage.zv;
import io.sentry.android.core.t0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h3 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final xa5 O = nq3.a(ur6.accessibility_custom_action_0, ur6.accessibility_custom_action_1, ur6.accessibility_custom_action_2, ur6.accessibility_custom_action_3, ur6.accessibility_custom_action_4, ur6.accessibility_custom_action_5, ur6.accessibility_custom_action_6, ur6.accessibility_custom_action_7, ur6.accessibility_custom_action_8, ur6.accessibility_custom_action_9, ur6.accessibility_custom_action_10, ur6.accessibility_custom_action_11, ur6.accessibility_custom_action_12, ur6.accessibility_custom_action_13, ur6.accessibility_custom_action_14, ur6.accessibility_custom_action_15, ur6.accessibility_custom_action_16, ur6.accessibility_custom_action_17, ur6.accessibility_custom_action_18, ur6.accessibility_custom_action_19, ur6.accessibility_custom_action_20, ur6.accessibility_custom_action_21, ur6.accessibility_custom_action_22, ur6.accessibility_custom_action_23, ur6.accessibility_custom_action_24, ur6.accessibility_custom_action_25, ur6.accessibility_custom_action_26, ur6.accessibility_custom_action_27, ur6.accessibility_custom_action_28, ur6.accessibility_custom_action_29, ur6.accessibility_custom_action_30, ur6.accessibility_custom_action_31);
    public ya5 A;
    public final za5 B;
    public final wa5 C;
    public final wa5 D;
    public final String E;
    public final String F;
    public final sk6 G;
    public final ya5 H;
    public kn7 I;
    public boolean J;
    public final wa5 K;
    public final b7 L;
    public final ArrayList M;
    public final dp2 N;
    public final AndroidComposeView d;
    public int e = Integer.MIN_VALUE;
    public final dp2 f = new AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1(this);
    public final AccessibilityManager g;
    public long h;
    public List i;
    public final Handler j;
    public final b k;
    public int l;
    public int m;
    public t3 n;
    public t3 o;
    public boolean p;
    public final ya5 q;
    public final ya5 r;
    public final m28 s;
    public final m28 t;
    public int u;
    public Integer v;
    public final zv w;
    public final kotlinx.coroutines.channels.a x;
    public boolean y;
    public ff z;

    public c(AndroidComposeView androidComposeView) {
        this.d = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        js3.n(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.g = (AccessibilityManager) systemService;
        this.h = 100L;
        this.j = new Handler(Looper.getMainLooper());
        this.k = new b(this);
        this.l = Integer.MIN_VALUE;
        this.m = Integer.MIN_VALUE;
        this.q = new ya5();
        this.r = new ya5();
        this.s = new m28(0);
        this.t = new m28(0);
        this.u = -1;
        this.w = new zv(0);
        this.x = dt2.b(1, 6, null);
        this.y = true;
        ya5 ya5Var = qq3.a;
        js3.n(ya5Var, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.A = ya5Var;
        this.B = new za5();
        this.C = new wa5();
        this.D = new wa5();
        this.E = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.F = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.G = new sk6(18, (byte) 0);
        this.H = new ya5();
        androidx.compose.ui.semantics.c cVarA = androidComposeView.getSemanticsOwner().a();
        js3.n(ya5Var, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.I = new kn7(cVarA, ya5Var);
        int i = kq3.a;
        this.K = new wa5();
        androidComposeView.addOnAttachStateChangeListener(this);
        this.L = new b7(1, this);
        this.M = new ArrayList();
        this.N = new dp2() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                qg7 qg7Var = (qg7) obj;
                xa5 xa5Var = c.O;
                if (qg7Var.b.contains(qg7Var)) {
                    c cVar = this.g;
                    androidx.compose.ui.node.p snapshotObserver = cVar.d.getSnapshotObserver();
                    snapshotObserver.a.d(qg7Var, cVar.N, new AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1(qg7Var, cVar));
                }
                return tx8.a;
            }
        };
    }

    public static /* synthetic */ void E(c cVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        cVar.D(i, i2, num, null);
    }

    public static Rect L(rq4 rq4Var, float f, float f2) {
        if (!(rq4Var instanceof ww5) && !(rq4Var instanceof xw5)) {
            return null;
        }
        sy6 sy6VarY = rq4Var.y();
        return new Rect((int) (sy6VarY.a + f), (int) (sy6VarY.b + f2), (int) (sy6VarY.c + f), (int) (sy6VarY.d + f2));
    }

    public static float[] N(rq4 rq4Var) {
        if (!(rq4Var instanceof xw5)) {
            return null;
        }
        fa7 fa7Var = ((xw5) rq4Var).p;
        long j = fa7Var.h;
        long j2 = fa7Var.g;
        long j3 = fa7Var.f;
        long j4 = fa7Var.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region O(rq4 rq4Var, float f, float f2) {
        if (!(rq4Var instanceof vw5)) {
            return null;
        }
        vw5 vw5Var = (vw5) rq4Var;
        sy6 sy6VarH = vw5Var.y().h(f, f2);
        Region region = new Region(new Rect((int) (sy6VarH.a + 0.0f), (int) (sy6VarH.b + 0.0f), (int) (sy6VarH.c + 0.0f), (int) (sy6VarH.d + 0.0f)));
        Region region2 = new Region();
        u26 u26Var = vw5Var.p;
        if (!(u26Var instanceof eh)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((eh) u26Var).a;
        path.offset(f, f2);
        region2.setPath(path, region);
        return region2;
    }

    public static CharSequence P(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                js3.n(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String t(androidx.compose.ui.semantics.c cVar) {
        ll llVar;
        if (cVar != null) {
            en7 en7Var = cVar.d;
            rb5 rb5Var = en7Var.a;
            androidx.compose.ui.semantics.g gVar = androidx.compose.ui.semantics.d.a;
            if (rb5Var.c(gVar)) {
                return k94.a((List) en7Var.d(gVar), ",", null, 62);
            }
            androidx.compose.ui.semantics.g gVar2 = androidx.compose.ui.semantics.d.F;
            if (rb5Var.c(gVar2)) {
                ll llVar2 = (ll) androidx.compose.ui.semantics.b.a(en7Var, gVar2);
                if (llVar2 != null) {
                    return llVar2.b;
                }
            } else {
                List list = (List) androidx.compose.ui.semantics.b.a(en7Var, androidx.compose.ui.semantics.d.B);
                if (list != null && (llVar = (ll) kotlin.collections.a.p0(list)) != null) {
                    return llVar.b;
                }
            }
        }
        return null;
    }

    public static final boolean x(gg7 gg7Var, float f) {
        bp2 bp2Var = gg7Var.a;
        if (f >= 0.0f || ((Number) bp2Var.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) bp2Var.invoke()).floatValue() < ((Number) gg7Var.b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean y(gg7 gg7Var) {
        bp2 bp2Var = gg7Var.a;
        if (((Number) bp2Var.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) bp2Var.invoke()).floatValue();
        ((Number) gg7Var.b.invoke()).floatValue();
        return false;
    }

    public static final boolean z(gg7 gg7Var) {
        bp2 bp2Var = gg7Var.a;
        if (((Number) bp2Var.invoke()).floatValue() < ((Number) gg7Var.b.invoke()).floatValue()) {
            return true;
        }
        ((Number) bp2Var.invoke()).floatValue();
        return false;
    }

    public final int A(int i) {
        if (i == this.d.getSemanticsOwner().a().g) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(androidx.compose.ui.semantics.c r20, defpackage.kn7 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = defpackage.yq3.a
            za5 r3 = new za5
            r3.<init>()
            r4 = 4
            java.util.List r5 = androidx.compose.ui.semantics.c.j(r4, r1)
            androidx.compose.ui.node.h r6 = r1.c
            int r7 = r5.size()
            r8 = 0
            r9 = r8
        L1a:
            if (r9 >= r7) goto L40
            java.lang.Object r10 = r5.get(r9)
            androidx.compose.ui.semantics.c r10 = (androidx.compose.ui.semantics.c) r10
            pq3 r11 = r0.s()
            int r10 = r10.g
            boolean r11 = r11.a(r10)
            if (r11 == 0) goto L3d
            za5 r11 = r2.b
            boolean r11 = r11.b(r10)
            if (r11 != 0) goto L3a
            r0.w(r6)
            return
        L3a:
            r3.a(r10)
        L3d:
            int r9 = r9 + 1
            goto L1a
        L40:
            za5 r2 = r2.b
            int[] r5 = r2.b
            long[] r2 = r2.a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8b
            r9 = r8
        L4c:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L86
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L66:
            if (r14 >= r12) goto L84
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L80
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]
            boolean r15 = r3.b(r15)
            if (r15 != 0) goto L80
            r0.w(r6)
            return
        L80:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L66
        L84:
            if (r12 != r13) goto L8b
        L86:
            if (r9 == r7) goto L8b
            int r9 = r9 + 1
            goto L4c
        L8b:
            java.util.List r1 = androidx.compose.ui.semantics.c.j(r4, r1)
            int r2 = r1.size()
        L93:
            if (r8 >= r2) goto Lb9
            java.lang.Object r3 = r1.get(r8)
            androidx.compose.ui.semantics.c r3 = (androidx.compose.ui.semantics.c) r3
            ya5 r4 = r0.H
            int r5 = r3.g
            java.lang.Object r4 = r4.b(r5)
            kn7 r4 = (defpackage.kn7) r4
            if (r4 == 0) goto Lb6
            pq3 r5 = r0.s()
            int r6 = r3.g
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Lb6
            r0.B(r3, r4)
        Lb6:
            int r8 = r8 + 1
            goto L93
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.c.B(androidx.compose.ui.semantics.c, kn7):void");
    }

    public final boolean C(AccessibilityEvent accessibilityEvent) {
        if (!v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.p = true;
        }
        try {
            return ((Boolean) ((AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1) this.f).invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.p = false;
        }
    }

    public final boolean D(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !v()) {
            return false;
        }
        AccessibilityEvent accessibilityEventO = o(i, i2);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(k94.a(list, ",", null, 62));
        }
        return C(accessibilityEventO);
    }

    public final void F(String str, int i, int i2) {
        AccessibilityEvent accessibilityEventO = o(A(i), 32);
        accessibilityEventO.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        C(accessibilityEventO);
    }

    public final void G(int i) {
        ff ffVar = this.z;
        if (ffVar != null) {
            androidx.compose.ui.semantics.c cVar = (androidx.compose.ui.semantics.c) ffVar.f;
            if (i != cVar.g) {
                return;
            }
            if (SystemClock.uptimeMillis() - ffVar.b <= 1000) {
                AccessibilityEvent accessibilityEventO = o(A(cVar.g), 131072);
                accessibilityEventO.setFromIndex(ffVar.d);
                accessibilityEventO.setToIndex(ffVar.e);
                accessibilityEventO.setAction(ffVar.a);
                accessibilityEventO.setMovementGranularity(ffVar.c);
                accessibilityEventO.getText().add(t(cVar));
                C(accessibilityEventO);
            }
        }
        this.z = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:216:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(defpackage.pq3 r59) {
        /*
            Method dump skipped, instruction units count: 1694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.c.H(pq3):void");
    }

    public final void I(androidx.compose.ui.node.h hVar, za5 za5Var) {
        en7 en7VarH;
        androidx.compose.ui.node.h hVarW;
        if (hVar.U() && !this.d.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(hVar)) {
            if (!hVar.H.f(8)) {
                hVar = wq2.w(hVar, new dp2() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(((androidx.compose.ui.node.h) obj).H.f(8));
                    }
                });
            }
            if (hVar == null || (en7VarH = hVar.H()) == null) {
                return;
            }
            if (!en7VarH.c && (hVarW = wq2.w(hVar, new dp2() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1
                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    en7 en7VarH2 = ((androidx.compose.ui.node.h) obj).H();
                    boolean z = false;
                    if (en7VarH2 != null && en7VarH2.c) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            })) != null) {
                hVar = hVarW;
            }
            int i = hVar.b;
            if (za5Var.a(i)) {
                E(this, A(i), 2048, 1, 8);
            }
        }
    }

    public final void J(androidx.compose.ui.node.h hVar) {
        if (hVar.U() && !this.d.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(hVar)) {
            int i = hVar.b;
            gg7 gg7Var = (gg7) this.q.b(i);
            gg7 gg7Var2 = (gg7) this.r.b(i);
            if (gg7Var == null && gg7Var2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventO = o(i, 4096);
            if (gg7Var != null) {
                accessibilityEventO.setScrollX((int) ((Number) gg7Var.a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollX((int) ((Number) gg7Var.b.invoke()).floatValue());
            }
            if (gg7Var2 != null) {
                accessibilityEventO.setScrollY((int) ((Number) gg7Var2.a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollY((int) ((Number) gg7Var2.b.invoke()).floatValue());
            }
            C(accessibilityEventO);
        }
    }

    public final boolean K(androidx.compose.ui.semantics.c cVar, int i, int i2, boolean z) {
        String strT;
        en7 en7Var = cVar.d;
        int i3 = cVar.g;
        androidx.compose.ui.semantics.g gVar = androidx.compose.ui.semantics.a.j;
        if (en7Var.a.c(gVar) && wq2.c(cVar)) {
            rp2 rp2Var = (rp2) ((e3) cVar.d.d(gVar)).b;
            if (rp2Var != null) {
                return ((Boolean) rp2Var.a(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.u) && (strT = t(cVar)) != null) {
            if (i < 0 || i != i2 || i2 > strT.length()) {
                i = -1;
            }
            this.u = i;
            boolean z2 = strT.length() > 0;
            C(p(A(i3), z2 ? Integer.valueOf(this.u) : null, z2 ? Integer.valueOf(this.u) : null, z2 ? Integer.valueOf(strT.length()) : null, strT));
            G(i3);
            return true;
        }
        return false;
    }

    public final Rect M(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        AndroidComposeView androidComposeView = this.d;
        long jS = androidComposeView.s(jFloatToRawIntBits);
        long jS2 = androidComposeView.s((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jS >> 32);
        int i2 = (int) (jS2 >> 32);
        int i3 = (int) (jS & 4294967295L);
        int i4 = (int) (jS2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0135, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013f, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0141, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q() {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.c.Q():void");
    }

    @Override // defpackage.h3
    public final nm5 b(View view) {
        return this.k;
    }

    public final void j(int i, t3 t3Var, String str, Bundle bundle) {
        androidx.compose.ui.semantics.c cVar;
        xr7 xr7Var;
        int i2;
        AndroidComposeView androidComposeView;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = t3Var.a;
        ln7 ln7Var = (ln7) s().b(i);
        if (ln7Var == null || (cVar = ln7Var.a) == null) {
            return;
        }
        androidx.compose.ui.node.h hVar = cVar.c;
        en7 en7Var = cVar.d;
        rb5 rb5Var = en7Var.a;
        String strT = t(cVar);
        if (js3.i(str, this.E)) {
            int iD = this.C.d(i);
            if (iD != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (js3.i(str, this.F)) {
            int iD2 = this.D.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        boolean zC = rb5Var.c(androidx.compose.ui.semantics.a.a);
        AndroidComposeView androidComposeView2 = this.d;
        if (zC && bundle != null && js3.i(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i4 > 0 && i3 >= 0) {
                if (i3 < (strT != null ? strT.length() : Integer.MAX_VALUE)) {
                    ri8 ri8VarI = a27.i(en7Var);
                    if (ri8VarI == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i3 + i5;
                        if (i6 >= ri8VarI.a.a.b.length()) {
                            arrayList.add(null);
                            i2 = i5;
                            androidComposeView = androidComposeView2;
                        } else {
                            sy6 sy6VarB = ri8VarI.b(i6);
                            androidx.compose.ui.node.m mVarD = cVar.d();
                            long jK = 0;
                            if (mVarD != null) {
                                if (!mVarD.J0().n) {
                                    mVarD = null;
                                }
                                if (mVarD != null) {
                                    jK = mVarD.K(0L);
                                }
                            }
                            sy6 sy6VarI = sy6VarB.i(jK);
                            sy6 sy6VarG = cVar.g();
                            sy6 sy6VarE = sy6VarI.g(sy6VarG) ? sy6VarI.e(sy6VarG) : null;
                            if (sy6VarE != null) {
                                long jS = androidComposeView2.s((((long) Float.floatToRawIntBits(sy6VarE.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(sy6VarE.a)) << 32));
                                long jS2 = androidComposeView2.s((((long) Float.floatToRawIntBits(sy6VarE.d)) & 4294967295L) | (((long) Float.floatToRawIntBits(sy6VarE.c)) << 32));
                                int i7 = (int) (jS >> 32);
                                int i8 = i5;
                                int i9 = (int) (jS2 >> 32);
                                AndroidComposeView androidComposeView3 = androidComposeView2;
                                int i10 = (int) (jS & 4294967295L);
                                androidComposeView = androidComposeView3;
                                i2 = i8;
                                int i11 = (int) (jS2 & 4294967295L);
                                rectF = new RectF(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i9)), Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i9)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)));
                            } else {
                                i2 = i5;
                                androidComposeView = androidComposeView2;
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i5 = i2 + 1;
                        androidComposeView2 = androidComposeView;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            t0.d("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        androidx.compose.ui.semantics.g gVar = androidx.compose.ui.semantics.d.z;
        if (rb5Var.c(gVar) && bundle != null && js3.i(str, "androidx.compose.ui.semantics.testTag")) {
            String str2 = (String) androidx.compose.ui.semantics.b.a(en7Var, gVar);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (js3.i(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, cVar.g);
            return;
        }
        if (js3.i(str, "androidx.compose.ui.semantics.shapeType")) {
            xr7 xr7Var2 = (xr7) androidx.compose.ui.semantics.b.a(en7Var, androidx.compose.ui.semantics.d.P);
            if (xr7Var2 != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                sy6 sy6VarU = u(cVar, rect, xr7Var2);
                float f = sy6VarU.b;
                float f2 = sy6VarU.a;
                rq4 rq4VarA = xr7Var2.a(sy6VarU.c(), hVar.B, androidComposeView2.getDensity());
                if (rq4VarA instanceof ww5) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(rq4VarA, f2, f));
                    return;
                } else if (rq4VarA instanceof xw5) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(rq4VarA, f2, f));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", N(rq4VarA));
                    return;
                } else {
                    if (!(rq4VarA instanceof vw5)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", O(rq4VarA, f2, f));
                    return;
                }
            }
            return;
        }
        if (js3.i(str, "androidx.compose.ui.semantics.shapeRect")) {
            xr7 xr7Var3 = (xr7) androidx.compose.ui.semantics.b.a(en7Var, androidx.compose.ui.semantics.d.P);
            if (xr7Var3 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                sy6 sy6VarU2 = u(cVar, rect2, xr7Var3);
                Rect rectL = L(xr7Var3.a(sy6VarU2.c(), hVar.B, androidComposeView2.getDensity()), sy6VarU2.a, sy6VarU2.b);
                if (rectL != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectL);
                    return;
                }
                return;
            }
            return;
        }
        if (js3.i(str, "androidx.compose.ui.semantics.shapeCorners")) {
            xr7 xr7Var4 = (xr7) androidx.compose.ui.semantics.b.a(en7Var, androidx.compose.ui.semantics.d.P);
            if (xr7Var4 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] fArrN = N(xr7Var4.a(u(cVar, rect3, xr7Var4).c(), hVar.B, androidComposeView2.getDensity()));
                if (fArrN != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrN);
                    return;
                }
                return;
            }
            return;
        }
        if (!js3.i(str, "androidx.compose.ui.semantics.shapeRegion") || (xr7Var = (xr7) androidx.compose.ui.semantics.b.a(en7Var, androidx.compose.ui.semantics.d.P)) == null) {
            return;
        }
        Rect rect4 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect4);
        sy6 sy6VarU3 = u(cVar, rect4, xr7Var);
        Region regionO = O(xr7Var.a(sy6VarU3.c(), hVar.B, androidComposeView2.getDensity()), sy6VarU3.a, sy6VarU3.b);
        if (regionO != null) {
            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionO);
        }
    }

    public final Rect k(ln7 ln7Var) {
        vq3 vq3Var = ln7Var.b;
        return M(vq3Var.a, vq3Var.b, vq3Var.c, vq3Var.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f2, code lost:
    
        if (kotlinx.coroutines.a.e(r5, r2) == r3) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005d, B:28:0x006f, B:30:0x0077, B:32:0x0080, B:34:0x0086, B:35:0x0095, B:37:0x009d, B:20:0x0047, B:23:0x004e), top: B:57:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00f2 -> B:50:0x00f5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(kotlin.coroutines.jvm.internal.ContinuationImpl r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.c.l(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(int r23, long r24, boolean r26) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.c.m(int, long, boolean):boolean");
    }

    public final void n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (v()) {
                B(this.d.getSemanticsOwner().a(), this.I);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                H(s());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    Q();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent o(int i, int i2) {
        ln7 ln7Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.d;
        accessibilityEventObtain.setPackageName(androidComposeView.getContext().getPackageName());
        accessibilityEventObtain.setSource(androidComposeView, i);
        if (v() && (ln7Var = (ln7) s().b(i)) != null) {
            androidx.compose.ui.semantics.c cVar = ln7Var.a;
            accessibilityEventObtain.setPassword(cVar.d.a.c(androidx.compose.ui.semantics.d.K));
            boolean zI = js3.i(androidx.compose.ui.semantics.b.a(cVar.d, androidx.compose.ui.semantics.d.n), Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                i3.w(accessibilityEventObtain, zI);
            }
        }
        return accessibilityEventObtain;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.i = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.i = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager.isEnabled()) {
            this.i = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.j.removeCallbacks(this.L);
        AccessibilityManager accessibilityManager = this.g;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final AccessibilityEvent p(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final int q(androidx.compose.ui.semantics.c cVar) {
        en7 en7Var = cVar.d;
        en7 en7Var2 = cVar.d;
        androidx.compose.ui.semantics.g gVar = androidx.compose.ui.semantics.d.a;
        if (!en7Var.a.c(androidx.compose.ui.semantics.d.a)) {
            androidx.compose.ui.semantics.g gVar2 = androidx.compose.ui.semantics.d.G;
            if (en7Var2.a.c(gVar2)) {
                return (int) (((zi8) en7Var2.d(gVar2)).a & 4294967295L);
            }
        }
        return this.u;
    }

    public final int r(androidx.compose.ui.semantics.c cVar) {
        en7 en7Var = cVar.d;
        en7 en7Var2 = cVar.d;
        androidx.compose.ui.semantics.g gVar = androidx.compose.ui.semantics.d.a;
        if (!en7Var.a.c(androidx.compose.ui.semantics.d.a)) {
            androidx.compose.ui.semantics.g gVar2 = androidx.compose.ui.semantics.d.G;
            if (en7Var2.a.c(gVar2)) {
                return (int) (((zi8) en7Var2.d(gVar2)).a >> 32);
            }
        }
        return this.u;
    }

    public final pq3 s() {
        if (this.y) {
            this.y = false;
            AndroidComposeView androidComposeView = this.d;
            this.A = s7.s(androidComposeView.getSemanticsOwner(), new dp2() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1
                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    en7 en7VarK = ((androidx.compose.ui.semantics.c) obj).k();
                    return Boolean.valueOf(en7VarK.a.c(androidx.compose.ui.semantics.d.A));
                }
            });
            if (v()) {
                final ya5 ya5Var = this.A;
                final Resources resources = androidComposeView.getContext().getResources();
                wa5 wa5Var = this.C;
                wa5Var.a();
                wa5 wa5Var2 = this.D;
                wa5Var2.a();
                ln7 ln7Var = (ln7) ya5Var.b(-1);
                androidx.compose.ui.semantics.c cVar = ln7Var != null ? ln7Var.a : null;
                js3.m(cVar);
                ArrayList arrayListB = androidx.compose.ui.semantics.h.b(cVar, new dp2() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(ya5Var.a(((androidx.compose.ui.semantics.c) obj).g));
                    }
                }, new dp2() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(wq2.d((androidx.compose.ui.semantics.c) obj, resources));
                    }
                }, br9.B(cVar));
                int iY = br9.y(arrayListB);
                int i = 1;
                if (1 <= iY) {
                    while (true) {
                        int i2 = ((androidx.compose.ui.semantics.c) arrayListB.get(i - 1)).g;
                        int i3 = ((androidx.compose.ui.semantics.c) arrayListB.get(i)).g;
                        wa5Var.f(i2, i3);
                        wa5Var2.f(i3, i2);
                        if (i == iY) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.A;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0075 A[LOOP:0: B:4:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078 A[EDGE_INSN: B:47:0x0078->B:37:0x0078 BREAK  A[LOOP:0: B:4:0x0016->B:36:0x0075], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.sy6 u(androidx.compose.ui.semantics.c r10, android.graphics.Rect r11, defpackage.xr7 r12) {
        /*
            r9 = this;
            gf r0 = new gf
            r0.<init>(r12)
            androidx.compose.ui.node.h r10 = r10.c
            z4 r12 = r10.H
            java.lang.Object r12 = r12.g
            gx4 r12 = (defpackage.gx4) r12
            int r1 = r12.d
            r1 = r1 & 8
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L78
        L16:
            if (r12 == 0) goto L78
            int r1 = r12.c
            r1 = r1 & 8
            if (r1 == 0) goto L6f
            r1 = r12
            r5 = r4
        L20:
            if (r1 == 0) goto L6f
            boolean r6 = r1 instanceof defpackage.in7
            if (r6 == 0) goto L32
            r6 = r1
            in7 r6 = (defpackage.in7) r6
            r6.k0(r0)
            boolean r6 = r0.a
            if (r6 == 0) goto L6a
            r4 = r1
            goto L78
        L32:
            int r6 = r1.c
            r6 = r6 & 8
            if (r6 == 0) goto L6a
            boolean r6 = r1 instanceof defpackage.ti1
            if (r6 == 0) goto L6a
            r6 = r1
            ti1 r6 = (defpackage.ti1) r6
            gx4 r6 = r6.p
            r7 = r3
        L42:
            if (r6 == 0) goto L67
            int r8 = r6.c
            r8 = r8 & 8
            if (r8 == 0) goto L64
            int r7 = r7 + 1
            if (r7 != r2) goto L50
            r1 = r6
            goto L64
        L50:
            if (r5 != 0) goto L5b
            zb5 r5 = new zb5
            r8 = 16
            gx4[] r8 = new defpackage.gx4[r8]
            r5.<init>(r3, r8)
        L5b:
            if (r1 == 0) goto L61
            r5.b(r1)
            r1 = r4
        L61:
            r5.b(r6)
        L64:
            gx4 r6 = r6.f
            goto L42
        L67:
            if (r7 != r2) goto L6a
            goto L20
        L6a:
            gx4 r1 = defpackage.y40.j(r5)
            goto L20
        L6f:
            int r1 = r12.d
            r1 = r1 & 8
            if (r1 == 0) goto L78
            gx4 r12 = r12.f
            goto L16
        L78:
            in7 r4 = (defpackage.in7) r4
            if (r4 == 0) goto Lbb
            r12 = r4
            gx4 r12 = (defpackage.gx4) r12
            gx4 r12 = r12.a
            boolean r12 = r12.n
            if (r12 != r2) goto Lbb
            androidx.compose.ui.node.m r10 = defpackage.y40.G(r4)
            v04 r12 = defpackage.c26.t(r10)
            sy6 r10 = r12.I(r10, r2)
            float r12 = r10.a
            float r0 = r10.b
            float r1 = r10.c
            float r10 = r10.d
            android.graphics.Rect r10 = r9.M(r12, r0, r1, r10)
            int r12 = r10.left
            int r0 = r11.left
            int r12 = r12 - r0
            float r12 = (float) r12
            int r0 = r10.top
            int r11 = r11.top
            int r0 = r0 - r11
            float r11 = (float) r0
            sy6 r0 = new sy6
            int r1 = r10.width()
            float r1 = (float) r1
            float r1 = r1 + r12
            int r10 = r10.height()
            float r10 = (float) r10
            float r10 = r10 + r11
            r0.<init>(r12, r11, r1, r10)
            return r0
        Lbb:
            z4 r10 = r10.H
            java.lang.Object r10 = r10.e
            androidx.compose.ui.node.m r10 = (androidx.compose.ui.node.m) r10
            sy6 r10 = defpackage.c26.n(r10, r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.c.u(androidx.compose.ui.semantics.c, android.graphics.Rect, xr7):sy6");
    }

    public final boolean v() {
        AccessibilityManager accessibilityManager = this.g;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.i;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.i = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final void w(androidx.compose.ui.node.h hVar) {
        if (this.w.add(hVar)) {
            this.x.o(tx8.a);
        }
    }
}
