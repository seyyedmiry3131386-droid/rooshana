package org.pcap4j.packet;

import defpackage.o40;
import defpackage.rm7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11ChannelUsageMode;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot11ChannelUsageElement extends Dot11InformationElement {
    private static final long serialVersionUID = -6935079967608347323L;
    private final List<Dot11ChannelEntry> channelEntries;
    private final Dot11ChannelUsageMode usageMode;

    public static final class Builder extends Dot11InformationElement.Builder {
        private List<Dot11ChannelEntry> channelEntries;
        private Dot11ChannelUsageMode usageMode;

        public Builder channelEntries(List<Dot11ChannelEntry> list) {
            this.channelEntries = list;
            return this;
        }

        public Builder usageMode(Dot11ChannelUsageMode dot11ChannelUsageMode) {
            this.usageMode = dot11ChannelUsageMode;
            return this;
        }

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.CHANNEL_USAGE.value()));
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            if (this.usageMode == null) {
                throw new NullPointerException("usageMode is null.");
            }
            if (getCorrectLengthAtBuild()) {
                length((byte) ((this.channelEntries.size() * 2) + 1));
            }
            return new Dot11ChannelUsageElement(this);
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

        private Builder(Dot11ChannelUsageElement dot11ChannelUsageElement) {
            super(dot11ChannelUsageElement);
            this.usageMode = dot11ChannelUsageElement.usageMode;
            this.channelEntries = dot11ChannelUsageElement.channelEntries;
        }
    }

    public static Dot11ChannelUsageElement newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Dot11ChannelUsageElement(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Dot11ChannelUsageElement dot11ChannelUsageElement = (Dot11ChannelUsageElement) obj;
        return this.channelEntries.equals(dot11ChannelUsageElement.channelEntries) && this.usageMode.equals(dot11ChannelUsageElement.usageMode);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public ArrayList<Dot11ChannelEntry> getChannelEntries() {
        return new ArrayList<>(this.channelEntries);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getElementId().value().byteValue();
        bArr[1] = getLength();
        bArr[2] = this.usageMode.value().byteValue();
        int i = 3;
        for (Dot11ChannelEntry dot11ChannelEntry : this.channelEntries) {
            bArr[i] = dot11ChannelEntry.getOperatingClass();
            bArr[i + 1] = dot11ChannelEntry.getChannel();
            i += 2;
        }
        return bArr;
    }

    public Dot11ChannelUsageMode getUsageMode() {
        return this.usageMode;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        return this.usageMode.hashCode() + ((this.channelEntries.hashCode() + (super.hashCode() * 31)) * 31);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        return (this.channelEntries.size() * 2) + 3;
    }

    public String toString() {
        return toString("");
    }

    private Dot11ChannelUsageElement(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        super(bArr, i, i2, Dot11InformationElementId.CHANNEL_USAGE);
        int lengthAsInt = getLengthAsInt();
        if (lengthAsInt < 1) {
            throw new IllegalRawDataException(rm7.n(lengthAsInt, "The length must be more than 0 but is actually: "));
        }
        if ((lengthAsInt - 1) % 2 != 0) {
            throw new IllegalRawDataException(rm7.n(lengthAsInt, "The ((length - 1) % 2) must be 0. length: "));
        }
        this.usageMode = Dot11ChannelUsageMode.getInstance(Byte.valueOf(bArr[i + 2]));
        int i3 = lengthAsInt - 1;
        this.channelEntries = new ArrayList((lengthAsInt - 2) / 2);
        int i4 = i + 3;
        while (i3 > 0) {
            this.channelEntries.add(new Dot11ChannelEntry(bArr[i4], bArr[i4 + 1]));
            i3 -= 2;
            i4 += 2;
        }
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "Channel Usage:", str, sb);
        sb.append("  Element ID: ");
        sb.append(getElementId());
        sb.append(strZ);
        sb.append(str);
        sb.append("  Length: ");
        sb.append(getLengthAsInt());
        sb.append(" bytes");
        sb.append(strZ);
        sb.append(str);
        sb.append("  Usage Mode: ");
        sb.append(this.usageMode);
        sb.append(strZ);
        for (Dot11ChannelEntry dot11ChannelEntry : this.channelEntries) {
            sb.append(str);
            sb.append("  Channel Entry: ");
            sb.append(dot11ChannelEntry);
            sb.append(strZ);
        }
        return sb.toString();
    }

    private Dot11ChannelUsageElement(Builder builder) {
        super(builder);
        if (builder.channelEntries.size() <= 127) {
            this.usageMode = builder.usageMode;
            if (builder.channelEntries == null) {
                this.channelEntries = Collections.EMPTY_LIST;
                return;
            } else {
                this.channelEntries = new ArrayList(builder.channelEntries);
                return;
            }
        }
        throw new IllegalArgumentException("Too long channelEntries: " + builder.channelEntries);
    }
}
