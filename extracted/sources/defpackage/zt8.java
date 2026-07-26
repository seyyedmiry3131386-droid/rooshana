package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class zt8 extends qt8 {
    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        if (mw3Var.R() == JsonToken.i) {
            mw3Var.J();
            return null;
        }
        String strT = mw3Var.t();
        try {
            wu8.m(strT);
            return new BigInteger(strT);
        } catch (NumberFormatException e) {
            StringBuilder sbN = t61.n("Failed parsing '", strT, "' as BigInteger; at path ");
            sbN.append(mw3Var.k(true));
            throw new JsonSyntaxException(sbN.toString(), e);
        }
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        uw3Var.R((BigInteger) obj);
    }
}
