package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import kotlin.a;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class u22 implements px3 {
    public final Enum[] a;
    public final c24 b;

    public u22(String str, Enum[] enumArr) {
        js3.p(enumArr, "values");
        this.a = enumArr;
        this.b = a.a(new d(this, str, 21));
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        int iW = cc1Var.w(getDescriptor());
        Enum[] enumArr = this.a;
        if (iW >= 0 && iW < enumArr.length) {
            return enumArr[iW];
        }
        throw new SerializationException(iW + " is not among valid " + getDescriptor().a() + " enum values, values size is " + enumArr.length);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return (no7) this.b.getValue();
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        Enum r5 = (Enum) obj;
        js3.p(r5, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Enum[] enumArr = this.a;
        int iN0 = ew.N0(enumArr, r5);
        if (iN0 != -1) {
            q12Var.t(getDescriptor(), iN0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().a());
        sb.append(", must be one of ");
        String string = Arrays.toString(enumArr);
        js3.o(string, "toString(...)");
        sb.append(string);
        throw new SerializationException(sb.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
    }
}
