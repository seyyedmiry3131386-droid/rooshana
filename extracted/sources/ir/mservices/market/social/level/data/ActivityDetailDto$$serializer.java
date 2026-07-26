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
public final /* synthetic */ class ActivityDetailDto$$serializer implements jr2 {
    public static final ActivityDetailDto$$serializer INSTANCE;
    private static final no7 descriptor;

    static {
        ActivityDetailDto$$serializer activityDetailDto$$serializer = new ActivityDetailDto$$serializer();
        INSTANCE = activityDetailDto$$serializer;
        ug6 ug6Var = new ug6("ir.mservices.market.social.level.data.ActivityDetailDto", activityDetailDto$$serializer, 3);
        ug6Var.j("percent", false);
        ug6Var.j("title", false);
        ug6Var.j("color", false);
        descriptor = ug6Var;
    }

    private ActivityDetailDto$$serializer() {
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        b88 b88Var = b88.a;
        return new px3[]{xq3.a, ct2.n(b88Var), ct2.n(b88Var)};
    }

    @Override // defpackage.px3
    public final ActivityDetailDto deserialize(cc1 cc1Var) {
        js3.p(cc1Var, "decoder");
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        int i = 0;
        int iT = 0;
        String str = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                iT = tz0VarC.t(no7Var, 0);
                i |= 1;
            } else if (i2 == 1) {
                str = (String) tz0VarC.z(no7Var, 1, b88.a, str);
                i |= 2;
            } else {
                if (i2 != 2) {
                    throw new UnknownFieldException(i2);
                }
                str2 = (String) tz0VarC.z(no7Var, 2, b88.a, str2);
                i |= 4;
            }
        }
        tz0VarC.a(no7Var);
        return new ActivityDetailDto(i, iT, str, str2, null);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, ActivityDetailDto activityDetailDto) {
        js3.p(q12Var, "encoder");
        js3.p(activityDetailDto, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        ActivityDetailDto.write$Self$MyKet_primaryClientProductMyketRelease(activityDetailDto, uz0VarC, no7Var);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
