package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import defpackage.t61;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IcmpV6InvokingPacketPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IcmpV6ParameterProblemPacket extends IcmpV6InvokingPacketPacket {
    private static final long serialVersionUID = -7613453030792043352L;
    private final IcmpV6ParameterProblemHeader header;

    public static final class Builder extends IcmpV6InvokingPacketPacket.Builder {
        private int pointer;

        public Builder pointer(int i) {
            this.pointer = i;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV6ParameterProblemPacket build() {
            return new IcmpV6ParameterProblemPacket(this);
        }

        @Override // org.pcap4j.packet.IcmpV6InvokingPacketPacket.Builder
        public Builder payload(Packet packet) {
            super.payload(packet);
            return this;
        }

        private Builder(IcmpV6ParameterProblemPacket icmpV6ParameterProblemPacket) {
            super(icmpV6ParameterProblemPacket);
            this.pointer = icmpV6ParameterProblemPacket.getHeader().pointer;
        }
    }

    public static IcmpV6ParameterProblemPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        IcmpV6ParameterProblemHeader icmpV6ParameterProblemHeader = new IcmpV6ParameterProblemHeader(bArr, i, i2);
        int length = i2 - icmpV6ParameterProblemHeader.length();
        return length > 0 ? new IcmpV6ParameterProblemPacket(icmpV6ParameterProblemHeader, bArr, icmpV6ParameterProblemHeader.length() + i, length) : new IcmpV6ParameterProblemPacket(icmpV6ParameterProblemHeader);
    }

    @Override // org.pcap4j.packet.IcmpV6InvokingPacketPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public /* bridge */ /* synthetic */ Packet getPayload() {
        return super.getPayload();
    }

    public static final class IcmpV6ParameterProblemHeader extends AbstractPacket.AbstractHeader {
        private static final int ICMPV6_PARAMETER_PROBLEM_HEADER_SIZE = 4;
        private static final int POINTER_OFFSET = 0;
        private static final int POINTER_SIZE = 4;
        private static final long serialVersionUID = -3743068221589212767L;
        private final int pointer;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[ICMPv6 Parameter Problem Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Pointer: ");
            return dw1.k(this.pointer, property, sb);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return 527 + this.pointer;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return IcmpV6ParameterProblemHeader.class.isInstance(obj) && this.pointer == ((IcmpV6ParameterProblemHeader) obj).pointer;
        }

        public int getPointer() {
            return this.pointer;
        }

        public long getPointerAsLong() {
            return ((long) this.pointer) & 4294967295L;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.pointer));
            return arrayList;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 4;
        }

        private IcmpV6ParameterProblemHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 4) {
                this.pointer = ByteArrays.getInt(bArr, i);
                return;
            }
            StringBuilder sbA = o40.A(80, "The data is too short to build an ICMPv6 Parameter Problem Header(4 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }

        private IcmpV6ParameterProblemHeader(Builder builder) {
            this.pointer = builder.pointer;
        }
    }

    private IcmpV6ParameterProblemPacket(IcmpV6ParameterProblemHeader icmpV6ParameterProblemHeader) {
        this.header = icmpV6ParameterProblemHeader;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6ParameterProblemHeader getHeader() {
        return this.header;
    }

    private IcmpV6ParameterProblemPacket(IcmpV6ParameterProblemHeader icmpV6ParameterProblemHeader, byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
        this.header = icmpV6ParameterProblemHeader;
    }

    private IcmpV6ParameterProblemPacket(Builder builder) {
        super(builder);
        this.header = new IcmpV6ParameterProblemHeader(builder);
    }
}
