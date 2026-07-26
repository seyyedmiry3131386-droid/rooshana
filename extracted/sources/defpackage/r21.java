package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes3.dex */
public final class r21 implements d18 {
    public static final p21 a = new p21();
    public static final boolean b;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, q21.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (q21.a()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        b = z;
    }

    @Override // defpackage.d18
    public final boolean a() {
        return b;
    }

    @Override // defpackage.d18
    public final boolean b(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.d18
    public final String c(SSLSocket sSLSocket) {
        if (b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.d18
    public final void d(SSLSocket sSLSocket, String str, List list) {
        js3.p(list, "protocols");
        if (b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            k96 k96Var = k96.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) rl3.u(list).toArray(new String[0]));
        }
    }
}
