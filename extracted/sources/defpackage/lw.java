package defpackage;

import android.text.TextUtils;
import junit.framework.AssertionFailedError;
import junit.framework.ComparisonFailure;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lw {
    public static final String a = rk1.a("Assert");
    public static int b = 2;

    public static void a(String str, String str2, String str3) {
        if (str2.equals(str3)) {
            return;
        }
        String strI = i(null, str, null);
        if (strI == null) {
            strI = "";
        }
        ComparisonFailure comparisonFailure = new ComparisonFailure(strI);
        comparisonFailure.a = str2;
        comparisonFailure.b = str3;
        h(comparisonFailure);
    }

    public static void b(String str, String str2, boolean z) {
        f(str2, str, !z);
    }

    public static void c(CharSequence charSequence, String str) {
        f(null, str, !TextUtils.isEmpty(charSequence));
    }

    public static void d(String str, String str2, Object obj) {
        f(str2, str, obj != null);
    }

    public static void e(Object obj) {
        if (obj != null) {
            f("object: " + obj.toString(), null, false);
        }
    }

    public static void f(Object obj, String str, boolean z) {
        if (z) {
            return;
        }
        g(null, str, obj);
    }

    public static void g(Throwable th, String str, Object obj) {
        String strI = i(th, str, obj);
        AssertionFailedError assertionFailedError = strI == null ? new AssertionFailedError() : new AssertionFailedError(strI);
        if (th != null) {
            assertionFailedError.initCause(th);
        }
        h(assertionFailedError);
    }

    public static void h(AssertionFailedError assertionFailedError) {
        int i = b;
        if (i == 0) {
            throw assertionFailedError;
        }
        if (i == 1) {
            zk8.X(assertionFailedError, false);
        } else {
            if (i == 2 || i == 3) {
                return;
            }
            throw new IllegalStateException("sAssertMode is not valid: " + b);
        }
    }

    public static String i(Throwable th, String str, Object obj) {
        String string;
        String str2;
        String strA = c88.a(str);
        if (obj == null || (string = obj.toString()) == null) {
            string = null;
        }
        String strA2 = c88.a(string);
        if (strA == null && th != null) {
            strA = c88.a(th.getMessage());
        }
        if (strA == null) {
            StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
            int i = 2;
            while (true) {
                if (i >= stackTrace.length) {
                    break;
                }
                if (!stackTrace[i].getClassName().equals(lw.class.getName())) {
                    strA = c88.a(stackTrace[i].toString());
                    break;
                }
                i++;
            }
        }
        if (strA != null || strA2 == null) {
            str2 = strA2;
            strA2 = strA;
        } else {
            str2 = null;
        }
        if (strA2 == null) {
            return null;
        }
        if (b == 1) {
            if (str2 != null) {
                sb7.p(a, strA2, str2);
            }
            return strA2;
        }
        StringBuilder sbC = bl4.C(strA2);
        sbC.append(str2 == null ? "" : o40.y(" (", str2, ")"));
        return sbC.toString();
    }
}
