package defpackage;

import ir.mservices.market.movie.data.webapi.CommonDataKt;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class se3 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final List g;
    public final String h;
    public final String i;

    public se3(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        String strSubstring = str.substring(f88.k0(':', length, 4, str) + 1, f88.k0('@', 0, 6, str));
        js3.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iK0 = f88.k0('/', length, 4, str);
        String strSubstring = str.substring(iK0, gh9.e(iK0, str.length(), str, "?#"));
        js3.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iK0 = f88.k0('/', length, 4, str);
        int iE = gh9.e(iK0, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iK0 < iE) {
            int i = iK0 + 1;
            int iF = gh9.f(str, '/', i, iE);
            String strSubstring = str.substring(i, iF);
            js3.o(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iK0 = iF;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int iK0 = f88.k0('?', 0, 6, str) + 1;
        String strSubstring = str.substring(iK0, gh9.f(str, '#', iK0, str.length()));
        js3.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        String strSubstring = str.substring(length, gh9.e(length, str.length(), str, ":@"));
        js3.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof se3) && js3.i(((se3) obj).i, this.i);
    }

    public final boolean f() {
        return js3.i(this.a, "https");
    }

    public final re3 g(String str) {
        js3.p(str, CommonDataKt.AD_LINK);
        try {
            re3 re3Var = new re3(0);
            re3Var.e(this, str);
            return re3Var;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String h() {
        re3 re3VarG = g("/...");
        js3.m(re3VarG);
        re3VarG.d = hs9.s(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        re3VarG.e = hs9.s(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        return re3VarG.b().i;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final URI i() {
        String strSubstring;
        re3 re3Var = new re3(0);
        ArrayList arrayList = (ArrayList) re3Var.h;
        String str = this.a;
        re3Var.c = str;
        re3Var.d = e();
        re3Var.e = a();
        re3Var.f = this.d;
        js3.p(str, "scheme");
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i2 = this.e;
        re3Var.b = i2 != i ? i2 : -1;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        re3Var.i = strD != null ? re3.f(hs9.s(0, 0, 83, strD, " \"'<>#")) : null;
        if (this.h == null) {
            strSubstring = null;
        } else {
            String str2 = this.i;
            strSubstring = str2.substring(f88.k0('#', 0, 6, str2) + 1);
            js3.o(strSubstring, "substring(...)");
        }
        re3Var.g = strSubstring;
        String str3 = (String) re3Var.f;
        re3Var.f = str3 != null ? new Regex("[\"<>^`{|}]").g(str3) : null;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, hs9.s(0, 0, 99, (String) arrayList.get(i3), "[]"));
        }
        ArrayList arrayList2 = (ArrayList) re3Var.i;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str4 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str4 != null ? hs9.s(0, 0, 67, str4, "\\^`{|}") : null);
            }
        }
        String str5 = (String) re3Var.g;
        re3Var.g = str5 != null ? hs9.s(0, 0, 35, str5, " \"#<>\\^`{|}") : null;
        String string = re3Var.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").g(string));
                js3.m(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String toString() {
        return this.i;
    }
}
