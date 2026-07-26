package org.pcap4j.packet;

import org.pcap4j.packet.SimplePacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class FragmentedPacket extends SimplePacket {
    private static final long serialVersionUID = 8065880017691703511L;

    public static final class Builder extends SimplePacket.Builder {
        public Builder rawData(byte[] bArr) {
            setRawData(bArr);
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public FragmentedPacket build() {
            return new FragmentedPacket(this);
        }

        private Builder(FragmentedPacket fragmentedPacket) {
            super(fragmentedPacket);
        }
    }

    public static FragmentedPacket newPacket(byte[] bArr, int i, int i2) {
        ByteArrays.validateBounds(bArr, i, i2);
        return new FragmentedPacket(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.SimplePacket, org.pcap4j.packet.AbstractPacket
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.pcap4j.packet.SimplePacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public /* bridge */ /* synthetic */ byte[] getRawData() {
        return super.getRawData();
    }

    @Override // org.pcap4j.packet.SimplePacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public /* bridge */ /* synthetic */ int length() {
        return super.length();
    }

    @Override // org.pcap4j.packet.SimplePacket
    public String modifier() {
        return "Fragmented ";
    }

    private FragmentedPacket(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    private FragmentedPacket(Builder builder) {
        super(builder);
    }
}
