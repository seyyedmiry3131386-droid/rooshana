package defpackage;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ed3 {
    public static final Map a;
    public static final Pattern b;

    static {
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ed3.class.getResourceAsStream("/org/commonmark/internal/util/entities.properties"), Charset.forName("UTF-8")));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        map.put("NewLine", "\n");
                        a = map;
                        b = Pattern.compile("^&#[Xx]?");
                        return;
                    }
                    if (line.length() != 0) {
                        int iIndexOf = line.indexOf(SimpleComparison.EQUAL_TO_OPERATION);
                        map.put(line.substring(0, iIndexOf), line.substring(iIndexOf + 1));
                    }
                } finally {
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e);
        }
    }

    public static String a(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.find()) {
            String str2 = (String) a.get(dw1.l(str, 1, 1));
            return str2 != null ? str2 : str;
        }
        try {
            int i = Integer.parseInt(str.substring(matcher.end(), str.length() - 1), matcher.end() == 2 ? 10 : 16);
            return i == 0 ? "�" : new String(Character.toChars(i));
        } catch (IllegalArgumentException unused) {
            return "�";
        }
    }
}
