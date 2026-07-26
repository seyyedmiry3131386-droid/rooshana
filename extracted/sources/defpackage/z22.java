package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.myket.movie.common.domain.models.EpisodeBannerType;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z22 implements jr2 {
    public static final z22 a;
    private static final no7 descriptor;

    static {
        z22 z22Var = new z22();
        a = z22Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.domain.models.Episode", z22Var, 10);
        ug6Var.j("id", false);
        ug6Var.j("playId", false);
        ug6Var.j("title", false);
        ug6Var.j("buttonText", false);
        ug6Var.j("bannerUrl", false);
        ug6Var.j("defaultBannerUrl", false);
        ug6Var.j("bannerType", false);
        ug6Var.j("secondaryTitle", false);
        ug6Var.j("analyticsName", false);
        ug6Var.j("isLastEpisode", false);
        descriptor = ug6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        c24[] c24VarArr = b32.k;
        b88 b88Var = b88.a;
        return new px3[]{b88Var, b88Var, b88Var, b88Var, ct2.n(b88Var), b88Var, c24VarArr[6].getValue(), ct2.n(b88Var), ct2.n(b88Var), ee0.a};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        c24[] c24VarArr = b32.k;
        String str = null;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String str2 = null;
        String strO5 = null;
        EpisodeBannerType episodeBannerType = null;
        String str3 = null;
        boolean z = true;
        int i = 0;
        boolean zA = false;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            switch (i2) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strO = tz0VarC.o(no7Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strO2 = tz0VarC.o(no7Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strO3 = tz0VarC.o(no7Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strO4 = tz0VarC.o(no7Var, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) tz0VarC.z(no7Var, 4, b88.a, str2);
                    i |= 16;
                    break;
                case 5:
                    strO5 = tz0VarC.o(no7Var, 5);
                    i |= 32;
                    break;
                case 6:
                    episodeBannerType = (EpisodeBannerType) tz0VarC.s(no7Var, 6, (px3) c24VarArr[6].getValue(), episodeBannerType);
                    i |= 64;
                    break;
                case 7:
                    str3 = (String) tz0VarC.z(no7Var, 7, b88.a, str3);
                    i |= 128;
                    break;
                case 8:
                    str = (String) tz0VarC.z(no7Var, 8, b88.a, str);
                    i |= 256;
                    break;
                case 9:
                    zA = tz0VarC.A(no7Var, 9);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(i2);
            }
        }
        tz0VarC.a(no7Var);
        return new b32(i, strO, strO2, strO3, strO4, str2, strO5, episodeBannerType, str3, str, zA);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        b32 b32Var = (b32) obj;
        js3.p(b32Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        c24[] c24VarArr = b32.k;
        uz0VarC.w(no7Var, 0, b32Var.a);
        uz0VarC.w(no7Var, 1, b32Var.b);
        uz0VarC.w(no7Var, 2, b32Var.c);
        uz0VarC.w(no7Var, 3, b32Var.d);
        b88 b88Var = b88.a;
        uz0VarC.z(no7Var, 4, b88Var, b32Var.e);
        uz0VarC.w(no7Var, 5, b32Var.f);
        uz0VarC.o(no7Var, 6, (px3) c24VarArr[6].getValue(), b32Var.g);
        uz0VarC.z(no7Var, 7, b88Var, b32Var.h);
        uz0VarC.z(no7Var, 8, b88Var, b32Var.i);
        uz0VarC.n(no7Var, 9, b32Var.j);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
