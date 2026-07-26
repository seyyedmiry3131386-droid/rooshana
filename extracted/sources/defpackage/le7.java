package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import ir.mservices.market.views.DialogButtonComponent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class le7 extends a79 {
    public final DialogButtonComponent v;
    public final LinearLayout w;
    public final RadioGroup x;

    public le7(ea1 ea1Var, View view, DialogButtonComponent dialogButtonComponent, LinearLayout linearLayout, RadioGroup radioGroup) {
        super(0, view, ea1Var);
        this.v = dialogButtonComponent;
        this.w = linearLayout;
        this.x = radioGroup;
    }
}
