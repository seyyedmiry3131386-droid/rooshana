package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class cl9 implements Iterable, xk9 {
    public final String a;

    public cl9(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.a = str;
    }

    @Override // defpackage.xk9
    public final Iterator a() {
        return new al9(0, this);
    }

    @Override // defpackage.xk9
    public final Boolean c() {
        return Boolean.valueOf(!this.a.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cl9) {
            return this.a.equals(((cl9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.xk9
    public final Double i() {
        String str = this.a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new al9(1, this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ec A[PHI: r7
      0x02ec: PHI (r7v6 boolean) = (r7v13 boolean), (r7v14 boolean), (r7v17 boolean) binds: [B:100:0x02d8, B:101:0x02da, B:103:0x02ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f6 A[LOOP:0: B:108:0x02f4->B:109:0x02f6, LOOP_END] */
    @Override // defpackage.xk9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.xk9 j(java.lang.String r28, defpackage.o77 r29, java.util.ArrayList r30) {
        /*
            Method dump skipped, instruction units count: 1616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cl9.j(java.lang.String, o77, java.util.ArrayList):xk9");
    }

    @Override // defpackage.xk9
    public final String l() {
        return this.a;
    }

    @Override // defpackage.xk9
    public final xk9 m() {
        return new cl9(this.a);
    }

    public final String toString() {
        String str = this.a;
        return bl4.z(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }
}
