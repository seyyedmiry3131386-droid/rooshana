package defpackage;

import android.view.View;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.FastDownloadView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cx6 extends a79 {
    public final AppIconView v;
    public final MyketTextView w;
    public final FastDownloadView x;
    public final MyketTextView y;

    public cx6(ea1 ea1Var, View view, AppIconView appIconView, MyketTextView myketTextView, FastDownloadView fastDownloadView, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = appIconView;
        this.w = myketTextView;
        this.x = fastDownloadView;
        this.y = myketTextView2;
    }
}
