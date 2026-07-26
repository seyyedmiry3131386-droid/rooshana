package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c97 extends a79 {
    public final FrameLayout v;
    public final SmallBoldTextButton w;
    public final MyketTextView x;

    public c97(ea1 ea1Var, View view, FrameLayout frameLayout, SmallBoldTextButton smallBoldTextButton, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = frameLayout;
        this.w = smallBoldTextButton;
        this.x = myketTextView;
    }
}
