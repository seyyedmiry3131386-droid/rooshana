package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gh9 {
    public static final byte[] a = new byte[0];
    public static final tv5 b;

    static {
        ByteString byteString = ByteString.d;
        b = at2.h0(fv.u("efbbbf"), fv.u("feff"), fv.u("fffe0000"), fv.u("fffe"), fv.u("0000feff"));
    }

    public static final void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbS = rm7.s(j, "length=", ", offset=");
            sbS.append(j2);
            sbS.append(", count=");
            sbS.append(j2);
            throw new ArrayIndexOutOfBoundsException(sbS.toString());
        }
    }

    public static final void b(Closeable closeable) {
        js3.p(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void c(tb2 tb2Var, s26 s26Var) throws IOException {
        js3.p(tb2Var, "<this>");
        try {
            IOException iOException = null;
            for (s26 s26Var2 : tb2Var.I(s26Var)) {
                try {
                    if (tb2Var.K(s26Var2).c) {
                        c(tb2Var, s26Var2);
                    }
                    tb2Var.u(s26Var2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void d(kp1 kp1Var, s26 s26Var) {
        js3.p(kp1Var, "<this>");
        js3.p(s26Var, "path");
        try {
            kp1Var.u(s26Var);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int e(int i, int i2, String str, String str2) {
        js3.p(str, "<this>");
        while (i < i2) {
            if (f88.d0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int f(String str, char c, int i, int i2) {
        js3.p(str, "<this>");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final boolean g(String[] strArr, String[] strArr2, Comparator comparator) {
        js3.p(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int h(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (js3.r(cCharAt, 31) <= 0 || js3.r(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int i(String str, int i, int i2) {
        js3.p(str, "<this>");
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int j(String str, int i, int i2) {
        js3.p(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final String[] k(String[] strArr, String[] strArr2, Comparator comparator) {
        js3.p(strArr, "<this>");
        js3.p(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean l(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int m(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final int n(ph0 ph0Var) {
        js3.p(ph0Var, "<this>");
        return (ph0Var.readByte() & 255) | ((ph0Var.readByte() & 255) << 16) | ((ph0Var.readByte() & 255) << 8);
    }

    public static final int o(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final String p(String str, int i, int i2) {
        int i3 = i(str, i, i2);
        String strSubstring = str.substring(i3, j(str, i3, i2));
        js3.o(strSubstring, "substring(...)");
        return strSubstring;
    }
}
