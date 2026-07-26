package org.pcap4j.packet;

import defpackage.o40;
import defpackage.rm7;
import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.Ssh2MessageNumber;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Ssh2NewKeysPacket extends AbstractPacket {
    private static final Ssh2NewKeysPacket INSTANCE = new Ssh2NewKeysPacket();
    private static final long serialVersionUID = -4355029035065046101L;
    private final Ssh2NewKeysHeader header = Ssh2NewKeysHeader.getInstance();

    public static final class Ssh2NewKeysHeader extends AbstractPacket.AbstractHeader {
        private static final Ssh2NewKeysHeader INSTANCE = new Ssh2NewKeysHeader();
        private static final long serialVersionUID = -6964593795610286838L;
        private final Ssh2MessageNumber messageNumber = Ssh2MessageNumber.SSH_MSG_NEWKEYS;

        private Ssh2NewKeysHeader() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void checkRawData(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 < 1) {
                StringBuilder sbA = o40.A(120, "The data is too short to build an SSH2 New Keys header. data: ");
                rm7.u(i, ", offset: ", ", length: ", sbA, bArr);
                sbA.append(i2);
                throw new IllegalRawDataException(sbA.toString());
            }
            if (Ssh2MessageNumber.getInstance(Byte.valueOf(bArr[i])).equals(Ssh2MessageNumber.SSH_MSG_KEXINIT)) {
                return;
            }
            StringBuilder sbA2 = o40.A(120, "The data is not an SSH2 New Keys message. data: ");
            rm7.u(i, ", offset: ", ", length: ", sbA2, bArr);
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Ssh2NewKeysHeader getInstance() {
            return INSTANCE;
        }

        private Object readResolve() throws ObjectStreamException {
            return INSTANCE;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[SSH2 New Keys Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Message Number: ");
            sb.append(this.messageNumber);
            sb.append(property);
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            return equals(obj);
        }

        public Ssh2MessageNumber getMessageNumber() {
            return this.messageNumber;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new byte[]{this.messageNumber.value().byteValue()});
            return arrayList;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 1;
        }
    }

    private Ssh2NewKeysPacket() {
    }

    public static Ssh2NewKeysPacket getInstance() {
        return INSTANCE;
    }

    public static Ssh2NewKeysPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        Ssh2NewKeysHeader.checkRawData(bArr, i, i2);
        return INSTANCE;
    }

    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public int calcHashCode() {
        return hashCode();
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public boolean equals(Object obj) {
        return equals(obj);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet.Builder getBuilder() {
        throw new UnsupportedOperationException();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Ssh2NewKeysHeader getHeader() {
        return this.header;
    }
}
