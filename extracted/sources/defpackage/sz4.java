package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sz4 implements jr2 {
    public static final sz4 a;
    private static final no7 descriptor;

    static {
        sz4 sz4Var = new sz4();
        a = sz4Var;
        ug6 ug6Var = new ug6("ir.myket.player.data.models.MovieAdDto", sz4Var, 7);
        ug6Var.j("sequence", false);
        ug6Var.j("target", false);
        ug6Var.j("content", false);
        ug6Var.j("endCard", false);
        ug6Var.j("player", false);
        ug6Var.j("appInfo", false);
        ug6Var.j(CommonDataKt.AD_LINK, false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        return new px3[]{ct2.n(xq3.a), ct2.n(b88.a), r8.a, ct2.n(y9.a), ct2.n(eb.a), ct2.n(j8.a), ct2.n(xa.a)};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        int i = 0;
        Integer num = null;
        String str = null;
        t8 t8Var = null;
        aa aaVar = null;
        gb gbVar = null;
        l8 l8Var = null;
        za zaVar = null;
        boolean z = true;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            switch (i2) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) tz0VarC.z(no7Var, 0, xq3.a, num);
                    i |= 1;
                    break;
                case 1:
                    str = (String) tz0VarC.z(no7Var, 1, b88.a, str);
                    i |= 2;
                    break;
                case 2:
                    t8Var = (t8) tz0VarC.s(no7Var, 2, r8.a, t8Var);
                    i |= 4;
                    break;
                case 3:
                    aaVar = (aa) tz0VarC.z(no7Var, 3, y9.a, aaVar);
                    i |= 8;
                    break;
                case 4:
                    gbVar = (gb) tz0VarC.z(no7Var, 4, eb.a, gbVar);
                    i |= 16;
                    break;
                case 5:
                    l8Var = (l8) tz0VarC.z(no7Var, 5, j8.a, l8Var);
                    i |= 32;
                    break;
                case 6:
                    zaVar = (za) tz0VarC.z(no7Var, 6, xa.a, zaVar);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(i2);
            }
        }
        tz0VarC.a(no7Var);
        return new uz4(i, num, str, t8Var, aaVar, gbVar, l8Var, zaVar);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        uz4 uz4Var = (uz4) obj;
        js3.p(uz4Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        uz0VarC.z(no7Var, 0, xq3.a, uz4Var.a);
        uz0VarC.z(no7Var, 1, b88.a, uz4Var.b);
        uz0VarC.o(no7Var, 2, r8.a, uz4Var.c);
        uz0VarC.z(no7Var, 3, y9.a, uz4Var.d);
        uz0VarC.z(no7Var, 4, eb.a, uz4Var.e);
        uz0VarC.z(no7Var, 5, j8.a, uz4Var.f);
        uz0VarC.z(no7Var, 6, xa.a, uz4Var.g);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
