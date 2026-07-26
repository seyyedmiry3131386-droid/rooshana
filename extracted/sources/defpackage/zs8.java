package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Triple;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class zs8 implements px3 {
    public final px3 a;
    public final px3 b;
    public final px3 c;
    public final po7 d = z27.b("kotlin.Triple", new no7[0], new a67(23, this));

    public zs8(px3 px3Var, px3 px3Var2, px3 px3Var3) {
        this.a = px3Var;
        this.b = px3Var2;
        this.c = px3Var3;
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        po7 po7Var = this.d;
        tz0 tz0VarC = cc1Var.c(po7Var);
        Object obj = dy3.g;
        Object objS = obj;
        Object objS2 = objS;
        Object objS3 = objS2;
        while (true) {
            int i = tz0VarC.i(po7Var);
            if (i == -1) {
                tz0VarC.a(po7Var);
                if (objS == obj) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objS2 == obj) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objS3 != obj) {
                    return new Triple(objS, objS2, objS3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (i == 0) {
                objS = tz0VarC.s(po7Var, 0, this.a, null);
            } else if (i == 1) {
                objS2 = tz0VarC.s(po7Var, 1, this.b, null);
            } else {
                if (i != 2) {
                    throw new SerializationException(rm7.n(i, "Unexpected index "));
                }
                objS3 = tz0VarC.s(po7Var, 2, this.c, null);
            }
        }
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return this.d;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        Triple triple = (Triple) obj;
        js3.p(triple, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        po7 po7Var = this.d;
        uz0 uz0VarC = q12Var.c(po7Var);
        uz0VarC.o(po7Var, 0, this.a, triple.a);
        uz0VarC.o(po7Var, 1, this.b, triple.b);
        uz0VarC.o(po7Var, 2, this.c, triple.c);
        uz0VarC.a(po7Var);
    }
}
