package org.pcap4j.packet;

import defpackage.o40;
import defpackage.rm7;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.namednumber.Ssh2MessageNumber;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Ssh2KexDhInitPacket extends AbstractPacket {
    private static final long serialVersionUID = -2349107611011582180L;
    private final Ssh2KexDhInitHeader header;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private Ssh2MpInt e;

        public Builder e(Ssh2MpInt ssh2MpInt) {
            this.e = ssh2MpInt;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Ssh2KexDhInitPacket build() {
            return new Ssh2KexDhInitPacket(this);
        }

        private Builder(Ssh2KexDhInitPacket ssh2KexDhInitPacket) {
            this.e = ssh2KexDhInitPacket.header.e;
        }
    }

    public static Ssh2KexDhInitPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Ssh2KexDhInitPacket(bArr, i, i2);
    }

    public static final class Ssh2KexDhInitHeader extends AbstractPacket.AbstractHeader {
        private static final long serialVersionUID = 4008432145902117221L;
        private final Ssh2MpInt e;
        private final Ssh2MessageNumber messageNumber;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[SSH2 KEX DH init Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Message Number: ");
            sb.append(this.messageNumber);
            sb.append(property);
            sb.append("  e: ");
            sb.append(this.e);
            sb.append(property);
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.e.hashCode() + 527;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            return this.e.length() + 1;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (Ssh2KexDhInitHeader.class.isInstance(obj)) {
                return this.e.equals(((Ssh2KexDhInitHeader) obj).e);
            }
            return false;
        }

        public Ssh2MpInt getE() {
            return this.e;
        }

        public Ssh2MessageNumber getMessageNumber() {
            return this.messageNumber;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new byte[]{this.messageNumber.value().byteValue()});
            arrayList.add(this.e.getRawData());
            return arrayList;
        }

        private Ssh2KexDhInitHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            Ssh2MessageNumber ssh2MessageNumber = Ssh2MessageNumber.SSH_MSG_KEXDH_INIT;
            this.messageNumber = ssh2MessageNumber;
            if (i2 >= 5) {
                if (Ssh2MessageNumber.getInstance(Byte.valueOf(bArr[i])).equals(ssh2MessageNumber)) {
                    this.e = new Ssh2MpInt(bArr, i + 1, i2 - 1);
                    return;
                }
                StringBuilder sbA = o40.A(120, "The data is not an SSH2 KEX DH init message. data: ");
                rm7.u(i, ", offset: ", ", length: ", sbA, bArr);
                sbA.append(i2);
                throw new IllegalRawDataException(sbA.toString());
            }
            StringBuilder sbA2 = o40.A(80, "The data is too short to build an SSH2 KEX DH init header. data: ");
            rm7.u(i, ", offset: ", ", length: ", sbA2, bArr);
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }

        private Ssh2KexDhInitHeader(Builder builder) {
            this.messageNumber = Ssh2MessageNumber.SSH_MSG_KEXDH_INIT;
            this.e = builder.e;
        }
    }

    private Ssh2KexDhInitPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.header = new Ssh2KexDhInitHeader(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Ssh2KexDhInitHeader getHeader() {
        return this.header;
    }

    private Ssh2KexDhInitPacket(Builder builder) {
        if (builder != null && builder.e != null) {
            this.header = new Ssh2KexDhInitHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.e: " + builder.e);
    }
}
