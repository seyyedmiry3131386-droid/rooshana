package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes3.dex */
public final class p21 implements oi1 {
    @Override // defpackage.oi1
    public final boolean b(SSLSocket sSLSocket) {
        return r21.b && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.oi1
    public final d18 c(SSLSocket sSLSocket) {
        return new r21();
    }
}
