package org.pcap4j.packet;

import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IllegalPacket extends AbstractPacket {
    private static final long serialVersionUID = -8028013257441150031L;
    private final byte[] rawData;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private byte[] rawData;

        public Builder rawData(byte[] bArr) {
            this.rawData = bArr;
            return this;
        }

        public Builder() {
            this.rawData = new byte[0];
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IllegalPacket build() {
            return new IllegalPacket(this);
        }

        private Builder(IllegalPacket illegalPacket) {
            this.rawData = new byte[0];
            this.rawData = illegalPacket.rawData;
        }
    }

    public static IllegalPacket newPacket(byte[] bArr, int i, int i2) {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IllegalPacket(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public String buildString() {
        StringBuilder sb = new StringBuilder("[Illegal Packet (");
        String property = System.getProperty("line.separator");
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
        if (IllegalPacket.class.isInstance(obj)) {
            return Arrays.equals(this.rawData, ((IllegalPacket) obj).rawData);
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

    private IllegalPacket(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.rawData = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    private IllegalPacket(Builder builder) {
        if (builder != null && builder.rawData != null) {
            byte[] bArr = new byte[builder.rawData.length];
            this.rawData = bArr;
            System.arraycopy(builder.rawData, 0, bArr, 0, builder.rawData.length);
            return;
        }
        throw null;
    }
}
