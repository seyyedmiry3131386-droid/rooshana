package defpackage;

import ir.mservices.market.download.common.data.DownloadUrlDto;

/* JADX INFO: loaded from: classes3.dex */
public final class lt1 {
    public final DownloadUrlDto a;
    public final long b;

    public lt1(DownloadUrlDto downloadUrlDto, long j) {
        js3.p(downloadUrlDto, "downloadUrl");
        this.a = downloadUrlDto;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt1)) {
            return false;
        }
        lt1 lt1Var = (lt1) obj;
        return js3.i(this.a, lt1Var.a) && this.b == lt1Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "DownloadUriData(downloadUrl=" + this.a + ", requestTime=" + this.b + ")";
    }
}
