package org.pcap4j.packet;

import defpackage.o40;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot11SsidListElement extends Dot11InformationElement {
    private static final long serialVersionUID = 1424839847229135121L;
    private final List<Dot11SsidElement> ssidList;

    public static final class Builder extends Dot11InformationElement.Builder {
        private List<Dot11SsidElement> ssidList;

        public Builder ssidList(List<Dot11SsidElement> list) {
            this.ssidList = list;
            return this;
        }

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.SSID_LIST.value()));
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            List<Dot11SsidElement> list = this.ssidList;
            if (list == null) {
                throw new NullPointerException("ssidList: " + this.ssidList);
            }
            Iterator<Dot11SsidElement> it = list.iterator();
            int length = 0;
            while (it.hasNext()) {
                length += it.next().length();
            }
            if (length <= 255) {
                if (getCorrectLengthAtBuild()) {
                    length((byte) length);
                }
                return new Dot11SsidListElement(this);
            }
            throw new IllegalArgumentException("Too long ssidList: " + this.ssidList);
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

        private Builder(Dot11SsidListElement dot11SsidListElement) {
            super(dot11SsidListElement);
            this.ssidList = dot11SsidListElement.ssidList;
        }
    }

    public static Dot11SsidListElement newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Dot11SsidListElement(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        return super.equals(obj) && this.ssidList.equals(((Dot11SsidListElement) obj).ssidList);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getElementId().value().byteValue();
        bArr[1] = getLength();
        Iterator<Dot11SsidElement> it = this.ssidList.iterator();
        int length = 2;
        while (it.hasNext()) {
            byte[] rawData = it.next().getRawData();
            System.arraycopy(rawData, 0, bArr, length, rawData.length);
            length += rawData.length;
        }
        return bArr;
    }

    public List<Dot11SsidElement> getSsidList() {
        return new ArrayList(this.ssidList);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        return this.ssidList.hashCode() + (super.hashCode() * 31);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        Iterator<Dot11SsidElement> it = this.ssidList.iterator();
        int length = 2;
        while (it.hasNext()) {
            length += it.next().length();
        }
        return length;
    }

    public String toString() {
        return toString("");
    }

    private Dot11SsidListElement(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        super(bArr, i, i2, Dot11InformationElementId.SSID_LIST);
        int lengthAsInt = getLengthAsInt();
        this.ssidList = new ArrayList();
        int i3 = i + 2;
        while (lengthAsInt > 0) {
            Dot11SsidElement dot11SsidElementNewInstance = Dot11SsidElement.newInstance(bArr, i3, lengthAsInt);
            this.ssidList.add(dot11SsidElementNewInstance);
            int length = dot11SsidElementNewInstance.length();
            lengthAsInt -= length;
            i3 += length;
        }
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "SSID List:", str, sb);
        sb.append("  Element ID: ");
        sb.append(getElementId());
        sb.append(strZ);
        sb.append(str);
        sb.append("  Length: ");
        sb.append(getLengthAsInt());
        sb.append(" bytes");
        sb.append(strZ);
        for (Dot11SsidElement dot11SsidElement : this.ssidList) {
            sb.append(str);
            sb.append("  SSID: ");
            sb.append(dot11SsidElement.getSsid());
            sb.append(strZ);
        }
        return sb.toString();
    }

    private Dot11SsidListElement(Builder builder) {
        super(builder);
        this.ssidList = new ArrayList(builder.ssidList);
    }
}
