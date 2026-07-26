package defpackage;

import android.view.View;
import android.widget.ImageView;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.PaymentPriceView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h79 extends a79 {
    public static final /* synthetic */ int C = 0;
    public final MyketTextView A;
    public final MyketTextView B;
    public final AppIconView v;
    public final PaymentPriceView w;
    public final MyketTextView x;
    public final MyketTextView y;
    public final ImageView z;

    public h79(ea1 ea1Var, View view, AppIconView appIconView, PaymentPriceView paymentPriceView, MyketTextView myketTextView, MyketTextView myketTextView2, ImageView imageView, MyketTextView myketTextView3, MyketTextView myketTextView4) {
        super(0, view, ea1Var);
        this.v = appIconView;
        this.w = paymentPriceView;
        this.x = myketTextView;
        this.y = myketTextView2;
        this.z = imageView;
        this.A = myketTextView3;
        this.B = myketTextView4;
    }
}
