package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import defpackage.t61;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.Ssh2MessageNumber;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Ssh2BinaryPacket extends AbstractPacket {
    private static final long serialVersionUID = 6484755289384336675L;
    private final Ssh2BinaryHeader header;
    private final byte[] mac;
    private final Packet payload;
    private final byte[] randomPadding;

    public static final class Builder extends AbstractPacket.AbstractBuilder implements LengthBuilder<Ssh2BinaryPacket> {
        private int cipherBlockSize;
        private boolean correctLengthAtBuild;
        private byte[] mac;
        private int packetLength;
        private boolean paddingAtBuild;
        private byte paddingLength;
        private Packet.Builder payloadBuilder;
        private byte[] randomPadding;

        public Builder cipherBlockSize(int i) {
            this.cipherBlockSize = i;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder mac(byte[] bArr) {
            this.mac = bArr;
            return this;
        }

        public Builder packetLength(int i) {
            this.packetLength = i;
            return this;
        }

        public Builder paddingAtBuild(boolean z) {
            this.paddingAtBuild = z;
            return this;
        }

        public Builder paddingLength(byte b) {
            this.paddingLength = b;
            return this;
        }

        public Builder randomPadding(byte[] bArr) {
            this.randomPadding = bArr;
            return this;
        }

        public Builder() {
            this.cipherBlockSize = 0;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<Ssh2BinaryPacket> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Ssh2BinaryPacket build() {
            return new Ssh2BinaryPacket(this);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }

        private Builder(Ssh2BinaryPacket ssh2BinaryPacket) {
            this.cipherBlockSize = 0;
            this.packetLength = ssh2BinaryPacket.header.packetLength;
            this.paddingLength = ssh2BinaryPacket.header.paddingLength;
            this.payloadBuilder = ssh2BinaryPacket.payload != null ? ssh2BinaryPacket.payload.getBuilder() : null;
            this.randomPadding = ssh2BinaryPacket.randomPadding;
            this.mac = ssh2BinaryPacket.mac;
        }
    }

    public static Ssh2BinaryPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Ssh2BinaryPacket(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public byte[] buildRawData() {
        byte[] bArrBuildRawData = super.buildRawData();
        byte[] bArr = this.randomPadding;
        if (bArr.length != 0) {
            System.arraycopy(bArr, 0, bArrBuildRawData, (bArrBuildRawData.length - bArr.length) - this.mac.length, bArr.length);
        }
        byte[] bArr2 = this.mac;
        if (bArr2.length != 0) {
            System.arraycopy(bArr2, 0, bArrBuildRawData, bArrBuildRawData.length - bArr2.length, bArr2.length);
        }
        return bArrBuildRawData;
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public String buildString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.header.toString());
        Packet packet = this.payload;
        if (packet != null) {
            sb.append(packet.toString());
        }
        if (this.randomPadding.length != 0) {
            String property = System.getProperty("line.separator");
            sb.append("[random padding (");
            sb.append(this.randomPadding.length);
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Hex stream: ");
            sb.append(ByteArrays.toHexString(this.randomPadding, " "));
            sb.append(property);
        }
        if (this.mac.length != 0) {
            String property2 = System.getProperty("line.separator");
            sb.append("[mac (");
            sb.append(this.mac.length);
            sb.append(" bytes)]");
            sb.append(property2);
            sb.append("  Hex stream: ");
            sb.append(ByteArrays.toHexString(this.mac, " "));
            sb.append(property2);
        }
        return sb.toString();
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public int calcHashCode() {
        return Arrays.hashCode(this.mac) + ((Arrays.hashCode(this.randomPadding) + (super.calcHashCode() * 31)) * 31);
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public int calcLength() {
        return super.calcLength() + this.randomPadding.length + this.mac.length;
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            Ssh2BinaryPacket ssh2BinaryPacket = (Ssh2BinaryPacket) obj;
            if (Arrays.equals(this.randomPadding, ssh2BinaryPacket.randomPadding) && Arrays.equals(this.mac, ssh2BinaryPacket.mac)) {
                return true;
            }
        }
        return false;
    }

    public byte[] getMac() {
        byte[] bArr = this.mac;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public byte[] getRandomPadding() {
        byte[] bArr = this.randomPadding;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static final class Ssh2BinaryHeader extends AbstractPacket.AbstractHeader {
        private static final int PACKET_LENGTH_OFFSET = 0;
        private static final int PACKET_LENGTH_SIZE = 4;
        private static final int PADDING_LENGTH_OFFSET = 4;
        private static final int PADDING_LENGTH_SIZE = 1;
        private static final int SSH2_BINARY_HEADER_SIZE = 5;
        private static final long serialVersionUID = -7927092563030949527L;
        private final int packetLength;
        private final byte paddingLength;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[SSH2 Binary Packet Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  packet_length: ");
            sb.append(this.packetLength);
            sb.append(property);
            sb.append("  padding_length: ");
            return dw1.k(this.paddingLength, property, sb);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((527 + this.packetLength) * 31) + this.paddingLength;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!Ssh2BinaryHeader.class.isInstance(obj)) {
                return false;
            }
            Ssh2BinaryHeader ssh2BinaryHeader = (Ssh2BinaryHeader) obj;
            return this.packetLength == ssh2BinaryHeader.packetLength && this.paddingLength == ssh2BinaryHeader.paddingLength;
        }

        public int getPacketLength() {
            return this.packetLength;
        }

        public long getPacketLengthAsLong() {
            return ((long) this.packetLength) & 4294967295L;
        }

        public byte getPaddingLength() {
            return this.paddingLength;
        }

        public int getPaddingLengthAsInt() {
            return this.paddingLength & 255;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.packetLength));
            arrayList.add(ByteArrays.toByteArray(this.paddingLength));
            return arrayList;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 5;
        }

        private Ssh2BinaryHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 5) {
                int i3 = ByteArrays.getInt(bArr, i);
                this.packetLength = i3;
                this.paddingLength = ByteArrays.getByte(bArr, i + 4);
                if (i3 >= 0) {
                    return;
                }
                StringBuilder sbA = o40.A(120, "The packet length which is longer than 2147483647 is not supported. packet length: ");
                sbA.append(getPacketLengthAsLong());
                throw new IllegalRawDataException(sbA.toString());
            }
            StringBuilder sbA2 = o40.A(100, "The data is too short to build an SSH2 Binary header(5 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA2, bArr);
            sbA2.append(", length: ");
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }

        private Ssh2BinaryHeader(Builder builder, int i, byte b) {
            if (!builder.correctLengthAtBuild) {
                this.packetLength = builder.packetLength;
                this.paddingLength = builder.paddingLength;
            } else {
                this.packetLength = i;
                this.paddingLength = b;
            }
            if (this.packetLength >= 0) {
                return;
            }
            StringBuilder sbA = o40.A(120, "The packet length which is longer than 2147483647 is not supported. packet length: ");
            sbA.append(((long) builder.packetLength) & 4294967295L);
            throw new IllegalArgumentException(sbA.toString());
        }
    }

    private Ssh2BinaryPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        Ssh2BinaryHeader ssh2BinaryHeader = new Ssh2BinaryHeader(bArr, i, i2);
        this.header = ssh2BinaryHeader;
        int packetLength = (ssh2BinaryHeader.getPacketLength() - ssh2BinaryHeader.getPaddingLengthAsInt()) - 1;
        if (packetLength < 0 || packetLength > i2 - 5) {
            StringBuilder sb = new StringBuilder(100);
            sb.append("rawData is too short. rawData length: ");
            sb.append(i2);
            sb.append(", header.getPacketLength(): ");
            sb.append(ssh2BinaryHeader.getPacketLength());
            sb.append(", header.getPaddingLengthAsInt(): ");
            sb.append(ssh2BinaryHeader.getPaddingLengthAsInt());
            throw new IllegalRawDataException(sb.toString());
        }
        int i3 = i + 5;
        if (packetLength > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, Ssh2MessageNumber.class).newInstance(bArr, i3, packetLength, Ssh2MessageNumber.getInstance(Byte.valueOf(bArr[i3])));
        } else {
            this.payload = null;
        }
        int i4 = i3 + packetLength;
        try {
            byte[] subArray = ByteArrays.getSubArray(bArr, i4, ssh2BinaryHeader.getPaddingLength());
            this.randomPadding = subArray;
            this.mac = ByteArrays.getSubArray(bArr, i4 + subArray.length);
        } catch (Exception e) {
            throw new IllegalRawDataException(e);
        }
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Ssh2BinaryHeader getHeader() {
        return this.header;
    }

    private Ssh2BinaryPacket(Builder builder) {
        if (builder != null && builder.randomPadding != null && builder.mac != null) {
            if (builder.paddingAtBuild || builder.randomPadding != null) {
                Packet packetBuild = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
                this.payload = packetBuild;
                int length = packetBuild != null ? packetBuild.length() : 0;
                if (!builder.paddingAtBuild) {
                    byte[] bArr = new byte[builder.randomPadding.length];
                    this.randomPadding = bArr;
                    System.arraycopy(builder.randomPadding, 0, bArr, 0, builder.randomPadding.length);
                } else {
                    this.randomPadding = new byte[length % (builder.cipherBlockSize > 8 ? builder.cipherBlockSize : 8)];
                }
                this.header = new Ssh2BinaryHeader(builder, length, (byte) this.randomPadding.length);
                byte[] bArr2 = new byte[builder.mac.length];
                this.mac = bArr2;
                System.arraycopy(builder.mac, 0, bArr2, 0, builder.mac.length);
                return;
            }
            throw new NullPointerException("builder.randomPadding must not be null if builder.paddingAtBuild is false");
        }
        throw new NullPointerException("builder: " + builder + " builder.randomPadding: " + builder.randomPadding + " builder.mac: " + builder.mac);
    }
}
