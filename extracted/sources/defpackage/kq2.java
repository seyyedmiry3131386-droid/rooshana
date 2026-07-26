package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class kq2 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = j29.a;
            int i = Integer.parseInt(strGroup, 16);
            int i2 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.a = i;
            this.b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(jv4 jv4Var) {
        int i = 0;
        while (true) {
            iv4[] iv4VarArr = jv4Var.a;
            if (i >= iv4VarArr.length) {
                return;
            }
            iv4 iv4Var = iv4VarArr[i];
            if (iv4Var instanceof uw0) {
                uw0 uw0Var = (uw0) iv4Var;
                if ("iTunSMPB".equals(uw0Var.c) && a(uw0Var.d)) {
                    return;
                }
            } else if (iv4Var instanceof wr3) {
                wr3 wr3Var = (wr3) iv4Var;
                if ("com.apple.iTunes".equals(wr3Var.b) && "iTunSMPB".equals(wr3Var.c) && a(wr3Var.d)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}
