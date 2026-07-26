package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.PaymentPriceView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g46 extends a79 {
    public static final /* synthetic */ int L = 0;
    public final MyketTextView A;
    public final View B;
    public final MyketTextView C;
    public final View D;
    public final ConstraintLayout E;
    public final ImageView F;
    public final ImageView G;
    public final PaymentPriceView H;
    public final MyketTextView I;
    public final RecyclerView J;
    public final MyketTextView K;
    public final AppIconView v;
    public final MyketTextView w;
    public final DialogButtonComponent x;
    public final ConstraintLayout y;
    public final ImageView z;

    public g46(ea1 ea1Var, View view, View view2, View view3, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView, AppIconView appIconView, DialogButtonComponent dialogButtonComponent, MyketTextView myketTextView, MyketTextView myketTextView2, MyketTextView myketTextView3, MyketTextView myketTextView4, MyketTextView myketTextView5, PaymentPriceView paymentPriceView) {
        super(0, view, ea1Var);
        this.v = appIconView;
        this.w = myketTextView;
        this.x = dialogButtonComponent;
        this.y = constraintLayout;
        this.z = imageView;
        this.A = myketTextView2;
        this.B = view2;
        this.C = myketTextView3;
        this.D = view3;
        this.E = constraintLayout2;
        this.F = imageView2;
        this.G = imageView3;
        this.H = paymentPriceView;
        this.I = myketTextView4;
        this.J = recyclerView;
        this.K = myketTextView5;
    }
}
