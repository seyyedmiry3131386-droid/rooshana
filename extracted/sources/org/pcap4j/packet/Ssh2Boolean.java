package org.pcap4j.packet;

import java.io.Serializable;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Ssh2Boolean implements Serializable {
    private static final long serialVersionUID = 951415749644317915L;
    private final byte rawData;
    public static final Ssh2Boolean TRUE = new Ssh2Boolean((byte) 1);
    public static final Ssh2Boolean FALSE = new Ssh2Boolean((byte) 0);

    public Ssh2Boolean(byte b) {
        this.rawData = b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return Ssh2Boolean.class.isInstance(obj) && ((Ssh2Boolean) obj).rawData == this.rawData;
    }

    public byte[] getRawData() {
        return new byte[]{this.rawData};
    }

    public boolean getValue() {
        return this.rawData != 0;
    }

    public int hashCode() {
        return this.rawData;
    }

    public int length() {
        return 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append(getValue());
        sb.append("(0x");
        sb.append(ByteArrays.toHexString(this.rawData, ""));
        sb.append(")");
        return sb.toString();
    }

    public Ssh2Boolean(byte[] bArr, int i) {
        ByteArrays.validateBounds(bArr, i, 1);
        this.rawData = bArr[i];
    }
}
