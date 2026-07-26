package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iw0 extends a79 {
    public static final /* synthetic */ int B = 0;
    public final MyketTextView A;
    public final DialogButtonComponent v;
    public final MyketTextView w;
    public final DialogHeaderComponent x;
    public final LinearLayout y;
    public final MyketRatingBar z;

    public iw0(ea1 ea1Var, View view, DialogButtonComponent dialogButtonComponent, MyketTextView myketTextView, DialogHeaderComponent dialogHeaderComponent, LinearLayout linearLayout, MyketRatingBar myketRatingBar, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = dialogButtonComponent;
        this.w = myketTextView;
        this.x = dialogHeaderComponent;
        this.y = linearLayout;
        this.z = myketRatingBar;
        this.A = myketTextView2;
    }
}
