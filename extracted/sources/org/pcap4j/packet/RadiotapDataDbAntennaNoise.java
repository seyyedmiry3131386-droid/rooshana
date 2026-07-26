package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class RadiotapDataDbAntennaNoise implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 1;
    private static final long serialVersionUID = 3285930614145918404L;
    private final byte antennaNoise;

    public static final class Builder {
        private byte antennaNoise;

        public Builder antennaNoise(byte b) {
            this.antennaNoise = b;
            return this;
        }

        public RadiotapDataDbAntennaNoise build() {
            return new RadiotapDataDbAntennaNoise(this);
        }

        public Builder() {
        }

        private Builder(RadiotapDataDbAntennaNoise radiotapDataDbAntennaNoise) {
            this.antennaNoise = radiotapDataDbAntennaNoise.antennaNoise;
        }
    }

    public static RadiotapDataDbAntennaNoise newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new RadiotapDataDbAntennaNoise(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return RadiotapDataDbAntennaNoise.class.isInstance(obj) && this.antennaNoise == ((RadiotapDataDbAntennaNoise) obj).antennaNoise;
    }

    public byte getAntennaNoise() {
        return this.antennaNoise;
    }

    public int getAntennaNoiseAsInt() {
        return this.antennaNoise & 255;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        return ByteArrays.toByteArray(this.antennaNoise);
    }

    public int hashCode() {
        return this.antennaNoise;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return 1;
    }

    public String toString() {
        return toString("");
    }

    private RadiotapDataDbAntennaNoise(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 >= 1) {
            this.antennaNoise = ByteArrays.getByte(bArr, i);
            return;
        }
        StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a RadiotapDbAntennaNoise (1 bytes). data: ");
        t61.t(i, " ", ", offset: ", sbA, bArr);
        sbA.append(", length: ");
        sbA.append(i2);
        throw new IllegalRawDataException(sbA.toString());
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "dB antenna noise: ", str, sb);
        sb.append("  Antenna noise: ");
        sb.append(getAntennaNoiseAsInt());
        sb.append(" dB");
        sb.append(strZ);
        return sb.toString();
    }

    private RadiotapDataDbAntennaNoise(Builder builder) {
        if (builder != null) {
            this.antennaNoise = builder.antennaNoise;
            return;
        }
        throw new NullPointerException("builder is null.");
    }
}
