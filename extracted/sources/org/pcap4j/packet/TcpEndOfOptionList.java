package org.pcap4j.packet;

import defpackage.o40;
import java.io.ObjectStreamException;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.namednumber.TcpOptionKind;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class TcpEndOfOptionList implements TcpPacket.TcpOption {
    private static final TcpEndOfOptionList INSTANCE = new TcpEndOfOptionList();
    private static final TcpOptionKind kind = TcpOptionKind.END_OF_OPTION_LIST;
    private static final long serialVersionUID = -4181756738827638374L;

    private TcpEndOfOptionList() {
    }

    public static TcpEndOfOptionList getInstance() {
        return INSTANCE;
    }

    public static TcpEndOfOptionList newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        byte b = bArr[i];
        TcpOptionKind tcpOptionKind = kind;
        if (b == tcpOptionKind.value().byteValue()) {
            return INSTANCE;
        }
        StringBuilder sbA = o40.A(100, "The kind must be: ");
        sbA.append(tcpOptionKind.valueAsString());
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

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public TcpOptionKind getKind() {
        return kind;
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public byte[] getRawData() {
        return new byte[1];
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public int length() {
        return 1;
    }

    public String toString() {
        return "[Kind: " + kind + "]";
    }
}
