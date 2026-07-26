package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g15 implements jr2 {
    public static final g15 a;
    private static final no7 descriptor;

    static {
        g15 g15Var = new g15();
        a = g15Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.MovieDetailDto", g15Var, 29);
        ug6Var.j("id", false);
        ug6Var.j("title", false);
        ug6Var.j("posterUrl", false);
        ug6Var.j("seasons", false);
        ug6Var.j("playId", false);
        ug6Var.j("type", false);
        ug6Var.j(PackageListMetaDataDTO.KEY_DESCRIPTION, false);
        ug6Var.j("summaries", false);
        ug6Var.j("posterLandscapeUrl", false);
        ug6Var.j("tags", false);
        ug6Var.j("selectedSeasonId", false);
        ug6Var.j("buttonText", false);
        ug6Var.j("secondaryTitle", false);
        ug6Var.j("recomms", false);
        ug6Var.j("screenshots", false);
        ug6Var.j("messageBox", false);
        ug6Var.j("buttonAction", false);
        ug6Var.j("posterBlurUrl", false);
        ug6Var.j("subscriptionInfo", false);
        ug6Var.j("bookmarkInfo", false);
        ug6Var.j("trailer", false);
        ug6Var.j("casts", false);
        ug6Var.j("showDownloadButton", false);
        ug6Var.j("showTrafficHint", false);
        ug6Var.j("reviewInfo", false);
        ug6Var.j("sampleWatchMessage", false);
        ug6Var.j("primaryAddax", false);
        ug6Var.j("streamer", false);
        ug6Var.j("shareModel", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        c24[] c24VarArr = i15.D;
        b88 b88Var = b88.a;
        px3 px3VarN = ct2.n((px3) c24VarArr[3].getValue());
        px3 px3VarN2 = ct2.n(b88Var);
        px3 px3VarN3 = ct2.n(b88Var);
        px3 px3VarN4 = ct2.n((px3) c24VarArr[7].getValue());
        px3 px3VarN5 = ct2.n(b88Var);
        px3 px3VarN6 = ct2.n((px3) c24VarArr[9].getValue());
        px3 px3VarN7 = ct2.n(b88Var);
        px3 px3VarN8 = ct2.n(b88Var);
        px3 px3VarN9 = ct2.n(b88Var);
        px3 px3VarN10 = ct2.n((px3) c24VarArr[13].getValue());
        px3 px3VarN11 = ct2.n((px3) c24VarArr[14].getValue());
        px3 px3VarN12 = ct2.n(xu4.a);
        px3 px3VarN13 = ct2.n(b88Var);
        px3 px3VarN14 = ct2.n(na8.a);
        px3 px3VarN15 = ct2.n(qd0.a);
        px3 px3VarN16 = ct2.n(tp8.a);
        px3 px3VarN17 = ct2.n((px3) c24VarArr[21].getValue());
        px3 px3VarN18 = ct2.n(n55.a);
        px3 px3VarN19 = ct2.n(b88Var);
        px3 px3VarN20 = ct2.n(hc.a);
        px3 px3VarN21 = ct2.n(ik1.a);
        px3 px3VarN22 = ct2.n(ut7.a);
        ee0 ee0Var = ee0.a;
        return new px3[]{b88Var, b88Var, b88Var, px3VarN, px3VarN2, b88Var, px3VarN3, px3VarN4, px3VarN5, px3VarN6, px3VarN7, px3VarN8, px3VarN9, px3VarN10, px3VarN11, px3VarN12, px3VarN13, b88Var, px3VarN14, px3VarN15, px3VarN16, px3VarN17, ee0Var, ee0Var, px3VarN18, px3VarN19, px3VarN20, px3VarN21, px3VarN22};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        yt7 yt7Var;
        String str;
        List list;
        int i;
        int i2;
        int i3;
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        c24[] c24VarArr = i15.D;
        String str2 = null;
        List list2 = null;
        yt7 yt7Var2 = null;
        jc jcVar = null;
        kk1 kk1Var = null;
        List list3 = null;
        zu4 zu4Var = null;
        String str3 = null;
        sd0 sd0Var = null;
        vp8 vp8Var = null;
        pa8 pa8Var = null;
        List list4 = null;
        p55 p55Var = null;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        List list5 = null;
        String str4 = null;
        String str5 = null;
        String strO5 = null;
        List list6 = null;
        String str6 = null;
        List list7 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        int i4 = 0;
        boolean z = true;
        boolean zA = false;
        boolean zA2 = false;
        while (true) {
            List list8 = list2;
            if (!z) {
                String str10 = str2;
                List list9 = list6;
                int i5 = i4;
                List list10 = list5;
                tz0VarC.a(no7Var);
                List list11 = list3;
                String str11 = strO;
                List list12 = list7;
                String str12 = str7;
                vp8 vp8Var2 = vp8Var;
                List list13 = list4;
                return new i15(i5, str11, strO2, strO3, list10, str4, strO4, str5, list9, str6, list12, str12, str8, str9, list8, list11, zu4Var, str3, strO5, pa8Var, sd0Var, vp8Var2, list13, zA, zA2, p55Var, str10, jcVar, kk1Var, yt7Var2);
            }
            int i6 = tz0VarC.i(no7Var);
            switch (i6) {
                case -1:
                    yt7Var = yt7Var2;
                    z = false;
                    i4 = i4;
                    list6 = list6;
                    str2 = str2;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 0:
                    yt7Var = yt7Var2;
                    list6 = list6;
                    i4 |= 1;
                    str2 = str2;
                    strO = tz0VarC.o(no7Var, 0);
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 1:
                    yt7Var = yt7Var2;
                    strO2 = tz0VarC.o(no7Var, 1);
                    list6 = list6;
                    i4 |= 2;
                    str2 = str2;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 2:
                    yt7Var = yt7Var2;
                    str = str2;
                    list = list6;
                    i = i4 | 4;
                    strO3 = tz0VarC.o(no7Var, 2);
                    i4 = i;
                    list6 = list;
                    str2 = str;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 3:
                    yt7Var = yt7Var2;
                    str = str2;
                    list = list6;
                    i4 |= 8;
                    list5 = (List) tz0VarC.z(no7Var, 3, (px3) c24VarArr[3].getValue(), list5);
                    list6 = list;
                    str2 = str;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 4:
                    yt7Var = yt7Var2;
                    str = str2;
                    list = list6;
                    i4 |= 16;
                    str4 = (String) tz0VarC.z(no7Var, 4, b88.a, str4);
                    list6 = list;
                    str2 = str;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 5:
                    yt7Var = yt7Var2;
                    str = str2;
                    list = list6;
                    i = i4 | 32;
                    strO4 = tz0VarC.o(no7Var, 5);
                    i4 = i;
                    list6 = list;
                    str2 = str;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 6:
                    yt7Var = yt7Var2;
                    str = str2;
                    list = list6;
                    i4 |= 64;
                    str5 = (String) tz0VarC.z(no7Var, 6, b88.a, str5);
                    list6 = list;
                    str2 = str;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 7:
                    yt7Var = yt7Var2;
                    str = str2;
                    i4 |= 128;
                    list6 = (List) tz0VarC.z(no7Var, 7, (px3) c24VarArr[7].getValue(), list6);
                    str2 = str;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 8:
                    yt7Var = yt7Var2;
                    str = str2;
                    i4 |= 256;
                    str6 = (String) tz0VarC.z(no7Var, 8, b88.a, str6);
                    str2 = str;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 9:
                    yt7Var = yt7Var2;
                    str = str2;
                    i4 |= 512;
                    list7 = (List) tz0VarC.z(no7Var, 9, (px3) c24VarArr[9].getValue(), list7);
                    str2 = str;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 10:
                    yt7Var = yt7Var2;
                    str = str2;
                    i4 |= 1024;
                    str7 = (String) tz0VarC.z(no7Var, 10, b88.a, str7);
                    str2 = str;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 11:
                    yt7Var = yt7Var2;
                    str = str2;
                    i4 |= 2048;
                    str8 = (String) tz0VarC.z(no7Var, 11, b88.a, str8);
                    str2 = str;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 12:
                    yt7Var = yt7Var2;
                    str = str2;
                    i4 |= 4096;
                    str9 = (String) tz0VarC.z(no7Var, 12, b88.a, str9);
                    str2 = str;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 13:
                    yt7Var = yt7Var2;
                    str = str2;
                    i4 |= 8192;
                    list8 = (List) tz0VarC.z(no7Var, 13, (px3) c24VarArr[13].getValue(), list8);
                    str2 = str;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 14:
                    i4 |= 16384;
                    list3 = (List) tz0VarC.z(no7Var, 14, (px3) c24VarArr[14].getValue(), list3);
                    yt7Var = yt7Var2;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 15:
                    i4 |= 32768;
                    zu4Var = (zu4) tz0VarC.z(no7Var, 15, xu4.a, zu4Var);
                    yt7Var = yt7Var2;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 16:
                    i4 |= 65536;
                    str3 = (String) tz0VarC.z(no7Var, 16, b88.a, str3);
                    yt7Var = yt7Var2;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 17:
                    i4 |= 131072;
                    strO5 = tz0VarC.o(no7Var, 17);
                    yt7Var = yt7Var2;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 18:
                    i4 |= 262144;
                    pa8Var = (pa8) tz0VarC.z(no7Var, 18, na8.a, pa8Var);
                    yt7Var = yt7Var2;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 19:
                    i4 |= 524288;
                    sd0Var = (sd0) tz0VarC.z(no7Var, 19, qd0.a, sd0Var);
                    yt7Var = yt7Var2;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 20:
                    i4 |= 1048576;
                    vp8Var = (vp8) tz0VarC.z(no7Var, 20, tp8.a, vp8Var);
                    yt7Var = yt7Var2;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 21:
                    i4 |= 2097152;
                    list4 = (List) tz0VarC.z(no7Var, 21, (px3) c24VarArr[21].getValue(), list4);
                    yt7Var = yt7Var2;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 22:
                    i2 = i4;
                    zA = tz0VarC.A(no7Var, 22);
                    i3 = 4194304;
                    i4 = i2 | i3;
                    yt7Var = yt7Var2;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 23:
                    i2 = i4;
                    zA2 = tz0VarC.A(no7Var, 23);
                    i3 = 8388608;
                    i4 = i2 | i3;
                    yt7Var = yt7Var2;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 24:
                    i4 |= 16777216;
                    p55Var = (p55) tz0VarC.z(no7Var, 24, n55.a, p55Var);
                    yt7Var = yt7Var2;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 25:
                    i4 |= 33554432;
                    str2 = (String) tz0VarC.z(no7Var, 25, b88.a, str2);
                    yt7Var = yt7Var2;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 26:
                    i4 |= 67108864;
                    jcVar = (jc) tz0VarC.z(no7Var, 26, hc.a, jcVar);
                    yt7Var = yt7Var2;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 27:
                    i4 |= 134217728;
                    kk1Var = (kk1) tz0VarC.z(no7Var, 27, ik1.a, kk1Var);
                    yt7Var = yt7Var2;
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                case 28:
                    i4 |= 268435456;
                    yt7Var = (yt7) tz0VarC.z(no7Var, 28, ut7.a, yt7Var2);
                    list2 = list8;
                    yt7Var2 = yt7Var;
                    break;
                default:
                    throw new UnknownFieldException(i6);
            }
        }
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        i15 i15Var = (i15) obj;
        js3.p(i15Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        c24[] c24VarArr = i15.D;
        uz0VarC.w(no7Var, 0, i15Var.a);
        uz0VarC.w(no7Var, 1, i15Var.b);
        uz0VarC.w(no7Var, 2, i15Var.c);
        uz0VarC.z(no7Var, 3, (px3) c24VarArr[3].getValue(), i15Var.d);
        b88 b88Var = b88.a;
        uz0VarC.z(no7Var, 4, b88Var, i15Var.e);
        uz0VarC.w(no7Var, 5, i15Var.f);
        uz0VarC.z(no7Var, 6, b88Var, i15Var.g);
        uz0VarC.z(no7Var, 7, (px3) c24VarArr[7].getValue(), i15Var.h);
        uz0VarC.z(no7Var, 8, b88Var, i15Var.i);
        uz0VarC.z(no7Var, 9, (px3) c24VarArr[9].getValue(), i15Var.j);
        uz0VarC.z(no7Var, 10, b88Var, i15Var.k);
        uz0VarC.z(no7Var, 11, b88Var, i15Var.l);
        uz0VarC.z(no7Var, 12, b88Var, i15Var.m);
        uz0VarC.z(no7Var, 13, (px3) c24VarArr[13].getValue(), i15Var.n);
        uz0VarC.z(no7Var, 14, (px3) c24VarArr[14].getValue(), i15Var.o);
        uz0VarC.z(no7Var, 15, xu4.a, i15Var.p);
        uz0VarC.z(no7Var, 16, b88Var, i15Var.q);
        uz0VarC.w(no7Var, 17, i15Var.r);
        uz0VarC.z(no7Var, 18, na8.a, i15Var.s);
        uz0VarC.z(no7Var, 19, qd0.a, i15Var.t);
        uz0VarC.z(no7Var, 20, tp8.a, i15Var.u);
        uz0VarC.z(no7Var, 21, (px3) c24VarArr[21].getValue(), i15Var.v);
        uz0VarC.n(no7Var, 22, i15Var.w);
        uz0VarC.n(no7Var, 23, i15Var.x);
        uz0VarC.z(no7Var, 24, n55.a, i15Var.y);
        uz0VarC.z(no7Var, 25, b88Var, i15Var.z);
        uz0VarC.z(no7Var, 26, hc.a, i15Var.A);
        uz0VarC.z(no7Var, 27, ik1.a, i15Var.B);
        uz0VarC.z(no7Var, 28, ut7.a, i15Var.C);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
