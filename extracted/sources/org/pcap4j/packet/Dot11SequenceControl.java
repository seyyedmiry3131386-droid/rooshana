package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.io.Serializable;
import java.nio.ByteOrder;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot11SequenceControl implements Serializable {
    private static final long serialVersionUID = 8383319258993027L;
    private final byte fragmentNumber;
    private final short sequenceNumber;

    public static final class Builder {
        private byte fragmentNumber;
        private short sequenceNumber;

        public Dot11SequenceControl build() {
            return new Dot11SequenceControl(this);
        }

        public Builder fragmentNumber(byte b) {
            this.fragmentNumber = b;
            return this;
        }

        public Builder sequenceNumber(short s) {
            this.sequenceNumber = s;
            return this;
        }

        public Builder() {
        }

        private Builder(Dot11SequenceControl dot11SequenceControl) {
            this.fragmentNumber = dot11SequenceControl.fragmentNumber;
            this.sequenceNumber = dot11SequenceControl.sequenceNumber;
        }
    }

    public static Dot11SequenceControl newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Dot11SequenceControl(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Dot11SequenceControl.class != obj.getClass()) {
            return false;
        }
        Dot11SequenceControl dot11SequenceControl = (Dot11SequenceControl) obj;
        return this.fragmentNumber == dot11SequenceControl.fragmentNumber && this.sequenceNumber == dot11SequenceControl.sequenceNumber;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte getFragmentNumber() {
        return this.fragmentNumber;
    }

    public int getFragmentNumberAsInt() {
        return this.fragmentNumber;
    }

    public byte[] getRawData() {
        byte[] byteArray = ByteArrays.toByteArray((short) (this.sequenceNumber << 4), ByteOrder.LITTLE_ENDIAN);
        byteArray[0] = (byte) (byteArray[0] | this.fragmentNumber);
        return byteArray;
    }

    public short getSequenceNumber() {
        return this.sequenceNumber;
    }

    public int getSequenceNumberAsInt() {
        return this.sequenceNumber;
    }

    public int hashCode() {
        return ((this.fragmentNumber + 31) * 31) + this.sequenceNumber;
    }

    public int length() {
        return 2;
    }

    public String toString() {
        StringBuilder sbA = o40.A(250, "[Fragment Number: ");
        sbA.append(getFragmentNumberAsInt());
        sbA.append(", Sequence Number: ");
        sbA.append(getSequenceNumberAsInt());
        sbA.append("]");
        return sbA.toString();
    }

    private Dot11SequenceControl(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 >= 2) {
            this.fragmentNumber = (byte) (bArr[i] & 15);
            this.sequenceNumber = (short) ((ByteArrays.getShort(bArr, i, ByteOrder.LITTLE_ENDIAN) >> 4) & 4095);
        } else {
            StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a Dot11SequenceControl (2 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
    }

    private Dot11SequenceControl(Builder builder) {
        if (builder != null) {
            if ((builder.fragmentNumber & 240) == 0) {
                if ((builder.sequenceNumber & 61440) == 0) {
                    this.fragmentNumber = builder.fragmentNumber;
                    this.sequenceNumber = builder.sequenceNumber;
                    return;
                } else {
                    StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "(builder.sequenceNumber & 0xF000) must be zero. builder.sequenceNumber: ");
                    sbA.append((int) builder.sequenceNumber);
                    throw new IllegalArgumentException(sbA.toString());
                }
            }
            StringBuilder sbA2 = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "(builder.fragmentNumber & 0xF0) must be zero. builder.fragmentNumber: ");
            sbA2.append((int) builder.fragmentNumber);
            throw new IllegalArgumentException(sbA2.toString());
        }
        throw new NullPointerException("builder is null.");
    }
}
