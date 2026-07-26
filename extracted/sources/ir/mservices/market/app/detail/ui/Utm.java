package ir.mservices.market.app.detail.ui;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class Utm implements Serializable {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;

    public /* synthetic */ Utm(String str, int i) {
        this((i & 1) != 0 ? null : str, null, null, null, null);
    }

    public Utm(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }
}
