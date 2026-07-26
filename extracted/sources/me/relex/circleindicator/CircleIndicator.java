package me.relex.circleindicator;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import defpackage.d60;
import defpackage.dg7;
import defpackage.i89;
import defpackage.jr0;
import defpackage.kz5;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class CircleIndicator extends BaseCircleIndicator {
    public ViewPager k;
    public final jr0 l;
    public final a m;

    public CircleIndicator(Context context) {
        super(context);
        this.l = new jr0(0, this);
        this.m = new a(this);
    }

    public final void e() {
        kz5 adapter = this.k.getAdapter();
        super.c(adapter == null ? 0 : ((dg7) adapter).h.size(), this.k.getCurrentItem());
    }

    public DataSetObserver getDataSetObserver() {
        return this.m;
    }

    @Deprecated
    public void setOnPageChangeListener(i89 i89Var) {
        ViewPager viewPager = this.k;
        if (viewPager == null) {
            throw new NullPointerException("can not find Viewpager , setViewPager first");
        }
        ArrayList arrayList = viewPager.R;
        if (arrayList != null) {
            arrayList.remove(i89Var);
        }
        this.k.b(i89Var);
    }

    public void setViewPager(ViewPager viewPager) {
        this.k = viewPager;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        this.j = -1;
        e();
        ArrayList arrayList = this.k.R;
        jr0 jr0Var = this.l;
        if (arrayList != null) {
            arrayList.remove(jr0Var);
        }
        this.k.b(jr0Var);
        jr0Var.c(this.k.getCurrentItem());
    }

    public CircleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = new jr0(0, this);
        this.m = new a(this);
    }

    public CircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = new jr0(0, this);
        this.m = new a(this);
    }

    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(d60 d60Var) {
    }
}
