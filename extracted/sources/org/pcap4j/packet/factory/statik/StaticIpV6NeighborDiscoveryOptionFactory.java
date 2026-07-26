package org.pcap4j.packet.factory.statik;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.IllegalIpV6NeighborDiscoveryOption;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.IpV6NeighborDiscoveryMtuOption;
import org.pcap4j.packet.IpV6NeighborDiscoveryPrefixInformationOption;
import org.pcap4j.packet.IpV6NeighborDiscoveryRedirectedHeaderOption;
import org.pcap4j.packet.IpV6NeighborDiscoverySourceLinkLayerAddressOption;
import org.pcap4j.packet.IpV6NeighborDiscoveryTargetLinkLayerAddressOption;
import org.pcap4j.packet.UnknownIpV6NeighborDiscoveryOption;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.IpV6NeighborDiscoveryOptionType;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticIpV6NeighborDiscoveryOptionFactory implements PacketFactory<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption, IpV6NeighborDiscoveryOptionType> {
    private static final StaticIpV6NeighborDiscoveryOptionFactory INSTANCE = new StaticIpV6NeighborDiscoveryOptionFactory();
    private final Map<IpV6NeighborDiscoveryOptionType, Instantiater> instantiaters;

    public interface Instantiater {
        Class<? extends IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> getTargetClass();

        IcmpV6CommonPacket.IpV6NeighborDiscoveryOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException;
    }

    private StaticIpV6NeighborDiscoveryOptionFactory() {
        HashMap map = new HashMap();
        this.instantiaters = map;
        map.put(IpV6NeighborDiscoveryOptionType.SOURCE_LINK_LAYER_ADDRESS, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpV6NeighborDiscoveryOptionFactory.1
            @Override // org.pcap4j.packet.factory.statik.StaticIpV6NeighborDiscoveryOptionFactory.Instantiater
            public Class<IpV6NeighborDiscoverySourceLinkLayerAddressOption> getTargetClass() {
                return IpV6NeighborDiscoverySourceLinkLayerAddressOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV6NeighborDiscoveryOptionFactory.Instantiater
            public IcmpV6CommonPacket.IpV6NeighborDiscoveryOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV6NeighborDiscoverySourceLinkLayerAddressOption.newInstance(bArr, i, i2);
            }
        });
        map.put(IpV6NeighborDiscoveryOptionType.TARGET_LINK_LAYER_ADDRESS, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpV6NeighborDiscoveryOptionFactory.2
            @Override // org.pcap4j.packet.factory.statik.StaticIpV6NeighborDiscoveryOptionFactory.Instantiater
            public Class<IpV6NeighborDiscoveryTargetLinkLayerAddressOption> getTargetClass() {
                return IpV6NeighborDiscoveryTargetLinkLayerAddressOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV6NeighborDiscoveryOptionFactory.Instantiater
            public IcmpV6CommonPacket.IpV6NeighborDiscoveryOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV6NeighborDiscoveryTargetLinkLayerAddressOption.newInstance(bArr, i, i2);
            }
        });
        map.put(IpV6NeighborDiscoveryOptionType.PREFIX_INFORMATION, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpV6NeighborDiscoveryOptionFactory.3
            @Override // org.pcap4j.packet.factory.statik.StaticIpV6NeighborDiscoveryOptionFactory.Instantiater
            public Class<IpV6NeighborDiscoveryPrefixInformationOption> getTargetClass() {
                return IpV6NeighborDiscoveryPrefixInformationOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV6NeighborDiscoveryOptionFactory.Instantiater
            public IcmpV6CommonPacket.IpV6NeighborDiscoveryOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV6NeighborDiscoveryPrefixInformationOption.newInstance(bArr, i, i2);
            }
        });
        map.put(IpV6NeighborDiscoveryOptionType.REDIRECTED_HEADER, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpV6NeighborDiscoveryOptionFactory.4
            @Override // org.pcap4j.packet.factory.statik.StaticIpV6NeighborDiscoveryOptionFactory.Instantiater
            public Class<IpV6NeighborDiscoveryRedirectedHeaderOption> getTargetClass() {
                return IpV6NeighborDiscoveryRedirectedHeaderOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV6NeighborDiscoveryOptionFactory.Instantiater
            public IcmpV6CommonPacket.IpV6NeighborDiscoveryOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV6NeighborDiscoveryRedirectedHeaderOption.newInstance(bArr, i, i2);
            }
        });
        map.put(IpV6NeighborDiscoveryOptionType.MTU, new Instantiater() { // from class: org.pcap4j.packet.factory.statik.StaticIpV6NeighborDiscoveryOptionFactory.5
            @Override // org.pcap4j.packet.factory.statik.StaticIpV6NeighborDiscoveryOptionFactory.Instantiater
            public Class<IpV6NeighborDiscoveryMtuOption> getTargetClass() {
                return IpV6NeighborDiscoveryMtuOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV6NeighborDiscoveryOptionFactory.Instantiater
            public IcmpV6CommonPacket.IpV6NeighborDiscoveryOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
                return IpV6NeighborDiscoveryMtuOption.newInstance(bArr, i, i2);
            }
        });
    }

    public static StaticIpV6NeighborDiscoveryOptionFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> getTargetClass(IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType) {
        if (ipV6NeighborDiscoveryOptionType == null) {
            throw new NullPointerException("number must not be null.");
        }
        Instantiater instantiater = this.instantiaters.get(ipV6NeighborDiscoveryOptionType);
        return instantiater != null ? instantiater.getTargetClass() : getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public IcmpV6CommonPacket.IpV6NeighborDiscoveryOption newInstance(byte[] bArr, int i, int i2, IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType) {
        if (bArr != null && ipV6NeighborDiscoveryOptionType != null) {
            try {
                Instantiater instantiater = this.instantiaters.get(ipV6NeighborDiscoveryOptionType);
                if (instantiater != null) {
                    return instantiater.newInstance(bArr, i, i2);
                }
                return newInstance(bArr, i, i2);
            } catch (IllegalRawDataException unused) {
                return IllegalIpV6NeighborDiscoveryOption.newInstance(bArr, i, i2);
            }
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("rawData: ");
        sb.append(bArr);
        sb.append(" number: ");
        sb.append(ipV6NeighborDiscoveryOptionType);
        throw new NullPointerException(sb.toString());
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> getTargetClass() {
        return UnknownIpV6NeighborDiscoveryOption.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public IcmpV6CommonPacket.IpV6NeighborDiscoveryOption newInstance(byte[] bArr, int i, int i2) {
        try {
            return UnknownIpV6NeighborDiscoveryOption.newInstance(bArr, i, i2);
        } catch (IllegalRawDataException unused) {
            return IllegalIpV6NeighborDiscoveryOption.newInstance(bArr, i, i2);
        }
    }
}
