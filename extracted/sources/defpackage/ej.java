package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.airbnb.lottie.parser.moshi.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class ej {
    public static final nc2 a = nc2.w("k", "x", "y");

    public static dj a(b bVar, gf4 gf4Var) {
        ArrayList arrayList = new ArrayList();
        if (bVar.d() == JsonReader$Token.a) {
            bVar.c1();
            while (bVar.hasNext()) {
                b bVar2 = bVar;
                gf4 gf4Var2 = gf4Var;
                arrayList.add(new x26(gf4Var2, wy3.b(bVar2, gf4Var2, n29.c(), th0.q, bVar.d() == JsonReader$Token.c, false)));
                bVar = bVar2;
                gf4Var = gf4Var2;
            }
            bVar.W0();
            xy3.b(arrayList);
        } else {
            arrayList.add(new uy3(sw3.b(bVar, n29.c())));
        }
        dj djVar = new dj();
        djVar.a = arrayList;
        return djVar;
    }

    public static jj b(b bVar, gf4 gf4Var) {
        bVar.P0();
        dj djVarA = null;
        cj cjVarW = null;
        boolean z = false;
        cj cjVarW2 = null;
        while (bVar.d() != JsonReader$Token.d) {
            int iK = bVar.k(a);
            if (iK != 0) {
                JsonReader$Token jsonReader$Token = JsonReader$Token.f;
                if (iK != 1) {
                    if (iK != 2) {
                        bVar.u();
                        bVar.z();
                    } else if (bVar.d() == jsonReader$Token) {
                        bVar.z();
                        z = true;
                    } else {
                        cjVarW = wn5.W(bVar, gf4Var, true);
                    }
                } else if (bVar.d() == jsonReader$Token) {
                    bVar.z();
                    z = true;
                } else {
                    cjVarW2 = wn5.W(bVar, gf4Var, true);
                }
            } else {
                djVarA = a(bVar, gf4Var);
            }
        }
        bVar.t0();
        if (z) {
            gf4Var.a("Lottie doesn't support expressions.");
        }
        return djVarA != null ? djVarA : new fj(cjVarW2, cjVarW);
    }
}
