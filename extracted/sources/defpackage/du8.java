package defpackage;

import com.google.gson.stream.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class du8 extends qt8 {
    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        if (mw3Var.R() != JsonToken.i) {
            return new StringBuffer(mw3Var.t());
        }
        mw3Var.J();
        return null;
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        StringBuffer stringBuffer = (StringBuffer) obj;
        uw3Var.U(stringBuffer == null ? null : stringBuffer.toString());
    }
}
