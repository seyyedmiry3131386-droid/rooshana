package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.compose.foundation.text.selection.f;
import androidx.compose.foundation.text.selection.h;
import androidx.compose.runtime.internal.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iz implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iz(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        if (r1.M() == r6.f(r3, r7, false).c) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object b(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.b
            androidx.media3.ui.compose.state.c r0 = (androidx.media3.ui.compose.state.c) r0
            java.lang.Object r1 = r5.c
            gb6 r1 = (defpackage.gb6) r1
            gb6 r6 = (defpackage.gb6) r6
            db6 r7 = (defpackage.db6) r7
            java.lang.String r2 = "$this$listen"
            defpackage.js3.p(r6, r2)
            java.lang.String r2 = "events"
            defpackage.js3.p(r7, r2)
            vd2 r7 = r7.a
            android.util.SparseBooleanArray r2 = r7.a
            r3 = 25
            boolean r2 = r2.get(r3)
            r3 = 1
            if (r2 == 0) goto L43
            w59 r2 = r6.r()
            w59 r4 = defpackage.w59.d
            boolean r2 = defpackage.js3.i(r2, r4)
            if (r2 != 0) goto L43
            int r6 = r6.e()
            if (r6 == r3) goto L43
            r0.getClass()
            ey7 r6 = androidx.media3.ui.compose.state.c.a(r1)
            wb5 r2 = r0.a
            s08 r2 = (defpackage.s08) r2
            r2.setValue(r6)
        L43:
            r6 = 26
            android.util.SparseBooleanArray r2 = r7.a
            boolean r6 = r2.get(r6)
            if (r6 == 0) goto L56
            wb5 r6 = r0.b
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            s08 r6 = (defpackage.s08) r6
            r6.setValue(r2)
        L56:
            r6 = 2
            android.util.SparseBooleanArray r7 = r7.a
            boolean r6 = r7.get(r6)
            if (r6 == 0) goto Lc2
            r0.getClass()
            r6 = 17
            boolean r6 = r1.f0(r6)
            if (r6 == 0) goto L6f
            bm8 r6 = r1.S()
            goto L71
        L6f:
            xl8 r6 = defpackage.bm8.a
        L71:
            defpackage.js3.m(r6)
            boolean r7 = r6.p()
            r2 = 0
            if (r7 == 0) goto L7e
            r0.c = r2
            goto Lbf
        L7e:
            yl8 r7 = new yl8
            r7.<init>()
            r4 = 30
            boolean r4 = r1.f0(r4)
            if (r4 == 0) goto La4
            rp8 r4 = r1.G()
            com.google.common.collect.ImmutableList r4 = r4.a
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto La4
            int r2 = r1.p()
            yl8 r6 = r6.f(r2, r7, r3)
            java.lang.Object r6 = r6.b
            r0.c = r6
            goto Lbf
        La4:
            java.lang.Object r3 = r0.c
            if (r3 == 0) goto Lbf
            int r3 = r6.b(r3)
            r4 = -1
            if (r3 == r4) goto Lbd
            r4 = 0
            yl8 r6 = r6.f(r3, r7, r4)
            int r6 = r6.c
            int r7 = r1.M()
            if (r7 != r6) goto Lbd
            goto Lc2
        Lbd:
            r0.c = r2
        Lbf:
            r0.b(r1)
        Lc2:
            tx8 r6 = defpackage.tx8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz.b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object d(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ib7.a((hx4) this.b, (a) this.c, (qz0) obj, hs9.W(49));
        return tx8.a;
    }

    private final Object e(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ((u96) this.b).g((Drawable) this.c, (qz0) obj, hs9.W(49));
        return tx8.a;
    }

    private final Object f(Object obj, Object obj2) {
        zi8 zi8Var;
        f fVar = (f) this.b;
        e71 e71Var = (e71) this.c;
        xf8 xf8Var = (xf8) obj;
        Context context = (Context) obj2;
        boolean zM = fVar.m();
        ll llVarP = fVar.p();
        String str = llVarP != null ? llVarP.b : null;
        zi8 zi8Var2 = fVar.v;
        if (zi8Var2 != null) {
            long j = zi8Var2.a;
            rr5 rr5Var = fVar.b;
            zi8Var = new zi8(uy6.b(rr5Var.q((int) (j >> 32)), rr5Var.q((int) (j & 4294967295L))));
        } else {
            zi8Var = null;
        }
        x96 x96Var = fVar.i;
        h hVar = new h(fVar, e71Var, context);
        u58 u58Var = z96.a;
        if (Build.VERSION.SDK_INT < 28 || str == null || zi8Var == null || x96Var == null || !(x96Var instanceof androidx.compose.foundation.text.selection.a)) {
            hVar.invoke(xf8Var);
            if (str != null && zi8Var != null) {
                gu9.k(xf8Var, context, zM, str, zi8Var.a);
            }
        } else {
            String str2 = str;
            ((androidx.compose.foundation.text.selection.a) x96Var).b(xf8Var, str2, zi8Var.a, hVar);
            gu9.k(xf8Var, context, zM, str2, zi8Var.a);
        }
        return tx8.a;
    }

    private final Object j(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        mi8.a((gj8) this.b, (a) this.c, (qz0) obj, hs9.W(1));
        return tx8.a;
    }

    private final Object l(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        uj8.a((tj8) this.b, (a) this.c, (qz0) obj, hs9.W(49));
        return tx8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:208:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0678 A[LOOP:4: B:235:0x0678->B:239:0x0688, LOOP_START, PHI: r1 r9
      0x0678: PHI (r1v94 java.util.List) = (r1v60 java.util.List), (r1v95 java.util.List) binds: [B:234:0x0676, B:239:0x0688] A[DONT_GENERATE, DONT_INLINE]
      0x0678: PHI (r9v81 int) = (r9v16 int), (r9v82 int) binds: [B:234:0x0676, B:239:0x0688] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0693 A[LOOP:5: B:242:0x0693->B:249:0x06b2, LOOP_START, PHI: r1 r5
      0x0693: PHI (r1v90 java.util.List) = (r1v61 java.util.List), (r1v91 java.util.List) binds: [B:241:0x0691, B:249:0x06b2] A[DONT_GENERATE, DONT_INLINE]
      0x0693: PHI (r5v80 int) = (r5v32 int), (r5v84 int) binds: [B:241:0x0691, B:249:0x06b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06c1 A[LOOP:6: B:253:0x06bf->B:254:0x06c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0762 A[LOOP:9: B:279:0x0760->B:280:0x0762, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0a5e  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0a71  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0a84  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0a9a  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0abc  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0ac1  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0ac4  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0ac9  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0ad0  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0ad5  */
    /* JADX WARN: Type inference failed for: r2v4, types: [c24, java.lang.Object] */
    @Override // defpackage.qp2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r58, java.lang.Object r59) {
        /*
            Method dump skipped, instruction units count: 3418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ iz(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
