package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.namednumber.IpV4OptionType;
import org.pcap4j.packet.namednumber.IpV4SecurityOptionCompartments;
import org.pcap4j.packet.namednumber.IpV4SecurityOptionHandlingRestrictions;
import org.pcap4j.packet.namednumber.IpV4SecurityOptionSecurity;
import org.pcap4j.packet.namednumber.IpV4SecurityOptionTransmissionControlCode;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV4Rfc791SecurityOption implements IpV4Packet.IpV4Option {
    private static final long serialVersionUID = -7385398208873489520L;
    private final IpV4SecurityOptionCompartments compartments;
    private final IpV4SecurityOptionHandlingRestrictions handlingRestrictions;
    private final byte length;
    private final IpV4SecurityOptionSecurity security;
    private final IpV4SecurityOptionTransmissionControlCode tcc;
    private final IpV4OptionType type;

    public static final class Builder implements LengthBuilder<IpV4Rfc791SecurityOption> {
        private IpV4SecurityOptionCompartments compartments;
        private boolean correctLengthAtBuild;
        private IpV4SecurityOptionHandlingRestrictions handlingRestrictions;
        private byte length;
        private IpV4SecurityOptionSecurity security;
        private IpV4SecurityOptionTransmissionControlCode tcc;

        public Builder compartments(IpV4SecurityOptionCompartments ipV4SecurityOptionCompartments) {
            this.compartments = ipV4SecurityOptionCompartments;
            return this;
        }

        public Builder handlingRestrictions(IpV4SecurityOptionHandlingRestrictions ipV4SecurityOptionHandlingRestrictions) {
            this.handlingRestrictions = ipV4SecurityOptionHandlingRestrictions;
            return this;
        }

        public Builder length(byte b) {
            this.length = b;
            return this;
        }

        public Builder security(IpV4SecurityOptionSecurity ipV4SecurityOptionSecurity) {
            this.security = ipV4SecurityOptionSecurity;
            return this;
        }

        public Builder tcc(IpV4SecurityOptionTransmissionControlCode ipV4SecurityOptionTransmissionControlCode) {
            this.tcc = ipV4SecurityOptionTransmissionControlCode;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public IpV4Rfc791SecurityOption build() {
            return new IpV4Rfc791SecurityOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV4Rfc791SecurityOption> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        private Builder(IpV4Rfc791SecurityOption ipV4Rfc791SecurityOption) {
            this.length = ipV4Rfc791SecurityOption.length;
            this.security = ipV4Rfc791SecurityOption.security;
            this.compartments = ipV4Rfc791SecurityOption.compartments;
            this.handlingRestrictions = ipV4Rfc791SecurityOption.handlingRestrictions;
            this.tcc = ipV4Rfc791SecurityOption.tcc;
        }
    }

    public static IpV4Rfc791SecurityOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IpV4Rfc791SecurityOption(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!IpV4Rfc791SecurityOption.class.isInstance(obj)) {
            return false;
        }
        IpV4Rfc791SecurityOption ipV4Rfc791SecurityOption = (IpV4Rfc791SecurityOption) obj;
        return this.length == ipV4Rfc791SecurityOption.length && this.security.equals(ipV4Rfc791SecurityOption.security) && this.compartments.equals(ipV4Rfc791SecurityOption.compartments) && this.handlingRestrictions.equals(ipV4Rfc791SecurityOption.handlingRestrictions) && this.tcc.equals(ipV4Rfc791SecurityOption.tcc);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public IpV4SecurityOptionCompartments getCompartments() {
        return this.compartments;
    }

    public IpV4SecurityOptionHandlingRestrictions getHandlingRestrictions() {
        return this.handlingRestrictions;
    }

    public byte getLength() {
        return this.length;
    }

    public int getLengthAsInt() {
        return this.length & 255;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getType().value().byteValue();
        bArr[1] = this.length;
        bArr[2] = (byte) (this.security.value().shortValue() >> 8);
        bArr[3] = (byte) this.security.value().shortValue();
        bArr[4] = (byte) (this.compartments.value().shortValue() >> 8);
        bArr[5] = (byte) this.compartments.value().shortValue();
        bArr[6] = (byte) (this.handlingRestrictions.value().shortValue() >> 8);
        bArr[7] = (byte) this.handlingRestrictions.value().shortValue();
        bArr[8] = (byte) (this.tcc.value().intValue() >> 16);
        bArr[9] = (byte) (this.tcc.value().intValue() >> 8);
        bArr[10] = (byte) this.tcc.value().shortValue();
        return bArr;
    }

    public IpV4SecurityOptionSecurity getSecurity() {
        return this.security;
    }

    public IpV4SecurityOptionTransmissionControlCode getTcc() {
        return this.tcc;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public IpV4OptionType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.tcc.hashCode() + ((this.handlingRestrictions.hashCode() + ((this.compartments.hashCode() + ((this.security.hashCode() + ((527 + this.length) * 31)) * 31)) * 31)) * 31);
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public int length() {
        return 11;
    }

    public String toString() {
        return "[option-type: " + getType() + "] [option-length: " + getLengthAsInt() + " byte] [security: " + this.security + "] [compartments: " + this.compartments + "] [handlingRestrictions: " + this.handlingRestrictions + "] [tcc: " + this.tcc + "]";
    }

    private IpV4Rfc791SecurityOption(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.type = IpV4OptionType.SECURITY;
        if (i2 < 11) {
            StringBuilder sbA = o40.A(50, "The raw data length must be more than 10. rawData: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        if (bArr[i] != getType().value().byteValue()) {
            StringBuilder sbA2 = o40.A(100, "The type must be: ");
            sbA2.append(getType().valueAsString());
            sbA2.append(" rawData: ");
            sbA2.append(ByteArrays.toHexString(bArr, " "));
            sbA2.append(", offset: ");
            sbA2.append(i);
            sbA2.append(", length: ");
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }
        int i3 = i + 1;
        byte b = bArr[i3];
        if (b != 11) {
            throw new IllegalRawDataException("Invalid value of length field: " + ((int) bArr[i3]));
        }
        this.length = b;
        this.security = IpV4SecurityOptionSecurity.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i + 2)));
        this.compartments = IpV4SecurityOptionCompartments.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i + 4)));
        this.handlingRestrictions = IpV4SecurityOptionHandlingRestrictions.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i + 6)));
        this.tcc = IpV4SecurityOptionTransmissionControlCode.getInstance(Integer.valueOf(ByteArrays.getInt(bArr, i + 7) & 16777215));
    }

    private IpV4Rfc791SecurityOption(Builder builder) {
        this.type = IpV4OptionType.SECURITY;
        if (builder != null) {
            this.security = builder.security;
            this.compartments = builder.compartments;
            this.handlingRestrictions = builder.handlingRestrictions;
            this.tcc = builder.tcc;
            if (!builder.correctLengthAtBuild) {
                this.length = builder.length;
                return;
            } else {
                this.length = (byte) length();
                return;
            }
        }
        throw new NullPointerException("builder: " + builder);
    }
}
