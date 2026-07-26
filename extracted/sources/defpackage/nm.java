package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.FastDownloadView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nm extends a79 {
    public final FrameLayout v;
    public final View w;
    public final FastDownloadView x;
    public final AppIconView y;
    public final MyketTextView z;

    public nm(ea1 ea1Var, View view, FrameLayout frameLayout, View view2, FastDownloadView fastDownloadView, AppIconView appIconView, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = frameLayout;
        this.w = view2;
        this.x = fastDownloadView;
        this.y = appIconView;
        this.z = myketTextView;
    }
}
