package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.io.Serializable;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.TransportPacket;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.TcpOptionKind;
import org.pcap4j.packet.namednumber.TcpPort;
import org.pcap4j.util.ByteArrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class TcpPacket extends AbstractPacket implements TransportPacket {
    private static final long serialVersionUID = 7904566782140471299L;
    private final TcpHeader header;
    private final Packet payload;

    public static final class Builder extends AbstractPacket.AbstractBuilder implements LengthBuilder<TcpPacket>, ChecksumBuilder<TcpPacket> {
        private boolean ack;
        private int acknowledgmentNumber;
        private short checksum;
        private boolean correctChecksumAtBuild;
        private boolean correctLengthAtBuild;
        private byte dataOffset;
        private InetAddress dstAddr;
        private TcpPort dstPort;
        private boolean fin;
        private List<TcpOption> options;
        private byte[] padding;
        private boolean paddingAtBuild;
        private Packet.Builder payloadBuilder;
        private boolean psh;
        private byte reserved;
        private boolean rst;
        private int sequenceNumber;
        private InetAddress srcAddr;
        private TcpPort srcPort;
        private boolean syn;
        private boolean urg;
        private short urgentPointer;
        private short window;

        public Builder() {
        }

        public Builder ack(boolean z) {
            this.ack = z;
            return this;
        }

        public Builder acknowledgmentNumber(int i) {
            this.acknowledgmentNumber = i;
            return this;
        }

        public Builder checksum(short s) {
            this.checksum = s;
            return this;
        }

        public Builder dataOffset(byte b) {
            this.dataOffset = b;
            return this;
        }

        public Builder dstAddr(InetAddress inetAddress) {
            this.dstAddr = inetAddress;
            return this;
        }

        public Builder dstPort(TcpPort tcpPort) {
            this.dstPort = tcpPort;
            return this;
        }

        public Builder fin(boolean z) {
            this.fin = z;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder options(List<TcpOption> list) {
            this.options = list;
            return this;
        }

        public Builder padding(byte[] bArr) {
            this.padding = bArr;
            return this;
        }

        public Builder paddingAtBuild(boolean z) {
            this.paddingAtBuild = z;
            return this;
        }

        public Builder psh(boolean z) {
            this.psh = z;
            return this;
        }

        public Builder reserved(byte b) {
            this.reserved = b;
            return this;
        }

        public Builder rst(boolean z) {
            this.rst = z;
            return this;
        }

        public Builder sequenceNumber(int i) {
            this.sequenceNumber = i;
            return this;
        }

        public Builder srcAddr(InetAddress inetAddress) {
            this.srcAddr = inetAddress;
            return this;
        }

        public Builder srcPort(TcpPort tcpPort) {
            this.srcPort = tcpPort;
            return this;
        }

        public Builder syn(boolean z) {
            this.syn = z;
            return this;
        }

        public Builder urg(boolean z) {
            this.urg = z;
            return this;
        }

        public Builder urgentPointer(short s) {
            this.urgentPointer = s;
            return this;
        }

        public Builder window(short s) {
            this.window = s;
            return this;
        }

        public Builder(TcpPacket tcpPacket) {
            this.srcPort = tcpPacket.header.srcPort;
            this.dstPort = tcpPacket.header.dstPort;
            this.sequenceNumber = tcpPacket.header.sequenceNumber;
            this.acknowledgmentNumber = tcpPacket.header.acknowledgmentNumber;
            this.dataOffset = tcpPacket.header.dataOffset;
            this.reserved = tcpPacket.header.reserved;
            this.urg = tcpPacket.header.urg;
            this.ack = tcpPacket.header.ack;
            this.psh = tcpPacket.header.psh;
            this.rst = tcpPacket.header.rst;
            this.syn = tcpPacket.header.syn;
            this.fin = tcpPacket.header.fin;
            this.window = tcpPacket.header.window;
            this.checksum = tcpPacket.header.checksum;
            this.urgentPointer = tcpPacket.header.urgentPointer;
            this.options = tcpPacket.header.options;
            this.padding = tcpPacket.header.padding;
            this.payloadBuilder = tcpPacket.payload != null ? tcpPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.ChecksumBuilder
        public ChecksumBuilder<TcpPacket> correctChecksumAtBuild(boolean z) {
            this.correctChecksumAtBuild = z;
            return this;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<TcpPacket> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public TcpPacket build() {
            return new TcpPacket(this);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }
    }

    public static final class TcpHeader extends AbstractPacket.AbstractHeader implements TransportPacket.TransportHeader {
        private static final int ACKNOWLEDGMENT_NUMBER_OFFSET = 8;
        private static final int ACKNOWLEDGMENT_NUMBER_SIZE = 4;
        private static final int CHECKSUM_OFFSET = 16;
        private static final int CHECKSUM_SIZE = 2;
        private static final int DATA_OFFSET_AND_RESERVED_AND_CONTROL_BITS_OFFSET = 12;
        private static final int DATA_OFFSET_AND_RESERVED_AND_CONTROL_BITS_SIZE = 2;
        private static final int DST_PORT_OFFSET = 2;
        private static final int DST_PORT_SIZE = 2;
        private static final int IPV4_PSEUDO_HEADER_SIZE = 12;
        private static final int IPV6_PSEUDO_HEADER_SIZE = 40;
        private static final int MIN_TCP_HEADER_SIZE = 20;
        private static final int OPTIONS_OFFSET = 20;
        private static final int SEQUENCE_NUMBER_OFFSET = 4;
        private static final int SEQUENCE_NUMBER_SIZE = 4;
        private static final int SRC_PORT_OFFSET = 0;
        private static final int SRC_PORT_SIZE = 2;
        private static final int URGENT_POINTER_OFFSET = 18;
        private static final int URGENT_POINTER_SIZE = 2;
        private static final int WINDOW_OFFSET = 14;
        private static final int WINDOW_SIZE = 2;
        private static final Logger logger = LoggerFactory.getLogger((Class<?>) TcpHeader.class);
        private static final long serialVersionUID = -795185420055823677L;
        private final boolean ack;
        private final int acknowledgmentNumber;
        private final short checksum;
        private final byte dataOffset;
        private final TcpPort dstPort;
        private final boolean fin;
        private final List<TcpOption> options;
        private final byte[] padding;
        private final boolean psh;
        private final byte reserved;
        private final boolean rst;
        private final int sequenceNumber;
        private final TcpPort srcPort;
        private final boolean syn;
        private final boolean urg;
        private final short urgentPointer;
        private final short window;

        private byte[] buildRawData(boolean z) {
            return ByteArrays.concatenate(getRawFields(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public short calcChecksum(InetAddress inetAddress, InetAddress inetAddress2, byte[] bArr, byte[] bArr2) {
            byte[] bArr3;
            int i;
            int length = length() + bArr2.length;
            boolean z = inetAddress instanceof Inet4Address;
            int i2 = z ? 12 : 40;
            if (length % 2 != 0) {
                i = length + 1;
                bArr3 = new byte[i2 + i];
            } else {
                bArr3 = new byte[i2 + length];
                i = length;
            }
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            System.arraycopy(inetAddress.getAddress(), 0, bArr3, i, inetAddress.getAddress().length);
            int length2 = i + inetAddress.getAddress().length;
            System.arraycopy(inetAddress2.getAddress(), 0, bArr3, length2, inetAddress2.getAddress().length);
            int length3 = length2 + inetAddress2.getAddress().length;
            int i3 = z ? length3 + 1 : length3 + 3;
            bArr3[i3] = IpNumber.TCP.value().byteValue();
            System.arraycopy(ByteArrays.toByteArray((short) length), 0, bArr3, i3 + 1, 2);
            return ByteArrays.calcChecksum(bArr3);
        }

        private int measureLengthWithoutPadding() {
            Iterator<TcpOption> it = this.options.iterator();
            int length = 0;
            while (it.hasNext()) {
                length += it.next().length();
            }
            return length + 20;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[TCP Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Source port: ");
            sb.append(getSrcPort());
            sb.append(property);
            sb.append("  Destination port: ");
            sb.append(getDstPort());
            sb.append(property);
            sb.append("  Sequence Number: ");
            sb.append(getSequenceNumberAsLong());
            sb.append(property);
            sb.append("  Acknowledgment Number: ");
            sb.append(getAcknowledgmentNumberAsLong());
            sb.append(property);
            sb.append("  Data Offset: ");
            sb.append((int) this.dataOffset);
            sb.append(" (");
            sb.append(this.dataOffset * 4);
            sb.append(" [bytes])");
            sb.append(property);
            sb.append("  Reserved: ");
            sb.append((int) this.reserved);
            sb.append(property);
            sb.append("  URG: ");
            o40.K(sb, this.urg, property, "  ACK: ");
            o40.K(sb, this.ack, property, "  PSH: ");
            o40.K(sb, this.psh, property, "  RST: ");
            o40.K(sb, this.rst, property, "  SYN: ");
            o40.K(sb, this.syn, property, "  FIN: ");
            sb.append(this.fin);
            sb.append(property);
            sb.append("  Window: ");
            sb.append(getWindowAsInt());
            sb.append(property);
            sb.append("  Checksum: 0x");
            sb.append(ByteArrays.toHexString(this.checksum, ""));
            sb.append(property);
            sb.append("  Urgent Pointer: ");
            sb.append(getUrgentPointerAsInt());
            sb.append(property);
            for (TcpOption tcpOption : this.options) {
                sb.append("  Option: ");
                sb.append(tcpOption);
                sb.append(property);
            }
            if (this.padding.length != 0) {
                sb.append("  Padding: 0x");
                sb.append(ByteArrays.toHexString(this.padding, " "));
                sb.append(property);
            }
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return Arrays.hashCode(this.padding) + ((this.options.hashCode() + ((((((((((((((((((((((((((((this.dstPort.hashCode() + ((this.srcPort.hashCode() + 527) * 31)) * 31) + this.sequenceNumber) * 31) + this.acknowledgmentNumber) * 31) + this.dataOffset) * 31) + this.reserved) * 31) + (this.urg ? 1231 : 1237)) * 31) + (this.ack ? 1231 : 1237)) * 31) + (this.psh ? 1231 : 1237)) * 31) + (this.rst ? 1231 : 1237)) * 31) + (this.syn ? 1231 : 1237)) * 31) + (this.fin ? 1231 : 1237)) * 31) + this.window) * 31) + this.checksum) * 31) + this.urgentPointer) * 31)) * 31);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            return measureLengthWithoutPadding() + this.padding.length;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!TcpHeader.class.isInstance(obj)) {
                return false;
            }
            TcpHeader tcpHeader = (TcpHeader) obj;
            return this.checksum == tcpHeader.checksum && this.sequenceNumber == tcpHeader.sequenceNumber && this.acknowledgmentNumber == tcpHeader.acknowledgmentNumber && this.dataOffset == tcpHeader.dataOffset && this.srcPort.equals(tcpHeader.srcPort) && this.dstPort.equals(tcpHeader.dstPort) && this.urg == tcpHeader.urg && this.ack == tcpHeader.ack && this.psh == tcpHeader.psh && this.rst == tcpHeader.rst && this.syn == tcpHeader.syn && this.fin == tcpHeader.fin && this.window == tcpHeader.window && this.urgentPointer == tcpHeader.urgentPointer && this.reserved == tcpHeader.reserved && this.options.equals(tcpHeader.options) && Arrays.equals(this.padding, tcpHeader.padding);
        }

        public boolean getAck() {
            return this.ack;
        }

        public int getAcknowledgmentNumber() {
            return this.acknowledgmentNumber;
        }

        public long getAcknowledgmentNumberAsLong() {
            return ((long) this.acknowledgmentNumber) & 4294967295L;
        }

        public short getChecksum() {
            return this.checksum;
        }

        public byte getDataOffset() {
            return this.dataOffset;
        }

        public int getDataOffsetAsInt() {
            return this.dataOffset & 255;
        }

        public boolean getFin() {
            return this.fin;
        }

        public List<TcpOption> getOptions() {
            return new ArrayList(this.options);
        }

        public byte[] getPadding() {
            byte[] bArr = this.padding;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        public boolean getPsh() {
            return this.psh;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            return getRawFields(false);
        }

        public byte getReserved() {
            return this.reserved;
        }

        public boolean getRst() {
            return this.rst;
        }

        public int getSequenceNumber() {
            return this.sequenceNumber;
        }

        public long getSequenceNumberAsLong() {
            return ((long) this.sequenceNumber) & 4294967295L;
        }

        public boolean getSyn() {
            return this.syn;
        }

        public boolean getUrg() {
            return this.urg;
        }

        public short getUrgentPointer() {
            return this.urgentPointer;
        }

        public int getUrgentPointerAsInt() {
            return this.urgentPointer & 65535;
        }

        public short getWindow() {
            return this.window;
        }

        public int getWindowAsInt() {
            return 65535 & this.window;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v25 */
        /* JADX WARN: Type inference failed for: r0v26 */
        /* JADX WARN: Type inference failed for: r0v27 */
        /* JADX WARN: Type inference failed for: r0v28 */
        /* JADX WARN: Type inference failed for: r0v29 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v30 */
        /* JADX WARN: Type inference failed for: r0v31 */
        /* JADX WARN: Type inference failed for: r0v32 */
        /* JADX WARN: Type inference failed for: r0v33 */
        /* JADX WARN: Type inference failed for: r0v34 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        private List<byte[]> getRawFields(boolean z) {
            ?? r0 = this.fin;
            ?? r02 = r0;
            if (this.syn) {
                r02 = (byte) (r0 | 2);
            }
            ?? r03 = r02;
            if (this.rst) {
                r03 = (byte) (r02 | 4);
            }
            ?? r04 = r03;
            if (this.psh) {
                r04 = (byte) (r03 | 8);
            }
            ?? r05 = r04;
            if (this.ack) {
                r05 = (byte) (r04 | 16);
            }
            ?? r06 = r05;
            if (this.urg) {
                r06 = (byte) (r05 | 32);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.srcPort.value().shortValue()));
            arrayList.add(ByteArrays.toByteArray(this.dstPort.value().shortValue()));
            arrayList.add(ByteArrays.toByteArray(this.sequenceNumber));
            arrayList.add(ByteArrays.toByteArray(this.acknowledgmentNumber));
            arrayList.add(ByteArrays.toByteArray((short) (r06 | (this.dataOffset << 12) | (this.reserved << 6))));
            arrayList.add(ByteArrays.toByteArray(this.window));
            arrayList.add(ByteArrays.toByteArray(z ? (short) 0 : this.checksum));
            arrayList.add(ByteArrays.toByteArray(this.urgentPointer));
            Iterator<TcpOption> it = this.options.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getRawData());
            }
            arrayList.add(this.padding);
            return arrayList;
        }

        @Override // org.pcap4j.packet.TransportPacket.TransportHeader
        public TcpPort getDstPort() {
            return this.dstPort;
        }

        @Override // org.pcap4j.packet.TransportPacket.TransportHeader
        public TcpPort getSrcPort() {
            return this.srcPort;
        }

        private TcpHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            int length = 20;
            if (i2 >= 20) {
                this.srcPort = TcpPort.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i)));
                this.dstPort = TcpPort.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i + 2)));
                this.sequenceNumber = ByteArrays.getInt(bArr, i + 4);
                this.acknowledgmentNumber = ByteArrays.getInt(bArr, i + 8);
                short s = ByteArrays.getShort(bArr, i + 12);
                this.dataOffset = (byte) ((61440 & s) >> 12);
                this.reserved = (byte) ((s & 4032) >> 6);
                this.urg = (s & 32) != 0;
                this.ack = (s & 16) != 0;
                this.psh = (s & 8) != 0;
                this.rst = (s & 4) != 0;
                this.syn = (s & 2) != 0;
                this.fin = (s & 1) != 0;
                this.window = ByteArrays.getShort(bArr, i + 14);
                this.checksum = ByteArrays.getShort(bArr, i + 16);
                this.urgentPointer = ByteArrays.getShort(bArr, i + 18);
                int dataOffsetAsInt = getDataOffsetAsInt() * 4;
                if (i2 < dataOffsetAsInt) {
                    StringBuilder sb = new StringBuilder(110);
                    sb.append("The data is too short to build this header(");
                    sb.append(dataOffsetAsInt);
                    sb.append(" bytes). data: ");
                    t61.t(i, " ", ", offset: ", sb, bArr);
                    sb.append(", length: ");
                    sb.append(i2);
                    throw new IllegalRawDataException(sb.toString());
                }
                if (dataOffsetAsInt >= 20) {
                    this.options = new ArrayList();
                    while (length < dataOffsetAsInt) {
                        int i3 = length + i;
                        try {
                            TcpOption tcpOption = (TcpOption) PacketFactories.getFactory(TcpOption.class, TcpOptionKind.class).newInstance(bArr, i3, dataOffsetAsInt - length, TcpOptionKind.getInstance(Byte.valueOf(bArr[i3])));
                            this.options.add(tcpOption);
                            length += tcpOption.length();
                            if (tcpOption.getKind().equals(TcpOptionKind.END_OF_OPTION_LIST)) {
                                break;
                            }
                        } catch (Exception e) {
                            logger.error("Exception occurred during analyzing TCP options: ", (Throwable) e);
                        }
                    }
                    int i4 = dataOffsetAsInt - length;
                    if (i4 != 0) {
                        this.padding = ByteArrays.getSubArray(bArr, length + i, i4);
                        return;
                    } else {
                        this.padding = new byte[0];
                        return;
                    }
                }
                StringBuilder sbA = o40.A(100, "The data offset must be equal or more than 5, but it is: ");
                sbA.append(getDataOffsetAsInt());
                throw new IllegalRawDataException(sbA.toString());
            }
            StringBuilder sbA2 = o40.A(80, "The data is too short to build this header(20 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA2, bArr);
            sbA2.append(", length: ");
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }

        private TcpHeader(Builder builder, byte[] bArr) {
            if ((builder.reserved & 192) == 0) {
                this.srcPort = builder.srcPort;
                this.dstPort = builder.dstPort;
                this.sequenceNumber = builder.sequenceNumber;
                this.acknowledgmentNumber = builder.acknowledgmentNumber;
                this.reserved = builder.reserved;
                this.urg = builder.urg;
                this.ack = builder.ack;
                this.psh = builder.psh;
                this.rst = builder.rst;
                this.syn = builder.syn;
                this.fin = builder.fin;
                this.window = builder.window;
                this.urgentPointer = builder.urgentPointer;
                if (builder.options != null) {
                    this.options = new ArrayList(builder.options);
                } else {
                    this.options = new ArrayList(0);
                }
                if (!builder.paddingAtBuild) {
                    if (builder.padding != null) {
                        byte[] bArr2 = new byte[builder.padding.length];
                        this.padding = bArr2;
                        System.arraycopy(builder.padding, 0, bArr2, 0, bArr2.length);
                    } else {
                        this.padding = new byte[0];
                    }
                } else {
                    int iMeasureLengthWithoutPadding = measureLengthWithoutPadding() % 4;
                    if (iMeasureLengthWithoutPadding != 0) {
                        this.padding = new byte[4 - iMeasureLengthWithoutPadding];
                    } else {
                        this.padding = new byte[0];
                    }
                }
                if (!builder.correctLengthAtBuild) {
                    if ((builder.dataOffset & 240) == 0) {
                        this.dataOffset = builder.dataOffset;
                    } else {
                        throw new IllegalArgumentException("Invalid dataOffset: " + ((int) builder.dataOffset));
                    }
                } else {
                    this.dataOffset = (byte) (length() / 4);
                }
                if (builder.correctChecksumAtBuild) {
                    if (((builder.srcAddr instanceof Inet4Address) && PacketPropertiesLoader.getInstance().tcpV4CalcChecksum()) || ((builder.srcAddr instanceof Inet6Address) && PacketPropertiesLoader.getInstance().tcpV6CalcChecksum())) {
                        this.checksum = calcChecksum(builder.srcAddr, builder.dstAddr, buildRawData(true), bArr);
                        return;
                    } else {
                        this.checksum = (short) 0;
                        return;
                    }
                }
                this.checksum = builder.checksum;
                return;
            }
            throw new IllegalArgumentException("Invalid reserved: " + ((int) builder.reserved));
        }
    }

    public interface TcpOption extends Serializable {
        TcpOptionKind getKind();

        byte[] getRawData();

        int length();
    }

    public static TcpPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new TcpPacket(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public boolean hasValidChecksum(InetAddress inetAddress, InetAddress inetAddress2, boolean z) {
        if (inetAddress == null || inetAddress2 == null) {
            throw new NullPointerException("srcAddr: " + inetAddress + " dstAddr: " + inetAddress2);
        }
        if (!inetAddress.getClass().isInstance(inetAddress2)) {
            throw new IllegalArgumentException("srcAddr: " + inetAddress + " dstAddr: " + inetAddress2);
        }
        Packet packet = this.payload;
        byte[] rawData = packet != null ? packet.getRawData() : new byte[0];
        TcpHeader tcpHeader = this.header;
        if (tcpHeader.calcChecksum(inetAddress, inetAddress2, tcpHeader.getRawData(), rawData) == 0) {
            return true;
        }
        return this.header.checksum == 0 && z;
    }

    private TcpPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        TcpHeader tcpHeader = new TcpHeader(bArr, i, i2);
        this.header = tcpHeader;
        int length = i2 - tcpHeader.length();
        if (length <= 0) {
            this.payload = null;
        } else {
            PacketFactory factory = PacketFactories.getFactory(Packet.class, TcpPort.class);
            this.payload = (Packet) factory.newInstance(bArr, tcpHeader.length() + i, length, factory.getTargetClass(tcpHeader.getDstPort()).equals(factory.getTargetClass()) ? tcpHeader.getSrcPort() : tcpHeader.getDstPort());
        }
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder(this);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public TcpHeader getHeader() {
        return this.header;
    }

    private TcpPacket(Builder builder) {
        if (builder != null && builder.srcPort != null && builder.dstPort != null) {
            if (builder.correctChecksumAtBuild) {
                if (builder.srcAddr != null && builder.dstAddr != null) {
                    if (!builder.srcAddr.getClass().isInstance(builder.dstAddr)) {
                        throw new IllegalArgumentException("builder.srcAddr: " + builder.srcAddr + " builder.dstAddr: " + builder.dstAddr);
                    }
                } else {
                    throw new NullPointerException("builder.srcAddr: " + builder.srcAddr + " builder.dstAddr: " + builder.dstAddr);
                }
            }
            Packet packetBuild = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.payload = packetBuild;
            this.header = new TcpHeader(builder, packetBuild != null ? packetBuild.getRawData() : new byte[0]);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.srcPort: " + builder.srcPort + " builder.dstPort: " + builder.dstPort);
    }
}
