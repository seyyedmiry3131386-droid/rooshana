package me.relex.circleindicator;

import androidx.recyclerview.widget.g;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.mz6;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends mz6 {
    public final /* synthetic */ CircleIndicator3 a;

    public c(CircleIndicator3 circleIndicator3) {
        this.a = circleIndicator3;
    }

    @Override // defpackage.mz6
    public final void a() {
        CircleIndicator3 circleIndicator3 = this.a;
        ViewPager2 viewPager2 = circleIndicator3.k;
        if (viewPager2 == null) {
            return;
        }
        g adapter = viewPager2.getAdapter();
        int iC = adapter != null ? adapter.c() : 0;
        if (iC == circleIndicator3.getChildCount()) {
            return;
        }
        if (circleIndicator3.j < iC) {
            circleIndicator3.j = circleIndicator3.k.getCurrentItem();
        } else {
            circleIndicator3.j = -1;
        }
        circleIndicator3.e();
    }

    @Override // defpackage.mz6
    public final void b(int i, int i2) {
        a();
    }

    @Override // defpackage.mz6
    public final void c(int i, int i2, Object obj) {
        b(i, i2);
        a();
    }

    @Override // defpackage.mz6
    public final void d(int i, int i2) {
        a();
    }

    @Override // defpackage.mz6
    public final void e(int i, int i2) {
        a();
    }

    @Override // defpackage.mz6
    public final void f(int i, int i2) {
        a();
    }
}
