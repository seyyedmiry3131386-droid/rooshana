package org.junit;

import defpackage.bl4;
import defpackage.s7;
import defpackage.t61;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes3.dex */
public class ComparisonFailure extends AssertionError {
    private static final long serialVersionUID = 1;

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        String strConcat = "";
        if (message != null && !"".equals(message)) {
            strConcat = message.concat(" ");
        }
        if (!Ssh2PublicKeyAlgorithmName.NULL.equals(Ssh2PublicKeyAlgorithmName.NULL)) {
            return t61.i(strConcat, "expected:<null> but was:<null>");
        }
        StringBuilder sbE = bl4.E(strConcat, "expected: ");
        sbE.append(s7.p(null, Ssh2PublicKeyAlgorithmName.NULL));
        sbE.append(" but was: ");
        sbE.append(s7.p(null, Ssh2PublicKeyAlgorithmName.NULL));
        return sbE.toString();
    }
}
