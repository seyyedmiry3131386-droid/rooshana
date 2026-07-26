package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ee8 implements i89 {
    public final WeakReference a;
    public int b;
    public int c;

    public ee8(TabLayout tabLayout) {
        this.a = new WeakReference(tabLayout);
    }

    @Override // defpackage.i89
    public final void b(int i) {
        this.b = this.c;
        this.c = i;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            tabLayout.V = this.c;
        }
    }

    @Override // defpackage.i89
    public final void c(int i) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
            return;
        }
        int i2 = this.c;
        tabLayout.n(tabLayout.j(i), i2 == 0 || (i2 == 2 && this.b == 0));
    }

    @Override // defpackage.i89
    public final void d(int i, float f) {
        boolean z;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            int i2 = this.c;
            boolean z2 = true;
            if (i2 != 2 || this.b == 1) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            if (i2 == 2 && this.b == 0) {
                z = false;
            }
            tabLayout.p(f, i, z2, z, false);
        }
    }
}
