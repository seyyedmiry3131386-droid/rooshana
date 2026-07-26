package defpackage;

import android.util.SparseIntArray;
import ir.mservices.market.theme.AlphaColor;

/* JADX INFO: loaded from: classes3.dex */
public final class r07 extends q07 {
    public static final sk6 T;
    public static final SparseIntArray U;
    public long S;

    static {
        sk6 sk6Var = new sk6(26);
        T = sk6Var;
        sk6Var.J(5, new String[]{"reels_shimmer_layout"}, new int[]{8}, new int[]{js6.reels_shimmer_layout});
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(rr6.exo_progress, 9);
        sparseIntArray.put(rr6.player_view, 10);
        sparseIntArray.put(rr6.space, 11);
        sparseIntArray.put(rr6.bottom_shadow, 12);
        sparseIntArray.put(rr6.controller, 13);
        sparseIntArray.put(rr6.profile, 14);
        sparseIntArray.put(rr6.profile_group, 15);
        sparseIntArray.put(rr6.download, 16);
        sparseIntArray.put(rr6.download_icon, 17);
        sparseIntArray.put(rr6.mute, 18);
        sparseIntArray.put(rr6.small_like, 19);
        sparseIntArray.put(rr6.big_like, 20);
        sparseIntArray.put(rr6.shimmer, 21);
        sparseIntArray.put(rr6.loading_background, 22);
        sparseIntArray.put(rr6.loading, 23);
        sparseIntArray.put(rr6.space, 24);
        sparseIntArray.put(rr6.loading_group, 25);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        synchronized (this) {
            j = this.S;
            this.S = 0L;
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
            t61.s(i, this.v);
            this.z.setTextColor(i);
            this.D.setTextColor(i);
            this.H.setTextColor(i);
            this.J.setTextColor(i);
            this.N.setTextColor(i);
        }
        this.Q.c0();
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                if (this.S != 0) {
                    return true;
                }
                return this.Q.e0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.S = 2L;
        }
        this.Q.g0();
        k0();
    }
}
