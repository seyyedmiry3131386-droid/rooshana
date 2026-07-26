package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import ir.myket.movie.common.domain.models.MovieType;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nz4 implements jr2 {
    public static final nz4 a;
    private static final no7 descriptor;

    static {
        nz4 nz4Var = new nz4();
        a = nz4Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.domain.models.Movie", nz4Var, 8);
        ug6Var.j("id", false);
        ug6Var.j("title", false);
        ug6Var.j("posterUrl", false);
        ug6Var.j("seasons", false);
        ug6Var.j("secondaryTitle", false);
        ug6Var.j("type", false);
        ug6Var.j("refId", false);
        ug6Var.j(PackageListMetaDataDTO.KEY_ACTION, false);
        descriptor = ug6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        c24[] c24VarArr = pz4.l;
        b88 b88Var = b88.a;
        return new px3[]{b88Var, b88Var, b88Var, ct2.n((px3) c24VarArr[3].getValue()), ct2.n(b88Var), c24VarArr[5].getValue(), ct2.n(b88Var), ct2.n(b88Var)};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        c24[] c24VarArr = pz4.l;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        pj3 pj3Var = null;
        String str = null;
        MovieType movieType = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        boolean z = true;
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
                    pj3Var = (pj3) tz0VarC.z(no7Var, 3, (px3) c24VarArr[3].getValue(), pj3Var);
                    i |= 8;
                    break;
                case 4:
                    str = (String) tz0VarC.z(no7Var, 4, b88.a, str);
                    i |= 16;
                    break;
                case 5:
                    movieType = (MovieType) tz0VarC.s(no7Var, 5, (px3) c24VarArr[5].getValue(), movieType);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) tz0VarC.z(no7Var, 6, b88.a, str2);
                    i |= 64;
                    break;
                case 7:
                    str3 = (String) tz0VarC.z(no7Var, 7, b88.a, str3);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(i2);
            }
        }
        tz0VarC.a(no7Var);
        return new pz4(i, strO, strO2, strO3, pj3Var, str, movieType, str2, str3);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        pz4 pz4Var = (pz4) obj;
        js3.p(pz4Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        c24[] c24VarArr = pz4.l;
        uz0VarC.w(no7Var, 0, pz4Var.d);
        uz0VarC.w(no7Var, 1, pz4Var.e);
        uz0VarC.w(no7Var, 2, pz4Var.f);
        uz0VarC.z(no7Var, 3, (px3) c24VarArr[3].getValue(), pz4Var.g);
        b88 b88Var = b88.a;
        uz0VarC.z(no7Var, 4, b88Var, pz4Var.h);
        uz0VarC.o(no7Var, 5, (px3) c24VarArr[5].getValue(), pz4Var.i);
        uz0VarC.z(no7Var, 6, b88Var, pz4Var.j);
        uz0VarC.z(no7Var, 7, b88Var, pz4Var.k);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
