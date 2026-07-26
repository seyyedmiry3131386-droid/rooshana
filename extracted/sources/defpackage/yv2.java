package defpackage;

import android.text.TextUtils;
import com.android.volley.ParseError;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class yv2 extends xv2 {
    public static final Pattern A = Pattern.compile("charset=([^;]*)");

    @Override // defpackage.xv2, defpackage.x47
    public final ry p(fn5 fn5Var) {
        Map map = (Map) fn5Var.d;
        String strGroup = null;
        String str = map == null ? null : (String) map.get("content-type");
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = A.matcher(str);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            }
        }
        if (TextUtils.isEmpty(strGroup)) {
            strGroup = "ISO-8859-1";
        }
        try {
            return new ry(dy3.p(new ByteArrayInputStream((byte[]) fn5Var.c), Charset.forName(strGroup)), yh0.E(fn5Var));
        } catch (IOException | UnsupportedCharsetException e) {
            lw.g(e, "Cannot decode google response with this charset", strGroup);
            return new ry(new ParseError(e));
        }
    }
}
