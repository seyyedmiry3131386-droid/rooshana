package defpackage;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Currency;

/* JADX INFO: loaded from: classes.dex */
public class iu8 extends qt8 {
    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        String strT = mw3Var.t();
        try {
            return Currency.getInstance(strT);
        } catch (IllegalArgumentException e) {
            StringBuilder sbN = t61.n("Failed parsing '", strT, "' as Currency; at path ");
            sbN.append(mw3Var.k(true));
            throw new JsonSyntaxException(sbN.toString(), e);
        }
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        uw3Var.U(((Currency) obj).getCurrencyCode());
    }
}
