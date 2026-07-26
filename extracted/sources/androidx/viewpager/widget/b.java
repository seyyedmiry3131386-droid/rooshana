package androidx.viewpager.widget;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) ((View) obj).getLayoutParams();
        ViewPager.LayoutParams layoutParams2 = (ViewPager.LayoutParams) ((View) obj2).getLayoutParams();
        boolean z = layoutParams.a;
        return z != layoutParams2.a ? z ? 1 : -1 : layoutParams.e - layoutParams2.e;
    }
}
