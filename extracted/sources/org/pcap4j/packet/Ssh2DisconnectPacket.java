package org.pcap4j.packet;

import defpackage.o40;
import defpackage.rm7;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.namednumber.Ssh2DisconnectionReasonCode;
import org.pcap4j.packet.namednumber.Ssh2MessageNumber;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Ssh2DisconnectPacket extends AbstractPacket {
    private static final long serialVersionUID = -1484749154591150073L;
    private final Ssh2DisconnectHeader header;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private Ssh2String description;
        private Ssh2String languageTag;
        private Ssh2DisconnectionReasonCode reasonCode;

        public Builder description(Ssh2String ssh2String) {
            this.description = ssh2String;
            return this;
        }

        public Builder languageTag(Ssh2String ssh2String) {
            this.languageTag = ssh2String;
            return this;
        }

        public Builder reasonCode(Ssh2DisconnectionReasonCode ssh2DisconnectionReasonCode) {
            this.reasonCode = ssh2DisconnectionReasonCode;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Ssh2DisconnectPacket build() {
            return new Ssh2DisconnectPacket(this);
        }

        private Builder(Ssh2DisconnectPacket ssh2DisconnectPacket) {
            this.reasonCode = ssh2DisconnectPacket.header.reasonCode;
            this.description = ssh2DisconnectPacket.header.description;
            this.languageTag = ssh2DisconnectPacket.header.languageTag;
        }
    }

    public static Ssh2DisconnectPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Ssh2DisconnectPacket(bArr, i, i2);
    }

    public static final class Ssh2DisconnectHeader extends AbstractPacket.AbstractHeader {
        private static final long serialVersionUID = 873479096967096846L;
        private final Ssh2String description;
        private final Ssh2String languageTag;
        private final Ssh2MessageNumber messageNumber;
        private final Ssh2DisconnectionReasonCode reasonCode;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[SSH2 Disconnect Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Message Number: ");
            sb.append(this.messageNumber);
            sb.append(property);
            sb.append("  reason code: ");
            sb.append(this.reasonCode);
            sb.append(property);
            sb.append("  description: ");
            sb.append(this.description);
            sb.append(property);
            sb.append("  language tag: ");
            sb.append(this.languageTag);
            sb.append(property);
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.languageTag.hashCode() + ((this.description.hashCode() + ((this.reasonCode.hashCode() + 527) * 31)) * 31);
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
            if (!Ssh2DisconnectHeader.class.isInstance(obj)) {
                return false;
            }
            Ssh2DisconnectHeader ssh2DisconnectHeader = (Ssh2DisconnectHeader) obj;
            return this.reasonCode.equals(ssh2DisconnectHeader.reasonCode) && this.description.equals(ssh2DisconnectHeader.description) && this.languageTag.equals(ssh2DisconnectHeader.languageTag);
        }

        public Ssh2String getDescription() {
            return this.description;
        }

        public Ssh2String getLanguageTag() {
            return this.languageTag;
        }

        public Ssh2MessageNumber getMessageNumber() {
            return this.messageNumber;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new byte[]{this.messageNumber.value().byteValue()});
            arrayList.add(ByteArrays.toByteArray(this.reasonCode.value().intValue()));
            arrayList.add(this.description.getRawData());
            arrayList.add(this.languageTag.getRawData());
            return arrayList;
        }

        public Ssh2DisconnectionReasonCode getReasonCode() {
            return this.reasonCode;
        }

        private Ssh2DisconnectHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            Ssh2MessageNumber ssh2MessageNumber = Ssh2MessageNumber.SSH_MSG_DISCONNECT;
            this.messageNumber = ssh2MessageNumber;
            if (i2 >= 13) {
                if (Ssh2MessageNumber.getInstance(Byte.valueOf(bArr[i])).equals(ssh2MessageNumber)) {
                    this.reasonCode = Ssh2DisconnectionReasonCode.getInstance(Integer.valueOf(ByteArrays.getInt(bArr, i + 1)));
                    int i3 = i + 5;
                    int i4 = i2 - 5;
                    Ssh2String ssh2String = new Ssh2String(bArr, i3, i4);
                    this.description = ssh2String;
                    this.languageTag = new Ssh2String(bArr, ssh2String.length() + i3, i4 - ssh2String.length());
                    return;
                }
                StringBuilder sbA = o40.A(120, "The data is not an SSH2 Disconnect message. data: ");
                rm7.u(i, ", offset: ", ", length: ", sbA, bArr);
                sbA.append(i2);
                throw new IllegalRawDataException(sbA.toString());
            }
            StringBuilder sbA2 = o40.A(80, "The data is too short to build an SSH2 Disconnect header. data: ");
            rm7.u(i, ", offset: ", ", length: ", sbA2, bArr);
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }

        private Ssh2DisconnectHeader(Builder builder) {
            this.messageNumber = Ssh2MessageNumber.SSH_MSG_DISCONNECT;
            this.reasonCode = builder.reasonCode;
            this.description = builder.description;
            this.languageTag = builder.languageTag;
        }
    }

    private Ssh2DisconnectPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.header = new Ssh2DisconnectHeader(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Ssh2DisconnectHeader getHeader() {
        return this.header;
    }

    private Ssh2DisconnectPacket(Builder builder) {
        if (builder != null && builder.reasonCode != null && builder.description != null && builder.languageTag != null) {
            this.header = new Ssh2DisconnectHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.reasonCode: " + builder.reasonCode + " builder.description: " + builder.description + " builder.languageTag: " + builder.languageTag);
    }
}
