package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.io.ObjectStreamException;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.namednumber.TcpOptionKind;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class TcpSackPermittedOption implements TcpPacket.TcpOption {
    private static final TcpSackPermittedOption INSTANCE = new TcpSackPermittedOption();
    private static final TcpOptionKind kind = TcpOptionKind.SACK_PERMITTED;
    private static final byte length = 2;
    private static final long serialVersionUID = -5364948716212977767L;

    private TcpSackPermittedOption() {
    }

    public static TcpSackPermittedOption getInstance() {
        return INSTANCE;
    }

    public static TcpSackPermittedOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        if (i2 < 2) {
            StringBuilder sbA = o40.A(50, "The raw data length must be more than 1. rawData: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        byte b = bArr[i];
        TcpOptionKind tcpOptionKind = kind;
        if (b == tcpOptionKind.value().byteValue()) {
            int i3 = i + 1;
            if (bArr[i3] == 2) {
                return INSTANCE;
            }
            throw new IllegalRawDataException("The value of length field must be 2 but: " + ((int) bArr[i3]));
        }
        StringBuilder sbA2 = o40.A(100, "The kind must be: ");
        sbA2.append(tcpOptionKind.valueAsString());
        sbA2.append(" rawData: ");
        sbA2.append(ByteArrays.toHexString(bArr, " "));
        sbA2.append(", offset: ");
        sbA2.append(i);
        sbA2.append(", length: ");
        sbA2.append(i2);
        throw new IllegalRawDataException(sbA2.toString());
    }

    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public TcpOptionKind getKind() {
        return kind;
    }

    public byte getLength() {
        return length;
    }

    public int getLengthAsInt() {
        return 2;
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = kind.value().byteValue();
        bArr[1] = length;
        return bArr;
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public int length() {
        return 2;
    }

    public String toString() {
        return "[Kind: " + kind + "] [Length: " + getLengthAsInt() + " bytes]";
    }
}
