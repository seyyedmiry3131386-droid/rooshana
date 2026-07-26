package defpackage;

import androidx.collection.a;
import androidx.compose.ui.semantics.g;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class en7 implements nn7, Iterable, dx3 {
    public final rb5 a;
    public di4 b;
    public boolean c;
    public boolean d;

    public en7() {
        long[] jArr = ce7.a;
        this.a = new rb5();
    }

    @Override // defpackage.nn7
    public final void a(g gVar, Object obj) {
        boolean z = obj instanceof e3;
        rb5 rb5Var = this.a;
        if (z && rb5Var.c(gVar)) {
            Object objG = rb5Var.g(gVar);
            js3.n(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            e3 e3Var = (e3) objG;
            e3 e3Var2 = (e3) obj;
            String str = e3Var2.a;
            if (str == null) {
                str = e3Var.a;
            }
            np2 np2Var = e3Var2.b;
            if (np2Var == null) {
                np2Var = e3Var.b;
            }
            rb5Var.m(gVar, new e3(str, np2Var));
        } else {
            rb5Var.m(gVar, obj);
        }
        gVar.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.en7 c() {
        /*
            r18 = this;
            r0 = r18
            en7 r1 = new en7
            r1.<init>()
            boolean r2 = r0.c
            r1.c = r2
            boolean r2 = r0.d
            r1.d = r2
            rb5 r2 = r1.a
            r2.getClass()
            java.lang.String r3 = "from"
            rb5 r4 = r0.a
            defpackage.js3.p(r4, r3)
            java.lang.Object[] r3 = r4.b
            java.lang.Object[] r5 = r4.c
            long[] r4 = r4.a
            int r6 = r4.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L62
            r7 = 0
            r8 = r7
        L28:
            r9 = r4[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L5d
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r7
        L42:
            if (r13 >= r11) goto L5b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L57
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            r2.m(r15, r14)
        L57:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L42
        L5b:
            if (r11 != r12) goto L62
        L5d:
            if (r8 == r6) goto L62
            int r8 = r8 + 1
            goto L28
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en7.c():en7");
    }

    public final Object d(g gVar) {
        Object objG = this.a.g(gVar);
        if (objG != null) {
            return objG;
        }
        throw new IllegalStateException("Key not present: " + gVar + " - consider getOrElse or getOrNull");
    }

    public final void e(en7 en7Var) {
        rb5 rb5Var = en7Var.a;
        Object[] objArr = rb5Var.b;
        Object[] objArr2 = rb5Var.c;
        long[] jArr = rb5Var.a;
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
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        g gVar = (g) obj;
                        rb5 rb5Var2 = this.a;
                        Object objG = rb5Var2.g(gVar);
                        js3.n(gVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objInvoke = gVar.b.invoke(objG, obj2);
                        if (objInvoke != null) {
                            rb5Var2.m(gVar, objInvoke);
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en7)) {
            return false;
        }
        en7 en7Var = (en7) obj;
        return js3.i(this.a, en7Var.a) && this.c == en7Var.c && this.d == en7Var.d;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        di4 di4Var = this.b;
        if (di4Var == null) {
            rb5 rb5Var = this.a;
            rb5Var.getClass();
            di4 di4Var2 = new di4(rb5Var);
            this.b = di4Var2;
            di4Var = di4Var2;
        }
        return ((a) di4Var.entrySet()).iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.c
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.d
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            rb5 r4 = r0.a
            java.lang.Object[] r5 = r4.b
            java.lang.Object[] r6 = r4.c
            long[] r4 = r4.a
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L31:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L4b:
            if (r14 >= r12) goto L76
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L72
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            r8 = r16
            androidx.compose.ui.semantics.g r8 = (androidx.compose.ui.semantics.g) r8
            r1.append(r2)
            java.lang.String r2 = r8.a
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r15)
            r2 = r3
        L72:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4b
        L76:
            if (r12 != r13) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L31
        L7d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = defpackage.rf0.K(r0)
            r2.append(r3)
            java.lang.String r3 = "{ "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " }"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en7.toString():java.lang.String");
    }
}
