package org.pcap4j.packet;

import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.AbstractPacket;

/* JADX INFO: loaded from: classes4.dex */
abstract class SimplePacket extends AbstractPacket {
    private static final long serialVersionUID = -1565433651791063490L;
    private final byte[] rawData;

    public static abstract class Builder extends AbstractPacket.AbstractBuilder {
        private byte[] rawData;

        public Builder() {
        }

        public void setRawData(byte[] bArr) {
            this.rawData = bArr;
        }

        public Builder(SimplePacket simplePacket) {
            this.rawData = simplePacket.rawData;
        }
    }

    public SimplePacket(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.rawData = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public String buildString() {
        StringBuilder sb = new StringBuilder("[");
        String property = System.getProperty("line.separator");
        sb.append(modifier());
        sb.append("data (");
        sb.append(length());
        sb.append(" bytes)]");
        sb.append(property);
        sb.append("  Hex stream: ");
        return t61.m(this.rawData, " ", sb, property);
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public int calcHashCode() {
        return Arrays.hashCode(this.rawData);
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (getClass().isInstance(obj)) {
            return Arrays.equals(this.rawData, ((SimplePacket) obj).rawData);
        }
        return false;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public byte[] getRawData() {
        byte[] bArr = this.rawData;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public int length() {
        return this.rawData.length;
    }

    public abstract String modifier();

    public SimplePacket(Builder builder) {
        if (builder != null && builder.rawData != null) {
            byte[] bArr = new byte[builder.rawData.length];
            this.rawData = bArr;
            System.arraycopy(builder.rawData, 0, bArr, 0, builder.rawData.length);
        } else {
            throw new NullPointerException("builder: " + builder + " builder.rawData: " + builder.rawData);
        }
    }
}
