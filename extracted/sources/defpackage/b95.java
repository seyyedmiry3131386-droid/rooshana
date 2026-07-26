package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.FastDownloadView;
import ir.mservices.market.views.MyketAdInfoView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b95 extends a79 {
    public static final /* synthetic */ int C = 0;
    public final FastDownloadView A;
    public final View B;
    public final MyketAdInfoView v;
    public final MyketTextView w;
    public final AppIconView x;
    public final FrameLayout y;
    public final MyketTextView z;

    public b95(ea1 ea1Var, View view, MyketAdInfoView myketAdInfoView, MyketTextView myketTextView, AppIconView appIconView, FrameLayout frameLayout, MyketTextView myketTextView2, FastDownloadView fastDownloadView, View view2) {
        super(0, view, ea1Var);
        this.v = myketAdInfoView;
        this.w = myketTextView;
        this.x = appIconView;
        this.y = frameLayout;
        this.z = myketTextView2;
        this.A = fastDownloadView;
        this.B = view2;
    }
}
