package defpackage;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.FragmentActivity;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Formatter;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.text.Regex;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes3.dex */
public final class lw8 {
    public static final Object b = b.N(new Pair('0', (char) 1776), new Pair('1', (char) 1777), new Pair('2', (char) 1778), new Pair('3', (char) 1779), new Pair('4', (char) 1780), new Pair('5', (char) 1781), new Pair('6', (char) 1782), new Pair('7', (char) 1783), new Pair('8', (char) 1784), new Pair('9', (char) 1785));
    public final Context a;

    public lw8(Context context) {
        this.a = context;
    }

    public static void a(View view) {
        if (view != null) {
            Object systemService = view.getContext().getSystemService("input_method");
            js3.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void b(FragmentActivity fragmentActivity) {
        if (fragmentActivity == null) {
            lw.g(null, "activity must not be null", null);
            return;
        }
        View currentFocus = fragmentActivity.getCurrentFocus();
        if (currentFocus != null) {
            Object systemService = currentFocus.getContext().getSystemService("input_method");
            js3.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    public static String d(String str, boolean z) {
        if (str == null || f88.n0(str) || str.equalsIgnoreCase(Ssh2PublicKeyAlgorithmName.NULL)) {
            return "";
        }
        if (!z) {
            return str;
        }
        char[] charArray = str.toCharArray();
        js3.o(charArray, "toCharArray(...)");
        int length = charArray.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char cCharValue = charArray[i];
            int i3 = i2 + 1;
            Character chValueOf = Character.valueOf(cCharValue);
            ?? r5 = b;
            if (r5.containsKey(chValueOf)) {
                Character ch = (Character) r5.get(Character.valueOf(cCharValue));
                if (ch != null) {
                    cCharValue = ch.charValue();
                }
                charArray[i2] = cCharValue;
            }
            i++;
            i2 = i3;
        }
        return new String(charArray);
    }

    public static /* synthetic */ String e(lw8 lw8Var, String str) {
        boolean zT = jr9.t(lw8Var.a);
        lw8Var.getClass();
        return d(str, zT);
    }

    public static int g(String str) {
        if (!f88.n0(str)) {
            Regex regex = new Regex("[\\p{L}]+");
            String string = f88.J0(str).toString();
            if (!f88.n0(string)) {
                String[] strArr = (String[]) regex.i(string).toArray(new String[0]);
                if (strArr.length == 0) {
                    return 1;
                }
                String str2 = strArr[strArr.length - 1];
                return (f88.n0(str2) || string.charAt(string.length() - 1) != str2.charAt(str2.length() - 1)) ? strArr.length : strArr.length - 1;
            }
        }
        return 0;
    }

    public static String h(long j) {
        int iLog10 = j != 0 ? (int) (Math.log10(j) / Math.log10(1024.0d)) : 0;
        String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        if (iLog10 == 1) {
            return t61.j(new DecimalFormat("####", decimalFormatSymbols).format(j / Math.pow(1024.0d, iLog10)), " ", strArr[iLog10]);
        }
        if (iLog10 != 1) {
            return t61.i(new DecimalFormat("#,##0.#", decimalFormatSymbols).format(j / Math.pow(1024.0d, iLog10)), dw1.n(" ", strArr[iLog10]));
        }
        String str = new DecimalFormat("#,##0.#", decimalFormatSymbols).format((j / Math.pow(1024.0d, iLog10)) / ((double) 1000));
        js3.m(str);
        return str;
    }

    public static String i(long j) {
        return j < 512 ? "0 KB/s" : j < 1024 ? "1 KB/s" : t61.i(h(j), "/s");
    }

    public static String j(String str) {
        js3.p(str, "number");
        StringBuilder sb = new StringBuilder(str.length());
        char[] charArray = str.toCharArray();
        js3.o(charArray, "toCharArray(...)");
        for (char c : charArray) {
            int iDigit = Character.digit((int) c, 10);
            Integer numValueOf = Integer.valueOf(iDigit);
            if (iDigit < 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
            if (iIntValue != -1) {
                sb.append(iIntValue);
            } else {
                sb.append(c);
            }
        }
        String string = sb.toString();
        js3.o(string, "toString(...)");
        return string;
    }

    public final String c(int i) {
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 / 3600;
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb, Locale.getDefault());
        sb.setLength(0);
        return i5 > 0 ? e(this, formatter.format("%d:%02d:%02d", Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3)).toString()) : e(this, formatter.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3)).toString());
    }

    public final String f(String str) {
        String strE = e(this, str);
        return jr9.t(this.a) ? m88.X(strE, ".", "٫") : strE;
    }
}
