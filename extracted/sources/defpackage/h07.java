package defpackage;

import android.util.SparseIntArray;
import ir.mservices.market.theme.AlphaColor;

/* JADX INFO: loaded from: classes3.dex */
public final class h07 extends g07 {
    public static final sk6 Q;
    public static final SparseIntArray R;
    public long P;

    static {
        sk6 sk6Var = new sk6(22);
        Q = sk6Var;
        sk6Var.J(5, new String[]{"reels_shimmer_layout"}, new int[]{8}, new int[]{js6.reels_shimmer_layout});
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(rr6.player_view, 9);
        sparseIntArray.put(rr6.bottom_shadow, 10);
        sparseIntArray.put(rr6.mute, 11);
        sparseIntArray.put(rr6.like, 12);
        sparseIntArray.put(rr6.icon, 13);
        sparseIntArray.put(rr6.invisibleAction, 14);
        sparseIntArray.put(rr6.action, 15);
        sparseIntArray.put(rr6.space_bottom, 16);
        sparseIntArray.put(rr6.shimmer, 17);
        sparseIntArray.put(rr6.loading_background, 18);
        sparseIntArray.put(rr6.loading, 19);
        sparseIntArray.put(rr6.space, 20);
        sparseIntArray.put(rr6.loading_group, 21);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        synchronized (this) {
            j = this.P;
            this.P = 0L;
        }
        long j2 = j & 2;
        if (j2 != 0) {
            AlphaColor alphaColor = sj8.b().J;
            AlphaColor alphaColor2 = sj8.b().I;
            int i2 = alphaColor != null ? alphaColor.a : 0;
            i = alphaColor2 != null ? alphaColor2.a : 0;
            i = i2;
        } else {
            i = 0;
        }
        if (j2 != 0) {
            t61.s(i, this.w);
            this.B.setTextColor(i);
            this.F.setTextColor(i);
            this.I.setTextColor(i);
            this.N.setTextColor(i);
            this.O.setTextColor(i);
        }
        this.M.c0();
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                if (this.P != 0) {
                    return true;
                }
                return this.M.e0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.P = 2L;
        }
        this.M.g0();
        k0();
    }
}
