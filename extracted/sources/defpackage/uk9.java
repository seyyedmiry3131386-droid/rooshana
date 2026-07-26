package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public final class uk9 implements xk9 {
    @Override // defpackage.xk9
    public final Iterator a() {
        return null;
    }

    @Override // defpackage.xk9
    public final Boolean c() {
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof uk9;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // defpackage.xk9
    public final Double i() {
        return Double.valueOf(0.0d);
    }

    @Override // defpackage.xk9
    public final xk9 j(String str, o77 o77Var, ArrayList arrayList) {
        throw new IllegalStateException("null has no function ".concat(str));
    }

    @Override // defpackage.xk9
    public final String l() {
        return Ssh2PublicKeyAlgorithmName.NULL;
    }

    @Override // defpackage.xk9
    public final xk9 m() {
        return xk9.q0;
    }
}
