package defpackage;

import com.google.gson.stream.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class xt8 extends qt8 {
    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        JsonToken jsonTokenR = mw3Var.R();
        if (jsonTokenR != JsonToken.i) {
            return jsonTokenR == JsonToken.h ? Boolean.toString(mw3Var.D()) : mw3Var.t();
        }
        mw3Var.J();
        return null;
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        uw3Var.U((String) obj);
    }
}
