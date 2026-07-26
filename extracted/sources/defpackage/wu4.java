package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class wu4 extends vu4 {
    public static final SparseIntArray A;
    public long z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(rr6.content, 1);
        sparseIntArray.put(rr6.icon, 2);
        sparseIntArray.put(rr6.text, 3);
        sparseIntArray.put(rr6.moreDescription, 4);
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.z = 0L;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.z = 1L;
        }
        k0();
    }
}
