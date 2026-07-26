package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ir.mservices.market.views.LoadingView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w90 extends a79 {
    public static final /* synthetic */ int I = 0;
    public final ConstraintLayout A;
    public final LoadingView B;
    public final View C;
    public final Group D;
    public final MyketTextView E;
    public final MyketTextView F;
    public final View G;
    public final View H;
    public final ImageView v;
    public final FrameLayout w;
    public final View x;
    public final FrameLayout y;
    public final Group z;

    public w90(ea1 ea1Var, View view, ImageView imageView, FrameLayout frameLayout, View view2, FrameLayout frameLayout2, Group group, ConstraintLayout constraintLayout, LoadingView loadingView, View view3, Group group2, MyketTextView myketTextView, MyketTextView myketTextView2, View view4, View view5) {
        super(0, view, ea1Var);
        this.v = imageView;
        this.w = frameLayout;
        this.x = view2;
        this.y = frameLayout2;
        this.z = group;
        this.A = constraintLayout;
        this.B = loadingView;
        this.C = view3;
        this.D = group2;
        this.E = myketTextView;
        this.F = myketTextView2;
        this.G = view4;
        this.H = view5;
    }
}
