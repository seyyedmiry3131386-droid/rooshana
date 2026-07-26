package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.packet.namednumber.Oui;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class SnapPacket extends AbstractPacket {
    private static final long serialVersionUID = 2957315717350800697L;
    private final SnapHeader header;
    private final Packet payload;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private Oui oui;
        private Packet.Builder payloadBuilder;
        private EtherType protocolId;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder oui(Oui oui) {
            this.oui = oui;
            return this;
        }

        public Builder protocolId(EtherType etherType) {
            this.protocolId = etherType;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public SnapPacket build() {
            return new SnapPacket(this);
        }

        private Builder(SnapPacket snapPacket) {
            this.oui = snapPacket.header.oui;
            this.protocolId = snapPacket.header.protocolId;
            this.payloadBuilder = snapPacket.payload != null ? snapPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }
    }

    public static SnapPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new SnapPacket(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public static final class SnapHeader extends AbstractPacket.AbstractHeader {
        private static final int OUI_OFFSET = 0;
        private static final int OUI_SIZE = 3;
        private static final int PROTOCOL_ID_OFFSET = 3;
        private static final int PROTOCOL_ID_SIZE = 2;
        private static final int SNAP_HEADER_SIZE = 5;
        private static final long serialVersionUID = 8525438913079396866L;
        private final Oui oui;
        private final EtherType protocolId;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[Subnetwork Access Protocol header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  OUI: ");
            sb.append(this.oui);
            sb.append(property);
            sb.append("  Protocol ID: ");
            sb.append(this.protocolId);
            sb.append(property);
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.protocolId.hashCode() + ((this.oui.hashCode() + 527) * 31);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!SnapHeader.class.isInstance(obj)) {
                return false;
            }
            SnapHeader snapHeader = (SnapHeader) obj;
            return this.oui.equals(snapHeader.oui) && this.protocolId.equals(snapHeader.protocolId);
        }

        public Oui getOui() {
            return this.oui;
        }

        public EtherType getProtocolId() {
            return this.protocolId;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.oui.valueAsByteArray());
            arrayList.add(ByteArrays.toByteArray(this.protocolId.value().shortValue()));
            return arrayList;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 5;
        }

        private SnapHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 5) {
                this.oui = Oui.getInstance(ByteArrays.getSubArray(bArr, i, 3));
                this.protocolId = EtherType.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i + 3)));
            } else {
                StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a SNAP header(5 bytes). data: ");
                t61.t(i, " ", ", offset: ", sbA, bArr);
                sbA.append(", length: ");
                sbA.append(i2);
                throw new IllegalRawDataException(sbA.toString());
            }
        }

        private SnapHeader(Builder builder) {
            this.oui = builder.oui;
            this.protocolId = builder.protocolId;
        }
    }

    private SnapPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        SnapHeader snapHeader = new SnapHeader(bArr, i, i2);
        this.header = snapHeader;
        int length = i2 - snapHeader.length();
        if (length > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, EtherType.class).newInstance(bArr, snapHeader.length() + i, length, snapHeader.getProtocolId());
        } else {
            this.payload = null;
        }
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public SnapHeader getHeader() {
        return this.header;
    }

    private SnapPacket(Builder builder) {
        if (builder != null && builder.oui != null && builder.protocolId != null) {
            this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.header = new SnapHeader(builder);
        } else {
            throw new NullPointerException("builder: " + builder + " builder.oui: " + builder.oui + " builder.protocolId: " + builder.protocolId);
        }
    }
}
