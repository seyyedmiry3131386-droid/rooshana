package org.pcap4j.packet.namednumber;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Port extends NamedNumber<Short, Port> {
    public Port(Short sh, String str) {
        super(sh, str);
    }

    public int valueAsInt() {
        return value().shortValue() & 65535;
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(valueAsInt());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(Port port) {
        return value().compareTo(port.value());
    }
}
