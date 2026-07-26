package io.noties.markwon.html.jsoup.parser;

import defpackage.dn8;
import defpackage.dy;
import defpackage.en8;
import defpackage.fn8;
import defpackage.hn8;
import defpackage.i26;
import defpackage.in8;
import defpackage.jn8;
import defpackage.tt9;
import defpackage.xp0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final char[] r;
    public static final int[] s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final xp0 a;
    public final ParseErrorList b;
    public tt9 d;
    public jn8 i;
    public final in8 j;
    public final hn8 k;
    public final dn8 l;
    public final fn8 m;
    public final en8 n;
    public String o;
    public final int[] p;
    public final int[] q;
    public TokeniserState c = TokeniserState.a;
    public boolean e = false;
    public String f = null;
    public final StringBuilder g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        r = cArr;
        Arrays.sort(cArr);
    }

    public a(xp0 xp0Var, ParseErrorList parseErrorList) {
        in8 in8Var = new in8(Token$TokenType.b);
        in8Var.k = new dy();
        this.j = in8Var;
        this.k = new hn8(Token$TokenType.c);
        this.l = new dn8();
        this.m = new fn8();
        this.n = new en8();
        this.p = new int[1];
        this.q = new int[2];
        this.a = xp0Var;
        this.b = parseErrorList;
    }

    public final void a(TokeniserState tokeniserState) {
        this.a.a();
        this.c = tokeniserState;
    }

    public final void b(String str) {
        ParseErrorList parseErrorList = this.b;
        if (parseErrorList.size() < 0) {
            xp0 xp0Var = this.a;
            parseErrorList.add(new i26(xp0Var.e + xp0Var.d, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (java.util.Arrays.binarySearch(io.noties.markwon.html.jsoup.parser.a.r, r4[r1.d]) >= 0) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int[] c(java.lang.Character r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.noties.markwon.html.jsoup.parser.a.c(java.lang.Character, boolean):int[]");
    }

    public final jn8 d(boolean z) {
        jn8 jn8Var;
        if (z) {
            jn8Var = this.j;
            jn8Var.p();
        } else {
            jn8Var = this.k;
            jn8Var.p();
        }
        this.i = jn8Var;
        return jn8Var;
    }

    public final void e() {
        tt9.q(this.h);
    }

    public final void f(char c) {
        g(String.valueOf(c));
    }

    public final void g(String str) {
        if (this.f == null) {
            this.f = str;
            return;
        }
        StringBuilder sb = this.g;
        if (sb.length() == 0) {
            sb.append(this.f);
        }
        sb.append(str);
    }

    public final void h(tt9 tt9Var) {
        if (this.e) {
            throw new IllegalArgumentException("There is an unread token pending!");
        }
        this.d = tt9Var;
        this.e = true;
        Token$TokenType token$TokenType = (Token$TokenType) tt9Var.b;
        if (token$TokenType == Token$TokenType.b) {
            this.o = ((in8) tt9Var).c;
            return;
        }
        if (token$TokenType != Token$TokenType.c || ((hn8) tt9Var).k == null) {
            return;
        }
        ParseErrorList parseErrorList = this.b;
        if (parseErrorList.size() < 0) {
            xp0 xp0Var = this.a;
            int i = xp0Var.e + xp0Var.d;
            i26 i26Var = new i26();
            i26Var.c = i;
            i26Var.b = "Attributes incorrectly present on end tag";
            parseErrorList.add(i26Var);
        }
    }

    public final void i() {
        h(this.n);
    }

    public final void j() {
        h(this.m);
    }

    public final void k() {
        jn8 jn8Var = this.i;
        if (jn8Var.e != null) {
            jn8Var.I();
        }
        h(this.i);
    }

    public final void l(TokeniserState tokeniserState) {
        ParseErrorList parseErrorList = this.b;
        if (parseErrorList.size() < 0) {
            xp0 xp0Var = this.a;
            parseErrorList.add(new i26(xp0Var.e + xp0Var.d, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{tokeniserState}));
        }
    }

    public final void m(TokeniserState tokeniserState) {
        ParseErrorList parseErrorList = this.b;
        if (parseErrorList.size() < 0) {
            xp0 xp0Var = this.a;
            parseErrorList.add(new i26(xp0Var.e + xp0Var.d, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(xp0Var.i()), tokeniserState}));
        }
    }

    public final boolean n() {
        return this.o != null && this.i.H().equalsIgnoreCase(this.o);
    }

    public final tt9 o() {
        while (!this.e) {
            this.c.e(this, this.a);
        }
        StringBuilder sb = this.g;
        int length = sb.length();
        dn8 dn8Var = this.l;
        if (length > 0) {
            String string = sb.toString();
            sb.delete(0, sb.length());
            this.f = null;
            dn8Var.c = string;
            return dn8Var;
        }
        String str = this.f;
        if (str == null) {
            this.e = false;
            return this.d;
        }
        dn8Var.c = str;
        this.f = null;
        return dn8Var;
    }
}
