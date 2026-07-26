package defpackage;

import android.content.Context;
import androidx.compose.material3.n;
import ir.mservices.market.app.detail.ui.b;
import ir.myket.player.ui.client.utils.extensions.a;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pp implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pp(dp2 dp2Var, String str, String str2, wb5 wb5Var) {
        this.a = 8;
        this.c = dp2Var;
        this.b = str;
        this.d = str2;
        this.e = wb5Var;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new b((String) this.b, (xb5) this.c, (pw6) this.d, yq2.n0((Context) ((v24) this.e).h));
            case 1:
                qz0 qz0Var = (qz0) this.b;
                uo0 uo0Var = (uo0) this.c;
                bz7 bz7Var = (bz7) this.d;
                lz4 lz4Var = (lz4) this.e;
                kz0 kz0Var = qz0Var.M;
                uo0 uo0Var2 = kz0Var.b;
                try {
                    kz0Var.b = uo0Var;
                    bz7 bz7Var2 = qz0Var.G;
                    int[] iArr = qz0Var.o;
                    ya5 ya5Var = qz0Var.v;
                    qz0Var.o = null;
                    qz0Var.v = null;
                    try {
                        qz0Var.G = bz7Var;
                        boolean z = kz0Var.e;
                        try {
                            kz0Var.e = false;
                            qz0Var.D(lz4Var.a, lz4Var.g, lz4Var.b, true);
                        } finally {
                            kz0Var.e = z;
                        }
                    } finally {
                        qz0Var.G = bz7Var2;
                        qz0Var.o = iArr;
                        qz0Var.v = ya5Var;
                    }
                } finally {
                    kz0Var.b = uo0Var2;
                }
                break;
            case 2:
                Float f = (Float) this.b;
                jn3 jn3Var = (jn3) this.c;
                Float f2 = (Float) this.d;
                in3 in3Var = (in3) this.e;
                if (!f.equals(jn3Var.a) || !f2.equals(jn3Var.b)) {
                    jn3Var.a = f;
                    jn3Var.b = f2;
                    jn3Var.d = new xe8(in3Var, c26.h, f, f2, null);
                    ((s08) jn3Var.h.b).setValue(Boolean.TRUE);
                    jn3Var.e = false;
                    jn3Var.f = true;
                }
                return tx8.a;
            case 3:
                n nVar = (n) this.b;
                o38 o38Var = (o38) this.c;
                o38 o38Var2 = (o38) this.d;
                o38 o38Var3 = (o38) this.e;
                nVar.e = o38Var;
                nVar.f = o38Var2;
                nVar.c = o38Var3;
                break;
            case 4:
                dp2 dp2Var = (dp2) this.b;
                n nVar2 = (n) this.c;
                e71 e71Var = (e71) this.d;
                bp2 bp2Var = (bp2) this.e;
                th0.k(kotlin.collections.b.M(new Pair("on", "player_lock")), "movie_click");
                dp2Var.invoke(new sd6(new rb6(true)));
                a.a(nVar2, e71Var, bp2Var, new v7(27));
                break;
            case 5:
                dl5 dl5Var = (dl5) this.c;
                pk7 pk7Var = (pk7) this.d;
                dl5Var.a(new cr(new we6((String) this.b, pk7Var.a, (String) this.e)));
                break;
            case 6:
                bp2 bp2Var2 = (bp2) this.b;
                p61 p61Var = (p61) this.c;
                dl5 dl5Var2 = (dl5) this.d;
                xc6 xc6Var = (xc6) this.e;
                bp2Var2.invoke();
                p61Var.a();
                dl5Var2.a(new cr(new ye6(p61Var, xc6Var)));
                break;
            case 7:
                ye6 ye6Var = (ye6) this.b;
                n nVar3 = (n) this.c;
                e71 e71Var2 = (e71) this.d;
                bp2 bp2Var3 = (bp2) this.e;
                ye6Var.a.b(false);
                a.a(nVar3, e71Var2, bp2Var3, new v7(27));
                break;
            case 8:
                dp2 dp2Var2 = (dp2) this.c;
                String str = (String) this.b;
                String str2 = (String) this.d;
                wb5 wb5Var = (wb5) this.e;
                th0.k(kotlin.collections.b.M(new Pair("on", xa7.c("player_report_other", "ok"))), "movie_click");
                dp2Var2.invoke(new k47(str, 0, str2, (String) wb5Var.getValue()));
                break;
            case 9:
                lk5 lk5Var = (lk5) this.b;
                fe7 fe7Var = (fe7) this.c;
                List list = (List) this.d;
                List list2 = (List) this.e;
                ((s08) lk5Var.c).setValue(fe7Var);
                ((s08) lk5Var.b).setValue(list);
                ((s08) lk5Var.d).setValue(list2);
                break;
            default:
                a.a((n) this.b, (e71) this.c, (bp2) this.d, ((nm7) this.e).c);
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ pp(dl5 dl5Var, pk7 pk7Var, String str, String str2) {
        this.a = 5;
        this.c = dl5Var;
        this.d = pk7Var;
        this.b = str;
        this.e = str2;
    }

    public /* synthetic */ pp(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
