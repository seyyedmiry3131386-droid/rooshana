package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bm1 extends a79 {
    public static final /* synthetic */ int z = 0;
    public final DialogButtonComponent v;
    public final DialogHeaderComponent w;
    public final MyketTextView x;
    public final LinearLayout y;

    public bm1(ea1 ea1Var, View view, LinearLayout linearLayout, DialogButtonComponent dialogButtonComponent, DialogHeaderComponent dialogHeaderComponent, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = dialogButtonComponent;
        this.w = dialogHeaderComponent;
        this.x = myketTextView;
        this.y = linearLayout;
    }
}
