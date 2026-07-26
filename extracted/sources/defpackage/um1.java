package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class um1 extends a79 {
    public static final /* synthetic */ int A = 0;
    public final DialogButtonComponent v;
    public final MyketTextView w;
    public final LinearLayout x;
    public final RadioGroup y;
    public final DialogHeaderComponent z;

    public um1(ea1 ea1Var, View view, DialogButtonComponent dialogButtonComponent, MyketTextView myketTextView, LinearLayout linearLayout, RadioGroup radioGroup, DialogHeaderComponent dialogHeaderComponent) {
        super(0, view, ea1Var);
        this.v = dialogButtonComponent;
        this.w = myketTextView;
        this.x = linearLayout;
        this.y = radioGroup;
        this.z = dialogHeaderComponent;
    }
}
