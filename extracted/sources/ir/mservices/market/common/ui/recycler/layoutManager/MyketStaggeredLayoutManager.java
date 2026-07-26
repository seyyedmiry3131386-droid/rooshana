package ir.mservices.market.common.ui.recycler.layoutManager;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import defpackage.js3;
import defpackage.ty5;

/* JADX INFO: loaded from: classes3.dex */
public final class MyketStaggeredLayoutManager extends StaggeredGridLayoutManager implements ty5 {
    public PaddingLayoutManager$Padding N;

    @Override // androidx.recyclerview.widget.k
    public final int D() {
        PaddingLayoutManager$Padding paddingLayoutManager$Padding = this.N;
        return paddingLayoutManager$Padding != null ? paddingLayoutManager$Padding.d : super.D();
    }

    @Override // androidx.recyclerview.widget.k
    public final int E() {
        PaddingLayoutManager$Padding paddingLayoutManager$Padding = this.N;
        return paddingLayoutManager$Padding != null ? paddingLayoutManager$Padding.a : super.E();
    }

    @Override // androidx.recyclerview.widget.k
    public final int F() {
        PaddingLayoutManager$Padding paddingLayoutManager$Padding = this.N;
        return paddingLayoutManager$Padding != null ? paddingLayoutManager$Padding.c : super.F();
    }

    @Override // androidx.recyclerview.widget.k
    public final int G() {
        PaddingLayoutManager$Padding paddingLayoutManager$Padding = this.N;
        return paddingLayoutManager$Padding != null ? paddingLayoutManager$Padding.b : super.G();
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.k
    public final boolean L() {
        return false;
    }

    @Override // defpackage.ty5
    public final void a(PaddingLayoutManager$Padding paddingLayoutManager$Padding) {
        this.N = paddingLayoutManager$Padding;
    }

    @Override // androidx.recyclerview.widget.k
    public final boolean p0(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        js3.p(view, "child");
        js3.p(rect, "rect");
        return false;
    }

    @Override // androidx.recyclerview.widget.k
    public final boolean q0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        js3.p(view, "child");
        js3.p(rect, "rect");
        return false;
    }
}
