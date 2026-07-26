package defpackage;

import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes.dex */
public final class ae8 implements h89 {
    public boolean a;
    public final /* synthetic */ TabLayout b;

    public ae8(TabLayout tabLayout) {
        this.b = tabLayout;
    }

    @Override // defpackage.h89
    public final void a(ViewPager viewPager, kz5 kz5Var, kz5 kz5Var2) {
        TabLayout tabLayout = this.b;
        if (tabLayout.P == viewPager) {
            tabLayout.o(kz5Var2, this.a);
        }
    }
}
