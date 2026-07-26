package org.pcap4j.packet;

import defpackage.o40;
import org.pcap4j.packet.LlcPacket;
import org.pcap4j.packet.namednumber.LlcControlSupervisoryFunction;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class LlcControlSupervisory implements LlcPacket.LlcControl {
    private static final long serialVersionUID = 2248935134729569341L;
    private final boolean pfBit;
    private final byte receiveSequenceNumber;
    private final byte reserved;
    private final LlcControlSupervisoryFunction supervisoryFunction;

    public static final class Builder {
        private boolean pfBit;
        private byte receiveSequenceNumber;
        private byte reserved;
        private LlcControlSupervisoryFunction supervisoryFunction;

        public LlcControlSupervisory build() {
            return new LlcControlSupervisory(this);
        }

        public Builder pfBit(boolean z) {
            this.pfBit = z;
            return this;
        }

        public Builder receiveSequenceNumber(byte b) {
            this.receiveSequenceNumber = b;
            return this;
        }

        public Builder reserved(byte b) {
            this.reserved = b;
            return this;
        }

        public Builder supervisoryFunction(LlcControlSupervisoryFunction llcControlSupervisoryFunction) {
            this.supervisoryFunction = llcControlSupervisoryFunction;
            return this;
        }

        public Builder() {
        }

        private Builder(LlcControlSupervisory llcControlSupervisory) {
            this.receiveSequenceNumber = llcControlSupervisory.receiveSequenceNumber;
            this.pfBit = llcControlSupervisory.pfBit;
            this.reserved = llcControlSupervisory.reserved;
            this.supervisoryFunction = llcControlSupervisory.supervisoryFunction;
        }
    }

    public static LlcControlSupervisory newInstance(short s) throws IllegalRawDataException {
        return new LlcControlSupervisory(s);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!LlcControlSupervisory.class.isInstance(obj)) {
            return false;
        }
        LlcControlSupervisory llcControlSupervisory = (LlcControlSupervisory) obj;
        return this.receiveSequenceNumber == llcControlSupervisory.receiveSequenceNumber && this.supervisoryFunction.equals(llcControlSupervisory.supervisoryFunction) && this.reserved == llcControlSupervisory.reserved && this.pfBit == llcControlSupervisory.pfBit;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public LlcControlSupervisoryFunction getLlcSupervisoryFunction() {
        return this.supervisoryFunction;
    }

    public boolean getPfBit() {
        return this.pfBit;
    }

    @Override // org.pcap4j.packet.LlcPacket.LlcControl
    public byte[] getRawData() {
        byte[] bArr = new byte[2];
        byte b = (byte) (this.receiveSequenceNumber << 1);
        bArr[1] = b;
        if (this.pfBit) {
            bArr[1] = (byte) (b | 1);
        }
        bArr[0] = (byte) ((this.supervisoryFunction.value().byteValue() << 2) | 1 | (this.reserved << 4));
        return bArr;
    }

    public byte getReceiveSequenceNumber() {
        return this.receiveSequenceNumber;
    }

    public int getReceiveSequenceNumberAsInt() {
        return this.receiveSequenceNumber;
    }

    public byte getReserved() {
        return this.reserved;
    }

    public int hashCode() {
        return this.supervisoryFunction.hashCode() + ((((((this.receiveSequenceNumber + 31) * 31) + (this.pfBit ? 1231 : 1237)) * 31) + this.reserved) * 31);
    }

    @Override // org.pcap4j.packet.LlcPacket.LlcControl
    public int length() {
        return 2;
    }

    public String toString() {
        return "[receive sequence number: " + ((int) this.receiveSequenceNumber) + "] [P/F bit: " + (this.pfBit ? 1 : 0) + "] [reserved: " + ((int) this.reserved) + "] [supervisory function: " + this.supervisoryFunction + "]";
    }

    private LlcControlSupervisory(short s) throws IllegalRawDataException {
        if ((s & 768) != 256) {
            StringBuilder sbA = o40.A(50, "value & 0x0300 must be 0x0100. value: ");
            sbA.append(ByteArrays.toHexString(s, " "));
            throw new IllegalRawDataException(sbA.toString());
        }
        this.receiveSequenceNumber = (byte) ((s >> 1) & 127);
        if ((s & 1) == 0) {
            this.pfBit = false;
        } else {
            this.pfBit = true;
        }
        this.reserved = (byte) ((s >> 12) & 15);
        this.supervisoryFunction = LlcControlSupervisoryFunction.getInstance(Byte.valueOf((byte) ((s >> 10) & 3)));
    }

    private LlcControlSupervisory(Builder builder) {
        if (builder != null && builder.supervisoryFunction != null) {
            if (builder.receiveSequenceNumber >= 0) {
                if ((builder.reserved & 65280) == 0) {
                    this.receiveSequenceNumber = builder.receiveSequenceNumber;
                    this.pfBit = builder.pfBit;
                    this.reserved = builder.reserved;
                    this.supervisoryFunction = builder.supervisoryFunction;
                    return;
                }
                throw new IllegalArgumentException("reserved & 0xFF00 must be 0. reserved: " + ((int) builder.reserved));
            }
            throw new IllegalArgumentException("receiveSequenceNumber must be positive. receiveSequenceNumber: " + ((int) builder.receiveSequenceNumber));
        }
        throw new NullPointerException("builder: " + builder + " builder.supervisoryFunction: " + builder.supervisoryFunction);
    }
}
