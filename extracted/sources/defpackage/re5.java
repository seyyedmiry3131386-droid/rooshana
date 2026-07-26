package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.o;
import com.google.android.material.loadingindicator.LoadingIndicator;
import ir.mservices.market.views.MyketTextView;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class re5 extends ka4 {
    public final FunctionReferenceImpl e;
    public final int f;
    public final int g;
    public final boolean h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public re5(bp2 bp2Var, int i, int i2) {
        this.e = (FunctionReferenceImpl) bp2Var;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.ka4
    public final void y(o oVar, ja4 ja4Var) {
        ma4 ma4Var = (ma4) oVar;
        js3.p(ja4Var, "loadState");
        LoadingIndicator loadingIndicator = ma4Var.w;
        MyketTextView myketTextView = ma4Var.x;
        ViewGroup.LayoutParams layoutParams = ma4Var.v.l.getLayoutParams();
        StaggeredGridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof StaggeredGridLayoutManager.LayoutParams ? (StaggeredGridLayoutManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.f = true;
        }
        boolean z = ja4Var instanceof ga4;
        if (z) {
            myketTextView.setText(ma4Var.a.getResources().getString(rs6.check_connection));
        }
        if (!ma4Var.u) {
            loadingIndicator.setVisibility(ja4Var instanceof ha4 ? 0 : 8);
        } else if (ja4Var instanceof ha4) {
            loadingIndicator.setVisibility(0);
            loadingIndicator.setAlpha(0.0f);
            loadingIndicator.animate().alpha(1.0f).setStartDelay(400L).setDuration(500L).start();
        } else {
            loadingIndicator.setVisibility(8);
        }
        ma4Var.y.setVisibility(z ? 0 : 8);
        myketTextView.setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [bp2, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // defpackage.ka4
    public final o z(ViewGroup viewGroup, ja4 ja4Var) {
        js3.p(ja4Var, "loadState");
        return new ma4(viewGroup, this.e, this.f, this.g, this.h);
    }
}
