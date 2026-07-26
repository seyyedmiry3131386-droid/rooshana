package defpackage;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vd0 extends a79 {
    public static final /* synthetic */ int y = 0;
    public final TabLayout v;
    public final ViewPager2 w;
    public final View x;

    public vd0(ea1 ea1Var, View view, TabLayout tabLayout, ViewPager2 viewPager2, View view2) {
        super(0, view, ea1Var);
        this.v = tabLayout;
        this.w = viewPager2;
        this.x = view2;
    }
}
