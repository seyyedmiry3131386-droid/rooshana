package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes.dex */
public final class l89 extends o89 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewPager2 b;

    public /* synthetic */ l89(ViewPager2 viewPager2, int i) {
        this.a = i;
        this.b = viewPager2;
    }

    @Override // defpackage.o89
    public void a(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    this.b.e();
                }
                break;
        }
    }

    @Override // defpackage.o89
    public final void c(int i) {
        switch (this.a) {
            case 0:
                ViewPager2 viewPager2 = this.b;
                if (viewPager2.d != i) {
                    viewPager2.d = i;
                    viewPager2.t.G();
                }
                break;
            default:
                ViewPager2 viewPager22 = this.b;
                viewPager22.clearFocus();
                if (viewPager22.hasFocus()) {
                    viewPager22.j.requestFocus(2);
                }
                break;
        }
    }
}
