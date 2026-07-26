package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.io.Serializable;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Dot11InformationElement implements Serializable {
    private static final long serialVersionUID = 3620485938137514351L;
    private final Dot11InformationElementId elementId;
    private final byte length;

    public static abstract class Builder implements LengthBuilder<Dot11InformationElement> {
        private boolean correctLengthAtBuild;
        private Dot11InformationElementId elementId;
        private byte length;

        public Builder() {
        }

        public Builder elementId(Dot11InformationElementId dot11InformationElementId) {
            this.elementId = dot11InformationElementId;
            return this;
        }

        public boolean getCorrectLengthAtBuild() {
            return this.correctLengthAtBuild;
        }

        public Builder length(byte b) {
            this.length = b;
            return this;
        }

        public Builder(Dot11InformationElement dot11InformationElement) {
            this.elementId = dot11InformationElement.elementId;
            this.length = dot11InformationElement.length;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild */
        public LengthBuilder<Dot11InformationElement> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }
    }

    public Dot11InformationElement(byte[] bArr, int i, int i2, Dot11InformationElementId dot11InformationElementId) throws IllegalRawDataException {
        if (i2 < 2) {
            StringBuilder sbA = o40.A(100, "The raw data length must be more than 1. rawData: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        if (bArr[i] != dot11InformationElementId.value().byteValue()) {
            StringBuilder sbA2 = o40.A(100, "The element ID must be ");
            sbA2.append(dot11InformationElementId.valueAsString());
            sbA2.append(" but is actually ");
            sbA2.append((int) bArr[i]);
            sbA2.append(". rawData: ");
            sbA2.append(ByteArrays.toHexString(bArr, " "));
            sbA2.append(", offset: ");
            sbA2.append(i);
            sbA2.append(", length: ");
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }
        this.elementId = dot11InformationElementId;
        this.length = bArr[i + 1];
        int lengthAsInt = getLengthAsInt();
        if (lengthAsInt <= i2 - 2) {
            return;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append("rawData is too short. length field: ");
        sb.append(lengthAsInt);
        sb.append(", rawData: ");
        t61.t(i, " ", ", offset: ", sb, bArr);
        sb.append(", length: ");
        sb.append(i2);
        throw new IllegalRawDataException(sb.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Dot11InformationElement dot11InformationElement = (Dot11InformationElement) obj;
        return this.elementId.equals(dot11InformationElement.elementId) && this.length == dot11InformationElement.length;
    }

    public Dot11InformationElementId getElementId() {
        return this.elementId;
    }

    public byte getLength() {
        return this.length;
    }

    public int getLengthAsInt() {
        return this.length & 255;
    }

    public abstract byte[] getRawData();

    public int hashCode() {
        return ((this.elementId.hashCode() + 31) * 31) + this.length;
    }

    public abstract int length();

    public Dot11InformationElement(Builder builder) {
        if (builder != null && builder.elementId != null) {
            this.elementId = builder.elementId;
            this.length = builder.length;
        } else {
            throw new NullPointerException("builder: " + builder + " builder.elementId: " + builder.elementId);
        }
    }
}
