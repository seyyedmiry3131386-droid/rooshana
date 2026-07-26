package defpackage;

import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.net.URL;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public class eu8 extends qt8 {
    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        if (mw3Var.R() == JsonToken.i) {
            mw3Var.J();
            return null;
        }
        String strT = mw3Var.t();
        if (strT.equals(Ssh2PublicKeyAlgorithmName.NULL)) {
            return null;
        }
        return new URL(strT);
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        URL url = (URL) obj;
        uw3Var.U(url == null ? null : url.toExternalForm());
    }
}
