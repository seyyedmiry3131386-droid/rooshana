package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class sf0 implements d18 {
    public static final qf0 a = new qf0();
    public static final boolean b;

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, rf0.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        b = z;
    }

    @Override // defpackage.d18
    public final boolean a() {
        return b;
    }

    @Override // defpackage.d18
    public final boolean b(SSLSocket sSLSocket) {
        return false;
    }

    @Override // defpackage.d18
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.d18
    public final void d(SSLSocket sSLSocket, String str, List list) {
        js3.p(list, "protocols");
        if (b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            k96 k96Var = k96.a;
            parameters.setApplicationProtocols((String[]) rl3.u(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
