package org.pcap4j.packet;

import defpackage.o40;
import defpackage.rm7;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.namednumber.Ssh2MessageNumber;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Ssh2DebugPacket extends AbstractPacket {
    private static final long serialVersionUID = 2146867728898738559L;
    private final Ssh2DebugHeader header;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private Ssh2Boolean alwaysDisplay;
        private Ssh2String languageTag;
        private Ssh2String message;

        public Builder alwaysDisplay(Ssh2Boolean ssh2Boolean) {
            this.alwaysDisplay = ssh2Boolean;
            return this;
        }

        public Builder languageTag(Ssh2String ssh2String) {
            this.languageTag = ssh2String;
            return this;
        }

        public Builder message(Ssh2String ssh2String) {
            this.message = ssh2String;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Ssh2DebugPacket build() {
            return new Ssh2DebugPacket(this);
        }

        private Builder(Ssh2DebugPacket ssh2DebugPacket) {
            this.alwaysDisplay = ssh2DebugPacket.header.alwaysDisplay;
            this.message = ssh2DebugPacket.header.message;
            this.languageTag = ssh2DebugPacket.header.languageTag;
        }
    }

    public static Ssh2DebugPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Ssh2DebugPacket(bArr, i, i2);
    }

    public static final class Ssh2DebugHeader extends AbstractPacket.AbstractHeader {
        private static final long serialVersionUID = 873479096967096846L;
        private final Ssh2Boolean alwaysDisplay;
        private final Ssh2String languageTag;
        private final Ssh2String message;
        private final Ssh2MessageNumber messageNumber;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[SSH2 Debug Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Message Number: ");
            sb.append(this.messageNumber);
            sb.append(property);
            sb.append("  always_display: ");
            sb.append(this.alwaysDisplay);
            sb.append(property);
            sb.append("  message: ");
            sb.append(this.message);
            sb.append(property);
            sb.append("  language tag: ");
            sb.append(this.languageTag);
            sb.append(property);
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.languageTag.hashCode() + ((this.message.hashCode() + ((this.alwaysDisplay.hashCode() + 527) * 31)) * 31);
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
            if (!Ssh2DebugHeader.class.isInstance(obj)) {
                return false;
            }
            Ssh2DebugHeader ssh2DebugHeader = (Ssh2DebugHeader) obj;
            return this.message.equals(ssh2DebugHeader.message) && this.languageTag.equals(ssh2DebugHeader.languageTag) && this.alwaysDisplay.equals(ssh2DebugHeader.alwaysDisplay);
        }

        public Ssh2Boolean getAlwaysDisplay() {
            return this.alwaysDisplay;
        }

        public Ssh2String getLanguageTag() {
            return this.languageTag;
        }

        public Ssh2String getMessage() {
            return this.message;
        }

        public Ssh2MessageNumber getMessageNumber() {
            return this.messageNumber;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new byte[]{this.messageNumber.value().byteValue()});
            arrayList.add(this.alwaysDisplay.getRawData());
            arrayList.add(this.message.getRawData());
            arrayList.add(this.languageTag.getRawData());
            return arrayList;
        }

        private Ssh2DebugHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            Ssh2MessageNumber ssh2MessageNumber = Ssh2MessageNumber.SSH_MSG_DEBUG;
            this.messageNumber = ssh2MessageNumber;
            if (i2 >= 10) {
                if (Ssh2MessageNumber.getInstance(Byte.valueOf(bArr[i])).equals(ssh2MessageNumber)) {
                    int i3 = i + 1;
                    Ssh2Boolean ssh2Boolean = new Ssh2Boolean(bArr, i3);
                    this.alwaysDisplay = ssh2Boolean;
                    int length = ssh2Boolean.length() + i3;
                    int length2 = (i2 - 1) - ssh2Boolean.length();
                    Ssh2String ssh2String = new Ssh2String(bArr, length, length2);
                    this.message = ssh2String;
                    this.languageTag = new Ssh2String(bArr, ssh2String.length() + length, length2 - ssh2String.length());
                    return;
                }
                StringBuilder sbA = o40.A(120, "The data is not an SSH2 Debug message. data: ");
                rm7.u(i, ", offset: ", ", length: ", sbA, bArr);
                sbA.append(i2);
                throw new IllegalRawDataException(sbA.toString());
            }
            StringBuilder sbA2 = o40.A(80, "The data is too short to build an SSH2 Debug header. data: ");
            rm7.u(i, ", offset: ", ", length: ", sbA2, bArr);
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }

        private Ssh2DebugHeader(Builder builder) {
            this.messageNumber = Ssh2MessageNumber.SSH_MSG_DEBUG;
            this.alwaysDisplay = builder.alwaysDisplay;
            this.message = builder.message;
            this.languageTag = builder.languageTag;
        }
    }

    private Ssh2DebugPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.header = new Ssh2DebugHeader(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Ssh2DebugHeader getHeader() {
        return this.header;
    }

    private Ssh2DebugPacket(Builder builder) {
        if (builder != null && builder.alwaysDisplay != null && builder.message != null && builder.languageTag != null) {
            this.header = new Ssh2DebugHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.alwaysDisplay: " + builder.alwaysDisplay + " builder.message: " + builder.message + " builder.languageTag: " + builder.languageTag);
    }
}
