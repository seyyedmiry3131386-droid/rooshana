package defpackage;

import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.b;
import ir.mservices.market.app.bookmark.BookmarkContentFragment;
import ir.mservices.market.app.bookmark.common.BookmarkType;
import ir.mservices.market.myReview.MyReviewsContentFragment;
import ir.mservices.market.myReview.common.MyReviewType;
import ir.mservices.market.social.profile.common.ProfileTabView;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.views.MovieTabView;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class nd0 implements ce8 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ nd0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.be8
    public final void a() {
        switch (this.a) {
            case 1:
                MovieTabView movieTabView = (MovieTabView) this.b;
                int i = MovieTabView.D0;
                movieTabView.t();
                break;
        }
    }

    @Override // defpackage.be8
    public final void b(b bVar) {
        Object value;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                js3.p(bVar, "tab");
                BookmarkContentFragment bookmarkContentFragment = (BookmarkContentFragment) obj;
                int i2 = BookmarkContentFragment.X0;
                BookmarkType bookmarkType = (BookmarkType) bookmarkContentFragment.j1().x.get(bVar.d);
                js3.p(bookmarkType, "position");
                String string = bookmarkContentFragment.K().getString(bookmarkType.b);
                js3.o(string, "getString(...)");
                Bundle bundle = new Bundle();
                ee eeVar = (ee) ((w91) ApplicationLauncher.o.b()).o.get();
                bundle.putString("screen_name", string);
                eeVar.getClass();
                eeVar.a(bundle, "screen_show");
                break;
            case 1:
                int i3 = MovieTabView.D0;
                ((MovieTabView) obj).t();
                break;
            case 2:
                js3.p(bVar, "tab");
                MyReviewsContentFragment myReviewsContentFragment = (MyReviewsContentFragment) obj;
                int i4 = MyReviewsContentFragment.V0;
                MyReviewType myReviewType = (MyReviewType) myReviewsContentFragment.j1().z.get(bVar.d);
                js3.p(myReviewType, "position");
                String string2 = myReviewsContentFragment.K().getString(myReviewType.b);
                js3.o(string2, "getString(...)");
                Bundle bundle2 = new Bundle();
                ee eeVar2 = (ee) ((w91) ApplicationLauncher.o.b()).o.get();
                bundle2.putString("screen_name", string2);
                eeVar2.getClass();
                eeVar2.a(bundle2, "screen_show");
                break;
            case 3:
                l lVar = ((ProfileTabView) obj).r;
                do {
                    value = lVar.getValue();
                } while (!lVar.n(value, Integer.valueOf(bVar != null ? bVar.d : 0)));
                break;
            case 4:
                ((ViewPager) obj).setCurrentItem(bVar.d);
                break;
            default:
                ((ViewPager2) obj).setCurrentItem(bVar.d, true);
                break;
        }
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }
}
