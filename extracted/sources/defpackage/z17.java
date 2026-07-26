package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z17 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;

    /* JADX WARN: Removed duplicated region for block: B:35:0x0064 A[LOOP:0: B:4:0x000d->B:35:0x0064, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0067 A[EDGE_INSN: B:43:0x0067->B:36:0x0067 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0064], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.semantics.c a(androidx.compose.ui.node.h r9, boolean r10) {
        /*
            z4 r0 = r9.H
            java.lang.Object r0 = r0.g
            gx4 r0 = (defpackage.gx4) r0
            int r1 = r0.d
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L67
        Ld:
            if (r0 == 0) goto L67
            int r1 = r0.c
            r1 = r1 & 8
            if (r1 == 0) goto L5e
            r1 = r0
            r3 = r2
        L17:
            if (r1 == 0) goto L5e
            boolean r4 = r1 instanceof defpackage.in7
            if (r4 == 0) goto L1f
            r2 = r1
            goto L67
        L1f:
            int r4 = r1.c
            r4 = r4 & 8
            if (r4 == 0) goto L59
            boolean r4 = r1 instanceof defpackage.ti1
            if (r4 == 0) goto L59
            r4 = r1
            ti1 r4 = (defpackage.ti1) r4
            gx4 r4 = r4.p
            r5 = 0
            r6 = r5
        L30:
            r7 = 1
            if (r4 == 0) goto L56
            int r8 = r4.c
            r8 = r8 & 8
            if (r8 == 0) goto L53
            int r6 = r6 + 1
            if (r6 != r7) goto L3f
            r1 = r4
            goto L53
        L3f:
            if (r3 != 0) goto L4a
            zb5 r3 = new zb5
            r7 = 16
            gx4[] r7 = new defpackage.gx4[r7]
            r3.<init>(r5, r7)
        L4a:
            if (r1 == 0) goto L50
            r3.b(r1)
            r1 = r2
        L50:
            r3.b(r4)
        L53:
            gx4 r4 = r4.f
            goto L30
        L56:
            if (r6 != r7) goto L59
            goto L17
        L59:
            gx4 r1 = defpackage.y40.j(r3)
            goto L17
        L5e:
            int r1 = r0.d
            r1 = r1 & 8
            if (r1 == 0) goto L67
            gx4 r0 = r0.f
            goto Ld
        L67:
            defpackage.js3.m(r2)
            in7 r2 = (defpackage.in7) r2
            gx4 r2 = (defpackage.gx4) r2
            gx4 r0 = r2.a
            en7 r1 = r9.H()
            if (r1 != 0) goto L7b
            en7 r1 = new en7
            r1.<init>()
        L7b:
            androidx.compose.ui.semantics.c r2 = new androidx.compose.ui.semantics.c
            r2.<init>(r0, r10, r9, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z17.a(androidx.compose.ui.node.h, boolean):androidx.compose.ui.semantics.c");
    }

    public static final n22 b(u79 u79Var) {
        pj9 pj9Var = new pj9(23);
        pj9Var.k(g27.a(n22.class), new g39(5));
        z7 z7VarM = pj9Var.m();
        j71 j71Var = j71.b;
        js3.p(u79Var, "store");
        js3.p(j71Var, "extras");
        o77 o77Var = new o77(u79Var, z7VarM, j71Var);
        ps0 ps0VarA = g27.a(n22.class);
        String strB = ps0VarA.b();
        if (strB != null) {
            return (n22) o77Var.u(ps0VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static final int c(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void f(String str) {
        js3.p(str, "key");
        throw new IllegalArgumentException(o40.y("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public Type e() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        wn5.g(genericSuperclass, "%s isn't parameterized", genericSuperclass instanceof ParameterizedType);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
