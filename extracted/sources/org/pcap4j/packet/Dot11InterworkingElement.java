package org.pcap4j.packet;

import defpackage.o40;
import defpackage.rm7;
import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11AccessNetworkType;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.packet.namednumber.Dot11VenueInfo;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot11InterworkingElement extends Dot11InformationElement {
    private static final long serialVersionUID = -5151120333283703306L;
    private final Dot11AccessNetworkType accessnetworkType;
    private final boolean asra;
    private final boolean esr;
    private final byte[] hessid;
    private final boolean internet;
    private final boolean uesa;
    private final Dot11VenueInfo venueInfo;

    public static final class Builder extends Dot11InformationElement.Builder {
        private Dot11AccessNetworkType accessnetworkType;
        private boolean asra;
        private boolean esr;
        private byte[] hessid;
        private boolean internet;
        private boolean uesa;
        private Dot11VenueInfo venueInfo;

        public Builder accessnetworkType(Dot11AccessNetworkType dot11AccessNetworkType) {
            this.accessnetworkType = dot11AccessNetworkType;
            return this;
        }

        public Builder asra(boolean z) {
            this.asra = z;
            return this;
        }

        public Builder esr(boolean z) {
            this.esr = z;
            return this;
        }

        public Builder hessid(byte[] bArr) {
            this.hessid = bArr;
            return this;
        }

        public Builder internet(boolean z) {
            this.internet = z;
            return this;
        }

        public Builder uesa(boolean z) {
            this.uesa = z;
            return this;
        }

        public Builder venueInfo(Dot11VenueInfo dot11VenueInfo) {
            this.venueInfo = dot11VenueInfo;
            return this;
        }

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.INTERWORKING.value()));
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            if (getCorrectLengthAtBuild()) {
                int i = this.venueInfo != null ? 3 : 1;
                if (this.hessid != null) {
                    i += 6;
                }
                length((byte) i);
            }
            return new Dot11InterworkingElement(this);
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

        private Builder(Dot11InterworkingElement dot11InterworkingElement) {
            super(dot11InterworkingElement);
            this.accessnetworkType = dot11InterworkingElement.accessnetworkType;
            this.internet = dot11InterworkingElement.internet;
            this.asra = dot11InterworkingElement.asra;
            this.esr = dot11InterworkingElement.esr;
            this.uesa = dot11InterworkingElement.uesa;
            this.venueInfo = dot11InterworkingElement.venueInfo;
            this.hessid = dot11InterworkingElement.hessid;
        }
    }

    public static Dot11InterworkingElement newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Dot11InterworkingElement(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || Dot11InterworkingElement.class != obj.getClass()) {
            return false;
        }
        Dot11InterworkingElement dot11InterworkingElement = (Dot11InterworkingElement) obj;
        if (!this.accessnetworkType.equals(dot11InterworkingElement.accessnetworkType) || this.asra != dot11InterworkingElement.asra || this.esr != dot11InterworkingElement.esr || !Arrays.equals(this.hessid, dot11InterworkingElement.hessid) || this.internet != dot11InterworkingElement.internet || this.uesa != dot11InterworkingElement.uesa) {
            return false;
        }
        Dot11VenueInfo dot11VenueInfo = this.venueInfo;
        if (dot11VenueInfo == null) {
            if (dot11InterworkingElement.venueInfo != null) {
                return false;
            }
        } else if (!dot11VenueInfo.equals(dot11InterworkingElement.venueInfo)) {
            return false;
        }
        return true;
    }

    public Dot11AccessNetworkType getAccessnetworkType() {
        return this.accessnetworkType;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte[] getHessid() {
        byte[] bArr = this.hessid;
        if (bArr == null) {
            return null;
        }
        return ByteArrays.clone(bArr);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getElementId().value().byteValue();
        bArr[1] = getLength();
        byte bByteValue = this.accessnetworkType.value().byteValue();
        bArr[2] = bByteValue;
        if (this.internet) {
            bArr[2] = (byte) (bByteValue | 16);
        }
        if (this.asra) {
            bArr[2] = (byte) (bArr[2] | 32);
        }
        if (this.esr) {
            bArr[2] = (byte) (bArr[2] | 64);
        }
        if (this.uesa) {
            bArr[2] = (byte) (bArr[2] | 128);
        }
        Dot11VenueInfo dot11VenueInfo = this.venueInfo;
        int i = 3;
        if (dot11VenueInfo != null) {
            System.arraycopy(ByteArrays.toByteArray(dot11VenueInfo.value().shortValue()), 0, bArr, 3, 2);
            i = 5;
        }
        byte[] bArr2 = this.hessid;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, i, 6);
        }
        return bArr;
    }

    public Dot11VenueInfo getVenueInfo() {
        return this.venueInfo;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        int iHashCode = (((((Arrays.hashCode(this.hessid) + ((((((this.accessnetworkType.hashCode() + (super.hashCode() * 31)) * 31) + (this.asra ? 1231 : 1237)) * 31) + (this.esr ? 1231 : 1237)) * 31)) * 31) + (this.internet ? 1231 : 1237)) * 31) + (this.uesa ? 1231 : 1237)) * 31;
        Dot11VenueInfo dot11VenueInfo = this.venueInfo;
        return iHashCode + (dot11VenueInfo == null ? 0 : dot11VenueInfo.hashCode());
    }

    public boolean isAsra() {
        return this.asra;
    }

    public boolean isEsr() {
        return this.esr;
    }

    public boolean isInternetAccessible() {
        return this.internet;
    }

    public boolean isUesa() {
        return this.uesa;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        int i = this.venueInfo != null ? 5 : 3;
        return this.hessid != null ? i + 6 : i;
    }

    public String toString() {
        return toString("");
    }

    private Dot11InterworkingElement(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        super(bArr, i, i2, Dot11InformationElementId.INTERWORKING);
        int lengthAsInt = getLengthAsInt();
        if (lengthAsInt != 1 && lengthAsInt != 3 && lengthAsInt != 7 && lengthAsInt != 9) {
            throw new IllegalRawDataException(rm7.n(lengthAsInt, "The length must be 1 or 3 or 7 or 9 but is actually: "));
        }
        int i3 = i + 2;
        this.accessnetworkType = Dot11AccessNetworkType.getInstance(Byte.valueOf((byte) (bArr[i3] & 15)));
        byte b = bArr[i3];
        this.internet = (b & 16) != 0;
        this.asra = (b & 32) != 0;
        this.esr = (b & 64) != 0;
        this.uesa = (b & 128) != 0;
        if (lengthAsInt == 3 || lengthAsInt == 9) {
            this.venueInfo = Dot11VenueInfo.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i + 3)));
        } else {
            this.venueInfo = null;
        }
        if (lengthAsInt == 7) {
            this.hessid = ByteArrays.getSubArray(bArr, i + 3, 6);
        } else if (lengthAsInt == 9) {
            this.hessid = ByteArrays.getSubArray(bArr, i + 5, 6);
        } else {
            this.hessid = null;
        }
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "Interworking:", str, sb);
        sb.append("  Element ID: ");
        sb.append(getElementId());
        sb.append(strZ);
        sb.append(str);
        sb.append("  Length: ");
        sb.append(getLengthAsInt());
        sb.append(" bytes");
        sb.append(strZ);
        sb.append(str);
        sb.append("  Access Network Type: ");
        sb.append(this.accessnetworkType);
        sb.append(strZ);
        sb.append(str);
        sb.append("  Internet Accessible: ");
        t61.z(sb, this.internet, strZ, str, "  ASRA: ");
        t61.z(sb, this.asra, strZ, str, "  ESR: ");
        t61.z(sb, this.esr, strZ, str, "  UESA: ");
        sb.append(this.uesa);
        sb.append(strZ);
        if (this.venueInfo != null) {
            sb.append(str);
            sb.append("  Venue Info: ");
            sb.append(this.venueInfo);
            sb.append(strZ);
        }
        if (this.hessid != null) {
            sb.append(str);
            sb.append("  HESSID: 0x");
            sb.append(ByteArrays.toHexString(this.hessid, ""));
            sb.append(strZ);
        }
        return sb.toString();
    }

    private Dot11InterworkingElement(Builder builder) {
        super(builder);
        if (builder.accessnetworkType != null) {
            if (builder.hessid.length == 6) {
                this.accessnetworkType = builder.accessnetworkType;
                this.internet = builder.internet;
                this.asra = builder.asra;
                this.esr = builder.esr;
                this.uesa = builder.uesa;
                this.venueInfo = builder.venueInfo;
                this.hessid = builder.hessid;
                return;
            }
            throw new IllegalArgumentException("builder.hessid.length must be 6. builder.hessid.length: " + ByteArrays.toHexString(builder.hessid, " "));
        }
        throw new NullPointerException("builder.accessnetworkType is null.");
    }
}
