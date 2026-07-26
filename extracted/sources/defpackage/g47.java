package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g47 extends a79 {
    public static final /* synthetic */ int C = 0;
    public final RadioGroup A;
    public final DialogHeaderComponent B;
    public final MyketTextView v;
    public final DialogButtonComponent w;
    public final View x;
    public final LinearLayout y;
    public final MyketEditText z;

    public g47(ea1 ea1Var, View view, MyketTextView myketTextView, DialogButtonComponent dialogButtonComponent, View view2, LinearLayout linearLayout, MyketEditText myketEditText, RadioGroup radioGroup, DialogHeaderComponent dialogHeaderComponent) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = dialogButtonComponent;
        this.x = view2;
        this.y = linearLayout;
        this.z = myketEditText;
        this.A = radioGroup;
        this.B = dialogHeaderComponent;
    }
}
