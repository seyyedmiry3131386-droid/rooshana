package androidx.recyclerview.widget;

import defpackage.kz6;
import defpackage.mz6;
import defpackage.q69;
import defpackage.yb;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m extends mz6 {
    public final /* synthetic */ RecyclerView a;

    public m(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.mz6
    public final void a() {
        RecyclerView recyclerView = this.a;
        recyclerView.k(null);
        recyclerView.E0.f = true;
        recyclerView.a0(true);
        if (recyclerView.e.m()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.mz6
    public final void c(int i, int i2, Object obj) {
        RecyclerView recyclerView = this.a;
        recyclerView.k(null);
        yb ybVar = recyclerView.e;
        ArrayList arrayList = (ArrayList) ybVar.c;
        if (i2 < 1) {
            return;
        }
        arrayList.add(ybVar.o(obj, 4, i, i2));
        ybVar.a |= 4;
        if (arrayList.size() == 1) {
            h();
        }
    }

    @Override // defpackage.mz6
    public final void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.k(null);
        yb ybVar = recyclerView.e;
        ArrayList arrayList = (ArrayList) ybVar.c;
        if (i2 < 1) {
            return;
        }
        arrayList.add(ybVar.o(null, 1, i, i2));
        ybVar.a |= 1;
        if (arrayList.size() == 1) {
            h();
        }
    }

    @Override // defpackage.mz6
    public final void e(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.k(null);
        yb ybVar = recyclerView.e;
        ArrayList arrayList = (ArrayList) ybVar.c;
        if (i == i2) {
            return;
        }
        arrayList.add(ybVar.o(null, 8, i, i2));
        ybVar.a |= 8;
        if (arrayList.size() == 1) {
            h();
        }
    }

    @Override // defpackage.mz6
    public final void f(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.k(null);
        yb ybVar = recyclerView.e;
        ArrayList arrayList = (ArrayList) ybVar.c;
        if (i2 < 1) {
            return;
        }
        arrayList.add(ybVar.o(null, 2, i, i2));
        ybVar.a |= 2;
        if (arrayList.size() == 1) {
            h();
        }
    }

    @Override // defpackage.mz6
    public final void g() {
        g gVar;
        RecyclerView recyclerView = this.a;
        if (recyclerView.d == null || (gVar = recyclerView.m) == null) {
            return;
        }
        int iOrdinal = gVar.c.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return;
            }
        } else if (gVar.c() <= 0) {
            return;
        }
        recyclerView.requestLayout();
    }

    public final void h() {
        RecyclerView recyclerView = this.a;
        if (!recyclerView.t || !recyclerView.s) {
            recyclerView.A = true;
            recyclerView.requestLayout();
        } else {
            kz6 kz6Var = recyclerView.i;
            WeakHashMap weakHashMap = q69.a;
            recyclerView.postOnAnimation(kz6Var);
        }
    }
}
