package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ir.mservices.market.views.MyketImageButton;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xc extends a79 {
    public final Group A;
    public final MyketTextView B;
    public final MyketTextView C;
    public final MyketTextView D;
    public final MyketTextView v;
    public final MyketImageButton w;
    public final View x;
    public final ConstraintLayout y;
    public final MyketImageButton z;

    public xc(ea1 ea1Var, View view, MyketTextView myketTextView, MyketImageButton myketImageButton, View view2, ConstraintLayout constraintLayout, MyketImageButton myketImageButton2, Group group, MyketTextView myketTextView2, MyketTextView myketTextView3, MyketTextView myketTextView4) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = myketImageButton;
        this.x = view2;
        this.y = constraintLayout;
        this.z = myketImageButton2;
        this.A = group;
        this.B = myketTextView2;
        this.C = myketTextView3;
        this.D = myketTextView4;
    }
}
