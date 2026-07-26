package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.FastDownloadView;
import ir.mservices.market.views.MyketAdInfoView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r23 extends a79 {
    public final FrameLayout A;
    public final FastDownloadView B;
    public final MyketAdInfoView v;
    public final AppIconView w;
    public final View x;
    public final MyketTextView y;
    public final ScreenshotView z;

    public r23(ea1 ea1Var, View view, MyketAdInfoView myketAdInfoView, AppIconView appIconView, View view2, MyketTextView myketTextView, ScreenshotView screenshotView, FrameLayout frameLayout, FastDownloadView fastDownloadView) {
        super(0, view, ea1Var);
        this.v = myketAdInfoView;
        this.w = appIconView;
        this.x = view2;
        this.y = myketTextView;
        this.z = screenshotView;
        this.A = frameLayout;
        this.B = fastDownloadView;
    }
}
