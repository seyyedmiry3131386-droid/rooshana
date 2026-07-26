package defpackage;

import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public final class gm9 {
    public static final /* synthetic */ int b = 0;
    public final int a;

    public gm9(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gm9)) {
            return false;
        }
        int i = ((gm9) obj).a;
        int i2 = this.a;
        if (i2 != 0) {
            return i2 == i;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return ((i ^ (-485106924)) * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i = this.a;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? Ssh2PublicKeyAlgorithmName.NULL : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        StringBuilder sb = new StringBuilder("READ_AND_WRITE".length() + str.length() + "".length() + 73 + 91 + 1);
        o40.I("FileComplianceOptions{fileOwner=, hasDifferentDmaOwner=false, fileChecks=", str, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", "READ_AND_WRITE", sb);
        sb.append("}");
        return sb.toString();
    }
}
