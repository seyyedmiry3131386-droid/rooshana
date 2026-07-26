package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class d10 {
    public static final c10 Companion = new c10();
    public static final c24[] o;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final List k;
    public final String l;
    public final String m;
    public final String n;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.b;
        o = new c24[]{null, null, null, null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new v7(15)), a.b(lazyThreadSafetyMode, new v7(16)), null, null, null};
    }

    public /* synthetic */ d10(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, List list2, String str10, String str11, String str12) {
        if (16383 != (i & 16383)) {
            wq2.S(i, 16383, b10.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = list;
        this.k = list2;
        this.l = str10;
        this.m = str11;
        this.n = str12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d10)) {
            return false;
        }
        d10 d10Var = (d10) obj;
        return js3.i(this.a, d10Var.a) && js3.i(this.b, d10Var.b) && js3.i(this.c, d10Var.c) && js3.i(this.d, d10Var.d) && js3.i(this.e, d10Var.e) && js3.i(this.f, d10Var.f) && js3.i(this.g, d10Var.g) && js3.i(this.h, d10Var.h) && js3.i(this.i, d10Var.i) && js3.i(this.j, d10Var.j) && js3.i(this.k, d10Var.k) && js3.i(this.l, d10Var.l) && js3.i(this.m, d10Var.m) && js3.i(this.n, d10Var.n);
    }

    public final int hashCode() {
        int i = rm7.i(rm7.k(this.i, rm7.k(this.h, rm7.k(this.g, rm7.k(this.f, rm7.k(this.e, rm7.k(this.d, rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31, this.j);
        List list = this.k;
        return this.n.hashCode() + rm7.k(this.m, rm7.k(this.l, (i + (list == null ? 0 : list.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("AuthRequestBodyDto(uuid=", this.a, ", deviceModel=", this.b, ", deviceManufacture=");
        o40.I(this.c, ", deviceName=", this.d, ", deviceBrand=", sbT);
        o40.I(this.e, ", deviceProduct=", this.f, ", apiLevel=", sbT);
        o40.I(this.g, ", density=", this.h, ", screenSize=", sbT);
        sbT.append(this.i);
        sbT.append(", cpuAbis=");
        sbT.append(this.j);
        sbT.append(", supportedAbis=");
        sbT.append(this.k);
        sbT.append(", clientHash=");
        sbT.append(this.l);
        sbT.append(", accountId=");
        return dw1.p(this.m, ", accountKey=", this.n, ")", sbT);
    }

    public d10(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, List list2, String str10, String str11, String str12) {
        js3.p(str7, "apiLevel");
        js3.p(str8, "density");
        js3.p(str9, "screenSize");
        js3.p(list, "cpuAbis");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = list;
        this.k = list2;
        this.l = str10;
        this.m = str11;
        this.n = str12;
    }
}
