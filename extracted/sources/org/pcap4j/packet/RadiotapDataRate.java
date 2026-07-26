package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class RadiotapDataRate implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 1;
    private static final long serialVersionUID = 3381222627210403160L;
    private final byte rate;

    public static final class Builder {
        private byte rate;

        public RadiotapDataRate build() {
            return new RadiotapDataRate(this);
        }

        public Builder rate(byte b) {
            this.rate = b;
            return this;
        }

        public Builder() {
        }

        private Builder(RadiotapDataRate radiotapDataRate) {
            this.rate = radiotapDataRate.rate;
        }
    }

    public static RadiotapDataRate newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new RadiotapDataRate(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return RadiotapDataRate.class.isInstance(obj) && this.rate == ((RadiotapDataRate) obj).rate;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte getRate() {
        return this.rate;
    }

    public int getRateAsInt() {
        return this.rate & 255;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        return ByteArrays.toByteArray(this.rate);
    }

    public int hashCode() {
        return this.rate;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return 1;
    }

    public String toString() {
        return toString("");
    }

    private RadiotapDataRate(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 >= 1) {
            this.rate = ByteArrays.getByte(bArr, i);
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
        String strZ = o40.z("line.separator", str, "Rate: ", str, sb);
        sb.append("  Rate: ");
        sb.append(getRateAsInt() * 500);
        sb.append(" Kbps");
        sb.append(strZ);
        return sb.toString();
    }

    private RadiotapDataRate(Builder builder) {
        if (builder != null) {
            this.rate = builder.rate;
            return;
        }
        throw new NullPointerException("builder is null.");
    }
}
