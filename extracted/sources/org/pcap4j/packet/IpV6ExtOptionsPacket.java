package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.IpV6OptionType;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IpV6ExtOptionsPacket extends AbstractPacket {
    private static final long serialVersionUID = 416178196599916582L;
    private final Packet payload;

    public static abstract class Builder extends AbstractPacket.AbstractBuilder implements LengthBuilder<IpV6ExtOptionsPacket> {
        private boolean correctLengthAtBuild;
        private byte hdrExtLen;
        private IpNumber nextHeader;
        private List<IpV6Option> options;
        private Packet.Builder payloadBuilder;

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder hdrExtLen(byte b) {
            this.hdrExtLen = b;
            return this;
        }

        public Builder nextHeader(IpNumber ipNumber) {
            this.nextHeader = ipNumber;
            return this;
        }

        public Builder options(List<IpV6Option> list) {
            this.options = list;
            return this;
        }

        public Builder(IpV6ExtOptionsPacket ipV6ExtOptionsPacket) {
            this.nextHeader = ipV6ExtOptionsPacket.getHeader().nextHeader;
            this.hdrExtLen = ipV6ExtOptionsPacket.getHeader().hdrExtLen;
            this.options = ipV6ExtOptionsPacket.getHeader().options;
            this.payloadBuilder = ipV6ExtOptionsPacket.payload != null ? ipV6ExtOptionsPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV6ExtOptionsPacket> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }
    }

    public interface IpV6Option extends Serializable {
        byte[] getRawData();

        IpV6OptionType getType();

        int length();
    }

    public IpV6ExtOptionsPacket() {
        this.payload = null;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public abstract IpV6ExtOptionsHeader getHeader();

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public IpV6ExtOptionsPacket(byte[] bArr, int i, int i2, IpNumber ipNumber) {
        Packet packet;
        PacketFactory factory = PacketFactories.getFactory(Packet.class, IpNumber.class);
        if (factory.getTargetClass(ipNumber).equals(factory.getTargetClass())) {
            packet = (Packet) PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(bArr, i, i2, NotApplicable.UNKNOWN_IP_V6_EXTENSION);
            if (packet instanceof IllegalPacket) {
                packet = (Packet) factory.newInstance(bArr, i, i2);
            }
        } else {
            packet = (Packet) factory.newInstance(bArr, i, i2, ipNumber);
        }
        this.payload = packet;
    }

    public IpV6ExtOptionsPacket(Builder builder) {
        if (builder != null && builder.nextHeader != null && builder.options != null) {
            this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.nextHeader: " + builder.nextHeader + " builder.options: " + builder.options);
    }

    public static abstract class IpV6ExtOptionsHeader extends AbstractPacket.AbstractHeader {
        private static final int HDR_EXT_LEN_OFFSET = 1;
        private static final int HDR_EXT_LEN_SIZE = 1;
        private static final int NEXT_HEADER_OFFSET = 0;
        private static final int NEXT_HEADER_SIZE = 1;
        private static final int OPTIONS_OFFSET = 2;
        private static final long serialVersionUID = 224822728201337667L;
        private final byte hdrExtLen;
        private final IpNumber nextHeader;
        private final List<IpV6Option> options;

        public IpV6ExtOptionsHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            int length = 2;
            if (i2 < 2) {
                StringBuilder sbA = o40.A(110, "The data length of ");
                sbA.append(getHeaderName());
                sbA.append(" is must be more than 1. data: ");
                sbA.append(ByteArrays.toHexString(bArr, " "));
                sbA.append(", offset: ");
                sbA.append(i);
                sbA.append(", length: ");
                sbA.append(i2);
                throw new IllegalRawDataException(sbA.toString());
            }
            this.nextHeader = IpNumber.getInstance(Byte.valueOf(ByteArrays.getByte(bArr, i)));
            this.hdrExtLen = ByteArrays.getByte(bArr, i + 1);
            int hdrExtLenAsInt = (getHdrExtLenAsInt() + 1) * 8;
            if (i2 >= hdrExtLenAsInt) {
                this.options = new ArrayList();
                while (length < hdrExtLenAsInt) {
                    int i3 = length + i;
                    try {
                        IpV6Option ipV6Option = (IpV6Option) PacketFactories.getFactory(IpV6Option.class, IpV6OptionType.class).newInstance(bArr, i3, hdrExtLenAsInt - length, IpV6OptionType.getInstance(Byte.valueOf(bArr[i3])));
                        this.options.add(ipV6Option);
                        length += ipV6Option.length();
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            }
            StringBuilder sbA2 = o40.A(110, "The data is too short to build an ");
            sbA2.append(getHeaderName());
            sbA2.append("(");
            sbA2.append(hdrExtLenAsInt);
            sbA2.append(" bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA2, bArr);
            sbA2.append(", length: ");
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[");
            String property = System.getProperty("line.separator");
            sb.append(getHeaderName());
            sb.append(" (");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Next Header: ");
            sb.append(this.nextHeader);
            sb.append(property);
            sb.append("  Hdr Ext Len: ");
            sb.append(getHdrExtLenAsInt());
            sb.append(" (");
            sb.append((getHdrExtLenAsInt() + 1) * 8);
            o40.I(" [bytes])", property, "  Options: ", property, sb);
            for (IpV6Option ipV6Option : this.options) {
                sb.append("    ");
                sb.append(ipV6Option);
                sb.append(property);
            }
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.options.hashCode() + ((((this.nextHeader.hashCode() + 527) * 31) + this.hdrExtLen) * 31);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            Iterator<IpV6Option> it = this.options.iterator();
            int length = 0;
            while (it.hasNext()) {
                length += it.next().length();
            }
            return length + 2;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!getClass().isInstance(obj)) {
                return false;
            }
            IpV6ExtOptionsHeader ipV6ExtOptionsHeader = (IpV6ExtOptionsHeader) obj;
            return this.nextHeader.equals(ipV6ExtOptionsHeader.nextHeader) && this.hdrExtLen == ipV6ExtOptionsHeader.hdrExtLen && this.options.equals(ipV6ExtOptionsHeader.options);
        }

        public byte getHdrExtLen() {
            return this.hdrExtLen;
        }

        public int getHdrExtLenAsInt() {
            return this.hdrExtLen & 255;
        }

        public abstract String getHeaderName();

        public IpNumber getNextHeader() {
            return this.nextHeader;
        }

        public List<IpV6Option> getOptions() {
            return new ArrayList(this.options);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.nextHeader.value().byteValue()));
            arrayList.add(ByteArrays.toByteArray(this.hdrExtLen));
            Iterator<IpV6Option> it = this.options.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getRawData());
            }
            return arrayList;
        }

        public IpV6ExtOptionsHeader(Builder builder) {
            Iterator it = builder.options.iterator();
            int length = 0;
            while (it.hasNext()) {
                length += ((IpV6Option) it.next()).length();
            }
            if ((length + 2) % 8 == 0) {
                this.nextHeader = builder.nextHeader;
                this.options = new ArrayList(builder.options);
                if (!builder.correctLengthAtBuild) {
                    this.hdrExtLen = builder.hdrExtLen;
                    return;
                } else {
                    this.hdrExtLen = (byte) ((r1 / 8) - 1);
                    return;
                }
            }
            StringBuilder sb = new StringBuilder(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
            String property = System.getProperty("line.separator");
            sb.append("options length is invalid. ([options length] + 2) % 8 must be 0. options: ");
            sb.append(property);
            Iterator it2 = builder.options.iterator();
            while (it2.hasNext()) {
                sb.append((IpV6Option) it2.next());
                sb.append(property);
            }
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
