package defpackage;

import android.view.View;
import android.widget.ImageView;
import ir.mservices.market.views.LoadingView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n73 extends a79 {
    public final MyketTextView v;
    public final LoadingView w;
    public final ImageView x;
    public final MyketTextView y;

    public n73(ea1 ea1Var, View view, MyketTextView myketTextView, LoadingView loadingView, ImageView imageView, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = loadingView;
        this.x = imageView;
        this.y = myketTextView2;
    }
}
