package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v53 extends a79 {
    public final MyketTextView A;
    public final ScreenshotView v;
    public final FrameLayout w;
    public final MyketTextView x;
    public final MyketTextView y;
    public final MyketTextView z;

    public v53(ea1 ea1Var, View view, ScreenshotView screenshotView, FrameLayout frameLayout, MyketTextView myketTextView, MyketTextView myketTextView2, MyketTextView myketTextView3, MyketTextView myketTextView4) {
        super(0, view, ea1Var);
        this.v = screenshotView;
        this.w = frameLayout;
        this.x = myketTextView;
        this.y = myketTextView2;
        this.z = myketTextView3;
        this.A = myketTextView4;
    }
}
