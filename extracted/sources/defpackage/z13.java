package defpackage;

import android.view.View;
import android.widget.ImageView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallFillOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z13 extends a79 {
    public final SmallFillOvalButton v;
    public final ImageView w;
    public final MyketTextView x;

    public z13(ea1 ea1Var, View view, SmallFillOvalButton smallFillOvalButton, ImageView imageView, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = smallFillOvalButton;
        this.w = imageView;
        this.x = myketTextView;
    }
}
