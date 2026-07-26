package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;
import ir.mservices.market.views.SmallBoldTextButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x53 extends a79 {
    public final FrameLayout A;
    public final MyketTextView B;
    public final MyketTextView C;
    public final SmallBoldTextButton v;
    public final FrameLayout w;
    public final ScreenshotView x;
    public final ScreenshotView y;
    public final View z;

    public x53(ea1 ea1Var, View view, SmallBoldTextButton smallBoldTextButton, FrameLayout frameLayout, ScreenshotView screenshotView, ScreenshotView screenshotView2, View view2, FrameLayout frameLayout2, MyketTextView myketTextView, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = smallBoldTextButton;
        this.w = frameLayout;
        this.x = screenshotView;
        this.y = screenshotView2;
        this.z = view2;
        this.A = frameLayout2;
        this.B = myketTextView;
        this.C = myketTextView2;
    }
}
