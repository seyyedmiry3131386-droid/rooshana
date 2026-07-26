package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.AppInfoView;
import ir.mservices.market.views.MyketImageButton;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q13 extends a79 {
    public final FrameLayout A;
    public final MyketImageButton B;
    public final MyketRatingBar C;
    public final AppIconView v;
    public final AppInfoView w;
    public final MyketTextView x;
    public final MyketTextView y;
    public final MyketTextView z;

    public q13(ea1 ea1Var, View view, AppIconView appIconView, AppInfoView appInfoView, MyketTextView myketTextView, MyketTextView myketTextView2, MyketTextView myketTextView3, FrameLayout frameLayout, MyketImageButton myketImageButton, MyketRatingBar myketRatingBar) {
        super(0, view, ea1Var);
        this.v = appIconView;
        this.w = appInfoView;
        this.x = myketTextView;
        this.y = myketTextView2;
        this.z = myketTextView3;
        this.A = frameLayout;
        this.B = myketImageButton;
        this.C = myketRatingBar;
    }
}
