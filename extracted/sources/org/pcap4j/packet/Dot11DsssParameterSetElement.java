package org.pcap4j.packet;

import defpackage.o40;
import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot11DsssParameterSetElement extends Dot11InformationElement {
    private static final long serialVersionUID = 3289074676325930942L;
    private final byte currentChannel;

    public static final class Builder extends Dot11InformationElement.Builder {
        private byte currentChannel;

        public Builder currentChannel(byte b) {
            this.currentChannel = b;
            return this;
        }

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.DSSS_PARAMETER_SET.value()));
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            if (getCorrectLengthAtBuild()) {
                length((byte) 1);
            }
            return new Dot11DsssParameterSetElement(this);
        }

        @Override // org.pcap4j.packet.Dot11InformationElement.Builder
        public Builder length(byte b) {
            super.length(b);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.pcap4j.packet.Dot11InformationElement.Builder, org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild */
        public LengthBuilder<Dot11InformationElement> correctLengthAtBuild2(boolean z) {
            super.correctLengthAtBuild2(z);
            return this;
        }

        private Builder(Dot11DsssParameterSetElement dot11DsssParameterSetElement) {
            super(dot11DsssParameterSetElement);
            this.currentChannel = dot11DsssParameterSetElement.currentChannel;
        }
    }

    public static Dot11DsssParameterSetElement newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Dot11DsssParameterSetElement(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        return super.equals(obj) && this.currentChannel == ((Dot11DsssParameterSetElement) obj).currentChannel;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte getCurrentChannel() {
        return this.currentChannel;
    }

    public int getCurrentChannelAsInt() {
        return this.currentChannel & 255;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        return new byte[]{getElementId().value().byteValue(), getLength(), this.currentChannel};
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        return (super.hashCode() * 31) + this.currentChannel;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        return 3;
    }

    public String toString() {
        return toString("");
    }

    private Dot11DsssParameterSetElement(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        super(bArr, i, i2, Dot11InformationElementId.DSSS_PARAMETER_SET);
        if (getLengthAsInt() == 1) {
            this.currentChannel = bArr[i + 2];
        } else {
            throw new IllegalRawDataException("The length must be 1 but is actually: " + getLengthAsInt());
        }
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "DSSS Parameter Set:", str, sb);
        sb.append("  Element ID: ");
        sb.append(getElementId());
        sb.append(strZ);
        sb.append(str);
        sb.append("  Length: ");
        sb.append(getLengthAsInt());
        sb.append(" bytes");
        sb.append(strZ);
        sb.append(str);
        sb.append("  Current Channel: ");
        sb.append(getCurrentChannelAsInt());
        sb.append(strZ);
        return sb.toString();
    }

    private Dot11DsssParameterSetElement(Builder builder) {
        super(builder);
        this.currentChannel = builder.currentChannel;
    }
}
