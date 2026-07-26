package defpackage;

import android.view.View;
import ir.mservices.market.views.MyketAdInfoView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ub3 extends a79 {
    public final MyketAdInfoView v;
    public final SmallBoldTextButton w;
    public final MyketTextView x;

    public ub3(ea1 ea1Var, View view, MyketAdInfoView myketAdInfoView, SmallBoldTextButton smallBoldTextButton, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = myketAdInfoView;
        this.w = smallBoldTextButton;
        this.x = myketTextView;
    }
}
