package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class ot2 implements sx3 {
    public final dy2 b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    public volatile byte[] g;
    public int h;

    public ot2(URL url) {
        k24 k24Var = dy2.a;
        ok4.p(url, "Argument must not be null");
        this.c = url;
        this.d = null;
        ok4.p(k24Var, "Argument must not be null");
        this.b = k24Var;
    }

    @Override // defpackage.sx3
    public final void b(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(sx3.a);
        }
        messageDigest.update(this.g);
    }

    public final String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        ok4.p(url, "Argument must not be null");
        return url.toString();
    }

    public final String d() {
        if (TextUtils.isEmpty(this.e)) {
            String string = this.d;
            if (TextUtils.isEmpty(string)) {
                URL url = this.c;
                ok4.p(url, "Argument must not be null");
                string = url.toString();
            }
            this.e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
        }
        return this.e;
    }

    @Override // defpackage.sx3
    public final boolean equals(Object obj) {
        if (obj instanceof ot2) {
            ot2 ot2Var = (ot2) obj;
            if (c().equals(ot2Var.c()) && this.b.equals(ot2Var.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sx3
    public final int hashCode() {
        if (this.h == 0) {
            int iHashCode = c().hashCode();
            this.h = iHashCode;
            this.h = this.b.hashCode() + (iHashCode * 31);
        }
        return this.h;
    }

    public final String toString() {
        return c();
    }

    public ot2(String str, dy2 dy2Var) {
        this.c = null;
        if (!TextUtils.isEmpty(str)) {
            this.d = str;
            ok4.p(dy2Var, "Argument must not be null");
            this.b = dy2Var;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
