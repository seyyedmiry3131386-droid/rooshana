package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import ir.mservices.market.views.BigFillRectangleButton;
import ir.mservices.market.views.SmallEmptyLargeTextOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fl2 extends a79 {
    public static final /* synthetic */ int F = 0;
    public final ProgressBar A;
    public final ProgressBar B;
    public final ProgressBar C;
    public final ProgressBar D;
    public final ViewPager2 E;
    public final View v;
    public final View w;
    public final SmallEmptyLargeTextOvalButton x;
    public final BigFillRectangleButton y;
    public final ConstraintLayout z;

    public fl2(ea1 ea1Var, View view, View view2, View view3, SmallEmptyLargeTextOvalButton smallEmptyLargeTextOvalButton, BigFillRectangleButton bigFillRectangleButton, ConstraintLayout constraintLayout, ProgressBar progressBar, ProgressBar progressBar2, ProgressBar progressBar3, ProgressBar progressBar4, ViewPager2 viewPager2) {
        super(0, view, ea1Var);
        this.v = view2;
        this.w = view3;
        this.x = smallEmptyLargeTextOvalButton;
        this.y = bigFillRectangleButton;
        this.z = constraintLayout;
        this.A = progressBar;
        this.B = progressBar2;
        this.C = progressBar3;
        this.D = progressBar4;
        this.E = viewPager2;
    }
}
