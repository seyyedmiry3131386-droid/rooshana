package defpackage;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class a08 extends tz6 {
    public RecyclerView a;
    public Scroller b;
    public final zz7 c = new zz7(this);

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        zz7 zz7Var = this.c;
        if (recyclerView2 != null) {
            recyclerView2.g0(zz7Var);
            this.a.setOnFlingListener(null);
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.a.j(zz7Var);
            this.a.setOnFlingListener(this);
            this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
            f();
        }
    }

    public abstract int[] b(k kVar, View view);

    public abstract a07 c(k kVar);

    public abstract View d(k kVar);

    public abstract int e(k kVar, int i, int i2);

    public final void f() {
        k layoutManager;
        View viewD;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewD = d(layoutManager)) == null) {
            return;
        }
        int[] iArrB = b(layoutManager, viewD);
        int i = iArrB[0];
        if (i == 0 && iArrB[1] == 0) {
            return;
        }
        this.a.m0(i, iArrB[1], false);
    }
}
