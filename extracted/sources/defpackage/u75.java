package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u75 extends a79 {
    public static final /* synthetic */ int z = 0;
    public final LinearLayout v;
    public final ImageView w;
    public final MyketTextView x;
    public final FrameLayout y;

    public u75(ea1 ea1Var, View view, LinearLayout linearLayout, ImageView imageView, MyketTextView myketTextView, FrameLayout frameLayout) {
        super(0, view, ea1Var);
        this.v = linearLayout;
        this.w = imageView;
        this.x = myketTextView;
        this.y = frameLayout;
    }
}
