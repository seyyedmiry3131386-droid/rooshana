package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.ProtocolFamily;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class BsdLoopbackPacket extends AbstractPacket {
    private static final long serialVersionUID = 5348192606048946251L;
    private final BsdLoopbackHeader header;
    private final Packet payload;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private Packet.Builder payloadBuilder;
        private ProtocolFamily protocolFamily;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder protocolFamily(ProtocolFamily protocolFamily) {
            this.protocolFamily = protocolFamily;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public BsdLoopbackPacket build() {
            return new BsdLoopbackPacket(this);
        }

        private Builder(BsdLoopbackPacket bsdLoopbackPacket) {
            this.protocolFamily = bsdLoopbackPacket.header.protocolFamily;
            this.payloadBuilder = bsdLoopbackPacket.payload != null ? bsdLoopbackPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }
    }

    public static BsdLoopbackPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new BsdLoopbackPacket(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public static final class BsdLoopbackHeader extends AbstractPacket.AbstractHeader {
        private static final int BSD_LOOPBACK_HEADER_SIZE = 4;
        private static final int PROTOCOL_FAMILY_OFFSET = 0;
        private static final int PROTOCOL_FAMILY_SIZE = 4;
        private static final long serialVersionUID = -1053845855337317937L;
        private final ProtocolFamily protocolFamily;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[BSD Loopback Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Protocol Family: ");
            sb.append(this.protocolFamily);
            sb.append(property);
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.protocolFamily.hashCode() + 527;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (BsdLoopbackHeader.class.isInstance(obj)) {
                return this.protocolFamily.equals(((BsdLoopbackHeader) obj).protocolFamily);
            }
            return false;
        }

        public ProtocolFamily getProtocolFamily() {
            return this.protocolFamily;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.protocolFamily.value().intValue(), ByteOrder.nativeOrder()));
            return arrayList;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 4;
        }

        private BsdLoopbackHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 4) {
                this.protocolFamily = ProtocolFamily.getInstance(Integer.valueOf(ByteArrays.getInt(bArr, i, ByteOrder.nativeOrder())));
                return;
            }
            StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a BSD loopback header(4 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }

        private BsdLoopbackHeader(Builder builder) {
            this.protocolFamily = builder.protocolFamily;
        }
    }

    private BsdLoopbackPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        BsdLoopbackHeader bsdLoopbackHeader = new BsdLoopbackHeader(bArr, i, i2);
        this.header = bsdLoopbackHeader;
        int length = i2 - bsdLoopbackHeader.length();
        if (length > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, ProtocolFamily.class).newInstance(bArr, bsdLoopbackHeader.length() + i, length, bsdLoopbackHeader.getProtocolFamily());
        } else {
            this.payload = null;
        }
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public BsdLoopbackHeader getHeader() {
        return this.header;
    }

    private BsdLoopbackPacket(Builder builder) {
        if (builder != null && builder.protocolFamily != null) {
            this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.header = new BsdLoopbackHeader(builder);
        } else {
            throw new NullPointerException("builder: " + builder + " builder.packetType: " + builder.protocolFamily);
        }
    }
}
