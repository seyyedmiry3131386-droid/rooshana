package defpackage;

import android.database.DataSetObserver;
import androidx.viewpager.widget.PagerTitleStrip;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes.dex */
public final class pz5 extends DataSetObserver implements i89, h89 {
    public int a;
    public final /* synthetic */ PagerTitleStrip b;

    public pz5(PagerTitleStrip pagerTitleStrip) {
        this.b = pagerTitleStrip;
    }

    @Override // defpackage.h89
    public final void a(ViewPager viewPager, kz5 kz5Var, kz5 kz5Var2) {
        this.b.a(kz5Var, kz5Var2);
    }

    @Override // defpackage.i89
    public final void b(int i) {
        this.a = i;
    }

    @Override // defpackage.i89
    public final void c(int i) {
        if (this.a == 0) {
            PagerTitleStrip pagerTitleStrip = this.b;
            pagerTitleStrip.b(pagerTitleStrip.a.getCurrentItem(), pagerTitleStrip.a.getAdapter());
            float f = pagerTitleStrip.f;
            if (f < 0.0f) {
                f = 0.0f;
            }
            pagerTitleStrip.c(f, pagerTitleStrip.a.getCurrentItem(), true);
        }
    }

    @Override // defpackage.i89
    public final void d(int i, float f) {
        if (f > 0.5f) {
            i++;
        }
        this.b.c(f, i, false);
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        PagerTitleStrip pagerTitleStrip = this.b;
        pagerTitleStrip.b(pagerTitleStrip.a.getCurrentItem(), pagerTitleStrip.a.getAdapter());
        float f = pagerTitleStrip.f;
        if (f < 0.0f) {
            f = 0.0f;
        }
        pagerTitleStrip.c(f, pagerTitleStrip.a.getCurrentItem(), true);
    }
}
