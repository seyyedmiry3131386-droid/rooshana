package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final class co1 extends h {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;

    public co1(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.b = i2;
        this.a = i;
        this.e = 0;
        this.g = i5;
        this.d = i4;
        this.c = i3;
        this.f = i6;
        this.h = z;
    }

    @Override // androidx.recyclerview.widget.h
    public final void a(Rect rect, View view, RecyclerView recyclerView, b07 b07Var) {
        js3.p(rect, "outRect");
        js3.p(view, "view");
        js3.p(b07Var, "state");
        if (!(recyclerView.getAdapter() instanceof a)) {
            throw new IllegalArgumentException("You have to inherit from BasePagingAdapter");
        }
        int iM = RecyclerView.M(view);
        if (iM == -1) {
            return;
        }
        int i = this.f;
        int i2 = iM % i;
        boolean z = i2 == 0;
        boolean z2 = i2 == i + (-1);
        int iC = (recyclerView.getAdapter() != null ? r9.c() - 1 : 0) / i;
        boolean z3 = this.h;
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.e;
        if (z3) {
            if (!z) {
                i4 = i5;
            }
            rect.right = i4;
            if (!z2) {
                i3 = i5;
            }
            rect.left = i3;
        } else {
            if (!z) {
                i4 = i5;
            }
            rect.left = i4;
            if (!z2) {
                i3 = i5;
            }
            rect.right = i3;
        }
        int i6 = iM / i;
        int i7 = this.g;
        rect.top = i6 == 0 ? this.a : i7;
        if (i6 == iC) {
            i7 = this.b;
        }
        rect.bottom = i7;
    }

    public co1(int i, int i2, int i3, int i4, int i5, boolean z) {
        this.b = i;
        this.a = i;
        this.e = i4;
        this.g = i3;
        this.c = i2;
        this.d = i2;
        this.f = i5;
        this.h = z;
    }
}
