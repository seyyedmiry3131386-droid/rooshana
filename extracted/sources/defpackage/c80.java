package defpackage;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.gestures.Orientation;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.movie.ui.bookmark.recycler.MovieBookmarkData;
import ir.mservices.market.movie.ui.search.result.recycler.BaseMovieSearchMovieData;
import ir.mservices.market.social.list.common.movie.recycler.ProfileMovieData;
import ir.mservices.market.social.list.common.movie.recycler.a;
import ir.mservices.market.views.SeriesBackground;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c80 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c80(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        c01 c01Var;
        long[] jArr;
        c01 c01Var2;
        long[] jArr2;
        int i;
        switch (this.a) {
            case 0:
                BaseMovieSearchMovieData baseMovieSearchMovieData = (BaseMovieSearchMovieData) this.c;
                d80 d80Var = (d80) this.d;
                Drawable drawable = (Drawable) obj;
                js3.p(drawable, "drawable");
                if (js3.i(baseMovieSearchMovieData.a.getType(), CommonDataKt.MOVIE_TYPE_SERIES)) {
                    SeriesBackground seriesBackground = d80Var.y;
                    seriesBackground.setVisibility(0);
                    seriesBackground.setBackgroundWidth(this.b);
                    seriesBackground.setImageDrawable(drawable);
                }
                return tx8.a;
            case 1:
                MovieBookmarkData movieBookmarkData = (MovieBookmarkData) this.c;
                o43 o43Var = (o43) this.d;
                Drawable drawable2 = (Drawable) obj;
                js3.p(drawable2, "drawable");
                if (js3.i(movieBookmarkData.h.getType(), CommonDataKt.MOVIE_TYPE_SERIES)) {
                    SeriesBackground seriesBackground2 = o43Var.y;
                    seriesBackground2.setVisibility(0);
                    seriesBackground2.setBackgroundWidth(this.b);
                    seriesBackground2.setImageDrawable(drawable2);
                }
                return tx8.a;
            case 2:
                ProfileMovieData profileMovieData = (ProfileMovieData) this.c;
                a aVar = (a) this.d;
                Drawable drawable3 = (Drawable) obj;
                js3.p(drawable3, "drawable");
                if (js3.i(profileMovieData.b.getType(), CommonDataKt.MOVIE_TYPE_SERIES)) {
                    aVar.x().y.setVisibility(0);
                    aVar.x().y.setBackgroundWidth(this.b);
                    aVar.x().y.setImageDrawable(drawable3);
                }
                return tx8.a;
            case 3:
                pj3 pj3Var = (pj3) this.c;
                qa6 qa6Var = (qa6) this.d;
                s34 s34Var = (s34) obj;
                js3.p(s34Var, "$this$LazyColumn");
                s34Var.b(((o) pj3Var).a(), new wb(new sm5(28), pj3Var, 9), new it3(pj3Var, 3), new androidx.compose.runtime.internal.a(802480018, new ou6(pj3Var, this.b, qa6Var), true));
                break;
            case 4:
                my6 my6Var = (my6) this.c;
                ib5 ib5Var = (ib5) this.d;
                c01 c01Var3 = (c01) obj;
                int i2 = my6Var.e;
                int i3 = this.b;
                if (i2 == i3 && js3.i(ib5Var, my6Var.f) && (c01Var3 instanceof j01)) {
                    long[] jArr3 = ib5Var.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j = jArr3[i4];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i5 = 8;
                                int i6 = 8 - ((~(i4 - length)) >>> 31);
                                int i7 = 0;
                                while (i7 < i6) {
                                    if ((255 & j) < 128) {
                                        int i8 = (i4 << 3) + i7;
                                        Object obj2 = ib5Var.b[i8];
                                        boolean z = ib5Var.c[i8] != i3;
                                        if (z) {
                                            i = i5;
                                            j01 j01Var = (j01) c01Var3;
                                            c01Var2 = c01Var3;
                                            rb5 rb5Var = j01Var.g;
                                            b47.m(rb5Var, obj2, my6Var);
                                            jArr2 = jArr3;
                                            if (obj2 instanceof ck1) {
                                                ck1 ck1Var = (ck1) obj2;
                                                if (!rb5Var.c(ck1Var)) {
                                                    b47.n(j01Var.j, ck1Var);
                                                }
                                                rb5 rb5Var2 = my6Var.g;
                                                if (rb5Var2 != null) {
                                                    rb5Var2.k(obj2);
                                                }
                                            }
                                        } else {
                                            c01Var2 = c01Var3;
                                            jArr2 = jArr3;
                                            i = i5;
                                        }
                                        if (z) {
                                            ib5Var.f(i8);
                                        }
                                    } else {
                                        c01Var2 = c01Var3;
                                        jArr2 = jArr3;
                                        i = i5;
                                    }
                                    j >>= i;
                                    i7++;
                                    i5 = i;
                                    c01Var3 = c01Var2;
                                    jArr3 = jArr2;
                                }
                                c01Var = c01Var3;
                                jArr = jArr3;
                                if (i6 == i5) {
                                }
                            } else {
                                c01Var = c01Var3;
                                jArr = jArr3;
                            }
                            if (i4 != length) {
                                i4++;
                                c01Var3 = c01Var;
                                jArr3 = jArr;
                            }
                        }
                    }
                }
                return tx8.a;
            case 5:
                pg7 pg7Var = (pg7) this.c;
                b96 b96Var = (b96) this.d;
                a96 a96Var = (a96) obj;
                int iF = pg7Var.o.f();
                if (iF < 0) {
                    iF = 0;
                }
                int i9 = this.b;
                if (iF > i9) {
                    iF = i9;
                }
                int i10 = -iF;
                boolean z2 = pg7Var.p;
                int i11 = z2 ? 0 : i10;
                if (!z2) {
                    i10 = 0;
                }
                a96Var.a = true;
                a96.k(a96Var, b96Var, i11, i10);
                a96Var.a = false;
                break;
            default:
                x49 x49Var = (x49) this.c;
                b96 b96Var2 = (b96) this.d;
                a96 a96Var2 = (a96) obj;
                int i12 = x49Var.c;
                qh8 qh8Var = x49Var.b;
                tq8 tq8Var = x49Var.d;
                si8 si8Var = (si8) x49Var.e.invoke();
                qh8Var.b(Orientation.a, sa7.c(a96Var2, i12, tq8Var, si8Var != null ? si8Var.a : null, false, b96Var2.a), this.b, b96Var2.b);
                a96.j(a96Var2, b96Var2, 0, Math.round(-qh8Var.a()));
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ c80(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
