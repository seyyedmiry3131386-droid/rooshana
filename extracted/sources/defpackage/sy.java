package defpackage;

import androidx.compose.material3.n;
import androidx.navigation3.ui.a;
import ir.myket.player.domain.models.PlayerMovieData;
import ir.myket.player.viewmodel.c;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sy implements qp2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ hx4 b;
    public final /* synthetic */ dp2 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ bp2 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ sy(hx4 hx4Var, wd6 wd6Var, PlayerMovieData playerMovieData, xc6 xc6Var, bp2 bp2Var, dl5 dl5Var, dp2 dp2Var, dp2 dp2Var2, int i) {
        this.b = hx4Var;
        this.g = wd6Var;
        this.h = playerMovieData;
        this.i = xc6Var;
        this.e = bp2Var;
        this.j = dl5Var;
        this.c = dp2Var;
        this.d = dp2Var2;
        this.f = i;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                gu9.b(this.b, (wd6) this.g, (PlayerMovieData) this.h, (xc6) this.i, this.e, (dl5) this.j, this.c, (dp2) this.d, (qz0) obj, hs9.W(this.f | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                a.b((ArrayList) this.g, this.b, (qd) this.h, (fv) this.i, this.c, (dp2) this.d, (qp2) this.j, this.e, (qz0) obj, hs9.W(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ok4.f(this.b, (we6) this.g, (c) this.h, (dl5) this.j, this.c, (n) this.i, this.e, (String) this.d, (qz0) obj, hs9.W(this.f | 1));
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ sy(hx4 hx4Var, we6 we6Var, c cVar, dl5 dl5Var, dp2 dp2Var, n nVar, bp2 bp2Var, String str, int i) {
        this.b = hx4Var;
        this.g = we6Var;
        this.h = cVar;
        this.j = dl5Var;
        this.c = dp2Var;
        this.i = nVar;
        this.e = bp2Var;
        this.d = str;
        this.f = i;
    }

    public /* synthetic */ sy(ArrayList arrayList, hx4 hx4Var, qd qdVar, fv fvVar, dp2 dp2Var, dp2 dp2Var2, qp2 qp2Var, bp2 bp2Var, int i) {
        this.g = arrayList;
        this.b = hx4Var;
        this.h = qdVar;
        this.i = fvVar;
        this.c = dp2Var;
        this.d = dp2Var2;
        this.j = qp2Var;
        this.e = bp2Var;
        this.f = i;
    }
}
