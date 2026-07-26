package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import ir.mservices.market.views.MyketWebView;
import ir.mservices.market.views.TryAgainView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v41 extends a79 {
    public static final /* synthetic */ int y = 0;
    public final RelativeLayout v;
    public final TryAgainView w;
    public final MyketWebView x;

    public v41(ea1 ea1Var, View view, RelativeLayout relativeLayout, TryAgainView tryAgainView, MyketWebView myketWebView) {
        super(0, view, ea1Var);
        this.v = relativeLayout;
        this.w = tryAgainView;
        this.x = myketWebView;
    }
}
