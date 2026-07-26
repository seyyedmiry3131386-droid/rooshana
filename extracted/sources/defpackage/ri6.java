package defpackage;

import ir.mservices.market.version2.download.DownloadDataModel;

/* JADX INFO: loaded from: classes3.dex */
public final class ri6 {
    public final DownloadDataModel a;
    public final String b;

    public ri6(DownloadDataModel downloadDataModel, String str) {
        js3.p(downloadDataModel, "downloadDataModel");
        this.a = downloadDataModel;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri6)) {
            return false;
        }
        ri6 ri6Var = (ri6) obj;
        return js3.i(this.a, ri6Var.a) && js3.i(this.b, ri6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PreapprovalRequest(downloadDataModel=" + this.a + ", action=" + this.b + ")";
    }
}
