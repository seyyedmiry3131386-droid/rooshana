package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ed9 {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final h26 a = new h26();
    public final StringBuilder b = new StringBuilder();

    public static String a(h26 h26Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = h26Var.b;
        int i2 = h26Var.c;
        while (i < i2 && !z) {
            char c2 = (char) h26Var.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        h26Var.K(i - h26Var.b);
        return sb.toString();
    }

    public static String b(h26 h26Var, StringBuilder sb) {
        c(h26Var);
        if (h26Var.a() == 0) {
            return null;
        }
        String strA = a(h26Var, sb);
        if (!strA.isEmpty()) {
            return strA;
        }
        return "" + ((char) h26Var.x());
    }

    public static void c(h26 h26Var) {
        while (true) {
            for (boolean z = true; h26Var.a() > 0 && z; z = false) {
                int i = h26Var.b;
                byte[] bArr = h26Var.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    h26Var.K(1);
                } else {
                    int i2 = h26Var.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            h26Var.K(i2 - h26Var.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
