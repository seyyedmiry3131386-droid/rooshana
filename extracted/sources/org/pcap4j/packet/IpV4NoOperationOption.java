package org.pcap4j.packet;

import defpackage.o40;
import java.io.ObjectStreamException;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.namednumber.IpV4OptionType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV4NoOperationOption implements IpV4Packet.IpV4Option {
    private static final long serialVersionUID = 194338954674452009L;
    private static final IpV4NoOperationOption INSTANCE = new IpV4NoOperationOption();
    private static final IpV4OptionType type = IpV4OptionType.NO_OPERATION;

    private IpV4NoOperationOption() {
    }

    public static IpV4NoOperationOption getInstance() {
        return INSTANCE;
    }

    public static IpV4NoOperationOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        byte b = bArr[i];
        IpV4OptionType ipV4OptionType = type;
        if (b == ipV4OptionType.value().byteValue()) {
            return getInstance();
        }
        StringBuilder sbA = o40.A(100, "The type must be: ");
        sbA.append(ipV4OptionType.valueAsString());
        sbA.append(" rawData: ");
        sbA.append(ByteArrays.toHexString(bArr, " "));
        sbA.append(", offset: ");
        sbA.append(i);
        sbA.append(", length: ");
        sbA.append(i2);
        throw new IllegalRawDataException(sbA.toString());
    }

    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public byte[] getRawData() {
        return new byte[]{1};
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public IpV4OptionType getType() {
        return type;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public int length() {
        return 1;
    }

    public String toString() {
        return "[option-type: " + type + "]";
    }
}
