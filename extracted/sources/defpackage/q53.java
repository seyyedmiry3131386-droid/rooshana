package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q53 extends a79 {
    public final ScreenshotView v;
    public final FrameLayout w;
    public final MyketTextView x;

    public q53(ea1 ea1Var, View view, FrameLayout frameLayout, MyketTextView myketTextView, ScreenshotView screenshotView) {
        super(0, view, ea1Var);
        this.v = screenshotView;
        this.w = frameLayout;
        this.x = myketTextView;
    }
}
