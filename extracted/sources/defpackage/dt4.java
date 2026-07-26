package defpackage;

import java.nio.charset.Charset;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class dt4 {
    public static final Regex e = new Regex("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Regex f = new Regex(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;
    public final String b;
    public final String c;
    public final String[] d;

    public dt4(String str, String str2, String str3, String[] strArr) {
        js3.p(str, "mediaType");
        js3.p(strArr, "parameterNamesAndValues");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.d;
        int i = 0;
        int iK = wq2.K(0, strArr.length - 1, 2);
        if (iK < 0) {
            str = null;
            break;
        }
        while (!m88.T(strArr[i], "charset", true)) {
            if (i == iK) {
                str = null;
                break;
            }
            i += 2;
        }
        str = strArr[i + 1];
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dt4) && js3.i(((dt4) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
