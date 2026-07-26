package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.util.ByteArrays;
import org.pcap4j.util.MacAddress;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Dot11ManagementPacket extends AbstractPacket {
    private static final long serialVersionUID = -3972573868672848666L;
    private final Integer fcs;

    public static abstract class Builder extends AbstractPacket.AbstractBuilder implements ChecksumBuilder<Dot11ManagementPacket> {
        private MacAddress address1;
        private MacAddress address2;
        private MacAddress address3;
        private boolean correctChecksumAtBuild;
        private short duration;
        private Integer fcs;
        private Dot11FrameControl frameControl;
        private Dot11HtControl htControl;
        private Dot11SequenceControl sequenceControl;

        public Builder() {
        }

        public Builder address1(MacAddress macAddress) {
            this.address1 = macAddress;
            return this;
        }

        public Builder address2(MacAddress macAddress) {
            this.address2 = macAddress;
            return this;
        }

        public Builder address3(MacAddress macAddress) {
            this.address3 = macAddress;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public abstract Dot11ManagementPacket build();

        public void checkForNull() {
            if (this.frameControl == null || this.address1 == null || this.address2 == null || this.address3 == null) {
                throw new NullPointerException("frameControl: " + this.frameControl + " address1: " + this.address1 + " address2: " + this.address2 + " address3: " + this.address3);
            }
        }

        public Builder duration(short s) {
            this.duration = s;
            return this;
        }

        public Builder fcs(Integer num) {
            this.fcs = num;
            return this;
        }

        public Builder frameControl(Dot11FrameControl dot11FrameControl) {
            this.frameControl = dot11FrameControl;
            return this;
        }

        public Builder htControl(Dot11HtControl dot11HtControl) {
            this.htControl = dot11HtControl;
            return this;
        }

        public Builder sequenceControl(Dot11SequenceControl dot11SequenceControl) {
            this.sequenceControl = dot11SequenceControl;
            return this;
        }

        public Builder(Dot11ManagementPacket dot11ManagementPacket) {
            this.frameControl = dot11ManagementPacket.getHeader().frameControl;
            this.duration = dot11ManagementPacket.getHeader().duration;
            this.address1 = dot11ManagementPacket.getHeader().address1;
            this.address2 = dot11ManagementPacket.getHeader().address2;
            this.address3 = dot11ManagementPacket.getHeader().address3;
            this.sequenceControl = dot11ManagementPacket.getHeader().sequenceControl;
            this.htControl = dot11ManagementPacket.getHeader().htControl;
            this.fcs = dot11ManagementPacket.fcs;
        }

        @Override // org.pcap4j.packet.ChecksumBuilder
        public ChecksumBuilder<Dot11ManagementPacket> correctChecksumAtBuild(boolean z) {
            this.correctChecksumAtBuild = z;
            return this;
        }
    }

    public Dot11ManagementPacket(byte[] bArr, int i, int i2, int i3) {
        if (i2 - i3 >= 4) {
            this.fcs = Integer.valueOf(ByteArrays.getInt(bArr, i + i3, ByteOrder.LITTLE_ENDIAN));
        } else {
            this.fcs = null;
        }
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public byte[] buildRawData() {
        byte[] bArrBuildRawData = super.buildRawData();
        Integer num = this.fcs;
        if (num != null) {
            System.arraycopy(ByteArrays.toByteArray(num.intValue(), ByteOrder.LITTLE_ENDIAN), 0, bArrBuildRawData, bArrBuildRawData.length - 4, 4);
        }
        return bArrBuildRawData;
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public String buildString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getHeader().toString());
        if (this.fcs != null) {
            String property = System.getProperty("line.separator");
            sb.append("[IEEE802.11 Management Packet FCS]");
            sb.append(property);
            sb.append("  FCS: 0x");
            sb.append(ByteArrays.toHexString(this.fcs.intValue(), ""));
            sb.append(property);
        }
        return sb.toString();
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public int calcLength() {
        int iCalcLength = super.calcLength();
        return this.fcs != null ? iCalcLength + 4 : iCalcLength;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public abstract Builder getBuilder();

    public Integer getFcs() {
        return this.fcs;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public abstract Dot11ManagementHeader getHeader();

    public boolean hasValidFcs() {
        return this.fcs != null && ByteArrays.calcCrc32Checksum(getHeader().getRawData()) == this.fcs.intValue();
    }

    public Dot11ManagementPacket(Builder builder, Dot11ManagementHeader dot11ManagementHeader) {
        if (!builder.correctChecksumAtBuild) {
            this.fcs = builder.fcs;
        } else {
            this.fcs = Integer.valueOf(ByteArrays.calcCrc32Checksum(dot11ManagementHeader.getRawData()));
        }
    }

    public static abstract class Dot11ManagementHeader extends AbstractPacket.AbstractHeader {
        private static final int ADDRESS1_OFFSET = 4;
        private static final int ADDRESS1_SIZE = 6;
        private static final int ADDRESS2_OFFSET = 10;
        private static final int ADDRESS2_SIZE = 6;
        private static final int ADDRESS3_OFFSET = 16;
        private static final int ADDRESS3_SIZE = 6;
        private static final int DOT11_HEADER_MIN_SIZE = 24;
        private static final int DURATION_OFFSET = 2;
        private static final int DURATION_SIZE = 2;
        private static final int FRAME_CONTROL_OFFSET = 0;
        private static final int FRAME_CONTROL_SIZE = 2;
        private static final int HT_CONTROL_OFFSET = 24;
        private static final int HT_CONTROL_SIZE = 4;
        private static final int SEQUENCE_CONTROL_OFFSET = 22;
        private static final int SEQUENCE_CONTROL_SIZE = 2;
        private static final long serialVersionUID = 615170086003609919L;
        private final MacAddress address1;
        private final MacAddress address2;
        private final MacAddress address3;
        private final short duration;
        private final Dot11FrameControl frameControl;
        private final Dot11HtControl htControl;
        private final Dot11SequenceControl sequenceControl;

        public Dot11ManagementHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 < 24) {
                StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a Dot11ManagementHeader (24 bytes). data: ");
                t61.t(i, " ", ", offset: ", sbA, bArr);
                sbA.append(", length: ");
                sbA.append(i2);
                throw new IllegalRawDataException(sbA.toString());
            }
            Dot11FrameControl dot11FrameControlNewInstance = Dot11FrameControl.newInstance(bArr, i, i2);
            this.frameControl = dot11FrameControlNewInstance;
            this.duration = ByteArrays.getShort(bArr, i + 2, ByteOrder.LITTLE_ENDIAN);
            this.address1 = ByteArrays.getMacAddress(bArr, i + 4);
            this.address2 = ByteArrays.getMacAddress(bArr, i + 10);
            this.address3 = ByteArrays.getMacAddress(bArr, i + 16);
            this.sequenceControl = Dot11SequenceControl.newInstance(bArr, i + 22, i2 - 22);
            if (!dot11FrameControlNewInstance.isOrder()) {
                this.htControl = null;
                return;
            }
            if (i2 >= 28) {
                this.htControl = Dot11HtControl.newInstance(bArr, i + 24, i2 - 24);
                return;
            }
            StringBuilder sbA2 = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a Dot11ManagementHeader (28 bytes). data: ");
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
            sb.append("  Frame Control:");
            sb.append(property);
            sb.append(this.frameControl.toString("    "));
            sb.append("  Duration: ");
            sb.append(getDurationAsInt());
            sb.append(property);
            sb.append("  Address1: ");
            sb.append(this.address1);
            sb.append(property);
            sb.append("  Address2: ");
            sb.append(this.address2);
            sb.append(property);
            sb.append("  Address3: ");
            sb.append(this.address3);
            sb.append(property);
            sb.append("  Sequence Control: ");
            sb.append(this.sequenceControl);
            sb.append(property);
            if (this.htControl != null) {
                sb.append("  HT Control:");
                sb.append(property);
                sb.append(this.htControl.toString("    "));
            }
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            int iHashCode = (this.frameControl.hashCode() + ((((this.address3.hashCode() + ((this.address2.hashCode() + ((this.address1.hashCode() + 527) * 31)) * 31)) * 31) + this.duration) * 31)) * 31;
            Dot11HtControl dot11HtControl = this.htControl;
            return this.sequenceControl.hashCode() + ((iHashCode + (dot11HtControl != null ? dot11HtControl.hashCode() : 0)) * 31);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            return this.htControl != null ? 28 : 24;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            Dot11ManagementHeader dot11ManagementHeader = (Dot11ManagementHeader) obj;
            if (!this.address1.equals(dot11ManagementHeader.address1) || !this.address2.equals(dot11ManagementHeader.address2) || !this.address3.equals(dot11ManagementHeader.address3) || this.duration != dot11ManagementHeader.duration || !this.frameControl.equals(dot11ManagementHeader.frameControl)) {
                return false;
            }
            Dot11HtControl dot11HtControl = this.htControl;
            if (dot11HtControl == null) {
                if (dot11ManagementHeader.htControl != null) {
                    return false;
                }
            } else if (!dot11HtControl.equals(dot11ManagementHeader.htControl)) {
                return false;
            }
            return this.sequenceControl.equals(dot11ManagementHeader.sequenceControl);
        }

        public MacAddress getAddress1() {
            return this.address1;
        }

        public MacAddress getAddress2() {
            return this.address2;
        }

        public MacAddress getAddress3() {
            return this.address3;
        }

        public short getDuration() {
            return this.duration;
        }

        public int getDurationAsInt() {
            return this.duration & 65535;
        }

        public Dot11FrameControl getFrameControl() {
            return this.frameControl;
        }

        public abstract String getHeaderName();

        public Dot11HtControl getHtControl() {
            return this.htControl;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.frameControl.getRawData());
            arrayList.add(ByteArrays.toByteArray(this.duration, ByteOrder.LITTLE_ENDIAN));
            arrayList.add(this.address1.getAddress());
            arrayList.add(this.address2.getAddress());
            arrayList.add(this.address3.getAddress());
            arrayList.add(this.sequenceControl.getRawData());
            Dot11HtControl dot11HtControl = this.htControl;
            if (dot11HtControl != null) {
                arrayList.add(dot11HtControl.getRawData());
            }
            return arrayList;
        }

        public Dot11SequenceControl getSequenceControl() {
            return this.sequenceControl;
        }

        public Dot11ManagementHeader(Builder builder) {
            this.frameControl = builder.frameControl;
            this.duration = builder.duration;
            this.address1 = builder.address1;
            this.address2 = builder.address2;
            this.address3 = builder.address3;
            this.sequenceControl = builder.sequenceControl;
            this.htControl = builder.htControl;
        }
    }
}
