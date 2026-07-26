package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import defpackage.o40;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final ArrayList a = new ArrayList();
    public int b = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = 0;
    public final int e;
    public final /* synthetic */ StaggeredGridLayoutManager f;

    public s(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.e = i;
    }

    public final void a(View view) {
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        layoutParams.e = this;
        ArrayList arrayList = this.a;
        arrayList.add(view);
        this.c = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.b = Integer.MIN_VALUE;
        }
        if (layoutParams.a.i() || layoutParams.a.l()) {
            this.d = this.f.r.e(view) + this.d;
        }
    }

    public final void b() {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItemF;
        View view = (View) o40.u(1, this.a);
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        this.c = staggeredGridLayoutManager.r.d(view);
        if (layoutParams.f && (staggeredGridLayoutManager$LazySpanLookup$FullSpanItemF = staggeredGridLayoutManager.B.f(layoutParams.a.c())) != null && staggeredGridLayoutManager$LazySpanLookup$FullSpanItemF.b == 1) {
            int i = this.c;
            int[] iArr = staggeredGridLayoutManager$LazySpanLookup$FullSpanItemF.c;
            this.c = i + (iArr == null ? 0 : iArr[this.e]);
        }
    }

    public final void c() {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItemF;
        View view = (View) this.a.get(0);
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        this.b = staggeredGridLayoutManager.r.g(view);
        if (layoutParams.f && (staggeredGridLayoutManager$LazySpanLookup$FullSpanItemF = staggeredGridLayoutManager.B.f(layoutParams.a.c())) != null && staggeredGridLayoutManager$LazySpanLookup$FullSpanItemF.b == -1) {
            int i = this.b;
            int[] iArr = staggeredGridLayoutManager$LazySpanLookup$FullSpanItemF.c;
            this.b = i - (iArr != null ? iArr[this.e] : 0);
        }
    }

    public final void d() {
        this.a.clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public final int e() {
        return this.f.w ? g(r1.size() - 1, -1) : g(0, this.a.size());
    }

    public final int f() {
        return this.f.w ? g(0, this.a.size()) : g(r1.size() - 1, -1);
    }

    public final int g(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        int iM = staggeredGridLayoutManager.r.m();
        int i3 = staggeredGridLayoutManager.r.i();
        int i4 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.a.get(i);
            int iG = staggeredGridLayoutManager.r.g(view);
            int iD = staggeredGridLayoutManager.r.d(view);
            boolean z = iG <= i3;
            boolean z2 = iD >= iM;
            if (z && z2 && (iG < iM || iD > i3)) {
                return k.H(view);
            }
            i += i4;
        }
        return -1;
    }

    public final int h(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        b();
        return this.c;
    }

    public final View i(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        ArrayList arrayList = this.a;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.w && k.H(view2) >= i) || ((!staggeredGridLayoutManager.w && k.H(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.w && k.H(view3) <= i) || ((!staggeredGridLayoutManager.w && k.H(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    public final int j(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        c();
        return this.b;
    }

    public final void k() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        View view = (View) arrayList.remove(size - 1);
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        layoutParams.e = null;
        if (layoutParams.a.i() || layoutParams.a.l()) {
            this.d -= this.f.r.e(view);
        }
        if (size == 1) {
            this.b = Integer.MIN_VALUE;
        }
        this.c = Integer.MIN_VALUE;
    }

    public final void l() {
        ArrayList arrayList = this.a;
        View view = (View) arrayList.remove(0);
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        layoutParams.e = null;
        if (arrayList.size() == 0) {
            this.c = Integer.MIN_VALUE;
        }
        if (layoutParams.a.i() || layoutParams.a.l()) {
            this.d -= this.f.r.e(view);
        }
        this.b = Integer.MIN_VALUE;
    }

    public final void m(View view) {
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        layoutParams.e = this;
        ArrayList arrayList = this.a;
        arrayList.add(0, view);
        this.b = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.c = Integer.MIN_VALUE;
        }
        if (layoutParams.a.i() || layoutParams.a.l()) {
            this.d = this.f.r.e(view) + this.d;
        }
    }
}
