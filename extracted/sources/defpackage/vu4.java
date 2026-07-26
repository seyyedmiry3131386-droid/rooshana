package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vu4 extends a79 {
    public final FrameLayout v;
    public final ImageView w;
    public final SmallBoldTextButton x;
    public final MyketTextView y;

    public vu4(ea1 ea1Var, View view, FrameLayout frameLayout, ImageView imageView, SmallBoldTextButton smallBoldTextButton, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = frameLayout;
        this.w = imageView;
        this.x = smallBoldTextButton;
        this.y = myketTextView;
    }
}
