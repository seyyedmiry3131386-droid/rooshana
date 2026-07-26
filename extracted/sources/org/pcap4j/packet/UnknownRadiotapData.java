package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class UnknownRadiotapData implements RadiotapPacket.RadiotapData {
    private static final long serialVersionUID = 6405498375843386046L;
    private final byte[] rawData;

    public static final class Builder {
        private byte[] rawData;

        public UnknownRadiotapData build() {
            return new UnknownRadiotapData(this);
        }

        public Builder rawData(byte[] bArr) {
            this.rawData = bArr;
            return this;
        }

        public Builder() {
        }

        private Builder(UnknownRadiotapData unknownRadiotapData) {
            this.rawData = unknownRadiotapData.rawData;
        }
    }

    public static UnknownRadiotapData newInstance(byte[] bArr, int i, int i2) {
        ByteArrays.validateBounds(bArr, i, i2);
        return new UnknownRadiotapData(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (UnknownRadiotapData.class.isInstance(obj)) {
            return Arrays.equals(this.rawData, ((UnknownRadiotapData) obj).rawData);
        }
        return false;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        return ByteArrays.clone(this.rawData);
    }

    public int hashCode() {
        return Arrays.hashCode(this.rawData);
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return this.rawData.length;
    }

    public String toString() {
        return toString("");
    }

    private UnknownRadiotapData(byte[] bArr, int i, int i2) {
        this.rawData = ByteArrays.getSubArray(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "Unknown Data: ", str, sb);
        sb.append("  data: ");
        return t61.m(this.rawData, "", sb, strZ);
    }

    private UnknownRadiotapData(Builder builder) {
        if (builder != null && builder.rawData != null) {
            this.rawData = ByteArrays.clone(builder.rawData);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.rawData: " + builder.rawData);
    }
}
