package org.pcap4j.packet;

import defpackage.o40;
import java.io.ObjectStreamException;
import org.pcap4j.packet.IpV6ExtOptionsPacket;
import org.pcap4j.packet.namednumber.IpV6OptionType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV6Pad1Option implements IpV6ExtOptionsPacket.IpV6Option {
    private static final long serialVersionUID = 2182260121605325195L;
    private static final IpV6Pad1Option INSTANCE = new IpV6Pad1Option();
    private static final IpV6OptionType type = IpV6OptionType.getInstance((byte) 0);

    private IpV6Pad1Option() {
    }

    public static IpV6Pad1Option getInstance() {
        return INSTANCE;
    }

    public static IpV6Pad1Option newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        byte b = bArr[i];
        IpV6OptionType ipV6OptionType = type;
        if (b == ipV6OptionType.value().byteValue()) {
            return INSTANCE;
        }
        StringBuilder sbA = o40.A(100, "The type must be: ");
        sbA.append(ipV6OptionType.valueAsString());
        sbA.append(" rawData: ");
        sbA.append(ByteArrays.toHexString(bArr, " "));
        throw new IllegalRawDataException(sbA.toString());
    }

    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.IpV6Option
    public byte[] getRawData() {
        return new byte[1];
    }

    @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.IpV6Option
    public IpV6OptionType getType() {
        return type;
    }

    @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.IpV6Option
    public int length() {
        return 1;
    }

    public String toString() {
        return "[Option Type: " + type + "]";
    }
}
