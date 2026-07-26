package defpackage;

import com.google.android.datatransport.cct.internal.QosTier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class s20 extends kd4 {
    public final long a;
    public final long b;
    public final i20 c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public s20(long j, long j2, i20 i20Var, Integer num, String str, ArrayList arrayList) {
        QosTier qosTier = QosTier.a;
        this.a = j;
        this.b = j2;
        this.c = i20Var;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kd4)) {
            return false;
        }
        s20 s20Var = (s20) ((kd4) obj);
        Object obj2 = QosTier.a;
        ArrayList arrayList = s20Var.f;
        String str = s20Var.e;
        Integer num = s20Var.d;
        i20 i20Var = s20Var.c;
        if (this.a != s20Var.a || this.b != s20Var.b || !this.c.equals(i20Var)) {
            return false;
        }
        Integer num2 = this.d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ QosTier.a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + QosTier.a + "}";
    }
}
