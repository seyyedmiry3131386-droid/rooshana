package defpackage;

import android.view.View;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.AppInfoView;
import ir.mservices.market.views.FastDownloadView;
import ir.mservices.market.views.MyketAdInfoView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m13 extends a79 {
    public final FastDownloadView A;
    public final MyketAdInfoView v;
    public final AppIconView w;
    public final AppInfoView x;
    public final MyketTextView y;
    public final MyketTextView z;

    public m13(ea1 ea1Var, View view, MyketAdInfoView myketAdInfoView, AppIconView appIconView, AppInfoView appInfoView, MyketTextView myketTextView, MyketTextView myketTextView2, FastDownloadView fastDownloadView) {
        super(0, view, ea1Var);
        this.v = myketAdInfoView;
        this.w = appIconView;
        this.x = appInfoView;
        this.y = myketTextView;
        this.z = myketTextView2;
        this.A = fastDownloadView;
    }
}
