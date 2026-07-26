package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public class fu8 extends qt8 {
    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        if (mw3Var.R() == JsonToken.i) {
            mw3Var.J();
            return null;
        }
        try {
            String strT = mw3Var.t();
            if (strT.equals(Ssh2PublicKeyAlgorithmName.NULL)) {
                return null;
            }
            return new URI(strT);
        } catch (URISyntaxException e) {
            throw new JsonIOException(e);
        }
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        URI uri = (URI) obj;
        uw3Var.U(uri == null ? null : uri.toASCIIString());
    }
}
