package defpackage;

import android.os.Looper;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import ir.mservices.market.app.bookmark.BookmarkContentFragment;
import ir.mservices.market.movie.ui.detail.recycler.e;
import ir.mservices.market.myReview.MyReviewsContentFragment;
import ir.mservices.market.search.result.SearchResultFragment;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zl(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 5;
        int i3 = 1;
        int i4 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((IntConsumer) obj).accept(i4);
                break;
            case 1:
                ((dz) obj).b.onAudioFocusChange(i4);
                break;
            case 2:
                b62 b62Var = ((n00) obj).c;
                String str = j29.a;
                yb ybVar = b62Var.a.E;
                u52 u52Var = new u52(i4, 2);
                ybVar.getClass();
                vy2.s(Looper.myLooper() == ((wd8) ybVar.c).a.getLooper());
                ybVar.a++;
                ybVar.u(new g7(ybVar, u52Var, i2));
                ybVar.B(Integer.valueOf(i4));
                break;
            case 3:
                int i5 = BookmarkContentFragment.X0;
                ((vd0) obj).w.setCurrentItem(i4);
                break;
            case 4:
                ((sr1) obj).w.setCurrentItem(i4);
                break;
            case 5:
                go4 go4Var = (go4) obj;
                zv zvVar = go4Var.k;
                zvVar.remove(Integer.valueOf(i4));
                eq7 eq7Var = go4Var.m;
                if (eq7Var != null && eq7Var.a.e() < 5 && zvVar.isEmpty()) {
                    go4Var.l.postDelayed(new bo4(go4Var, i3), 500L);
                    break;
                }
                break;
            case 6:
                e eVar = (e) obj;
                eVar.x().z.setScrollPosition(i4, 0.0f, true);
                eVar.y = false;
                break;
            case 7:
                int i6 = MyReviewsContentFragment.V0;
                ((zd5) obj).w.setCurrentItem(i4);
                break;
            case 8:
                ((z67) obj).j(i4);
                break;
            case 9:
                int i7 = SearchResultFragment.R0;
                ((pm2) obj).w.setCurrentItem(i4);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.p.get();
                if (view != null) {
                    sideSheetBehavior.B(view, i4, false);
                }
                break;
        }
    }
}
