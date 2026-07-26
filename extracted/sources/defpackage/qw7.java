package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.h;

/* JADX INFO: loaded from: classes3.dex */
public final class qw7 extends h {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e = 1;
    public final boolean f = true;
    public final boolean g;

    public qw7(boolean z, int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.g = z;
    }

    @Override // androidx.recyclerview.widget.h
    public final void a(Rect rect, View view, RecyclerView recyclerView, b07 b07Var) {
        g adapter;
        js3.p(rect, "outRect");
        js3.p(view, "view");
        js3.p(b07Var, "state");
        int iM = RecyclerView.M(view);
        if (iM == -1 || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        int iC = adapter.c();
        int i = this.e;
        int i2 = iM % i;
        boolean z = i2 == 0;
        boolean z2 = i2 == i + (-1);
        int i3 = (iC - 1) / i;
        boolean z3 = this.f;
        int i4 = this.b;
        int i5 = this.a;
        int i6 = this.c;
        int i7 = this.d;
        if (!z3) {
            if (!z) {
                i5 = i7;
            }
            rect.left = i5;
            if (!z2) {
                i4 = i7;
            }
            rect.right = i4;
            int i8 = iM / i;
            rect.top = i8 == 0 ? 0 : i6;
            rect.bottom = i8 != i3 ? i6 : 0;
            return;
        }
        rect.top = z ? 0 : i6;
        rect.bottom = z2 ? 0 : i6;
        if (this.g) {
            int i9 = iM / i;
            if (i9 != 0) {
                i5 = i7;
            }
            rect.right = i5;
            if (i9 != i3) {
                i4 = i7;
            }
            rect.left = i4;
            return;
        }
        int i10 = iM / i;
        if (i10 != 0) {
            i5 = i7;
        }
        rect.left = i5;
        if (i10 != i3) {
            i4 = i7;
        }
        rect.right = i4;
    }
}
