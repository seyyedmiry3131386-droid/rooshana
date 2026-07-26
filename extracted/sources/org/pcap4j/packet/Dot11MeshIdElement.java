package org.pcap4j.packet;

import defpackage.o40;
import java.util.Arrays;
import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot11MeshIdElement extends Dot11InformationElement {
    private static final long serialVersionUID = 8808363321385383483L;
    private final byte[] meshId;

    public static final class Builder extends Dot11InformationElement.Builder {
        private byte[] meshId;

        public Builder meshId(byte[] bArr) {
            this.meshId = bArr;
            return this;
        }

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.MESH_ID.value()));
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            if (this.meshId == null) {
                throw new NullPointerException("meshId is null.");
            }
            if (getCorrectLengthAtBuild()) {
                length((byte) this.meshId.length);
            }
            return new Dot11MeshIdElement(this);
        }

        @Override // org.pcap4j.packet.Dot11InformationElement.Builder
        public Builder length(byte b) {
            super.length(b);
            return this;
        }

        @Override // org.pcap4j.packet.Dot11InformationElement.Builder, org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<Dot11InformationElement> correctLengthAtBuild2(boolean z) {
            super.correctLengthAtBuild2(z);
            return this;
        }

        private Builder(Dot11MeshIdElement dot11MeshIdElement) {
            super(dot11MeshIdElement);
            this.meshId = dot11MeshIdElement.meshId;
        }
    }

    public static Dot11MeshIdElement newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Dot11MeshIdElement(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        return super.equals(obj) && Arrays.equals(this.meshId, ((Dot11MeshIdElement) obj).meshId);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte[] getMeshId() {
        return ByteArrays.clone(this.meshId);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getElementId().value().byteValue();
        bArr[1] = getLength();
        byte[] bArr2 = this.meshId;
        System.arraycopy(bArr2, 0, bArr, 2, bArr2.length);
        return bArr;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        return Arrays.hashCode(this.meshId) + (super.hashCode() * 31);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        return this.meshId.length + 2;
    }

    public String toString() {
        return toString("");
    }

    private Dot11MeshIdElement(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        super(bArr, i, i2, Dot11InformationElementId.MESH_ID);
        int lengthAsInt = getLengthAsInt();
        if (lengthAsInt == 0) {
            this.meshId = new byte[0];
        } else {
            this.meshId = ByteArrays.getSubArray(bArr, i + 2, lengthAsInt);
        }
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "Mesh ID:", str, sb);
        sb.append("  Element ID: ");
        sb.append(getElementId());
        sb.append(strZ);
        sb.append(str);
        sb.append("  Length: ");
        sb.append(getLengthAsInt());
        sb.append(" bytes");
        sb.append(strZ);
        sb.append(str);
        sb.append("  Mesh ID: ");
        sb.append(new String(this.meshId));
        sb.append(" (0x");
        sb.append(ByteArrays.toHexString(this.meshId, ""));
        sb.append(")");
        sb.append(strZ);
        return sb.toString();
    }

    private Dot11MeshIdElement(Builder builder) {
        super(builder);
        if (builder.meshId.length <= 255) {
            this.meshId = ByteArrays.clone(builder.meshId);
        } else {
            throw new IllegalArgumentException("Too long meshId: " + builder.meshId);
        }
    }
}
