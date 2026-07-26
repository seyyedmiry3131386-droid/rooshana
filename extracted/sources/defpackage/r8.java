package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8 implements jr2 {
    public static final r8 a;
    private static final no7 descriptor;

    static {
        r8 r8Var = new r8();
        a = r8Var;
        ug6 ug6Var = new ug6("ir.myket.player.data.models.AdContentDto", r8Var, 12);
        ug6Var.j("url", false);
        ug6Var.j("duration", false);
        ug6Var.j("skippable", false);
        ug6Var.j("skipOffset", false);
        ug6Var.j("startCallback", false);
        ug6Var.j("firstQuartileCallback", false);
        ug6Var.j("midPointCallback", false);
        ug6Var.j("thirdQuartileCallback", false);
        ug6Var.j("completeCallback", false);
        ug6Var.j("skipCallback", false);
        ug6Var.j("exitCallback", false);
        ug6Var.j("progress", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        b88 b88Var = b88.a;
        xq3 xq3Var = xq3.a;
        return new px3[]{b88Var, xq3Var, ct2.n(ee0.a), ct2.n(xq3Var), ct2.n(b88Var), ct2.n(b88Var), ct2.n(b88Var), ct2.n(b88Var), ct2.n(b88Var), ct2.n(b88Var), ct2.n(b88Var), ct2.n(bm6.a)};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        String str;
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        String str2 = null;
        String str3 = null;
        dm6 dm6Var = null;
        String strO = null;
        Boolean bool = null;
        Integer num = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i = 0;
        boolean z = true;
        int iT = 0;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            switch (i2) {
                case -1:
                    str = strO;
                    z = false;
                    break;
                case 0:
                    i |= 1;
                    strO = tz0VarC.o(no7Var, 0);
                    continue;
                case 1:
                    iT = tz0VarC.t(no7Var, 1);
                    i |= 2;
                    continue;
                case 2:
                    str = strO;
                    bool = (Boolean) tz0VarC.z(no7Var, 2, ee0.a, bool);
                    i |= 4;
                    break;
                case 3:
                    str = strO;
                    num = (Integer) tz0VarC.z(no7Var, 3, xq3.a, num);
                    i |= 8;
                    break;
                case 4:
                    str = strO;
                    str4 = (String) tz0VarC.z(no7Var, 4, b88.a, str4);
                    i |= 16;
                    break;
                case 5:
                    str = strO;
                    str5 = (String) tz0VarC.z(no7Var, 5, b88.a, str5);
                    i |= 32;
                    break;
                case 6:
                    str = strO;
                    str6 = (String) tz0VarC.z(no7Var, 6, b88.a, str6);
                    i |= 64;
                    break;
                case 7:
                    str = strO;
                    str7 = (String) tz0VarC.z(no7Var, 7, b88.a, str7);
                    i |= 128;
                    break;
                case 8:
                    str = strO;
                    str8 = (String) tz0VarC.z(no7Var, 8, b88.a, str8);
                    i |= 256;
                    break;
                case 9:
                    str = strO;
                    str2 = (String) tz0VarC.z(no7Var, 9, b88.a, str2);
                    i |= 512;
                    break;
                case 10:
                    str = strO;
                    str3 = (String) tz0VarC.z(no7Var, 10, b88.a, str3);
                    i |= 1024;
                    break;
                case 11:
                    str = strO;
                    dm6Var = (dm6) tz0VarC.z(no7Var, 11, bm6.a, dm6Var);
                    i |= 2048;
                    break;
                default:
                    throw new UnknownFieldException(i2);
            }
            strO = str;
        }
        tz0VarC.a(no7Var);
        return new t8(i, strO, iT, bool, num, str4, str5, str6, str7, str8, str2, str3, dm6Var);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        t8 t8Var = (t8) obj;
        js3.p(t8Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        uz0VarC.w(no7Var, 0, t8Var.a);
        uz0VarC.v(1, t8Var.b, no7Var);
        uz0VarC.z(no7Var, 2, ee0.a, t8Var.c);
        uz0VarC.z(no7Var, 3, xq3.a, t8Var.d);
        b88 b88Var = b88.a;
        uz0VarC.z(no7Var, 4, b88Var, t8Var.e);
        uz0VarC.z(no7Var, 5, b88Var, t8Var.f);
        uz0VarC.z(no7Var, 6, b88Var, t8Var.g);
        uz0VarC.z(no7Var, 7, b88Var, t8Var.h);
        uz0VarC.z(no7Var, 8, b88Var, t8Var.i);
        uz0VarC.z(no7Var, 9, b88Var, t8Var.j);
        uz0VarC.z(no7Var, 10, b88Var, t8Var.k);
        uz0VarC.z(no7Var, 11, bm6.a, t8Var.l);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
