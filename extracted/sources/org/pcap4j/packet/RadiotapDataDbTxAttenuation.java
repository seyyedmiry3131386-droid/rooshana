package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.nio.ByteOrder;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class RadiotapDataDbTxAttenuation implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 2;
    private static final long serialVersionUID = -3813324361353987917L;
    private final short txAttenuation;

    public static final class Builder {
        private short txAttenuation;

        public RadiotapDataDbTxAttenuation build() {
            return new RadiotapDataDbTxAttenuation(this);
        }

        public Builder txAttenuation(short s) {
            this.txAttenuation = s;
            return this;
        }

        public Builder() {
        }

        private Builder(RadiotapDataDbTxAttenuation radiotapDataDbTxAttenuation) {
            this.txAttenuation = radiotapDataDbTxAttenuation.txAttenuation;
        }
    }

    public static RadiotapDataDbTxAttenuation newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new RadiotapDataDbTxAttenuation(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return RadiotapDataDbTxAttenuation.class.isInstance(obj) && this.txAttenuation == ((RadiotapDataDbTxAttenuation) obj).txAttenuation;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        return ByteArrays.toByteArray(this.txAttenuation, ByteOrder.LITTLE_ENDIAN);
    }

    public short getTxAttenuation() {
        return this.txAttenuation;
    }

    public int getTxAttenuationAsInt() {
        return this.txAttenuation & 65535;
    }

    public int hashCode() {
        return this.txAttenuation;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return 2;
    }

    public String toString() {
        return toString("");
    }

    private RadiotapDataDbTxAttenuation(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 >= 2) {
            this.txAttenuation = ByteArrays.getShort(bArr, i, ByteOrder.LITTLE_ENDIAN);
            return;
        }
        StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a RadiotapDbTxAttenuation (2 bytes). data: ");
        t61.t(i, " ", ", offset: ", sbA, bArr);
        sbA.append(", length: ");
        sbA.append(i2);
        throw new IllegalRawDataException(sbA.toString());
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "dB TX attenuation: ", str, sb);
        sb.append("  TX attenuation: ");
        sb.append(getTxAttenuationAsInt());
        sb.append(" dB");
        sb.append(strZ);
        return sb.toString();
    }

    private RadiotapDataDbTxAttenuation(Builder builder) {
        if (builder != null) {
            this.txAttenuation = builder.txAttenuation;
            return;
        }
        throw new NullPointerException("builder is null.");
    }
}
