package defpackage;

import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;

/* JADX INFO: loaded from: classes.dex */
public final class m20 {
    public static final m20 f = new m20(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, 10000, 10485760, 604800000, 81920);
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public m20(int i, int i2, long j, long j2, int i3) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m20) {
            m20 m20Var = (m20) obj;
            if (this.a == m20Var.a && this.b == m20Var.b && this.c == m20Var.c && this.d == m20Var.d && this.e == m20Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        long j2 = this.d;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.a);
        sb.append(", loadBatchSize=");
        sb.append(this.b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.d);
        sb.append(", maxBlobByteSizePerRow=");
        return dw1.k(this.e, "}", sb);
    }
}
