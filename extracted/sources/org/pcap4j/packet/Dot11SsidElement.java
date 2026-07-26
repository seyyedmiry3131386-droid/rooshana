package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import java.nio.charset.Charset;
import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot11SsidElement extends Dot11InformationElement {
    private static final Charset ENCODING = Charset.forName("UTF-8");
    private static final long serialVersionUID = 2213115521616826185L;
    private final String ssid;

    public static final class Builder extends Dot11InformationElement.Builder {
        private String ssid;

        public Builder ssid(String str) {
            this.ssid = str;
            return this;
        }

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.SSID.value()));
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            if (this.ssid != null) {
                if (getCorrectLengthAtBuild()) {
                    length((byte) this.ssid.getBytes(Dot11SsidElement.ENCODING).length);
                }
                return new Dot11SsidElement(this);
            }
            throw new NullPointerException("ssid: " + this.ssid);
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

        private Builder(Dot11SsidElement dot11SsidElement) {
            super(dot11SsidElement);
            this.ssid = dot11SsidElement.ssid;
        }
    }

    public static Dot11SsidElement newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Dot11SsidElement(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        return super.equals(obj) && this.ssid.equals(((Dot11SsidElement) obj).ssid);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        byte[] bytes = this.ssid.getBytes(ENCODING);
        byte[] bArr = new byte[bytes.length + 2];
        bArr[0] = getElementId().value().byteValue();
        bArr[1] = getLength();
        System.arraycopy(bytes, 0, bArr, 2, bytes.length);
        return bArr;
    }

    public String getSsid() {
        return this.ssid;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        return this.ssid.hashCode() + (super.hashCode() * 31);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        return this.ssid.getBytes(ENCODING).length + 2;
    }

    public String toString() {
        return toString("");
    }

    private Dot11SsidElement(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        super(bArr, i, i2, Dot11InformationElementId.SSID);
        this.ssid = new String(bArr, i + 2, getLengthAsInt(), ENCODING);
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "SSID:", str, sb);
        sb.append("  Element ID: ");
        sb.append(getElementId());
        sb.append(strZ);
        sb.append(str);
        sb.append("  Length: ");
        sb.append(getLengthAsInt());
        sb.append(" bytes");
        sb.append(strZ);
        sb.append(str);
        sb.append("  SSID: ");
        return dw1.s(sb, this.ssid, strZ);
    }

    private Dot11SsidElement(Builder builder) {
        super(builder);
        if (builder.ssid.getBytes(ENCODING).length <= 255) {
            this.ssid = builder.ssid;
        } else {
            throw new IllegalArgumentException("Too long ssid: " + builder.ssid);
        }
    }
}
