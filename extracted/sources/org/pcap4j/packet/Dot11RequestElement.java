package org.pcap4j.packet;

import defpackage.o40;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot11RequestElement extends Dot11InformationElement {
    private static final long serialVersionUID = -4248529314922213901L;
    private final List<Dot11InformationElementId> requestedElementIds;

    public static final class Builder extends Dot11InformationElement.Builder {
        private List<Dot11InformationElementId> requestedElementIds;

        public Builder requestedElementIds(List<Dot11InformationElementId> list) {
            this.requestedElementIds = list;
            return this;
        }

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.REQUEST.value()));
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            if (this.requestedElementIds != null) {
                if (getCorrectLengthAtBuild()) {
                    length((byte) this.requestedElementIds.size());
                }
                return new Dot11RequestElement(this);
            }
            throw new NullPointerException("requestedElementIds: " + this.requestedElementIds);
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

        private Builder(Dot11RequestElement dot11RequestElement) {
            super(dot11RequestElement);
            this.requestedElementIds = dot11RequestElement.requestedElementIds;
        }
    }

    public static Dot11RequestElement newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Dot11RequestElement(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        return super.equals(obj) && this.requestedElementIds.equals(((Dot11RequestElement) obj).requestedElementIds);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        int i = 0;
        bArr[0] = getElementId().value().byteValue();
        bArr[1] = getLength();
        Iterator<Dot11InformationElementId> it = this.requestedElementIds.iterator();
        while (it.hasNext()) {
            bArr[i + 2] = it.next().value().byteValue();
            i++;
        }
        return bArr;
    }

    public List<Dot11InformationElementId> getRequestedElementIds() {
        return new ArrayList(this.requestedElementIds);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        return this.requestedElementIds.hashCode() + (super.hashCode() * 31);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        return this.requestedElementIds.size() + 2;
    }

    public String toString() {
        return toString("");
    }

    private Dot11RequestElement(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        super(bArr, i, i2, Dot11InformationElementId.REQUEST);
        int lengthAsInt = getLengthAsInt();
        this.requestedElementIds = new ArrayList(lengthAsInt);
        for (int i3 = 0; i3 < lengthAsInt; i3++) {
            this.requestedElementIds.add(Dot11InformationElementId.getInstance(Byte.valueOf(bArr[i + 2 + i3])));
        }
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "Request:", str, sb);
        sb.append("  Element ID: ");
        sb.append(getElementId());
        sb.append(strZ);
        sb.append(str);
        sb.append("  Length: ");
        sb.append(getLengthAsInt());
        sb.append(" bytes");
        sb.append(strZ);
        for (Dot11InformationElementId dot11InformationElementId : this.requestedElementIds) {
            sb.append(str);
            sb.append("  Requested Element: ");
            sb.append(dot11InformationElementId);
            sb.append(strZ);
        }
        return sb.toString();
    }

    private Dot11RequestElement(Builder builder) {
        super(builder);
        if (builder.requestedElementIds.size() > 255) {
            throw new IllegalArgumentException("Too long requestedElementIds: " + builder.requestedElementIds);
        }
        this.requestedElementIds = new ArrayList(builder.requestedElementIds);
    }
}
