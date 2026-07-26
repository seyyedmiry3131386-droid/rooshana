package defpackage;

import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public class ku8 extends qt8 {
    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        if (mw3Var.R() == JsonToken.i) {
            mw3Var.J();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(mw3Var.t(), "_");
        String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        Locale locale = (Locale) obj;
        uw3Var.U(locale == null ? null : locale.toString());
    }
}
