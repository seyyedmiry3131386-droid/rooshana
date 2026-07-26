package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qa8 implements jr2 {
    public static final qa8 a;
    private static final no7 descriptor;

    static {
        qa8 qa8Var = new qa8();
        a = qa8Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.SubscriptionItemDto", qa8Var, 8);
        ug6Var.j("title", false);
        ug6Var.j("actionText", false);
        ug6Var.j("subTitle", false);
        ug6Var.j(PackageListMetaDataDTO.KEY_ACTION, false);
        ug6Var.j("selectedIcon", false);
        ug6Var.j("deselectedIcon", false);
        ug6Var.j("imageType", false);
        ug6Var.j("id", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        b88 b88Var = b88.a;
        return new px3[]{b88Var, b88Var, ct2.n(b88Var), b88Var, ct2.n(b88Var), ct2.n(b88Var), ct2.n(b88Var), ct2.n(b88Var)};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        int i = 0;
        String strO = null;
        String strO2 = null;
        String str = null;
        String strO3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
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
                    str = (String) tz0VarC.z(no7Var, 2, b88.a, str);
                    i |= 4;
                    break;
                case 3:
                    strO3 = tz0VarC.o(no7Var, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) tz0VarC.z(no7Var, 4, b88.a, str2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) tz0VarC.z(no7Var, 5, b88.a, str3);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) tz0VarC.z(no7Var, 6, b88.a, str4);
                    i |= 64;
                    break;
                case 7:
                    str5 = (String) tz0VarC.z(no7Var, 7, b88.a, str5);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(i2);
            }
        }
        tz0VarC.a(no7Var);
        return new sa8(i, strO, strO2, str, strO3, str2, str3, str4, str5);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        sa8 sa8Var = (sa8) obj;
        js3.p(sa8Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        uz0VarC.w(no7Var, 0, sa8Var.a);
        uz0VarC.w(no7Var, 1, sa8Var.b);
        b88 b88Var = b88.a;
        uz0VarC.z(no7Var, 2, b88Var, sa8Var.c);
        uz0VarC.w(no7Var, 3, sa8Var.d);
        uz0VarC.z(no7Var, 4, b88Var, sa8Var.e);
        uz0VarC.z(no7Var, 5, b88Var, sa8Var.f);
        uz0VarC.z(no7Var, 6, b88Var, sa8Var.g);
        uz0VarC.z(no7Var, 7, b88Var, sa8Var.h);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
