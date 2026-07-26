package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.FastDownloadView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ez8 extends a79 {
    public final ImageView A;
    public final MyketTextView B;
    public final MyketTextView C;
    public final MyketTextView D;
    public final ConstraintLayout E;
    public final MyketTextView F;
    public final MyketTextView G;
    public final FrameLayout v;
    public final ImageView w;
    public final MyketTextView x;
    public final FrameLayout y;
    public final FastDownloadView z;

    public ez8(ea1 ea1Var, View view, FrameLayout frameLayout, ImageView imageView, MyketTextView myketTextView, FrameLayout frameLayout2, FastDownloadView fastDownloadView, ImageView imageView2, MyketTextView myketTextView2, MyketTextView myketTextView3, MyketTextView myketTextView4, ConstraintLayout constraintLayout, MyketTextView myketTextView5, MyketTextView myketTextView6) {
        super(0, view, ea1Var);
        this.v = frameLayout;
        this.w = imageView;
        this.x = myketTextView;
        this.y = frameLayout2;
        this.z = fastDownloadView;
        this.A = imageView2;
        this.B = myketTextView2;
        this.C = myketTextView3;
        this.D = myketTextView4;
        this.E = constraintLayout;
        this.F = myketTextView5;
        this.G = myketTextView6;
    }
}
