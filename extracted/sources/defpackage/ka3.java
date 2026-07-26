package defpackage;

import android.view.View;
import android.widget.ImageView;
import ir.mservices.market.views.LoadingView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ka3 extends a79 {
    public final LoadingView v;
    public final ImageView w;
    public final MyketTextView x;
    public final ImageView y;

    public ka3(ea1 ea1Var, View view, LoadingView loadingView, ImageView imageView, MyketTextView myketTextView, ImageView imageView2) {
        super(0, view, ea1Var);
        this.v = loadingView;
        this.w = imageView;
        this.x = myketTextView;
        this.y = imageView2;
    }
}
