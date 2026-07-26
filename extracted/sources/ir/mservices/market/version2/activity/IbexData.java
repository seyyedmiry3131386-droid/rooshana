package ir.mservices.market.version2.activity;

import defpackage.js3;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class IbexData implements Serializable {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public IbexData(String str, String str2, String str3, String str4) {
        js3.p(str, "movieType");
        js3.p(str2, "title");
        js3.p(str3, "posterBlurUrl");
        js3.p(str4, "posterUrl");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }
}
