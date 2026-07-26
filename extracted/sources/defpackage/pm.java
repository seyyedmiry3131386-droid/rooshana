package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pm extends a79 {
    public final FrameLayout v;
    public final View w;
    public final AppIconView x;
    public final MyketTextView y;

    public pm(ea1 ea1Var, View view, FrameLayout frameLayout, View view2, AppIconView appIconView, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = frameLayout;
        this.w = view2;
        this.x = appIconView;
        this.y = myketTextView;
    }
}
