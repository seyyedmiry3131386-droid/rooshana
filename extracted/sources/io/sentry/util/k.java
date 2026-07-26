package io.sentry.util;

import defpackage.dw1;
import java.nio.charset.Charset;
import java.text.StringCharacterIterator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {
    public static final Charset a = Charset.forName("UTF-8");
    public static final Pattern b = Pattern.compile("[\\W_]+");

    public static String a(long j) {
        if (-1000 < j && j < 1000) {
            return j + " B";
        }
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator("kMGTPE");
        while (true) {
            if (j > -999950 && j < 999950) {
                return String.format(Locale.ROOT, "%.1f %cB", Double.valueOf(j / 1000.0d), Character.valueOf(stringCharacterIterator.current()));
            }
            j /= 1000;
            stringCharacterIterator.next();
        }
    }

    public static String b(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Locale locale = Locale.ROOT;
        sb.append(strSubstring.toUpperCase(locale));
        sb.append(str.substring(1).toLowerCase(locale));
        return sb.toString();
    }

    public static String c(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            sb.append((CharSequence) it.next());
            while (it.hasNext()) {
                sb.append((CharSequence) ",");
                sb.append((CharSequence) it.next());
            }
        }
        return sb.toString();
    }

    public static String d(String str) {
        return (str != null && str.startsWith("\"") && str.endsWith("\"")) ? dw1.l(str, 1, 1) : str;
    }
}
