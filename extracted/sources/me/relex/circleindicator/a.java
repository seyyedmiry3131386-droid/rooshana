package me.relex.circleindicator;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;
import defpackage.dg7;
import defpackage.kz5;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends DataSetObserver {
    public final /* synthetic */ CircleIndicator a;

    public a(CircleIndicator circleIndicator) {
        this.a = circleIndicator;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        super.onChanged();
        CircleIndicator circleIndicator = this.a;
        ViewPager viewPager = circleIndicator.k;
        if (viewPager == null) {
            return;
        }
        kz5 adapter = viewPager.getAdapter();
        int size = adapter != null ? ((dg7) adapter).h.size() : 0;
        if (size == circleIndicator.getChildCount()) {
            return;
        }
        if (circleIndicator.j < size) {
            circleIndicator.j = circleIndicator.k.getCurrentItem();
        } else {
            circleIndicator.j = -1;
        }
        circleIndicator.e();
    }
}
