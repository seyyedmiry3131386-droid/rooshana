package ir.mservices.market.social.level.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.at2;
import defpackage.b88;
import defpackage.cc1;
import defpackage.ct2;
import defpackage.jr2;
import defpackage.js3;
import defpackage.no7;
import defpackage.px3;
import defpackage.q12;
import defpackage.tz0;
import defpackage.ug6;
import defpackage.uz0;
import defpackage.xq3;
import defpackage.yj1;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
@yj1
public final /* synthetic */ class XpDetailDto$$serializer implements jr2 {
    public static final XpDetailDto$$serializer INSTANCE;
    private static final no7 descriptor;

    static {
        XpDetailDto$$serializer xpDetailDto$$serializer = new XpDetailDto$$serializer();
        INSTANCE = xpDetailDto$$serializer;
        ug6 ug6Var = new ug6("ir.mservices.market.social.level.data.XpDetailDto", xpDetailDto$$serializer, 5);
        ug6Var.j("levelStart", false);
        ug6Var.j("exactXP", false);
        ug6Var.j("levelEnd", false);
        ug6Var.j("xpLevel", false);
        ug6Var.j("xpColor", false);
        descriptor = ug6Var;
    }

    private XpDetailDto$$serializer() {
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        px3 px3VarN = ct2.n(b88.a);
        xq3 xq3Var = xq3.a;
        return new px3[]{xq3Var, xq3Var, xq3Var, xq3Var, px3VarN};
    }

    @Override // defpackage.px3
    public final XpDetailDto deserialize(cc1 cc1Var) {
        js3.p(cc1Var, "decoder");
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        int i = 0;
        int iT = 0;
        int iT2 = 0;
        int iT3 = 0;
        int iT4 = 0;
        String str = null;
        boolean z = true;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                iT = tz0VarC.t(no7Var, 0);
                i |= 1;
            } else if (i2 == 1) {
                iT2 = tz0VarC.t(no7Var, 1);
                i |= 2;
            } else if (i2 == 2) {
                iT3 = tz0VarC.t(no7Var, 2);
                i |= 4;
            } else if (i2 == 3) {
                iT4 = tz0VarC.t(no7Var, 3);
                i |= 8;
            } else {
                if (i2 != 4) {
                    throw new UnknownFieldException(i2);
                }
                str = (String) tz0VarC.z(no7Var, 4, b88.a, str);
                i |= 16;
            }
        }
        tz0VarC.a(no7Var);
        return new XpDetailDto(i, iT, iT2, iT3, iT4, str, null);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, XpDetailDto xpDetailDto) {
        js3.p(q12Var, "encoder");
        js3.p(xpDetailDto, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        XpDetailDto.write$Self$MyKet_primaryClientProductMyketRelease(xpDetailDto, uz0VarC, no7Var);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
