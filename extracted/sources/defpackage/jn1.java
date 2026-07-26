package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jn1 extends a79 {
    public static final /* synthetic */ int z = 0;
    public final MyketTextView v;
    public final DialogButtonComponent w;
    public final DialogHeaderComponent x;
    public final LinearLayout y;

    public jn1(ea1 ea1Var, View view, LinearLayout linearLayout, DialogButtonComponent dialogButtonComponent, DialogHeaderComponent dialogHeaderComponent, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = dialogButtonComponent;
        this.x = dialogHeaderComponent;
        this.y = linearLayout;
    }
}
