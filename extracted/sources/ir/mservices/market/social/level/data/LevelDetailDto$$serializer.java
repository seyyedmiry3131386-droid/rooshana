package ir.mservices.market.social.level.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.at2;
import defpackage.b88;
import defpackage.c24;
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
import defpackage.yj1;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
@yj1
public final /* synthetic */ class LevelDetailDto$$serializer implements jr2 {
    public static final LevelDetailDto$$serializer INSTANCE;
    private static final no7 descriptor;

    static {
        LevelDetailDto$$serializer levelDetailDto$$serializer = new LevelDetailDto$$serializer();
        INSTANCE = levelDetailDto$$serializer;
        ug6 ug6Var = new ug6("ir.mservices.market.social.level.data.LevelDetailDto", levelDetailDto$$serializer, 3);
        ug6Var.j("activityDetailText", false);
        ug6Var.j("activityDetails", false);
        ug6Var.j("xpDetail", false);
        descriptor = ug6Var;
    }

    private LevelDetailDto$$serializer() {
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        return new px3[]{ct2.n(b88.a), ct2.n((px3) LevelDetailDto.$childSerializers[1].getValue()), ct2.n(XpDetailDto$$serializer.INSTANCE)};
    }

    @Override // defpackage.px3
    public final LevelDetailDto deserialize(cc1 cc1Var) {
        js3.p(cc1Var, "decoder");
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        c24[] c24VarArr = LevelDetailDto.$childSerializers;
        int i = 0;
        String str = null;
        List list = null;
        XpDetailDto xpDetailDto = null;
        boolean z = true;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                str = (String) tz0VarC.z(no7Var, 0, b88.a, str);
                i |= 1;
            } else if (i2 == 1) {
                list = (List) tz0VarC.z(no7Var, 1, (px3) c24VarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (i2 != 2) {
                    throw new UnknownFieldException(i2);
                }
                xpDetailDto = (XpDetailDto) tz0VarC.z(no7Var, 2, XpDetailDto$$serializer.INSTANCE, xpDetailDto);
                i |= 4;
            }
        }
        tz0VarC.a(no7Var);
        return new LevelDetailDto(i, str, list, xpDetailDto, null);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, LevelDetailDto levelDetailDto) {
        js3.p(q12Var, "encoder");
        js3.p(levelDetailDto, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        LevelDetailDto.write$Self$MyKet_primaryClientProductMyketRelease(levelDetailDto, uz0VarC, no7Var);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
