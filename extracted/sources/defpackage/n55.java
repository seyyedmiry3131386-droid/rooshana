package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n55 implements jr2 {
    public static final n55 a;
    private static final no7 descriptor;

    static {
        n55 n55Var = new n55();
        a = n55Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.MovieReviewInfoDto", n55Var, 6);
        ug6Var.j("raiting", false);
        ug6Var.j("color", false);
        ug6Var.j("title", false);
        ug6Var.j("subtitle", false);
        ug6Var.j("reviews", false);
        ug6Var.j("userReview", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        c24[] c24VarArr = p55.g;
        b88 b88Var = b88.a;
        return new px3[]{ct2.n(b88Var), ct2.n(b88Var), ct2.n(b88Var), ct2.n(b88Var), ct2.n((px3) c24VarArr[4].getValue()), ct2.n(d55.a)};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        c24[] c24VarArr = p55.g;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList arrayList = null;
        f55 f55Var = null;
        boolean z = true;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            switch (i2) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) tz0VarC.z(no7Var, 0, b88.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) tz0VarC.z(no7Var, 1, b88.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) tz0VarC.z(no7Var, 2, b88.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) tz0VarC.z(no7Var, 3, b88.a, str4);
                    i |= 8;
                    break;
                case 4:
                    arrayList = (ArrayList) tz0VarC.z(no7Var, 4, (px3) c24VarArr[4].getValue(), arrayList);
                    i |= 16;
                    break;
                case 5:
                    f55Var = (f55) tz0VarC.z(no7Var, 5, d55.a, f55Var);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(i2);
            }
        }
        tz0VarC.a(no7Var);
        return new p55(i, str, str2, str3, str4, arrayList, f55Var);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        p55 p55Var = (p55) obj;
        js3.p(p55Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        c24[] c24VarArr = p55.g;
        b88 b88Var = b88.a;
        uz0VarC.z(no7Var, 0, b88Var, p55Var.a);
        uz0VarC.z(no7Var, 1, b88Var, p55Var.b);
        uz0VarC.z(no7Var, 2, b88Var, p55Var.c);
        uz0VarC.z(no7Var, 3, b88Var, p55Var.d);
        uz0VarC.z(no7Var, 4, (px3) c24VarArr[4].getValue(), p55Var.e);
        uz0VarC.z(no7Var, 5, d55.a, p55Var.f);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
