package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b10 implements jr2 {
    public static final b10 a;
    private static final no7 descriptor;

    static {
        b10 b10Var = new b10();
        a = b10Var;
        ug6 ug6Var = new ug6("ir.myket.auth.model.dto.AuthRequestBodyDto", b10Var, 14);
        ug6Var.j("uuid", false);
        ug6Var.j("deviceModel", false);
        ug6Var.j("deviceManufacturer", false);
        ug6Var.j("deviceName", false);
        ug6Var.j("deviceBrand", false);
        ug6Var.j("deviceProduct", false);
        ug6Var.j("apiLevel", false);
        ug6Var.j("density", false);
        ug6Var.j("screenSize", false);
        ug6Var.j("cpuAbis", false);
        ug6Var.j("supportedAbis", false);
        ug6Var.j("clientHash", false);
        ug6Var.j("accountId", false);
        ug6Var.j("accountKey", false);
        descriptor = ug6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        c24[] c24VarArr = d10.o;
        b88 b88Var = b88.a;
        return new px3[]{b88Var, b88Var, b88Var, b88Var, b88Var, b88Var, b88Var, b88Var, b88Var, c24VarArr[9].getValue(), ct2.n((px3) c24VarArr[10].getValue()), b88Var, b88Var, b88Var};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        c24[] c24VarArr;
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        c24[] c24VarArr2 = d10.o;
        List list = null;
        List list2 = null;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        String strO6 = null;
        String strO7 = null;
        String strO8 = null;
        String strO9 = null;
        String strO10 = null;
        String strO11 = null;
        String strO12 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            switch (i2) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    c24VarArr = c24VarArr2;
                    strO = tz0VarC.o(no7Var, 0);
                    i |= 1;
                    break;
                case 1:
                    c24VarArr = c24VarArr2;
                    strO2 = tz0VarC.o(no7Var, 1);
                    i |= 2;
                    break;
                case 2:
                    c24VarArr = c24VarArr2;
                    strO3 = tz0VarC.o(no7Var, 2);
                    i |= 4;
                    break;
                case 3:
                    c24VarArr = c24VarArr2;
                    strO4 = tz0VarC.o(no7Var, 3);
                    i |= 8;
                    break;
                case 4:
                    c24VarArr = c24VarArr2;
                    strO5 = tz0VarC.o(no7Var, 4);
                    i |= 16;
                    break;
                case 5:
                    c24VarArr = c24VarArr2;
                    strO6 = tz0VarC.o(no7Var, 5);
                    i |= 32;
                    break;
                case 6:
                    c24VarArr = c24VarArr2;
                    strO7 = tz0VarC.o(no7Var, 6);
                    i |= 64;
                    break;
                case 7:
                    c24VarArr = c24VarArr2;
                    strO8 = tz0VarC.o(no7Var, 7);
                    i |= 128;
                    break;
                case 8:
                    c24VarArr = c24VarArr2;
                    strO9 = tz0VarC.o(no7Var, 8);
                    i |= 256;
                    break;
                case 9:
                    c24VarArr = c24VarArr2;
                    list = (List) tz0VarC.s(no7Var, 9, (px3) c24VarArr[9].getValue(), list);
                    i |= 512;
                    break;
                case 10:
                    c24VarArr = c24VarArr2;
                    list2 = (List) tz0VarC.z(no7Var, 10, (px3) c24VarArr2[10].getValue(), list2);
                    i |= 1024;
                    break;
                case 11:
                    strO10 = tz0VarC.o(no7Var, 11);
                    i |= 2048;
                    continue;
                case 12:
                    strO11 = tz0VarC.o(no7Var, 12);
                    i |= 4096;
                    continue;
                case 13:
                    strO12 = tz0VarC.o(no7Var, 13);
                    i |= 8192;
                    continue;
                default:
                    throw new UnknownFieldException(i2);
            }
            c24VarArr2 = c24VarArr;
        }
        tz0VarC.a(no7Var);
        return new d10(i, strO, strO2, strO3, strO4, strO5, strO6, strO7, strO8, strO9, list, list2, strO10, strO11, strO12);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        d10 d10Var = (d10) obj;
        js3.p(d10Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        c24[] c24VarArr = d10.o;
        uz0VarC.w(no7Var, 0, d10Var.a);
        uz0VarC.w(no7Var, 1, d10Var.b);
        uz0VarC.w(no7Var, 2, d10Var.c);
        uz0VarC.w(no7Var, 3, d10Var.d);
        uz0VarC.w(no7Var, 4, d10Var.e);
        uz0VarC.w(no7Var, 5, d10Var.f);
        uz0VarC.w(no7Var, 6, d10Var.g);
        uz0VarC.w(no7Var, 7, d10Var.h);
        uz0VarC.w(no7Var, 8, d10Var.i);
        uz0VarC.o(no7Var, 9, (px3) c24VarArr[9].getValue(), d10Var.j);
        uz0VarC.z(no7Var, 10, (px3) c24VarArr[10].getValue(), d10Var.k);
        uz0VarC.w(no7Var, 11, d10Var.l);
        uz0VarC.w(no7Var, 12, d10Var.m);
        uz0VarC.w(no7Var, 13, d10Var.n);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
