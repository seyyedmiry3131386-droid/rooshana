package defpackage;

import android.view.View;
import android.widget.ImageView;
import ir.mservices.market.views.LoadingView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ki6 extends a79 {
    public static final /* synthetic */ int y = 0;
    public final ImageView v;
    public final LoadingView w;
    public final MyketTextView x;

    public ki6(ea1 ea1Var, View view, ImageView imageView, LoadingView loadingView, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = imageView;
        this.w = loadingView;
        this.x = myketTextView;
    }
}
