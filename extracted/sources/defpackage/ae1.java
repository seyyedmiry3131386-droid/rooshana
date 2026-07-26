package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ae1 implements xa1 {
    public final Context a;
    public final ArrayList b;
    public final xa1 c;
    public eb2 d;
    public mw e;
    public v31 f;
    public xa1 g;
    public dx8 h;
    public ua1 i;
    public jv6 j;
    public xa1 k;

    public ae1(Context context, xa1 xa1Var) {
        this.a = context.getApplicationContext();
        xa1Var.getClass();
        this.c = xa1Var;
        this.b = new ArrayList();
    }

    public static void o(xa1 xa1Var, fq8 fq8Var) {
        if (xa1Var != null) {
            xa1Var.c(fq8Var);
        }
    }

    @Override // defpackage.xa1
    public final long b(db1 db1Var) {
        vy2.s(this.k == null);
        Uri uri = db1Var.a;
        String scheme = uri.getScheme();
        String str = j29.a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    eb2 eb2Var = new eb2(false);
                    this.d = eb2Var;
                    l(eb2Var);
                }
                this.k = this.d;
            } else {
                if (this.e == null) {
                    mw mwVar = new mw(context);
                    this.e = mwVar;
                    l(mwVar);
                }
                this.k = this.e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                mw mwVar2 = new mw(context);
                this.e = mwVar2;
                l(mwVar2);
            }
            this.k = this.e;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                v31 v31Var = new v31(context);
                this.f = v31Var;
                l(v31Var);
            }
            this.k = this.f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            xa1 xa1Var = this.c;
            if (zEquals) {
                if (this.g == null) {
                    try {
                        xa1 xa1Var2 = (xa1) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.g = xa1Var2;
                        l(xa1Var2);
                    } catch (ClassNotFoundException unused) {
                        wn5.k0("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.g == null) {
                        this.g = xa1Var;
                    }
                }
                this.k = this.g;
            } else if ("udp".equals(scheme)) {
                if (this.h == null) {
                    dx8 dx8Var = new dx8();
                    this.h = dx8Var;
                    l(dx8Var);
                }
                this.k = this.h;
            } else if ("data".equals(scheme)) {
                if (this.i == null) {
                    ua1 ua1Var = new ua1(false);
                    this.i = ua1Var;
                    l(ua1Var);
                }
                this.k = this.i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    jv6 jv6Var = new jv6(context);
                    this.j = jv6Var;
                    l(jv6Var);
                }
                this.k = this.j;
            } else {
                this.k = xa1Var;
            }
        }
        return this.k.b(db1Var);
    }

    @Override // defpackage.xa1
    public final void c(fq8 fq8Var) {
        fq8Var.getClass();
        this.c.c(fq8Var);
        this.b.add(fq8Var);
        o(this.d, fq8Var);
        o(this.e, fq8Var);
        o(this.f, fq8Var);
        o(this.g, fq8Var);
        o(this.h, fq8Var);
        o(this.i, fq8Var);
        o(this.j, fq8Var);
    }

    @Override // defpackage.xa1
    public final void close() {
        xa1 xa1Var = this.k;
        if (xa1Var != null) {
            try {
                xa1Var.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // defpackage.xa1
    public final Map k() {
        xa1 xa1Var = this.k;
        return xa1Var == null ? Collections.EMPTY_MAP : xa1Var.k();
    }

    public final void l(xa1 xa1Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            xa1Var.c((fq8) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.xa1
    public final Uri p() {
        xa1 xa1Var = this.k;
        if (xa1Var == null) {
            return null;
        }
        return xa1Var.p();
    }

    @Override // defpackage.ra1
    public final int read(byte[] bArr, int i, int i2) {
        xa1 xa1Var = this.k;
        xa1Var.getClass();
        return xa1Var.read(bArr, i, i2);
    }
}
