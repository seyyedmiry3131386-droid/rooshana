package org.pcap4j.packet;

import java.util.List;
import org.pcap4j.packet.Dot11AbstractSupportedRatesElement;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot11ExtendedSupportedRatesElement extends Dot11AbstractSupportedRatesElement {
    private static final long serialVersionUID = 8779245835470631343L;

    public static final class Builder extends Dot11AbstractSupportedRatesElement.Builder {
        @Override // org.pcap4j.packet.Dot11AbstractSupportedRatesElement.Builder
        public /* bridge */ /* synthetic */ Dot11AbstractSupportedRatesElement.Builder ratesAndBssMembershipSelectors(List list) {
            return ratesAndBssMembershipSelectors((List<Dot11AbstractSupportedRatesElement.Datum>) list);
        }

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.EXTENDED_SUPPORTED_RATES.value()));
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            preBuild();
            return new Dot11ExtendedSupportedRatesElement(this);
        }

        @Override // org.pcap4j.packet.Dot11InformationElement.Builder
        public Builder length(byte b) {
            super.length(b);
            return this;
        }

        @Override // org.pcap4j.packet.Dot11AbstractSupportedRatesElement.Builder
        public Builder ratesAndBssMembershipSelectors(List<Dot11AbstractSupportedRatesElement.Datum> list) {
            super.ratesAndBssMembershipSelectors(list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.pcap4j.packet.Dot11InformationElement.Builder, org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild */
        public LengthBuilder<Dot11InformationElement> correctLengthAtBuild2(boolean z) {
            super.correctLengthAtBuild2(z);
            return this;
        }

        private Builder(Dot11ExtendedSupportedRatesElement dot11ExtendedSupportedRatesElement) {
            super(dot11ExtendedSupportedRatesElement);
        }
    }

    public static Dot11ExtendedSupportedRatesElement newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Dot11ExtendedSupportedRatesElement(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.Dot11AbstractSupportedRatesElement
    public String getElementName() {
        return "Extended Supported Rates";
    }

    private Dot11ExtendedSupportedRatesElement(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        super(bArr, i, i2, Dot11InformationElementId.EXTENDED_SUPPORTED_RATES);
    }

    @Override // org.pcap4j.packet.Dot11AbstractSupportedRatesElement
    public Builder getBuilder() {
        return new Builder();
    }

    private Dot11ExtendedSupportedRatesElement(Builder builder) {
        super(builder);
    }
}
