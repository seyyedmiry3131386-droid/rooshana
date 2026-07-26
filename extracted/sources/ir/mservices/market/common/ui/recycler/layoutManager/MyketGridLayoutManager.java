package ir.mservices.market.common.ui.recycler.layoutManager;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.js3;
import defpackage.ty5;

/* JADX INFO: loaded from: classes3.dex */
public final class MyketGridLayoutManager extends GridLayoutManager implements ty5 {
    public PaddingLayoutManager$Padding Q;

    public MyketGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.recyclerview.widget.k
    public final int D() {
        PaddingLayoutManager$Padding paddingLayoutManager$Padding = this.Q;
        return paddingLayoutManager$Padding != null ? paddingLayoutManager$Padding.d : super.D();
    }

    @Override // androidx.recyclerview.widget.k
    public final int E() {
        PaddingLayoutManager$Padding paddingLayoutManager$Padding = this.Q;
        return paddingLayoutManager$Padding != null ? paddingLayoutManager$Padding.a : super.E();
    }

    @Override // androidx.recyclerview.widget.k
    public final int F() {
        PaddingLayoutManager$Padding paddingLayoutManager$Padding = this.Q;
        return paddingLayoutManager$Padding != null ? paddingLayoutManager$Padding.c : super.F();
    }

    @Override // androidx.recyclerview.widget.k
    public final int G() {
        PaddingLayoutManager$Padding paddingLayoutManager$Padding = this.Q;
        return paddingLayoutManager$Padding != null ? paddingLayoutManager$Padding.b : super.G();
    }

    @Override // defpackage.ty5
    public final void a(PaddingLayoutManager$Padding paddingLayoutManager$Padding) {
        this.Q = paddingLayoutManager$Padding;
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
