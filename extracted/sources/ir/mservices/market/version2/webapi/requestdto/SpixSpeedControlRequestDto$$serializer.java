package ir.mservices.market.version2.webapi.requestdto;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.at2;
import defpackage.b88;
import defpackage.cc1;
import defpackage.ct2;
import defpackage.ee0;
import defpackage.jr2;
import defpackage.js3;
import defpackage.no7;
import defpackage.px3;
import defpackage.q12;
import defpackage.se4;
import defpackage.tz0;
import defpackage.ug6;
import defpackage.uz0;
import defpackage.yj1;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
@yj1
public final /* synthetic */ class SpixSpeedControlRequestDto$$serializer implements jr2 {
    public static final SpixSpeedControlRequestDto$$serializer INSTANCE;
    private static final no7 descriptor;

    static {
        SpixSpeedControlRequestDto$$serializer spixSpeedControlRequestDto$$serializer = new SpixSpeedControlRequestDto$$serializer();
        INSTANCE = spixSpeedControlRequestDto$$serializer;
        ug6 ug6Var = new ug6("ir.mservices.market.version2.webapi.requestdto.SpixSpeedControlRequestDto", spixSpeedControlRequestDto$$serializer, 13);
        ug6Var.j("downloadKey", false);
        ug6Var.j("hostName", false);
        ug6Var.j("timestamp", false);
        ug6Var.j("localSize", false);
        ug6Var.j("startStatus", false);
        ug6Var.j("startDetailStatus", false);
        ug6Var.j("endStatus", false);
        ug6Var.j("endDetailStatus", false);
        ug6Var.j("downloadType", false);
        ug6Var.j("serverSize", false);
        ug6Var.j("url", false);
        ug6Var.j("isHot", false);
        ug6Var.j("neneInsertTs", false);
        descriptor = ug6Var;
    }

    private SpixSpeedControlRequestDto$$serializer() {
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        b88 b88Var = b88.a;
        px3 px3VarN = ct2.n(b88Var);
        px3 px3VarN2 = ct2.n(b88Var);
        se4 se4Var = se4.a;
        return new px3[]{b88Var, b88Var, se4Var, se4Var, b88Var, px3VarN, b88Var, px3VarN2, b88Var, se4Var, b88Var, ee0.a, se4Var};
    }

    @Override // defpackage.px3
    public final SpixSpeedControlRequestDto deserialize(cc1 cc1Var) {
        js3.p(cc1Var, "decoder");
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        String str = null;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        String strO6 = null;
        long jE = 0;
        long jE2 = 0;
        long jE3 = 0;
        long jE4 = 0;
        int i = 0;
        boolean zA = false;
        boolean z = true;
        String str2 = null;
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
                    jE = tz0VarC.E(no7Var, 2);
                    i |= 4;
                    break;
                case 3:
                    jE2 = tz0VarC.E(no7Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strO3 = tz0VarC.o(no7Var, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) tz0VarC.z(no7Var, 5, b88.a, str);
                    i |= 32;
                    break;
                case 6:
                    strO4 = tz0VarC.o(no7Var, 6);
                    i |= 64;
                    break;
                case 7:
                    str2 = (String) tz0VarC.z(no7Var, 7, b88.a, str2);
                    i |= 128;
                    break;
                case 8:
                    strO5 = tz0VarC.o(no7Var, 8);
                    i |= 256;
                    break;
                case 9:
                    jE3 = tz0VarC.E(no7Var, 9);
                    i |= 512;
                    break;
                case 10:
                    strO6 = tz0VarC.o(no7Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    zA = tz0VarC.A(no7Var, 11);
                    i |= 2048;
                    break;
                case 12:
                    jE4 = tz0VarC.E(no7Var, 12);
                    i |= 4096;
                    break;
                default:
                    throw new UnknownFieldException(i2);
            }
        }
        tz0VarC.a(no7Var);
        return new SpixSpeedControlRequestDto(i, strO, strO2, jE, jE2, strO3, str, strO4, str2, strO5, jE3, strO6, zA, jE4, null);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, SpixSpeedControlRequestDto spixSpeedControlRequestDto) {
        js3.p(q12Var, "encoder");
        js3.p(spixSpeedControlRequestDto, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        SpixSpeedControlRequestDto.write$Self$MyKet_primaryClientProductMyketRelease(spixSpeedControlRequestDto, uz0VarC, no7Var);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
