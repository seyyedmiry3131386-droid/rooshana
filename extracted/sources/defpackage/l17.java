package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l17 extends a79 {
    public final FrameLayout v;
    public final MyketTextView w;
    public final ScreenshotView x;

    public l17(ea1 ea1Var, View view, FrameLayout frameLayout, MyketTextView myketTextView, ScreenshotView screenshotView) {
        super(0, view, ea1Var);
        this.v = frameLayout;
        this.w = myketTextView;
        this.x = screenshotView;
    }
}
