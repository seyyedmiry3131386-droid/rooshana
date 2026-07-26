package defpackage;

import android.view.View;
import com.google.android.material.loadingindicator.LoadingIndicator;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallFillOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ij2 extends a79 {
    public static final /* synthetic */ int y = 0;
    public final MyketTextView v;
    public final LoadingIndicator w;
    public final SmallFillOvalButton x;

    public ij2(ea1 ea1Var, View view, MyketTextView myketTextView, LoadingIndicator loadingIndicator, SmallFillOvalButton smallFillOvalButton) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = loadingIndicator;
        this.x = smallFillOvalButton;
    }
}
