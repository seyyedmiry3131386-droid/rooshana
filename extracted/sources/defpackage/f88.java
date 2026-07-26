package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f88 extends m88 {
    public static boolean A0(String str, char c) {
        return str.length() > 0 && js3.x(str.charAt(0), c, false);
    }

    public static String B0(String str, uq3 uq3Var) {
        js3.p(uq3Var, "range");
        String strSubstring = str.substring(uq3Var.a, uq3Var.b + 1);
        js3.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String C0(char c, String str, String str2) {
        int iK0 = k0(c, 0, 6, str);
        if (iK0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iK0 + 1, str.length());
        js3.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String D0(String str, String str2, String str3) {
        js3.p(str2, "delimiter");
        int iL0 = l0(str, str2, 0, false, 6);
        if (iL0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(str2.length() + iL0, str.length());
        js3.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String E0(char c, String str, String str2) {
        js3.p(str, "<this>");
        js3.p(str2, "missingDelimiterValue");
        int iQ0 = q0(str, c, 0, 6);
        if (iQ0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iQ0 + 1, str.length());
        js3.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String F0(String str, char c) {
        js3.p(str, "<this>");
        js3.p(str, "missingDelimiterValue");
        int iK0 = k0(c, 0, 6, str);
        if (iK0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iK0);
        js3.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String G0(String str, String str2) {
        int iL0 = l0(str, str2, 0, false, 6);
        if (iL0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iL0);
        js3.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String H0(char c, String str, String str2) {
        js3.p(str, "<this>");
        js3.p(str2, "missingDelimiterValue");
        int iQ0 = q0(str, c, 0, 6);
        if (iQ0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iQ0);
        js3.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String I0(int i, String str) {
        js3.p(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(bl4.q(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        js3.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence J0(CharSequence charSequence) {
        js3.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zF = js3.F(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zF) {
                    break;
                }
                length--;
            } else if (zF) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String K0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        js3.p(str, "<this>");
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequenceSubSequence = "";
                break;
            }
            char cCharAt = str.charAt(i);
            int length2 = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    i2 = -1;
                    break;
                }
                if (cCharAt == cArr[i2]) {
                    break;
                }
                i2++;
            }
            if (!(i2 >= 0)) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                break;
            }
            i++;
        }
        return charSequenceSubSequence.toString();
    }

    public static boolean c0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        js3.p(charSequence, "<this>");
        js3.p(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (l0(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (j0(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean d0(CharSequence charSequence, char c) {
        js3.p(charSequence, "<this>");
        return k0(c, 0, 2, charSequence) >= 0;
    }

    public static String e0(int i, String str) {
        js3.p(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(bl4.q(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(i);
        js3.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static boolean f0(CharSequence charSequence, String str) {
        js3.p(charSequence, "<this>");
        return charSequence instanceof String ? m88.S((String) charSequence, str, false) : s0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static boolean g0(String str, char c) {
        return str.length() > 0 && js3.x(str.charAt(h0(str)), c, false);
    }

    public static final int h0(CharSequence charSequence) {
        js3.p(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int i0(CharSequence charSequence, String str, int i, boolean z) {
        js3.p(charSequence, "<this>");
        js3.p(str, "string");
        return (z || !(charSequence instanceof String)) ? j0(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int j0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        sq3 sq3Var;
        CharSequence charSequence3 = charSequence2;
        int i3 = i;
        int i4 = i2;
        if (z2) {
            int iH0 = h0(charSequence);
            if (i3 > iH0) {
                i3 = iH0;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            sq3Var = new sq3(i3, i4, -1);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            sq3Var = new uq3(i3, i4, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i5 = sq3Var.c;
        int i6 = sq3Var.b;
        int i7 = sq3Var.a;
        if (z3 && (charSequence3 instanceof String)) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                int i8 = i7;
                while (true) {
                    String str = (String) charSequence3;
                    if (!m88.V(str, (String) charSequence, z, 0, i8, str.length())) {
                        if (i8 == i6) {
                            break;
                        }
                        i8 += i5;
                    } else {
                        return i8;
                    }
                }
            }
        } else if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
            int i9 = i7;
            while (!s0(charSequence3, 0, charSequence, i9, charSequence3.length(), z)) {
                if (i9 != i6) {
                    i9 += i5;
                    charSequence3 = charSequence2;
                }
            }
            return i9;
        }
        return -1;
    }

    public static int k0(char c, int i, int i2, CharSequence charSequence) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        js3.p(charSequence, "<this>");
        return !(charSequence instanceof String) ? m0(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int l0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return i0(charSequence, str, i, z);
    }

    public static final int m0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        js3.p(charSequence, "<this>");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ew.S0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int iH0 = h0(charSequence);
        if (i > iH0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (js3.x(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iH0) {
                return -1;
            }
            i++;
        }
    }

    public static boolean n0(CharSequence charSequence) {
        js3.p(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!js3.F(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char o0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(h0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int p0(int i, String str, String str2) {
        int iH0 = (i & 2) != 0 ? h0(str) : 0;
        js3.p(str, "<this>");
        js3.p(str2, "string");
        return str.lastIndexOf(str2, iH0);
    }

    public static int q0(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = h0(str);
        }
        js3.p(str, "<this>");
        return str.lastIndexOf(c, i);
    }

    public static String r0(int i, String str) {
        CharSequence charSequenceSubSequence;
        js3.p(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(bl4.q(i, "Desired length ", " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean s0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        js3.p(charSequence, "<this>");
        js3.p(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!js3.x(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String t0(String str, String str2) {
        if (!m88.Z(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        js3.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String u0(String str, String str2) {
        js3.p(str, "<this>");
        if (!f0(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        js3.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static StringBuilder v0(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        js3.p(charSequence, "<this>");
        js3.p(charSequence2, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    public static final void w0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(rm7.n(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List x0(int i, CharSequence charSequence, String str) {
        w0(i);
        int iI0 = i0(charSequence, str, 0, false);
        if (iI0 == -1 || i == 1) {
            return br9.B(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iI0).toString());
            length = str.length() + iI0;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iI0 = i0(charSequence, str, length, false);
        } while (iI0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List y0(CharSequence charSequence, String[] strArr, int i) {
        int i2 = (i & 4) != 0 ? 0 : 2;
        js3.p(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return x0(i2, charSequence, str);
            }
        }
        w0(i2);
        cw cwVar = new cw(3, new lj1(charSequence, i2, new g8(28, ew.r0(strArr))));
        ArrayList arrayList = new ArrayList(wu0.V(cwVar, 10));
        Iterator it = cwVar.iterator();
        while (true) {
            kj1 kj1Var = (kj1) it;
            if (!kj1Var.hasNext()) {
                return arrayList;
            }
            uq3 uq3Var = (uq3) kj1Var.next();
            js3.p(uq3Var, "range");
            arrayList.add(charSequence.subSequence(uq3Var.a, uq3Var.b + 1).toString());
        }
    }

    public static List z0(String str, char[] cArr) {
        js3.p(str, "<this>");
        if (cArr.length == 1) {
            return x0(0, str, String.valueOf(cArr[0]));
        }
        w0(0);
        cw cwVar = new cw(3, new lj1(str, 0, new g8(27, cArr)));
        ArrayList arrayList = new ArrayList(wu0.V(cwVar, 10));
        Iterator it = cwVar.iterator();
        while (true) {
            kj1 kj1Var = (kj1) it;
            if (!kj1Var.hasNext()) {
                return arrayList;
            }
            uq3 uq3Var = (uq3) kj1Var.next();
            js3.p(uq3Var, "range");
            arrayList.add(str.subSequence(uq3Var.a, uq3Var.b + 1).toString());
        }
    }
}
