package defpackage;

import io.noties.markwon.html.jsoup.parser.Token$TokenType;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jn8 extends tt9 {
    public String c;
    public String d;
    public String e;
    public final StringBuilder f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;
    public dy k;

    public jn8(Token$TokenType token$TokenType) {
        super(9, token$TokenType);
        this.f = new StringBuilder();
        this.h = false;
        this.i = false;
        this.j = false;
    }

    public final void C(char c) {
        String strValueOf = String.valueOf(c);
        String str = this.e;
        if (str != null) {
            strValueOf = str.concat(strValueOf);
        }
        this.e = strValueOf;
    }

    public final void D(char c) {
        this.i = true;
        String str = this.g;
        StringBuilder sb = this.f;
        if (str != null) {
            sb.append(str);
            this.g = null;
        }
        sb.append(c);
    }

    public final void E(String str) {
        this.i = true;
        String str2 = this.g;
        StringBuilder sb = this.f;
        if (str2 != null) {
            sb.append(str2);
            this.g = null;
        }
        if (sb.length() == 0) {
            this.g = str;
        } else {
            sb.append(str);
        }
    }

    public final void F(int[] iArr) {
        this.i = true;
        String str = this.g;
        StringBuilder sb = this.f;
        if (str != null) {
            sb.append(str);
            this.g = null;
        }
        for (int i : iArr) {
            sb.appendCodePoint(i);
        }
    }

    public final void G(String str) {
        String str2 = this.c;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.c = str;
        this.d = str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public final String H() {
        String str = this.c;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must be false");
        }
        return this.c;
    }

    public final void I() {
        if (this.k == null) {
            this.k = new dy();
        }
        String str = this.e;
        StringBuilder sb = this.f;
        if (str != null) {
            String strTrim = str.trim();
            this.e = strTrim;
            if (strTrim.length() > 0) {
                String string = this.i ? sb.length() > 0 ? sb.toString() : this.g : this.h ? "" : null;
                dy dyVar = this.k;
                String str2 = this.e;
                int iA = dyVar.a(str2);
                if (iA != -1) {
                    dyVar.c[iA] = string;
                } else {
                    int i = dyVar.a;
                    int i2 = i + 1;
                    if (i2 < i) {
                        throw new IllegalArgumentException("Must be true");
                    }
                    String[] strArr = dyVar.b;
                    int length = strArr.length;
                    if (length < i2) {
                        int i3 = length >= 4 ? i * 2 : 4;
                        if (i2 <= i3) {
                            i2 = i3;
                        }
                        String[] strArr2 = new String[i2];
                        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i2));
                        dyVar.b = strArr2;
                        String[] strArr3 = dyVar.c;
                        String[] strArr4 = new String[i2];
                        System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i2));
                        dyVar.c = strArr4;
                    }
                    String[] strArr5 = dyVar.b;
                    int i4 = dyVar.a;
                    strArr5[i4] = str2;
                    dyVar.c[i4] = string;
                    dyVar.a = i4 + 1;
                }
            }
        }
        this.e = null;
        this.h = false;
        this.i = false;
        tt9.q(sb);
        this.g = null;
    }

    @Override // defpackage.tt9
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public jn8 p() {
        this.c = null;
        this.d = null;
        this.e = null;
        tt9.q(this.f);
        this.g = null;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = null;
        return this;
    }
}
