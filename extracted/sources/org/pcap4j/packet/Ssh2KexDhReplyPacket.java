package org.pcap4j.packet;

import defpackage.o40;
import defpackage.rm7;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.namednumber.Ssh2MessageNumber;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Ssh2KexDhReplyPacket extends AbstractPacket {
    private static final long serialVersionUID = 6507040765944406940L;
    private final Ssh2KexDhReplyHeader header;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private Ssh2MpInt f;
        private Ssh2String k_s;
        private Ssh2String signatureOfH;

        public Builder f(Ssh2MpInt ssh2MpInt) {
            this.f = ssh2MpInt;
            return this;
        }

        public Builder k_s(Ssh2String ssh2String) {
            this.k_s = ssh2String;
            return this;
        }

        public Builder signatureOfH(Ssh2String ssh2String) {
            this.signatureOfH = ssh2String;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Ssh2KexDhReplyPacket build() {
            return new Ssh2KexDhReplyPacket(this);
        }

        private Builder(Ssh2KexDhReplyPacket ssh2KexDhReplyPacket) {
            this.k_s = ssh2KexDhReplyPacket.header.k_s;
            this.f = ssh2KexDhReplyPacket.header.f;
            this.signatureOfH = ssh2KexDhReplyPacket.header.signatureOfH;
        }
    }

    public static Ssh2KexDhReplyPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Ssh2KexDhReplyPacket(bArr, i, i2);
    }

    public static final class Ssh2KexDhReplyHeader extends AbstractPacket.AbstractHeader {
        private static final long serialVersionUID = 4008432145902117221L;
        private final Ssh2MpInt f;
        private final Ssh2String k_s;
        private final Ssh2MessageNumber messageNumber;
        private final Ssh2String signatureOfH;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[SSH2 KEX DH reply Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Message Number: ");
            sb.append(this.messageNumber);
            sb.append(property);
            sb.append("  K_S: ");
            sb.append(this.k_s);
            sb.append(property);
            sb.append("  f: ");
            sb.append(this.f);
            sb.append(property);
            sb.append("  signature of H: ");
            sb.append(this.signatureOfH);
            sb.append(property);
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.signatureOfH.hashCode() + ((this.f.hashCode() + ((this.k_s.hashCode() + 527) * 31)) * 31);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            return getRawData().length;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!Ssh2KexDhReplyHeader.class.isInstance(obj)) {
                return false;
            }
            Ssh2KexDhReplyHeader ssh2KexDhReplyHeader = (Ssh2KexDhReplyHeader) obj;
            return this.k_s.equals(ssh2KexDhReplyHeader.k_s) && this.f.equals(ssh2KexDhReplyHeader.f) && this.signatureOfH.equals(ssh2KexDhReplyHeader.signatureOfH);
        }

        public Ssh2MpInt getF() {
            return this.f;
        }

        public Ssh2String getK_s() {
            return this.k_s;
        }

        public Ssh2MessageNumber getMessageNumber() {
            return this.messageNumber;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new byte[]{this.messageNumber.value().byteValue()});
            arrayList.add(this.k_s.getRawData());
            arrayList.add(this.f.getRawData());
            arrayList.add(this.signatureOfH.getRawData());
            return arrayList;
        }

        public Ssh2String getSignatureOfH() {
            return this.signatureOfH;
        }

        private Ssh2KexDhReplyHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            Ssh2MessageNumber ssh2MessageNumber = Ssh2MessageNumber.SSH_MSG_KEXDH_REPLY;
            this.messageNumber = ssh2MessageNumber;
            if (i2 >= 13) {
                if (Ssh2MessageNumber.getInstance(Byte.valueOf(bArr[i])).equals(ssh2MessageNumber)) {
                    int i3 = i + 1;
                    int i4 = i2 - 1;
                    Ssh2String ssh2String = new Ssh2String(bArr, i3, i4);
                    this.k_s = ssh2String;
                    int length = ssh2String.length() + i3;
                    int length2 = i4 - ssh2String.length();
                    Ssh2MpInt ssh2MpInt = new Ssh2MpInt(bArr, length, length2);
                    this.f = ssh2MpInt;
                    this.signatureOfH = new Ssh2String(bArr, ssh2MpInt.length() + length, length2 - ssh2MpInt.length());
                    return;
                }
                StringBuilder sbA = o40.A(120, "The data is not an SSH2 KEX DH reply message. data: ");
                rm7.u(i, ", offset: ", ", length: ", sbA, bArr);
                sbA.append(i2);
                throw new IllegalRawDataException(sbA.toString());
            }
            StringBuilder sbA2 = o40.A(80, "The data is too short to build an SSH2 KEX DH reply header. data: ");
            rm7.u(i, ", offset: ", ", length: ", sbA2, bArr);
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }

        private Ssh2KexDhReplyHeader(Builder builder) {
            this.messageNumber = Ssh2MessageNumber.SSH_MSG_KEXDH_REPLY;
            this.k_s = builder.k_s;
            this.f = builder.f;
            this.signatureOfH = builder.signatureOfH;
        }
    }

    private Ssh2KexDhReplyPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.header = new Ssh2KexDhReplyHeader(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Ssh2KexDhReplyHeader getHeader() {
        return this.header;
    }

    private Ssh2KexDhReplyPacket(Builder builder) {
        if (builder != null && builder.k_s != null && builder.f != null && builder.signatureOfH != null) {
            this.header = new Ssh2KexDhReplyHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.k_s: " + builder.k_s + " builder.f: " + builder.f + " builder.signatureOfH: " + builder.signatureOfH);
    }
}
