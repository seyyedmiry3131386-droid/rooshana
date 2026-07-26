package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import org.pcap4j.packet.LlcPacket;
import org.pcap4j.packet.namednumber.LlcControlModifierFunction;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class LlcControlUnnumbered implements LlcPacket.LlcControl {
    private static final long serialVersionUID = 8688698899763120721L;
    private final LlcControlModifierFunction modifierFunction;
    private final boolean pfBit;

    public static final class Builder {
        private LlcControlModifierFunction modifierFunction;
        private boolean pfBit;

        public LlcControlUnnumbered build() {
            return new LlcControlUnnumbered(this);
        }

        public Builder modifierFunction(LlcControlModifierFunction llcControlModifierFunction) {
            this.modifierFunction = llcControlModifierFunction;
            return this;
        }

        public Builder pfBit(boolean z) {
            this.pfBit = z;
            return this;
        }

        public Builder() {
        }

        private Builder(LlcControlUnnumbered llcControlUnnumbered) {
            this.modifierFunction = llcControlUnnumbered.modifierFunction;
            this.pfBit = llcControlUnnumbered.pfBit;
        }
    }

    public static LlcControlUnnumbered newInstance(byte b) throws IllegalRawDataException {
        return new LlcControlUnnumbered(b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!LlcControlUnnumbered.class.isInstance(obj)) {
            return false;
        }
        LlcControlUnnumbered llcControlUnnumbered = (LlcControlUnnumbered) obj;
        return this.modifierFunction.equals(llcControlUnnumbered.modifierFunction) && this.pfBit == llcControlUnnumbered.pfBit;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public LlcControlModifierFunction getModifierFunction() {
        return this.modifierFunction;
    }

    public boolean getPfBit() {
        return this.pfBit;
    }

    @Override // org.pcap4j.packet.LlcPacket.LlcControl
    public byte[] getRawData() {
        byte bByteValue = (byte) ((this.modifierFunction.value().byteValue() << 2) | 3);
        byte[] bArr = {bByteValue};
        if (this.pfBit) {
            bArr[0] = (byte) (bByteValue | 16);
        }
        return bArr;
    }

    public int hashCode() {
        return ((this.modifierFunction.hashCode() + 31) * 31) + (this.pfBit ? 1231 : 1237);
    }

    @Override // org.pcap4j.packet.LlcPacket.LlcControl
    public int length() {
        return 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[modifier function: ");
        sb.append(this.modifierFunction);
        sb.append("] [P/F bit: ");
        return dw1.k(this.pfBit ? 1 : 0, "]", sb);
    }

    private LlcControlUnnumbered(byte b) throws IllegalRawDataException {
        if ((b & 3) != 3) {
            StringBuilder sbA = o40.A(50, "Both the lsb and the second lsb of the value must be 1. value: ");
            sbA.append(ByteArrays.toHexString(b, " "));
            throw new IllegalRawDataException(sbA.toString());
        }
        this.modifierFunction = LlcControlModifierFunction.getInstance(Byte.valueOf((byte) ((b >> 2) & 59)));
        if ((b & 16) == 0) {
            this.pfBit = false;
        } else {
            this.pfBit = true;
        }
    }

    private LlcControlUnnumbered(Builder builder) {
        if (builder != null && builder.modifierFunction != null) {
            this.modifierFunction = builder.modifierFunction;
            this.pfBit = builder.pfBit;
        } else {
            throw new NullPointerException("builder: " + builder + " builder.modifierFunction: " + builder.modifierFunction);
        }
    }
}
