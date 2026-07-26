package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class RadiotapDataAntenna implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 1;
    private static final long serialVersionUID = -4959721095331063491L;
    private final byte antenna;

    public static final class Builder {
        private byte antenna;

        public Builder antenna(byte b) {
            this.antenna = b;
            return this;
        }

        public RadiotapDataAntenna build() {
            return new RadiotapDataAntenna(this);
        }

        public Builder() {
        }

        private Builder(RadiotapDataAntenna radiotapDataAntenna) {
            this.antenna = radiotapDataAntenna.antenna;
        }
    }

    public static RadiotapDataAntenna newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new RadiotapDataAntenna(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return RadiotapDataAntenna.class.isInstance(obj) && this.antenna == ((RadiotapDataAntenna) obj).antenna;
    }

    public byte getAntenna() {
        return this.antenna;
    }

    public int getAntennaAsInt() {
        return this.antenna & 255;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        return ByteArrays.toByteArray(this.antenna);
    }

    public int hashCode() {
        return this.antenna;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return 1;
    }

    public String toString() {
        return toString("");
    }

    private RadiotapDataAntenna(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 >= 1) {
            this.antenna = ByteArrays.getByte(bArr, i);
            return;
        }
        StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a RadiotapRate (1 bytes). data: ");
        t61.t(i, " ", ", offset: ", sbA, bArr);
        sbA.append(", length: ");
        sbA.append(i2);
        throw new IllegalRawDataException(sbA.toString());
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "Antenna: ", str, sb);
        sb.append("  Antenna: ");
        sb.append(getAntennaAsInt());
        sb.append(strZ);
        return sb.toString();
    }

    private RadiotapDataAntenna(Builder builder) {
        if (builder != null) {
            this.antenna = builder.antenna;
            return;
        }
        throw new NullPointerException("builder is null.");
    }
}
