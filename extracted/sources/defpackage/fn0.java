package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.k;
import com.google.android.material.carousel.CarouselLayoutManager;
import ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment;
import ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment;

/* JADX INFO: loaded from: classes.dex */
public final class fn0 extends d {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fn0(Object obj, Context context, int i) {
        super(context);
        this.q = i;
        this.r = obj;
    }

    @Override // defpackage.a07
    public PointF a(int i) {
        switch (this.q) {
            case 0:
                return ((CarouselLayoutManager) this.r).b(i);
            default:
                return super.a(i);
        }
    }

    @Override // androidx.recyclerview.widget.d, defpackage.a07
    public void c(View view, b07 b07Var, yz6 yz6Var) {
        switch (this.q) {
            case 3:
                mz5 mz5Var = (mz5) this.r;
                int[] iArrB = mz5Var.b(mz5Var.a.getLayoutManager(), view);
                int i = iArrB[0];
                int i2 = iArrB[1];
                int iCeil = (int) Math.ceil(((double) i(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
                if (iCeil > 0) {
                    yz6Var.a = i;
                    yz6Var.b = i2;
                    yz6Var.c = iCeil;
                    yz6Var.e = this.j;
                    yz6Var.f = true;
                }
                break;
            default:
                super.c(view, b07Var, yz6Var);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.d
    public int f(View view, int i) {
        switch (this.q) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.r;
                if (carouselLayoutManager.u == null || !carouselLayoutManager.S0()) {
                    return 0;
                }
                int iH = k.H(view);
                return (int) (carouselLayoutManager.p - carouselLayoutManager.P0(iH, carouselLayoutManager.O0(iH)));
            default:
                return super.f(view, i);
        }
    }

    @Override // androidx.recyclerview.widget.d
    public int g(View view, int i) {
        int i2 = this.q;
        int height = 0;
        Object obj = this.r;
        switch (i2) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (carouselLayoutManager.u == null || carouselLayoutManager.S0()) {
                    return 0;
                }
                int iH = k.H(view);
                return (int) (carouselLayoutManager.p - carouselLayoutManager.P0(iH, carouselLayoutManager.O0(iH)));
            case 1:
                int iG = super.g(view, i);
                MovieDetailRecyclerListFragment movieDetailRecyclerListFragment = (MovieDetailRecyclerListFragment) obj;
                int i3 = MovieDetailRecyclerListFragment.H1;
                if (!movieDetailRecyclerListFragment.d2()) {
                    z15 z15Var = movieDetailRecyclerListFragment.A1;
                    js3.m(z15Var);
                    height = z15Var.l.getHeight();
                }
                return iG + height;
            case 2:
                int iG2 = super.g(view, i);
                r65 r65Var = ((MovieSeasonsRecyclerListFragment) obj).q1;
                if (r65Var != null) {
                    return r65Var.v.getHeight() + iG2;
                }
                js3.V("headerBinding");
                throw null;
            default:
                return super.g(view, i);
        }
    }

    @Override // androidx.recyclerview.widget.d
    public float h(DisplayMetrics displayMetrics) {
        switch (this.q) {
            case 3:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.h(displayMetrics);
        }
    }

    @Override // androidx.recyclerview.widget.d
    public int i(int i) {
        switch (this.q) {
            case 3:
                return Math.min(100, super.i(i));
            default:
                return super.i(i);
        }
    }

    @Override // androidx.recyclerview.widget.d
    public int j() {
        switch (this.q) {
            case 1:
                return -1;
            case 2:
                return -1;
            default:
                return super.j();
        }
    }
}
