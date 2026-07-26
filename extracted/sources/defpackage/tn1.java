package defpackage;

import android.view.View;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tn1 extends a79 {
    public static final /* synthetic */ int z = 0;
    public final DialogButtonComponent v;
    public final MyketTextView w;
    public final MyketTextView x;
    public final DialogHeaderComponent y;

    public tn1(ea1 ea1Var, View view, DialogButtonComponent dialogButtonComponent, MyketTextView myketTextView, MyketTextView myketTextView2, DialogHeaderComponent dialogHeaderComponent) {
        super(0, view, ea1Var);
        this.v = dialogButtonComponent;
        this.w = myketTextView;
        this.x = myketTextView2;
        this.y = dialogHeaderComponent;
    }
}
