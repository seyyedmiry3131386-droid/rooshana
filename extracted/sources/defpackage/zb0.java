package defpackage;

import android.view.View;
import ir.mservices.market.views.BirthdayPicker;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zb0 extends a79 {
    public static final /* synthetic */ int A = 0;
    public final BirthdayPicker v;
    public final DialogButtonComponent w;
    public final View x;
    public final MyketTextView y;
    public final DialogHeaderComponent z;

    public zb0(ea1 ea1Var, View view, BirthdayPicker birthdayPicker, DialogButtonComponent dialogButtonComponent, View view2, MyketTextView myketTextView, DialogHeaderComponent dialogHeaderComponent) {
        super(0, view, ea1Var);
        this.v = birthdayPicker;
        this.w = dialogButtonComponent;
        this.x = view2;
        this.y = myketTextView;
        this.z = dialogHeaderComponent;
    }
}
