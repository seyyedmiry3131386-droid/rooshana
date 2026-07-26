package io.noties.markwon.html.jsoup.parser;

import com.j256.ormlite.stmt.query.SimpleComparison;
import defpackage.cn8;
import defpackage.en8;
import defpackage.fn8;
import defpackage.gn8;
import defpackage.jn8;
import defpackage.xp0;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
abstract class TokeniserState {
    public static final AnonymousClass28 A;
    public static final AnonymousClass57 A0;
    public static final AnonymousClass29 B;
    public static final AnonymousClass58 B0;
    public static final AnonymousClass30 C;
    public static final AnonymousClass59 C0;
    public static final AnonymousClass31 D;
    public static final AnonymousClass60 D0;
    public static final AnonymousClass32 E;
    public static final AnonymousClass61 E0;
    public static final AnonymousClass33 F;
    public static final AnonymousClass62 F0;
    public static final AnonymousClass34 G;
    public static final AnonymousClass63 G0;
    public static final AnonymousClass35 H;
    public static final AnonymousClass64 H0;
    public static final AnonymousClass36 I;
    public static final AnonymousClass65 I0;
    public static final AnonymousClass37 J;
    public static final AnonymousClass66 J0;
    public static final AnonymousClass38 K;
    public static final AnonymousClass67 K0;
    public static final AnonymousClass39 L;
    public static final char[] L0;
    public static final AnonymousClass40 M;
    public static final char[] M0;
    public static final AnonymousClass41 N;
    public static final char[] N0;
    public static final AnonymousClass42 O;
    public static final char[] O0;
    public static final AnonymousClass43 P;
    public static final String P0;
    public static final AnonymousClass44 Q;
    public static final /* synthetic */ TokeniserState[] Q0;
    public static final AnonymousClass45 R;
    public static final AnonymousClass46 S;
    public static final AnonymousClass47 T;
    public static final AnonymousClass48 U;
    public static final AnonymousClass49 V;
    public static final AnonymousClass50 W;
    public static final AnonymousClass51 X;
    public static final AnonymousClass52 Y;
    public static final AnonymousClass53 Z;
    public static final AnonymousClass1 a;
    public static final AnonymousClass2 b;
    public static final AnonymousClass3 c;
    public static final AnonymousClass4 d;
    public static final AnonymousClass5 e;
    public static final AnonymousClass6 f;
    public static final AnonymousClass8 g;
    public static final AnonymousClass9 h;
    public static final AnonymousClass10 i;
    public static final AnonymousClass11 j;
    public static final AnonymousClass12 k;
    public static final AnonymousClass13 l;
    public static final AnonymousClass14 m;
    public static final AnonymousClass15 n;
    public static final AnonymousClass16 o;
    public static final AnonymousClass17 p;
    public static final AnonymousClass18 q;
    public static final AnonymousClass19 r;
    public static final AnonymousClass20 s;
    public static final AnonymousClass21 t;
    public static final AnonymousClass22 u;
    public static final AnonymousClass23 v;
    public static final AnonymousClass24 w;
    public static final AnonymousClass25 x;
    public static final AnonymousClass54 x0;
    public static final AnonymousClass26 y;
    public static final AnonymousClass55 y0;
    public static final AnonymousClass27 z;
    public static final AnonymousClass56 z0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$1] */
    /* JADX WARN: Type inference failed for: r10v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$11] */
    /* JADX WARN: Type inference failed for: r11v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$12] */
    /* JADX WARN: Type inference failed for: r12v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$13] */
    /* JADX WARN: Type inference failed for: r13v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$14] */
    /* JADX WARN: Type inference failed for: r14v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$15] */
    /* JADX WARN: Type inference failed for: r15v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$16] */
    /* JADX WARN: Type inference failed for: r16v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$17] */
    /* JADX WARN: Type inference failed for: r17v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$18] */
    /* JADX WARN: Type inference failed for: r18v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$19] */
    /* JADX WARN: Type inference failed for: r19v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$20] */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$2] */
    /* JADX WARN: Type inference failed for: r20v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$21] */
    /* JADX WARN: Type inference failed for: r21v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$22] */
    /* JADX WARN: Type inference failed for: r22v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$23] */
    /* JADX WARN: Type inference failed for: r23v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$24] */
    /* JADX WARN: Type inference failed for: r24v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$25] */
    /* JADX WARN: Type inference failed for: r25v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$26] */
    /* JADX WARN: Type inference failed for: r26v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$27] */
    /* JADX WARN: Type inference failed for: r27v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$28] */
    /* JADX WARN: Type inference failed for: r28v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$29] */
    /* JADX WARN: Type inference failed for: r29v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$30] */
    /* JADX WARN: Type inference failed for: r2v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$3] */
    /* JADX WARN: Type inference failed for: r30v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$31] */
    /* JADX WARN: Type inference failed for: r31v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$32] */
    /* JADX WARN: Type inference failed for: r32v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$33] */
    /* JADX WARN: Type inference failed for: r33v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$34] */
    /* JADX WARN: Type inference failed for: r34v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$35] */
    /* JADX WARN: Type inference failed for: r35v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$36] */
    /* JADX WARN: Type inference failed for: r36v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$37] */
    /* JADX WARN: Type inference failed for: r37v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$38] */
    /* JADX WARN: Type inference failed for: r38v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$39] */
    /* JADX WARN: Type inference failed for: r39v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$40] */
    /* JADX WARN: Type inference failed for: r3v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$4] */
    /* JADX WARN: Type inference failed for: r40v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$41] */
    /* JADX WARN: Type inference failed for: r41v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$42] */
    /* JADX WARN: Type inference failed for: r42v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$43] */
    /* JADX WARN: Type inference failed for: r43v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$44] */
    /* JADX WARN: Type inference failed for: r44v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$45] */
    /* JADX WARN: Type inference failed for: r45v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$46] */
    /* JADX WARN: Type inference failed for: r46v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$47] */
    /* JADX WARN: Type inference failed for: r47v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$48] */
    /* JADX WARN: Type inference failed for: r48v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$49] */
    /* JADX WARN: Type inference failed for: r49v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$50] */
    /* JADX WARN: Type inference failed for: r4v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$5] */
    /* JADX WARN: Type inference failed for: r50v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$51] */
    /* JADX WARN: Type inference failed for: r51v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$52] */
    /* JADX WARN: Type inference failed for: r52v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$53] */
    /* JADX WARN: Type inference failed for: r53v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$54] */
    /* JADX WARN: Type inference failed for: r54v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$55] */
    /* JADX WARN: Type inference failed for: r55v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$56] */
    /* JADX WARN: Type inference failed for: r56v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$57] */
    /* JADX WARN: Type inference failed for: r57v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$58] */
    /* JADX WARN: Type inference failed for: r58v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$59] */
    /* JADX WARN: Type inference failed for: r59v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$60] */
    /* JADX WARN: Type inference failed for: r5v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$6] */
    /* JADX WARN: Type inference failed for: r60v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$61] */
    /* JADX WARN: Type inference failed for: r61v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$62] */
    /* JADX WARN: Type inference failed for: r62v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$63] */
    /* JADX WARN: Type inference failed for: r63v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$64] */
    /* JADX WARN: Type inference failed for: r64v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$65] */
    /* JADX WARN: Type inference failed for: r65v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$66] */
    /* JADX WARN: Type inference failed for: r66v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$67] */
    /* JADX WARN: Type inference failed for: r7v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$8] */
    /* JADX WARN: Type inference failed for: r8v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$9] */
    /* JADX WARN: Type inference failed for: r9v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$10] */
    static {
        ?? r0 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.1
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                int i2;
                char c2;
                char cI = xp0Var.i();
                if (cI == 0) {
                    aVar.m(this);
                    aVar.f(xp0Var.d());
                    return;
                }
                if (cI == '&') {
                    aVar.a(TokeniserState.b);
                    return;
                }
                if (cI == '<') {
                    aVar.a(TokeniserState.g);
                    return;
                }
                if (cI == 65535) {
                    aVar.h(new gn8());
                    return;
                }
                xp0Var.b();
                int i3 = xp0Var.d;
                int i4 = xp0Var.b;
                char[] cArr = (char[]) xp0Var.g;
                while (true) {
                    i2 = xp0Var.d;
                    if (i2 >= i4 || (c2 = cArr[i2]) == '&' || c2 == '<' || c2 == 0) {
                        break;
                    } else {
                        xp0Var.d = i2 + 1;
                    }
                }
                aVar.g(i2 > i3 ? xp0.c(cArr, (String[]) xp0Var.i, i3, i2 - i3) : "");
            }
        };
        a = r0;
        ?? r1 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.2
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                int[] iArrC = aVar.c(null, false);
                if (iArrC == null) {
                    aVar.f('&');
                } else {
                    aVar.g(new String(iArrC, 0, iArrC.length));
                }
                aVar.c = TokeniserState.a;
            }
        };
        b = r1;
        ?? r2 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.3
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                char cI = xp0Var.i();
                if (cI == 0) {
                    aVar.m(this);
                    xp0Var.a();
                    aVar.f((char) 65533);
                } else {
                    if (cI == '&') {
                        aVar.a(TokeniserState.d);
                        return;
                    }
                    if (cI == '<') {
                        aVar.a(TokeniserState.j);
                    } else if (cI != 65535) {
                        aVar.g(xp0Var.g('&', '<', 0));
                    } else {
                        aVar.h(new gn8());
                    }
                }
            }
        };
        c = r2;
        ?? r3 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.4
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                int[] iArrC = aVar.c(null, false);
                if (iArrC == null) {
                    aVar.f('&');
                } else {
                    aVar.g(new String(iArrC, 0, iArrC.length));
                }
                aVar.c = TokeniserState.c;
            }
        };
        d = r3;
        ?? r4 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.5
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                TokeniserState.a(aVar, xp0Var, this, TokeniserState.m);
            }
        };
        e = r4;
        ?? r5 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.6
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                TokeniserState.a(aVar, xp0Var, this, TokeniserState.p);
            }
        };
        f = r5;
        TokeniserState tokeniserState = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.7
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                char cI = xp0Var.i();
                if (cI == 0) {
                    aVar.m(this);
                    xp0Var.a();
                    aVar.f((char) 65533);
                } else if (cI != 65535) {
                    aVar.g(xp0Var.f((char) 0));
                } else {
                    aVar.h(new gn8());
                }
            }
        };
        ?? r7 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.8
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                char cI = xp0Var.i();
                if (cI == '!') {
                    aVar.a(TokeniserState.Q);
                    return;
                }
                if (cI == '/') {
                    aVar.a(TokeniserState.h);
                    return;
                }
                if (cI == '?') {
                    aVar.a(TokeniserState.P);
                    return;
                }
                if (xp0Var.o()) {
                    aVar.d(true);
                    aVar.c = TokeniserState.i;
                } else {
                    aVar.m(this);
                    aVar.f('<');
                    aVar.c = TokeniserState.a;
                }
            }
        };
        g = r7;
        ?? r8 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.9
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                boolean zJ = xp0Var.j();
                AnonymousClass1 anonymousClass1 = TokeniserState.a;
                if (zJ) {
                    aVar.l(this);
                    aVar.g("</");
                    aVar.c = anonymousClass1;
                } else if (xp0Var.o()) {
                    aVar.d(false);
                    aVar.c = TokeniserState.i;
                } else if (xp0Var.m('>')) {
                    aVar.m(this);
                    aVar.a(anonymousClass1);
                } else {
                    aVar.m(this);
                    aVar.a(TokeniserState.P);
                }
            }
        };
        h = r8;
        ?? r9 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.10
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                int i2;
                char c2;
                xp0Var.b();
                int i3 = xp0Var.d;
                int i4 = xp0Var.b;
                char[] cArr = (char[]) xp0Var.g;
                while (true) {
                    i2 = xp0Var.d;
                    if (i2 >= i4 || (c2 = cArr[i2]) == '\t' || c2 == '\n' || c2 == '\r' || c2 == '\f' || c2 == ' ' || c2 == '/' || c2 == '>' || c2 == 0) {
                        break;
                    } else {
                        xp0Var.d = i2 + 1;
                    }
                }
                aVar.i.G(i2 > i3 ? xp0.c(cArr, (String[]) xp0Var.i, i3, i2 - i3) : "");
                char cD = xp0Var.d();
                if (cD == 0) {
                    aVar.i.G(TokeniserState.P0);
                    return;
                }
                if (cD != ' ') {
                    if (cD == '/') {
                        aVar.c = TokeniserState.O;
                        return;
                    }
                    AnonymousClass1 anonymousClass1 = TokeniserState.a;
                    if (cD == '>') {
                        aVar.k();
                        aVar.c = anonymousClass1;
                        return;
                    }
                    if (cD == 65535) {
                        aVar.l(this);
                        aVar.c = anonymousClass1;
                        return;
                    } else if (cD != '\t' && cD != '\n' && cD != '\f' && cD != '\r') {
                        jn8 jn8Var = aVar.i;
                        jn8Var.getClass();
                        jn8Var.G(String.valueOf(cD));
                        return;
                    }
                }
                aVar.c = TokeniserState.G;
            }
        };
        i = r9;
        ?? r10 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.11
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                if (xp0Var.m('/')) {
                    aVar.e();
                    aVar.a(TokeniserState.k);
                    return;
                }
                if (xp0Var.o() && aVar.o != null) {
                    String str = "</" + aVar.o;
                    Locale locale = Locale.ENGLISH;
                    String lowerCase = str.toLowerCase(locale);
                    String upperCase = str.toUpperCase(locale);
                    if (xp0Var.p(lowerCase) <= -1 && xp0Var.p(upperCase) <= -1) {
                        jn8 jn8VarD = aVar.d(false);
                        String str2 = aVar.o;
                        jn8VarD.c = str2;
                        jn8VarD.d = str2 != null ? str2.toLowerCase(locale) : "";
                        aVar.i = jn8VarD;
                        aVar.k();
                        xp0Var.q();
                        aVar.c = TokeniserState.a;
                        return;
                    }
                }
                aVar.g(SimpleComparison.LESS_THAN_OPERATION);
                aVar.c = TokeniserState.c;
            }
        };
        j = r10;
        ?? r11 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.12
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                if (!xp0Var.o()) {
                    aVar.g("</");
                    aVar.c = TokeniserState.c;
                    return;
                }
                aVar.d(false);
                jn8 jn8Var = aVar.i;
                char cI = xp0Var.i();
                jn8Var.getClass();
                jn8Var.G(String.valueOf(cI));
                aVar.h.append(xp0Var.i());
                aVar.a(TokeniserState.l);
            }
        };
        k = r11;
        ?? r12 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.13
            public static void f(a aVar, xp0 xp0Var) {
                aVar.g("</" + aVar.h.toString());
                xp0Var.q();
                aVar.c = TokeniserState.c;
            }

            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                if (xp0Var.o()) {
                    String strE = xp0Var.e();
                    aVar.i.G(strE);
                    aVar.h.append(strE);
                    return;
                }
                char cD = xp0Var.d();
                if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
                    if (aVar.n()) {
                        aVar.c = TokeniserState.G;
                        return;
                    } else {
                        f(aVar, xp0Var);
                        return;
                    }
                }
                if (cD == '/') {
                    if (aVar.n()) {
                        aVar.c = TokeniserState.O;
                        return;
                    } else {
                        f(aVar, xp0Var);
                        return;
                    }
                }
                if (cD != '>') {
                    f(aVar, xp0Var);
                } else if (!aVar.n()) {
                    f(aVar, xp0Var);
                } else {
                    aVar.k();
                    aVar.c = TokeniserState.a;
                }
            }
        };
        l = r12;
        ?? r13 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.14
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                if (xp0Var.m('/')) {
                    aVar.e();
                    aVar.a(TokeniserState.n);
                } else {
                    aVar.f('<');
                    aVar.c = TokeniserState.e;
                }
            }
        };
        m = r13;
        ?? r14 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.15
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                if (xp0Var.o()) {
                    aVar.d(false);
                    aVar.c = TokeniserState.o;
                } else {
                    aVar.g("</");
                    aVar.c = TokeniserState.e;
                }
            }
        };
        n = r14;
        ?? r15 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.16
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                TokeniserState.b(aVar, xp0Var, TokeniserState.e);
            }
        };
        o = r15;
        ?? r16 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.17
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                char cD = xp0Var.d();
                if (cD == '!') {
                    aVar.g("<!");
                    aVar.c = TokeniserState.s;
                } else if (cD == '/') {
                    aVar.e();
                    aVar.c = TokeniserState.q;
                } else {
                    aVar.g(SimpleComparison.LESS_THAN_OPERATION);
                    xp0Var.q();
                    aVar.c = TokeniserState.f;
                }
            }
        };
        p = r16;
        ?? r17 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.18
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                if (xp0Var.o()) {
                    aVar.d(false);
                    aVar.c = TokeniserState.r;
                } else {
                    aVar.g("</");
                    aVar.c = TokeniserState.f;
                }
            }
        };
        q = r17;
        ?? r18 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.19
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                TokeniserState.b(aVar, xp0Var, TokeniserState.f);
            }
        };
        r = r18;
        ?? r19 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.20
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                if (!xp0Var.m('-')) {
                    aVar.c = TokeniserState.f;
                } else {
                    aVar.f('-');
                    aVar.a(TokeniserState.t);
                }
            }
        };
        s = r19;
        ?? r20 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.21
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                if (!xp0Var.m('-')) {
                    aVar.c = TokeniserState.f;
                } else {
                    aVar.f('-');
                    aVar.a(TokeniserState.w);
                }
            }
        };
        t = r20;
        ?? r21 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.22
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                if (xp0Var.j()) {
                    aVar.l(this);
                    aVar.c = TokeniserState.a;
                    return;
                }
                char cI = xp0Var.i();
                if (cI == 0) {
                    aVar.m(this);
                    xp0Var.a();
                    aVar.f((char) 65533);
                } else if (cI == '-') {
                    aVar.f('-');
                    aVar.a(TokeniserState.v);
                } else if (cI != '<') {
                    aVar.g(xp0Var.g('-', '<', 0));
                } else {
                    aVar.a(TokeniserState.x);
                }
            }
        };
        u = r21;
        ?? r22 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.23
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                if (xp0Var.j()) {
                    aVar.l(this);
                    aVar.c = TokeniserState.a;
                    return;
                }
                char cD = xp0Var.d();
                AnonymousClass22 anonymousClass22 = TokeniserState.u;
                if (cD == 0) {
                    aVar.m(this);
                    aVar.f((char) 65533);
                    aVar.c = anonymousClass22;
                } else if (cD == '-') {
                    aVar.f(cD);
                    aVar.c = TokeniserState.w;
                } else if (cD == '<') {
                    aVar.c = TokeniserState.x;
                } else {
                    aVar.f(cD);
                    aVar.c = anonymousClass22;
                }
            }
        };
        v = r22;
        ?? r23 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.24
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                if (xp0Var.j()) {
                    aVar.l(this);
                    aVar.c = TokeniserState.a;
                    return;
                }
                char cD = xp0Var.d();
                AnonymousClass22 anonymousClass22 = TokeniserState.u;
                if (cD == 0) {
                    aVar.m(this);
                    aVar.f((char) 65533);
                    aVar.c = anonymousClass22;
                } else {
                    if (cD == '-') {
                        aVar.f(cD);
                        return;
                    }
                    if (cD == '<') {
                        aVar.c = TokeniserState.x;
                    } else if (cD != '>') {
                        aVar.f(cD);
                        aVar.c = anonymousClass22;
                    } else {
                        aVar.f(cD);
                        aVar.c = TokeniserState.f;
                    }
                }
            }
        };
        w = r23;
        ?? r24 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.25
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                if (xp0Var.o()) {
                    aVar.e();
                    aVar.h.append(xp0Var.i());
                    aVar.g(SimpleComparison.LESS_THAN_OPERATION + xp0Var.i());
                    aVar.a(TokeniserState.A);
                    return;
                }
                if (xp0Var.m('/')) {
                    aVar.e();
                    aVar.a(TokeniserState.y);
                } else {
                    aVar.f('<');
                    aVar.c = TokeniserState.u;
                }
            }
        };
        x = r24;
        ?? r25 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.26
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                if (!xp0Var.o()) {
                    aVar.g("</");
                    aVar.c = TokeniserState.u;
                    return;
                }
                aVar.d(false);
                jn8 jn8Var = aVar.i;
                char cI = xp0Var.i();
                jn8Var.getClass();
                jn8Var.G(String.valueOf(cI));
                aVar.h.append(xp0Var.i());
                aVar.a(TokeniserState.z);
            }
        };
        y = r25;
        ?? r26 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.27
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                TokeniserState.b(aVar, xp0Var, TokeniserState.u);
            }
        };
        z = r26;
        ?? r27 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.28
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                TokeniserState.c(aVar, xp0Var, TokeniserState.B, TokeniserState.u);
            }
        };
        A = r27;
        ?? r28 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.29
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                char cI = xp0Var.i();
                if (cI == 0) {
                    aVar.m(this);
                    xp0Var.a();
                    aVar.f((char) 65533);
                } else if (cI == '-') {
                    aVar.f(cI);
                    aVar.a(TokeniserState.C);
                } else if (cI == '<') {
                    aVar.f(cI);
                    aVar.a(TokeniserState.E);
                } else if (cI != 65535) {
                    aVar.g(xp0Var.g('-', '<', 0));
                } else {
                    aVar.l(this);
                    aVar.c = TokeniserState.a;
                }
            }
        };
        B = r28;
        ?? r29 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.30
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                char cD = xp0Var.d();
                AnonymousClass29 anonymousClass29 = TokeniserState.B;
                if (cD == 0) {
                    aVar.m(this);
                    aVar.f((char) 65533);
                    aVar.c = anonymousClass29;
                } else if (cD == '-') {
                    aVar.f(cD);
                    aVar.c = TokeniserState.D;
                } else if (cD == '<') {
                    aVar.f(cD);
                    aVar.c = TokeniserState.E;
                } else if (cD != 65535) {
                    aVar.f(cD);
                    aVar.c = anonymousClass29;
                } else {
                    aVar.l(this);
                    aVar.c = TokeniserState.a;
                }
            }
        };
        C = r29;
        ?? r30 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.31
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                char cD = xp0Var.d();
                AnonymousClass29 anonymousClass29 = TokeniserState.B;
                if (cD == 0) {
                    aVar.m(this);
                    aVar.f((char) 65533);
                    aVar.c = anonymousClass29;
                    return;
                }
                if (cD == '-') {
                    aVar.f(cD);
                    return;
                }
                if (cD == '<') {
                    aVar.f(cD);
                    aVar.c = TokeniserState.E;
                } else if (cD == '>') {
                    aVar.f(cD);
                    aVar.c = TokeniserState.f;
                } else if (cD != 65535) {
                    aVar.f(cD);
                    aVar.c = anonymousClass29;
                } else {
                    aVar.l(this);
                    aVar.c = TokeniserState.a;
                }
            }
        };
        D = r30;
        ?? r31 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.32
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                if (!xp0Var.m('/')) {
                    aVar.c = TokeniserState.B;
                    return;
                }
                aVar.f('/');
                aVar.e();
                aVar.a(TokeniserState.F);
            }
        };
        E = r31;
        ?? r32 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.33
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                TokeniserState.c(aVar, xp0Var, TokeniserState.u, TokeniserState.B);
            }
        };
        F = r32;
        ?? r33 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.34
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                char cD = xp0Var.d();
                AnonymousClass35 anonymousClass35 = TokeniserState.H;
                if (cD == 0) {
                    aVar.m(this);
                    aVar.i.I();
                    xp0Var.q();
                    aVar.c = anonymousClass35;
                    return;
                }
                if (cD != ' ') {
                    if (cD != '\"' && cD != '\'') {
                        if (cD == '/') {
                            aVar.c = TokeniserState.O;
                            return;
                        }
                        AnonymousClass1 anonymousClass1 = TokeniserState.a;
                        if (cD == 65535) {
                            aVar.l(this);
                            aVar.c = anonymousClass1;
                            return;
                        }
                        if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r') {
                            return;
                        }
                        switch (cD) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                aVar.k();
                                aVar.c = anonymousClass1;
                                break;
                            default:
                                aVar.i.I();
                                xp0Var.q();
                                aVar.c = anonymousClass35;
                                break;
                        }
                        return;
                    }
                    aVar.m(this);
                    aVar.i.I();
                    aVar.i.C(cD);
                    aVar.c = anonymousClass35;
                }
            }
        };
        G = r33;
        ?? r34 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.35
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                String strH = xp0Var.h(TokeniserState.N0);
                jn8 jn8Var = aVar.i;
                String str = jn8Var.e;
                if (str != null) {
                    strH = str.concat(strH);
                }
                jn8Var.e = strH;
                char cD = xp0Var.d();
                if (cD == 0) {
                    aVar.m(this);
                    aVar.i.C((char) 65533);
                    return;
                }
                if (cD != ' ') {
                    if (cD != '\"' && cD != '\'') {
                        if (cD == '/') {
                            aVar.c = TokeniserState.O;
                            return;
                        }
                        AnonymousClass1 anonymousClass1 = TokeniserState.a;
                        if (cD == 65535) {
                            aVar.l(this);
                            aVar.c = anonymousClass1;
                            return;
                        }
                        if (cD != '\t' && cD != '\n' && cD != '\f' && cD != '\r') {
                            switch (cD) {
                                case '<':
                                    break;
                                case '=':
                                    aVar.c = TokeniserState.J;
                                    break;
                                case '>':
                                    aVar.k();
                                    aVar.c = anonymousClass1;
                                    break;
                                default:
                                    aVar.i.C(cD);
                                    break;
                            }
                            return;
                        }
                    }
                    aVar.m(this);
                    aVar.i.C(cD);
                    return;
                }
                aVar.c = TokeniserState.I;
            }
        };
        H = r34;
        ?? r35 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.36
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                char cD = xp0Var.d();
                AnonymousClass35 anonymousClass35 = TokeniserState.H;
                if (cD == 0) {
                    aVar.m(this);
                    aVar.i.C((char) 65533);
                    aVar.c = anonymousClass35;
                    return;
                }
                if (cD != ' ') {
                    if (cD != '\"' && cD != '\'') {
                        if (cD == '/') {
                            aVar.c = TokeniserState.O;
                            return;
                        }
                        AnonymousClass1 anonymousClass1 = TokeniserState.a;
                        if (cD == 65535) {
                            aVar.l(this);
                            aVar.c = anonymousClass1;
                            return;
                        }
                        if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r') {
                            return;
                        }
                        switch (cD) {
                            case '<':
                                break;
                            case '=':
                                aVar.c = TokeniserState.J;
                                break;
                            case '>':
                                aVar.k();
                                aVar.c = anonymousClass1;
                                break;
                            default:
                                aVar.i.I();
                                xp0Var.q();
                                aVar.c = anonymousClass35;
                                break;
                        }
                        return;
                    }
                    aVar.m(this);
                    aVar.i.I();
                    aVar.i.C(cD);
                    aVar.c = anonymousClass35;
                }
            }
        };
        I = r35;
        ?? r36 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.37
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                char cD = xp0Var.d();
                AnonymousClass40 anonymousClass40 = TokeniserState.M;
                if (cD == 0) {
                    aVar.m(this);
                    aVar.i.D((char) 65533);
                    aVar.c = anonymousClass40;
                    return;
                }
                if (cD != ' ') {
                    if (cD == '\"') {
                        aVar.c = TokeniserState.K;
                        return;
                    }
                    if (cD != '`') {
                        AnonymousClass1 anonymousClass1 = TokeniserState.a;
                        if (cD == 65535) {
                            aVar.l(this);
                            aVar.k();
                            aVar.c = anonymousClass1;
                            return;
                        }
                        if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r') {
                            return;
                        }
                        if (cD == '&') {
                            xp0Var.q();
                            aVar.c = anonymousClass40;
                            return;
                        }
                        if (cD == '\'') {
                            aVar.c = TokeniserState.L;
                            return;
                        }
                        switch (cD) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                aVar.m(this);
                                aVar.k();
                                aVar.c = anonymousClass1;
                                break;
                            default:
                                xp0Var.q();
                                aVar.c = anonymousClass40;
                                break;
                        }
                        return;
                    }
                    aVar.m(this);
                    aVar.i.D(cD);
                    aVar.c = anonymousClass40;
                }
            }
        };
        J = r36;
        ?? r37 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.38
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                String strG = xp0Var.g(TokeniserState.M0);
                if (strG.length() > 0) {
                    aVar.i.E(strG);
                } else {
                    aVar.i.h = true;
                }
                char cD = xp0Var.d();
                if (cD == 0) {
                    aVar.m(this);
                    aVar.i.D((char) 65533);
                    return;
                }
                if (cD == '\"') {
                    aVar.c = TokeniserState.N;
                    return;
                }
                if (cD != '&') {
                    if (cD != 65535) {
                        aVar.i.D(cD);
                        return;
                    } else {
                        aVar.l(this);
                        aVar.c = TokeniserState.a;
                        return;
                    }
                }
                int[] iArrC = aVar.c('\"', true);
                if (iArrC != null) {
                    aVar.i.F(iArrC);
                } else {
                    aVar.i.D('&');
                }
            }
        };
        K = r37;
        ?? r38 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.39
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                String strG = xp0Var.g(TokeniserState.L0);
                if (strG.length() > 0) {
                    aVar.i.E(strG);
                } else {
                    aVar.i.h = true;
                }
                char cD = xp0Var.d();
                if (cD == 0) {
                    aVar.m(this);
                    aVar.i.D((char) 65533);
                    return;
                }
                if (cD == 65535) {
                    aVar.l(this);
                    aVar.c = TokeniserState.a;
                    return;
                }
                if (cD != '&') {
                    if (cD != '\'') {
                        aVar.i.D(cD);
                        return;
                    } else {
                        aVar.c = TokeniserState.N;
                        return;
                    }
                }
                int[] iArrC = aVar.c('\'', true);
                if (iArrC != null) {
                    aVar.i.F(iArrC);
                } else {
                    aVar.i.D('&');
                }
            }
        };
        L = r38;
        ?? r39 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.40
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                String strH = xp0Var.h(TokeniserState.O0);
                if (strH.length() > 0) {
                    aVar.i.E(strH);
                }
                char cD = xp0Var.d();
                if (cD == 0) {
                    aVar.m(this);
                    aVar.i.D((char) 65533);
                    return;
                }
                if (cD != ' ') {
                    if (cD != '\"' && cD != '`') {
                        AnonymousClass1 anonymousClass1 = TokeniserState.a;
                        if (cD == 65535) {
                            aVar.l(this);
                            aVar.c = anonymousClass1;
                            return;
                        }
                        if (cD != '\t' && cD != '\n' && cD != '\f' && cD != '\r') {
                            if (cD == '&') {
                                int[] iArrC = aVar.c('>', true);
                                if (iArrC != null) {
                                    aVar.i.F(iArrC);
                                    return;
                                } else {
                                    aVar.i.D('&');
                                    return;
                                }
                            }
                            if (cD != '\'') {
                                switch (cD) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        aVar.k();
                                        aVar.c = anonymousClass1;
                                        break;
                                    default:
                                        aVar.i.D(cD);
                                        break;
                                }
                                return;
                            }
                        }
                    }
                    aVar.m(this);
                    aVar.i.D(cD);
                    return;
                }
                aVar.c = TokeniserState.G;
            }
        };
        M = r39;
        ?? r40 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.41
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                char cD = xp0Var.d();
                AnonymousClass34 anonymousClass34 = TokeniserState.G;
                if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
                    aVar.c = anonymousClass34;
                    return;
                }
                if (cD == '/') {
                    aVar.c = TokeniserState.O;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.a;
                if (cD == '>') {
                    aVar.k();
                    aVar.c = anonymousClass1;
                } else if (cD == 65535) {
                    aVar.l(this);
                    aVar.c = anonymousClass1;
                } else {
                    aVar.m(this);
                    xp0Var.q();
                    aVar.c = anonymousClass34;
                }
            }
        };
        N = r40;
        ?? r41 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.42
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                char cD = xp0Var.d();
                AnonymousClass1 anonymousClass1 = TokeniserState.a;
                if (cD == '>') {
                    aVar.i.j = true;
                    aVar.k();
                    aVar.c = anonymousClass1;
                } else if (cD == 65535) {
                    aVar.l(this);
                    aVar.c = anonymousClass1;
                } else {
                    aVar.m(this);
                    xp0Var.q();
                    aVar.c = TokeniserState.G;
                }
            }
        };
        O = r41;
        ?? r42 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.43
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                xp0Var.q();
                en8 en8Var = new en8();
                en8Var.c.append(xp0Var.f('>'));
                aVar.h(en8Var);
                aVar.a(TokeniserState.a);
            }
        };
        P = r42;
        ?? r43 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.44
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                if (xp0Var.k("--")) {
                    aVar.n.p();
                    aVar.c = TokeniserState.R;
                } else if (xp0Var.l("DOCTYPE")) {
                    aVar.c = TokeniserState.X;
                } else if (xp0Var.k("[CDATA[")) {
                    aVar.e();
                    aVar.c = TokeniserState.K0;
                } else {
                    aVar.m(this);
                    aVar.a(TokeniserState.P);
                }
            }
        };
        Q = r43;
        ?? r44 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.45
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                en8 en8Var = aVar.n;
                char cD = xp0Var.d();
                AnonymousClass47 anonymousClass47 = TokeniserState.T;
                if (cD == 0) {
                    aVar.m(this);
                    en8Var.c.append((char) 65533);
                    aVar.c = anonymousClass47;
                    return;
                }
                if (cD == '-') {
                    aVar.c = TokeniserState.S;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.a;
                if (cD == '>') {
                    aVar.m(this);
                    aVar.i();
                    aVar.c = anonymousClass1;
                } else if (cD != 65535) {
                    en8Var.c.append(cD);
                    aVar.c = anonymousClass47;
                } else {
                    aVar.l(this);
                    aVar.i();
                    aVar.c = anonymousClass1;
                }
            }
        };
        R = r44;
        ?? r45 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.46
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                en8 en8Var = aVar.n;
                char cD = xp0Var.d();
                AnonymousClass47 anonymousClass47 = TokeniserState.T;
                if (cD == 0) {
                    aVar.m(this);
                    en8Var.c.append((char) 65533);
                    aVar.c = anonymousClass47;
                    return;
                }
                if (cD == '-') {
                    aVar.c = TokeniserState.S;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.a;
                if (cD == '>') {
                    aVar.m(this);
                    aVar.i();
                    aVar.c = anonymousClass1;
                } else if (cD != 65535) {
                    en8Var.c.append(cD);
                    aVar.c = anonymousClass47;
                } else {
                    aVar.l(this);
                    aVar.i();
                    aVar.c = anonymousClass1;
                }
            }
        };
        S = r45;
        ?? r46 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.47
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                en8 en8Var = aVar.n;
                char cI = xp0Var.i();
                if (cI == 0) {
                    aVar.m(this);
                    xp0Var.a();
                    en8Var.c.append((char) 65533);
                } else if (cI == '-') {
                    aVar.a(TokeniserState.U);
                } else {
                    if (cI != 65535) {
                        en8Var.c.append(xp0Var.g('-', 0));
                        return;
                    }
                    aVar.l(this);
                    aVar.i();
                    aVar.c = TokeniserState.a;
                }
            }
        };
        T = r46;
        ?? r47 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.48
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                en8 en8Var = aVar.n;
                char cD = xp0Var.d();
                AnonymousClass47 anonymousClass47 = TokeniserState.T;
                if (cD == 0) {
                    aVar.m(this);
                    StringBuilder sb = en8Var.c;
                    sb.append('-');
                    sb.append((char) 65533);
                    aVar.c = anonymousClass47;
                    return;
                }
                if (cD == '-') {
                    aVar.c = TokeniserState.V;
                    return;
                }
                if (cD == 65535) {
                    aVar.l(this);
                    aVar.i();
                    aVar.c = TokeniserState.a;
                } else {
                    StringBuilder sb2 = en8Var.c;
                    sb2.append('-');
                    sb2.append(cD);
                    aVar.c = anonymousClass47;
                }
            }
        };
        U = r47;
        ?? r48 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.49
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                en8 en8Var = aVar.n;
                char cD = xp0Var.d();
                AnonymousClass47 anonymousClass47 = TokeniserState.T;
                if (cD == 0) {
                    aVar.m(this);
                    StringBuilder sb = en8Var.c;
                    sb.append("--");
                    sb.append((char) 65533);
                    aVar.c = anonymousClass47;
                    return;
                }
                if (cD == '!') {
                    aVar.m(this);
                    aVar.c = TokeniserState.W;
                    return;
                }
                if (cD == '-') {
                    aVar.m(this);
                    en8Var.c.append('-');
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.a;
                if (cD == '>') {
                    aVar.i();
                    aVar.c = anonymousClass1;
                } else if (cD == 65535) {
                    aVar.l(this);
                    aVar.i();
                    aVar.c = anonymousClass1;
                } else {
                    aVar.m(this);
                    StringBuilder sb2 = en8Var.c;
                    sb2.append("--");
                    sb2.append(cD);
                    aVar.c = anonymousClass47;
                }
            }
        };
        V = r48;
        ?? r49 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.50
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                en8 en8Var = aVar.n;
                char cD = xp0Var.d();
                AnonymousClass47 anonymousClass47 = TokeniserState.T;
                if (cD == 0) {
                    aVar.m(this);
                    StringBuilder sb = en8Var.c;
                    sb.append("--!");
                    sb.append((char) 65533);
                    aVar.c = anonymousClass47;
                    return;
                }
                if (cD == '-') {
                    en8Var.c.append("--!");
                    aVar.c = TokeniserState.U;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.a;
                if (cD == '>') {
                    aVar.i();
                    aVar.c = anonymousClass1;
                } else if (cD == 65535) {
                    aVar.l(this);
                    aVar.i();
                    aVar.c = anonymousClass1;
                } else {
                    StringBuilder sb2 = en8Var.c;
                    sb2.append("--!");
                    sb2.append(cD);
                    aVar.c = anonymousClass47;
                }
            }
        };
        W = r49;
        ?? r50 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.51
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                fn8 fn8Var = aVar.m;
                char cD = xp0Var.d();
                AnonymousClass52 anonymousClass52 = TokeniserState.Y;
                if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
                    aVar.c = anonymousClass52;
                    return;
                }
                if (cD != '>') {
                    if (cD != 65535) {
                        aVar.m(this);
                        aVar.c = anonymousClass52;
                        return;
                    }
                    aVar.l(this);
                }
                aVar.m(this);
                fn8Var.p();
                fn8Var.getClass();
                aVar.j();
                aVar.c = TokeniserState.a;
            }
        };
        X = r50;
        ?? r51 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.52
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                fn8 fn8Var = aVar.m;
                boolean zO = xp0Var.o();
                AnonymousClass53 anonymousClass53 = TokeniserState.Z;
                if (zO) {
                    fn8Var.p();
                    aVar.c = anonymousClass53;
                    return;
                }
                char cD = xp0Var.d();
                if (cD == 0) {
                    aVar.m(this);
                    fn8Var.p();
                    fn8Var.c.append((char) 65533);
                    aVar.c = anonymousClass53;
                    return;
                }
                if (cD != ' ') {
                    if (cD == 65535) {
                        aVar.l(this);
                        fn8Var.p();
                        fn8Var.getClass();
                        aVar.j();
                        aVar.c = TokeniserState.a;
                        return;
                    }
                    if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r') {
                        return;
                    }
                    fn8Var.p();
                    fn8Var.c.append(cD);
                    aVar.c = anonymousClass53;
                }
            }
        };
        Y = r51;
        ?? r52 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.53
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                fn8 fn8Var = aVar.m;
                if (xp0Var.o()) {
                    fn8Var.c.append(xp0Var.e());
                    return;
                }
                char cD = xp0Var.d();
                if (cD == 0) {
                    aVar.m(this);
                    fn8Var.c.append((char) 65533);
                    return;
                }
                if (cD != ' ') {
                    AnonymousClass1 anonymousClass1 = TokeniserState.a;
                    if (cD == '>') {
                        aVar.j();
                        aVar.c = anonymousClass1;
                        return;
                    }
                    if (cD == 65535) {
                        aVar.l(this);
                        fn8Var.getClass();
                        aVar.j();
                        aVar.c = anonymousClass1;
                        return;
                    }
                    if (cD != '\t' && cD != '\n' && cD != '\f' && cD != '\r') {
                        fn8Var.c.append(cD);
                        return;
                    }
                }
                aVar.c = TokeniserState.x0;
            }
        };
        Z = r52;
        ?? r53 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.54
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                fn8 fn8Var = aVar.m;
                boolean zJ = xp0Var.j();
                AnonymousClass1 anonymousClass1 = TokeniserState.a;
                if (zJ) {
                    aVar.l(this);
                    fn8Var.getClass();
                    aVar.j();
                    aVar.c = anonymousClass1;
                    return;
                }
                if (xp0Var.n('\t', '\n', '\r', '\f', ' ')) {
                    xp0Var.a();
                    return;
                }
                if (xp0Var.m('>')) {
                    aVar.j();
                    aVar.a(anonymousClass1);
                    return;
                }
                if (xp0Var.l("PUBLIC")) {
                    fn8Var.getClass();
                    aVar.c = TokeniserState.y0;
                } else if (xp0Var.l("SYSTEM")) {
                    fn8Var.getClass();
                    aVar.c = TokeniserState.E0;
                } else {
                    aVar.m(this);
                    fn8Var.getClass();
                    aVar.a(TokeniserState.J0);
                }
            }
        };
        x0 = r53;
        ?? r54 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.55
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                fn8 fn8Var = aVar.m;
                char cD = xp0Var.d();
                if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
                    aVar.c = TokeniserState.z0;
                    return;
                }
                if (cD == '\"') {
                    aVar.m(this);
                    aVar.c = TokeniserState.A0;
                    return;
                }
                if (cD == '\'') {
                    aVar.m(this);
                    aVar.c = TokeniserState.B0;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.a;
                if (cD == '>') {
                    aVar.m(this);
                    fn8Var.getClass();
                    aVar.j();
                    aVar.c = anonymousClass1;
                    return;
                }
                if (cD != 65535) {
                    aVar.m(this);
                    fn8Var.getClass();
                    aVar.c = TokeniserState.J0;
                } else {
                    aVar.l(this);
                    fn8Var.getClass();
                    aVar.j();
                    aVar.c = anonymousClass1;
                }
            }
        };
        y0 = r54;
        ?? r55 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.56
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                fn8 fn8Var = aVar.m;
                char cD = xp0Var.d();
                if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
                    return;
                }
                if (cD == '\"') {
                    aVar.c = TokeniserState.A0;
                    return;
                }
                if (cD == '\'') {
                    aVar.c = TokeniserState.B0;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.a;
                if (cD == '>') {
                    aVar.m(this);
                    fn8Var.getClass();
                    aVar.j();
                    aVar.c = anonymousClass1;
                    return;
                }
                if (cD != 65535) {
                    aVar.m(this);
                    fn8Var.getClass();
                    aVar.c = TokeniserState.J0;
                } else {
                    aVar.l(this);
                    fn8Var.getClass();
                    aVar.j();
                    aVar.c = anonymousClass1;
                }
            }
        };
        z0 = r55;
        ?? r56 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.57
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                fn8 fn8Var = aVar.m;
                char cD = xp0Var.d();
                if (cD == 0) {
                    aVar.m(this);
                    fn8Var.d.append((char) 65533);
                    return;
                }
                if (cD == '\"') {
                    aVar.c = TokeniserState.C0;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.a;
                if (cD == '>') {
                    aVar.m(this);
                    fn8Var.getClass();
                    aVar.j();
                    aVar.c = anonymousClass1;
                    return;
                }
                if (cD != 65535) {
                    fn8Var.d.append(cD);
                    return;
                }
                aVar.l(this);
                fn8Var.getClass();
                aVar.j();
                aVar.c = anonymousClass1;
            }
        };
        A0 = r56;
        ?? r57 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.58
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                fn8 fn8Var = aVar.m;
                char cD = xp0Var.d();
                if (cD == 0) {
                    aVar.m(this);
                    fn8Var.d.append((char) 65533);
                    return;
                }
                if (cD == '\'') {
                    aVar.c = TokeniserState.C0;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.a;
                if (cD == '>') {
                    aVar.m(this);
                    fn8Var.getClass();
                    aVar.j();
                    aVar.c = anonymousClass1;
                    return;
                }
                if (cD != 65535) {
                    fn8Var.d.append(cD);
                    return;
                }
                aVar.l(this);
                fn8Var.getClass();
                aVar.j();
                aVar.c = anonymousClass1;
            }
        };
        B0 = r57;
        ?? r58 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.59
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                fn8 fn8Var = aVar.m;
                char cD = xp0Var.d();
                if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
                    aVar.c = TokeniserState.D0;
                    return;
                }
                if (cD == '\"') {
                    aVar.m(this);
                    aVar.c = TokeniserState.G0;
                    return;
                }
                if (cD == '\'') {
                    aVar.m(this);
                    aVar.c = TokeniserState.H0;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.a;
                if (cD == '>') {
                    aVar.j();
                    aVar.c = anonymousClass1;
                } else if (cD != 65535) {
                    aVar.m(this);
                    fn8Var.getClass();
                    aVar.c = TokeniserState.J0;
                } else {
                    aVar.l(this);
                    fn8Var.getClass();
                    aVar.j();
                    aVar.c = anonymousClass1;
                }
            }
        };
        C0 = r58;
        ?? r59 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.60
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                fn8 fn8Var = aVar.m;
                char cD = xp0Var.d();
                if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
                    return;
                }
                if (cD == '\"') {
                    aVar.m(this);
                    aVar.c = TokeniserState.G0;
                    return;
                }
                if (cD == '\'') {
                    aVar.m(this);
                    aVar.c = TokeniserState.H0;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.a;
                if (cD == '>') {
                    aVar.j();
                    aVar.c = anonymousClass1;
                } else if (cD != 65535) {
                    aVar.m(this);
                    fn8Var.getClass();
                    aVar.c = TokeniserState.J0;
                } else {
                    aVar.l(this);
                    fn8Var.getClass();
                    aVar.j();
                    aVar.c = anonymousClass1;
                }
            }
        };
        D0 = r59;
        ?? r60 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.61
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                fn8 fn8Var = aVar.m;
                char cD = xp0Var.d();
                if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
                    aVar.c = TokeniserState.F0;
                    return;
                }
                if (cD == '\"') {
                    aVar.m(this);
                    aVar.c = TokeniserState.G0;
                    return;
                }
                if (cD == '\'') {
                    aVar.m(this);
                    aVar.c = TokeniserState.H0;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.a;
                if (cD == '>') {
                    aVar.m(this);
                    fn8Var.getClass();
                    aVar.j();
                    aVar.c = anonymousClass1;
                    return;
                }
                if (cD != 65535) {
                    aVar.m(this);
                    fn8Var.getClass();
                    aVar.j();
                } else {
                    aVar.l(this);
                    fn8Var.getClass();
                    aVar.j();
                    aVar.c = anonymousClass1;
                }
            }
        };
        E0 = r60;
        ?? r61 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.62
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                fn8 fn8Var = aVar.m;
                char cD = xp0Var.d();
                if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
                    return;
                }
                if (cD == '\"') {
                    aVar.c = TokeniserState.G0;
                    return;
                }
                if (cD == '\'') {
                    aVar.c = TokeniserState.H0;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.a;
                if (cD == '>') {
                    aVar.m(this);
                    fn8Var.getClass();
                    aVar.j();
                    aVar.c = anonymousClass1;
                    return;
                }
                if (cD != 65535) {
                    aVar.m(this);
                    fn8Var.getClass();
                    aVar.c = TokeniserState.J0;
                } else {
                    aVar.l(this);
                    fn8Var.getClass();
                    aVar.j();
                    aVar.c = anonymousClass1;
                }
            }
        };
        F0 = r61;
        ?? r62 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.63
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                fn8 fn8Var = aVar.m;
                char cD = xp0Var.d();
                if (cD == 0) {
                    aVar.m(this);
                    fn8Var.e.append((char) 65533);
                    return;
                }
                if (cD == '\"') {
                    aVar.c = TokeniserState.I0;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.a;
                if (cD == '>') {
                    aVar.m(this);
                    fn8Var.getClass();
                    aVar.j();
                    aVar.c = anonymousClass1;
                    return;
                }
                if (cD != 65535) {
                    fn8Var.e.append(cD);
                    return;
                }
                aVar.l(this);
                fn8Var.getClass();
                aVar.j();
                aVar.c = anonymousClass1;
            }
        };
        G0 = r62;
        ?? r63 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.64
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                fn8 fn8Var = aVar.m;
                char cD = xp0Var.d();
                if (cD == 0) {
                    aVar.m(this);
                    fn8Var.e.append((char) 65533);
                    return;
                }
                if (cD == '\'') {
                    aVar.c = TokeniserState.I0;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.a;
                if (cD == '>') {
                    aVar.m(this);
                    fn8Var.getClass();
                    aVar.j();
                    aVar.c = anonymousClass1;
                    return;
                }
                if (cD != 65535) {
                    fn8Var.e.append(cD);
                    return;
                }
                aVar.l(this);
                fn8Var.getClass();
                aVar.j();
                aVar.c = anonymousClass1;
            }
        };
        H0 = r63;
        ?? r64 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.65
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                char cD = xp0Var.d();
                if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.a;
                if (cD == '>') {
                    aVar.j();
                    aVar.c = anonymousClass1;
                } else if (cD != 65535) {
                    aVar.m(this);
                    aVar.c = TokeniserState.J0;
                } else {
                    aVar.l(this);
                    aVar.m.getClass();
                    aVar.j();
                    aVar.c = anonymousClass1;
                }
            }
        };
        I0 = r64;
        ?? r65 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.66
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                char cD = xp0Var.d();
                AnonymousClass1 anonymousClass1 = TokeniserState.a;
                if (cD == '>') {
                    aVar.j();
                    aVar.c = anonymousClass1;
                } else {
                    if (cD != 65535) {
                        return;
                    }
                    aVar.j();
                    aVar.c = anonymousClass1;
                }
            }
        };
        J0 = r65;
        ?? r66 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.67
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, xp0 xp0Var) {
                String strC;
                StringBuilder sb = aVar.h;
                int iP = xp0Var.p("]]>");
                String[] strArr = (String[]) xp0Var.i;
                char[] cArr = (char[]) xp0Var.g;
                if (iP != -1) {
                    strC = xp0.c(cArr, strArr, xp0Var.d, iP);
                    xp0Var.d += iP;
                } else {
                    xp0Var.b();
                    int i2 = xp0Var.d;
                    strC = xp0.c(cArr, strArr, i2, xp0Var.b - i2);
                    xp0Var.d = xp0Var.b;
                }
                sb.append(strC);
                if (xp0Var.k("]]>") || xp0Var.j()) {
                    String string = sb.toString();
                    cn8 cn8Var = new cn8();
                    cn8Var.c = string;
                    aVar.h(cn8Var);
                    aVar.c = TokeniserState.a;
                }
            }
        };
        K0 = r66;
        Q0 = new TokeniserState[]{r0, r1, r2, r3, r4, r5, tokeniserState, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66};
        L0 = new char[]{0, '&', '\''};
        M0 = new char[]{0, '\"', '&'};
        N0 = new char[]{0, '\t', '\n', '\f', '\r', ' ', '\"', '\'', '/', '<', '=', '>'};
        O0 = new char[]{0, '\t', '\n', '\f', '\r', ' ', '\"', '&', '\'', '<', '=', '>', '`'};
        P0 = String.valueOf((char) 65533);
    }

    public static void a(a aVar, xp0 xp0Var, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        char cI = xp0Var.i();
        if (cI == 0) {
            aVar.m(tokeniserState);
            xp0Var.a();
            aVar.f((char) 65533);
        } else if (cI == '<') {
            aVar.a(tokeniserState2);
        } else if (cI != 65535) {
            aVar.g(xp0Var.g('<', 0));
        } else {
            aVar.h(new gn8());
        }
    }

    public static void b(a aVar, xp0 xp0Var, TokeniserState tokeniserState) {
        StringBuilder sb = aVar.h;
        if (xp0Var.o()) {
            String strE = xp0Var.e();
            aVar.i.G(strE);
            sb.append(strE);
            return;
        }
        if (aVar.n() && !xp0Var.j()) {
            char cD = xp0Var.d();
            if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
                aVar.c = G;
                return;
            }
            if (cD == '/') {
                aVar.c = O;
                return;
            } else {
                if (cD == '>') {
                    aVar.k();
                    aVar.c = a;
                    return;
                }
                sb.append(cD);
            }
        }
        aVar.g("</" + sb.toString());
        aVar.c = tokeniserState;
    }

    public static void c(a aVar, xp0 xp0Var, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        StringBuilder sb = aVar.h;
        if (xp0Var.o()) {
            String strE = xp0Var.e();
            sb.append(strE);
            aVar.g(strE);
            return;
        }
        char cD = xp0Var.d();
        if (cD != '\t' && cD != '\n' && cD != '\f' && cD != '\r' && cD != ' ' && cD != '/' && cD != '>') {
            xp0Var.q();
            aVar.c = tokeniserState2;
        } else {
            if (sb.toString().equals("script")) {
                aVar.c = tokeniserState;
            } else {
                aVar.c = tokeniserState2;
            }
            aVar.f(cD);
        }
    }

    public static TokeniserState valueOf(String str) {
        return (TokeniserState) Enum.valueOf(TokeniserState.class, str);
    }

    public static TokeniserState[] values() {
        return (TokeniserState[]) Q0.clone();
    }

    public abstract void e(a aVar, xp0 xp0Var);
}
