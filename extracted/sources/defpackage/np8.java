package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class np8 extends a79 {
    public static final /* synthetic */ int C = 0;
    public final MyketTextView A;
    public final MyketTextView B;
    public final DialogButtonComponent v;
    public final MyketEditText w;
    public final MyketTextView x;
    public final ImageView y;
    public final ConstraintLayout z;

    public np8(ea1 ea1Var, View view, DialogButtonComponent dialogButtonComponent, MyketEditText myketEditText, MyketTextView myketTextView, ImageView imageView, ConstraintLayout constraintLayout, MyketTextView myketTextView2, MyketTextView myketTextView3) {
        super(0, view, ea1Var);
        this.v = dialogButtonComponent;
        this.w = myketEditText;
        this.x = myketTextView;
        this.y = imageView;
        this.z = constraintLayout;
        this.A = myketTextView2;
        this.B = myketTextView3;
    }
}
