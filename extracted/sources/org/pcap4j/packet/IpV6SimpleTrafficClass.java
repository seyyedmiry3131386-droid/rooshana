package org.pcap4j.packet;

import org.pcap4j.packet.IpV6Packet;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV6SimpleTrafficClass implements IpV6Packet.IpV6TrafficClass {
    private static final long serialVersionUID = -5076935770045999373L;
    private final byte value;

    private IpV6SimpleTrafficClass(byte b) {
        this.value = b;
    }

    public static IpV6SimpleTrafficClass newInstance(byte b) {
        return new IpV6SimpleTrafficClass(b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return IpV6SimpleTrafficClass.class.isInstance(obj) && ((IpV6SimpleTrafficClass) IpV6SimpleTrafficClass.class.cast(obj)).value() == this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return "0x" + ByteArrays.toHexString(this.value, "");
    }

    @Override // org.pcap4j.packet.IpV6Packet.IpV6TrafficClass
    public byte value() {
        return this.value;
    }
}
