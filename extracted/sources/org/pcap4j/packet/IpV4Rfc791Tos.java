package org.pcap4j.packet;

import defpackage.dw1;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.namednumber.IpV4TosPrecedence;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV4Rfc791Tos implements IpV4Packet.IpV4Tos {
    private static final long serialVersionUID = 1760697525836662144L;
    private final boolean eighthBit;
    private final boolean highReliability;
    private final boolean highThroughput;
    private final boolean lowDelay;
    private final IpV4TosPrecedence precedence;
    private final boolean seventhBit;

    public static final class Builder {
        private boolean eighthBit;
        private boolean highReliability;
        private boolean highThroughput;
        private boolean lowDelay;
        private IpV4TosPrecedence precedence;
        private boolean seventhBit;

        public IpV4Rfc791Tos build() {
            return new IpV4Rfc791Tos(this);
        }

        public Builder eighthBit(boolean z) {
            this.eighthBit = z;
            return this;
        }

        public Builder highReliability(boolean z) {
            this.highReliability = z;
            return this;
        }

        public Builder highThroughput(boolean z) {
            this.highThroughput = z;
            return this;
        }

        public Builder lowDelay(boolean z) {
            this.lowDelay = z;
            return this;
        }

        public Builder precedence(IpV4TosPrecedence ipV4TosPrecedence) {
            this.precedence = ipV4TosPrecedence;
            return this;
        }

        public Builder seventhBit(boolean z) {
            this.seventhBit = z;
            return this;
        }

        public Builder() {
        }

        private Builder(IpV4Rfc791Tos ipV4Rfc791Tos) {
            this.precedence = ipV4Rfc791Tos.precedence;
            this.lowDelay = ipV4Rfc791Tos.lowDelay;
            this.highThroughput = ipV4Rfc791Tos.highThroughput;
            this.highReliability = ipV4Rfc791Tos.highReliability;
            this.seventhBit = ipV4Rfc791Tos.seventhBit;
            this.eighthBit = ipV4Rfc791Tos.eighthBit;
        }
    }

    public static IpV4Rfc791Tos newInstance(byte b) {
        return new IpV4Rfc791Tos(b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return IpV4Rfc791Tos.class.isInstance(obj) && ((IpV4Rfc791Tos) IpV4Rfc791Tos.class.cast(obj)).value() == value();
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public boolean getEighthBit() {
        return this.eighthBit;
    }

    public IpV4TosPrecedence getPrecedence() {
        return this.precedence;
    }

    public boolean getSeventhBit() {
        return this.seventhBit;
    }

    public int hashCode() {
        return value();
    }

    public boolean isHighReliability() {
        return this.highReliability;
    }

    public boolean isHighThroughput() {
        return this.highThroughput;
    }

    public boolean isLowDelay() {
        return this.lowDelay;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[precedence: ");
        sb.append(this.precedence);
        sb.append("] [lowDelay: ");
        sb.append(this.lowDelay);
        sb.append("] [highThroughput: ");
        sb.append(this.highThroughput);
        sb.append("] [highReliability: ");
        sb.append(this.highReliability);
        sb.append("] [seventhBit: ");
        sb.append(this.seventhBit ? 1 : 0);
        sb.append("] [eighthBit: ");
        return dw1.k(this.eighthBit ? 1 : 0, "]", sb);
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Tos
    public byte value() {
        byte bByteValue = (byte) (this.precedence.value().byteValue() << 5);
        if (this.lowDelay) {
            bByteValue = (byte) (bByteValue | 16);
        }
        if (this.highThroughput) {
            bByteValue = (byte) (bByteValue | 8);
        }
        if (this.highReliability) {
            bByteValue = (byte) (bByteValue | 4);
        }
        if (this.seventhBit) {
            bByteValue = (byte) (bByteValue | 2);
        }
        return this.eighthBit ? (byte) (bByteValue | 1) : bByteValue;
    }

    private IpV4Rfc791Tos(byte b) {
        this.precedence = IpV4TosPrecedence.getInstance(Byte.valueOf((byte) ((b & 224) >> 5)));
        this.lowDelay = (b & 16) != 0;
        this.highThroughput = (b & 8) != 0;
        this.highReliability = (b & 4) != 0;
        this.seventhBit = (b & 2) != 0;
        this.eighthBit = (b & 1) != 0;
    }

    private IpV4Rfc791Tos(Builder builder) {
        if (builder != null && builder.precedence != null) {
            this.precedence = builder.precedence;
            this.lowDelay = builder.lowDelay;
            this.highThroughput = builder.highThroughput;
            this.highReliability = builder.highReliability;
            this.seventhBit = builder.seventhBit;
            this.eighthBit = builder.eighthBit;
            return;
        }
        throw new NullPointerException("builder" + builder + " builder.precedence: " + builder.precedence);
    }
}
