package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.DefaultTimeBar;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xg3 extends a79 {
    public final ImageView A;
    public final MyketTextView B;
    public final MyketTextView C;
    public final ImageView v;
    public final ConstraintLayout w;
    public final DefaultTimeBar x;
    public final ImageView y;
    public final ImageView z;

    public xg3(ea1 ea1Var, View view, ImageView imageView, ConstraintLayout constraintLayout, DefaultTimeBar defaultTimeBar, ImageView imageView2, ImageView imageView3, ImageView imageView4, MyketTextView myketTextView, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = imageView;
        this.w = constraintLayout;
        this.x = defaultTimeBar;
        this.y = imageView2;
        this.z = imageView3;
        this.A = imageView4;
        this.B = myketTextView;
        this.C = myketTextView2;
    }
}
