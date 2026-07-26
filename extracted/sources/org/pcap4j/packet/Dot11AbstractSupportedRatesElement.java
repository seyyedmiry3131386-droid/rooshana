package org.pcap4j.packet;

import defpackage.o40;
import defpackage.rm7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11BssMembershipSelector;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Dot11AbstractSupportedRatesElement extends Dot11InformationElement {
    private static final long serialVersionUID = -1751480012950433980L;
    private final List<BssMembershipSelector> bssMembershipSelectors;
    private final List<Rate> rates;
    private final List<Datum> ratesAndBssMembershipSelectors;

    public static final class BssMembershipSelector implements Datum {
        private static final long serialVersionUID = 5749787247631286263L;
        private final boolean basic;
        private final Dot11BssMembershipSelector selector;

        public BssMembershipSelector(boolean z, Dot11BssMembershipSelector dot11BssMembershipSelector) {
            if (dot11BssMembershipSelector == null) {
                throw new NullPointerException("selector is null.");
            }
            this.basic = z;
            this.selector = dot11BssMembershipSelector;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || BssMembershipSelector.class != obj.getClass()) {
                return false;
            }
            BssMembershipSelector bssMembershipSelector = (BssMembershipSelector) obj;
            return this.basic == bssMembershipSelector.basic && this.selector.equals(bssMembershipSelector.selector);
        }

        @Override // org.pcap4j.packet.Dot11AbstractSupportedRatesElement.Datum
        public byte getRawData() {
            int iByteValue = this.selector.value().byteValue();
            if (this.basic) {
                iByteValue |= 128;
            }
            return (byte) iByteValue;
        }

        public Dot11BssMembershipSelector getSelector() {
            return this.selector;
        }

        public int hashCode() {
            return this.selector.hashCode() + (((this.basic ? 1231 : 1237) + 31) * 31);
        }

        public boolean isBasic() {
            return this.basic;
        }

        public String toString() {
            StringBuilder sbA = o40.A(50, "BSS Membership Selector: ");
            sbA.append(this.selector);
            sbA.append(this.basic ? " (basic)" : " (non-basic)");
            return sbA.toString();
        }
    }

    public static abstract class Builder extends Dot11InformationElement.Builder {
        private List<Datum> ratesAndBssMembershipSelectors;

        public Builder() {
        }

        public void preBuild() {
            if (this.ratesAndBssMembershipSelectors == null) {
                throw new NullPointerException("ratesAndBssMembershipSelectors is null.");
            }
            if (getCorrectLengthAtBuild()) {
                length((byte) this.ratesAndBssMembershipSelectors.size());
            }
        }

        public Builder ratesAndBssMembershipSelectors(List<Datum> list) {
            this.ratesAndBssMembershipSelectors = list;
            return this;
        }

        public Builder(Dot11AbstractSupportedRatesElement dot11AbstractSupportedRatesElement) {
            super(dot11AbstractSupportedRatesElement);
            this.ratesAndBssMembershipSelectors = dot11AbstractSupportedRatesElement.ratesAndBssMembershipSelectors;
        }
    }

    public interface Datum extends Serializable {
        byte getRawData();
    }

    public static final class Rate implements Datum {
        private static final long serialVersionUID = -3227287901080960330L;
        private final boolean basic;
        private final byte rate;

        public Rate(boolean z, byte b) {
            if (b < 0) {
                throw new IllegalArgumentException(rm7.n(b, "The rate must be between 0 to 127 but is actually: "));
            }
            this.basic = z;
            this.rate = b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Rate.class != obj.getClass()) {
                return false;
            }
            Rate rate = (Rate) obj;
            return this.basic == rate.basic && this.rate == rate.rate;
        }

        public byte getRate() {
            return this.rate;
        }

        public double getRateInMbitPerSec() {
            return ((double) this.rate) * 0.5d;
        }

        @Override // org.pcap4j.packet.Dot11AbstractSupportedRatesElement.Datum
        public byte getRawData() {
            return (byte) (this.basic ? this.rate | 128 : this.rate);
        }

        public int hashCode() {
            return (((this.basic ? 1231 : 1237) + 31) * 31) + this.rate;
        }

        public boolean isBasic() {
            return this.basic;
        }

        public String toString() {
            StringBuilder sbA = o40.A(50, "Supported Rate: ");
            sbA.append(getRateInMbitPerSec());
            sbA.append(" Mbit/sec");
            sbA.append(this.basic ? " (basic)" : " (non-basic)");
            return sbA.toString();
        }
    }

    public Dot11AbstractSupportedRatesElement(byte[] bArr, int i, int i2, Dot11InformationElementId dot11InformationElementId) throws IllegalRawDataException {
        super(bArr, i, i2, dot11InformationElementId);
        this.rates = new ArrayList();
        this.bssMembershipSelectors = new ArrayList();
        this.ratesAndBssMembershipSelectors = new ArrayList();
        int lengthAsInt = getLengthAsInt();
        for (int i3 = 0; i3 < lengthAsInt; i3++) {
            byte b = bArr[i + 2 + i3];
            boolean z = (b & 128) != 0;
            byte b2 = (byte) (b & 127);
            if (Dot11BssMembershipSelector.isRegistered(Byte.valueOf(b2))) {
                BssMembershipSelector bssMembershipSelector = new BssMembershipSelector(z, Dot11BssMembershipSelector.getInstance(Byte.valueOf(b2)));
                this.bssMembershipSelectors.add(bssMembershipSelector);
                this.ratesAndBssMembershipSelectors.add(bssMembershipSelector);
            } else {
                Rate rate = new Rate(z, b2);
                this.rates.add(rate);
                this.ratesAndBssMembershipSelectors.add(rate);
            }
        }
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        return super.equals(obj) && this.ratesAndBssMembershipSelectors.equals(((Dot11AbstractSupportedRatesElement) obj).ratesAndBssMembershipSelectors);
    }

    public List<BssMembershipSelector> getBssMembershipSelectors() {
        return new ArrayList(this.bssMembershipSelectors);
    }

    public abstract Builder getBuilder();

    public abstract String getElementName();

    public List<Rate> getRates() {
        return new ArrayList(this.rates);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getElementId().value().byteValue();
        bArr[1] = getLength();
        Iterator<Datum> it = this.ratesAndBssMembershipSelectors.iterator();
        int i = 2;
        while (it.hasNext()) {
            bArr[i] = it.next().getRawData();
            i++;
        }
        return bArr;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        return this.ratesAndBssMembershipSelectors.hashCode() + (super.hashCode() * 31);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        return this.ratesAndBssMembershipSelectors.size() + 2;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb.append(str);
        sb.append(getElementName());
        sb.append(":");
        sb.append(property);
        sb.append(str);
        sb.append("  Element ID: ");
        sb.append(getElementId());
        sb.append(property);
        sb.append(str);
        sb.append("  Length: ");
        sb.append(getLengthAsInt());
        sb.append(" bytes");
        sb.append(property);
        for (Datum datum : this.ratesAndBssMembershipSelectors) {
            sb.append(str);
            sb.append("  ");
            sb.append(datum);
            sb.append(property);
        }
        return sb.toString();
    }

    public Dot11AbstractSupportedRatesElement(Builder builder) {
        super(builder);
        if (builder.ratesAndBssMembershipSelectors.size() > 255) {
            throw new IllegalArgumentException("Too long ratesAndBssMembershipSelectors: " + builder.ratesAndBssMembershipSelectors);
        }
        this.rates = new ArrayList();
        this.bssMembershipSelectors = new ArrayList();
        for (Datum datum : builder.ratesAndBssMembershipSelectors) {
            if (datum instanceof Rate) {
                this.rates.add((Rate) datum);
            } else if (datum instanceof BssMembershipSelector) {
                this.bssMembershipSelectors.add((BssMembershipSelector) datum);
            } else {
                throw new IllegalArgumentException("An illegal object in builder.ratesAndBssMembershipSelectors: " + datum);
            }
        }
        this.ratesAndBssMembershipSelectors = new ArrayList(builder.ratesAndBssMembershipSelectors);
    }
}
