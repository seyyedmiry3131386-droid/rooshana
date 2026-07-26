package org.pcap4j.packet.factory.statik;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.IllegalTcpOption;
import org.pcap4j.packet.TcpEndOfOptionList;
import org.pcap4j.packet.TcpMaximumSegmentSizeOption;
import org.pcap4j.packet.TcpNoOperationOption;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.TcpSackOption;
import org.pcap4j.packet.TcpSackPermittedOption;
import org.pcap4j.packet.TcpTimestampsOption;
import org.pcap4j.packet.TcpWindowScaleOption;
import org.pcap4j.packet.UnknownTcpOption;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.TcpOptionKind;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticTcpOptionFactory implements PacketFactory<TcpPacket.TcpOption, TcpOptionKind> {
    private static final StaticTcpOptionFactory INSTANCE = new StaticTcpOptionFactory();
    private final Map<TcpOptionKind, Instantiater> instantiaters;

    public interface Instantiater {
        Class<? extends TcpPacket.TcpOption> getTargetClass();

        TcpPacket.TcpOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException;
    }

    private StaticTcpOptionFactory() {
        HashMap map = new HashMap();
        this.instantiaters = map;
        map.put(TcpOptionKind.END_OF_OPTION_LIST, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.1
            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public Class<TcpEndOfOptionList> getTargetClass() {
                return TcpEndOfOptionList.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public TcpPacket.TcpOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return TcpEndOfOptionList.newInstance(bArr, i, i2);
            }
        });
        map.put(TcpOptionKind.NO_OPERATION, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.2
            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public Class<TcpNoOperationOption> getTargetClass() {
                return TcpNoOperationOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public TcpPacket.TcpOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return TcpNoOperationOption.newInstance(bArr, i, i2);
            }
        });
        map.put(TcpOptionKind.MAXIMUM_SEGMENT_SIZE, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.3
            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public Class<TcpMaximumSegmentSizeOption> getTargetClass() {
                return TcpMaximumSegmentSizeOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public TcpPacket.TcpOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return TcpMaximumSegmentSizeOption.newInstance(bArr, i, i2);
            }
        });
        map.put(TcpOptionKind.WINDOW_SCALE, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.4
            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public Class<TcpWindowScaleOption> getTargetClass() {
                return TcpWindowScaleOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public TcpPacket.TcpOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return TcpWindowScaleOption.newInstance(bArr, i, i2);
            }
        });
        map.put(TcpOptionKind.SACK_PERMITTED, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.5
            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public Class<TcpSackPermittedOption> getTargetClass() {
                return TcpSackPermittedOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public TcpPacket.TcpOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return TcpSackPermittedOption.newInstance(bArr, i, i2);
            }
        });
        map.put(TcpOptionKind.SACK, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.6
            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public Class<TcpSackOption> getTargetClass() {
                return TcpSackOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public TcpPacket.TcpOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return TcpSackOption.newInstance(bArr, i, i2);
            }
        });
        map.put(TcpOptionKind.TIMESTAMPS, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.7
            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public Class<TcpTimestampsOption> getTargetClass() {
                return TcpTimestampsOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public TcpPacket.TcpOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return TcpTimestampsOption.newInstance(bArr, i, i2);
            }
        });
    }

    public static StaticTcpOptionFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends TcpPacket.TcpOption> getTargetClass(TcpOptionKind tcpOptionKind) {
        if (tcpOptionKind == null) {
            throw new NullPointerException("number must not be null.");
        }
        Instantiater instantiater = this.instantiaters.get(tcpOptionKind);
        return instantiater != null ? instantiater.getTargetClass() : getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public TcpPacket.TcpOption newInstance(byte[] bArr, int i, int i2, TcpOptionKind tcpOptionKind) {
        if (bArr != null && tcpOptionKind != null) {
            try {
                Instantiater instantiater = this.instantiaters.get(tcpOptionKind);
                if (instantiater != null) {
                    return instantiater.newInstance(bArr, i, i2);
                }
                return newInstance(bArr, i, i2);
            } catch (IllegalRawDataException unused) {
                return IllegalTcpOption.newInstance(bArr, i, i2);
            }
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("rawData: ");
        sb.append(bArr);
        sb.append(" number: ");
        sb.append(tcpOptionKind);
        throw new NullPointerException(sb.toString());
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends TcpPacket.TcpOption> getTargetClass() {
        return UnknownTcpOption.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public TcpPacket.TcpOption newInstance(byte[] bArr, int i, int i2) {
        try {
            return UnknownTcpOption.newInstance(bArr, i, i2);
        } catch (IllegalRawDataException unused) {
            return IllegalTcpOption.newInstance(bArr, i, i2);
        }
    }
}
