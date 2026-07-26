package org.pcap4j.packet;

import java.io.Serializable;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.DataLinkType;
import org.pcap4j.util.ByteArrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class RadiotapPacket extends AbstractPacket {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) RadiotapPacket.class);
    private static final long serialVersionUID = 4121827899399388949L;
    private final RadiotapHeader header;
    private final Packet payload;

    public static final class Builder extends AbstractPacket.AbstractBuilder implements LengthBuilder<RadiotapPacket> {
        private boolean correctLengthAtBuild;
        private List<RadiotapData> dataFields;
        private short length;
        private byte pad;
        private Packet.Builder payloadBuilder;
        private List<RadiotapPresentBitmask> presentBitmasks;
        private byte version;

        public Builder dataFields(List<RadiotapData> list) {
            this.dataFields = list;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder length(short s) {
            this.length = s;
            return this;
        }

        public Builder pad(byte b) {
            this.pad = b;
            return this;
        }

        public Builder presentBitmasks(List<RadiotapPresentBitmask> list) {
            this.presentBitmasks = list;
            return this;
        }

        public Builder version(byte b) {
            this.version = b;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<RadiotapPacket> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        private Builder(RadiotapPacket radiotapPacket) {
            this.version = radiotapPacket.header.version;
            this.pad = radiotapPacket.header.pad;
            this.length = radiotapPacket.header.length;
            this.presentBitmasks = radiotapPacket.header.presentBitmasks;
            this.dataFields = radiotapPacket.header.dataFields;
            this.payloadBuilder = radiotapPacket.payload != null ? radiotapPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public RadiotapPacket build() {
            return new RadiotapPacket(this);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }
    }

    public interface RadiotapData extends Serializable {
        byte[] getRawData();

        int length();

        String toString(String str);
    }

    public static RadiotapPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new RadiotapPacket(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public static final class RadiotapHeader extends AbstractPacket.AbstractHeader {
        private static final int LENGTH_OFFSET = 2;
        private static final int LENGTH_SIZE = 2;
        private static final int MIN_RADIOTAP_HEADER_SIZE = 8;
        private static final int PAD_OFFSET = 1;
        private static final int PAD_SIZE = 1;
        private static final int PRESENT_OFFSET = 4;
        private static final int PRESENT_SIZE = 4;
        private static final int VERSION_OFFSET = 0;
        private static final int VERSION_SIZE = 1;
        private static final long serialVersionUID = -5384412750993783312L;
        private final List<RadiotapData> dataFields;
        private final short length;
        private final byte pad;
        private final List<RadiotapPresentBitmask> presentBitmasks;
        private final byte version;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[Radiotap header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Version: ");
            sb.append(getVersionAsInt());
            sb.append(property);
            sb.append("  Pad: ");
            sb.append((int) this.pad);
            sb.append(property);
            sb.append("  Length: ");
            sb.append(getLengthAsInt());
            sb.append(property);
            Iterator<RadiotapPresentBitmask> it = this.presentBitmasks.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString("  "));
            }
            sb.append("  Data Fields: ");
            sb.append(property);
            Iterator<RadiotapData> it2 = this.dataFields.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next().toString("    "));
            }
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.dataFields.hashCode() + ((this.presentBitmasks.hashCode() + ((((((527 + this.version) * 31) + this.pad) * 31) + this.length) * 31)) * 31);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            int size = (this.presentBitmasks.size() * 4) + 4;
            Iterator<RadiotapData> it = this.dataFields.iterator();
            while (it.hasNext()) {
                size += it.next().length();
            }
            return size;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!RadiotapHeader.class.isInstance(obj)) {
                return false;
            }
            RadiotapHeader radiotapHeader = (RadiotapHeader) obj;
            return this.length == radiotapHeader.length && this.version == radiotapHeader.version && this.pad == radiotapHeader.pad && this.presentBitmasks.equals(radiotapHeader.presentBitmasks) && this.dataFields.equals(radiotapHeader.dataFields);
        }

        public ArrayList<RadiotapData> getDataFields() {
            return new ArrayList<>(this.dataFields);
        }

        public short getLength() {
            return this.length;
        }

        public int getLengthAsInt() {
            return 65535 & this.length;
        }

        public byte getPad() {
            return this.pad;
        }

        public ArrayList<RadiotapPresentBitmask> getPresentBitmasks() {
            return new ArrayList<>(this.presentBitmasks);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.version));
            arrayList.add(ByteArrays.toByteArray(this.pad));
            arrayList.add(ByteArrays.toByteArray(this.length, ByteOrder.LITTLE_ENDIAN));
            Iterator<RadiotapPresentBitmask> it = this.presentBitmasks.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getRawData());
            }
            Iterator<RadiotapData> it2 = this.dataFields.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getRawData());
            }
            return arrayList;
        }

        public byte getVersion() {
            return this.version;
        }

        public int getVersionAsInt() {
            return this.version & 255;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
        
            r16 = r8;
            r7 = new java.lang.StringBuilder(ir.mservices.market.version2.webapi.responsedto.ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
            r7.append("Not enough length for a RadiotapDataPad: ");
            r7.append(org.pcap4j.util.ByteArrays.toHexString(r19, " "));
            r7.append(", offset: ");
            r7.append(r20);
            r7.append(", length: ");
            r7.append(r21);
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00f4, code lost:
        
            throw new org.pcap4j.packet.IllegalRawDataException(r7.toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x011e, code lost:
        
            r7 = new java.lang.StringBuilder(ir.mservices.market.version2.webapi.responsedto.ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
            r7.append("No data is remaining for a RadiotapDataField: ");
            r7.append(org.pcap4j.util.ByteArrays.toHexString(r19, " "));
            r7.append(", offset: ");
            r7.append(r20);
            r7.append(", length: ");
            r7.append(r21);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0146, code lost:
        
            throw new org.pcap4j.packet.IllegalRawDataException(r7.toString());
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private RadiotapHeader(byte[] r19, int r20, int r21) throws org.pcap4j.packet.IllegalRawDataException {
            /*
                Method dump skipped, instruction units count: 508
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.pcap4j.packet.RadiotapPacket.RadiotapHeader.<init>(byte[], int, int):void");
        }

        private RadiotapHeader(Builder builder) {
            this.version = builder.version;
            this.pad = builder.pad;
            this.presentBitmasks = new ArrayList(builder.presentBitmasks);
            this.dataFields = new ArrayList(builder.dataFields);
            if (!builder.correctLengthAtBuild) {
                this.length = builder.length;
            } else {
                this.length = (short) calcLength();
            }
        }
    }

    private RadiotapPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        RadiotapHeader radiotapHeader = new RadiotapHeader(bArr, i, i2);
        this.header = radiotapHeader;
        int length = i2 - radiotapHeader.length();
        if (length > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, DataLinkType.class).newInstance(bArr, radiotapHeader.length() + i, length, DataLinkType.IEEE802_11);
        } else {
            this.payload = null;
        }
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public RadiotapHeader getHeader() {
        return this.header;
    }

    private RadiotapPacket(Builder builder) {
        if (builder != null && builder.presentBitmasks != null && builder.dataFields != null) {
            this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.header = new RadiotapHeader(builder);
        } else {
            throw new NullPointerException("builder: " + builder + " builder.presentBitmasks: " + builder.presentBitmasks + " builder.dataFields: " + builder.dataFields);
        }
    }
}
