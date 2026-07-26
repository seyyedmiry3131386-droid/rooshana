package defpackage;

import com.google.gson.stream.JsonToken;
import java.io.IOException;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public class pu8 extends qt8 {
    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        if (mw3Var.R() != JsonToken.i) {
            return Boolean.valueOf(mw3Var.t());
        }
        mw3Var.J();
        return null;
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        uw3Var.U(bool == null ? Ssh2PublicKeyAlgorithmName.NULL : bool.toString());
    }
}
