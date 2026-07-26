package org.pcap4j.packet;

import defpackage.o40;
import defpackage.rm7;
import defpackage.t61;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.namednumber.IpV4OptionType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
abstract class IpV4RouteOption implements IpV4Packet.IpV4Option {
    private static final long serialVersionUID = -2747065348720047861L;
    private final byte length;
    private final byte pointer;
    private final List<Inet4Address> routeData;

    public static abstract class Builder<T extends IpV4RouteOption> implements LengthBuilder<T> {
        private boolean correctLengthAtBuild;
        private byte length;
        private byte pointer;
        private List<Inet4Address> routeData;

        public Builder() {
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public abstract T build();

        public Builder<T> length(byte b) {
            this.length = b;
            return this;
        }

        public Builder<T> pointer(byte b) {
            this.pointer = b;
            return this;
        }

        public Builder<T> routeData(List<Inet4Address> list) {
            this.routeData = list;
            return this;
        }

        public Builder(IpV4RouteOption ipV4RouteOption) {
            this.length = ipV4RouteOption.length;
            this.pointer = ipV4RouteOption.pointer;
            this.routeData = ipV4RouteOption.routeData;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild */
        public Builder<T> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }
    }

    public IpV4RouteOption(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 < 3) {
            StringBuilder sbA = o40.A(100, "The raw data length must be more than 2. rawData: ");
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
        this.length = bArr[i + 1];
        int lengthAsInt = getLengthAsInt();
        if (i2 < lengthAsInt) {
            StringBuilder sb = new StringBuilder(100);
            sb.append("The raw data is too short to build this option(");
            sb.append(lengthAsInt);
            sb.append("). data: ");
            t61.t(i, " ", ", offset: ", sb, bArr);
            sb.append(", length: ");
            sb.append(i2);
            throw new IllegalRawDataException(sb.toString());
        }
        if (lengthAsInt < 3) {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append("The length field value must be equal or more than 3 but it is: ");
            sb2.append(lengthAsInt);
            throw new IllegalRawDataException(sb2.toString());
        }
        if ((lengthAsInt - 3) % 4 != 0) {
            throw new IllegalRawDataException(rm7.n(lengthAsInt, "Invalid length for this option: "));
        }
        this.pointer = bArr[i + 2];
        this.routeData = new ArrayList();
        for (int i3 = 3; i3 < lengthAsInt; i3 += 4) {
            this.routeData.add(ByteArrays.getInet4Address(bArr, i3 + i));
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        IpV4RouteOption ipV4RouteOption = (IpV4RouteOption) obj;
        return this.length == ipV4RouteOption.length && this.pointer == ipV4RouteOption.pointer && this.routeData.equals(ipV4RouteOption.routeData);
    }

    public abstract Builder<? extends IpV4RouteOption> getBuilder();

    public byte getLength() {
        return this.length;
    }

    public int getLengthAsInt() {
        return this.length & 255;
    }

    public byte getPointer() {
        return this.pointer;
    }

    public int getPointerAsInt() {
        return this.pointer & 255;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getType().value().byteValue();
        bArr[1] = this.length;
        bArr[2] = this.pointer;
        Iterator<Inet4Address> it = this.routeData.iterator();
        int i = 3;
        while (it.hasNext()) {
            System.arraycopy(it.next().getAddress(), 0, bArr, i, 4);
            i += 4;
        }
        return bArr;
    }

    public List<Inet4Address> getRouteData() {
        return new ArrayList(this.routeData);
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public abstract IpV4OptionType getType();

    public int hashCode() {
        return this.routeData.hashCode() + ((((527 + this.length) * 31) + this.pointer) * 31);
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public int length() {
        return (this.routeData.size() * 4) + 3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[option-type: ");
        sb.append(getType());
        sb.append("] [option-length: ");
        sb.append(getLengthAsInt());
        sb.append(" bytes] [pointer: ");
        sb.append(getPointerAsInt());
        sb.append("] [route data:");
        for (Inet4Address inet4Address : this.routeData) {
            sb.append(" ");
            sb.append(inet4Address);
        }
        sb.append("]");
        return sb.toString();
    }

    public IpV4RouteOption(Builder<? extends IpV4RouteOption> builder) {
        if (builder != null && ((Builder) builder).routeData != null) {
            this.pointer = ((Builder) builder).pointer;
            this.routeData = new ArrayList(((Builder) builder).routeData);
            if (!((Builder) builder).correctLengthAtBuild) {
                this.length = ((Builder) builder).length;
                return;
            } else {
                this.length = (byte) length();
                return;
            }
        }
        throw new NullPointerException("builder: " + builder + " builder.routeData: " + ((Builder) builder).routeData);
    }
}
