package defpackage;

import android.view.View;
import androidx.viewpager.widget.PagerTabStrip;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes.dex */
public final class oz5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PagerTabStrip b;

    public /* synthetic */ oz5(PagerTabStrip pagerTabStrip, int i) {
        this.a = i;
        this.b = pagerTabStrip;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.a.setCurrentItem(r2.getCurrentItem() - 1);
                break;
            default:
                ViewPager viewPager = this.b.a;
                viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                break;
        }
    }
}
