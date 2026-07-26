package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes3.dex */
public final class t29 implements px3 {
    public static final t29 a = new t29();
    public static final bk6 b = new bk6("kotlin.uuid.Uuid", xj6.j);

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        String strConcat;
        String strV = cc1Var.v();
        js3.p(strV, "uuidString");
        int length = strV.length();
        if (length == 32) {
            long jB = qy2.b(strV, 0, 16);
            long jB2 = qy2.b(strV, 16, 32);
            if (jB != 0 || jB2 != 0) {
                return new Uuid(jB, jB2);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (strV.length() <= 64) {
                    strConcat = strV;
                } else {
                    String strSubstring = strV.substring(0, 64);
                    js3.o(strSubstring, "substring(...)");
                    strConcat = strSubstring.concat("...");
                }
                sb.append(strConcat);
                sb.append("\" of length ");
                sb.append(strV.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long jB3 = qy2.b(strV, 0, 8);
            a77.b(8, strV);
            long jB4 = qy2.b(strV, 9, 13);
            a77.b(13, strV);
            long jB5 = qy2.b(strV, 14, 18);
            a77.b(18, strV);
            long jB6 = qy2.b(strV, 19, 23);
            a77.b(23, strV);
            long j = (jB4 << 16) | (jB3 << 32) | jB5;
            long jB7 = qy2.b(strV, 24, 36) | (jB6 << 48);
            if (j != 0 || jB7 != 0) {
                return new Uuid(j, jB7);
            }
        }
        return Uuid.c;
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return b;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        Uuid uuid = (Uuid) obj;
        js3.p(uuid, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        q12Var.C(uuid.toString());
    }
}
