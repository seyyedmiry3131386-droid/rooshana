package org.pcap4j.packet.factory.statik;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.IllegalSctpChunk;
import org.pcap4j.packet.SctpPacket;
import org.pcap4j.packet.UnknownSctpChunk;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.SctpChunkType;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticSctpChunkFactory implements PacketFactory<SctpPacket.SctpChunk, SctpChunkType> {
    private static final StaticSctpChunkFactory INSTANCE = new StaticSctpChunkFactory();
    private final Map<SctpChunkType, Instantiater> instantiaters = new HashMap();

    public interface Instantiater {
        Class<? extends SctpPacket.SctpChunk> getTargetClass();

        SctpPacket.SctpChunk newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException;
    }

    private StaticSctpChunkFactory() {
    }

    public static StaticSctpChunkFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends SctpPacket.SctpChunk> getTargetClass(SctpChunkType sctpChunkType) {
        if (sctpChunkType == null) {
            throw new NullPointerException("number must not be null.");
        }
        Instantiater instantiater = this.instantiaters.get(sctpChunkType);
        return instantiater != null ? instantiater.getTargetClass() : getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public SctpPacket.SctpChunk newInstance(byte[] bArr, int i, int i2, SctpChunkType sctpChunkType) {
        if (bArr != null && sctpChunkType != null) {
            try {
                Instantiater instantiater = this.instantiaters.get(sctpChunkType);
                if (instantiater != null) {
                    return instantiater.newInstance(bArr, i, i2);
                }
                return newInstance(bArr, i, i2);
            } catch (IllegalRawDataException unused) {
                return IllegalSctpChunk.newInstance(bArr, i, i2);
            }
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("rawData: ");
        sb.append(bArr);
        sb.append(" number: ");
        sb.append(sctpChunkType);
        throw new NullPointerException(sb.toString());
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends SctpPacket.SctpChunk> getTargetClass() {
        return UnknownSctpChunk.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public SctpPacket.SctpChunk newInstance(byte[] bArr, int i, int i2) {
        try {
            return UnknownSctpChunk.newInstance(bArr, i, i2);
        } catch (IllegalRawDataException unused) {
            return IllegalSctpChunk.newInstance(bArr, i, i2);
        }
    }
}
