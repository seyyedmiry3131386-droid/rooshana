package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nr extends a79 {
    public final MyketTextView v;
    public final MyketTextView w;
    public final FrameLayout x;

    public nr(ea1 ea1Var, View view, MyketTextView myketTextView, MyketTextView myketTextView2, FrameLayout frameLayout) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = myketTextView2;
        this.x = frameLayout;
    }

    public nr(ea1 ea1Var, View view, FrameLayout frameLayout, MyketTextView myketTextView, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.x = frameLayout;
        this.v = myketTextView;
        this.w = myketTextView2;
    }
}
