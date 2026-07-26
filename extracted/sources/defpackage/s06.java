package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.k;

/* JADX INFO: loaded from: classes3.dex */
public final class s06 extends d {
    public final /* synthetic */ RecyclerView q;
    public final /* synthetic */ t06 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s06(RecyclerView recyclerView, t06 t06Var, Context context) {
        super(context);
        this.q = recyclerView;
        this.r = t06Var;
    }

    @Override // androidx.recyclerview.widget.d, defpackage.a07
    public final void c(View view, b07 b07Var, yz6 yz6Var) {
        js3.p(view, "targetView");
        js3.p(b07Var, "state");
        k layoutManager = this.q.getLayoutManager();
        if (layoutManager != null) {
            int[] iArrB = this.r.b(layoutManager, view);
            int i = iArrB[0];
            int i2 = iArrB[1];
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            if (iAbs < iAbs2) {
                iAbs = iAbs2;
            }
            if (((int) Math.ceil(((double) i(iAbs)) / 0.3356d)) > 0) {
                yz6Var.a = i;
                yz6Var.b = i2;
                yz6Var.c = 600;
                yz6Var.e = this.j;
                yz6Var.f = true;
            }
        }
    }

    @Override // androidx.recyclerview.widget.d
    public final float h(DisplayMetrics displayMetrics) {
        js3.p(displayMetrics, "displayMetrics");
        return 100.0f / displayMetrics.densityDpi;
    }
}
