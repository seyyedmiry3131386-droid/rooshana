package defpackage;

import android.view.View;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallEmptyMediumTextOvalButton;
import ir.mservices.market.views.SmallFillOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a78 extends a79 {
    public final SmallFillOvalButton v;
    public final SmallEmptyMediumTextOvalButton w;
    public final MyketTextView x;
    public final MyketTextView y;

    public a78(ea1 ea1Var, View view, SmallFillOvalButton smallFillOvalButton, SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton, MyketTextView myketTextView, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = smallFillOvalButton;
        this.w = smallEmptyMediumTextOvalButton;
        this.x = myketTextView;
        this.y = myketTextView2;
    }
}
