package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import defpackage.t61;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IcmpV4InvokingPacketPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IcmpV4ParameterProblemPacket extends IcmpV4InvokingPacketPacket {
    private static final long serialVersionUID = 5369176981310492220L;
    private final IcmpV4ParameterProblemHeader header;

    public static final class Builder extends IcmpV4InvokingPacketPacket.Builder {
        private byte pointer;
        private int unused;

        public Builder pointer(byte b) {
            this.pointer = b;
            return this;
        }

        public Builder unused(int i) {
            this.unused = i;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV4ParameterProblemPacket build() {
            return new IcmpV4ParameterProblemPacket(this);
        }

        @Override // org.pcap4j.packet.IcmpV4InvokingPacketPacket.Builder
        public Builder payload(Packet packet) {
            super.payload(packet);
            return this;
        }

        private Builder(IcmpV4ParameterProblemPacket icmpV4ParameterProblemPacket) {
            super(icmpV4ParameterProblemPacket);
            this.pointer = icmpV4ParameterProblemPacket.header.pointer;
            this.unused = icmpV4ParameterProblemPacket.header.unused;
        }
    }

    public static IcmpV4ParameterProblemPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        IcmpV4ParameterProblemHeader icmpV4ParameterProblemHeader = new IcmpV4ParameterProblemHeader(bArr, i, i2);
        int length = i2 - icmpV4ParameterProblemHeader.length();
        return length > 0 ? new IcmpV4ParameterProblemPacket(icmpV4ParameterProblemHeader, bArr, icmpV4ParameterProblemHeader.length() + i, length) : new IcmpV4ParameterProblemPacket(icmpV4ParameterProblemHeader);
    }

    @Override // org.pcap4j.packet.IcmpV4InvokingPacketPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public /* bridge */ /* synthetic */ Packet getPayload() {
        return super.getPayload();
    }

    public static final class IcmpV4ParameterProblemHeader extends AbstractPacket.AbstractHeader {
        private static final int ICMPV4_PARAMETER_PROBLEM_HEADER_SIZE = 4;
        private static final int POINTER_AND_UNUSED_OFFSET = 0;
        private static final int POINTER_AND_UNUSED_SIZE = 4;
        private static final long serialVersionUID = 7946304491624744071L;
        private final byte pointer;
        private final int unused;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[ICMPv4 Parameter Problem Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Pointer: ");
            sb.append(getPointerAsInt());
            sb.append(property);
            sb.append("  Unused: ");
            return dw1.k(this.unused, property, sb);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((527 + this.pointer) * 31) + this.unused;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!IcmpV4ParameterProblemHeader.class.isInstance(obj)) {
                return false;
            }
            IcmpV4ParameterProblemHeader icmpV4ParameterProblemHeader = (IcmpV4ParameterProblemHeader) obj;
            return this.pointer == icmpV4ParameterProblemHeader.pointer && this.unused == icmpV4ParameterProblemHeader.unused;
        }

        public byte getPointer() {
            return this.pointer;
        }

        public int getPointerAsInt() {
            return this.pointer & 255;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray((this.pointer << 24) | this.unused));
            return arrayList;
        }

        public int getUnused() {
            return this.unused;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 4;
        }

        private IcmpV4ParameterProblemHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 4) {
                int i3 = ByteArrays.getInt(bArr, i);
                this.pointer = (byte) (i3 >>> 24);
                this.unused = i3 & 16777215;
            } else {
                StringBuilder sbA = o40.A(80, "The data is too short to build an ICMPv4 Parameter Problem Header(4 bytes). data: ");
                t61.t(i, " ", ", offset: ", sbA, bArr);
                sbA.append(", length: ");
                sbA.append(i2);
                throw new IllegalRawDataException(sbA.toString());
            }
        }

        private IcmpV4ParameterProblemHeader(Builder builder) {
            if ((builder.unused & (-16777216)) == 0) {
                this.pointer = builder.pointer;
                this.unused = builder.unused;
            } else {
                throw new IllegalArgumentException("Invalid unused: " + builder.unused);
            }
        }
    }

    private IcmpV4ParameterProblemPacket(IcmpV4ParameterProblemHeader icmpV4ParameterProblemHeader) {
        this.header = icmpV4ParameterProblemHeader;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV4ParameterProblemHeader getHeader() {
        return this.header;
    }

    private IcmpV4ParameterProblemPacket(IcmpV4ParameterProblemHeader icmpV4ParameterProblemHeader, byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
        this.header = icmpV4ParameterProblemHeader;
    }

    private IcmpV4ParameterProblemPacket(Builder builder) {
        super(builder);
        this.header = new IcmpV4ParameterProblemHeader(builder);
    }
}
