package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.nio.ByteOrder;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class RadiotapDataLockQuality implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 2;
    private static final long serialVersionUID = -7889325752343077807L;
    private final short lockQuality;

    public static final class Builder {
        private short lockQuality;

        public RadiotapDataLockQuality build() {
            return new RadiotapDataLockQuality(this);
        }

        public Builder lockQuality(short s) {
            this.lockQuality = s;
            return this;
        }

        public Builder() {
        }

        private Builder(RadiotapDataLockQuality radiotapDataLockQuality) {
            this.lockQuality = radiotapDataLockQuality.lockQuality;
        }
    }

    public static RadiotapDataLockQuality newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new RadiotapDataLockQuality(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return RadiotapDataLockQuality.class.isInstance(obj) && this.lockQuality == ((RadiotapDataLockQuality) obj).lockQuality;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public short getLockQuality() {
        return this.lockQuality;
    }

    public int getLockQualityAsInt() {
        return this.lockQuality & 65535;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        return ByteArrays.toByteArray(this.lockQuality, ByteOrder.LITTLE_ENDIAN);
    }

    public int hashCode() {
        return this.lockQuality;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return 2;
    }

    public String toString() {
        return toString("");
    }

    private RadiotapDataLockQuality(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 >= 2) {
            this.lockQuality = ByteArrays.getShort(bArr, i, ByteOrder.LITTLE_ENDIAN);
            return;
        }
        StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a RadiotapLockQuality (2 bytes). data: ");
        t61.t(i, " ", ", offset: ", sbA, bArr);
        sbA.append(", length: ");
        sbA.append(i2);
        throw new IllegalRawDataException(sbA.toString());
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "Lock quality: ", str, sb);
        sb.append("  Lock quality: ");
        sb.append(getLockQualityAsInt());
        sb.append(strZ);
        return sb.toString();
    }

    private RadiotapDataLockQuality(Builder builder) {
        if (builder != null) {
            this.lockQuality = builder.lockQuality;
            return;
        }
        throw new NullPointerException("builder is null.");
    }
}
