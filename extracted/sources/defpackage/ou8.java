package defpackage;

import com.google.gson.stream.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ou8 extends qt8 {
    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        JsonToken jsonTokenR = mw3Var.R();
        if (jsonTokenR != JsonToken.i) {
            return jsonTokenR == JsonToken.f ? Boolean.valueOf(Boolean.parseBoolean(mw3Var.t())) : Boolean.valueOf(mw3Var.D());
        }
        mw3Var.J();
        return null;
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            uw3Var.u();
            return;
        }
        uw3Var.l0();
        uw3Var.b();
        uw3Var.a.write(bool.booleanValue() ? "true" : "false");
    }
}
