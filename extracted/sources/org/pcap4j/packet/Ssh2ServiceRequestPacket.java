package org.pcap4j.packet;

import defpackage.o40;
import defpackage.rm7;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.namednumber.Ssh2MessageNumber;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Ssh2ServiceRequestPacket extends AbstractPacket {
    private static final long serialVersionUID = 6862963187041604290L;
    private final Ssh2ServiceRequestHeader header;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private Ssh2String serviceName;

        public Builder serviceName(Ssh2String ssh2String) {
            this.serviceName = ssh2String;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Ssh2ServiceRequestPacket build() {
            return new Ssh2ServiceRequestPacket(this);
        }

        private Builder(Ssh2ServiceRequestPacket ssh2ServiceRequestPacket) {
            this.serviceName = ssh2ServiceRequestPacket.header.serviceName;
        }
    }

    public static Ssh2ServiceRequestPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Ssh2ServiceRequestPacket(bArr, i, i2);
    }

    public static final class Ssh2ServiceRequestHeader extends AbstractPacket.AbstractHeader {
        private static final long serialVersionUID = 8957656530972381650L;
        private final Ssh2MessageNumber messageNumber;
        private final Ssh2String serviceName;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[SSH2 Service Request Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Message Number: ");
            sb.append(this.messageNumber);
            sb.append(property);
            sb.append("  service name: ");
            sb.append(this.serviceName);
            sb.append(property);
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.serviceName.hashCode() + 527;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            return this.serviceName.length() + 1;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (Ssh2ServiceRequestHeader.class.isInstance(obj)) {
                return this.serviceName.equals(((Ssh2ServiceRequestHeader) obj).serviceName);
            }
            return false;
        }

        public Ssh2MessageNumber getMessageNumber() {
            return this.messageNumber;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new byte[]{this.messageNumber.value().byteValue()});
            arrayList.add(this.serviceName.getRawData());
            return arrayList;
        }

        public Ssh2String getServiceName() {
            return this.serviceName;
        }

        private Ssh2ServiceRequestHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            Ssh2MessageNumber ssh2MessageNumber = Ssh2MessageNumber.SSH_MSG_SERVICE_REQUEST;
            this.messageNumber = ssh2MessageNumber;
            if (i2 >= 5) {
                if (Ssh2MessageNumber.getInstance(Byte.valueOf(bArr[i])).equals(ssh2MessageNumber)) {
                    this.serviceName = new Ssh2String(bArr, i + 1, i2 - 1);
                    return;
                }
                StringBuilder sbA = o40.A(120, "The data is not an SSH2 Service Request message. data: ");
                rm7.u(i, ", offset: ", ", length: ", sbA, bArr);
                sbA.append(i2);
                throw new IllegalRawDataException(sbA.toString());
            }
            StringBuilder sbA2 = o40.A(80, "The data is too short to build an SSH2 Service Request header. data: ");
            rm7.u(i, ", offset: ", ", length: ", sbA2, bArr);
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }

        private Ssh2ServiceRequestHeader(Builder builder) {
            this.messageNumber = Ssh2MessageNumber.SSH_MSG_SERVICE_REQUEST;
            this.serviceName = builder.serviceName;
        }
    }

    private Ssh2ServiceRequestPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.header = new Ssh2ServiceRequestHeader(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Ssh2ServiceRequestHeader getHeader() {
        return this.header;
    }

    private Ssh2ServiceRequestPacket(Builder builder) {
        if (builder != null && builder.serviceName != null) {
            this.header = new Ssh2ServiceRequestHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.serviceName: " + builder.serviceName);
    }
}
