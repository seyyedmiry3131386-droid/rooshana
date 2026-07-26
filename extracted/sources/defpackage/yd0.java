package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public final class yd0 extends sj5 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd0(int i, boolean z) {
        super(z);
        this.r = i;
    }

    @Override // defpackage.sj5
    public final Object a(Bundle bundle, String str) {
        switch (this.r) {
            case 0:
                js3.p(bundle, "bundle");
                if (!bundle.containsKey(str) || t17.g(bundle, str)) {
                    return null;
                }
                boolean z = bundle.getBoolean(str, false);
                if (z || !bundle.getBoolean(str, true)) {
                    return Boolean.valueOf(z);
                }
                z17.f(str);
                throw null;
            case 1:
                js3.p(bundle, "bundle");
                float f = bundle.getFloat(str, Float.MIN_VALUE);
                if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return Float.valueOf(f);
                }
                z17.f(str);
                throw null;
            case 2:
                js3.p(bundle, "bundle");
                return Integer.valueOf(t17.b(bundle, str));
            case 3:
                js3.p(bundle, "bundle");
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return Long.valueOf(j);
                }
                z17.f(str);
                throw null;
            case 4:
                js3.p(bundle, "bundle");
                return Integer.valueOf(t17.b(bundle, str));
            default:
                js3.p(bundle, "bundle");
                if (!bundle.containsKey(str) || t17.g(bundle, str)) {
                    return null;
                }
                String string = bundle.getString(str);
                if (string != null) {
                    return string;
                }
                z17.f(str);
                throw null;
        }
    }

    @Override // defpackage.sj5
    public final String b() {
        switch (this.r) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            case 4:
                return "reference";
            default:
                return "string";
        }
    }

    @Override // defpackage.sj5
    public final Object d(String str) {
        boolean z;
        int i;
        String strSubstring;
        long j;
        int i2;
        switch (this.r) {
            case 0:
                js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                if (str.equals("true")) {
                    z = true;
                } else {
                    if (!str.equals("false")) {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                return Float.valueOf(Float.parseFloat(str));
            case 2:
                js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                if (m88.Z(str, "0x", false)) {
                    String strSubstring2 = str.substring(2);
                    js3.o(strSubstring2, "substring(...)");
                    js3.q(16);
                    i = Integer.parseInt(strSubstring2, 16);
                } else {
                    i = Integer.parseInt(str);
                }
                return Integer.valueOf(i);
            case 3:
                js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                if (m88.S(str, "L", false)) {
                    strSubstring = str.substring(0, str.length() - 1);
                    js3.o(strSubstring, "substring(...)");
                } else {
                    strSubstring = str;
                }
                if (m88.Z(str, "0x", false)) {
                    String strSubstring3 = strSubstring.substring(2);
                    js3.o(strSubstring3, "substring(...)");
                    js3.q(16);
                    j = Long.parseLong(strSubstring3, 16);
                } else {
                    j = Long.parseLong(strSubstring);
                }
                return Long.valueOf(j);
            case 4:
                js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                if (m88.Z(str, "0x", false)) {
                    String strSubstring4 = str.substring(2);
                    js3.o(strSubstring4, "substring(...)");
                    js3.q(16);
                    i2 = Integer.parseInt(strSubstring4, 16);
                } else {
                    i2 = Integer.parseInt(str);
                }
                return Integer.valueOf(i2);
            default:
                js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                if (str.equals(Ssh2PublicKeyAlgorithmName.NULL)) {
                    return null;
                }
                return str;
        }
    }

    @Override // defpackage.sj5
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.r) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                js3.p(str, "key");
                bundle.putBoolean(str, zBooleanValue);
                break;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                js3.p(str, "key");
                bundle.putFloat(str, fFloatValue);
                break;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                js3.p(str, "key");
                bundle.putInt(str, iIntValue);
                break;
            case 3:
                long jLongValue = ((Number) obj).longValue();
                js3.p(str, "key");
                bundle.putLong(str, jLongValue);
                break;
            case 4:
                int iIntValue2 = ((Number) obj).intValue();
                js3.p(str, "key");
                bundle.putInt(str, iIntValue2);
                break;
            default:
                String str2 = (String) obj;
                js3.p(str, "key");
                if (str2 == null) {
                    h27.k(bundle, str);
                } else {
                    h27.m(str, str2, bundle);
                }
                break;
        }
    }

    @Override // defpackage.sj5
    public String f(Object obj) {
        switch (this.r) {
            case 5:
                String str = (String) obj;
                return str != null ? eq.k(str) : Ssh2PublicKeyAlgorithmName.NULL;
            default:
                return super.f(obj);
        }
    }
}
