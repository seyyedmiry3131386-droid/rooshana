package defpackage;

import coil3.compose.a;
import ir.mservices.market.movie.ui.detail.review.MovieUserSubmitReviewData;
import ir.mservices.market.views.MultiSelectTitleView;
import ir.mservices.market.views.MyketVideoView;
import ir.myket.movie.common.domain.models.MovieType;
import java.lang.annotation.Annotation;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ob4 implements bp2 {
    public final /* synthetic */ int a;

    public /* synthetic */ ob4(int i) {
        this.a = i;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        int i = this.a;
        tx8 tx8Var = tx8.a;
        switch (i) {
            case 0:
                return a.a;
            case 1:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 2:
                throw new IllegalStateException("Unexpected access to LocalNavAnimatedContentScope. You should only access LocalNavAnimatedContentScope inside a NavEntry passed to NavDisplay.");
            case 3:
                s01 s01Var = pc4.a;
                return null;
            case 4:
                s01 s01Var2 = qc4.a;
                return null;
            case 5:
                u58 u58Var = rc4.a;
                return fz1.k;
            case 6:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 7:
                s01 s01Var3 = uc4.a;
                return null;
            case 8:
                u58 u58Var2 = lk4.a;
                return Boolean.FALSE;
            case 9:
                return cz4.a;
            case 10:
                return UUID.randomUUID();
            case 11:
                return new qh6(g27.a(pj3.class), new Annotation[0]);
            case 12:
                return wn5.v("ir.myket.movie.common.domain.models.MovieType", MovieType.values());
            case 13:
                return new qv(rk7.a, 0);
            case 14:
                return new qv(h75.a, 0);
            case 15:
                return new qv(oe8.a, 0);
            case 16:
                return new qv(nx6.a, 0);
            case 17:
                return new qv(yf7.a, 0);
            case 18:
                return new qv(qn0.a, 0);
            case 19:
                return new qv(rk7.a, 0);
            case 20:
                return new qv(d55.a, 0);
            case 21:
                return new qv(b88.a, 0);
            case 22:
                return new qv(ra.a, 0);
            case 23:
                return new qv(b88.a, 0);
            case 24:
                int i2 = MovieUserSubmitReviewData.j;
                return tx8Var;
            case 25:
                int i3 = MultiSelectTitleView.v;
                return tx8Var;
            case 26:
                int i4 = MyketVideoView.C;
                return tx8Var;
            case 27:
                return new rd7();
            case 28:
                pj9 pj9Var = new pj9(23);
                pj9Var.k(g27.a(fi5.class), new i25(13));
                return pj9Var.m();
            default:
                return ud1.a;
        }
    }
}
