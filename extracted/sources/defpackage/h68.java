package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h68 extends a79 {
    public static final /* synthetic */ int D = 0;
    public final MyketTextView A;
    public final ConstraintLayout B;
    public final MyketTextView C;
    public final MyketTextView v;
    public final View w;
    public final ProgressBar x;
    public final View y;
    public final FrameLayout z;

    public h68(ea1 ea1Var, View view, MyketTextView myketTextView, View view2, ProgressBar progressBar, View view3, FrameLayout frameLayout, MyketTextView myketTextView2, ConstraintLayout constraintLayout, MyketTextView myketTextView3) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = view2;
        this.x = progressBar;
        this.y = view3;
        this.z = frameLayout;
        this.A = myketTextView2;
        this.B = constraintLayout;
        this.C = myketTextView3;
    }
}
