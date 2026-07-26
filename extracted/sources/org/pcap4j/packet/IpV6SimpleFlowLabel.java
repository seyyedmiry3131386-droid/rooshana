package org.pcap4j.packet;

import org.pcap4j.packet.IpV6Packet;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV6SimpleFlowLabel implements IpV6Packet.IpV6FlowLabel {
    private static final long serialVersionUID = -5076935770045999373L;
    private final int value;

    private IpV6SimpleFlowLabel(int i) {
        this.value = i & 1048575;
    }

    public static IpV6SimpleFlowLabel newInstance(int i) {
        return new IpV6SimpleFlowLabel(i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return IpV6SimpleFlowLabel.class.isInstance(obj) && ((IpV6SimpleFlowLabel) IpV6SimpleFlowLabel.class.cast(obj)).value() == this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return "0x" + ByteArrays.toHexString(this.value, "").substring(3);
    }

    @Override // org.pcap4j.packet.IpV6Packet.IpV6FlowLabel
    public int value() {
        return this.value;
    }
}
