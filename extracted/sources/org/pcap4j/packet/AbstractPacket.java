package org.pcap4j.packet;

import defpackage.t61;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.Packet;
import org.pcap4j.util.ByteArrays;
import org.pcap4j.util.LazyValue;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractPacket implements Packet {
    private static final long serialVersionUID = -3016622134481071576L;
    private final LazyValue<Integer> lengthCache = new LazyValue<>(new LazyValue.BuildValueCommand<Integer>() { // from class: org.pcap4j.packet.AbstractPacket.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.pcap4j.util.LazyValue.BuildValueCommand
        public Integer buildValue() {
            return Integer.valueOf(AbstractPacket.this.calcLength());
        }
    });
    private final LazyValue<byte[]> rawDataCache = new LazyValue<>(new LazyValue.BuildValueCommand<byte[]>() { // from class: org.pcap4j.packet.AbstractPacket.2
        @Override // org.pcap4j.util.LazyValue.BuildValueCommand
        public byte[] buildValue() {
            return AbstractPacket.this.buildRawData();
        }
    });
    private final LazyValue<String> hexStringCache = new LazyValue<>(new LazyValue.BuildValueCommand<String>() { // from class: org.pcap4j.packet.AbstractPacket.3
        @Override // org.pcap4j.util.LazyValue.BuildValueCommand
        public String buildValue() {
            return AbstractPacket.this.buildHexString();
        }
    });
    private final LazyValue<String> stringCache = new LazyValue<>(new LazyValue.BuildValueCommand<String>() { // from class: org.pcap4j.packet.AbstractPacket.4
        @Override // org.pcap4j.util.LazyValue.BuildValueCommand
        public String buildValue() {
            return AbstractPacket.this.buildString();
        }
    });
    private final LazyValue<Integer> hashCodeCache = new LazyValue<>(new LazyValue.BuildValueCommand<Integer>() { // from class: org.pcap4j.packet.AbstractPacket.5
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.pcap4j.util.LazyValue.BuildValueCommand
        public Integer buildValue() {
            return Integer.valueOf(AbstractPacket.this.calcHashCode());
        }
    });

    public static abstract class AbstractBuilder implements Packet.Builder {
        @Override // org.pcap4j.packet.Packet.Builder
        public abstract Packet build();

        @Override // org.pcap4j.packet.Packet.Builder
        public <T extends Packet.Builder> T get(Class<T> cls) {
            for (Packet.Builder builder : this) {
                if (cls.isInstance(builder)) {
                    return cls.cast(builder);
                }
            }
            return null;
        }

        @Override // org.pcap4j.packet.Packet.Builder
        public Packet.Builder getOuterOf(Class<? extends Packet.Builder> cls) {
            for (Packet.Builder builder : this) {
                if (cls.isInstance(builder.getPayloadBuilder())) {
                    return builder;
                }
            }
            return null;
        }

        @Override // org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return null;
        }

        @Override // java.lang.Iterable
        public Iterator<Packet.Builder> iterator() {
            return new BuilderIterator(this);
        }

        @Override // org.pcap4j.packet.Packet.Builder
        public AbstractBuilder payloadBuilder(Packet.Builder builder) {
            throw new UnsupportedOperationException();
        }
    }

    public static abstract class AbstractHeader implements Packet.Header {
        private static final long serialVersionUID = -8916517326403680608L;
        private final LazyValue<Integer> lengthCache = new LazyValue<>(new LazyValue.BuildValueCommand<Integer>() { // from class: org.pcap4j.packet.AbstractPacket.AbstractHeader.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.pcap4j.util.LazyValue.BuildValueCommand
            public Integer buildValue() {
                return Integer.valueOf(AbstractHeader.this.calcLength());
            }
        });
        private final LazyValue<byte[]> rawDataCache = new LazyValue<>(new LazyValue.BuildValueCommand<byte[]>() { // from class: org.pcap4j.packet.AbstractPacket.AbstractHeader.2
            @Override // org.pcap4j.util.LazyValue.BuildValueCommand
            public byte[] buildValue() {
                return AbstractHeader.this.buildRawData();
            }
        });
        private final LazyValue<String> hexStringCache = new LazyValue<>(new LazyValue.BuildValueCommand<String>() { // from class: org.pcap4j.packet.AbstractPacket.AbstractHeader.3
            @Override // org.pcap4j.util.LazyValue.BuildValueCommand
            public String buildValue() {
                return AbstractHeader.this.buildHexString();
            }
        });
        private final LazyValue<String> stringCache = new LazyValue<>(new LazyValue.BuildValueCommand<String>() { // from class: org.pcap4j.packet.AbstractPacket.AbstractHeader.4
            @Override // org.pcap4j.util.LazyValue.BuildValueCommand
            public String buildValue() {
                return AbstractHeader.this.buildString();
            }
        });
        private final LazyValue<Integer> hashCodeCache = new LazyValue<>(new LazyValue.BuildValueCommand<Integer>() { // from class: org.pcap4j.packet.AbstractPacket.AbstractHeader.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.pcap4j.util.LazyValue.BuildValueCommand
            public Integer buildValue() {
                return Integer.valueOf(AbstractHeader.this.calcHashCode());
            }
        });

        public String buildHexString() {
            return ByteArrays.toHexString(getRawData(), " ");
        }

        public byte[] buildRawData() {
            return ByteArrays.concatenate(getRawFields());
        }

        public String buildString() {
            StringBuilder sb = new StringBuilder("[A header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Hex stream: ");
            return t61.m(getRawData(), " ", sb, property);
        }

        public int calcHashCode() {
            return Arrays.hashCode(getRawData());
        }

        public int calcLength() {
            Iterator<byte[]> it = getRawFields().iterator();
            int length = 0;
            while (it.hasNext()) {
                length += it.next().length;
            }
            return length;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (getClass().isInstance(obj)) {
                return Arrays.equals(((AbstractHeader) getClass().cast(obj)).getRawData(), getRawData());
            }
            return false;
        }

        @Override // org.pcap4j.packet.Packet.Header
        public byte[] getRawData() {
            byte[] value = this.rawDataCache.getValue();
            int length = value.length;
            byte[] bArr = new byte[length];
            System.arraycopy(value, 0, bArr, 0, length);
            return bArr;
        }

        public abstract List<byte[]> getRawFields();

        public int hashCode() {
            return this.hashCodeCache.getValue().intValue();
        }

        @Override // org.pcap4j.packet.Packet.Header
        public int length() {
            return this.lengthCache.getValue().intValue();
        }

        public String toHexString() {
            return this.hexStringCache.getValue();
        }

        public String toString() {
            return this.stringCache.getValue();
        }
    }

    public String buildHexString() {
        return ByteArrays.toHexString(getRawData(), " ");
    }

    public byte[] buildRawData() {
        int length;
        byte[] bArr = new byte[length()];
        Packet.Header header = getHeader();
        Packet payload = getPayload();
        if (header != null) {
            System.arraycopy(getHeader().getRawData(), 0, bArr, 0, header.length());
            length = header.length();
        } else {
            length = 0;
        }
        if (payload != null) {
            System.arraycopy(getPayload().getRawData(), 0, bArr, length, payload.length());
            payload.length();
        }
        return bArr;
    }

    public String buildString() {
        StringBuilder sb = new StringBuilder();
        if (getHeader() != null) {
            sb.append(getHeader().toString());
        }
        if (getPayload() != null) {
            sb.append(getPayload().toString());
        }
        return sb.toString();
    }

    public int calcHashCode() {
        int iHashCode = getHeader() != null ? getHeader().hashCode() + 527 : 17;
        if (getPayload() != null) {
            return getPayload().hashCode() + (iHashCode * 31);
        }
        return iHashCode;
    }

    public int calcLength() {
        int length = getHeader() != null ? getHeader().length() : 0;
        return getPayload() != null ? getPayload().length() + length : length;
    }

    @Override // org.pcap4j.packet.Packet
    public <T extends Packet> boolean contains(Class<T> cls) {
        return get(cls) != null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        Packet packet = (Packet) obj;
        if (getHeader() == null || packet.getHeader() == null) {
            if (getHeader() == null && packet.getHeader() == null) {
            }
        }
        if (!getHeader().equals(packet.getHeader())) {
            return false;
        }
        return (getPayload() == null || packet.getPayload() == null) ? getPayload() == null && packet.getPayload() == null : getPayload().equals(packet.getPayload());
    }

    @Override // org.pcap4j.packet.Packet
    public <T extends Packet> T get(Class<T> cls) {
        for (Packet packet : this) {
            if (cls.isInstance(packet)) {
                return cls.cast(packet);
            }
        }
        return null;
    }

    @Override // org.pcap4j.packet.Packet
    public abstract Packet.Builder getBuilder();

    @Override // org.pcap4j.packet.Packet
    public Packet.Header getHeader() {
        return null;
    }

    @Override // org.pcap4j.packet.Packet
    public Packet getOuterOf(Class<? extends Packet> cls) {
        for (Packet packet : this) {
            if (cls.isInstance(packet.getPayload())) {
                return packet;
            }
        }
        return null;
    }

    @Override // org.pcap4j.packet.Packet
    public Packet getPayload() {
        return null;
    }

    @Override // org.pcap4j.packet.Packet
    public byte[] getRawData() {
        byte[] value = this.rawDataCache.getValue();
        int length = value.length;
        byte[] bArr = new byte[length];
        System.arraycopy(value, 0, bArr, 0, length);
        return bArr;
    }

    public int hashCode() {
        return this.hashCodeCache.getValue().intValue();
    }

    @Override // java.lang.Iterable
    public Iterator<Packet> iterator() {
        return new PacketIterator(this);
    }

    @Override // org.pcap4j.packet.Packet
    public int length() {
        return this.lengthCache.getValue().intValue();
    }

    public String toHexString() {
        return this.hexStringCache.getValue();
    }

    public String toString() {
        return this.stringCache.getValue();
    }
}
