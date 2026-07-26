package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a85 implements jr2 {
    public static final a85 a;
    private static final no7 descriptor;

    static {
        a85 a85Var = new a85();
        a = a85Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.MovieUriDto", a85Var, 16);
        ug6Var.j("urls", false);
        ug6Var.j("hasSubtitle", false);
        ug6Var.j("openingCreditsTime", false);
        ug6Var.j("playerConfig", false);
        ug6Var.j("downgradeQuality", false);
        ug6Var.j("restrictionInfo", false);
        ug6Var.j("promotionInfo", false);
        ug6Var.j("hintText", false);
        ug6Var.j("adInfo", false);
        ug6Var.j("playerRecommendation", false);
        ug6Var.j("credits", false);
        ug6Var.j("sampleWatch", false);
        ug6Var.j("preferredMimeType", false);
        ug6Var.j("thumbnail", false);
        ug6Var.j("orientation", false);
        ug6Var.j("audioMode", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        c24[] c24VarArr = c85.q;
        px3 px3VarN = ct2.n((px3) c24VarArr[0].getValue());
        ee0 ee0Var = ee0.a;
        px3 px3VarN2 = ct2.n(ee0Var);
        px3 px3VarN3 = ct2.n(se4.a);
        px3 px3VarN4 = ct2.n(yc6.a);
        px3 px3VarN5 = ct2.n(ee0Var);
        a87 a87Var = a87.a;
        px3 px3VarN6 = ct2.n(a87Var);
        px3 px3VarN7 = ct2.n(a87Var);
        b88 b88Var = b88.a;
        return new px3[]{px3VarN, px3VarN2, px3VarN3, px3VarN4, px3VarN5, px3VarN6, px3VarN7, ct2.n(b88Var), ct2.n((px3) c24VarArr[8].getValue()), ct2.n(zx6.a), ct2.n(m71.a), ct2.n(wc7.a), ct2.n((px3) c24VarArr[12].getValue()), ct2.n(b88Var), ct2.n(b88Var), ct2.n(ee0Var)};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        Boolean bool;
        String str;
        Boolean bool2;
        List list;
        List list2;
        Boolean bool3;
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        c24[] c24VarArr = c85.q;
        List list3 = null;
        String str2 = null;
        List list4 = null;
        yc7 yc7Var = null;
        by6 by6Var = null;
        o71 o71Var = null;
        String str3 = null;
        Boolean bool4 = null;
        ad6 ad6Var = null;
        Boolean bool5 = null;
        c87 c87Var = null;
        c87 c87Var2 = null;
        String str4 = null;
        List list5 = null;
        Boolean bool6 = null;
        Long l = null;
        int i = 0;
        boolean z = true;
        while (z) {
            ad6 ad6Var2 = ad6Var;
            int i2 = tz0VarC.i(no7Var);
            switch (i2) {
                case -1:
                    str = str2;
                    bool2 = bool5;
                    list = list5;
                    list2 = list4;
                    z = false;
                    list4 = list2;
                    ad6Var = ad6Var2;
                    bool5 = bool2;
                    list5 = list;
                    str2 = str;
                    break;
                case 0:
                    str = str2;
                    bool2 = bool5;
                    px3 px3Var = (px3) c24VarArr[0].getValue();
                    List list6 = list5;
                    list2 = list4;
                    list = (List) tz0VarC.z(no7Var, 0, px3Var, list6);
                    i |= 1;
                    list4 = list2;
                    ad6Var = ad6Var2;
                    bool5 = bool2;
                    list5 = list;
                    str2 = str;
                    break;
                case 1:
                    str = str2;
                    bool3 = bool5;
                    bool6 = (Boolean) tz0VarC.z(no7Var, 1, ee0.a, bool6);
                    i |= 2;
                    l = l;
                    ad6Var = ad6Var2;
                    bool5 = bool3;
                    str2 = str;
                    break;
                case 2:
                    str = str2;
                    bool3 = bool5;
                    l = (Long) tz0VarC.z(no7Var, 2, se4.a, l);
                    i |= 4;
                    ad6Var = ad6Var2;
                    bool5 = bool3;
                    str2 = str;
                    break;
                case 3:
                    str = str2;
                    bool3 = bool5;
                    ad6Var = (ad6) tz0VarC.z(no7Var, 3, yc6.a, ad6Var2);
                    i |= 8;
                    bool5 = bool3;
                    str2 = str;
                    break;
                case 4:
                    str = str2;
                    bool5 = (Boolean) tz0VarC.z(no7Var, 4, ee0.a, bool5);
                    i |= 16;
                    ad6Var = ad6Var2;
                    str2 = str;
                    break;
                case 5:
                    bool = bool5;
                    c87Var = (c87) tz0VarC.z(no7Var, 5, a87.a, c87Var);
                    i |= 32;
                    ad6Var = ad6Var2;
                    bool5 = bool;
                    break;
                case 6:
                    bool = bool5;
                    c87Var2 = (c87) tz0VarC.z(no7Var, 6, a87.a, c87Var2);
                    i |= 64;
                    ad6Var = ad6Var2;
                    bool5 = bool;
                    break;
                case 7:
                    bool = bool5;
                    str4 = (String) tz0VarC.z(no7Var, 7, b88.a, str4);
                    i |= 128;
                    ad6Var = ad6Var2;
                    bool5 = bool;
                    break;
                case 8:
                    bool = bool5;
                    list3 = (List) tz0VarC.z(no7Var, 8, (px3) c24VarArr[8].getValue(), list3);
                    i |= 256;
                    ad6Var = ad6Var2;
                    bool5 = bool;
                    break;
                case 9:
                    bool = bool5;
                    by6Var = (by6) tz0VarC.z(no7Var, 9, zx6.a, by6Var);
                    i |= 512;
                    ad6Var = ad6Var2;
                    bool5 = bool;
                    break;
                case 10:
                    bool = bool5;
                    o71Var = (o71) tz0VarC.z(no7Var, 10, m71.a, o71Var);
                    i |= 1024;
                    ad6Var = ad6Var2;
                    bool5 = bool;
                    break;
                case 11:
                    bool = bool5;
                    yc7Var = (yc7) tz0VarC.z(no7Var, 11, wc7.a, yc7Var);
                    i |= 2048;
                    ad6Var = ad6Var2;
                    bool5 = bool;
                    break;
                case 12:
                    bool = bool5;
                    list4 = (List) tz0VarC.z(no7Var, 12, (px3) c24VarArr[12].getValue(), list4);
                    i |= 4096;
                    ad6Var = ad6Var2;
                    bool5 = bool;
                    break;
                case 13:
                    bool = bool5;
                    str2 = (String) tz0VarC.z(no7Var, 13, b88.a, str2);
                    i |= 8192;
                    ad6Var = ad6Var2;
                    bool5 = bool;
                    break;
                case 14:
                    bool = bool5;
                    str3 = (String) tz0VarC.z(no7Var, 14, b88.a, str3);
                    i |= 16384;
                    ad6Var = ad6Var2;
                    bool5 = bool;
                    break;
                case 15:
                    bool = bool5;
                    bool4 = (Boolean) tz0VarC.z(no7Var, 15, ee0.a, bool4);
                    i |= 32768;
                    ad6Var = ad6Var2;
                    bool5 = bool;
                    break;
                default:
                    throw new UnknownFieldException(i2);
            }
        }
        String str5 = str2;
        Boolean bool7 = bool5;
        List list7 = list5;
        Boolean bool8 = bool6;
        Long l2 = l;
        tz0VarC.a(no7Var);
        return new c85(i, list7, bool8, l2, ad6Var, bool7, c87Var, c87Var2, str4, list3, by6Var, o71Var, yc7Var, list4, str5, str3, bool4);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        c85 c85Var = (c85) obj;
        js3.p(c85Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        c24[] c24VarArr = c85.q;
        uz0VarC.z(no7Var, 0, (px3) c24VarArr[0].getValue(), c85Var.a);
        ee0 ee0Var = ee0.a;
        uz0VarC.z(no7Var, 1, ee0Var, c85Var.b);
        uz0VarC.z(no7Var, 2, se4.a, c85Var.c);
        uz0VarC.z(no7Var, 3, yc6.a, c85Var.d);
        uz0VarC.z(no7Var, 4, ee0Var, c85Var.e);
        a87 a87Var = a87.a;
        uz0VarC.z(no7Var, 5, a87Var, c85Var.f);
        uz0VarC.z(no7Var, 6, a87Var, c85Var.g);
        b88 b88Var = b88.a;
        uz0VarC.z(no7Var, 7, b88Var, c85Var.h);
        uz0VarC.z(no7Var, 8, (px3) c24VarArr[8].getValue(), c85Var.i);
        uz0VarC.z(no7Var, 9, zx6.a, c85Var.j);
        uz0VarC.z(no7Var, 10, m71.a, c85Var.k);
        uz0VarC.z(no7Var, 11, wc7.a, c85Var.l);
        uz0VarC.z(no7Var, 12, (px3) c24VarArr[12].getValue(), c85Var.m);
        uz0VarC.z(no7Var, 13, b88Var, c85Var.n);
        uz0VarC.z(no7Var, 14, b88Var, c85Var.o);
        uz0VarC.z(no7Var, 15, ee0Var, c85Var.p);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
