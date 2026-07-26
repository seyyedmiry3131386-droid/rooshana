package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketNoPaddingTextView;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wx2 extends a79 {
    public final MyketNoPaddingTextView A;
    public final MyketTextView B;
    public final ConstraintLayout C;
    public final MyketRatingBar D;
    public final MyketTextView E;
    public final MyketTextView F;
    public final MyketTextView G;
    public final MyketTextView H;
    public final MyketTextView I;
    public final ProgressBar v;
    public final ProgressBar w;
    public final ProgressBar x;
    public final ProgressBar y;
    public final ProgressBar z;

    public wx2(ea1 ea1Var, View view, ProgressBar progressBar, ProgressBar progressBar2, ProgressBar progressBar3, ProgressBar progressBar4, ProgressBar progressBar5, MyketNoPaddingTextView myketNoPaddingTextView, MyketTextView myketTextView, ConstraintLayout constraintLayout, MyketRatingBar myketRatingBar, MyketTextView myketTextView2, MyketTextView myketTextView3, MyketTextView myketTextView4, MyketTextView myketTextView5, MyketTextView myketTextView6) {
        super(0, view, ea1Var);
        this.v = progressBar;
        this.w = progressBar2;
        this.x = progressBar3;
        this.y = progressBar4;
        this.z = progressBar5;
        this.A = myketNoPaddingTextView;
        this.B = myketTextView;
        this.C = constraintLayout;
        this.D = myketRatingBar;
        this.E = myketTextView2;
        this.F = myketTextView3;
        this.G = myketTextView4;
        this.H = myketTextView5;
        this.I = myketTextView6;
    }
}
