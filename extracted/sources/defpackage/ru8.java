package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ru8 extends qt8 {
    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        if (mw3Var.R() == JsonToken.i) {
            mw3Var.J();
            return null;
        }
        try {
            int iNextInt = mw3Var.nextInt();
            if (iNextInt <= 65535 && iNextInt >= -32768) {
                return Short.valueOf((short) iNextInt);
            }
            StringBuilder sbR = rm7.r(iNextInt, "Lossy conversion from ", " to short; at path ");
            sbR.append(mw3Var.k(true));
            throw new JsonSyntaxException(sbR.toString());
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        if (((Number) obj) == null) {
            uw3Var.u();
        } else {
            uw3Var.P(r4.shortValue());
        }
    }
}
