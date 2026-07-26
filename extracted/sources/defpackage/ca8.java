package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ca8 implements cb8 {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder a = new StringBuilder();
    public final ArrayList b = new ArrayList();
    public final h26 c = new h26();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.l81 a(android.text.Spanned r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca8.a(android.text.Spanned, java.lang.String):l81");
    }

    public static long b(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    @Override // defpackage.cb8
    public final /* synthetic */ ta8 d(byte[] bArr, int i, int i2) {
        return rm7.e(this, bArr, i2);
    }

    @Override // defpackage.cb8
    public final void m(byte[] bArr, int i, int i2, bb8 bb8Var, n31 n31Var) {
        String strK;
        String str;
        ca8 ca8Var = this;
        long j = bb8Var.b;
        h26 h26Var = ca8Var.c;
        h26Var.H(i + i2, bArr);
        h26Var.J(i);
        Charset charsetF = h26Var.F();
        if (charsetF == null) {
            charsetF = StandardCharsets.UTF_8;
        }
        long j2 = -9223372036854775807L;
        ArrayList arrayList = (j == -9223372036854775807L || !bb8Var.a) ? null : new ArrayList();
        while (true) {
            String strK2 = h26Var.k(charsetF);
            if (strK2 == null) {
                break;
            }
            if (!strK2.isEmpty()) {
                try {
                    Integer.parseInt(strK2);
                    strK = h26Var.k(charsetF);
                } catch (NumberFormatException unused) {
                    wn5.k0("SubripParser", "Skipping invalid index: ".concat(strK2));
                }
                if (strK == null) {
                    wn5.k0("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = d.matcher(strK);
                if (matcher.matches()) {
                    long jB = b(matcher, 1);
                    long jB2 = b(matcher, 6);
                    StringBuilder sb = ca8Var.a;
                    sb.setLength(0);
                    long j3 = j2;
                    ArrayList arrayList2 = ca8Var.b;
                    arrayList2.clear();
                    for (String strK3 = h26Var.k(charsetF); !TextUtils.isEmpty(strK3); strK3 = h26Var.k(charsetF)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String strTrim = strK3.trim();
                        StringBuilder sb2 = new StringBuilder(strTrim);
                        Matcher matcher2 = e.matcher(strTrim);
                        int i3 = 0;
                        while (matcher2.find()) {
                            String strGroup = matcher2.group();
                            arrayList2.add(strGroup);
                            int iStart = matcher2.start() - i3;
                            int length = strGroup.length();
                            sb2.replace(iStart, iStart + length, "");
                            i3 += length;
                            j = j;
                        }
                        sb.append(sb2.toString());
                    }
                    long j4 = j;
                    Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (String) arrayList2.get(i4);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (j4 == j3 || jB2 >= j4) {
                        n31Var.accept(new o81(ImmutableList.s(a(spannedFromHtml, str)), jB, jB2 - jB));
                    } else if (arrayList != null) {
                        arrayList.add(new o81(ImmutableList.s(a(spannedFromHtml, str)), jB, jB2 - jB));
                    }
                    ca8Var = this;
                    j2 = j3;
                    j = j4;
                } else {
                    wn5.k0("SubripParser", "Skipping invalid timing: ".concat(strK));
                    ca8Var = this;
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                n31Var.accept((o81) it.next());
            }
        }
    }

    @Override // defpackage.cb8
    public final /* synthetic */ void reset() {
    }
}
