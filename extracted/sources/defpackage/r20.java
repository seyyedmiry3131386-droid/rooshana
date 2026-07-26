package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r20 extends id4 {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final om5 g;

    public r20(long j, Integer num, long j2, byte[] bArr, String str, long j3, om5 om5Var) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = om5Var;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        om5 om5Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof id4) {
            id4 id4Var = (id4) obj;
            r20 r20Var = (r20) id4Var;
            om5 om5Var2 = r20Var.g;
            String str2 = r20Var.e;
            Integer num2 = r20Var.b;
            if (this.a == r20Var.a && ((num = this.b) != null ? num.equals(num2) : num2 == null) && this.c == r20Var.c) {
                if (Arrays.equals(this.d, id4Var instanceof r20 ? ((r20) id4Var).d : r20Var.d) && ((str = this.e) != null ? str.equals(str2) : str2 == null) && this.f == r20Var.f && ((om5Var = this.g) != null ? om5Var.equals(om5Var2) : om5Var2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.c;
        int iHashCode2 = (((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f;
        int i2 = (iHashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        om5 om5Var = this.g;
        return i2 ^ (om5Var != null ? om5Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}
