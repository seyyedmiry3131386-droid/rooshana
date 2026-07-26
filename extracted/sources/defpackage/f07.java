package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;

/* JADX INFO: loaded from: classes.dex */
public class f07 extends h3 {
    public final RecyclerView d;
    public final gw1 e;

    public f07(RecyclerView recyclerView) {
        this.d = recyclerView;
        gw1 gw1Var = this.e;
        if (gw1Var != null) {
            this.e = gw1Var;
        } else {
            this.e = new gw1(this);
        }
    }

    @Override // defpackage.h3
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.Q()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().V(accessibilityEvent);
        }
    }

    @Override // defpackage.h3
    public void d(View view, t3 t3Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, t3Var.a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.Q() || recyclerView.getLayoutManager() == null) {
            return;
        }
        k layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.W(recyclerView2.c, recyclerView2.E0, t3Var);
    }

    @Override // defpackage.h3
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.Q() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().j0(i, bundle);
    }
}
