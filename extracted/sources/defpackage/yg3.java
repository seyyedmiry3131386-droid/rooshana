package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class yg3 extends xg3 {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(rr6.backward, 1);
        sparseIntArray.put(rr6.forward, 2);
        sparseIntArray.put(rr6.play, 3);
        sparseIntArray.put(rr6.fullscreen, 4);
        sparseIntArray.put(rr6.player_current_time, 5);
        sparseIntArray.put(rr6.player_remain_time, 6);
        sparseIntArray.put(rr6.exo_progress, 7);
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.D = 0L;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.D = 1L;
        }
        k0();
    }
}
