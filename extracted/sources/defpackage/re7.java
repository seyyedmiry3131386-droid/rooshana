package defpackage;

import android.view.View;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.NumberPickerView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class re7 extends a79 {
    public static final /* synthetic */ int A = 0;
    public final NumberPickerView v;
    public final DialogButtonComponent w;
    public final View x;
    public final MyketTextView y;
    public final DialogHeaderComponent z;

    public re7(ea1 ea1Var, View view, NumberPickerView numberPickerView, DialogButtonComponent dialogButtonComponent, View view2, MyketTextView myketTextView, DialogHeaderComponent dialogHeaderComponent) {
        super(0, view, ea1Var);
        this.v = numberPickerView;
        this.w = dialogButtonComponent;
        this.x = view2;
        this.y = myketTextView;
        this.z = dialogHeaderComponent;
    }
}
