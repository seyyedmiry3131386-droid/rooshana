package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.BigEmptyOvalButton;
import ir.mservices.market.views.BigFillOvalButton;
import ir.mservices.market.views.DownloadProgressBar;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d13 extends a79 {
    public final MyketTextView A;
    public final MyketTextView B;
    public final BigFillOvalButton C;
    public final BigEmptyOvalButton D;
    public final ConstraintLayout v;
    public final View w;
    public final DownloadProgressBar x;
    public final MyketTextView y;
    public final FrameLayout z;

    public d13(ea1 ea1Var, View view, ConstraintLayout constraintLayout, View view2, DownloadProgressBar downloadProgressBar, MyketTextView myketTextView, FrameLayout frameLayout, MyketTextView myketTextView2, MyketTextView myketTextView3, BigFillOvalButton bigFillOvalButton, BigEmptyOvalButton bigEmptyOvalButton) {
        super(0, view, ea1Var);
        this.v = constraintLayout;
        this.w = view2;
        this.x = downloadProgressBar;
        this.y = myketTextView;
        this.z = frameLayout;
        this.A = myketTextView2;
        this.B = myketTextView3;
        this.C = bigFillOvalButton;
        this.D = bigEmptyOvalButton;
    }
}
