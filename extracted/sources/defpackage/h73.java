package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallFillOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h73 extends a79 {
    public final RelativeLayout v;
    public final ImageView w;
    public final SmallFillOvalButton x;
    public final MyketTextView y;

    public h73(ea1 ea1Var, View view, RelativeLayout relativeLayout, ImageView imageView, SmallFillOvalButton smallFillOvalButton, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = relativeLayout;
        this.w = imageView;
        this.x = smallFillOvalButton;
        this.y = myketTextView;
    }
}
