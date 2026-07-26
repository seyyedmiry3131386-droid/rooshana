package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerControlView;
import ir.mservices.market.version2.manager.player.doubleTap.DoubleTapPlayerView;
import ir.mservices.market.version2.manager.player.doubleTap.customPlayer.PlayerOverlay;
import ir.mservices.market.views.TrailerFinishedPlayingView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fh3 extends a79 {
    public static final /* synthetic */ int B = 0;
    public final TrailerFinishedPlayingView A;
    public final PlayerControlView v;
    public final View w;
    public final ConstraintLayout x;
    public final PlayerOverlay y;
    public final DoubleTapPlayerView z;

    public fh3(ea1 ea1Var, View view, PlayerControlView playerControlView, View view2, ConstraintLayout constraintLayout, PlayerOverlay playerOverlay, DoubleTapPlayerView doubleTapPlayerView, TrailerFinishedPlayingView trailerFinishedPlayingView) {
        super(0, view, ea1Var);
        this.v = playerControlView;
        this.w = view2;
        this.x = constraintLayout;
        this.y = playerOverlay;
        this.z = doubleTapPlayerView;
        this.A = trailerFinishedPlayingView;
    }
}
