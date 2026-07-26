package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.airbnb.lottie.parser.moshi.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class xy3 {
    public static final nc2 a = nc2.w("k");

    public static ArrayList a(a aVar, gf4 gf4Var, float f, c39 c39Var, boolean z) {
        a aVar2;
        gf4 gf4Var2;
        float f2;
        c39 c39Var2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (aVar.d() == JsonReader$Token.f) {
            gf4Var.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        aVar.P0();
        while (aVar.hasNext()) {
            if (aVar.k(a) != 0) {
                aVar.z();
            } else if (aVar.d() == JsonReader$Token.a) {
                aVar.c1();
                if (aVar.d() == JsonReader$Token.g) {
                    a aVar3 = aVar;
                    gf4 gf4Var3 = gf4Var;
                    float f3 = f;
                    c39 c39Var3 = c39Var;
                    boolean z3 = z;
                    uy3 uy3VarB = wy3.b(aVar3, gf4Var3, f3, c39Var3, false, z3);
                    aVar2 = aVar3;
                    gf4Var2 = gf4Var3;
                    f2 = f3;
                    c39Var2 = c39Var3;
                    z2 = z3;
                    arrayList.add(uy3VarB);
                } else {
                    aVar2 = aVar;
                    gf4Var2 = gf4Var;
                    f2 = f;
                    c39Var2 = c39Var;
                    z2 = z;
                    while (aVar2.hasNext()) {
                        arrayList.add(wy3.b(aVar2, gf4Var2, f2, c39Var2, true, z2));
                    }
                }
                aVar2.W0();
                aVar = aVar2;
                gf4Var = gf4Var2;
                f = f2;
                c39Var = c39Var2;
                z = z2;
            } else {
                a aVar4 = aVar;
                arrayList.add(wy3.b(aVar4, gf4Var, f, c39Var, false, z));
                aVar = aVar4;
            }
        }
        aVar.t0();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            uy3 uy3Var = (uy3) arrayList.get(i2);
            i2++;
            uy3 uy3Var2 = (uy3) arrayList.get(i2);
            uy3Var.h = Float.valueOf(uy3Var2.g);
            if (uy3Var.c == null && (obj = uy3Var2.b) != null) {
                uy3Var.c = obj;
                if (uy3Var instanceof x26) {
                    ((x26) uy3Var).d();
                }
            }
        }
        uy3 uy3Var3 = (uy3) arrayList.get(i);
        if ((uy3Var3.b == null || uy3Var3.c == null) && arrayList.size() > 1) {
            arrayList.remove(uy3Var3);
        }
    }
}
