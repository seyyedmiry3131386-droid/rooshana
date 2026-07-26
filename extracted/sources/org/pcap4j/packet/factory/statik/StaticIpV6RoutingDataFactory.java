package org.pcap4j.packet.factory.statik;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.IllegalIpV6RoutingData;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.IpV6ExtRoutingPacket;
import org.pcap4j.packet.IpV6RoutingSourceRouteData;
import org.pcap4j.packet.UnknownIpV6RoutingData;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.IpV6RoutingType;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticIpV6RoutingDataFactory implements PacketFactory<IpV6ExtRoutingPacket.IpV6RoutingData, IpV6RoutingType> {
    private static final StaticIpV6RoutingDataFactory INSTANCE = new StaticIpV6RoutingDataFactory();
    private final Map<IpV6RoutingType, Instantiater> instantiaters;

    public interface Instantiater {
        Class<? extends IpV6ExtRoutingPacket.IpV6RoutingData> getTargetClass();

        IpV6ExtRoutingPacket.IpV6RoutingData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException;
    }

    private StaticIpV6RoutingDataFactory() {
        HashMap map = new HashMap();
        this.instantiaters = map;
        map.put(IpV6RoutingType.SOURCE_ROUTE, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpV6RoutingDataFactory.1
            @Override // org.pcap4j.packet.factory.statik.StaticIpV6RoutingDataFactory.Instantiater
            public Class<IpV6RoutingSourceRouteData> getTargetClass() {
                return IpV6RoutingSourceRouteData.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV6RoutingDataFactory.Instantiater
            public IpV6ExtRoutingPacket.IpV6RoutingData newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV6RoutingSourceRouteData.newInstance(bArr, i, i2);
            }
        });
    }

    public static StaticIpV6RoutingDataFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends IpV6ExtRoutingPacket.IpV6RoutingData> getTargetClass(IpV6RoutingType ipV6RoutingType) {
        if (ipV6RoutingType == null) {
            throw new NullPointerException("number must not be null.");
        }
        Instantiater instantiater = this.instantiaters.get(ipV6RoutingType);
        return instantiater != null ? instantiater.getTargetClass() : getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public IpV6ExtRoutingPacket.IpV6RoutingData newInstance(byte[] bArr, int i, int i2, IpV6RoutingType ipV6RoutingType) {
        if (bArr != null && ipV6RoutingType != null) {
            try {
                Instantiater instantiater = this.instantiaters.get(ipV6RoutingType);
                if (instantiater != null) {
                    return instantiater.newInstance(bArr, i, i2);
                }
                return newInstance(bArr, i, i2);
            } catch (IllegalRawDataException unused) {
                return IllegalIpV6RoutingData.newInstance(bArr, i, i2);
            }
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("rawData: ");
        sb.append(bArr);
        sb.append(" number: ");
        sb.append(ipV6RoutingType);
        throw new NullPointerException(sb.toString());
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends IpV6ExtRoutingPacket.IpV6RoutingData> getTargetClass() {
        return UnknownIpV6RoutingData.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public IpV6ExtRoutingPacket.IpV6RoutingData newInstance(byte[] bArr, int i, int i2) {
        try {
            return UnknownIpV6RoutingData.newInstance(bArr, i, i2);
        } catch (IllegalRawDataException unused) {
            return IllegalIpV6RoutingData.newInstance(bArr, i, i2);
        }
    }
}
