package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketInputLayout;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;
import ir.mservices.market.views.SmallRegularTextButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wn2 extends a79 {
    public static final /* synthetic */ int I = 0;
    public final SmallRegularTextButton A;
    public final FrameLayout B;
    public final SmallRegularTextButton C;
    public final FrameLayout D;
    public final View E;
    public final SmallBoldTextButton F;
    public final MyketTextView G;
    public final MyketTextView H;
    public final MyketTextView v;
    public final MyketInputLayout w;
    public final DialogButtonComponent x;
    public final MyketEditText y;
    public final ConstraintLayout z;

    public wn2(ea1 ea1Var, View view, MyketTextView myketTextView, MyketInputLayout myketInputLayout, DialogButtonComponent dialogButtonComponent, MyketEditText myketEditText, ConstraintLayout constraintLayout, SmallRegularTextButton smallRegularTextButton, FrameLayout frameLayout, SmallRegularTextButton smallRegularTextButton2, FrameLayout frameLayout2, View view2, SmallBoldTextButton smallBoldTextButton, MyketTextView myketTextView2, MyketTextView myketTextView3) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = myketInputLayout;
        this.x = dialogButtonComponent;
        this.y = myketEditText;
        this.z = constraintLayout;
        this.A = smallRegularTextButton;
        this.B = frameLayout;
        this.C = smallRegularTextButton2;
        this.D = frameLayout2;
        this.E = view2;
        this.F = smallBoldTextButton;
        this.G = myketTextView2;
        this.H = myketTextView3;
    }
}
