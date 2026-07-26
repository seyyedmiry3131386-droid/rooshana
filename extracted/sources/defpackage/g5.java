package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.LoadingView;
import ir.mservices.market.views.MyketSwitch;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g5 extends a79 {
    public final MyketSwitch v;
    public final LoadingView w;
    public final FrameLayout x;
    public final MyketTextView y;
    public final MyketTextView z;

    public g5(ea1 ea1Var, View view, MyketSwitch myketSwitch, LoadingView loadingView, FrameLayout frameLayout, MyketTextView myketTextView, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = myketSwitch;
        this.w = loadingView;
        this.x = frameLayout;
        this.y = myketTextView;
        this.z = myketTextView2;
    }
}
