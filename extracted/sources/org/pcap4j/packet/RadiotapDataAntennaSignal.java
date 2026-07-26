package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class RadiotapDataAntennaSignal implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 1;
    private static final long serialVersionUID = -358697672561390506L;
    private final byte antennaSignal;

    public static final class Builder {
        private byte antennaSignal;

        public Builder antennaSignal(byte b) {
            this.antennaSignal = b;
            return this;
        }

        public RadiotapDataAntennaSignal build() {
            return new RadiotapDataAntennaSignal(this);
        }

        public Builder() {
        }

        private Builder(RadiotapDataAntennaSignal radiotapDataAntennaSignal) {
            this.antennaSignal = radiotapDataAntennaSignal.antennaSignal;
        }
    }

    public static RadiotapDataAntennaSignal newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new RadiotapDataAntennaSignal(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return RadiotapDataAntennaSignal.class.isInstance(obj) && this.antennaSignal == ((RadiotapDataAntennaSignal) obj).antennaSignal;
    }

    public byte getAntennaSignal() {
        return this.antennaSignal;
    }

    public int getAntennaSignalAsInt() {
        return this.antennaSignal;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        return ByteArrays.toByteArray(this.antennaSignal);
    }

    public int hashCode() {
        return this.antennaSignal;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return 1;
    }

    public String toString() {
        return toString("");
    }

    private RadiotapDataAntennaSignal(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 >= 1) {
            this.antennaSignal = ByteArrays.getByte(bArr, i);
            return;
        }
        StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a RadiotapAntennaSignal (1 bytes). data: ");
        t61.t(i, " ", ", offset: ", sbA, bArr);
        sbA.append(", length: ");
        sbA.append(i2);
        throw new IllegalRawDataException(sbA.toString());
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "Antenna signal: ", str, sb);
        sb.append("  Antenna signal: ");
        sb.append((int) this.antennaSignal);
        sb.append(" dBm");
        sb.append(strZ);
        return sb.toString();
    }

    private RadiotapDataAntennaSignal(Builder builder) {
        if (builder != null) {
            this.antennaSignal = builder.antennaSignal;
            return;
        }
        throw new NullPointerException("builder is null.");
    }
}
