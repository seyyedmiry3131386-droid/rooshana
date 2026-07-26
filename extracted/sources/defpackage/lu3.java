package defpackage;

import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public final class lu3 extends mu3 {
    public final /* synthetic */ mu3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu3(mu3 mu3Var, mu3 mu3Var2) {
        super(mu3Var2);
        this.c = mu3Var;
    }

    @Override // defpackage.mu3
    public final CharSequence d(Object obj) {
        return obj == null ? Ssh2PublicKeyAlgorithmName.NULL : this.c.d(obj);
    }
}
