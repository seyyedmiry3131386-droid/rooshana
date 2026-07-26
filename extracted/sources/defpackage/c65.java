package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.h;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final class c65 extends h {
    public final int a;
    public final int b;
    public final boolean c;
    public final int d;

    public c65(int i, int i2, boolean z, int i3) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = i3;
    }

    @Override // androidx.recyclerview.widget.h
    public final void a(Rect rect, View view, RecyclerView recyclerView, b07 b07Var) {
        js3.p(rect, "outRect");
        js3.p(view, "view");
        js3.p(b07Var, "state");
        int iM = RecyclerView.M(view);
        if (!(recyclerView.getAdapter() instanceof a)) {
            throw new IllegalArgumentException("Adapter must be BasePagingAdapter");
        }
        if (iM == -1) {
            rect.bottom = view.getBottom();
            rect.top = view.getTop();
            rect.left = view.getLeft();
            rect.right = view.getRight();
            return;
        }
        g adapter = recyclerView.getAdapter();
        js3.n(adapter, "null cannot be cast to non-null type ir.mservices.market.version2.ui.recycler.adapter.BasePagingAdapter");
        a aVar = (a) adapter;
        RecyclerItem recyclerItem = (RecyclerItem) kotlin.collections.a.q0(aVar.c() - 1, aVar.D());
        int i = this.d;
        if (recyclerItem != null) {
            int i2 = (recyclerItem.d + recyclerItem.a) / i;
        } else {
            int iC = (aVar.c() - 1) / i;
        }
        Object obj = aVar.D().get(iM);
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.common.ui.recycler.RecyclerItem");
        RecyclerItem recyclerItem2 = (RecyclerItem) obj;
        int i3 = recyclerItem2.d;
        boolean z = i3 % i == 0;
        boolean z2 = (recyclerItem2.a + i3) % i == 0;
        boolean z3 = i3 / i == 0;
        boolean z4 = this.c;
        int i4 = this.a;
        if (z4) {
            if (z && z2) {
                rect.left = 0;
                rect.right = 0;
            } else if (z) {
                rect.left = i4;
                rect.right = 0;
            } else if (z2) {
                rect.left = 0;
                rect.right = i4;
            } else {
                rect.left = i4;
                rect.right = i4;
            }
        } else if (z && z2) {
            rect.left = 0;
            rect.right = 0;
        } else if (z) {
            rect.left = 0;
            rect.right = i4;
        } else if (z2) {
            rect.left = i4;
            rect.right = 0;
        } else {
            rect.left = i4;
            rect.right = i4;
        }
        rect.top = z3 ? 0 : this.b;
        rect.bottom = 0;
    }
}
