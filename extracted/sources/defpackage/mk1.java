package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.DownloadProgressBar;
import ir.mservices.market.views.MyketNoPaddingTextView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallEmptyLargeTextOvalButton;
import ir.mservices.market.views.SmallFillOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mk1 extends a79 {
    public static final /* synthetic */ int F = 0;
    public final DownloadProgressBar A;
    public final ConstraintLayout B;
    public final MyketNoPaddingTextView C;
    public final SmallEmptyLargeTextOvalButton D;
    public final ImageView E;
    public final AppIconView v;
    public final MyketNoPaddingTextView w;
    public final MyketTextView x;
    public final ImageView y;
    public final SmallFillOvalButton z;

    public mk1(ea1 ea1Var, View view, AppIconView appIconView, MyketNoPaddingTextView myketNoPaddingTextView, MyketTextView myketTextView, ImageView imageView, SmallFillOvalButton smallFillOvalButton, DownloadProgressBar downloadProgressBar, ConstraintLayout constraintLayout, MyketNoPaddingTextView myketNoPaddingTextView2, SmallEmptyLargeTextOvalButton smallEmptyLargeTextOvalButton, ImageView imageView2) {
        super(0, view, ea1Var);
        this.v = appIconView;
        this.w = myketNoPaddingTextView;
        this.x = myketTextView;
        this.y = imageView;
        this.z = smallFillOvalButton;
        this.A = downloadProgressBar;
        this.B = constraintLayout;
        this.C = myketNoPaddingTextView2;
        this.D = smallEmptyLargeTextOvalButton;
        this.E = imageView2;
    }
}
