package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.MyketAdInfoView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d95 extends a79 {
    public static final /* synthetic */ int B = 0;
    public final View A;
    public final MyketAdInfoView v;
    public final MyketTextView w;
    public final AppIconView x;
    public final FrameLayout y;
    public final MyketTextView z;

    public d95(ea1 ea1Var, View view, MyketAdInfoView myketAdInfoView, MyketTextView myketTextView, AppIconView appIconView, FrameLayout frameLayout, MyketTextView myketTextView2, View view2) {
        super(0, view, ea1Var);
        this.v = myketAdInfoView;
        this.w = myketTextView;
        this.x = appIconView;
        this.y = frameLayout;
        this.z = myketTextView2;
        this.A = view2;
    }
}
