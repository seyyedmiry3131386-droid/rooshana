package org.pcap4j.packet;

import defpackage.dw1;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.namednumber.IpV4TosPrecedence;
import org.pcap4j.packet.namednumber.IpV4TosTos;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV4Rfc1349Tos implements IpV4Packet.IpV4Tos {
    private static final long serialVersionUID = 1760697525836662144L;
    private final boolean mbz;
    private final IpV4TosPrecedence precedence;
    private final IpV4TosTos tos;

    public static final class Builder {
        private boolean mbz;
        private IpV4TosPrecedence precedence;
        private IpV4TosTos tos;

        public IpV4Rfc1349Tos build() {
            return new IpV4Rfc1349Tos(this);
        }

        public Builder mbz(boolean z) {
            this.mbz = z;
            return this;
        }

        public Builder precedence(IpV4TosPrecedence ipV4TosPrecedence) {
            this.precedence = ipV4TosPrecedence;
            return this;
        }

        public Builder tos(IpV4TosTos ipV4TosTos) {
            this.tos = ipV4TosTos;
            return this;
        }

        public Builder() {
        }

        private Builder(IpV4Rfc1349Tos ipV4Rfc1349Tos) {
            this.precedence = ipV4Rfc1349Tos.precedence;
            this.tos = ipV4Rfc1349Tos.tos;
            this.mbz = ipV4Rfc1349Tos.mbz;
        }
    }

    public static IpV4Rfc1349Tos newInstance(byte b) {
        return new IpV4Rfc1349Tos(b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return IpV4Rfc1349Tos.class.isInstance(obj) && ((IpV4Rfc1349Tos) IpV4Rfc1349Tos.class.cast(obj)).value() == value();
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public IpV4TosPrecedence getPrecedence() {
        return this.precedence;
    }

    public IpV4TosTos getTos() {
        return this.tos;
    }

    public int hashCode() {
        return value();
    }

    public boolean mbz() {
        return this.mbz;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[precedence: ");
        sb.append(this.precedence);
        sb.append("] [tos: ");
        sb.append(this.tos);
        sb.append("] [mbz: ");
        return dw1.k(this.mbz ? 1 : 0, "]", sb);
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Tos
    public byte value() {
        byte bByteValue = (byte) (((byte) (this.precedence.value().byteValue() << 5)) | (this.tos.value().byteValue() << 1));
        return this.mbz ? (byte) (bByteValue | 1) : bByteValue;
    }

    private IpV4Rfc1349Tos(byte b) {
        this.precedence = IpV4TosPrecedence.getInstance(Byte.valueOf((byte) ((b & 224) >> 5)));
        this.tos = IpV4TosTos.getInstance(Byte.valueOf((byte) ((b >> 1) & 15)));
        this.mbz = (b & 1) != 0;
    }

    private IpV4Rfc1349Tos(Builder builder) {
        if (builder != null && builder.precedence != null && builder.tos != null) {
            this.precedence = builder.precedence;
            this.tos = builder.tos;
            this.mbz = builder.mbz;
        } else {
            throw new NullPointerException("builder" + builder + " builder.precedence: " + builder.precedence + " builder.tos: " + builder.tos);
        }
    }
}
