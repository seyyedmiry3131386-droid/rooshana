package defpackage;

import io.noties.markwon.html.jsoup.UncheckedIOException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class xp0 {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final Object g;
    public final Object h;
    public final Object i;

    public xp0(String str) {
        StringReader stringReader = new StringReader(str);
        str.getClass();
        this.i = new String[128];
        if (!stringReader.markSupported()) {
            throw new IllegalArgumentException("Must be true");
        }
        this.h = stringReader;
        this.g = new char[4096];
        b();
    }

    public static String c(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = 0;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2) {
            i6 = (i6 * 31) + cArr[i4];
            i5++;
            i4++;
        }
        int length = i6 & (strArr.length - 1);
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i, i2);
            strArr[length] = str2;
            return str2;
        }
        if (i2 == str.length()) {
            int i7 = i;
            int i8 = i2;
            while (true) {
                int i9 = i8 - 1;
                if (i8 == 0) {
                    return str;
                }
                int i10 = i7 + 1;
                int i11 = i3 + 1;
                if (cArr[i7] != str.charAt(i3)) {
                    break;
                }
                i7 = i10;
                i8 = i9;
                i3 = i11;
            }
        }
        String str3 = new String(cArr, i, i2);
        strArr[length] = str3;
        return str3;
    }

    public void a() {
        this.d++;
    }

    public void b() {
        StringReader stringReader = (StringReader) this.h;
        int i = this.d;
        if (i < this.c) {
            return;
        }
        try {
            stringReader.skip(i);
            stringReader.mark(4096);
            int i2 = stringReader.read((char[]) this.g);
            stringReader.reset();
            if (i2 != -1) {
                this.b = i2;
                this.e += this.d;
                this.d = 0;
                this.f = 0;
                if (i2 > 3072) {
                    i2 = 3072;
                }
                this.c = i2;
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public char d() {
        b();
        int i = this.d;
        char c = i >= this.b ? (char) 65535 : ((char[]) this.g)[i];
        this.d = i + 1;
        return c;
    }

    public String e() {
        char c;
        char[] cArr = (char[]) this.g;
        b();
        int i = this.d;
        while (true) {
            int i2 = this.d;
            if (i2 >= this.b || (((c = cArr[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.d++;
        }
        return c(cArr, (String[]) this.i, i, this.d - i);
    }

    public String f(char c) {
        int i;
        String[] strArr = (String[]) this.i;
        char[] cArr = (char[]) this.g;
        b();
        int i2 = this.d;
        while (true) {
            if (i2 >= this.b) {
                i = -1;
                break;
            }
            if (c == cArr[i2]) {
                i = i2 - this.d;
                break;
            }
            i2++;
        }
        if (i != -1) {
            String strC = c(cArr, strArr, this.d, i);
            this.d += i;
            return strC;
        }
        b();
        int i3 = this.d;
        String strC2 = c(cArr, strArr, i3, this.b - i3);
        this.d = this.b;
        return strC2;
    }

    public String g(char... cArr) {
        b();
        int i = this.d;
        int i2 = this.b;
        char[] cArr2 = (char[]) this.g;
        loop0: while (this.d < i2) {
            for (char c : cArr) {
                if (cArr2[this.d] == c) {
                    break loop0;
                }
            }
            this.d++;
        }
        int i3 = this.d;
        return i3 > i ? c(cArr2, (String[]) this.i, i, i3 - i) : "";
    }

    public String h(char... cArr) {
        b();
        int i = this.d;
        int i2 = this.b;
        char[] cArr2 = (char[]) this.g;
        while (true) {
            int i3 = this.d;
            if (i3 >= i2 || Arrays.binarySearch(cArr, cArr2[i3]) >= 0) {
                break;
            }
            this.d++;
        }
        int i4 = this.d;
        return i4 > i ? c(cArr2, (String[]) this.i, i, i4 - i) : "";
    }

    public char i() {
        b();
        int i = this.d;
        if (i >= this.b) {
            return (char) 65535;
        }
        return ((char[]) this.g)[i];
    }

    public boolean j() {
        b();
        return this.d >= this.b;
    }

    public boolean k(String str) {
        b();
        b();
        int length = str.length();
        if (length <= this.b - this.d) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == ((char[]) this.g)[this.d + i]) {
                }
            }
            this.d = str.length() + this.d;
            return true;
        }
        return false;
    }

    public boolean l(String str) {
        b();
        int length = str.length();
        if (length <= this.b - this.d) {
            for (int i = 0; i < length; i++) {
                if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(((char[]) this.g)[this.d + i])) {
                }
            }
            this.d = str.length() + this.d;
            return true;
        }
        return false;
    }

    public boolean m(char c) {
        return !j() && ((char[]) this.g)[this.d] == c;
    }

    public boolean n(char... cArr) {
        if (!j()) {
            b();
            char c = ((char[]) this.g)[this.d];
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean o() {
        if (j()) {
            return false;
        }
        char c = ((char[]) this.g)[this.d];
        if (c < 'A' || c > 'Z') {
            return (c >= 'a' && c <= 'z') || Character.isLetter(c);
        }
        return true;
    }

    public int p(String str) {
        char[] cArr = (char[]) this.g;
        b();
        char cCharAt = str.charAt(0);
        int i = this.d;
        while (i < this.b) {
            if (cCharAt != cArr[i]) {
                do {
                    i++;
                    if (i >= this.b) {
                        break;
                    }
                } while (cCharAt != cArr[i]);
            }
            int i2 = i + 1;
            int length = (str.length() + i2) - 1;
            int i3 = this.b;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && str.charAt(i5) == cArr[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.d;
                }
            }
            i = i2;
        }
        return -1;
    }

    public void q() {
        this.d--;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                char[] cArr = (char[]) this.g;
                int i = this.d;
                return new String(cArr, i, this.b - i);
            default:
                return super.toString();
        }
    }

    public xp0(g96 g96Var, iz5 iz5Var, r79 r79Var) {
        js3.p(g96Var, "oldList");
        this.g = g96Var;
        this.h = iz5Var;
        this.i = r79Var;
        iz5 iz5Var2 = (iz5) g96Var;
        this.b = iz5Var2.c;
        this.c = iz5Var2.d;
        this.d = iz5Var2.b;
        this.e = 1;
        this.f = 1;
    }
}
