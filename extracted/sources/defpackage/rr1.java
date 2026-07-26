package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class rr1 implements ai5 {
    public final String a;

    public rr1(String str) {
        this.a = str;
    }

    public static final rr1 fromBundle(Bundle bundle) {
        return new rr1(t61.B(bundle, "bundle", rr1.class, "download_type") ? bundle.getString("download_type") : "apps");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rr1) && js3.i(this.a, ((rr1) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return o40.y("DownloadContentFragmentArgs(downloadType=", this.a, ")");
    }
}
