package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerControlView;
import ir.mservices.market.theme.AlphaColor;
import ir.mservices.market.version2.manager.player.doubleTap.DoubleTapPlayerView;
import ir.mservices.market.version2.manager.player.doubleTap.customPlayer.PlayerOverlay;
import ir.mservices.market.views.TrailerFinishedPlayingView;

/* JADX INFO: loaded from: classes3.dex */
public final class gh3 extends fh3 {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(rr6.dummy_view, 4);
        sparseIntArray.put(rr6.controller, 5);
        sparseIntArray.put(rr6.popUpGuideline, 6);
        sparseIntArray.put(rr6.trailer_finished_playing_view, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public gh3(View view) {
        Object[] objArrI0 = a79.i0(view, 8, null, D);
        PlayerControlView playerControlView = (PlayerControlView) objArrI0[5];
        View view2 = (View) objArrI0[4];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[1];
        PlayerOverlay playerOverlay = (PlayerOverlay) objArrI0[3];
        DoubleTapPlayerView doubleTapPlayerView = (DoubleTapPlayerView) objArrI0[2];
        super(null, view, playerControlView, view2, constraintLayout, playerOverlay, doubleTapPlayerView, (TrailerFinishedPlayingView) objArrI0[7]);
        this.C = -1L;
        this.x.setTag(null);
        ((FrameLayout) objArrI0[0]).setTag(null);
        this.y.setTag(null);
        this.z.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        AlphaColor alphaColor;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        long j2 = j & 1;
        if (j2 == 0 || (alphaColor = sj8.b().J) == null) {
            i = 0;
            i2 = 0;
        } else {
            i = alphaColor.f;
            i2 = alphaColor.a;
        }
        if (j2 != 0) {
            o40.D(i2, this.x);
            this.y.setBackground(new ColorDrawable(i));
            this.z.setBackground(new ColorDrawable(i2));
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.C = 1L;
        }
        k0();
    }
}
