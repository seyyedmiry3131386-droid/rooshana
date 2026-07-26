package defpackage;

import androidx.compose.material3.n;
import androidx.compose.runtime.internal.a;
import ir.myket.player.domain.models.PlayerMovieData;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hy implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ hy(hx4 hx4Var, xc6 xc6Var, PlayerMovieData playerMovieData, dp2 dp2Var, dl5 dl5Var, dp2 dp2Var2, int i) {
        this.a = 0;
        this.c = hx4Var;
        this.d = xc6Var;
        this.e = playerMovieData;
        this.f = dp2Var;
        this.h = dl5Var;
        this.g = dp2Var2;
        this.b = i;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                hs9.j((hx4) this.c, (xc6) this.d, (PlayerMovieData) this.e, (dp2) this.f, (dl5) this.h, (dp2) this.g, (qz0) obj, hs9.W(this.b | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((a) this.c).e(this.d, (Boolean) this.e, this.f, this.g, this.h, (qz0) obj, hs9.W(this.b) | 1);
                break;
            default:
                ((Integer) obj2).getClass();
                wu8.c((hx4) this.c, (String) this.d, (pj3) this.e, (a) this.f, (n) this.g, (bp2) this.h, (qz0) obj, hs9.W(this.b | 1));
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ hy(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
        this.b = i;
    }
}
