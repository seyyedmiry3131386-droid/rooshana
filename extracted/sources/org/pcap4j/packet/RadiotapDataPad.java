package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class RadiotapDataPad implements RadiotapPacket.RadiotapData {
    private static final long serialVersionUID = 2443487622598511815L;
    private final byte[] pad;

    public static final class Builder {
        private byte[] pad;

        public RadiotapDataPad build() {
            return new RadiotapDataPad(this);
        }

        public Builder pad(byte[] bArr) {
            this.pad = bArr;
            return this;
        }

        public Builder() {
        }

        private Builder(RadiotapDataPad radiotapDataPad) {
            this.pad = radiotapDataPad.pad;
        }
    }

    public static RadiotapDataPad newInstance(byte[] bArr, int i, int i2) {
        ByteArrays.validateBounds(bArr, i, i2);
        return new RadiotapDataPad(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (RadiotapDataPad.class.isInstance(obj)) {
            return Arrays.equals(this.pad, ((RadiotapDataPad) obj).pad);
        }
        return false;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        return ByteArrays.clone(this.pad);
    }

    public int hashCode() {
        return Arrays.hashCode(this.pad);
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return this.pad.length;
    }

    public String toString() {
        return toString("");
    }

    private RadiotapDataPad(byte[] bArr, int i, int i2) {
        this.pad = ByteArrays.getSubArray(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "Pad: ", str, sb);
        sb.append("  data: ");
        return t61.m(this.pad, " ", sb, strZ);
    }

    private RadiotapDataPad(Builder builder) {
        if (builder != null && builder.pad != null) {
            this.pad = ByteArrays.clone(builder.pad);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.pad: " + builder.pad);
    }
}
