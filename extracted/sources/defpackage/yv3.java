package defpackage;

import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes3.dex */
@so7(with = aw3.class)
public final class yv3 extends hw3 {
    public static final yv3 INSTANCE = new yv3();

    @Override // defpackage.hw3
    public final String a() {
        return Ssh2PublicKeyAlgorithmName.NULL;
    }

    public final px3 serializer() {
        return aw3.a;
    }
}
