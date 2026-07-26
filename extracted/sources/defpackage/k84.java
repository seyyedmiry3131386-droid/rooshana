package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.AppInfoView;
import ir.mservices.market.views.FastDownloadView;
import ir.mservices.market.views.MyketAdInfoView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k84 extends a79 {
    public final AppIconView A;
    public final MyketTextView B;
    public final MyketAdInfoView v;
    public final AppInfoView w;
    public final FrameLayout x;
    public final MyketTextView y;
    public final FastDownloadView z;

    public k84(ea1 ea1Var, View view, MyketAdInfoView myketAdInfoView, AppInfoView appInfoView, FrameLayout frameLayout, MyketTextView myketTextView, FastDownloadView fastDownloadView, AppIconView appIconView, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = myketAdInfoView;
        this.w = appInfoView;
        this.x = frameLayout;
        this.y = myketTextView;
        this.z = fastDownloadView;
        this.A = appIconView;
        this.B = myketTextView2;
    }
}
