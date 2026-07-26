package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.s;

/* JADX INFO: loaded from: classes3.dex */
public final class nv2 extends h {
    public final int a;
    public final int b;

    public nv2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // androidx.recyclerview.widget.h
    public final void a(Rect rect, View view, RecyclerView recyclerView, b07 b07Var) {
        js3.p(rect, "outRect");
        js3.p(view, "view");
        js3.p(b07Var, "state");
        k layoutManager = recyclerView.getLayoutManager();
        StaggeredGridLayoutManager staggeredGridLayoutManager = layoutManager instanceof StaggeredGridLayoutManager ? (StaggeredGridLayoutManager) layoutManager : null;
        if (staggeredGridLayoutManager == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        StaggeredGridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof StaggeredGridLayoutManager.LayoutParams ? (StaggeredGridLayoutManager.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        int i = this.a / 2;
        int i2 = this.b / 2;
        if (layoutParams2.f) {
            rect.set(0, 0, 0, 0);
            return;
        }
        int i3 = staggeredGridLayoutManager.p;
        if (i3 > 1) {
            s sVar = layoutParams2.e;
            int i4 = sVar == null ? -1 : sVar.e;
            if (i4 == 0) {
                rect.right = i;
                rect.left = 0;
            } else if (i4 == i3 - 1) {
                rect.left = i;
                rect.right = 0;
            } else {
                rect.left = i;
                rect.right = i;
            }
        }
        rect.top = i2;
        rect.bottom = i2;
    }
}
