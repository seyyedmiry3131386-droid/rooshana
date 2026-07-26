package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class ba5 {
    public final rb5 a;

    public /* synthetic */ ba5(rb5 rb5Var) {
        this.a = rb5Var;
    }

    public static final void a(rb5 rb5Var, Object obj, Object obj2) {
        int iF = rb5Var.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : rb5Var.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof mb5) {
                mb5 mb5Var = (mb5) obj3;
                mb5Var.g(obj2);
                obj2 = mb5Var;
            } else {
                Object[] objArr = zq5.a;
                mb5 mb5Var2 = new mb5(2);
                mb5Var2.g(obj3);
                mb5Var2.g(obj2);
                obj2 = mb5Var2;
            }
        }
        if (!z) {
            rb5Var.c[iF] = obj2;
            return;
        }
        int i = ~iF;
        rb5Var.b[i] = obj;
        rb5Var.c[i] = obj2;
    }

    public static final Object b(rb5 rb5Var, jz4 jz4Var) {
        Object objG = rb5Var.g(jz4Var);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof mb5)) {
            rb5Var.k(jz4Var);
            return objG;
        }
        mb5 mb5Var = (mb5) objG;
        if (mb5Var.d()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i = mb5Var.b - 1;
        Object objB = mb5Var.b(i);
        mb5Var.l(i);
        js3.n(objB, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (mb5Var.d()) {
            rb5Var.k(jz4Var);
        }
        if (mb5Var.b == 1) {
            rb5Var.m(jz4Var, mb5Var.a());
        }
        return objB;
    }

    public static final void c(rb5 rb5Var, jz4 jz4Var, dp2 dp2Var) {
        Object objG = rb5Var.g(jz4Var);
        if (objG != null) {
            if (!(objG instanceof mb5)) {
                if (((Boolean) dp2Var.invoke(objG)).booleanValue()) {
                    rb5Var.k(jz4Var);
                    return;
                }
                return;
            }
            mb5 mb5Var = (mb5) objG;
            int i = mb5Var.b;
            Object[] objArr = mb5Var.a;
            int i2 = 0;
            uq3 uq3VarZ = ok4.Z(0, i);
            int i3 = uq3VarZ.a;
            int i4 = uq3VarZ.b;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((Boolean) dp2Var.invoke(objArr[i3])).booleanValue()) {
                        i2++;
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            ew.F0(i - i2, i, null, objArr);
            mb5Var.b -= i2;
            if (mb5Var.d()) {
                rb5Var.k(jz4Var);
            }
            if (mb5Var.b == 0) {
                rb5Var.m(jz4Var, mb5Var.a());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.mb5 d(defpackage.rb5 r14) {
        /*
            boolean r0 = r14.i()
            if (r0 == 0) goto Le
            mb5 r14 = defpackage.zq5.b
            java.lang.String r0 = "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>"
            defpackage.js3.n(r14, r0)
            return r14
        Le:
            mb5 r0 = new mb5
            r0.<init>()
            java.lang.Object[] r1 = r14.c
            long[] r14 = r14.a
            int r2 = r14.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L65
            r3 = 0
            r4 = r3
        L1e:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L60
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L38:
            if (r9 >= r7) goto L5e
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L5a
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof defpackage.mb5
            if (r11 == 0) goto L52
            mb5 r10 = (defpackage.mb5) r10
            r0.h(r10)
            goto L5a
        L52:
            java.lang.String r11 = "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap"
            defpackage.js3.n(r10, r11)
            r0.g(r10)
        L5a:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L38
        L5e:
            if (r7 != r8) goto L65
        L60:
            if (r4 == r2) goto L65
            int r4 = r4 + 1
            goto L1e
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba5.d(rb5):mb5");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ba5) {
            return js3.i(this.a, ((ba5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
