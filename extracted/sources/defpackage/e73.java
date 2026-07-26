package defpackage;

import android.view.View;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.HorizontalRecyclerView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e73 extends a79 {
    public final AppIconView v;
    public final MyketTextView w;
    public final MyketTextView x;
    public final HorizontalRecyclerView y;
    public final MyketTextView z;

    public e73(ea1 ea1Var, View view, AppIconView appIconView, MyketTextView myketTextView, MyketTextView myketTextView2, HorizontalRecyclerView horizontalRecyclerView, MyketTextView myketTextView3) {
        super(0, view, ea1Var);
        this.v = appIconView;
        this.w = myketTextView;
        this.x = myketTextView2;
        this.y = horizontalRecyclerView;
        this.z = myketTextView3;
    }
}
