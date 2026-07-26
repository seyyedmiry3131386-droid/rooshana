package me.relex.circleindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.g;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.d60;
import defpackage.mz6;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class CircleIndicator3 extends BaseCircleIndicator {
    public ViewPager2 k;
    public final b l;
    public final c m;

    public CircleIndicator3(Context context) {
        super(context);
        this.l = new b(this);
        this.m = new c(this);
    }

    public final void e() {
        g adapter = this.k.getAdapter();
        super.c(adapter == null ? 0 : adapter.c(), this.k.getCurrentItem());
    }

    public mz6 getAdapterDataObserver() {
        return this.m;
    }

    public void setViewPager(ViewPager2 viewPager2) {
        this.k = viewPager2;
        if (viewPager2 == null || viewPager2.getAdapter() == null) {
            return;
        }
        this.j = -1;
        e();
        ArrayList arrayList = (ArrayList) this.k.c.b;
        b bVar = this.l;
        arrayList.remove(bVar);
        ((ArrayList) this.k.c.b).add(bVar);
        bVar.c(this.k.getCurrentItem());
    }

    public CircleIndicator3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = new b(this);
        this.m = new c(this);
    }

    public CircleIndicator3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = new b(this);
        this.m = new c(this);
    }

    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(d60 d60Var) {
    }
}
