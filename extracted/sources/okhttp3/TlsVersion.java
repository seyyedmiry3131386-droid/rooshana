package okhttp3;

import defpackage.ol3;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class TlsVersion {
    public static final ol3 b;
    public static final TlsVersion c;
    public static final TlsVersion d;
    public static final TlsVersion e;
    public static final TlsVersion f;
    public static final TlsVersion g;
    public static final /* synthetic */ TlsVersion[] h;
    public final String a;

    static {
        TlsVersion tlsVersion = new TlsVersion("TLS_1_3", 0, "TLSv1.3");
        c = tlsVersion;
        TlsVersion tlsVersion2 = new TlsVersion("TLS_1_2", 1, "TLSv1.2");
        d = tlsVersion2;
        TlsVersion tlsVersion3 = new TlsVersion("TLS_1_1", 2, "TLSv1.1");
        e = tlsVersion3;
        TlsVersion tlsVersion4 = new TlsVersion("TLS_1_0", 3, "TLSv1");
        f = tlsVersion4;
        TlsVersion tlsVersion5 = new TlsVersion("SSL_3_0", 4, "SSLv3");
        g = tlsVersion5;
        TlsVersion[] tlsVersionArr = {tlsVersion, tlsVersion2, tlsVersion3, tlsVersion4, tlsVersion5};
        h = tlsVersionArr;
        a.a(tlsVersionArr);
        b = new ol3(29);
    }

    public TlsVersion(String str, int i, String str2) {
        this.a = str2;
    }

    public static TlsVersion valueOf(String str) {
        return (TlsVersion) Enum.valueOf(TlsVersion.class, str);
    }

    public static TlsVersion[] values() {
        return (TlsVersion[]) h.clone();
    }
}
