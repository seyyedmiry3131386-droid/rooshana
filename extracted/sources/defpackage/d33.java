package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.AppInfoView;
import ir.mservices.market.views.BigTextButton;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d33 extends a79 {
    public final BigTextButton A;
    public final MyketRatingBar B;
    public final ConstraintLayout C;
    public final AppIconView v;
    public final AppInfoView w;
    public final MyketTextView x;
    public final MyketTextView y;
    public final FrameLayout z;

    public d33(ea1 ea1Var, View view, AppIconView appIconView, AppInfoView appInfoView, MyketTextView myketTextView, MyketTextView myketTextView2, FrameLayout frameLayout, BigTextButton bigTextButton, MyketRatingBar myketRatingBar, ConstraintLayout constraintLayout) {
        super(0, view, ea1Var);
        this.v = appIconView;
        this.w = appInfoView;
        this.x = myketTextView;
        this.y = myketTextView2;
        this.z = frameLayout;
        this.A = bigTextButton;
        this.B = myketRatingBar;
        this.C = constraintLayout;
    }
}
