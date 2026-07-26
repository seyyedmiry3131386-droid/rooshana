package org.pcap4j.packet;

import defpackage.o40;
import defpackage.rm7;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.namednumber.Ssh2MessageNumber;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Ssh2IgnorePacket extends AbstractPacket {
    private static final long serialVersionUID = 2975421692356921479L;
    private final Ssh2IgnoreHeader header;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private Ssh2String data;

        public Builder data(Ssh2String ssh2String) {
            this.data = ssh2String;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Ssh2IgnorePacket build() {
            return new Ssh2IgnorePacket(this);
        }

        private Builder(Ssh2IgnorePacket ssh2IgnorePacket) {
            this.data = ssh2IgnorePacket.header.data;
        }
    }

    public static Ssh2IgnorePacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Ssh2IgnorePacket(bArr, i, i2);
    }

    public static final class Ssh2IgnoreHeader extends AbstractPacket.AbstractHeader {
        private static final long serialVersionUID = 5835008308161430239L;
        private final Ssh2String data;
        private final Ssh2MessageNumber messageNumber;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[SSH2 Ignore Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Message Number: ");
            sb.append(this.messageNumber);
            sb.append(property);
            sb.append("  data: ");
            sb.append(this.data);
            sb.append(property);
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.data.hashCode() + 527;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            return this.data.length() + 1;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (Ssh2IgnoreHeader.class.isInstance(obj)) {
                return this.data.equals(((Ssh2IgnoreHeader) obj).data);
            }
            return false;
        }

        public Ssh2String getData() {
            return this.data;
        }

        public Ssh2MessageNumber getMessageNumber() {
            return this.messageNumber;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new byte[]{this.messageNumber.value().byteValue()});
            arrayList.add(this.data.getRawData());
            return arrayList;
        }

        private Ssh2IgnoreHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            Ssh2MessageNumber ssh2MessageNumber = Ssh2MessageNumber.SSH_MSG_IGNORE;
            this.messageNumber = ssh2MessageNumber;
            if (i2 >= 5) {
                if (Ssh2MessageNumber.getInstance(Byte.valueOf(bArr[i])).equals(ssh2MessageNumber)) {
                    this.data = new Ssh2String(bArr, i + 1, i2 - 1);
                    return;
                }
                StringBuilder sbA = o40.A(120, "The data is not an SSH2 Ignore message. data: ");
                rm7.u(i, ", offset: ", ", length: ", sbA, bArr);
                sbA.append(i2);
                throw new IllegalRawDataException(sbA.toString());
            }
            StringBuilder sbA2 = o40.A(80, "The data is too short to build an SSH2 Ignore header. data: ");
            rm7.u(i, ", offset: ", ", length: ", sbA2, bArr);
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }

        private Ssh2IgnoreHeader(Builder builder) {
            this.messageNumber = Ssh2MessageNumber.SSH_MSG_IGNORE;
            this.data = builder.data;
        }
    }

    private Ssh2IgnorePacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.header = new Ssh2IgnoreHeader(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Ssh2IgnoreHeader getHeader() {
        return this.header;
    }

    private Ssh2IgnorePacket(Builder builder) {
        if (builder != null && builder.data != null) {
            this.header = new Ssh2IgnoreHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.data: " + builder.data);
    }
}
