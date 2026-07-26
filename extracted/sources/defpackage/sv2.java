package defpackage;

import com.google.gson.stream.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class sv2 extends qt8 {
    public final /* synthetic */ int a;

    public /* synthetic */ sv2(int i) {
        this.a = i;
    }

    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        switch (this.a) {
            case 0:
                if (mw3Var.R() != JsonToken.i) {
                    return Double.valueOf(mw3Var.nextDouble());
                }
                mw3Var.J();
                return null;
            case 1:
                if (mw3Var.R() != JsonToken.i) {
                    return Float.valueOf((float) mw3Var.nextDouble());
                }
                mw3Var.J();
                return null;
            default:
                mw3Var.z();
                return null;
        }
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    vv2.a(dDoubleValue);
                    uw3Var.K(dDoubleValue);
                } else {
                    uw3Var.u();
                }
                break;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    vv2.a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    uw3Var.R(numberValueOf);
                } else {
                    uw3Var.u();
                }
                break;
            default:
                uw3Var.u();
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
