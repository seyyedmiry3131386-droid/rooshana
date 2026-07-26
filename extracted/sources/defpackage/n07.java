package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n07 extends a79 {
    public final FrameLayout v;
    public final View w;
    public final FrameLayout x;
    public final AppIconView y;
    public final ScreenshotView z;

    public n07(ea1 ea1Var, View view, FrameLayout frameLayout, View view2, FrameLayout frameLayout2, AppIconView appIconView, ScreenshotView screenshotView) {
        super(0, view, ea1Var);
        this.v = frameLayout;
        this.w = view2;
        this.x = frameLayout2;
        this.y = appIconView;
        this.z = screenshotView;
    }
}
