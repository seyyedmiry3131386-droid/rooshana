package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class wt8 extends qt8 {
    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        if (mw3Var.R() == JsonToken.i) {
            mw3Var.J();
            return null;
        }
        String strT = mw3Var.t();
        if (strT.length() == 1) {
            return Character.valueOf(strT.charAt(0));
        }
        StringBuilder sbN = t61.n("Expecting character, got: ", strT, "; at ");
        sbN.append(mw3Var.k(true));
        throw new JsonSyntaxException(sbN.toString());
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        Character ch = (Character) obj;
        uw3Var.U(ch == null ? null : String.valueOf(ch));
    }
}
