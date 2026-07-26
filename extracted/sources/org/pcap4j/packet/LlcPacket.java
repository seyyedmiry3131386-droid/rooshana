package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.LlcNumber;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class LlcPacket extends AbstractPacket {
    private static final long serialVersionUID = -4394376906462242290L;
    private final LlcHeader header;
    private final Packet payload;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private LlcControl control;
        private LlcNumber dsap;
        private Packet.Builder payloadBuilder;
        private LlcNumber ssap;

        public Builder control(LlcControl llcControl) {
            this.control = llcControl;
            return this;
        }

        public Builder dsap(LlcNumber llcNumber) {
            this.dsap = llcNumber;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder ssap(LlcNumber llcNumber) {
            this.ssap = llcNumber;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public LlcPacket build() {
            return new LlcPacket(this);
        }

        private Builder(LlcPacket llcPacket) {
            this.dsap = llcPacket.header.dsap;
            this.ssap = llcPacket.header.ssap;
            this.control = llcPacket.header.control;
            this.payloadBuilder = llcPacket.payload != null ? llcPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }
    }

    public interface LlcControl extends Serializable {
        byte[] getRawData();

        int length();
    }

    public static LlcPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new LlcPacket(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public static final class LlcHeader extends AbstractPacket.AbstractHeader {
        private static final int CONTROL_OFFSET = 2;
        private static final int DSAP_OFFSET = 0;
        private static final int DSAP_SIZE = 1;
        private static final int SSAP_OFFSET = 1;
        private static final int SSAP_SIZE = 1;
        private static final long serialVersionUID = -6228127495653535606L;
        private final LlcControl control;
        private final LlcNumber dsap;
        private final LlcNumber ssap;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[Logical Link Control header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  DSAP: ");
            sb.append(this.dsap);
            sb.append(property);
            sb.append("  SSAP: ");
            sb.append(this.ssap);
            sb.append(property);
            sb.append("  Control: ");
            sb.append(this.control);
            sb.append(property);
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.control.hashCode() + ((this.ssap.hashCode() + ((this.dsap.hashCode() + 527) * 31)) * 31);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            return this.control.length() + 2;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!LlcHeader.class.isInstance(obj)) {
                return false;
            }
            LlcHeader llcHeader = (LlcHeader) obj;
            return this.dsap.equals(llcHeader.dsap) && this.control.equals(llcHeader.control) && this.ssap.equals(llcHeader.ssap);
        }

        public LlcControl getControl() {
            return this.control;
        }

        public LlcNumber getDsap() {
            return this.dsap;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.dsap.value().byteValue()));
            arrayList.add(ByteArrays.toByteArray(this.ssap.value().byteValue()));
            arrayList.add(this.control.getRawData());
            return arrayList;
        }

        public LlcNumber getSsap() {
            return this.ssap;
        }

        private LlcHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 3) {
                this.dsap = LlcNumber.getInstance(Byte.valueOf(bArr[i]));
                this.ssap = LlcNumber.getInstance(Byte.valueOf(bArr[i + 1]));
                int i3 = i + 2;
                byte b = bArr[i3];
                int i4 = b & 3;
                if (i4 == 3) {
                    this.control = LlcControlUnnumbered.newInstance(b);
                    return;
                }
                if (i2 >= 4) {
                    if (i4 == 1) {
                        this.control = LlcControlSupervisory.newInstance(ByteArrays.getShort(bArr, i3));
                        return;
                    } else {
                        this.control = LlcControlInformation.newInstance(ByteArrays.getShort(bArr, i3));
                        return;
                    }
                }
                StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build an LLC header(4 bytes). data: ");
                t61.t(i, " ", ", offset: ", sbA, bArr);
                sbA.append(", length: ");
                sbA.append(i2);
                throw new IllegalRawDataException(sbA.toString());
            }
            StringBuilder sbA2 = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build an LLC header(3 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA2, bArr);
            sbA2.append(", length: ");
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }

        private LlcHeader(Builder builder) {
            this.dsap = builder.dsap;
            this.ssap = builder.ssap;
            this.control = builder.control;
        }
    }

    private LlcPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        LlcHeader llcHeader = new LlcHeader(bArr, i, i2);
        this.header = llcHeader;
        int length = i2 - llcHeader.length();
        if (length > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, LlcNumber.class).newInstance(bArr, llcHeader.length() + i, length, llcHeader.getDsap());
        } else {
            this.payload = null;
        }
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public LlcHeader getHeader() {
        return this.header;
    }

    private LlcPacket(Builder builder) {
        if (builder != null && builder.dsap != null && builder.ssap != null && builder.control != null) {
            this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.header = new LlcHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.dsap: " + builder.dsap + " builder.ssap: " + builder.ssap + " builder.control: " + builder.control);
    }
}
