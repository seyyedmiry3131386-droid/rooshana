package org.pcap4j.packet;

import defpackage.o40;
import java.io.ObjectStreamException;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.namednumber.TcpOptionKind;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class TcpNoOperationOption implements TcpPacket.TcpOption {
    private static final TcpNoOperationOption INSTANCE = new TcpNoOperationOption();
    private static final TcpOptionKind kind = TcpOptionKind.NO_OPERATION;
    private static final long serialVersionUID = -3555140079365778548L;

    private TcpNoOperationOption() {
    }

    public static TcpNoOperationOption getInstance() {
        return INSTANCE;
    }

    public static TcpNoOperationOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
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
        return new byte[]{1};
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public int length() {
        return 1;
    }

    public String toString() {
        return "[Kind: " + kind + "]";
    }
}
