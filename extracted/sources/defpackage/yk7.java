package defpackage;

import android.animation.ValueAnimator;
import ir.mservices.market.version2.manager.player.doubleTap.customPlayer.views.SecondsView;

/* JADX INFO: loaded from: classes3.dex */
public final class yk7 extends ValueAnimator {
    public yk7(SecondsView secondsView, bp2 bp2Var, dp2 dp2Var, bp2 bp2Var2) {
        setDuration(secondsView.getCycleDuration() / ((long) 5));
        setFloatValues(0.0f, 1.0f);
        addUpdateListener(new qj(19, dp2Var));
        addListener(new ur0(bp2Var, bp2Var2));
    }
}
