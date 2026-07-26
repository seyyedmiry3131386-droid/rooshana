package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ud7 implements qp2 {
    public final /* synthetic */ int a;

    public /* synthetic */ ud7(int i) {
        this.a = i;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        int i = 0;
        switch (this.a) {
            case 0:
                return Integer.valueOf(((fj2) obj2).a);
            case 1:
                q74 q74Var = (q74) obj2;
                return br9.o(q74Var.a, xd7.a(q74Var.b, xd7.i, (ad7) obj));
            case 2:
                return Float.valueOf(((ba0) obj2).a);
            case 3:
                ad7 ad7Var = (ad7) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i < size) {
                    arrayList.add(xd7.a((kl) list.get(i), xd7.b, ad7Var));
                    i++;
                }
                return arrayList;
            case 4:
                zi8 zi8Var = (zi8) obj2;
                return br9.o(Integer.valueOf((int) (zi8Var.a >> 32)), Integer.valueOf((int) (4294967295L & zi8Var.a)));
            case 5:
                ad7 ad7Var2 = (ad7) obj;
                ur7 ur7Var = (ur7) obj2;
                return br9.o(xd7.a(new zu0(ur7Var.a), xd7.p, ad7Var2), xd7.a(new nr5(ur7Var.b), xd7.x, ad7Var2), Float.valueOf(ur7Var.c));
            case 6:
                return Integer.valueOf(((of8) obj2).a);
            case 7:
                return Integer.valueOf(((ug8) obj2).a);
            case 8:
                return Integer.valueOf(((af3) obj2).a);
            case 9:
                return Integer.valueOf(((si2) obj2).a);
            case 10:
                return Integer.valueOf(((cj2) obj2).a);
            case 11:
                jj8 jj8Var = (jj8) obj2;
                return jj8Var == null ? false : jj8.a(jj8Var.a, jj8.c) ? Boolean.FALSE : br9.o(Float.valueOf(jj8.c(jj8Var.a)), xd7.a(new kj8(jj8.b(jj8Var.a)), xd7.w, (ad7) obj));
            case 12:
                p74 p74Var = (p74) obj2;
                return br9.o(p74Var.a, xd7.a(p74Var.b, xd7.i, (ad7) obj));
            case 13:
                long j = ((kj8) obj2).a;
                if (kj8.a(j, 8589934592L)) {
                    return 0;
                }
                if (kj8.a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 14:
                nr5 nr5Var = (nr5) obj2;
                return nr5Var == null ? false : nr5.c(nr5Var.a, 9205357640488583168L) ? Boolean.FALSE : br9.o(Float.valueOf(Float.intBitsToFloat((int) (nr5Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (4294967295L & nr5Var.a))));
            case 15:
                ad7 ad7Var3 = (ad7) obj;
                List list2 = ((wc4) obj2).a;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i < size2) {
                    arrayList2.add(xd7.a((vc4) list2.get(i), xd7.z, ad7Var3));
                    i++;
                }
                return arrayList2;
            case 16:
                return ((vc4) obj2).a.toLanguageTag();
            case 17:
                ad7 ad7Var4 = (ad7) obj;
                z64 z64Var = (z64) obj2;
                return br9.o(xd7.a(new w64(z64Var.a), xd7.B, ad7Var4), xd7.a(new y64(z64Var.b), xd7.C, ad7Var4), xd7.a(new x64(z64Var.c), xd7.D, ad7Var4));
            case 18:
                return Float.valueOf(((w64) obj2).a);
            case 19:
                return Integer.valueOf(((y64) obj2).a);
            case 20:
                return Integer.valueOf(((x64) obj2).a);
            case 21:
                return ((i49) obj2).a;
            case 22:
                ad7 ad7Var5 = (ad7) obj;
                p16 p16Var = (p16) obj2;
                Object objA = xd7.a(new of8(p16Var.a), xd7.q, ad7Var5);
                Object objA2 = xd7.a(new ug8(p16Var.b), xd7.r, ad7Var5);
                Object objA3 = xd7.a(new jj8(p16Var.c), xd7.v, ad7Var5);
                di8 di8Var = p16Var.d;
                di8 di8Var2 = di8.c;
                Object objA4 = xd7.a(di8Var, xd7.l, ad7Var5);
                Object objA5 = xd7.a(p16Var.e, c26.c, ad7Var5);
                z64 z64Var2 = p16Var.f;
                z64 z64Var3 = z64.d;
                return br9.o(objA, objA2, objA3, objA4, objA5, xd7.a(z64Var2, xd7.A, ad7Var5), xd7.a(new u64(p16Var.g), c26.e, ad7Var5), xd7.a(new af3(p16Var.h), xd7.s, ad7Var5), xd7.a(p16Var.i, c26.f, ad7Var5));
            case 23:
                return ((n09) obj2).a;
            case 24:
                ad7 ad7Var6 = (ad7) obj;
                c28 c28Var = (c28) obj2;
                zu0 zu0Var = new zu0(c28Var.a.b());
                wd7 wd7Var = xd7.p;
                Object objA6 = xd7.a(zu0Var, wd7Var, ad7Var6);
                jj8 jj8Var2 = new jj8(c28Var.b);
                wd7 wd7Var2 = xd7.v;
                Object objA7 = xd7.a(jj8Var2, wd7Var2, ad7Var6);
                fj2 fj2Var = c28Var.c;
                fj2 fj2Var2 = fj2.b;
                Object objA8 = xd7.a(fj2Var, xd7.m, ad7Var6);
                Object objA9 = xd7.a(c28Var.d, xd7.t, ad7Var6);
                Object objA10 = xd7.a(c28Var.e, xd7.u, ad7Var6);
                String str = c28Var.g;
                Object objA11 = xd7.a(new jj8(c28Var.h), wd7Var2, ad7Var6);
                Object objA12 = xd7.a(c28Var.i, xd7.n, ad7Var6);
                Object objA13 = xd7.a(c28Var.j, xd7.k, ad7Var6);
                wc4 wc4Var = c28Var.k;
                wc4 wc4Var2 = wc4.c;
                Object objA14 = xd7.a(wc4Var, xd7.y, ad7Var6);
                Object objA15 = xd7.a(new zu0(c28Var.l), wd7Var, ad7Var6);
                Object objA16 = xd7.a(c28Var.m, xd7.j, ad7Var6);
                ur7 ur7Var2 = c28Var.n;
                ur7 ur7Var3 = ur7.d;
                return br9.o(objA6, objA7, objA8, objA9, objA10, -1, str, objA11, objA12, objA13, objA14, objA15, objA16, xd7.a(ur7Var2, xd7.o, ad7Var6));
            case 25:
                ad7 ad7Var7 = (ad7) obj;
                ui8 ui8Var = (ui8) obj2;
                c28 c28Var2 = ui8Var.a;
                bn6 bn6Var = xd7.h;
                return br9.o(xd7.a(c28Var2, bn6Var, ad7Var7), xd7.a(ui8Var.b, bn6Var, ad7Var7), xd7.a(ui8Var.c, bn6Var, ad7Var7), xd7.a(ui8Var.d, bn6Var, ad7Var7));
            case 26:
                w96 w96Var = (w96) obj2;
                Boolean boolValueOf = Boolean.valueOf(w96Var.a);
                bn6 bn6Var2 = xd7.a;
                return br9.o(boolValueOf, xd7.a(new n02(w96Var.b), c26.d, (ad7) obj));
            case 27:
                return Integer.valueOf(((n02) obj2).a);
            case 28:
                return Integer.valueOf(((u64) obj2).a);
            default:
                xi8 xi8Var = (xi8) obj2;
                return br9.o(xd7.a(new wi8(xi8Var.a), c26.g, (ad7) obj), Boolean.valueOf(xi8Var.b));
        }
    }
}
