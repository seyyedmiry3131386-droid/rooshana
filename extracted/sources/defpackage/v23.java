package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v23 extends a79 {
    public final LinearLayout v;
    public final ScreenshotView w;
    public final FrameLayout x;
    public final View y;

    public v23(ea1 ea1Var, View view, LinearLayout linearLayout, ScreenshotView screenshotView, FrameLayout frameLayout, View view2) {
        super(0, view, ea1Var);
        this.v = linearLayout;
        this.w = screenshotView;
        this.x = frameLayout;
        this.y = view2;
    }
}
