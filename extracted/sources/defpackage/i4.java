package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class i4 extends h4 {
    public static final SparseIntArray F;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(rr6.title, 5);
        sparseIntArray.put(rr6.input, 6);
        sparseIntArray.put(rr6.dialog_button, 7);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().A;
            i2 = sj8.b().v;
            i3 = sj8.b().n;
            i4 = sj8.b().m;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (j2 != 0) {
            t61.s(i2, this.w);
            this.x.setTextColor(i3);
            this.B.setTextColor(i);
            this.C.setTextColor(i4);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.E = 1L;
        }
        k0();
    }
}
