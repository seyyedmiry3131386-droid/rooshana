package defpackage;

import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.layer.Layer$LayerType;
import com.airbnb.lottie.model.layer.Layer$MatteType;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class q04 {
    public final List a;
    public final gf4 b;
    public final String c;
    public final long d;
    public final Layer$LayerType e;
    public final long f;
    public final String g;
    public final List h;
    public final hj i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final bj q;
    public final qq4 r;
    public final cj s;
    public final List t;
    public final Layer$MatteType u;
    public final boolean v;
    public final ca7 w;
    public final rb4 x;
    public final LBlendMode y;

    public q04(List list, gf4 gf4Var, String str, long j, Layer$LayerType layer$LayerType, long j2, String str2, List list2, hj hjVar, int i, int i2, int i3, float f, float f2, float f3, float f4, bj bjVar, qq4 qq4Var, List list3, Layer$MatteType layer$MatteType, cj cjVar, boolean z, ca7 ca7Var, rb4 rb4Var, LBlendMode lBlendMode) {
        this.a = list;
        this.b = gf4Var;
        this.c = str;
        this.d = j;
        this.e = layer$LayerType;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = hjVar;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.q = bjVar;
        this.r = qq4Var;
        this.t = list3;
        this.u = layer$MatteType;
        this.s = cjVar;
        this.v = z;
        this.w = ca7Var;
        this.x = rb4Var;
        this.y = lBlendMode;
    }

    public final String a(String str) {
        int i;
        StringBuilder sbC = bl4.C(str);
        sbC.append(this.c);
        sbC.append("\n");
        long j = this.f;
        gf4 gf4Var = this.b;
        q04 q04Var = (q04) gf4Var.i.d(j);
        if (q04Var != null) {
            sbC.append("\t\tParents: ");
            sbC.append(q04Var.c);
            for (q04 q04Var2 = (q04) gf4Var.i.d(q04Var.f); q04Var2 != null; q04Var2 = (q04) gf4Var.i.d(q04Var2.f)) {
                sbC.append("->");
                sbC.append(q04Var2.c);
            }
            sbC.append(str);
            sbC.append("\n");
        }
        List list = this.h;
        if (!list.isEmpty()) {
            sbC.append(str);
            sbC.append("\tMasks: ");
            sbC.append(list.size());
            sbC.append("\n");
        }
        int i2 = this.j;
        if (i2 != 0 && (i = this.k) != 0) {
            sbC.append(str);
            sbC.append("\tBackground: ");
            sbC.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.l)));
        }
        List list2 = this.a;
        if (!list2.isEmpty()) {
            sbC.append(str);
            sbC.append("\tShapes:\n");
            for (Object obj : list2) {
                sbC.append(str);
                sbC.append("\t\t");
                sbC.append(obj);
                sbC.append("\n");
            }
        }
        return sbC.toString();
    }

    public final String toString() {
        return a("");
    }
}
