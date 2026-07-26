package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IllegalRadiotapData implements RadiotapPacket.RadiotapData {
    private static final long serialVersionUID = 6405498375843386046L;
    private final byte[] rawData;

    public static final class Builder {
        private byte[] rawData;

        public IllegalRadiotapData build() {
            return new IllegalRadiotapData(this);
        }

        public Builder rawData(byte[] bArr) {
            this.rawData = bArr;
            return this;
        }

        public Builder() {
        }

        private Builder(IllegalRadiotapData illegalRadiotapData) {
            this.rawData = illegalRadiotapData.rawData;
        }
    }

    public static IllegalRadiotapData newInstance(byte[] bArr, int i, int i2) {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IllegalRadiotapData(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (IllegalRadiotapData.class.isInstance(obj)) {
            return Arrays.equals(this.rawData, ((IllegalRadiotapData) obj).rawData);
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

    private IllegalRadiotapData(byte[] bArr, int i, int i2) {
        this.rawData = ByteArrays.getSubArray(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "Illegal Data: ", str, sb);
        sb.append("  data: ");
        return t61.m(this.rawData, "", sb, strZ);
    }

    private IllegalRadiotapData(Builder builder) {
        if (builder != null && builder.rawData != null) {
            this.rawData = ByteArrays.clone(builder.rawData);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.rawData: " + builder.rawData);
    }
}
