package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import org.pcap4j.packet.LlcPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class LlcControlInformation implements LlcPacket.LlcControl {
    private static final long serialVersionUID = -4014592337107864662L;
    private final boolean pfBit;
    private final byte receiveSequenceNumber;
    private final byte sendSequenceNumber;

    public static final class Builder {
        private boolean pfBit;
        private byte receiveSequenceNumber;
        private byte sendSequenceNumber;

        public LlcControlInformation build() {
            return new LlcControlInformation(this);
        }

        public Builder pfBit(boolean z) {
            this.pfBit = z;
            return this;
        }

        public Builder receiveSequenceNumber(byte b) {
            this.receiveSequenceNumber = b;
            return this;
        }

        public Builder sendSequenceNumber(byte b) {
            this.sendSequenceNumber = b;
            return this;
        }

        public Builder() {
        }

        private Builder(LlcControlInformation llcControlInformation) {
            this.receiveSequenceNumber = llcControlInformation.receiveSequenceNumber;
            this.pfBit = llcControlInformation.pfBit;
            this.sendSequenceNumber = llcControlInformation.sendSequenceNumber;
        }
    }

    public static LlcControlInformation newInstance(short s) throws IllegalRawDataException {
        return new LlcControlInformation(s);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!LlcControlInformation.class.isInstance(obj)) {
            return false;
        }
        LlcControlInformation llcControlInformation = (LlcControlInformation) obj;
        return this.receiveSequenceNumber == llcControlInformation.receiveSequenceNumber && this.sendSequenceNumber == llcControlInformation.sendSequenceNumber && this.pfBit == llcControlInformation.pfBit;
    }

    public Builder getBuilder() {
        return new Builder();
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
        bArr[0] = (byte) (this.sendSequenceNumber << 1);
        return bArr;
    }

    public byte getReceiveSequenceNumber() {
        return this.receiveSequenceNumber;
    }

    public int getReceiveSequenceNumberAsInt() {
        return this.receiveSequenceNumber;
    }

    public byte getSendSequenceNumber() {
        return this.sendSequenceNumber;
    }

    public int getSendSequenceNumberAsInt() {
        return this.sendSequenceNumber;
    }

    public int hashCode() {
        return ((((this.receiveSequenceNumber + 31) * 31) + (this.pfBit ? 1231 : 1237)) * 31) + this.sendSequenceNumber;
    }

    @Override // org.pcap4j.packet.LlcPacket.LlcControl
    public int length() {
        return 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[receive sequence number: ");
        sb.append((int) this.receiveSequenceNumber);
        sb.append("] [P/F bit: ");
        sb.append(this.pfBit ? 1 : 0);
        sb.append("] [send sequence number: ");
        return dw1.k(this.sendSequenceNumber, "]", sb);
    }

    private LlcControlInformation(short s) throws IllegalRawDataException {
        if ((s & 256) != 0) {
            StringBuilder sbA = o40.A(50, "value & 0x0100 must be 0. value: ");
            sbA.append(ByteArrays.toHexString(s, " "));
            throw new IllegalRawDataException(sbA.toString());
        }
        this.receiveSequenceNumber = (byte) ((s >> 1) & 127);
        if ((s & 1) == 0) {
            this.pfBit = false;
        } else {
            this.pfBit = true;
        }
        this.sendSequenceNumber = (byte) ((s >> 9) & 127);
    }

    private LlcControlInformation(Builder builder) {
        if (builder != null) {
            if (builder.receiveSequenceNumber >= 0) {
                if (builder.sendSequenceNumber >= 0) {
                    this.receiveSequenceNumber = builder.receiveSequenceNumber;
                    this.pfBit = builder.pfBit;
                    this.sendSequenceNumber = builder.sendSequenceNumber;
                    return;
                } else {
                    throw new IllegalArgumentException("sendSequenceNumber must be positive. sendSequenceNumber: " + ((int) builder.sendSequenceNumber));
                }
            }
            throw new IllegalArgumentException("receiveSequenceNumber must be positive. receiveSequenceNumber: " + ((int) builder.receiveSequenceNumber));
        }
        throw new NullPointerException("builder must not be null.");
    }
}
