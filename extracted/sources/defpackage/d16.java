package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.h;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final class d16 extends h {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;

    public d16(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2) {
        this.b = i2;
        this.a = i;
        this.e = i6;
        this.g = i5;
        this.d = i4;
        this.c = i3;
        this.f = i7;
        this.h = z;
        this.i = z2;
    }

    @Override // androidx.recyclerview.widget.h
    public final void a(Rect rect, View view, RecyclerView recyclerView, b07 b07Var) {
        int iC;
        boolean z;
        boolean z2;
        int i;
        js3.p(rect, "outRect");
        js3.p(view, "view");
        js3.p(b07Var, "state");
        if (!(recyclerView.getAdapter() instanceof u01)) {
            throw new IllegalArgumentException("Parent adapter must be ConcatAdapter");
        }
        g adapter = recyclerView.getAdapter();
        js3.n(adapter, "null cannot be cast to non-null type androidx.recyclerview.widget.ConcatAdapter");
        if (!(((u01) adapter).x().get(0) instanceof a)) {
            throw new IllegalArgumentException("First adapter of concatAdapter must be BasePagingAdapter");
        }
        int iM = RecyclerView.M(view);
        if (iM == -1) {
            rect.bottom = view.getBottom();
            rect.top = view.getTop();
            rect.left = view.getLeft();
            rect.right = view.getRight();
            return;
        }
        g adapter2 = recyclerView.getAdapter();
        js3.n(adapter2, "null cannot be cast to non-null type androidx.recyclerview.widget.ConcatAdapter");
        u01 u01Var = (u01) adapter2;
        Object obj = u01Var.x().get(0);
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.version2.ui.recycler.adapter.BasePagingAdapter");
        a aVar = (a) obj;
        RecyclerItem recyclerItem = (RecyclerItem) kotlin.collections.a.q0(aVar.c() - 1, aVar.D());
        boolean z3 = this.h;
        int i2 = this.f;
        if (recyclerItem != null) {
            iC = (recyclerItem.d + (z3 ? 0 : recyclerItem.a)) / i2;
        } else {
            iC = (aVar.c() - 1) / i2;
        }
        int iC2 = u01Var.c();
        int iC3 = aVar.c();
        int i3 = this.b;
        int i4 = this.a;
        boolean z4 = this.i;
        int i5 = this.g;
        int i6 = this.d;
        int i7 = this.c;
        if (iC2 > iC3 && iM >= aVar.c()) {
            if (!z3) {
                rect.left = i7;
                rect.right = i6;
            } else if (z4) {
                rect.left = i7;
            } else {
                rect.right = i6;
            }
            int i8 = iM / i2;
            if (i8 != 0) {
                i4 = i5;
            }
            rect.top = i4;
            if (i8 != iC) {
                i3 = i5;
            }
            rect.bottom = i3;
            return;
        }
        RecyclerItem recyclerItem2 = (RecyclerItem) aVar.D().get(iM);
        if (recyclerItem2 == null) {
            return;
        }
        MyketRecyclerData myketRecyclerData = recyclerItem2.c;
        RecyclerItem recyclerItem3 = (RecyclerItem) aVar.D().get(iM);
        boolean z5 = recyclerItem3 != null && (!z3 ? recyclerItem3.d % i2 != 0 : recyclerItem3.d / i2 != 0);
        RecyclerItem recyclerItem4 = (RecyclerItem) aVar.D().get(iM);
        if (recyclerItem4 == null) {
            z = z5;
        } else if (z3) {
            if (iM / i2 == iC) {
                z2 = true;
                z = z5;
            }
            z = z5;
        } else {
            z = z5;
            z2 = (recyclerItem4.d + recyclerItem4.a) % i2 == 0;
        }
        RecyclerItem recyclerItem5 = (RecyclerItem) aVar.D().get(iM);
        boolean z6 = recyclerItem5 != null && (z3 ? recyclerItem5.d % i2 == 0 : recyclerItem5.d / i2 == 0);
        boolean z7 = z2;
        RecyclerItem recyclerItem6 = (RecyclerItem) aVar.D().get(iM);
        boolean z8 = recyclerItem6 != null && (z3 ? (recyclerItem6.d + recyclerItem6.a) % i2 == 0 : recyclerItem6.d / i2 == iC + (-1));
        int i9 = this.e;
        if (z4) {
            if (z3) {
                if (!z) {
                    i6 = i9;
                }
                rect.right = i6;
                if (!z7) {
                    i7 = i9;
                }
                rect.left = i7;
            } else if (myketRecyclerData instanceof wo2) {
                i = 0;
                rect.left = 0;
                rect.right = 0;
            } else if (z && z7) {
                rect.left = i7;
                rect.right = i6;
            } else if (z) {
                if (i2 > 2) {
                    i9 = 0;
                }
                rect.left = i9;
                rect.right = i7;
            } else if (z7) {
                rect.left = i6;
                if (i2 > 2) {
                    i9 = 0;
                }
                rect.right = i9;
            } else if (i2 == 3) {
                int i10 = i9 * 2;
                rect.left = i10;
                rect.right = i10;
            } else {
                int i11 = recyclerItem2.d % i2;
                if (i11 == 1) {
                    rect.left = i9;
                    rect.right = i9 * 2;
                } else if (i11 == i2 - 2) {
                    rect.left = i9 * 2;
                    rect.right = i9;
                } else {
                    rect.left = i9;
                    rect.right = i9;
                }
            }
            i = 0;
        } else if (z3) {
            if (!z) {
                i7 = i9;
            }
            rect.left = i7;
            if (!z7) {
                i6 = i9;
            }
            rect.right = i6;
            i = 0;
        } else if (myketRecyclerData instanceof wo2) {
            i = 0;
            rect.left = 0;
            rect.right = 0;
        } else {
            i = 0;
            if (z && z7) {
                rect.left = i7;
                rect.right = i6;
            } else if (z) {
                rect.left = i7;
                if (i2 > 2) {
                    i9 = 0;
                }
                rect.right = i9;
            } else if (z7) {
                if (i2 > 2) {
                    i9 = 0;
                }
                rect.left = i9;
                rect.right = i6;
            } else if (i2 == 3) {
                int i12 = i9 * 2;
                rect.left = i12;
                rect.right = i12;
            } else {
                int i13 = recyclerItem2.d % i2;
                if (i13 == 1) {
                    rect.right = i9 * 2;
                    rect.left = i9;
                } else if (i13 == i2 - 2) {
                    rect.left = i9 * 2;
                    rect.right = i9;
                } else {
                    rect.left = i9;
                    rect.right = i9;
                }
            }
        }
        boolean z9 = myketRecyclerData instanceof to2;
        if (z9) {
            i4 = i;
        } else if (!z6) {
            i4 = i5;
        }
        rect.top = i4;
        rect.bottom = z9 ? i : z8 ? i3 : i5;
    }

    public d16(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        this.b = i;
        this.a = i;
        this.e = i4;
        this.g = i3;
        this.c = i2;
        this.d = i2;
        this.f = i5;
        this.h = z;
        this.i = z2;
    }
}
