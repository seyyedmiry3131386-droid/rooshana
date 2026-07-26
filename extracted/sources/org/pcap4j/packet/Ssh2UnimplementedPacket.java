package org.pcap4j.packet;

import defpackage.o40;
import defpackage.rm7;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.namednumber.Ssh2MessageNumber;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Ssh2UnimplementedPacket extends AbstractPacket {
    private static final long serialVersionUID = -8439655903366307992L;
    private final Ssh2UnimplementedHeader header;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private int sequenceNumber;

        public Builder sequenceNumber(int i) {
            this.sequenceNumber = i;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Ssh2UnimplementedPacket build() {
            return new Ssh2UnimplementedPacket(this);
        }

        private Builder(Ssh2UnimplementedPacket ssh2UnimplementedPacket) {
            this.sequenceNumber = ssh2UnimplementedPacket.header.sequenceNumber;
        }
    }

    public static Ssh2UnimplementedPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Ssh2UnimplementedPacket(bArr, i, i2);
    }

    public static final class Ssh2UnimplementedHeader extends AbstractPacket.AbstractHeader {
        private static final long serialVersionUID = 1942311282988657234L;
        private final Ssh2MessageNumber messageNumber;
        private final int sequenceNumber;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[SSH2 Unimplemented Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Message Number: ");
            sb.append(this.messageNumber);
            sb.append(property);
            sb.append("  packet sequence number: ");
            sb.append(getSequenceNumberAsLong());
            sb.append(property);
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return 527 + this.sequenceNumber;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return Ssh2UnimplementedHeader.class.isInstance(obj) && this.sequenceNumber == ((Ssh2UnimplementedHeader) obj).sequenceNumber;
        }

        public Ssh2MessageNumber getMessageNumber() {
            return this.messageNumber;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new byte[]{this.messageNumber.value().byteValue()});
            arrayList.add(ByteArrays.toByteArray(this.sequenceNumber));
            return arrayList;
        }

        public int getSequenceNumber() {
            return this.sequenceNumber;
        }

        public long getSequenceNumberAsLong() {
            return ((long) this.sequenceNumber) & 4294967295L;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 5;
        }

        private Ssh2UnimplementedHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            Ssh2MessageNumber ssh2MessageNumber = Ssh2MessageNumber.SSH_MSG_UNIMPLEMENTED;
            this.messageNumber = ssh2MessageNumber;
            if (i2 >= 5) {
                if (Ssh2MessageNumber.getInstance(Byte.valueOf(bArr[i])).equals(ssh2MessageNumber)) {
                    this.sequenceNumber = ByteArrays.getInt(bArr, i + 1);
                    return;
                }
                StringBuilder sbA = o40.A(120, "The data is not an SSH2 Unimplemented message. data: ");
                rm7.u(i, ", offset: ", ", length: ", sbA, bArr);
                sbA.append(i2);
                throw new IllegalRawDataException(sbA.toString());
            }
            StringBuilder sbA2 = o40.A(80, "The data is too short to build an SSH2 Unimplemented header. data: ");
            rm7.u(i, ", offset: ", ", length: ", sbA2, bArr);
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }

        private Ssh2UnimplementedHeader(Builder builder) {
            this.messageNumber = Ssh2MessageNumber.SSH_MSG_UNIMPLEMENTED;
            this.sequenceNumber = builder.sequenceNumber;
        }
    }

    private Ssh2UnimplementedPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.header = new Ssh2UnimplementedHeader(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Ssh2UnimplementedHeader getHeader() {
        return this.header;
    }

    private Ssh2UnimplementedPacket(Builder builder) {
        if (builder != null) {
            this.header = new Ssh2UnimplementedHeader(builder);
        } else {
            throw new NullPointerException("builder: " + builder);
        }
    }
}
