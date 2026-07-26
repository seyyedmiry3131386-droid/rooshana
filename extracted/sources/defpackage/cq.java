package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.FastDownloadView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cq extends a79 {
    public final AppIconView v;
    public final MyketTextView w;
    public final ConstraintLayout x;
    public final MyketTextView y;
    public final FastDownloadView z;

    public cq(ea1 ea1Var, View view, AppIconView appIconView, MyketTextView myketTextView, ConstraintLayout constraintLayout, MyketTextView myketTextView2, FastDownloadView fastDownloadView) {
        super(0, view, ea1Var);
        this.v = appIconView;
        this.w = myketTextView;
        this.x = constraintLayout;
        this.y = myketTextView2;
        this.z = fastDownloadView;
    }
}
